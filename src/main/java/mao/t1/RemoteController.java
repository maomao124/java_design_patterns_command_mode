package mao.t1;

/**
 * Project name(项目名称)：java设计模式_命令模式
 * Package(包名): mao.t1
 * Class(类名): RemoteController
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/8/18
 * Time(创建时间)： 21:37
 * Version(版本): 1.0
 * Description(描述)： 遥控器
 */

public class RemoteController
{
    private final Command[] onCommands;
    private final Command[] offCommands;

    //撤销命令
    private Command undoCommand;

    /**
     * 构造方法，初始化操作，默认的命令总数为5
     */
    public RemoteController()
    {
        onCommands = new Command[5];
        offCommands = new Command[5];

        //初始化命令
        for (int i = 0; i < 5; i++)
        {
            onCommands[i] = new NoCommand();
            offCommands[i] = new NoCommand();
        }
    }

    /**
     * 构造方法，初始化操作
     *
     * @param total 命令的总数
     */
    public RemoteController(int total)
    {
        onCommands = new Command[total];
        offCommands = new Command[total];

        //初始化命令
        for (int i = 0; i < total; i++)
        {
            onCommands[i] = new NoCommand();
            offCommands[i] = new NoCommand();
        }
    }

    /**
     * 获得命令的总数
     *
     * @return int型
     */
    public int getCommandsTotal()
    {
        return onCommands.length;
    }

    /**
     * 设置命令
     *
     * @param no         命令号
     * @param onCommand  打开的命令
     * @param offCommand 关闭的命令
     */
    public void setCommand(int no, Command onCommand, Command offCommand)
    {
        onCommands[no] = onCommand;
        offCommands[no] = offCommand;
    }

    /**
     * 按下按钮，执行打开操作
     *
     * @param no 要执行打开操作的命令号
     */
    public void onButtonWasPushed(int no)
    {
        onCommands[no].execute();
        //记录这次的操作，用于撤销
        undoCommand = onCommands[no];
    }

    /**
     * 按下按钮，执行关闭操作
     *
     * @param no 要执行打开操作的命令号
     */
    public void offButtonWasPushed(int no)
    {
        offCommands[no].execute();
        //记录这次的操作，用于撤销
        undoCommand = offCommands[no];
    }

    /**
     * 按下撤销按钮
     */
    public void undoButtonWasPushed()
    {
        undoCommand.undo();
    }
}
