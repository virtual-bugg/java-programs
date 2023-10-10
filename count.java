import java.awt.*;
import java.awt.event.*;
class counter extends Frame implements ActionListener
{
    private  Button b= new Button("Increment");
    private  Button d= new Button("Decrement");
    private  Button r= new Button("reset");
    private Label count_num = new Label("0");
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==b)
      { int n=Integer.parseInt(count_num.getText());
       n++;
       count_num.setText(Integer.toString(n));}
       if(e.getSource()==d)
      { int n=Integer.parseInt(count_num.getText());
       n--;
       count_num.setText(Integer.toString(n));}
       if(e.getSource()==r)
      { 
       count_num.setText("0");}
    }

    counter()
    {
        setSize(500,500);
        setVisible(true);
       
       
        add(count_num);
        add(b);
        add(d);
        add(r);
        b.addActionListener(this);
        d.addActionListener(this);
        r.addActionListener(this);

        setLayout(new FlowLayout());
    }

    public static void main(String ar[])
    {
        counter c1= new counter();
    }
}