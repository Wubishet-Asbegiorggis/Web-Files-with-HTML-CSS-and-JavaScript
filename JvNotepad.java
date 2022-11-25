package smJv;
import javax.swing.*;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.*;
public class JMenuBar_Menu_and_MenuItem_to_Edit_Notepad implements ActionListener{
	JMenuBar mb0;
	JMenu file,Edit,View,help;
	JMenuItem New,New_window,Open,Save,Save_as,Page_setup,Print,Exit,Cut,Copy,Paste,Select_all,Zoom_in,Zoom_out,Question;
	JTextArea txtArea0;
	JFrame fr;
	public JMenuBar_Menu_and_MenuItem_to_Edit_Notepad()
	{
		fr=new JFrame("<--------------------------------  JAVA JMENUBAR, JMENU AND JMENUITEM PROGRAMMING TO EDIT NOTEPAD !  ---------------------------------------------------------------------------------------------------------->");
		mb0=new JMenuBar();
		file=new JMenu("File");
		Edit=new JMenu("Edit");
		View =new JMenu("View");
		help=new JMenu("help");
		New=new JMenuItem("New");
		New_window=new JMenuItem("New Window");
		Open=new JMenuItem("Open");
		Save=new JMenuItem("Save");
		Save_as=new JMenuItem("Save as");
		Page_setup=new JMenuItem("Page setup");
		Print=new JMenuItem("Print");
		Exit=new JMenuItem("Exit");
		Cut=new JMenuItem("Cut");
		Copy=new JMenuItem("Copy");
		Paste=new JMenuItem("Paste");
		Select_all=new JMenuItem("Select All");
		Zoom_in=new JMenuItem("Zoom in");
		Zoom_out=new JMenuItem("Zoom out");
		Question=new JMenuItem("Questions");
		txtArea0=new JTextArea();
		Image icon = Toolkit.getDefaultToolkit().getImage("/Downloads/Notepad.png");    
		fr.setIconImage(icon);
		txtArea0.setBounds(60,100,400,400);
		file.add(New);
		file.add(New_window);
		file.add(Open);
		file.add(Save);
		file.add(Save_as);
		file.add(Page_setup);
		file.add(Print);
		file.add(Exit);
		Edit.add(Cut);
		Edit.add(Copy);
		Edit.add(Paste);
		Edit.add(Select_all);
		mb0.add(file);
		mb0.add(Edit);
		mb0.add(View);
		mb0.add(help);
		View.add(Zoom_in);
		View.add(Zoom_out);
		help.add(Question);
		fr.setJMenuBar(mb0);
		fr.add(txtArea0);
		Cut.addActionListener(this);
		Copy.addActionListener(this);
		Paste.addActionListener(this);
		Select_all.addActionListener(this);
		Exit.addActionListener(this);
		fr.setSize(500,500);
		fr.setLayout(null);
		fr.setVisible(true);
		
	}                     
	public void actionPerformed(ActionEvent ev)
	{
		if(ev.getSource()==Cut)
		{
			txtArea0.cut();
		}
		if(ev.getSource()==Copy)
		{
			txtArea0.copy();
		}
		if(ev.getSource()==Paste)
		{
			txtArea0.paste();
		}
		if(ev.getSource()==Select_all)
		{
			txtArea0.selectAll();
		}
		if(ev.getSource()==Exit)
		{
			System.exit(1);
		}
	}
	public static void main(String[] args) {
		JMenuBar_Menu_and_MenuItem_to_Edit_Notepad Obj=new JMenuBar_Menu_and_MenuItem_to_Edit_Notepad();
	}
}