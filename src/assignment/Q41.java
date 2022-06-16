package assignment;

public class Q41 {
//41.Write a Program to display names in short form. E.g. Ram Kishore Singh  -> R. k. Singh
	public static void main(String[] args) {
		
String name= "Ram Kishore Singh";
String initil= name.substring( 0,1);
String initil2=name.substring(0, 1);
String initial3= name.substring(11, 17);
System.out.println(initil+"."+initil2+"."+ initial3);
	}

}
