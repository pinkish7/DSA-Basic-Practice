public class PalindromeString {

    public static boolean isPalindrome(String str) {
        if (str == null) return false;
        
        // Sanitize string (remove spaces & lowercase)
        str = str.replaceAll("\\s", "").toLowerCase();
        
        int left = 0;
        int right = str.length() - 1;
        
        while (left < right) {
            // Early exit if characters don't match
            if (str.charAt(left) != str.charAt(right)) {
                return false; 
            }
            left++;
            right--;
        }
        
        return true;
    }

    public static void main(String[] args) {
        String str = "1001";
        
        if (isPalindrome(str)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}

