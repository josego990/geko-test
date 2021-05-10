package com.josegonzalez.test.geko;


import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.os.Bundle;


import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.OvershootInterpolator;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Toolbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;

import com.daasuu.ei.Ease;
import com.daasuu.ei.EasingInterpolator;

import com.josegonzalez.test.geko.Fragment.LoginFragment;


public class LoguinActivity extends AppCompatActivity
{
    Fragment frag_login, frag_dashboard;
    ProgressBar pbar;
    View button_login, button_label,button_icon,ic_menu1,ic_menu2;
    private DisplayMetrics dm;

    EditText et_name = null;
    EditText et_password = null;

    String name = "";
    String password = "";

    Context ctx = null;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        ctx = this;

        getSupportActionBar().hide();

        GetSharedPreferences();

        pbar=(ProgressBar) findViewById(R.id.mainProgressBar1);
        button_icon=findViewById(R.id.button_icon);
        button_label=findViewById(R.id.button_label);

        dm=getResources().getDisplayMetrics();
        button_login=findViewById(R.id.button_login);
        button_login.setTag(0);
        pbar.getIndeterminateDrawable().setColorFilter(Color.WHITE, PorterDuff.Mode.MULTIPLY);
        StatusBarUtil.immersive(this);

        frag_login=new LoginFragment();

        et_name = findViewById(R.id.et_name_user);
        et_password = findViewById(R.id.et_password_user);

        getSupportFragmentManager().beginTransaction().replace(R.id.frag_container, frag_login).commit();

        final ValueAnimator va=new ValueAnimator();
        va.setDuration(1000);
        va.setInterpolator(new DecelerateInterpolator());
        va.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(){
            @Override
            public void onAnimationUpdate(ValueAnimator p1) {
                RelativeLayout.LayoutParams button_login_lp= (RelativeLayout.LayoutParams) button_login.getLayoutParams();
                button_login_lp.width=Math.round((Float) p1.getAnimatedValue());

                button_login.setLayoutParams(button_login_lp);
            }
        });
        button_login.animate().translationX(dm.widthPixels+button_login.getMeasuredWidth()).setDuration(0).setStartDelay(0).start();
        button_login.animate().translationX(0).setStartDelay(3000).setDuration(1500).setInterpolator(new OvershootInterpolator()).start();

        button_login.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View p1) {

                et_name = findViewById(R.id.et_name_user);
                et_password = findViewById(R.id.et_password_user);

                if(et_name.getText().length() > 0 && et_password.getText().length() > 0){

                    if(et_name.getText().toString().equals(name) &&
                            et_password.getText().toString().equals(password) ){

                        if((int)button_login.getTag()==1){
                            return;
                        }
                        else if((int)button_login.getTag()==2){
                            button_login.animate().x(dm.widthPixels/2).y(dm.heightPixels/2).setInterpolator(new EasingInterpolator(Ease.CUBIC_IN)).setListener(null).setDuration(1000).setStartDelay(0).start();
                            button_login.animate().setStartDelay(600).setDuration(1000).scaleX(40).scaleY(40).setInterpolator(new EasingInterpolator(Ease.CUBIC_IN_OUT)).start();
                            button_icon.animate().alpha(0).rotation(90).setStartDelay(0).setDuration(800).setListener(new Animator.AnimatorListener() {
                                @Override
                                public void onAnimationStart(Animator animation) {

                                }

                                @Override
                                public void onAnimationEnd(Animator animation) {

                                    Intent i = new Intent(LoguinActivity.this, MainActivity.class);

                                    startActivity(i);

                                }

                                @Override
                                public void onAnimationCancel(Animator animation) {

                                }

                                @Override
                                public void onAnimationRepeat(Animator animation) {

                                }
                            }).start();


                            return;
                        }

                        button_login.setTag(1);
                        va.setFloatValues(button_login.getMeasuredWidth(), button_login.getMeasuredHeight());
                        va.start();
                        pbar.animate().setStartDelay(300).setDuration(1000).alpha(1).start();
                        button_label.animate().setStartDelay(100).setDuration(500).alpha(0).start();

                        button_login.animate().setInterpolator(new FastOutSlowInInterpolator()).setStartDelay(4000).
                                setDuration(1000).scaleX(30).scaleY(30).setListener(new Animator.AnimatorListener(){
                            @Override
                            public void onAnimationStart(Animator p1) {
                                pbar.animate().setStartDelay(0).setDuration(0).alpha(0).start();
                            }

                            @Override
                            public void onAnimationEnd(Animator p1) {
                                Intent i = new Intent(LoguinActivity.this, MainActivity.class);

                                startActivity(i);

                                finish();
                            }

                            @Override
                            public void onAnimationCancel(Animator p1) {
                                // TODO: Implement this method
                            }

                            @Override
                            public void onAnimationRepeat(Animator p1) {
                                // TODO: Implement this method
                            }
                        }).start();

                    }
                    else{
                        Toast.makeText(ctx,"User or password no matches.", Toast.LENGTH_LONG).show();
                    }
                }
                else{
                    Toast.makeText(ctx,"User or password incorrect.", Toast.LENGTH_LONG).show();
                }

            }
        });

    }

    private void GetSharedPreferences(){

        SharedPreferences sp =  getSharedPreferences("user_pref",MODE_PRIVATE);

        name = sp.getString("name", "none_name");
        password = sp.getString("password", "none_pass");

        //Toast.makeText(ctx, name + " " + password, Toast.LENGTH_LONG).show();

    }


    public void SuscribeUser(View view) {
        Intent i = new Intent(LoguinActivity.this, RegisterActivity.class);
        startActivity(i);

    }
}
