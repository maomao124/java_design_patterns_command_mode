package mao.t1;

/**
 * Project name(项目名称)：java设计模式_命令模式
 * Package(包名): mao.t1
 * Class(类名): TVOffCommand
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/8/18
 * Time(创建时间)： 21:53
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class TVOffCommand implements Command
{
    private final TVReceiver tvReceiver;

    /**
     * Instantiates a new Tv off command.
     */
    public TVOffCommand()
    {
        this.tvReceiver = new TVReceiver();
    }

    /**
     * Instantiates a new Tv off command.
     *
     * @param tvReceiver the tv receiver
     */
    public TVOffCommand(TVReceiver tvReceiver)
    {
        this.tvReceiver = tvReceiver;
    }

    @Override
    public void execute()
    {
        tvReceiver.off();
    }

    @Override
    public void undo()
    {
        tvReceiver.on();
    }
}
