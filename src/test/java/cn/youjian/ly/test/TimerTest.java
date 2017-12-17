package cn.youjian.ly.test;

import java.awt.*;
import java.awt.event.ActionListener;

import javax.swing.*;

public class TimerTest {

	public static void main(String[] args) {
		ActionListener listener = new TimePrinter();
		
		Timer t = new Timer(10000,listener);
		
		JOptionPane.showMessageDialog(null, "quit program");
		
		System.exit(0);
	}
}
