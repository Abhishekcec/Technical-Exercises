public class Palindrome
{
	public static void main(String[] args) {
		System.out.println("input: noon");
		System.out.println("output: "+  isPalindrome("noon"));
		System.out.println("input: Madam");
		System.out.println("output: "+  isPalindrome("Madam"));
		System.out.println("input: Able was I ere I saw Elba");
		System.out.println("output: "+  isPalindrome("Able was I ere I saw Elba"));
		System.out.println("input: 1881");
		System.out.println("output: "+  isPalindrome(String.valueOf(1881)));
		System.out.println("input: A man, a plan, a canal, Panama!");
		System.out.println("output: "+  isPalindrome("A man, a plan, a canal, Panama!"));
		System.out.println("");
		
		System.out.println("suitable test cases:");
		System.out.println("1.Non-Palindrome: hello");
		System.out.println("output: "+  isPalindrome("hello"));
		System.out.println("2.Empty String: ");
		System.out.println("output: "+  isPalindrome(""));
		System.out.println("3.Single Character: a");
		System.out.println("output: "+  isPalindrome("a"));
		System.out.println("4.Palindrome with Mixed Case: Madam");
		System.out.println("output: "+  isPalindrome("Madam"));
		System.out.println("5.Long Palindrome: A man a plan a canal Panama, A man a plan a canal Panama, A man a plan a canal Panama");
		System.out.println("output: "+  isPalindrome("A man a plan a canal Panama, A man a plan a canal Panama, A man a plan a canal Panama"));
		System.out.println("6.Palindrome with Special Characters: 1@#a#@$1");
		System.out.println("output: "+  isPalindrome("1@#a#@$1"));
		System.out.println("7.Non-Palindrome with Punctuation: race-car!");
		System.out.println("output: "+  isPalindrome("race-car!"));
	}
	public static boolean isPalindrome(String str) {

		String text = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
		if(text.length() == 0 || text.length() == 1){
			return true;
		}
		for(int i = 0; i<text.length() - 1; i++){
			if(text.charAt(i) != text.charAt(text.length()-(i+1))){
				return false;
			}
		}
		return true;
	}
}