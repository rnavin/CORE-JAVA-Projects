// Name = Rahul Navin 
// Student id = 261062889
public class EmailValidation {

	
	public static void main(String args[]) {
		String emailID = args[0];
		System.out.println("Email-ID : " + emailID);
		System.out.println(" ");
		if(isValidEmail(emailID)==true) {
			System.out.println("Is Email-ID Valid : true");
		}
		else {
			System.out.println("Is Email-ID valid : false");
		}
	}
	
	
	public static boolean isAlphanumeric(char input) {
		if((input >= 'a' && input <='z')||(input >='A' && input <='Z')||(input >='0' && input <= '9')){
			return true;
		}
		else {
			return false;
		}
		
	}
	
	public static boolean isValidPrefixChar(char input) {
		
		if(isAlphanumeric(input) == true || input =='-' || input =='_' || input == '.')
			return true;
		
		else 
			return false;
		
		
	}
	
	public static boolean isValidDomainChar(char input) {
		if (isAlphanumeric(input) == true || input=='-' || input == '.') {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static boolean exactlyOneAt(String one) 
	{
		int count = one.length()- one.replaceAll("@","").length();
		if(count == 1) 
		{
			return true;
		}
		else 
		{
			return false;
		}
			
	}
	
	public static String getPrefix(String s) 
	{
		String st[] = s.split("@");
		String prefix = st[0];
		return prefix;
	}
	
	public static String getDomain(String s) 
	{
		int i = s.indexOf("@");
		String domain = s.substring(i+1);
		return domain;
	}
	
	
/* The below is the additional method to check domain contain atleast one period(".")
   to divide domain into 2 Parts.*/ 
	public static boolean atleastOnePeriodDomain(String s)
	{
		int count = s.length() - s.replaceAll("/.", "").length();
		if(count >=1)
		{
			return true;
		}
		else 	
			return false;
	}
	
	public static boolean isValidPrefix(String prefix) {
		char arr[] = prefix.toCharArray();
		int i = prefix.length();
		char a = prefix.charAt(i-1);
		if (isAlphanumeric(arr[0]) == true && prefix.matches(".*[a-zA-Z]+.*") && isAlphanumeric(a)==true)
		{
			for(char ch: arr)
			{
				if (isValidPrefixChar(ch) == true) 
					{
						if(isValidPrefixChar(ch)==true && isAlphanumeric(ch)==false)
						{

								int j = prefix.indexOf(ch);
								char c = prefix.charAt(j+1);
								if (isAlphanumeric(c)==true)
								{}
								else
									return false;
						}
					}
					else
						return false;
			}
			return true;
		}
		else
		return false;
	}


	
	public static boolean isValidDomain(String domain) {	
        int i = domain.lastIndexOf(".");
        String firstpart = domain.substring(0,i);
        String endpart = domain.substring(i+1);
       
        if (endpart.matches("^[a-zA-Z]+$") && endpart.length() >= 2 && firstpart.matches(".*[a-zA-Z]+.*")) {
        	char arr[] = firstpart.toCharArray();
        	for(char ch: arr)
        	{
        		if (isValidDomainChar(ch)==true)
        		{
        			if ( isValidDomainChar(ch)== true && isAlphanumeric(ch) == false)
        			{
    					int j = domain.indexOf(ch);
    					char c = domain.charAt(j+1);
    					if(isAlphanumeric(c) == true)
    					{}
    					else
    						return false;
        			}
        		}
        		else
        			return false;
        	}
        	return true;
        }
        else
        	return false;
				 	
	}

	
	public static boolean isValidEmail(String email) {
		String prefix = getPrefix(email);
		String domain = getDomain(email);
		
		if(exactlyOneAt(email)== true && atleastOnePeriodDomain(domain)==true && isValidDomain(domain) == true
				&& isValidPrefix(prefix)==true)
		{
			return true;

		}			
		else
			return false;
	}
}


     
