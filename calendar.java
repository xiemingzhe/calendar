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
	    	return "你是水瓶座,象征着智慧!\n";
	    else if(temp>=2.19&&temp<=3.20)
	    	return "你是双鱼座,象征着复杂!\n";
	    else if(temp>=3.21&&temp<=4.19)
	    	return "你是白羊座,象征着新的开始。 !\n";
	    else if(temp>=4.20&&temp<=5.20)
	    	return "你是金牛座,象征着力量!\n";
	    else if(temp>=5.21&&temp<=6.21)
	    	return "你是双子座,象征着多面性!\n";
	    else if(temp>=6.22&&temp<=7.22)
	    	return "你是巨蟹座,象征着坚强!\n";
	    else if(temp>=7.23&&temp<=8.22)
	    	return "你是狮子座,象征着权力!\n";
	    else if(temp>=8.23&&temp<=9.22)
	    	return "你是处女座,象征着神秘!\n";
	    else if(temp>=9.23&&temp<=10.23)
	    	return "你是天平座,象征着平衡!\n";
	    else if(temp>=10.24&&temp<=11.22)
	    	return "你是天蝎座,象征着丰富!\n";
	    else if(temp>=11.23&&temp<=12.21)
	    	return "你是射手座,象征着坦诚!\n";
	    else if(temp>=12.22||(temp<=1.19&&temp>=1.01))
	    	return "你是摩羯座,象征着坚韧!\n";
	    else
	    	return "月份输入有误!";
			
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
		     if(k2!=0&&isleapyear(i))//k2!=0确保不是在同一个年份!
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
	 { case 1:return("鼠(Mouse) ★鼠兆丰年,金鼠扬眉★\n\t    ------鼠------\n\t子夜阑珊独醒时,\n\t一天喜乐我先知.\n\t早闻洞外乾坤大,\n\t莫误机缘举步迟.\n");
       case 2:return("牛(Cattle)★扭转乾坤,牛气冲天★\n\t    ------牛------\n\t众生得福我为牛,\n\t耕遍山原万里畴.\n\t力尽筋疲终不悔,\n\t卧栏望月盼丰收.\n");
       case 3:return("虎(Tiger)★虎虎生风,虎跃新程★\n\t    ------虎------\n\t一声长啸谷生风,\n\t独步山林盖世雄.\n\t莫笑狡狐威假借,\n\t尊容常见挂堂中.\n");
       case 4:return("兔(Rabbit)★瑞兔迎春,玉兔东升★\n\t    ------兔------\n\t捣药勤工拜月华,\n\t迷离扑朔两无差.\n\t性灵识就存三窟,\n\t智比群英堪自夸.\n");
       case 5:return("龙(Dragon)★鱼跃龙门,祥龙献瑞★\n\t    ------龙------\n\t化石何曾似画龙,\n\t腾云驾雾本无踪.\n\t点睛能使飞天外,\n\t要辨真容问叶公.\n");
       case 6:return("蛇(Snake)★笔走龙蛇,灵蛇之珠★\n\t    -------蛇------\n\t蛇本纯顽性独聪,\n\t庸人自扰影杯弓.\n\t千年修得灵珠现,\n\t倒海翻江跃巨龙.\n");
       case 7:return("马(Horse)★马到成功,一马当先★\n\t    ------马------\n\t驰骋沙场百战威,\n\t铁骑闯破万重围.\n\t功成归放南山日,\n\t犹忆当年草上飞.\n");
       case 8:return("羊(Sheep)★三羊开泰,洋洋得意★\n\t    ------羊------\n\t柔顺生知跪乳恩,\n\t裘毛献奉岁寒珍.\n\t咩声唤起三阳泰,\n\t大地春回遍绿茵.\n");
       case 9:return("猴(Monkey)★灵猴献宝,金猴献桃★\n\t    ------猴------\n\t金睛看透宦沉浮,\n\t可恼人间冠沐猴.\n\t漫道天庭曾弼马,\n\t为官多是稻粮谋.\n");
       case 10:return("鸡(Chicken)★金鸡报喜,吉祥如意★\n\t    ------鸡------\n\t红冕锦衣本自来,\n\t竹篱茅舍独徘徊.\n\t平生未许轻言语,\n\t金口一啼万户开.\n");
       case 11:return("狗(Dog)★十全十美,狗至兴隆★\n\t    ------狗------\n\t可恨人间事事昏,\n\t忠诚反落丑名冤.\n\t来年得道升天去,\n\t张口敢将日月吞.\n");
       case 0:return("猪(Pig)★健康常驻,猪生财利★\n\t    -----猪------\n\t小豕拱爬大豕眠,\n\t凡尘万事食为天.\n\t家肥屋润丁财旺,\n\t六畜排行我最前.\n");
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
	                return(29);    /*闰年的二月返回29*/
	                return(28);     /*平年的二月返回28*/
	       case 4:
	       case 6:
	       case 9:
	       case 11:
	          return(30);         /*4，6，9，11月返回30天*/
	       default:
	          return(31);         /*1，3，5，7，8，10，12返回31天*/
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
	       weekday=Monday;        /*1900年的1月1日为星期一*/
	      for(i=1900;i<year;i++)
	       {  weekday=(weekday+365)%7; /*计算某年的1月1日是星期几*/
	          if(isleapyear(i))
	               weekday=(weekday+1)%7; /*闰年是一年要加一为366天*/
	       }
	     for(i=1;i<month;i++)
	         weekday=(weekday+monthdays(i,year))%7;/*计算本年度某月的第一天是星期几*/
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
  		boxV1.add(new JLabel("输入当前日期!"));
  		boxV1.add(Box.createVerticalStrut(6));
  		boxV1.add(new JLabel("输入你的生日!"));
  		boxV1.add(Box.createVerticalStrut(30));
  		b[0]=new JButton("打印当前日历!");
  		boxV1.add(b[0]);
  		b[0].addActionListener(new Pb1());
  		boxV1.add(Box.createVerticalStrut(10));
  		b[1]=new JButton("显示出生信息!");
  		boxV1.add(b[1]);
  		b[1].addActionListener(new Pb2());
  		boxV1.add(Box.createVerticalStrut(100));
  		boxV2=Box.createVerticalBox();
  		boxv1=Box.createHorizontalBox();
  		text1=new JTextField(6);
  		boxv1.add(text1);
  		boxv1.add(Box.createHorizontalStrut(2));
  		boxv1.add(new JLabel("年"));
  		text2=new JTextField(6);
  		boxv1.add(text2);
  		boxv1.add(Box.createHorizontalStrut(2));
  		boxv1.add(new JLabel("月"));
  		text3=new JTextField(6);
  		boxv1.add(text3);
  		boxv1.add(Box.createHorizontalStrut(2));
  		boxv1.add(new JLabel("日"));
  		boxV2.add(boxv1);
  		boxv2=Box.createHorizontalBox();
  		boxv1.add(Box.createVerticalStrut(20));
  		text4=new JTextField(6);
  		boxv2.add(text4);
  		boxv2.add(Box.createHorizontalStrut(2));
  		boxv2.add(new JLabel("年"));
  		text5=new JTextField(6);
  		boxv2.add(text5);
  		boxv2.add(Box.createHorizontalStrut(2));
  		boxv2.add(new JLabel("月"));
  		text6=new JTextField(6);
  		boxv2.add(text6);
  		boxv2.add(Box.createHorizontalStrut(2));
  		boxv2.add(new JLabel("日"));
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
  				  area1.setText("★★★★★★★★当月的日历★★★★★★★★\n");
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
  				      area1.append("\n");                         /*当打印星期六的日后换行*/
  				         weekday=(weekday+1)%7;                   /*计算下一天是星期几*/
  				   }
  				if(weekday!=0)              /*最后一行为星期的开头时不需要换行*/
  					area1.append("\n");  				
 			
			  area1.paintImmediately(area1.getBounds());
  				}
  				  else 
  				  {
  					MyException M=new MyException("年月输入有误,请重新输入！");
					  throw(M);
  				  }
  			  }
  			   catch(MyException ex){area1.setText(ex.getMessage());}
  			   catch(Exception ex){area1.setText("有异常字符，请重新输入!");}
  			   
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
				  area1.setText("告诉你一个秘密:\n");
				  area1.append("你已经坚强的生活了"+p.dayth(T)+"天!"+"└(^o^)★(^o^)┘");
				  //area1.paintImmediately(area1.getX(), area1.getY(), area1.getWidth(), area1.getHeight());
				  area1.append("\n星座传奇:"+p.constellation(T[4],T[5]));
				  area1.append("你的生肖是"+a.name((T[3]-1900+1)%12));
				  area1.paintImmediately(area1.getBounds());
				  //area1.invalidate();
				  //area1.repaint();
				 }
				 else 
				 {
					MyException M=new MyException("年月输入有误,请重新输入！");
					throw(M);
				 }
			    }catch(MyException ex){area1.setText(ex.getMessage());}
			     catch(Exception ex){area1.setText("有异常字符，请重新输入!");}
			    
		  }      
	  }
  }
	
 public class  calendar{
	  public static void main(String[] args) {		   
		    WindowBox W= new WindowBox("★201008202106谢明哲--Java课程设计★");
	    }
	  }
 	