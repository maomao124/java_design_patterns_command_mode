package mao.t2;

/**
 * Project name(项目名称)：java设计模式_命令模式
 * Package(包名): mao.t2
 * Class(类名): Test
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/8/19
 * Time(创建时间)： 14:05
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class Test
{
    public static void main(String[] args)
    {
        Order order1 = new Order();
        order1.setDiningTable(1);
        order1.getFoodDic().put("西红柿鸡蛋面", 1);
        order1.getFoodDic().put("小杯可乐", 2);

        Order order2 = new Order();
        order2.setDiningTable(3);
        order2.getFoodDic().put("尖椒肉丝盖饭", 1);
        order2.addFoodDic("小杯雪碧", 1);

        OrderCommand orderCommand1 = new OrderCommand(order1);
        OrderCommand orderCommand2 = new OrderCommand(order2);

        Waitor waitor = new Waitor();
        waitor.setCommand(orderCommand1);
        waitor.setCommand(orderCommand2);
        waitor.orderUp();
        waitor.orderUp();

        Order order3 = new Order();
        order3.setDiningTable(4);
        order3.addFoodDic("马铃薯炒土豆", 2);
        OrderCommand orderCommand3 = new OrderCommand(order3);

        waitor.setCommand(orderCommand3);

        waitor.orderUp();
    }
}
