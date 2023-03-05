public class Start {

	public static void main(String[] args) {
		
		
		String forward="Este texto está al derecho";
		String backwards;
		StringBuilder sb= new StringBuilder(forward.length());
		
		for(int i=forward.length()-1; i>=0; i--) {
			sb.append(forward.charAt(i));			
		}
		
		backwards= sb.toString();
		System.out.println(backwards);
		
	}

}
