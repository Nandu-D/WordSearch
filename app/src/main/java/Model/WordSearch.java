package Model;

import java.util.ArrayList;
import java.util.Random;

public class WordSearch {
    private final int HORIZONTAL = 0;
    private final int VERTICAL = 1;

    char displayMatrix[][] = new char[8][12];
    int selectionMatrix[][] = new int[8][12];
    ArrayList<String> questions = new ArrayList<>();

    boolean loadQuestion() {
        for (int x = 0; x < 8; x++) {
            for (int y = 0; y < 12; y++) {
                displayMatrix[x][y] = randomChar();
            }
        }

        while (questions.size() <= 3) {
            boolean isReverse = randomBoolean();
            String word = randomWord();
            if (isReverse) {
                word = reverseWord(word);
            }
            questions.add(word);

            int randomX = randomInt(8);
            int randomY = randomInt(12);
            boolean isHorizontalOrientation = randomBoolean();

            if (isHorizontalOrientation) {
                
            } else {

            }
        }
        return false;
    }

    private String randomWord() {
        Words words = new Words();
        int randomPosition;
        String returnWord;
        do {
            randomPosition = randomInt(words.getWords().size());
            returnWord = words.getWords().get(randomPosition);
        } while (questions.contains(returnWord));
        return returnWord;
    }

    private String reverseWord(String word) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(word);
        stringBuilder = stringBuilder.reverse();
        return stringBuilder.toString();
    }

    private boolean randomBoolean() {
        Random random = new Random();
        int value = random.nextInt(2); // Get 0 or 1
        if (value == 1) {
            return true;
        } else {
            return false;
        }
    }

    private char randomChar() {
        Random random = new Random();
        String alphabets = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        char letter = alphabets.charAt(random.nextInt(alphabets.length()));
        return letter;
    }

    private int randomInt(int upperbound) {
        Random random = new Random();
        return random.nextInt(upperbound);
    }

    public char[][] getDisplayMatrix() {
        return displayMatrix;
    }

    public void setDisplayMatrix(char[][] displayMatrix) {
        this.displayMatrix = displayMatrix;
    }

    public int[][] getSelectionMatrix() {
        return selectionMatrix;
    }

    public void setSelectionMatrix(int[][] selectionMatrix) {
        this.selectionMatrix = selectionMatrix;
    }

    public ArrayList<String> getQuestions() {
        return questions;
    }

    public void setQuestions(ArrayList<String> questions) {
        this.questions = questions;
    }
}
