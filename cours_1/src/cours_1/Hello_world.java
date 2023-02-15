package cours_1;

public class Hello_world {
	
	public static String bonjour(String s) {
		String res = "";
		if (s == null || s.equals(""))
			res = "Bonjour, ami.";
		else
			if (s.toUpperCase().equals(s))
				res = "BONJOUR " + s + " !";
			else
				res = "Bonjour, " + s + ".";
		return res;
	}
}
