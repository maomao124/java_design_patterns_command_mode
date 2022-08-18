package mao.t1;

/**
 * Project name(项目名称)：java设计模式_命令模式
 * Package(包名): mao.t1
 * Class(类名): Test
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/8/18
 * Time(创建时间)： 22:05
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class Test
{
    private static void sleep()
    {
        try
        {
            Thread.sleep(1000);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }

    public static void main(String[] args)
    {
        RemoteController remoteController = new RemoteController(3);
        System.out.println(remoteController.getCommandsTotal());
        remoteController.setCommand(0, new LightOnCommand(), new LightOffCommand());
        remoteController.setCommand(1, new TVOnCommand(), new TVOffCommand());
        remoteController.setCommand(2, new AirConditionerOnCommand(), new AirConditionerOffCommand());

        System.out.println("开始发送命令");

        remoteController.onButtonWasPushed(0);
        sleep();
        remoteController.offButtonWasPushed(0);
        sleep();
        remoteController.onButtonWasPushed(1);
        sleep();
        remoteController.offButtonWasPushed(1);
        sleep();
        remoteController.onButtonWasPushed(2);
        sleep();
        remoteController.offButtonWasPushed(2);
        sleep();
        System.out.println("执行撤销操作");
        remoteController.undoButtonWasPushed();
    }
}
