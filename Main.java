import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main {

  public static void main(String[] args) {

    List<String> list = List.of("Abba", "Berta", "Bob", "Cathrine", "Anna", "Romeo");

    System.out.println("filterPalindromes:");
    System.out.println("--------------------------");
    filterPalindromes(list, StringUtils::isPalindrome).forEach(System.out::println);
    System.out.println();

    System.out.println("filterPalindromesRemoveIf:");
    System.out.println("--------------------------");
    filterPalindromesRemoveIf(list, StringUtils::isPalindrome).forEach(System.out::println);
    System.out.println();

    System.out.println("filterPalindromesStreams:");
    System.out.println("--------------------------");
    filterPalindromesStreams(list, StringUtils::isPalindrome).forEach(System.out::println);
    System.out.println();



  }

  public static List<String> filterPalindromes(List<String> strings,
                                                Predicate<String> predicate) {
    List<String> filteredList = new ArrayList<>();
    for (var string : strings) {
      if (predicate.test(string)) {
        filteredList.add(string);
      }
    }
    return filteredList;
  }

  public static List<String> filterPalindromesRemoveIf(List<String> strings,
                                               Predicate<String> predicate) {
    List<String> filteredList = new ArrayList<>(strings);
    filteredList.removeIf(s -> !predicate.test(s));
    return filteredList;
  }

  public static List<String> filterPalindromesStreams(List<String> strings,
    Predicate<String> predicate) {

    return strings.stream()
      .filter(predicate)
      .toList();
  }
}
