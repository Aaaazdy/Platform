package com.example.platform;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.ValueAnimator;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.jiang.android.pbutton.CProgressButton;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CProgressButton.initStatusString(new String[]{"generate", "pause", "complete", "error", "delete"});
    }
//    public  void button1()
//    {
//        final CProgressButton progressButton = (CProgressButton) findViewById(R.id.btn);
//
//        progressButton.setOnClickListener(new View.OnClickListener()
//        {
//            @Override
//            public void onClick(View v)
//            {
//                ValueAnimator valueAnimator = ValueAnimator.ofInt(0, 100);
//                if (progressButton.getState() == CProgressButton.STATE.NORMAL)
//                {
//                    progressButton.startDownLoad();
//                    valueAnimator.setDuration(5000);
//                    valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener()
//                    {
//                        @Override
//                        public void onAnimationUpdate(ValueAnimator animation)
//                        {
//                            int value = (int) animation.getAnimatedValue();
//                            if (value == 100)
//                            {
//                                progressButton.normal(2);
//                            }
//                            progressButton.download(value);
//                        }
//                    });
//                    valueAnimator.start();
//                }
//                else
//                {
//                    valueAnimator.cancel();
//                    progressButton.normal(4);
//                }
//
//            }
//        });
//    }

}