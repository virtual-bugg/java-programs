class frame
{
	public static void main(String arg[])
	{
		java.awt.Frame f1 = new java.awt.Frame();
		f1.setSize(500,500);
		java.awt.Label l1= new java.awt.Label("This is a label");
		f1.setTitle("hello java");
		f1.setIconImage(image.jpeg);
		f1.setVisible(true);
		java.awt.Button b1 = new java.awt.Button("test button");
		f1.setLayout(null);
		f1.add(b1);
		b1.setBounds(50,200,200,200);
	}
}