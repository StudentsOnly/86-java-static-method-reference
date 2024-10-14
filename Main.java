import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
public class Main {

        public static List<String> filterPalindromes(List<String> strings, Predicate<String> predicate) {
        List<String> palindromes = new ArrayList<>();
        for (String s : strings) {
            if (predicate.test(s)) {
                palindromes.add(s);
            }
        }
        return palindromes;
    }

    public static void main(String[] args) {
        List<String> words = List.of("madam", "apple", "rotor", "java", "civic", "hello", "noon");

        List<String> palindromes = filterPalindromes(words, StringUtils::isPalindrome);

        System.out.println("Palindromes: ");
        palindromes.forEach(System.out::println);


    }
}