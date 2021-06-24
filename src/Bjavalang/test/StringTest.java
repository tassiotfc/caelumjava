package Bjavalang.test;

public class StringTest {
	public static void main(String[] args) {
		String str1 = new String("string1231");
		String str2 = "string1231";
		System.out.println(str1.equals(str2)); // a implementacao do equals na classe String considera o conteudo
		
		System.out.println(str1.compareTo(str2));
		str2 = "astring";
		System.out.println(str2.compareTo(str1));
		System.out.println(str1.compareTo(str2));
		
		System.out.println(str1.toUpperCase());
		System.out.println(str1);
		System.out.println(str1.replace('1', '0'));
		System.out.println(str1);
		System.out.println(str1.charAt(0));
		System.out.println(str1.length());
		System.out.println(str1.indexOf("1"));
		System.out.println(str1.lastIndexOf("1"));
		System.out.println(str1.isEmpty());
	}
}
