package se.softhouse.uiautomator;

import java.util.Hashtable;
import java.util.Map;

import com.android.ddmlib.testrunner.ITestRunListener;
import com.android.ddmlib.testrunner.TestIdentifier;

import groovy.xml.MarkupBuilder;

public class OutputParser implements ITestRunListener {
	private String testSuite;
	private MarkupBuilder writer;
	
	private Hashtable<TestIdentifier, Long> testTimes;
	
	public OutputParser(String testSuite, MarkupBuilder writer) {
		this.testSuite = testSuite;
		this.writer = writer;
		
		testTimes = new Hashtable<TestIdentifier, Long>();
	}

	@Override
	public void testEnded(TestIdentifier arg0, Map<String, String> arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void testFailed(TestFailure arg0, TestIdentifier arg1, String arg2) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void testRunEnded(long arg0, Map<String, String> arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void testRunFailed(String arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void testRunStarted(String arg0, int arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void testRunStopped(long arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void testStarted(TestIdentifier arg0) {
		testTimes.put(arg0, System.currentTimeMillis());
	}
}
