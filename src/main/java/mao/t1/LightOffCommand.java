package mao.t1;

/**
 * Project name(项目名称)：java设计模式_命令模式
 * Package(包名): mao.t1
 * Class(类名): LightOffCommand
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/8/18
 * Time(创建时间)： 21:33
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class LightOffCommand implements Command
{
    private final LightReceiver light;

    /**
     * Instantiates a new Light off command.
     */
    public LightOffCommand()
    {
        light = new LightReceiver();
    }

    /**
     * Instantiates a new Light off command.
     *
     * @param light the light
     */
    public LightOffCommand(LightReceiver light)
    {
        this.light = light;
    }

    @Override
    public void execute()
    {
        light.off();
    }

    @Override
    public void undo()
    {
        light.on();
    }
}
