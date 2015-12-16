package netty;

import com.caucho.hessian.io.HessianOutput;
import org.jboss.netty.bootstrap.ClientBootstrap;
import org.jboss.netty.buffer.ChannelBuffer;
import org.jboss.netty.buffer.ChannelBuffers;
import org.jboss.netty.channel.*;
import org.jboss.netty.channel.socket.nio.NioClientSocketChannelFactory;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.util.concurrent.Executors;

public class Client {
    public static void main(String args[]) {
        // Client服务启动器
        ClientBootstrap bootstrap = new ClientBootstrap(
                new NioClientSocketChannelFactory(
                        Executors.newCachedThreadPool(),
                        Executors.newCachedThreadPool()));
        // 设置一个处理服务端消息和各种消息事件的类(Handler)
        bootstrap.setPipelineFactory(new ChannelPipelineFactory() {
            @Override
            public ChannelPipeline getPipeline() throws Exception {
                return Channels.pipeline(new HelloClientHandler());
            }
        });
        // 连接到本地的8000端口的服务端
        bootstrap.connect(new InetSocketAddress("127.0.0.1", 8000));
    }

    private static class HelloClientHandler extends SimpleChannelHandler {

        @Override
        public void channelConnected(ChannelHandlerContext ctx, ChannelStateEvent e) {
            sendData(ctx);
            System.out.println("[client]:connected");
        }

        private void sendData(ChannelHandlerContext ctx){
            Channel channel = ctx.getChannel();
            ChannelBuffer buffer = ChannelBuffers.dynamicBuffer();
            buffer.writeBytes(buildData());
            channel.write(buffer);
        }

        private byte[] buildData(){
            Request request = new Request();
            request.setData("I am a request");
            request.setVersion(1);
            ByteArrayOutputStream stream = new ByteArrayOutputStream();
            HessianOutput output = new HessianOutput(stream);
            try {
                output.writeObject(request);
                return stream.toByteArray();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return null;
        }

    }
}
