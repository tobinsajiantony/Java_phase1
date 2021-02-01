import javax.management.loading.PrivateClassLoader;

public class Strings {
  public static void main(String args[]) {
	  String myString = "Tobin";
	  
	  System.out.println(myString + "is a good person");
	  
	  System.out.println(myString);
	  
	  StringBuffer sb = new StringBuffer(myString);
	  StringBuilder sd = new StringBuilder(myString);
	  
	  sb.append("is a good person");
	  sd.append("is a bad person");
	  
	  for(int i = 0; i<=10; i++) {
		  sb.append(i);
	  }
	  
	  System.out.println(sb);
	  System.out.println(sd);
	  
  }
}
