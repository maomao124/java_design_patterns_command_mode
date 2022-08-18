package mao.t1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Project name(项目名称)：java设计模式_命令模式
 * Package(包名): mao.t1
 * Class(类名): SwingRemoteController
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/8/18
 * Time(创建时间)： 22:16
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class SwingRemoteController
{
    private JButton LightOnButton;
    private JButton LightOffButton;

    private JButton TVOnButton;
    private JButton TVOffButton;

    private JButton AirConditionerOnButton;
    private JButton AirConditionerOffButton;

    private JButton UndoButton;

    //遥控器对象
    private RemoteController remoteController;


    public SwingRemoteController()
    {
        //初始化顶层面板
        JFrame jFrame = new JFrame("遥控器");
        jFrame.setSize(540, 720);
        //获取屏幕宽度
        int screenWidth = Toolkit.getDefaultToolkit().getScreenSize().width;
        //获取屏幕高度
        int screenHeight = Toolkit.getDefaultToolkit().getScreenSize().height;
        //位于屏幕中央
        jFrame.setLocation(screenWidth / 2 - jFrame.getWidth() / 2, screenHeight / 2 - jFrame.getHeight() / 2);
        jFrame.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);

        //注册虚拟机关闭挂钩
        addShutdownHook();

        //初始化按钮
        initButton();

        //个性化
        setPersonalise();

        initRemoteController();

        //设置布局
        setLayout(jFrame);


        //设置关闭的监听器
        setCloseListener(jFrame);

        jFrame.setVisible(true);

    }

    /**
     * 初始化遥控器对象
     */
    private void initRemoteController()
    {
        remoteController = new RemoteController(3);
        System.out.println(remoteController.getCommandsTotal());
        remoteController.setCommand(0, new LightOnCommand(), new LightOffCommand());
        remoteController.setCommand(1, new TVOnCommand(), new TVOffCommand());
        remoteController.setCommand(2, new AirConditionerOnCommand(), new AirConditionerOffCommand());
    }

    /**
     * 设个性化
     */
    private void setPersonalise()
    {
        Font font = new Font("宋体", Font.BOLD, 32);
        //字体设置
        UndoButton.setFont(font);
        LightOnButton.setFont(font);
        LightOffButton.setFont(font);
        TVOnButton.setFont(font);
        TVOffButton.setFont(font);
        AirConditionerOnButton.setFont(font);
        AirConditionerOffButton.setFont(font);

        //颜色设置
        UndoButton.setForeground(Color.red);
        LightOnButton.setForeground(Color.green);
        LightOffButton.setForeground(new Color(50, 200, 0));
        TVOnButton.setForeground(Color.green);
        TVOffButton.setForeground(new Color(50, 200, 0));
        AirConditionerOnButton.setForeground(Color.green);
        AirConditionerOffButton.setForeground(new Color(50, 200, 0));

        //设置背景
        UndoButton.setBackground(new Color(20, 40, 100));
        LightOnButton.setBackground(new Color(20, 50, 130));
        LightOffButton.setBackground(new Color(20, 50, 130));
        TVOnButton.setBackground(new Color(20, 50, 130));
        TVOffButton.setBackground(new Color(20, 50, 130));
        AirConditionerOnButton.setBackground(new Color(20, 50, 130));
        AirConditionerOffButton.setBackground(new Color(20, 50, 130));
    }

    /**
     * 设置布局
     *
     * @param jFrame JFrame
     */
    private void setLayout(JFrame jFrame)
    {
        JPanel jPanel = new JPanel();
        jPanel.setLayout(new GridLayout(4, 1));
        jPanel.add(UndoButton);
        {
            JPanel jPanel1 = new JPanel();
            jPanel1.setLayout(new GridLayout(1, 2));
            jPanel1.add(LightOnButton);
            jPanel1.add(LightOffButton);
            jPanel.add(jPanel1);
        }

        {
            JPanel jPanel1 = new JPanel();
            jPanel1.setLayout(new GridLayout(1, 2));
            jPanel1.add(TVOnButton);
            jPanel1.add(TVOffButton);
            jPanel.add(jPanel1);
        }

        {
            JPanel jPanel1 = new JPanel();
            jPanel1.setLayout(new GridLayout(1, 2));
            jPanel1.add(AirConditionerOnButton);
            jPanel1.add(AirConditionerOffButton);
            jPanel.add(jPanel1);
        }

        jFrame.add(jPanel);
    }

    /**
     * 初始化按钮
     */
    private void initButton()
    {
        LightOnButton = new JButton("打开电灯");
        LightOffButton = new JButton("关闭电灯");
        TVOnButton = new JButton("打开电视机");
        TVOffButton = new JButton("关闭电视机");
        AirConditionerOnButton = new JButton("打开空调");
        AirConditionerOffButton = new JButton("关闭空调");
        UndoButton = new JButton("撤销操作");
    }

    /**
     * 设置关闭的监听器
     *
     * @param jFrame JFrame
     */
    private void setCloseListener(JFrame jFrame)
    {
        jFrame.addWindowListener(new WindowAdapter()
        {
            @Override
            public void windowClosing(WindowEvent e)
            {
                Toolkit.getDefaultToolkit().beep();
                int result = JOptionPane.showConfirmDialog(null, "是否退出？", "退出提示", JOptionPane.OK_CANCEL_OPTION);
                if (result == 0)
                {
                    System.exit(0);
                }
            }
        });
    }

    /**
     * 注册虚拟机关闭挂钩
     */
    private void addShutdownHook()
    {
        Runtime runtime = Runtime.getRuntime();
        runtime.addShutdownHook(new Thread(new Runnable()
        {
            @Override
            public void run()
            {
                System.out.println("程序退出");
            }
        }));
    }


    public static void main(String[] args)
    {
        new SwingRemoteController();
    }
}
