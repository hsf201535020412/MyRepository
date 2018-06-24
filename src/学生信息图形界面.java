

import java.awt.BorderLayout;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

//录入的信息包括学号、姓名、性别、出生日期、是否联合培养等
public class 学生信息图形界面 extends JFrame implements ActionListener {

 public 学生信息图形界面() { //构造方法
  //界面显示问题
  super("学生信息图形界面");
  setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
  setSize(320, 300);
  setVisible(true);
  Container content = getContentPane();

  JPanel jp1 = new JPanel(); //创建一个面板

  JLabel label = new JLabel("欢迎使用学生信息管理系统");      //欢迎界面的欢迎语句
  label.setFont(new Font("楷体_GB2312", Font.BOLD, 20));  //设置显示的字体

  jp1.add(label);            //将标签添加到面板jp1中

  JPanel jp2 = new JPanel();         //创建一个面板，用于摆放提示各种功能的标签
  
  JLabel label1 = new JLabel("请输入学生的详细资料：");   //输入提示输入的语言：
  label1.setFont(new Font("楷体_GB2312", Font.BOLD, 18));  //设置显示的字体
  
  JLabel label2 = new JLabel("学 生 学 号：");     //提示各种输入内容的标签
  label2.setFont(new Font("楷体_GB2312", Font.BOLD, 18));  //设置显示的字体t
  JTextField field1=new JTextField(10);       //10为学号长度，可自行设定
  
  JLabel label3 = new JLabel("学 生 姓 名：");     //提示输入学生姓名的标签
  label3.setFont(new Font("楷体_GB2312", Font.BOLD, 18));  //设置显示的字体
  JTextField field2=new JTextField(10);       //10为姓名长度，可自行设定
  
  JLabel label4 = new JLabel("学 生 性 别： ");     //提示输入学生性别的标签
  label4.setFont(new Font("楷体_GB2312", Font.BOLD, 18));  //设置显示的字体
  
  CheckboxGroup group1 = new CheckboxGroup();     //创建一个复选框用于选择某一功能
  
  Checkbox check11 = new Checkbox("男",true,group1);    //添加选项到复选框中
  check11.setFont(new Font("楷体_GB2312", Font.BOLD, 18)); //设置显示的字体
  check11.addItemListener(new CheckHandler1(1));    //给相应复选框添加事件监听器
  Checkbox check12 = new Checkbox("女",false,group1);  //添加选项到复选框中
  check12.setFont(new Font("楷体_GB2312", Font.BOLD, 18)); //设置显示的字体
  check12.addItemListener(new CheckHandler1(2));   //给相应复选框添加事件监听器
  
  JLabel label5 = new JLabel("出 生 日 期：");     //提示输入出生日期的标签
  label5.setFont(new Font("楷体_GB2312", Font.BOLD, 18));  //设置显示的字体
  JTextField field3=new JTextField("2000",3);      //3为姓名长度，可自行设定
  JLabel label51 = new JLabel("年");       
  label51.setFont(new Font("楷体_GB2312", Font.BOLD, 18)); //设置显示的字体
  JTextField field4=new JTextField("01",2);      //2为姓名长度，可自行设定
  JLabel label52 = new JLabel("月");
  label52.setFont(new Font("楷体_GB2312", Font.BOLD, 18)); //设置显示的字体
  JTextField field5=new JTextField("01",2);      //2为姓名长度，可自行设定
  JLabel label53 = new JLabel("日");  
  label53.setFont(new Font("楷体_GB2312", Font.BOLD, 18)); //设置显示的字体
  
  JLabel label6 = new JLabel("联合培养：");       //提示选择联合培养与否的标签
  label6.setFont(new Font("楷体_GB2312", Font.BOLD, 18));  //设置显示的字体
  CheckboxGroup group2 = new CheckboxGroup();     //创建一个复选框用于选择某一功能
  
  Checkbox check21 = new Checkbox("是",true,group2);    //添加选项到复选框中
  check21.setFont(new Font("楷体_GB2312", Font.BOLD, 18)); //设置显示的字体
  check21.addItemListener(new CheckHandler2(1));    //给相应复选框添加事件监听器
  Checkbox check22 = new Checkbox("否",false,group2);  //添加选项到复选框中
  check22.setFont(new Font("楷体_GB2312", Font.BOLD, 18)); //设置显示的字体
  check22.addItemListener(new CheckHandler2(2));   //给相应复选框添加事件监听器
  //添加组件到面板容器中
  jp2.add(label1);  
  jp2.add(label2);  
  jp2.add(field1);  
  jp2.add(label3);  
  jp2.add(field2);  
  jp2.add(label4); 
  jp2.add(check11);  jp2.add(check12);  
  jp2.add(label5);  
  jp2.add(field3);jp2.add(label51); jp2.add(field4);jp2.add(label52); jp2.add(field5);jp2.add(label53);  
  jp2.add(label6);  
  jp2.add(check21);  jp2.add(check22);  

  content.add(jp1, BorderLayout.NORTH); //分别添加面板到容器中
  content.add(jp2, BorderLayout.CENTER); //分别添加面板到容器中
  
 }

 public void actionPerformed(ActionEvent e) {
  // 事件响应处理
 }
  class CheckHandler1 implements ItemListener     //复选框键的事件响应类
     { 
             private int sel; 
             CheckHandler1(int select) 
             { 
                     sel = select; 
             } 
             public void itemStateChanged(ItemEvent e) 
             { 
                     switch(sel) 
                     { 
                       case 1:method1();break;     //调用选择的相应功能的方法
                       case 2:method2();break;   //调用选择的相应功能的方法
                     }
     }

   private void method1() {         //事件响应方法
   } 
   private void method2() {     //    事件响应方法
   }
     }
  class CheckHandler2 implements ItemListener     //复选框键的事件响应类
     { 
             private int sel; 
             CheckHandler2(int select) 
             { 
                     sel = select; 
             } 
             public void itemStateChanged(ItemEvent e) 
             { 
                     switch(sel) 
                     { 
                       case 1:method1();break;     //调用选择的相应功能的方法
                       case 2:method2();break;   //调用选择的相应功能的方法
                     }
     }

   private void method1() {            //事件响应方法
   } 
   private void method2() {         //事件响应方法
   }
     }

//测试
  public static void main(String[] args) {
   学生信息图形界面 界面 = new 学生信息图形界面();
   界面.setVisible(true);
  }
}
