import java.io.*;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
interface nameandspace
{   
	String name(int number);
	
}

class constellation_and_Lifetime extends monthday
{   private double temp;
	String constellation(int month,int day)
	 { 
	    temp=(double)month+(double)day*0.01;
	    if(temp>=1.20&&temp<=2.18)
	    	return "����ˮƿ��,�������ǻ�!\n";
	    else if(temp>=2.19&&temp<=3.20)
	    	return "����˫����,�����Ÿ���!\n";
	    else if(temp>=3.21&&temp<=4.19)
	    	return "���ǰ�����,�������µĿ�ʼ�� !\n";
	    else if(temp>=4.20&&temp<=5.20)
	    	return "���ǽ�ţ��,����������!\n";
	    else if(temp>=5.21&&temp<=6.21)
	    	return "����˫����,�����Ŷ�����!\n";
	    else if(temp>=6.22&&temp<=7.22)
	    	return "���Ǿ�з��,�����ż�ǿ!\n";
	    else if(temp>=7.23&&temp<=8.22)
	    	return "����ʨ����,������Ȩ��!\n";
	    else if(temp>=8.23&&temp<=9.22)
	    	return "���Ǵ�Ů��,����������!\n";
	    else if(temp>=9.23&&temp<=10.23)
	    	return "������ƽ��,������ƽ��!\n";
	    else if(temp>=10.24&&temp<=11.22)
	    	return "������Ы��,�����ŷḻ!\n";
	    else if(temp>=11.23&&temp<=12.21)
	    	return "����������,������̹��!\n";
	    else if(temp>=12.22||(temp<=1.19&&temp>=1.01))
	    	return "����Ħ����,�����ż���!\n";
	    else
	    	return "�·���������!";
			
	 }  
    int days(int year,int month,int day)
    {   int sum=0;
    	for(int i=1;i<month;i++)
    	     sum+=monthdays(i,year);
    	      return sum+=day;    	       
    }
    
	int dayth(int T[])
	  {
		 int i,d1,d2=0,k1,k2=0;
		  k1=Math.abs(days(T[0],T[1],T[2])-days(T[3],T[4],T[5]));
		  d1=T[0]>T[3]?T[0]:T[3];
		  d2=T[0]<T[3]?T[0]:T[3];
		  for(i=d2;i<d1;i++)
		   { k2+=365;
		     if(k2!=0&&isleapyear(i))//k2!=0ȷ��������ͬһ�����!
		       k2++;
		    }
		 if((T[0]>=T[3])&&days(T[0],T[1],T[2])>=days(T[3],T[4],T[5]))
		    return(k2+k1);
		 else if((T[0]<T[3])&&days(T[0],T[1],T[2])<days(T[3],T[4],T[5]))
		    return(k2+k1);
		   return Math.abs(k2-k1);
		
	  }
	 

}
class animals implements nameandspace
{   private int year,month,day,a;
 
	public  String name(int number)
    {
	 switch(number)
	 { case 1:return("��(Mouse) �����׷���,������ü��\n\t    ------��------\n\t��ҹ��ɺ����ʱ,\n\tһ��ϲ������֪.\n\t���Ŷ���Ǭ����,\n\tĪ���Ե�ٲ���.\n");
       case 2:return("ţ(Cattle)��ŤתǬ��,ţ�������\n\t    ------ţ------\n\t�����ø���Ϊţ,\n\t����ɽԭ�����.\n\t������ƣ�ղ���,\n\t���������η���.\n");
       case 3:return("��(Tiger)�ﻢ������,��Ծ�³̡�\n\t    ------��------\n\tһ����Х������,\n\t����ɽ�ָ�����.\n\tĪЦ�ƺ����ٽ�,\n\t���ݳ���������.\n");
       case 4:return("��(Rabbit)������ӭ��,���ö�����\n\t    ------��------\n\t��ҩ�ڹ����»�,\n\t������˷���޲�.\n\t����ʶ�ʹ�����,\n\t�Ǳ�ȺӢ���Կ�.\n");
       case 5:return("��(Dragon)����Ծ����,���������\n\t    ------��------\n\t��ʯ�����ƻ���,\n\t���Ƽ�������.\n\t�㾦��ʹ������,\n\tҪ��������Ҷ��.\n");
       case 6:return("��(Snake)���������,����֮���\n\t    -------��------\n\t�߱������Զ���,\n\tӹ������Ӱ����.\n\tǧ���޵�������,\n\t��������Ծ����.\n");
       case 7:return("��(Horse)�����ɹ�,һ���ȡ�\n\t    ------��------\n\t�۳�ɳ����ս��,\n\t���ﴳ������Χ.\n\t���ɹ����ɽ��,\n\t���䵱����Ϸ�.\n");
       case 8:return("��(Sheep)������̩,��������\n\t    ------��------\n\t��˳��֪�����,\n\t��ë�׷��꺮��.\n\t������������̩,\n\t��ش��ر�����.\n");
       case 9:return("��(Monkey)������ױ�,������ҡ�\n\t    ------��------\n\t�𾦿�͸�³���,\n\t�����˼�����.\n\t������ͥ������,\n\tΪ�ٶ��ǵ���ı.\n");
       case 10:return("��(Chicken)��𼦱�ϲ,���������\n\t    ------��------\n\t������±�����,\n\t����é����ǻ�.\n\tƽ��δ��������,\n\t���һ���򻧿�.\n");
       case 11:return("��(Dog)��ʮȫʮ��,������¡��\n\t    ------��------\n\t�ɺ��˼����»�,\n\t�ҳϷ������ԩ.\n\t����õ�����ȥ,\n\t�ſڸҽ�������.\n");
       case 0:return("��(Pig)�｡����פ,����������\n\t    -----��------\n\tС������������,\n\t��������ʳΪ��.\n\t�ҷ����󶡲���,\n\t������������ǰ.\n");
       default: return("Illegal animals!");
      }
  } 
	
	public void printspace(int weekday){}
	
}


class monthday 
{   
	public int monthdays(int month,int year)
	{   switch(month)
	     { case 2:
	            if(isleapyear(year))
	                return(29);    /*����Ķ��·���29*/
	                return(28);     /*ƽ��Ķ��·���28*/
	       case 4:
	       case 6:
	       case 9:
	       case 11:
	          return(30);         /*4��6��9��11�·���30��*/
	       default:
	          return(31);         /*1��3��5��7��8��10��12����31��*/
	     }
	 }
	public boolean isleapyear(int year)
	{
		return(((year%4==0)&&(year%100!=0))||(year%200==0));

	}
}
class firstdayofmonth extends monthday
{   private int month,year;
    public final int Monday=1;
    public final int Tuesday=2;
    public final int Wednesday=3;
    public final int Thursday=4;
    public final int Friday=5;
    public final int Saturday=6;
    public final int Sunday=0;
    
	int firstdayofmonth_(int month,int year)
	 {   int weekday,i;
	       weekday=Monday;        /*1900���1��1��Ϊ����һ*/
	      for(i=1900;i<year;i++)
	       {  weekday=(weekday+365)%7; /*����ĳ���1��1�������ڼ�*/
	          if(isleapyear(i))
	               weekday=(weekday+1)%7; /*������һ��Ҫ��һΪ366��*/
	       }
	     for(i=1;i<month;i++)
	         weekday=(weekday+monthdays(i,year))%7;/*���㱾���ĳ�µĵ�һ�������ڼ�*/
	        return(weekday);
	 }

}
class prtmonthcalendar  implements nameandspace
{
	public  String name(int month)
	{
		switch(month)
	     { case 1:return("January");
	       case 2:return("February");
	       case 3:return("March");
	       case 4:return("April");
	       case 5:return("May");
	       case 6:return("June");
	       case 7:return("July");
	       case 8:return("August");
	       case 9:return("September");
	       case 10:return("October");
	       case 11:return("November");
	       case 12:return("December");
	      default: return("Illegal month");
	     }
	}
}
  
class WindowBox extends JFrame
  {  
	  
      JTextField text1,text2,text3,text4,text5,text6;
      JTextArea area1;
  	  Box baseBox,boxV1,boxV2,boxv1,boxv2;
  	  JButton b[];
  	  WindowBox(String w)
  	  { setTitle(w);
  		b=new JButton[2];
  		boxV1=Box.createVerticalBox();
  		boxV1.add(new JLabel("���뵱ǰ����!"));
  		boxV1.add(Box.createVerticalStrut(6));
  		boxV1.add(new JLabel("�����������!"));
  		boxV1.add(Box.createVerticalStrut(30));
  		b[0]=new JButton("��ӡ��ǰ����!");
  		boxV1.add(b[0]);
  		b[0].addActionListener(new Pb1());
  		boxV1.add(Box.createVerticalStrut(10));
  		b[1]=new JButton("��ʾ������Ϣ!");
  		boxV1.add(b[1]);
  		b[1].addActionListener(new Pb2());
  		boxV1.add(Box.createVerticalStrut(100));
  		boxV2=Box.createVerticalBox();
  		boxv1=Box.createHorizontalBox();
  		text1=new JTextField(6);
  		boxv1.add(text1);
  		boxv1.add(Box.createHorizontalStrut(2));
  		boxv1.add(new JLabel("��"));
  		text2=new JTextField(6);
  		boxv1.add(text2);
  		boxv1.add(Box.createHorizontalStrut(2));
  		boxv1.add(new JLabel("��"));
  		text3=new JTextField(6);
  		boxv1.add(text3);
  		boxv1.add(Box.createHorizontalStrut(2));
  		boxv1.add(new JLabel("��"));
  		boxV2.add(boxv1);
  		boxv2=Box.createHorizontalBox();
  		boxv1.add(Box.createVerticalStrut(20));
  		text4=new JTextField(6);
  		boxv2.add(text4);
  		boxv2.add(Box.createHorizontalStrut(2));
  		boxv2.add(new JLabel("��"));
  		text5=new JTextField(6);
  		boxv2.add(text5);
  		boxv2.add(Box.createHorizontalStrut(2));
  		boxv2.add(new JLabel("��"));
  		text6=new JTextField(6);
  		boxv2.add(text6);
  		boxv2.add(Box.createHorizontalStrut(2));
  		boxv2.add(new JLabel("��"));
  		boxV2.add(boxv2);
  		
  	    boxV2.add(Box.createVerticalStrut(8));
  	    area1=new JTextArea(10,12);
  		boxV2.add(area1);
  		
  		
  		baseBox=Box.createHorizontalBox();
  		baseBox.add(boxV1);
  		baseBox.add(Box.createHorizontalStrut(10));
  		baseBox.add(boxV2);
  		setLayout(new FlowLayout());
  		add(baseBox);
  		validate();
  		setBounds(180,125,600,400);
  		setVisible(true);
  		
  		
  	}
  	 class Pb1 implements ActionListener{
  		 private int year,month,ndays,weekday;
  		firstdayofmonth pr =new firstdayofmonth();
  		prtmonthcalendar dc=new prtmonthcalendar();
  		  public void actionPerformed(ActionEvent e){
  			                     
  			  try{
   		          year=Integer.parseInt(text1.getText());
  				  month=Integer.parseInt(text2.getText());
  				  ndays=pr.monthdays(month,year);
  				  if(year>1900&&month>0&&month<13)
  				  {
  				  weekday=pr.firstdayofmonth_(month,year);
  				  area1.setText("��������ﵱ�µ��������������\n");
  				  area1.append(" "+dc.name(month)+" "+year+"\n");
  				  area1.append(" Su  Mo Tu We Th Fr  Sa\n");
  				for(int i=0;i<weekday;i++)
  					 area1.append("      ");    
  				for(int day=1;day<=ndays;day++)
   				   { if(day>9)
  					    area1.append(" "+day+" ");
   				     else
   					    area1.append("  "+day+"  ");
  				          if(weekday==6) 
  				      area1.append("\n");                         /*����ӡ���������պ���*/
  				         weekday=(weekday+1)%7;                   /*������һ�������ڼ�*/
  				   }
  				if(weekday!=0)              /*���һ��Ϊ���ڵĿ�ͷʱ����Ҫ����*/
  					area1.append("\n");  				
 			
			  area1.paintImmediately(area1.getBounds());
  				}
  				  else 
  				  {
  					MyException M=new MyException("������������,���������룡");
					  throw(M);
  				  }
  			  }
  			   catch(MyException ex){area1.setText(ex.getMessage());}
  			   catch(Exception ex){area1.setText("���쳣�ַ�������������!");}
  			   
  		  }
  	  }
 class MyException extends Exception
  	{
  		 String message;
  		 MyException(String s)
  		 {
  			 message=s;
  		 }
  		 public String getMessage()
  		 {
  			 return message;
  		 }
  		 
    }
  	class Pb2 implements ActionListener{
  		private int T[]=new int[6],days=9;
  		constellation_and_Lifetime p =new constellation_and_Lifetime();
  		animals a= new animals();
		public void actionPerformed(ActionEvent e){
			  try{
				  T[0]=Integer.parseInt(text1.getText());
				  T[1]=Integer.parseInt(text2.getText());
				  T[2]=Integer.parseInt(text3.getText());
				  T[3]=Integer.parseInt(text4.getText());
				  T[4]=Integer.parseInt(text5.getText());
				  T[5]=Integer.parseInt(text6.getText());
				 if(T[0]>0&&(T[1]>0&&T[1]<13)&&(T[2]>0&&T[2]<p.monthdays(T[1], T[0])))
				 if(T[3]>1900&&(T[4]>0&&T[4]<13)&&(T[5]>0&&T[5]<p.monthdays(T[4], T[3])))
				 {
				  area1.setText("������һ������:\n");
				  area1.append("���Ѿ���ǿ��������"+p.dayth(T)+"��!"+"��(^o^)��(^o^)��");
				  //area1.paintImmediately(area1.getX(), area1.getY(), area1.getWidth(), area1.getHeight());
				  area1.append("\n��������:"+p.constellation(T[4],T[5]));
				  area1.append("�����Ф��"+a.name((T[3]-1900+1)%12));
				  area1.paintImmediately(area1.getBounds());
				  //area1.invalidate();
				  //area1.repaint();
				 }
				 else 
				 {
					MyException M=new MyException("������������,���������룡");
					throw(M);
				 }
			    }catch(MyException ex){area1.setText(ex.getMessage());}
			     catch(Exception ex){area1.setText("���쳣�ַ�������������!");}
			    
		  }      
	  }
  }
	
 public class  calendar{
	  public static void main(String[] args) {		   
		    WindowBox W= new WindowBox("��201008202106л����--Java�γ���ơ�");
	    }
	  }
 	