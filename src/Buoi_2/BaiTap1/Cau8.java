package Buoi_2.BaiTap1;

public class Cau8 {
public static void to_lower(char[] s)
	{
	    for (int i = 0; s[i] != '\0'; i++)
	    {
	        if (s[i] >= 'A' && s[i] <= 'Z')
	        {
	            s[i] = (char) (s[i] + 32);
	        }
	    }
	}
	 
public static void to_upper(char s[])
	{
	    for (int i = 0; s[i] != '\0'; i++)
	    {
	        if (s[i] >= 'a' && s[i] <= 'z')
	        {
	            s[i] = (char) (s[i] - 32);
	        }
	    }
	}
	 
public static void to_title(char str[])
	{
	    for (int i = 0; str[i] != '\0'; i++)
	    {
	        if (str[i] >= 'A' && str[i] <= 'Z') str[i] += 32;
	        if (str[i - 1] == ' ' || i == 0)
	        {
	            if (str[i] >= 'a' && str[i] <= 'z')
	                str[i] = (char) (str[i] - 32);
	        }
	    }
	}
	 
public static void main(String[] args) {
	
}
}
