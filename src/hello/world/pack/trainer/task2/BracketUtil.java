package hello.world.pack.trainer.task2;
import java.util.ArrayList;

/**
 * Дана строка, состоящая из скобок, а также открывающий и закрывающий символ скобок.
 * Необходимо реализовать метод, который проверяет что в строке у каждой открывающей скобки есть соответствующая ей закрывающая скобка.
 * Строка в которой закрывающая скобка идёт впереди открывающей является некорректной.
 * Например (()) - корректная строка, ()) - некорректная строка
 */
public class BracketUtil {
    public static boolean isCorrectBrackets(String input,
                                            char bracketOpenSymbol,
                                            char bracketCloseSymbol) {
        ArrayList<Character> chars = new ArrayList<Character>();
        for (int i = 0; i < input.length(); i++) {
            chars.add(input.charAt(i));
        }
        while (chars.contains(bracketOpenSymbol)) {
            chars.remove(chars.indexOf(bracketOpenSymbol));
            chars.remove(chars.indexOf(bracketCloseSymbol));
        }
        return chars.isEmpty();
    }

    private BracketUtil() {
    }

    public static void main(String[] args) {
        System.out.println("Ввод равного поличества открывающих и закрывающих скобок - "
                + BracketUtil.isCorrectBrackets("{{}}", '{', '}'));
        System.out.println("Ввод неравного поличества открывающих и закрывающих скобок - "
                + BracketUtil.isCorrectBrackets("{{}}}", '{', '}'));

    }
}
