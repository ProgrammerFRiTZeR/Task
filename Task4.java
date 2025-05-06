public class Main {
    public static void main(String[] args) {
        String str = "racecar";
        boolean isPalindrome = new StringBuilder(str).reverse().toString().equalsIgnoreCase(str);
        System.out.println(isPalindrome ? "Palindrome!" : "Not a palindrome");
    }
}
