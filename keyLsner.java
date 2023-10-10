import java.awt.event.*;
import java.awt.*;
class keyf extends Frame 
{

    keyf()
    {
        setLayout(new FlowLayout());
        setVisible(true);
        setSize(500,500);
        TextField t= new TextField(20);
        add(t);
        t.addKeyListener(new key());
        addWindowListener(new close());
    }
    public static void main(String st[])
    {
        new keyf();
    }
}

class key extends KeyAdapter
{
    public void keyTyped(KeyEvent a)
    {
        char ch= a.getKeyChar();
        if((ch <= 'Z' && ch >='A')||(ch <= 'z' && ch >= 'a')||ch == ' ')
        {
            System.out.println("Correct !!");
        }
        else 
        {
            a.consume();
            System.out.println("Nope, number nahi!! ");
        }
    }
}
class close extends WindowAdapter
{
    public void windowClosing(WindowEvent close)
    {
        System.exit(-115);
    }
}