package com.stargazerproject.ui.assembly;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import com.stargazerproject.ui.parameter.GetParamentByName;

/**
 *操控头像 
 *
 *@Web https://github.com/pisual http://www.pisual.com
 *@email pisual@163.com dsnsuva@163.com dsnsuva@gmail.com
 *@author Felixerio FelixSion
 **/
public class MainFrameLogoJlabel extends JLabel {
	private static final long serialVersionUID = 5010683231088848230L;
	
	/**操控头像的位置**/
	private static final int logoLocation[] = GetParamentByName.GetParamentByKeyInSystemMemoryTransformNormallArray("Main_Frame_LogoLocation");
	
	/**单例模式**/
	private static MainFrameLogoJlabel mainFrameLogoJlabel = null;
	
	public static MainFrameLogoJlabel getInstance(ImageIcon backgroundLogo){
		if(MainFrameLogoJlabel.mainFrameLogoJlabel == null){
			MainFrameLogoJlabel.mainFrameLogoJlabel = new MainFrameLogoJlabel(backgroundLogo);
			MainFrameLogoJlabel.mainFrameLogoJlabel.setBounds(logoLocation[0], logoLocation[1], logoLocation[2], logoLocation[3]);
		}
		return MainFrameLogoJlabel.mainFrameLogoJlabel;
	}
	
	public MainFrameLogoJlabel(ImageIcon backgroundLogo) {
		super(backgroundLogo);
	}
}
