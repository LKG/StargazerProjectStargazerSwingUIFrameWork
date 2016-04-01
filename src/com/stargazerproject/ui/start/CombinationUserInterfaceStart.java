package com.stargazerproject.ui.start;

import com.stargazerproject.ui.assembly.LoadingFrame;
import com.stargazerproject.ui.assembly.LoadingJProgressBar;
import com.stargazerproject.ui.assembly.LoadingProgressInfo;
import com.stargazerproject.ui.assembly.MainFrame;
import com.stargazerproject.ui.parameter.InitializationParameterList;

public class CombinationUserInterfaceStart {
	public static void main(String[] args) throws InterruptedException {
		InitializationParameterList initializationParameterListnew = new InitializationParameterList();
		initializationParameterListnew.InitializationParameterFormPackageInfoToMemory("com.stargazerproject.ui.parameter.StargazerProjectParameter");
		LoadingFrame loadingFrame = new LoadingFrame();
		loadingFrame.visualLoadingFrame();

		for (int i = 0; i < 10; i++) {
			LoadingJProgressBar.updateJProgressBar(i * 10);
			LoadingProgressInfo.updateProgressInfo("  loading " + i + " Data");
			Thread.sleep(200);
		}

		loadingFrame.unVisualLoadingFrame();
		loadingFrame.disposeLoadingFrame();

		MainFrame mainFrame = new MainFrame();
		mainFrame.VisualMainFrame();
		
		System.out.println("Stargazer System Online Now");
		System.out.println("Stargazer System Version 1.1.1");
		System.out.println("———————————————————————————————————————————————————————————————————————————————————————————————————————————————————");
	}

}
