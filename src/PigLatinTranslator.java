public class PigLatinTranslator {
  public static Book translate(Book input) {
      Book translatedBook = new Book();
      translatedBook.setTitle(input.getTitle() + " (Translated to Pig Latin)");

      for (int i = 0; i < input.getLineCount(); i++) {
          String line = input.getLine(i);
          String translatedLine = translate(line); // Use the translate(String) method
          translatedBook.appendLine(translatedLine);
      }

      return translatedBook;
  }

  public static String translate(String input) {
    // System.out.println("Translate String: '" + input + "'");

    // Replace this code to translate a string input.
    // The input to this function could be any English string. 
    // A sentence, paragraph, or a single word. 
    // It should call translateWord at least once.
      if (input == null || input.trim().isEmpty()) {
          return "";
      }

      String[] words = input.split("\\s+");
      StringBuilder result = new StringBuilder();

      for (String word : words) {
          result.append(translateWord(word)).append(" ");
      }

      return result.toString().trim();
  }

  private static String translateWord(String input) {
      if (input == null || input.trim().isEmpty()) {
          return "";
      }

      String vowels = "aeiouAEIOU";
      char first = input.charAt(0);

      if (vowels.indexOf(first) != -1) {
          return input + "ay";
      }

      int firstVowelIndex = -1;
      for (int i = 0; i < input.length(); i++) {
          if (vowels.indexOf(input.charAt(i)) != -1) {
              firstVowelIndex = i;
              break;
          }
      }

      if (firstVowelIndex == -1) {
          return input + "ay";
      } else {
          return input.substring(firstVowelIndex) + input.substring(0, firstVowelIndex) + "ay";
      }
  }

 
}