package mao.t1;

/**
 * Project name(项目名称)：java设计模式_命令模式
 * Package(包名): mao.t1
 * Class(类名): AirConditionerOffCommand
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/8/18
 * Time(创建时间)： 22:01
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class AirConditionerOffCommand implements Command
{
    private final AirConditionerReceiver airConditionerReceiver;

    /**
     * Instantiates a new Air conditioner off command.
     */
    public AirConditionerOffCommand()
    {
        this.airConditionerReceiver = new AirConditionerReceiver();
    }

    /**
     * Instantiates a new Air conditioner off command.
     *
     * @param airConditionerReceiver the air conditioner receiver
     */
    public AirConditionerOffCommand(AirConditionerReceiver airConditionerReceiver)
    {
        this.airConditionerReceiver = airConditionerReceiver;
    }

    @Override
    public void execute()
    {
        airConditionerReceiver.off();
    }

    @Override
    public void undo()
    {
        airConditionerReceiver.on();
    }
}
