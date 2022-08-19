package mao.t2;

import java.util.Set;

/**
 * Project name(项目名称)：java设计模式_命令模式
 * Package(包名): mao.t2
 * Class(类名): OrderCommand
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/8/19
 * Time(创建时间)： 13:52
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class OrderCommand implements Command
{
    private final SeniorChef receiver;
    private final Order order;

    public OrderCommand(SeniorChef receiver, Order order)
    {
        this.receiver = receiver;
        this.order = order;
    }

    public OrderCommand(Order order)
    {
        this.receiver = new SeniorChef();
        this.order = order;

    }

    @Override
    public void execute()
    {
        System.out.println(order.getDiningTable() + "桌的订单：");
        Set<String> keys = order.getFoodDic().keySet();
        for (String key : keys)
        {
            System.out.print("-->");
            receiver.makeFood(order.getFoodDic().get(key), key);
        }
        System.out.println(order.getDiningTable() + "桌的饭制作完毕");
    }


}
