import java.util.HashMap;

public class HashMapp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        HashMap<String, String> hmap = new HashMap<String, String>();
        hmap.put("one", "Tobin");
        hmap.put("two", "Tim");
        System.out.println(hmap.get("one"));
        System.out.println(hmap.get("two"));
	}

}
