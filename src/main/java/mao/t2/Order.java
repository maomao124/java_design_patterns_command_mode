package mao.t2;

import java.util.HashMap;
import java.util.Map;

/**
 * Project name(项目名称)：java设计模式_命令模式
 * Package(包名): mao.t2
 * Class(类名): Order
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/8/19
 * Time(创建时间)： 13:52
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class Order
{
    // 餐桌号码
    private int diningTable;

    // 用来存储餐名并记录份数
    private Map<String, Integer> foodDic = new HashMap<>();

    public int getDiningTable()
    {
        return diningTable;
    }

    public void setDiningTable(int diningTable)
    {
        this.diningTable = diningTable;
    }

    public Map<String, Integer> getFoodDic()
    {
        return foodDic;
    }

    public void setFoodDic(Map<String, Integer> foodDic)
    {
        this.foodDic = foodDic;
    }

    public void addFoodDic(String name, int num)
    {
        foodDic.put(name, num);
    }
}
