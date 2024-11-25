package hello.world.pack.lesson16;

import java.util.ArrayList;

public class Methods {
    public static ArrayList<Integer> makeSequence(int min, int max) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = min; i < max; i++) {
            list.add(i);
        }
        return list;
    }
}
