package Model;

import java.util.ArrayList;
import java.util.Random;

public class WordSearch {
    private final int HORIZONTAL = 0;
    private final int VERTICAL = 1;

    char displayMatrix[][] = new char[12][8];
    int selectionMatrix[][] = new int[12][8];//Using it for building grid and for selection process
    ArrayList<String> questions = new ArrayList<>();

    public WordSearch() {
        for (int x = 0; x < 12; x++) {
            for (int y = 0; y < 8; y++) {
                displayMatrix[x][y] = 0;
                selectionMatrix[x][y] = 0;
            }
        }
    }

    public void loadQuestion() {
        for (int x = 0; x < 12; x++) {
            for (int y = 0; y < 8; y++) {
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

            int randomColumn = randomInt(8);
            int randomRow = randomInt(12);
            boolean isHorizontalOrientation = randomBoolean();
            String question = questions.get(questions.size() - 1);
            int questionLength = question.length();

            if (isHorizontalOrientation) {
                if (questionLength <= 7 - randomColumn + 1) {
                    for (int i = randomColumn; i < questionLength; i++) {
                        if (selectionMatrix[randomRow][i] == 0 || displayMatrix[randomRow][i] == question.charAt(i - randomColumn)) {
                            //If no overlap or if overlapping position has same character
                            displayMatrix[randomRow][i] = question.charAt(i - randomColumn);
                            selectionMatrix[randomRow][i] = 1;
                        } else {
                            questions.remove(questions.size() - 1);
                            continue;
                        }
                    }
                } else if (randomColumn - questionLength + 1 >= 0 &&
                        questionLength <= 7 - (randomColumn - questionLength + 1) + 1) {

                    randomColumn = randomColumn - questionLength + 1;
                    for (int i = randomColumn; i < questionLength; i++) {
                        if (selectionMatrix[randomRow][i] == 0 || displayMatrix[randomRow][i] == question.charAt(i - randomColumn)) {
                            //If no overlap or if overlapping position has same character
                            displayMatrix[randomRow][i] = question.charAt(i - randomColumn);
                            selectionMatrix[randomRow][i] = 1;
                        } else {
                            questions.remove(questions.size() - 1);
                            continue;
                        }
                    }
                } else {
                    questions.remove(questions.size() - 1);
                    continue;
                }
            } else { // Vertical orientation
                if (questionLength <= 11 - randomRow + 1) {
                    for (int i = randomRow; i < questionLength; i++) {
                        if (selectionMatrix[i][randomColumn] == 0 || displayMatrix[i][randomColumn] == question.charAt(i - randomRow)) {
                            //If no overlap or if overlapping position has same character
                            displayMatrix[i][randomColumn] = question.charAt(i - randomRow);
                            selectionMatrix[i][randomColumn] = 1;
                        } else {
                            questions.remove(questions.size() - 1);
                            continue;
                        }
                    }
                } else if (randomRow - questionLength + 1 >= 0 &&
                        questionLength <= 7 - (randomRow - questionLength + 1) + 1) {

                    randomRow = randomRow - questionLength + 1;
                    for (int i = randomRow; i < questionLength; i++) {
                        if (selectionMatrix[i][randomColumn] == 0 || displayMatrix[i][randomColumn] == question.charAt(i - randomRow)) {
                            //If no overlap or if overlapping position has same character
                            displayMatrix[i][randomColumn] = question.charAt(i - randomRow);
                            selectionMatrix[i][randomColumn] = 1;
                        } else {
                            questions.remove(questions.size() - 1);
                            continue;
                        }
                    }
                } else {
                    questions.remove(questions.size() - 1);
                    continue;
                }
            }
        }
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
