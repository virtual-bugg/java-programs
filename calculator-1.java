import java.awt.*;
class calculator extends Frame
{
    calculator()
    {
        super();
        // Frame f1 = new Frame();
        setTitle("Calculator-Layout");
        add(new TextField(), BorderLayout.NORTH);
        setSize(400,300);
        setVisible(true);
        setLayout(null);
        Button b1= new Button("7");
        b1.setBounds(0,50,100,50);
        add(b1);
        Button b2= new Button("8");
        b2.setBounds(100,50,100,50);
        add(b2);
        Button b3= new Button("9");
        b3.setBounds(200,50,100,50);
        add(b3);
        Button b4= new Button("%");
        b4.setBounds(300,50,100,50);
        add(b4);
        Button b5= new Button("4");
        b5.setBounds(0,100,100,50);
        add(b5);
        Button b6= new Button("5");
        b6.setBounds(100,100,100,50);
        add(b6);
        Button b7= new Button("6");
        b7.setBounds(200,100,100,50);
        add(b7);
        Button b8= new Button("X");
        b8.setBounds(300,100,100,50);
        add(b8);
        Button b9= new Button("1");
        b9.setBounds(0,150,100,50);
        add(b9);
        Button b10= new Button("2");
        b10.setBounds(100,150,100,50);
        add(b10);
        Button b11= new Button("3");
        b11.setBounds(200,150,100,50);
        add(b11);
        Button b12= new Button("/");
        b12.setBounds(300,150,100,50);
        add(b12);
        Button b13= new Button(".");
        b13.setBounds(0,200,100,50);
        add(b13);
        Button b14= new Button("0");
        b14.setBounds(100,200,100,50);
        add(b14);
        Button b15= new Button("+");
        b15.setBounds(200,200,100,50);
        add(b15);
        Button b16= new Button("-");
        b16.setBounds(300,200,100,50);
        add(b16);
        Button b17= new Button("=");
        b17.setBounds(0,250,400,50);
        add(b17);

    }
    

    public static void main(String ar[])
    {
        calculator c1= new calculator();
    }
}