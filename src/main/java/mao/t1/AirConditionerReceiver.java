package mao.t1;

import java.awt.*;

/**
 * Project name(项目名称)：java设计模式_命令模式
 * Package(包名): mao.t1
 * Class(类名): AirConditionerReceiver
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/8/18
 * Time(创建时间)： 21:59
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class AirConditionerReceiver
{
    public void on()
    {
        Toolkit.getDefaultToolkit().beep();
        System.out.println("空调打开");
    }

    public void off()
    {
        Toolkit.getDefaultToolkit().beep();
        System.out.println("空调关闭");
    }
}
