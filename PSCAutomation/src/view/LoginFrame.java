package view;

import java.awt.Container;
import java.awt.event.*;
import javax.swing.*;

public class LoginFrame extends JFrame{
	
	Container container;
	JLabel lUserId, lPassword;
	JTextField tUserId;
	JPasswordField tPassword;
	JButton bLogin, bRegister;
	JCheckBox cShowPassword;
	
	public LoginFrame() {
		container=getContentPane();
		lUserId=new JLabel("USERNAME");
		lPassword=new JLabel("PASSWORD");
		tUserId=new JTextField();
		tPassword=new JPasswordField();
		bLogin=new JButton("LOGIN");
		bRegister=new JButton("REGISTER");
		
		bRegister.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				callDispose();
				new RegisterFrame();
				
			}
			
		});
		cShowPassword=new JCheckBox("Show Password");
		setLayoutManager();
		setLocationAndSize();
		addComponentsToContainer();
		this.setTitle("LOGIN FORM");
		this.setVisible(true);
		this.setBounds(10, 10, 500, 600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false); // fixed size frame
	}
	
	public void setLayoutManager() {
		container.setLayout(null);
	}
	
	public void setLocationAndSize() {
		lUserId.setBounds(50, 150, 100, 30);
		lPassword.setBounds(50,250,100,30);
		tUserId.setBounds(250,150,150,30);
		tPassword.setBounds(250,250,150,30);
		cShowPassword.setBounds(250,300,150,30);
		bLogin.setBounds(100,400,100,30);
		bRegister.setBounds(200,400,100,30);
	}
	
	public void addComponentsToContainer() {
		container.add(lUserId);
		container.add(tUserId);
		container.add(lPassword);
		container.add(tPassword);
		container.add(cShowPassword);
		container.add(bLogin);
		container.add(bRegister);
	}
	
	public void callDispose() {
		this.dispose();
	}
}
