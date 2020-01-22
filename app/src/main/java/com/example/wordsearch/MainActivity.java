package com.example.wordsearch;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;

import Model.WordSearch;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private MaterialTextView[][] alphabetGrid_TV = new MaterialTextView[12][8];
    private MaterialTextView wordsDisplayed_TV;
    private MaterialButton redoButton;

    char[][] displayGrid = new char[12][8];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initialiseViews();
        setUpListenersOnView();
        loadGrid();
    }

    private void loadGrid() {
        WordSearch wordSearch = new WordSearch();
        wordSearch.loadQuestion();
        displayGrid = wordSearch.getDisplayMatrix();

        //alphabetGrid_TV[0][7].setText(displayGrid[0][7]);
        /*for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 8; j++) {
                alphabetGrid_TV[i][j].setText(displayGrid[i][j]);
            }
        }*/
    }

    @Override
    public void onClick(View v) {
        int itemId = v.getId();
        switch (itemId) {
            case R.id.redo_button:

                break;
            case R.id.letter_1_1_text_view:
            case R.id.letter_1_2_text_view:
            case R.id.letter_1_3_text_view:
            case R.id.letter_1_4_text_view:
            case R.id.letter_1_5_text_view:
            case R.id.letter_1_6_text_view:
            case R.id.letter_1_7_text_view:
            case R.id.letter_1_8_text_view:

            case R.id.letter_2_1_text_view:
            case R.id.letter_2_2_text_view:
            case R.id.letter_2_3_text_view:
            case R.id.letter_2_4_text_view:
            case R.id.letter_2_5_text_view:
            case R.id.letter_2_6_text_view:
            case R.id.letter_2_7_text_view:
            case R.id.letter_2_8_text_view:

            case R.id.letter_3_1_text_view:
            case R.id.letter_3_2_text_view:
            case R.id.letter_3_3_text_view:
            case R.id.letter_3_4_text_view:
            case R.id.letter_3_5_text_view:
            case R.id.letter_3_6_text_view:
            case R.id.letter_3_7_text_view:
            case R.id.letter_3_8_text_view:

            case R.id.letter_4_1_text_view:
            case R.id.letter_4_2_text_view:
            case R.id.letter_4_3_text_view:
            case R.id.letter_4_4_text_view:
            case R.id.letter_4_5_text_view:
            case R.id.letter_4_6_text_view:
            case R.id.letter_4_7_text_view:
            case R.id.letter_4_8_text_view:

            case R.id.letter_5_1_text_view:
            case R.id.letter_5_2_text_view:
            case R.id.letter_5_3_text_view:
            case R.id.letter_5_4_text_view:
            case R.id.letter_5_5_text_view:
            case R.id.letter_5_6_text_view:
            case R.id.letter_5_7_text_view:
            case R.id.letter_5_8_text_view:

            case R.id.letter_6_1_text_view:
            case R.id.letter_6_2_text_view:
            case R.id.letter_6_3_text_view:
            case R.id.letter_6_4_text_view:
            case R.id.letter_6_5_text_view:
            case R.id.letter_6_6_text_view:
            case R.id.letter_6_7_text_view:
            case R.id.letter_6_8_text_view:

            case R.id.letter_7_1_text_view:
            case R.id.letter_7_2_text_view:
            case R.id.letter_7_3_text_view:
            case R.id.letter_7_4_text_view:
            case R.id.letter_7_5_text_view:
            case R.id.letter_7_6_text_view:
            case R.id.letter_7_7_text_view:
            case R.id.letter_7_8_text_view:

            case R.id.letter_8_1_text_view:
            case R.id.letter_8_2_text_view:
            case R.id.letter_8_3_text_view:
            case R.id.letter_8_4_text_view:
            case R.id.letter_8_5_text_view:
            case R.id.letter_8_6_text_view:
            case R.id.letter_8_7_text_view:
            case R.id.letter_8_8_text_view:

            case R.id.letter_9_1_text_view:
            case R.id.letter_9_2_text_view:
            case R.id.letter_9_3_text_view:
            case R.id.letter_9_4_text_view:
            case R.id.letter_9_5_text_view:
            case R.id.letter_9_6_text_view:
            case R.id.letter_9_7_text_view:
            case R.id.letter_9_8_text_view:

            case R.id.letter_10_1_text_view:
            case R.id.letter_10_2_text_view:
            case R.id.letter_10_3_text_view:
            case R.id.letter_10_4_text_view:
            case R.id.letter_10_5_text_view:
            case R.id.letter_10_6_text_view:
            case R.id.letter_10_7_text_view:
            case R.id.letter_10_8_text_view:

            case R.id.letter_11_1_text_view:
            case R.id.letter_11_2_text_view:
            case R.id.letter_11_3_text_view:
            case R.id.letter_11_4_text_view:
            case R.id.letter_11_5_text_view:
            case R.id.letter_11_6_text_view:
            case R.id.letter_11_7_text_view:
            case R.id.letter_11_8_text_view:

            case R.id.letter_12_1_text_view:
            case R.id.letter_12_2_text_view:
            case R.id.letter_12_3_text_view:
            case R.id.letter_12_4_text_view:
            case R.id.letter_12_5_text_view:
            case R.id.letter_12_6_text_view:
            case R.id.letter_12_7_text_view:
            case R.id.letter_12_8_text_view:
        }
    }

    private void setUpListenersOnView() {
        redoButton.setOnClickListener(this);

        for (int i = 0 ; i < alphabetGrid_TV.length; i++) {
            for (int j = 0; j < alphabetGrid_TV[i].length; j++) {
                alphabetGrid_TV[i][j].setOnClickListener(this);
            }
        }
    }

    /*private String getTag(int i, int j) {
        String tag = i + "_" + j;
    }

    private Pair<Integer, Integer> getPositionFromTag(View view) {
        String tag = String.valueOf(view.getTag());
    }

    private void onRestartButtonClick(View v) {

    }*/

    private void initialiseViews() {
        wordsDisplayed_TV = findViewById(R.id.wordsToSearchTextView);
        redoButton = findViewById(R.id.redo_button);

        /*redoButton.setOnClickListener(v -> {
            onRestartButtonClick(v);
        });
        redoButton.setOnClickListener(this::onRestartButtonClick);
        //Lambda funmctions
        redoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onRestartButtonClick(v);
            }
        });*/

        /*LinearLayout layout = findViewById(R.id.text_container);
        for (int i = 0 ; i < alphabetGrid_TV.length; i++) {
            LinearLayout lane = new LinearLayout(this);
            lane.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));
            lane.setOrientation(LinearLayout.HORIZONTAL);
            for (int j = 0; j < alphabetGrid_TV[i].length; j++) {
                MaterialTextView textView = new MaterialTextView(this);
                textView.setText("A");

                textView.setTag("Taskajkqwjr");

                lane.addView(textView);
                alphabetGrid_TV[i][j] = textView;
            }
            layout.addView(lane);
        }*/


        alphabetGrid_TV[0][0] = findViewById(R.id.letter_1_1_text_view);
        alphabetGrid_TV[0][1] = findViewById(R.id.letter_1_2_text_view);
        alphabetGrid_TV[0][2] = findViewById(R.id.letter_1_3_text_view);
        alphabetGrid_TV[0][3] = findViewById(R.id.letter_1_4_text_view);
        alphabetGrid_TV[0][4] = findViewById(R.id.letter_1_5_text_view);
        alphabetGrid_TV[0][5] = findViewById(R.id.letter_1_6_text_view);
        alphabetGrid_TV[0][6] = findViewById(R.id.letter_1_7_text_view);
        alphabetGrid_TV[0][7] = findViewById(R.id.letter_1_8_text_view);

        alphabetGrid_TV[1][0] = findViewById(R.id.letter_2_1_text_view);
        alphabetGrid_TV[1][1] = findViewById(R.id.letter_2_2_text_view);
        alphabetGrid_TV[1][2] = findViewById(R.id.letter_2_3_text_view);
        alphabetGrid_TV[1][3] = findViewById(R.id.letter_2_4_text_view);
        alphabetGrid_TV[1][4] = findViewById(R.id.letter_2_5_text_view);
        alphabetGrid_TV[1][5] = findViewById(R.id.letter_2_6_text_view);
        alphabetGrid_TV[1][6] = findViewById(R.id.letter_2_7_text_view);
        alphabetGrid_TV[1][7] = findViewById(R.id.letter_2_8_text_view);

        alphabetGrid_TV[2][0] = findViewById(R.id.letter_3_1_text_view);
        alphabetGrid_TV[2][1] = findViewById(R.id.letter_3_2_text_view);
        alphabetGrid_TV[2][2] = findViewById(R.id.letter_3_3_text_view);
        alphabetGrid_TV[2][3] = findViewById(R.id.letter_3_4_text_view);
        alphabetGrid_TV[2][4] = findViewById(R.id.letter_3_5_text_view);
        alphabetGrid_TV[2][5] = findViewById(R.id.letter_3_6_text_view);
        alphabetGrid_TV[2][6] = findViewById(R.id.letter_3_7_text_view);
        alphabetGrid_TV[2][7] = findViewById(R.id.letter_3_8_text_view);

        alphabetGrid_TV[3][0] = findViewById(R.id.letter_4_1_text_view);
        alphabetGrid_TV[3][1] = findViewById(R.id.letter_4_2_text_view);
        alphabetGrid_TV[3][2] = findViewById(R.id.letter_4_3_text_view);
        alphabetGrid_TV[3][3] = findViewById(R.id.letter_4_4_text_view);
        alphabetGrid_TV[3][4] = findViewById(R.id.letter_4_5_text_view);
        alphabetGrid_TV[3][5] = findViewById(R.id.letter_4_6_text_view);
        alphabetGrid_TV[3][6] = findViewById(R.id.letter_4_7_text_view);
        alphabetGrid_TV[3][7] = findViewById(R.id.letter_4_8_text_view);

        alphabetGrid_TV[4][0] = findViewById(R.id.letter_5_1_text_view);
        alphabetGrid_TV[4][1] = findViewById(R.id.letter_5_2_text_view);
        alphabetGrid_TV[4][2] = findViewById(R.id.letter_5_3_text_view);
        alphabetGrid_TV[4][3] = findViewById(R.id.letter_5_4_text_view);
        alphabetGrid_TV[4][4] = findViewById(R.id.letter_5_5_text_view);
        alphabetGrid_TV[4][5] = findViewById(R.id.letter_5_6_text_view);
        alphabetGrid_TV[4][6] = findViewById(R.id.letter_5_7_text_view);
        alphabetGrid_TV[4][7] = findViewById(R.id.letter_5_8_text_view);

        alphabetGrid_TV[5][0] = findViewById(R.id.letter_6_1_text_view);
        alphabetGrid_TV[5][1] = findViewById(R.id.letter_6_2_text_view);
        alphabetGrid_TV[5][2] = findViewById(R.id.letter_6_3_text_view);
        alphabetGrid_TV[5][3] = findViewById(R.id.letter_6_4_text_view);
        alphabetGrid_TV[5][4] = findViewById(R.id.letter_6_5_text_view);
        alphabetGrid_TV[5][5] = findViewById(R.id.letter_6_6_text_view);
        alphabetGrid_TV[5][6] = findViewById(R.id.letter_6_7_text_view);
        alphabetGrid_TV[5][7] = findViewById(R.id.letter_6_8_text_view);

        alphabetGrid_TV[6][0] = findViewById(R.id.letter_7_1_text_view);
        alphabetGrid_TV[6][1] = findViewById(R.id.letter_7_2_text_view);
        alphabetGrid_TV[6][2] = findViewById(R.id.letter_7_3_text_view);
        alphabetGrid_TV[6][3] = findViewById(R.id.letter_7_4_text_view);
        alphabetGrid_TV[6][4] = findViewById(R.id.letter_7_5_text_view);
        alphabetGrid_TV[6][5] = findViewById(R.id.letter_7_6_text_view);
        alphabetGrid_TV[6][6] = findViewById(R.id.letter_7_7_text_view);
        alphabetGrid_TV[6][7] = findViewById(R.id.letter_7_8_text_view);

        alphabetGrid_TV[7][0] = findViewById(R.id.letter_8_1_text_view);
        alphabetGrid_TV[7][1] = findViewById(R.id.letter_8_2_text_view);
        alphabetGrid_TV[7][2] = findViewById(R.id.letter_8_3_text_view);
        alphabetGrid_TV[7][3] = findViewById(R.id.letter_8_4_text_view);
        alphabetGrid_TV[7][4] = findViewById(R.id.letter_8_5_text_view);
        alphabetGrid_TV[7][5] = findViewById(R.id.letter_8_6_text_view);
        alphabetGrid_TV[7][6] = findViewById(R.id.letter_8_7_text_view);
        alphabetGrid_TV[7][7] = findViewById(R.id.letter_8_8_text_view);

        alphabetGrid_TV[8][0] = findViewById(R.id.letter_9_1_text_view);
        alphabetGrid_TV[8][1] = findViewById(R.id.letter_9_2_text_view);
        alphabetGrid_TV[8][2] = findViewById(R.id.letter_9_3_text_view);
        alphabetGrid_TV[8][3] = findViewById(R.id.letter_9_4_text_view);
        alphabetGrid_TV[8][4] = findViewById(R.id.letter_9_5_text_view);
        alphabetGrid_TV[8][5] = findViewById(R.id.letter_9_6_text_view);
        alphabetGrid_TV[8][6] = findViewById(R.id.letter_9_7_text_view);
        alphabetGrid_TV[8][7] = findViewById(R.id.letter_9_8_text_view);

        alphabetGrid_TV[9][0] = findViewById(R.id.letter_10_1_text_view);
        alphabetGrid_TV[9][1] = findViewById(R.id.letter_10_2_text_view);
        alphabetGrid_TV[9][2] = findViewById(R.id.letter_10_3_text_view);
        alphabetGrid_TV[9][3] = findViewById(R.id.letter_10_4_text_view);
        alphabetGrid_TV[9][4] = findViewById(R.id.letter_10_5_text_view);
        alphabetGrid_TV[9][5] = findViewById(R.id.letter_10_6_text_view);
        alphabetGrid_TV[9][6] = findViewById(R.id.letter_10_7_text_view);
        alphabetGrid_TV[9][7] = findViewById(R.id.letter_10_8_text_view);

        alphabetGrid_TV[10][0] = findViewById(R.id.letter_11_1_text_view);
        alphabetGrid_TV[10][1] = findViewById(R.id.letter_11_2_text_view);
        alphabetGrid_TV[10][2] = findViewById(R.id.letter_11_3_text_view);
        alphabetGrid_TV[10][3] = findViewById(R.id.letter_11_4_text_view);
        alphabetGrid_TV[10][4] = findViewById(R.id.letter_11_5_text_view);
        alphabetGrid_TV[10][5] = findViewById(R.id.letter_11_6_text_view);
        alphabetGrid_TV[10][6] = findViewById(R.id.letter_11_7_text_view);
        alphabetGrid_TV[10][7] = findViewById(R.id.letter_11_8_text_view);

        alphabetGrid_TV[11][0] = findViewById(R.id.letter_12_1_text_view);
        alphabetGrid_TV[11][1] = findViewById(R.id.letter_12_2_text_view);
        alphabetGrid_TV[11][2] = findViewById(R.id.letter_12_3_text_view);
        alphabetGrid_TV[11][3] = findViewById(R.id.letter_12_4_text_view);
        alphabetGrid_TV[11][4] = findViewById(R.id.letter_12_5_text_view);
        alphabetGrid_TV[11][5] = findViewById(R.id.letter_12_6_text_view);
        alphabetGrid_TV[11][6] = findViewById(R.id.letter_12_7_text_view);
        alphabetGrid_TV[11][7] = findViewById(R.id.letter_12_8_text_view);
    }
}
