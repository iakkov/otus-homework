package hello.world.pack.trainer.task1;

/**
 * Дана строка, состоящая из слов, разделенных пробелами.
 * Необходимо реализовать метод, который возвращает строку, слова в которой записаны в обратном порядке.
 * Например, для строки "test abc" необходимо получить строку "abc test".
 */
public class WordUtils {
    public static String reverseWords(String inputText) {
        // TODO
        return "";
    }

    private WordUtils() {

    }

    public static void main(String[] args) {
        System.out.println("Ввод пустой строки - " + WordUtils.reverseWords(""));
        System.out.println("Ввод одного слова - " + WordUtils.reverseWords("word"));
        System.out.println("Ввод двух слов - " + WordUtils.reverseWords("два слова"));
    }
}
