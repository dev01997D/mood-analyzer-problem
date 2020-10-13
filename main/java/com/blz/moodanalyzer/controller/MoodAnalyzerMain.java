/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.blz.moodanalyzer.controller;

public class MoodAnalyzerMain {

	private String message;

	// Constructor
	public MoodAnalyzerMain() {
	}

	public MoodAnalyzerMain(String message) {
		this.message = message;
	}

	public String analyseMood() throws MoodAnalysisException {
		try {
			if (message.contains("Sad"))
				return "SAD";
			else
				return "HAPPY";
		} 
		catch (Exception e) {
			if (message == null)
				throw new MoodAnalysisException("Please provide valid mood, dont provide null in arguments",
						MoodAnalysisException.Exception_Type.NULL);
			else
				throw new MoodAnalysisException("Please provide valid mood, dont keep empty in arguments",
						MoodAnalysisException.Exception_Type.EMPTY);
		}
	}
}
