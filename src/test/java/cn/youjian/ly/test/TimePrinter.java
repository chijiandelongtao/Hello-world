package cn.youjian.ly.test;

import java.awt.*;
import java.awt.event.*;
import java.util.Date;

public class TimePrinter implements ActionListener {

	public void actionPerformed(ActionEvent event) {
		Date now = new Date();
		System.out.println("At the tone,the time is" + now);
		Toolkit.getDefaultToolkit().beep();
	}

}

