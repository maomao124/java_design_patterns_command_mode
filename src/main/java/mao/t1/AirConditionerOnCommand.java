package mao.t1;

/**
 * Project name(项目名称)：java设计模式_命令模式
 * Package(包名): mao.t1
 * Class(类名): AirConditionerOnCommand
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/8/18
 * Time(创建时间)： 21:59
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class AirConditionerOnCommand implements Command
{
    private final AirConditionerReceiver airConditionerReceiver;

    /**
     * Instantiates a new Air conditioner on command.
     */
    public AirConditionerOnCommand()
    {
        this.airConditionerReceiver = new AirConditionerReceiver();
    }

    /**
     * Instantiates a new Air conditioner on command.
     *
     * @param airConditionerReceiver the air conditioner receiver
     */
    public AirConditionerOnCommand(AirConditionerReceiver airConditionerReceiver)
    {
        this.airConditionerReceiver = airConditionerReceiver;
    }

    @Override
    public void execute()
    {
        airConditionerReceiver.on();
    }

    @Override
    public void undo()
    {
        airConditionerReceiver.off();
    }
}
