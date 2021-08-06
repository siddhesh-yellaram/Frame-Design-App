package com.techlab.test;

import javax.swing.*;

public class FrameDesign {
	public static void main(String []args) {
		JFrame f = new JFrame();
		JButton btn = new JButton("Press Me");
		btn.setBounds(130,100,100,40);
		f.add(btn);
		f.setSize(400,500);
		f.setLayout(null);
		f.setVisible(true);
		btn.addActionListener(new GodListener());
		btn.addActionListener(new DevilListener());
	}
}
