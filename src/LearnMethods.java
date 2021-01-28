import java.util.ArrayList;

public class LearnMethods {
  
	private static int returnInt(double a) {
	  return (int) a;
  }
	
	private static int returnInt(float a) {
		  return (int) a;
	  }
  
  public static void main(String args[]) {
	  double myDouble = 3.0;
	  float myFloat = 4.0f;
	  
	  System.out.println(returnInt(myDouble));
	  System.out.println(returnInt(myFloat));
	  person p = new person();
	  person pp = new person("tobin");
	  System.out.println("default constructor :" +p.name);
	  System.out.println("Other constructor :" +pp.name);
	  
	  ArrayList<person> pl = new ArrayList<person>();
	  pl.add(p);
	  pl.add(pp);
	  pl.add(new person("maria"));
	  pl.forEach((n)->{System.out.println(n.name);});
	  
  }
}
