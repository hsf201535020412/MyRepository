

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

//¼�����Ϣ����ѧ�š��������Ա𡢳������ڡ��Ƿ�����������
public class ѧ����Ϣͼ�ν��� extends JFrame implements ActionListener {

 public ѧ����Ϣͼ�ν���() { //���췽��
  //������ʾ����
  super("ѧ����Ϣͼ�ν���");
  setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
  setSize(320, 300);
  setVisible(true);
  Container content = getContentPane();

  JPanel jp1 = new JPanel(); //����һ�����

  JLabel label = new JLabel("��ӭʹ��ѧ����Ϣ����ϵͳ");      //��ӭ����Ļ�ӭ���
  label.setFont(new Font("����_GB2312", Font.BOLD, 20));  //������ʾ������

  jp1.add(label);            //����ǩ��ӵ����jp1��

  JPanel jp2 = new JPanel();         //����һ����壬���ڰڷ���ʾ���ֹ��ܵı�ǩ
  
  JLabel label1 = new JLabel("������ѧ������ϸ���ϣ�");   //������ʾ��������ԣ�
  label1.setFont(new Font("����_GB2312", Font.BOLD, 18));  //������ʾ������
  
  JLabel label2 = new JLabel("ѧ �� ѧ �ţ�");     //��ʾ�����������ݵı�ǩ
  label2.setFont(new Font("����_GB2312", Font.BOLD, 18));  //������ʾ������t
  JTextField field1=new JTextField(10);       //10Ϊѧ�ų��ȣ��������趨
  
  JLabel label3 = new JLabel("ѧ �� �� ����");     //��ʾ����ѧ�������ı�ǩ
  label3.setFont(new Font("����_GB2312", Font.BOLD, 18));  //������ʾ������
  JTextField field2=new JTextField(10);       //10Ϊ�������ȣ��������趨
  
  JLabel label4 = new JLabel("ѧ �� �� �� ");     //��ʾ����ѧ���Ա�ı�ǩ
  label4.setFont(new Font("����_GB2312", Font.BOLD, 18));  //������ʾ������
  
  CheckboxGroup group1 = new CheckboxGroup();     //����һ����ѡ������ѡ��ĳһ����
  
  Checkbox check11 = new Checkbox("��",true,group1);    //���ѡ���ѡ����
  check11.setFont(new Font("����_GB2312", Font.BOLD, 18)); //������ʾ������
  check11.addItemListener(new CheckHandler1(1));    //����Ӧ��ѡ������¼�������
  Checkbox check12 = new Checkbox("Ů",false,group1);  //���ѡ���ѡ����
  check12.setFont(new Font("����_GB2312", Font.BOLD, 18)); //������ʾ������
  check12.addItemListener(new CheckHandler1(2));   //����Ӧ��ѡ������¼�������
  
  JLabel label5 = new JLabel("�� �� �� �ڣ�");     //��ʾ����������ڵı�ǩ
  label5.setFont(new Font("����_GB2312", Font.BOLD, 18));  //������ʾ������
  JTextField field3=new JTextField("2000",3);      //3Ϊ�������ȣ��������趨
  JLabel label51 = new JLabel("��");       
  label51.setFont(new Font("����_GB2312", Font.BOLD, 18)); //������ʾ������
  JTextField field4=new JTextField("01",2);      //2Ϊ�������ȣ��������趨
  JLabel label52 = new JLabel("��");
  label52.setFont(new Font("����_GB2312", Font.BOLD, 18)); //������ʾ������
  JTextField field5=new JTextField("01",2);      //2Ϊ�������ȣ��������趨
  JLabel label53 = new JLabel("��");  
  label53.setFont(new Font("����_GB2312", Font.BOLD, 18)); //������ʾ������
  
  JLabel label6 = new JLabel("����������");       //��ʾѡ�������������ı�ǩ
  label6.setFont(new Font("����_GB2312", Font.BOLD, 18));  //������ʾ������
  CheckboxGroup group2 = new CheckboxGroup();     //����һ����ѡ������ѡ��ĳһ����
  
  Checkbox check21 = new Checkbox("��",true,group2);    //���ѡ���ѡ����
  check21.setFont(new Font("����_GB2312", Font.BOLD, 18)); //������ʾ������
  check21.addItemListener(new CheckHandler2(1));    //����Ӧ��ѡ������¼�������
  Checkbox check22 = new Checkbox("��",false,group2);  //���ѡ���ѡ����
  check22.setFont(new Font("����_GB2312", Font.BOLD, 18)); //������ʾ������
  check22.addItemListener(new CheckHandler2(2));   //����Ӧ��ѡ������¼�������
  //�����������������
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

  content.add(jp1, BorderLayout.NORTH); //�ֱ������嵽������
  content.add(jp2, BorderLayout.CENTER); //�ֱ������嵽������
  
 }

 public void actionPerformed(ActionEvent e) {
  // �¼���Ӧ����
 }
  class CheckHandler1 implements ItemListener     //��ѡ������¼���Ӧ��
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
                       case 1:method1();break;     //����ѡ�����Ӧ���ܵķ���
                       case 2:method2();break;   //����ѡ�����Ӧ���ܵķ���
                     }
     }

   private void method1() {         //�¼���Ӧ����
   } 
   private void method2() {     //    �¼���Ӧ����
   }
     }
  class CheckHandler2 implements ItemListener     //��ѡ������¼���Ӧ��
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
                       case 1:method1();break;     //����ѡ�����Ӧ���ܵķ���
                       case 2:method2();break;   //����ѡ�����Ӧ���ܵķ���
                     }
     }

   private void method1() {            //�¼���Ӧ����
   } 
   private void method2() {         //�¼���Ӧ����
   }
     }

//����
  public static void main(String[] args) {
   ѧ����Ϣͼ�ν��� ���� = new ѧ����Ϣͼ�ν���();
   ����.setVisible(true);
  }
}
