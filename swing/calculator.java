import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class calculator  {


public static void main(String[] args) {

  m1 a=new m1();
  a.creategui();

}
}
 class m1{
   void b1(JFrame f,int x,int y,int height,int width,String t,String add1,JTextField t2)
     {
       JButton b=new JButton(t);
         b.setBounds(x,y,height,width);
         b.setBackground(new java.awt.Color(211,211,211));
         b.addActionListener(new ActionListener() {

             @Override
             public void actionPerformed(ActionEvent e) {
         String s1=t2.getText();
 s1=s1+add1;
 t2.setText(s1);

             }

         });


         f.add(b);
   }
   String convert(String s)
   {

     return s;
   }
   void eval(JFrame f,JTextField t2)
     {
       try{
        String s1=convert(t2.getText());


        evalu ev=new evalu();
        double c1=ev.eval(s1);
        t2.setText(c1+"");}
     catch(Exception e) {
        // handle exception
        System.err.println("Error evaluating the script: " + e.getMessage());
     }
   }
   void npr1(JFrame f,int x,int y,int height,int width,String t,JTextField t2,int k2)
     {
       JButton b=new JButton(t);
         b.setBounds(x,y,height,width);
         b.addActionListener(new ActionListener() {

             @Override
             public void actionPerformed(ActionEvent e) {

       npr(f,t2,k2);


             }

         });

         f.add(b);
   }
   public static int fact(int num)
     {
         int fact=1, i;
         for(i=1; i<=num; i++)
         {
             fact = fact*i;
         }
         return fact;
     }
   void npr(JFrame f,JTextField t2,int k2)
     {
       JFrame f1=new JFrame();
       f1.setSize(800,500);
       f1.setLayout(null);
       f1.setVisible(true);
       JTextField t1 = new JTextField("ENTER VALUE OF N", 16);
       t1.setBounds(10,10,700,40);
       f1.add(t1);
     JTextField  t3 = new JTextField("ENTER VALUE OF R", 16);
      t3.setBounds(10,100,700,40);
      f1.add(t3);
       JButton b=new JButton("calc");

         b.setBounds(10,200,100,40);
         b.addActionListener(new ActionListener() {

             @Override
             public void actionPerformed(ActionEvent e) {
         int s1=Integer.parseInt(t1.getText());
 int s2=Integer.parseInt(t3.getText());
 if(s1>=s2){
 int s3=(fact(s1)/(fact(s1-s2)));

 int s4=(fact(s1)/(fact(s1-s2)*fact(s2)));
 String s5=t2.getText();
 if(k2==1)
 t2.setText(s5+""+s3);
 else
 t2.setText(s5+""+s4);
 f1.setVisible(false);}
 else{
   t1.setText("error");
 }

             }

         });
       //  int k=validate(t2);

       f1.add(b);
       }


   public void creategui()
   {
     JFrame f=new JFrame();
     f.getContentPane().setBackground(new java.awt.Color(111,111,111));
     f.setSize(800,500);
     JTextField t1 = new JTextField("", 16);
     t1.setBounds(10,10,700,40);
     f.add(t1);
 //button delete
     f.setLayout(null);
     f.setVisible(true);
     JButton b=new JButton("delete");
       b.setBounds(10,70,50,50);
       b.addActionListener(new ActionListener() {

           @Override
           public void actionPerformed(ActionEvent e) {
           //  a.n=Integer.parseInt(t1.getText());
   String s1=t1.getText();
   if(s1.length()>=1)
   s1=s1.substring(0, s1.length()-1);
   //System.out.println(s1);
   t1.setText(s1);
         //    a.pre(a.n);
           }
         //  return 0;
       });
         f.add(b);
       b=new JButton("clear");
         b.setBounds(90,70,50,50);
          b.setBackground(new java.awt.Color(211,211,211));
         b.addActionListener(new ActionListener() {

             @Override
             public void actionPerformed(ActionEvent e) {
             //  a.n=Integer.parseInt(t1.getText());

     t1.setText("");
           //    a.pre(a.n);
             }
           //  return 0;
         });

       f.add(b);

   //  b1(f,10,130,50,50,"0",t1);
     b1(f,10,130,50,50,"1","1",t1);
     b1(f,70,130,50,50,"2","2",t1);
     b1(f,130,130,50,50,"3","3",t1);
     b1(f,190,130,50,50,"+","+",t1);
     b1(f,340,130,70,50,"x^2","^(2)",t1);
     b1(f,420,130,70,50,"x^3","^(3)",t1);
     b1(f,500,130,70,50,"x^y","^(",t1);
     b1(f,580,130,70,50,"1/x","^(-1)",t1);
     b1(f,660,130,70,50,"(","(",t1);

     b1(f,10,190,50,50,"4","4",t1);
     b1(f,70,190,50,50,"5","5",t1);
     b1(f,130,190,50,50,"6","6",t1);
     b1(f,190,190,50,50,"-","-",t1);
     b1(f,340,190,70,50,"sq root","^(1/2)",t1);
     b1(f,420,190,70,50,"cube root","^(1/3)",t1);
     b1(f,500,190,70,50,"nth root","^(1/",t1);
     b1(f,580,190,70,50,"n!","!",t1);
     b1(f,660,190,70,50,")",")",t1);

     b1(f,10,250,50,50,"7","7",t1);
     b1(f,70,250,50,50,"8","8",t1);
     b1(f,130,250,50,50,"9","9",t1);
     b1(f,190,250,50,50,"*","*",t1);
     b1(f,340,250,70,50,"sin","sin(",t1);
     b1(f,420,250,70,50,"cos","cos(",t1);
     b1(f,500,250,70,50,"tan","tan(",t1);
     b1(f,580,250,70,50,"exp","*10^(",t1);
     npr1(f,660,250,70,50,"nPr",t1,1);

     b1(f,10,310,50,50,"0","0",t1);
     b1(f,70,310,50,50,".",".",t1);
     b1(f,130,310,50,50,"%","%",t1);
     b1(f,190,310,50,50,"/","/",t1);
     b1(f,340,310,70,50,"asin","asin(",t1);
     b1(f,420,310,70,50,"acos","acos(",t1);
     b1(f,500,310,70,50,"atan","atan(",t1);
     b1(f,580,310,70,50,"log","log",t1);
   npr1(f,660,310,70,50,"nCr",t1,2);

     b1(f,340,370,70,50,"sinh","sinh(",t1);
     b1(f,420,370,70,50,"cosh","cosh(",t1);
     b1(f,500,370,70,50,"tanh","tanh(",t1);
     b1(f,580,370,70,50,"logten","logten",t1);
     b1(f,660,370,70,50,"Pie","(22/7)",t1);
     b=new JButton("EXIT");
       b.setBounds(660,70,70,50);
        b.setBackground(new java.awt.Color(111,111,111));
       b.addActionListener(new ActionListener() {

           @Override
           public void actionPerformed(ActionEvent e) {

     System.exit(0);

           }

       });
       f.add(b);
       b=new JButton("ANS");
         b.setBounds(580,70,70,50);
          b.setBackground(new java.awt.Color(211,211,211));
         b.addActionListener(new ActionListener() {

             @Override
             public void actionPerformed(ActionEvent e) {

       eval(f,t1);

             }

         });

       f.add(b);
     f.addWindowListener(new WindowAdapter() {
              public void windowClosing(WindowEvent windowEvent){
                 System.exit(0);
              }
           });
   }

}
