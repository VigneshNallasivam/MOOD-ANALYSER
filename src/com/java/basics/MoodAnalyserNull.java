package com.java.basics;

public class MoodAnalyserNull 
{
	String message;
	MoodAnalyserNull()
	{
		this.message = message;
	}
	public String analyseMood(String message) throws NullPointerException
	{
		try
		{
		if(message.isEmpty()==true)
			throw new NullPointerException("Invalid Mood");
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
		MoodAnalyserNull objx = new MoodAnalyserNull();
		System.out.println(objx.analyseMood(""));
	}

}
