import java.lang.*;

public class PigLatinTranslator
{
  public static Book translate(Book input)
  {
    Book translatedBook = new Book();

    // Add code here to populate translatedBook with a translation of the input book.
    // Curent do-nothing code will return an empty book.

    return translatedBook;
  }

  public static String translate(String input)
  {
    // System.out.println("Translate String: '" + input + "'");

    // Replace this code to translate a string input.
    // The input to this function could be any English string. 
    // A sentence, paragraph, or a single word. 
    // It should call translateWord at least once.
    String result = translateWord(input);

    return result;
  }

  private static String translateWord(String input)
  {
    // System.out.println("translateWord: '" + input + "'");

    // Replace this code to correctly translate a single word.
    // Start here first!
    String secondWord = input.substring(1,2);
    int restofWord = input.length();
    String checkSpace = input.substring(0,1);
    if (input.equals(null)) {
      System.out.println("translateWord: '" + null + "'");
    }
    else if (secondWord.equals("a") || secondWord.equals("i") || secondWord.equals("o") || secondWord.equals("e") || secondWord.equals("u")) {
      input = input.substring(1, restofWord) + input.substring(0,1) + "ay";
    } else {
      input = input.substring(2, restofWord) + input.substring(0,2) + "ay";
    }
    String result = input;
    System.out.println("translateWord: '" + input + "'");
    return result;
  }
    String result = input;
    
    return result;
  }

  // Add additonal private methods here.
  // For example, I had one like this:
  // private static String capitalizeFirstLetter(String input)

}