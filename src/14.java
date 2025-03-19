// Write a function to check if a given string is a palindrome
public static boolean isPalindrome(String str) {
    // Check if the string is null or has length 0
    if (str == null || str.length() == 0) {
        return false;
    }

    // Convert the string to lowercase
    str = str.toLowerCase();

    // Check if the first and last characters are the same
    if (str.charAt(0) != str.charAt(str.length() - 1)) {
        return false;
    }

    // Check if the string is a palindrome for the substring from the second character to the second-last character
    int len = str.length();
    for (int i = 0; i < len / 2; i++) {
        if (str.charAt(i) != str.charAt(len - i - 1)) {
            return false;
        }
    }

    // If the string is not a palindrome, return false
    return true;
}
