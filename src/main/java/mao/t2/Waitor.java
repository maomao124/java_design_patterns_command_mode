package mao.t2;

import java.util.ArrayList;
import java.util.List;

/**
 * Project name(项目名称)：java设计模式_命令模式
 * Package(包名): mao.t2
 * Class(类名): Waitor
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/8/19
 * Time(创建时间)： 13:59
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class Waitor
{
    private final List<Command> commands;

    /**
     * Instantiates a new Waitor.
     */
    public Waitor()
    {
        commands = new ArrayList<>();
    }

    /**
     * Sets command.
     *
     * @param cmd the cmd
     */
    public void setCommand(Command cmd)
    {
        commands.add(cmd);
    }

    /**
     * Order up.
     */
    public void orderUp()
    {
        for (Command command : commands)
        {
            if (command != null)
            {
                command.execute();
            }
        }
    }
}
