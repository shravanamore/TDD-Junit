package com.epam.TDD_Junit;

public class DeleteChar 
{
	public String deleteFirstAs(String string)
	{
		if(string.length() <= 1)
		{
			if(string.contains("A") || string.length() == 0)
				return "";
			return string;
		}
		
		StringBuffer sb = new StringBuffer(string);
		if(sb.substring(0, 2).indexOf("A") != -1)
		{
		    if(sb.substring(0, 2).equals("AA")) sb.delete(0, 2);
		    else if(sb.charAt(0)=='A') sb.deleteCharAt(0);
		    else if(sb.charAt(1)=='A') sb.deleteCharAt(1);	    
		}	
		return sb.toString();		
	}
}
