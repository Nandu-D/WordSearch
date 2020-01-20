package com.example.wordsearch;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private MaterialTextView[][] alphabetGrid_TV = new MaterialTextView[8][12];
    private MaterialTextView wordsDisplayed_TV;
    private MaterialButton restartButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initialiseViews();
        setUpListenersOnView();
    }

    @Override
    public void onClick(View v) {

    }

    private void setUpListenersOnView() {


        alphabetGrid_TV[0][0].setOnClickListener(this);
        alphabetGrid_TV[1][0].setOnClickListener(this);
        alphabetGrid_TV[2][0].setOnClickListener(this);
        alphabetGrid_TV[3][0].setOnClickListener(this);
        alphabetGrid_TV[4][0].setOnClickListener(this);
        alphabetGrid_TV[5][0].setOnClickListener(this);
        alphabetGrid_TV[6][0].setOnClickListener(this);
        alphabetGrid_TV[7][0].setOnClickListener(this);

        alphabetGrid_TV[0][1].setOnClickListener(this);
        alphabetGrid_TV[1][1].setOnClickListener(this);
        alphabetGrid_TV[2][1].setOnClickListener(this);
        alphabetGrid_TV[3][1].setOnClickListener(this);
        alphabetGrid_TV[4][1].setOnClickListener(this);
        alphabetGrid_TV[5][1].setOnClickListener(this);
        alphabetGrid_TV[6][1].setOnClickListener(this);
        alphabetGrid_TV[7][1].setOnClickListener(this);

        alphabetGrid_TV[0][2].setOnClickListener(this);
        alphabetGrid_TV[1][2].setOnClickListener(this);
        alphabetGrid_TV[2][2].setOnClickListener(this);
        alphabetGrid_TV[3][2].setOnClickListener(this);
        alphabetGrid_TV[4][2].setOnClickListener(this);
        alphabetGrid_TV[5][2].setOnClickListener(this);
        alphabetGrid_TV[6][2].setOnClickListener(this);
        alphabetGrid_TV[7][2].setOnClickListener(this);

        alphabetGrid_TV[0][3].setOnClickListener(this);
        alphabetGrid_TV[1][3].setOnClickListener(this);
        alphabetGrid_TV[2][3].setOnClickListener(this);
        alphabetGrid_TV[3][3].setOnClickListener(this);
        alphabetGrid_TV[4][3].setOnClickListener(this);
        alphabetGrid_TV[5][3].setOnClickListener(this);
        alphabetGrid_TV[6][3].setOnClickListener(this);
        alphabetGrid_TV[7][3].setOnClickListener(this);

        alphabetGrid_TV[0][4].setOnClickListener(this);
        alphabetGrid_TV[1][4].setOnClickListener(this);
        alphabetGrid_TV[2][4].setOnClickListener(this);
        alphabetGrid_TV[3][4].setOnClickListener(this);
        alphabetGrid_TV[4][4].setOnClickListener(this);
        alphabetGrid_TV[5][4].setOnClickListener(this);
        alphabetGrid_TV[6][4].setOnClickListener(this);
        alphabetGrid_TV[7][4].setOnClickListener(this);

        alphabetGrid_TV[0][5].setOnClickListener(this);
        alphabetGrid_TV[1][5].setOnClickListener(this);
        alphabetGrid_TV[2][5].setOnClickListener(this);
        alphabetGrid_TV[3][5].setOnClickListener(this);
        alphabetGrid_TV[4][5].setOnClickListener(this);
        alphabetGrid_TV[5][5].setOnClickListener(this);
        alphabetGrid_TV[6][5].setOnClickListener(this);
        alphabetGrid_TV[7][5].setOnClickListener(this);

        alphabetGrid_TV[0][6].setOnClickListener(this);
        alphabetGrid_TV[1][6].setOnClickListener(this);
        alphabetGrid_TV[2][6].setOnClickListener(this);
        alphabetGrid_TV[3][6].setOnClickListener(this);
        alphabetGrid_TV[4][6].setOnClickListener(this);
        alphabetGrid_TV[5][6].setOnClickListener(this);
        alphabetGrid_TV[6][6].setOnClickListener(this);
        alphabetGrid_TV[7][6].setOnClickListener(this);

        alphabetGrid_TV[0][7].setOnClickListener(this);
        alphabetGrid_TV[1][7].setOnClickListener(this);
        alphabetGrid_TV[2][7].setOnClickListener(this);
        alphabetGrid_TV[3][7].setOnClickListener(this);
        alphabetGrid_TV[4][7].setOnClickListener(this);
        alphabetGrid_TV[5][7].setOnClickListener(this);
        alphabetGrid_TV[6][7].setOnClickListener(this);
        alphabetGrid_TV[7][7].setOnClickListener(this);

        alphabetGrid_TV[0][8].setOnClickListener(this);
        alphabetGrid_TV[1][8].setOnClickListener(this);
        alphabetGrid_TV[2][8].setOnClickListener(this);
        alphabetGrid_TV[3][8].setOnClickListener(this);
        alphabetGrid_TV[4][8].setOnClickListener(this);
        alphabetGrid_TV[5][8].setOnClickListener(this);
        alphabetGrid_TV[6][8].setOnClickListener(this);
        alphabetGrid_TV[7][8].setOnClickListener(this);

        alphabetGrid_TV[0][9].setOnClickListener(this);
        alphabetGrid_TV[1][9].setOnClickListener(this);
        alphabetGrid_TV[2][9].setOnClickListener(this);
        alphabetGrid_TV[3][9].setOnClickListener(this);
        alphabetGrid_TV[4][9].setOnClickListener(this);
        alphabetGrid_TV[5][9].setOnClickListener(this);
        alphabetGrid_TV[6][9].setOnClickListener(this);
        alphabetGrid_TV[7][9].setOnClickListener(this);

        alphabetGrid_TV[0][10].setOnClickListener(this);
        alphabetGrid_TV[1][10].setOnClickListener(this);
        alphabetGrid_TV[2][10].setOnClickListener(this);
        alphabetGrid_TV[3][10].setOnClickListener(this);
        alphabetGrid_TV[4][10].setOnClickListener(this);
        alphabetGrid_TV[5][10].setOnClickListener(this);
        alphabetGrid_TV[6][10].setOnClickListener(this);
        alphabetGrid_TV[7][10].setOnClickListener(this);

        alphabetGrid_TV[0][11].setOnClickListener(this);
        alphabetGrid_TV[1][11].setOnClickListener(this);
        alphabetGrid_TV[2][11].setOnClickListener(this);
        alphabetGrid_TV[3][11].setOnClickListener(this);
        alphabetGrid_TV[4][11].setOnClickListener(this);
        alphabetGrid_TV[5][11].setOnClickListener(this);
        alphabetGrid_TV[6][11].setOnClickListener(this);
        alphabetGrid_TV[7][11].setOnClickListener(this);
    }

    private void initialiseViews() {
        wordsDisplayed_TV = findViewById(R.id.wordsToSearchTextView);
        restartButton = findViewById(R.id.redo_button);

        alphabetGrid_TV[0][0] = findViewById(R.id.letter_1_1_text_view);
        alphabetGrid_TV[1][0] = findViewById(R.id.letter_1_2_text_view);
        alphabetGrid_TV[2][0] = findViewById(R.id.letter_1_3_text_view);
        alphabetGrid_TV[3][0] = findViewById(R.id.letter_1_4_text_view);
        alphabetGrid_TV[4][0] = findViewById(R.id.letter_1_5_text_view);
        alphabetGrid_TV[5][0] = findViewById(R.id.letter_1_6_text_view);
        alphabetGrid_TV[6][0] = findViewById(R.id.letter_1_7_text_view);
        alphabetGrid_TV[7][0] = findViewById(R.id.letter_1_8_text_view);

        alphabetGrid_TV[0][1] = findViewById(R.id.letter_2_1_text_view);
        alphabetGrid_TV[1][1] = findViewById(R.id.letter_2_2_text_view);
        alphabetGrid_TV[2][1] = findViewById(R.id.letter_2_3_text_view);
        alphabetGrid_TV[3][1] = findViewById(R.id.letter_2_4_text_view);
        alphabetGrid_TV[4][1] = findViewById(R.id.letter_2_5_text_view);
        alphabetGrid_TV[5][1] = findViewById(R.id.letter_2_6_text_view);
        alphabetGrid_TV[6][1] = findViewById(R.id.letter_2_7_text_view);
        alphabetGrid_TV[7][1] = findViewById(R.id.letter_2_8_text_view);

        alphabetGrid_TV[0][2] = findViewById(R.id.letter_3_1_text_view);
        alphabetGrid_TV[1][2] = findViewById(R.id.letter_3_2_text_view);
        alphabetGrid_TV[2][2] = findViewById(R.id.letter_3_3_text_view);
        alphabetGrid_TV[3][2] = findViewById(R.id.letter_3_4_text_view);
        alphabetGrid_TV[4][2] = findViewById(R.id.letter_3_5_text_view);
        alphabetGrid_TV[5][2] = findViewById(R.id.letter_3_6_text_view);
        alphabetGrid_TV[6][2] = findViewById(R.id.letter_3_7_text_view);
        alphabetGrid_TV[7][2] = findViewById(R.id.letter_3_8_text_view);

        alphabetGrid_TV[0][3] = findViewById(R.id.letter_4_1_text_view);
        alphabetGrid_TV[1][3] = findViewById(R.id.letter_4_2_text_view);
        alphabetGrid_TV[2][3] = findViewById(R.id.letter_4_3_text_view);
        alphabetGrid_TV[3][3] = findViewById(R.id.letter_4_4_text_view);
        alphabetGrid_TV[4][3] = findViewById(R.id.letter_4_5_text_view);
        alphabetGrid_TV[5][3] = findViewById(R.id.letter_4_6_text_view);
        alphabetGrid_TV[6][3] = findViewById(R.id.letter_4_7_text_view);
        alphabetGrid_TV[7][3] = findViewById(R.id.letter_4_8_text_view);

        alphabetGrid_TV[0][4] = findViewById(R.id.letter_5_1_text_view);
        alphabetGrid_TV[1][4] = findViewById(R.id.letter_5_2_text_view);
        alphabetGrid_TV[2][4] = findViewById(R.id.letter_5_3_text_view);
        alphabetGrid_TV[3][4] = findViewById(R.id.letter_5_4_text_view);
        alphabetGrid_TV[4][4] = findViewById(R.id.letter_5_5_text_view);
        alphabetGrid_TV[5][4] = findViewById(R.id.letter_5_6_text_view);
        alphabetGrid_TV[6][4] = findViewById(R.id.letter_5_7_text_view);
        alphabetGrid_TV[7][4] = findViewById(R.id.letter_5_8_text_view);

        alphabetGrid_TV[0][5] = findViewById(R.id.letter_6_1_text_view);
        alphabetGrid_TV[1][5] = findViewById(R.id.letter_6_2_text_view);
        alphabetGrid_TV[2][5] = findViewById(R.id.letter_6_3_text_view);
        alphabetGrid_TV[3][5] = findViewById(R.id.letter_6_4_text_view);
        alphabetGrid_TV[4][5] = findViewById(R.id.letter_6_5_text_view);
        alphabetGrid_TV[5][5] = findViewById(R.id.letter_6_6_text_view);
        alphabetGrid_TV[6][5] = findViewById(R.id.letter_6_7_text_view);
        alphabetGrid_TV[7][5] = findViewById(R.id.letter_6_8_text_view);

        alphabetGrid_TV[0][6] = findViewById(R.id.letter_7_1_text_view);
        alphabetGrid_TV[1][6] = findViewById(R.id.letter_7_2_text_view);
        alphabetGrid_TV[2][6] = findViewById(R.id.letter_7_3_text_view);
        alphabetGrid_TV[3][6] = findViewById(R.id.letter_7_4_text_view);
        alphabetGrid_TV[4][6] = findViewById(R.id.letter_7_5_text_view);
        alphabetGrid_TV[5][6] = findViewById(R.id.letter_7_6_text_view);
        alphabetGrid_TV[6][6] = findViewById(R.id.letter_7_7_text_view);
        alphabetGrid_TV[7][6] = findViewById(R.id.letter_7_8_text_view);

        alphabetGrid_TV[0][7] = findViewById(R.id.letter_8_1_text_view);
        alphabetGrid_TV[1][7] = findViewById(R.id.letter_8_2_text_view);
        alphabetGrid_TV[2][7] = findViewById(R.id.letter_8_3_text_view);
        alphabetGrid_TV[3][7] = findViewById(R.id.letter_8_4_text_view);
        alphabetGrid_TV[4][7] = findViewById(R.id.letter_8_5_text_view);
        alphabetGrid_TV[5][7] = findViewById(R.id.letter_8_6_text_view);
        alphabetGrid_TV[6][7] = findViewById(R.id.letter_8_7_text_view);
        alphabetGrid_TV[7][7] = findViewById(R.id.letter_8_8_text_view);

        alphabetGrid_TV[0][8] = findViewById(R.id.letter_9_1_text_view);
        alphabetGrid_TV[1][8] = findViewById(R.id.letter_9_2_text_view);
        alphabetGrid_TV[2][8] = findViewById(R.id.letter_9_3_text_view);
        alphabetGrid_TV[3][8] = findViewById(R.id.letter_9_4_text_view);
        alphabetGrid_TV[4][8] = findViewById(R.id.letter_9_5_text_view);
        alphabetGrid_TV[5][8] = findViewById(R.id.letter_9_6_text_view);
        alphabetGrid_TV[6][8] = findViewById(R.id.letter_9_7_text_view);
        alphabetGrid_TV[7][8] = findViewById(R.id.letter_9_8_text_view);

        alphabetGrid_TV[0][9] = findViewById(R.id.letter_10_1_text_view);
        alphabetGrid_TV[1][9] = findViewById(R.id.letter_10_2_text_view);
        alphabetGrid_TV[2][9] = findViewById(R.id.letter_10_3_text_view);
        alphabetGrid_TV[3][9] = findViewById(R.id.letter_10_4_text_view);
        alphabetGrid_TV[4][9] = findViewById(R.id.letter_10_5_text_view);
        alphabetGrid_TV[5][9] = findViewById(R.id.letter_10_6_text_view);
        alphabetGrid_TV[6][9] = findViewById(R.id.letter_10_7_text_view);
        alphabetGrid_TV[7][9] = findViewById(R.id.letter_10_8_text_view);

        alphabetGrid_TV[0][10] = findViewById(R.id.letter_11_1_text_view);
        alphabetGrid_TV[1][10] = findViewById(R.id.letter_11_2_text_view);
        alphabetGrid_TV[2][10] = findViewById(R.id.letter_11_3_text_view);
        alphabetGrid_TV[3][10] = findViewById(R.id.letter_11_4_text_view);
        alphabetGrid_TV[4][10] = findViewById(R.id.letter_11_5_text_view);
        alphabetGrid_TV[5][10] = findViewById(R.id.letter_11_6_text_view);
        alphabetGrid_TV[6][10] = findViewById(R.id.letter_11_7_text_view);
        alphabetGrid_TV[7][10] = findViewById(R.id.letter_11_8_text_view);

        alphabetGrid_TV[0][11] = findViewById(R.id.letter_12_1_text_view);
        alphabetGrid_TV[1][11] = findViewById(R.id.letter_12_2_text_view);
        alphabetGrid_TV[2][11] = findViewById(R.id.letter_12_3_text_view);
        alphabetGrid_TV[3][11] = findViewById(R.id.letter_12_4_text_view);
        alphabetGrid_TV[4][11] = findViewById(R.id.letter_12_5_text_view);
        alphabetGrid_TV[5][11] = findViewById(R.id.letter_12_6_text_view);
        alphabetGrid_TV[6][11] = findViewById(R.id.letter_12_7_text_view);
        alphabetGrid_TV[7][11] = findViewById(R.id.letter_12_8_text_view);
    }
}
