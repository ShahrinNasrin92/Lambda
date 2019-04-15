package Generic;

public class AppGeneric 
{
    public static void main( String[] args )
    {
    	
    	//GenericString
    	  	Generic<String> reverse=(str)->
    	{
    		String result="";
    		for(int i= str.length()-1;i>=0;i--)
    		{
    			result+=str.charAt(i);
    		}
    		return result;
    	};
    	
    	Generic<Integer> factorial =n ->
    	{
    		int fac=1;
    		for(int i=1;i<=n;i++)
    		{
    			fac= i*fac;
    		}
			return fac;
    		
    		
    	};
   
    System.out.println(reverse.calculation("Ana "));
    System.out.println(factorial.calculation(5));
    	}
    }
 
    	
//    	Test reverseStr=(str) ->
//    	{
//    		String result="";
//    		for(int i= str.length()-1;i>=0;i--)
//    		{
//    			result+=str.charAt(i);
//    		}
//    		return result;
//    	};
//   
//    System.out.println(reverseStr.MyString("Lambda abc"));
 
