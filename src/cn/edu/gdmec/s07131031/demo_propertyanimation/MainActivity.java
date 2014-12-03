package cn.edu.gdmec.s07131031.demo_propertyanimation;

import android.os.Bundle;
import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.AnimationSet;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {
	private TextView myTv;
	private Button btnAlpha,btnTranslate,btnScale,btnRotate,btnAll;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myTv=(TextView) findViewById(R.id.textView1);
        btnAlpha=(Button) findViewById(R.id.button1);
        btnTranslate=(Button) findViewById(R.id.button2);
        btnScale=(Button) findViewById(R.id.button3);
        btnRotate=(Button) findViewById(R.id.button4);
        btnAll=(Button) findViewById(R.id.button5);
        btnAlpha.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Animator animator = AnimatorInflater.loadAnimator(MainActivity.this, R.animator.alpha_animator);
				animator.setTarget(myTv);
				animator.start();
			}
        	
        });
        btnTranslate.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Animator animator = AnimatorInflater.loadAnimator(MainActivity.this, R.animator.translate_animator);
				animator.setTarget(myTv);
				animator.start();
			}
        	
        });
        btnScale.setOnClickListener(new OnClickListener(){

     			@Override
     			public void onClick(View arg0) {
     				// TODO Auto-generated method stub
     				Animator animator = AnimatorInflater.loadAnimator(MainActivity.this, R.animator.scale_animator);
     				animator.setTarget(myTv);
     				animator.start();
     			}
             	
             });
        btnRotate.setOnClickListener(new OnClickListener(){

 			@Override
 			public void onClick(View arg0) {
 				// TODO Auto-generated method stub
 				Animator animator = AnimatorInflater.loadAnimator(MainActivity.this, R.animator.rotate_animator);
 				animator.setTarget(myTv);
 				animator.start();
 			}
         	
         });
        btnAll.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				AnimatorSet set=new AnimatorSet();
				Animator alpha = AnimatorInflater.loadAnimator(MainActivity.this, R.animator.alpha_animator);
				Animator  translate= AnimatorInflater.loadAnimator(MainActivity.this, R.animator.translate_animator);
				Animator scale = AnimatorInflater.loadAnimator(MainActivity.this, R.animator.scale_animator);
				set.play(alpha).after(translate).with(scale);
				set.setTarget(myTv);
				set.start();
			}
        	
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
