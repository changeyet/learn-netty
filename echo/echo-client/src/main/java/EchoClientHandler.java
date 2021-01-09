import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.util.CharsetUtil;

/**
 * @Description
 * @Author Qwx
 * @Date 2021/1/8 18:29
 * Version 1.3
 */
@ChannelHandler.Sharable
public class EchoClientHandler extends SimpleChannelInboundHandler<ByteBuf>
{

    /**
     * 在到服务器的连接已经建立之后将被调用
     * @param ctx
     */
    @Override
    public void channelActive(ChannelHandlerContext ctx)
    {
        ctx.writeAndFlush(Unpooled.copiedBuffer("Netty rocks!", CharsetUtil.UTF_8));
    }

    /**
     * 当从服务器接收到一条消息时被调用
     * @param ctx
     * @param in
     */
    @Override
    public void channelRead0(ChannelHandlerContext ctx, ByteBuf in)
    {
        System.out.println("Client received: " + in.toString(CharsetUtil.UTF_8));
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause)
    {
        cause.printStackTrace();
        ctx.close();
    }


}
