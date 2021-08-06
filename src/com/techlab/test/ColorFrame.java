package com.techlab.test;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ColorFrame extends JFrame{
	public ColorFrame(String title) {
		super(title);
		setSize(700,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		setVisible(true);
		JButton rbtn = new JButton("Red");
		JButton ybtn = new JButton("Yellow");
		rbtn.setBounds(130,100,100,40);
		ybtn.setBounds(300,100,100,40);
		ActionListener btnListener = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Object o = e.getSource();
				if(o == rbtn) {
					getContentPane().setBackground(Color.RED);
				}else if(o == ybtn) {
					getContentPane().setBackground(Color.YELLOW);
				}
			}
		};
		rbtn.addActionListener(btnListener);
		ybtn.addActionListener(btnListener);
		add(rbtn);
		add(ybtn);
	}
}
