package se.lexicon;

/**
 * Hello world!
 *
 */
@SuppressWarnings("ConstantConditions")
public class App
{
    public static void main( String[] args ) {

        boolean b =  isPalindrome("ni talar bra latin");
        System.out.println(b);
    }

    public static boolean isPalindrome(String string) {
        return string
                .replaceAll(" ", "")
                .equalsIgnoreCase(
                        new StringBuilder(string.replaceAll(" ", "")).reverse().toString()
                );
    }

    public static void equalsAndEqualsIgnoreCase(){
        String name = "Federico Sanders";
        String name2 = "federico sanders";
        boolean falsy = name.equals(name2);
        boolean truthy = name.equalsIgnoreCase(name2);
        System.out.println(falsy);
        System.out.println(truthy);
    }

    public static void startWithAndEndsWith(){
        String string = "Inspelningen har startat";
        String startsWithString = "iN";
        String endsWithString = "at";

        System.out.println(
                string.toLowerCase()
                        .startsWith(
                                startsWithString.toLowerCase()
                        )
        );

        System.out.println(string.endsWith(endsWithString));
    }

    public static void upperAndLowerCase(){
        String username = "Erik.Svensson93858";
        username = username.toLowerCase();

        System.out.println(username);
    }

    public static void subStringExample(){
        String description = "I love programming in Spring Boot";
        String subString = description.substring(7, 18);
        String anotherSubString = description.substring(description.indexOf("programming"))
                .substring(0, "programming".length());

        System.out.println(anotherSubString);
    }

    public static int getLength(String string){
        return string.length();
    }

    public static void indexOfExample(){
        String name = "Fabrice Badia";
        int index = name.indexOf('r');
        System.out.println(index);
        System.out.println(name.indexOf("rice"));
        System.out.println(name.indexOf('i', 5));
        System.out.println(name.indexOf(" "));
    }

    public static char getCharFromString(String string, int index){
        return string.charAt(index);
    }


}
