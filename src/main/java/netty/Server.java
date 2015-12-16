package netty;

import com.caucho.hessian.io.HessianInput;
import org.jboss.netty.bootstrap.ServerBootstrap;
import org.jboss.netty.buffer.ChannelBuffer;
import org.jboss.netty.channel.socket.nio.NioServerSocketChannelFactory;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.util.concurrent.Executors;

public class Server {
    public static void main(String args[]) {
        // Server服务启动器
        ServerBootstrap bootstrap = new ServerBootstrap(
                new NioServerSocketChannelFactory(
                        Executors.newCachedThreadPool(),
                        Executors.newCachedThreadPool()));
        bootstrap.setPipelineFactory(new ChannelPipelineFactory() {
            @Override
            public ChannelPipeline getPipeline()
                    throws Exception {
                return Channels.pipeline(new HelloServerHandler());
            }
        });
        // 开放8000端口供客户端访问。
        bootstrap.bind(new InetSocketAddress(8000));
        System.out.println("[server]:ready");
    }

    private static class HelloServerHandler extends
            SimpleChannelHandler {

        @Override
        public void channelConnected(ChannelHandlerContext ctx, ChannelStateEvent e) {
            System.out.println("[server]:connected.I will be working");
        }

        @Override
        public void messageReceived(ChannelHandlerContext ctx, MessageEvent e) throws Exception {
            ChannelBuffer buffer = (ChannelBuffer) e.getMessage();

            System.out.println("[server]:receive data - " + genRequest(buffer.array()));
        }

        private Request genRequest(byte[] bytes) {
            ByteArrayInputStream stream = new ByteArrayInputStream(bytes);
            HessianInput input = new HessianInput(stream);
            try {
                return (Request) input.readObject();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return null;
        }

    }
}
