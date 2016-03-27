package com.stargazerproject.ui.util;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JDialog;
import javax.swing.JFrame;


/**
 * 界面UI工具包
 * 
 *@Web https://github.com/pisual http://www.pisual.com
 *@email pisual@163.com dsnsuva@163.com dsnsuva@gmail.com
 *@author Felixerio FelixSion
 */
public class UIUtil {
	/**
	 * 调整窗口居中
	 * @author felixsion
	 * **/
	public static void changeFrameToCenter(JFrame jsFrame){
		 Toolkit kit = Toolkit.getDefaultToolkit(); // 定义工具包 
	     Dimension screenSize = kit.getScreenSize(); // 获取屏幕的尺寸 
	     int screenWidth = screenSize.width/2; // 获取屏幕的宽
	     int screenHeight = screenSize.height/2; // 获取屏幕的高
	     int height = jsFrame.getHeight(); 
	     int width = jsFrame.getWidth();
	     jsFrame.setLocation(screenWidth-width/2, screenHeight-height/2);
	}
	
	/**
	 * 调整窗口居中
	 * **/
	public static void changeJDialogToCenter(JDialog jDialog){
		 Toolkit kit = Toolkit.getDefaultToolkit(); // 定义工具包 
	     Dimension screenSize = kit.getScreenSize(); // 获取屏幕的尺寸 
	     int screenWidth = screenSize.width/2; // 获取屏幕的宽
	     int screenHeight = screenSize.height/2; // 获取屏幕的高
	     int height = jDialog.getHeight(); 
	     int width = jDialog.getWidth();
	     jDialog.setLocation(screenWidth-width/2, screenHeight-height/2);
	}
}
