package com.java.basics;

public class MoodAnalyserRefactor 
{
	String message;
	MoodAnalyserRefactor()
	{
		this.message = message;
	}
	public String analyseMood(String message) throws NullPointerException
	{
		try
		{
		if(message.length()==0)
			throw new NullPointerException("Enter Proper Message");
		if(message.contains("Iam in Sad Mood"))
			return "SAD";
		else
			return "HAPPY";
		}
		catch(NullPointerException e)
		{
			return e.getMessage();
		}
		finally
		{
			if(message.contains("Iam in Any Mood"))
				System.out.println("HAPPY");
		}
		
	}
	
	public static void main(String[] args)
	{
		MoodAnalyserRefactor objx = new MoodAnalyserRefactor();
		System.out.println(objx.analyseMood(""));
		System.out.println(objx.analyseMood("Iam in Sad Mood"));
		System.out.println(objx.analyseMood("Iam in Any Mood"));
	}

}
