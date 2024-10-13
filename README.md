## Exercise: Static Method Reference Challenge with Predicate

### Instructions:
Create a program that challenges you to use a static method reference with a Predicate. 

### Perform the following tasks:

1.	Create a class StringUtils with a static method:
    -	isPalindrome that checks if a given string is a palindrome.
2.	Create a method filterPalindromes that takes a List<String> and a Predicate<String> implementation. This method should filter the list based on the given predicate.
3.	In the main method:
    -	Create a list of strings.
    -	Use a static method reference to pass the isPalindrome method to filterPalindromes.
    -	Print the palindromes from the list.
