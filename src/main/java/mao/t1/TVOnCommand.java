package mao.t1;

/**
 * Project name(项目名称)：java设计模式_命令模式
 * Package(包名): mao.t1
 * Class(类名): TVOnCommand
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/8/18
 * Time(创建时间)： 21:52
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class TVOnCommand implements Command
{
    private final TVReceiver tvReceiver;

    /**
     * Instantiates a new Tv on command.
     */
    public TVOnCommand()
    {
        tvReceiver = new TVReceiver();
    }

    /**
     * Instantiates a new Tv on command.
     *
     * @param tvReceiver the tv receiver
     */
    public TVOnCommand(TVReceiver tvReceiver)
    {
        this.tvReceiver = tvReceiver;
    }

    @Override
    public void execute()
    {
        tvReceiver.on();
    }

    @Override
    public void undo()
    {
        tvReceiver.off();
    }
}
