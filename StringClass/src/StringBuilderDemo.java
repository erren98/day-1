
public class StringBuilderDemo {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("IBM");
		sb.append(",Banglore");
		System.out.println(sb);
		System.out.println(sb.charAt(3));
		System.out.println(sb.indexOf("B")); //Gives the first occurance
		System.out.println(sb.lastIndexOf("B"));
		
		String str = new String("IBM,Banglore");
		String str1 = new String("IBM,Banglore");
		System.out.println(str == str1);
		System.out.println(str==sb.toString());
		//sb.append(str);
		System.out.println(sb);
		System.out.println(sb.substring(3));
	}

}
