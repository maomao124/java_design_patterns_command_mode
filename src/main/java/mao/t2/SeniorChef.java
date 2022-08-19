package mao.t2;

/**
 * Project name(项目名称)：java设计模式_命令模式
 * Package(包名): mao.t2
 * Class(类名): SeniorChef
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/8/19
 * Time(创建时间)： 13:55
 * Version(版本): 1.0
 * Description(描述)： 命令的Receiver
 */

public class SeniorChef
{
    /**
     * Make food.
     *
     * @param num      the num
     * @param foodName the food name
     */
    public void makeFood(int num, String foodName)
    {
        System.out.println(num + "份" + foodName);
        try
        {
            Thread.sleep(500);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }
}
