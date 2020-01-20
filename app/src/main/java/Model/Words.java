package Model;

import java.util.ArrayList;
import java.util.Arrays;

public class Words {
    private ArrayList<String> words = new ArrayList<>();

    Words() {
        setWords();
    }

    private void setWords() {
        String someWords[] = {"KIND","GOOD","FLOWER","FLOUR","BUS","BOOK","COFFEE","JOB","CAREER","EXCEPTIONAL",
                "EXCELLENT","MARVELLOUS","GIGANTIC","WINTER","SNOW","BEACH","WATERFALL","HOUSE","HOME","NUMBER","COMPUTER",
                "LAPTOP","MOBILE","PHONE","PRINTER","OVEN","BLENDER","RESTAURANT","HOTEL","POOL","SWIM","CLUB","CHICKEN",
                "COW","DOG", "CAT"};
        words.addAll(Arrays.asList(someWords));
    }

    public ArrayList<String> getWords() {
        return words;
    }

}
