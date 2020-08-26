package bellakratchei.com.github.programa;

public class Soma {

	public static void main(String[] args) {
		
		int adicao = 0;
		
		for(int x = 0; x < args.length; x++) {
			if (args != null) {
				adicao += Integer.parseInt(args[x]);
			}
		}
		
		System.out.println("Resultado:" + adicao);

	}

}
