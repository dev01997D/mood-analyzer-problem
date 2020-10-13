/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.blz.moodanalyzer.tester;

import org.junit.Test;

import com.blz.moodanalyzer.controller.MoodAnalysisException;
import com.blz.moodanalyzer.controller.MoodAnalyzerMain;

import static org.junit.Assert.*;

import org.junit.Assert;

public class MoodAnalyzerTest {
	@Test
	public void given_NullMood_Should_Throw_MoodAnalysisException() {
		MoodAnalyzerMain moodAnalyser = new MoodAnalyzerMain(null);
		String mood;
		try {
			mood = moodAnalyser.analyseMood();
		} catch (MoodAnalysisException e) {
			Assert.assertSame(MoodAnalysisException.Exception_Type.NULL, e.type);
		}
	}
	@Test
	public void given_EmptyMood_Should_Throw_MoodAnalysisException() {
		MoodAnalyzerMain moodAnalyser = new MoodAnalyzerMain("");
		String mood;
		try {
			mood = moodAnalyser.analyseMood();
		} catch (MoodAnalysisException e) {
			Assert.assertSame(MoodAnalysisException.Exception_Type.EMPTY, e.type);
		}
	}
}
