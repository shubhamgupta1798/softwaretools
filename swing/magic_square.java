import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class swing {
  int n=0;
  public int fn2(int[][] a,int n)
  {

    int i,j;
    int sum=n*(n*n+1);
    sum=sum/2;
    int f=0;
    int ans3=0;
    int ans4=0;
    for(i=0;i<n;i++)
    {
      int ans=0;
      int ans2=0;
      ans3+=a[i][i];
      ans4+=a[n-1-i][i];
      for(j=0;j<n;j++)
      {
        ans+=a[i][j];
        ans2+=a[j][i];
      }
      if(ans==sum && ans2==sum)
      {
        continue;
      }
      else
      {
        f++;
        break;
      }
    }
    if(ans3!=sum || ans4!=sum)
    {
      f++;
    }
      if(f==0)
    {
      return 1;
    }
    else
    {
      return 0;
    }
  }
public  void pre(int n1)
{
  JFrame f=new JFrame();
  int k=1,m;
  JLabel l=new JLabel("");
  l.setText("ENTER NUMBERS");
  l.setLocation(20,20);
  l.setSize(500,50);

  f.add(l);
  String s="";
  JComboBox[] a1=new JComboBox[n1*n1+1];
  // add items to the combo box
  for(m=0;m<n1*n1;m++)
  {
    JComboBox<String> a = new JComboBox<String>();
  for(k=1;k<=n1*n1;k++)
  {
    s=""+k;
     a.addItem(s);
  }

  a.setBounds(130+80*(m%n1),100+50*(m/n1),70, 40);
    a.setSelectedIndex(0);
  f.add(a);
  a1[m]=a;
  }
  JButton b=new JButton("CHECK");
  b.setBounds(130,100+50*n,80,80);
    JComboBox<String> a4 = new JComboBox<String>();
    int[][] c1= new int[n1][n1];
    b.addActionListener(new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent e) {
          int k1=0;
          JComboBox m2=a1[0];
          int[] var=new int[n1*n1+1];
          int m=0;
          for(m=0;m<n1*n1+1;m++)
          {
            var[m]=0;
          }
          for(m=0;m<n1*n1;m++)
          {
           m2=a1[m];
           int z1=m/n1;
           int z2=m%n1;
            String s2=m2.getSelectedItem().toString();
          int z=  Integer.parseInt(s2);
          c1[z1][z2]=z;
          System.out.print(z);
          if(m%n1==n1-1)
          {
            System.out.println("");
          }

          var[z]=var[z]+1;
          if(var[z]>1)
          {
            l.setText("SELECT DIFFERENT NUMBERS");
            f.add(l);
            k1++;
            break;

          }
          }
        int v2=  fn2(c1,n1);
        if(k1==0){
        if(v2==1)
        {
          l.setText("WOW!! IT'S A MAGIC SQUARE");
          f.add(l);
        }
        else
        {
          l.setText("OOPS!! IT IS NOT A MAGIC SQUARE");
          f.add(l);
        }}
        }
      //  return 0;
    });


  f.add(b);

  f.setSize(300+80*(n1),300+50*n1);
  f.setLayout(null);
  f.setVisible(true);
  f.addWindowListener(new WindowAdapter() {
           public void windowClosing(WindowEvent windowEvent){
              System.exit(0);
           }
        });
  }

public static void main(String[] args) {
  //pre();
  swing a=new swing();
  a.find(a);

}
void find(swing a)
{
  JFrame f1=new JFrame();
JTextField t1 = new JTextField("enter the number", 16);
t1.setBounds(130,100,150,40);
f1.add(t1);
JButton b=new JButton("SUBMIT");
b.setBounds(130,200,120,40);
f1.add(b);
  f1.setSize(500,500);
  f1.setLayout(null);
  f1.setVisible(true);
  b.addActionListener(new ActionListener() {

      @Override
      public void actionPerformed(ActionEvent e) {
        a.n=Integer.parseInt(t1.getText());

        a.pre(a.n);
      }
    //  return 0;
  });
  f1.addWindowListener(new WindowAdapter() {
           public void windowClosing(WindowEvent windowEvent){
              System.exit(0);
           }
        });

}
}
