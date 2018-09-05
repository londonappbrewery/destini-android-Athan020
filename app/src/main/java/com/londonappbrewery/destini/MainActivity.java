package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:

    private Button mTopButton;
    private Button mBottomButton;
    private TextView mStoryTextView;

    private int storyPart;
    private int countTop;
    private int countBottom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        storyPart = 1;

        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        mStoryTextView = findViewById(R.id.storyTextView);
        mTopButton = findViewById(R.id.buttonTop);
        mBottomButton = findViewById(R.id.buttonBottom);

        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        mTopButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                countTop++;
                if(storyPart == 1){
                    mStoryTextView.setText(R.string.T3_Story);

                    mTopButton.setText(R.string.T3_Ans1);
                    mBottomButton.setText(R.string.T3_Ans2);
                }else if(storyPart == 2 && countBottom == 1) {
                    mStoryTextView.setText(R.string.T3_Story);
                    mTopButton.setText(R.string.T3_Ans1);
                    mBottomButton.setText(R.string.T3_Ans2);

                }else {
                    mStoryTextView.setText(R.string.T6_End);
                    mBottomButton.setVisibility(View.GONE);
                    mTopButton.setVisibility(View.GONE);
                }

                storyPart++;
            }
        });



        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        mBottomButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                countBottom++;
                if(storyPart == 1){
                    mStoryTextView.setText(R.string.T3_Story);

                    mTopButton.setText(R.string.T2_Ans1);
                    mBottomButton.setText(R.string.T2_Ans2);
                }else if(storyPart == 2 && countBottom == 2){
                    mStoryTextView.setText(R.string.T5_End);
                }else{
                    mStoryTextView.setText(R.string.T4_End);
                    mBottomButton.setVisibility(View.GONE);
                    mTopButton.setVisibility(View.GONE);
                }

                storyPart++;
            }
        });

    }
}
