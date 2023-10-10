import java.awt.*;
import java.awt.event.*;
class cal extends Frame implements ActionListener
{       
        Label l1 = new Label();
        Button b1 = new Button("C");
        Button b2 = new Button("<-x");
        Button b3 = new Button("%");
        Button b4 = new Button("/");
        Button b5 = new Button("7");
        Button b6 = new Button("8");
        Button b7 = new Button("9");
        Button b8 = new Button("X");
        Button b9 = new Button("4");
        Button b10 = new Button("5");
        Button b11= new Button("6");
        Button b12= new Button("-");
        Button b13= new Button("1");
        Button b14= new Button("2");
        Button b15 = new Button("3");
        Button b16 = new Button("+");
        Button b17 = new Button("^");
        Button b18= new Button("0");
        Button b19 = new Button(".");
        Button b20 = new Button("=");

    public void actionPerformed(ActionEvent a)
    {
        if(a.getSource()==b1)
        {
            l1.setText("");
        }
        if(a.getSource()==b2)
        {
             String str = l1.getText();
             l1.setText(str.substring(0,str.length()-1));
        } 
        if(a.getSource()==b3)
        {
             l1.setText(l1.getText()+"%");
        } 
        if(a.getSource()==b4)
        {
             l1.setText(l1.getText()+"/");
        } 
        if(a.getSource()==b5)
        {
            l1.setText(l1.getText()+"7");
        } 
        if(a.getSource()==b6)
        {
            l1.setText(l1.getText()+"8");
        } 
        if(a.getSource()==b7)
        {
            l1.setText(l1.getText()+"9");

        } 
        if(a.getSource()==b8)
        {
             l1.setText(l1.getText()+"X");
        } 
        if(a.getSource()==b9)
        {
            l1.setText(l1.getText()+"4");
        } 
        if(a.getSource()==b10)
        {            
            l1.setText(l1.getText()+"5");
        } 
        if(a.getSource()==b11)
        {
            l1.setText(l1.getText()+"6");
        }
        if(a.getSource()==b12)
        {
            l1.setText(l1.getText()+"-");
        }
        if(a.getSource()==b13)
        {
            l1.setText(l1.getText()+"1");
        }
        if(a.getSource()==b14)
        {
            l1.setText(l1.getText()+"2");
        }
        if(a.getSource()==b15)
        {
            l1.setText(l1.getText()+"3");
        }
        if(a.getSource()==b16)
        {
            l1.setText(l1.getText()+"+");
        }
        if(a.getSource()==b17)
        {
            l1.setText(l1.getText()+"^");
        }
        if(a.getSource()==b18)
        {
            l1.setText(l1.getText()+"0");
        }
        if(a.getSource()==b19)
        {
            l1.setText(l1.getText()+".");
        }
        
    }

    cal()
    {
        Panel display = new Panel();
       display.setLayout(new BorderLayout());
       display.add(l1);
        Panel buttons = new Panel(new GridLayout(5,4));

        buttons.add(b1);
        buttons.add(b2);
        buttons.add(b3);
        buttons.add(b4);
        buttons.add(b5);
        buttons.add(b6);
        buttons.add(b7);
        buttons.add(b8);
        buttons.add(b9);
        buttons.add(b10);
        buttons.add(b11);
        buttons.add(b12);
        buttons.add(b13);
        buttons.add(b14);
        buttons.add(b15);
        buttons.add(b16);
        buttons.add(b17);
        buttons.add(b18);
        buttons.add(b19);
        buttons.add(b20);

       b1.addActionListener(this);
       b2.addActionListener(this);
       b3.addActionListener(this);
       b4.addActionListener(this);
       b5.addActionListener(this);
       b6.addActionListener(this);
       b7.addActionListener(this);
       b8.addActionListener(this);
       b9.addActionListener(this);
       b10.addActionListener(this);
       b11.addActionListener(this);
       b12.addActionListener(this);
       b13.addActionListener(this);
       b14.addActionListener(this);
       b15.addActionListener(this);
       b16.addActionListener(this);
       b17.addActionListener(this);
       b18.addActionListener(this);
       b19.addActionListener(this);
       b20.addActionListener(this);

     

       setLayout(new BorderLayout());
        setVisible(true);
        add(display,BorderLayout.NORTH);
        add(buttons,BorderLayout.CENTER);

        pack();

    }
    public static void main(String ar[])
    {
        new cal();
    }
}