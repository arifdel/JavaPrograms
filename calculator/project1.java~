import java.awt.*;
class project1
{
Frame f;
TextField tf;
Button b[]=new Button[30];
String str[]={"MC","MR","MS","M+","M-","<-","CE","c","+-","sqrt","7","8","9","/","%","4","5","6","*","1/x","1","2","3","(",")","0",".","-","+","="};
project1(String s)
{
f=new Frame(s);
tf=new TextField();
tf.setBounds(17,40,195,70);
f.add(tf);
for(int k=0,i=17,j=120;k<b.length;k++,i+=40)
{
if(i>212)
{
i=17;
j+=40;
}
b[k]=new Button(str[k]);
b[k].setBounds(i,j,35,35);
f.add(b[k]);
}
f.setLayout(null);
f.setSize(230,373);
f.setVisible(true);
}
public static void main(String[] args)
{
new project1("calculator");
}
}
