package com.java.basics;
class MoodAnalyserTest 
{
	String message;
	MoodAnalyserTest()
	{
		this.message = message;
	}
	public String analyseMood(String message) throws NullPointerException
	{
		try
		{
		if(message.length()==0)
			throw new NullPointerException("Enter Proper Message");
		if(message.contains("SAD"))
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
			if(message.length()>0)
				System.out.print("Proper Is Given : ");
		}
	}
	
	public static void main(String[] args)
	{
		MoodAnalyserTest objx = new MoodAnalyserTest();
		System.out.println(objx.analyseMood(""));
		System.out.println(objx.analyseMood("HAPPY"));
	}
}
