package com.josegonzalez.test.geko;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class SplashActivity extends AppCompatActivity {

    private MediaPlayer mp_typewriter;

    private TextView tv_typewriter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);



        tv_typewriter = findViewById(R.id.tv_typewriter);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(SplashActivity.this, LoguinActivity.class);

                startActivity(i);

                finish();
            }
        });

        Typewriter();
    }

    private void Typewriter(){

        final Handler handler_1 = new Handler();
        final Handler handler_2 = new Handler();
        final Handler handler_3 = new Handler();
        final Handler handler_4 = new Handler();
        final Handler handler_5 = new Handler();
        final Handler handler_6 = new Handler();
        final Handler handler_7 = new Handler();
        final Handler handler_8 = new Handler();
        final Handler handler_9 = new Handler();
        final Handler handler_10 = new Handler();
        final Handler handler_11 = new Handler();
        final Handler handler_12 = new Handler();
        final Handler handler_13 = new Handler();
        final Handler handler_14 = new Handler();
        final Handler handler_15 = new Handler();
        final Handler handler_16 = new Handler();
        final Handler handler_17 = new Handler();
        final Handler handler_18 = new Handler();
        final Handler handler_19 = new Handler();
        final Handler handler_20 = new Handler();
        final Handler handler_21 = new Handler();
        final Handler handler_22 = new Handler();
        final Handler handler_23 = new Handler();
        final Handler handler_24 = new Handler();
        final Handler handler_25 = new Handler();
        final Handler handler_26 = new Handler();
        final Handler handler_27 = new Handler();
        final Handler handler_28 = new Handler();
        final Handler handler_29 = new Handler();

        handler_1.postDelayed(new Runnable() {

            @Override
            public void run() {

                PlayTypewriter();

                tv_typewriter.setText("Esta");

                handler_2.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        tv_typewriter.setText("Esta es una");
                        handler_3.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                tv_typewriter.setText("Esta es una aplicación de prueba");
                                handler_4.postDelayed(new Runnable() {
                                    @Override
                                    public void run() {
                                        tv_typewriter.setText("Esta es una aplicación de prueba para GEKO.");
                                        handler_5.postDelayed(new Runnable() {
                                            @Override
                                            public void run() {
                                                tv_typewriter.setText("Esta es una aplicación de prueba para GEKO. Fue desarrollada con");
                                                handler_6.postDelayed(new Runnable() {
                                                    @Override
                                                    public void run() {
                                                        tv_typewriter.setText("Esta es una aplicación de prueba para GEKO. Fue desarrollada con Android Studio 3");
                                                        handler_7.postDelayed(new Runnable() {
                                                            @Override
                                                            public void run() {
                                                                tv_typewriter.setText("Esta es una aplicación de prueba para GEKO. Fue desarrollada con Android Studio 3.4.1, es una aplicación nat");
                                                                handler_8.postDelayed(new Runnable() {
                                                                    @Override
                                                                    public void run() {
                                                                        tv_typewriter.setText("Esta es una aplicación de prueba para GEKO. Fue desarrollada con Android Studio 3.4.1, es una aplicación nativa con el lengua");
                                                                        handler_9.postDelayed(new Runnable() {
                                                                            @Override
                                                                            public void run() {
                                                                                tv_typewriter.setText("Esta es una aplicación de prueba para GEKO. Fue desarrollada con Android Studio 3.4.1, es una aplicación nativa con el lenguaje JAVA. Uti");
                                                                                handler_10.postDelayed(new Runnable() {
                                                                                    @Override
                                                                                    public void run() {
                                                                                        tv_typewriter.setText("Esta es una aplicación de prueba para GEKO. Fue desarrollada con Android Studio 3.4.1, es una aplicación nativa con el lenguaje JAVA. Utiliza los");
                                                                                        handler_11.postDelayed(new Runnable() {
                                                                                            @Override
                                                                                            public void run() {
                                                                                                tv_typewriter.setText("Esta es una aplicación de prueba para GEKO. Fue desarrollada con Android Studio 3.4.1, es una aplicación nativa con el lenguaje JAVA. Utiliza los servicios");
                                                                                                handler_12.postDelayed(new Runnable() {
                                                                                                    @Override
                                                                                                    public void run() {
                                                                                                        tv_typewriter.setText("Esta es una aplicación de prueba para GEKO. Fue desarrollada con Android Studio 3.4.1, es una aplicación nativa con el lenguaje JAVA. Utiliza los servicios de AWS (Ama");
                                                                                                        handler_13.postDelayed(new Runnable() {
                                                                                                            @Override
                                                                                                            public void run() {
                                                                                                                tv_typewriter.setText("Esta es una aplicación de prueba para GEKO. Fue desarrollada con Android Studio 3.4.1, es una aplicación nativa con el lenguaje JAVA. Utiliza los servicios de AWS (Amazon Web S");
                                                                                                                handler_14.postDelayed(new Runnable() {
                                                                                                                    @Override
                                                                                                                    public void run() {
                                                                                                                        tv_typewriter.setText("Esta es una aplicación de prueba para GEKO. Fue desarrollada con Android Studio 3.4.1, es una aplicación nativa con el lenguaje JAVA. Utiliza los servicios de AWS (Amazon Web Services) ");
                                                                                                                        handler_15.postDelayed(new Runnable() {
                                                                                                                            @Override
                                                                                                                            public void run() {
                                                                                                                                tv_typewriter.setText("Esta es una aplicación de prueba para GEKO. Fue desarrollada con Android Studio 3.4.1, es una aplicación nativa con el lenguaje JAVA. Utiliza los servicios de AWS (Amazon Web Services) para cone");
                                                                                                                                handler_16.postDelayed(new Runnable() {
                                                                                                                                    @Override
                                                                                                                                    public void run() {
                                                                                                                                        tv_typewriter.setText("Esta es una aplicación de prueba para GEKO. Fue desarrollada con Android Studio 3.4.1, es una aplicación nativa con el lenguaje JAVA. Utiliza los servicios de AWS (Amazon Web Services) para conectarse a u");
                                                                                                                                        handler_17.postDelayed(new Runnable() {
                                                                                                                                            @Override
                                                                                                                                            public void run() {
                                                                                                                                                tv_typewriter.setText("Esta es una aplicación de prueba para GEKO. Fue desarrollada con Android Studio 3.4.1, es una aplicación nativa con el lenguaje JAVA. Utiliza los servicios de AWS (Amazon Web Services) para conectarse a una API RE");
                                                                                                                                                handler_18.postDelayed(new Runnable() {
                                                                                                                                                    @Override
                                                                                                                                                    public void run() {
                                                                                                                                                        tv_typewriter.setText("Esta es una aplicación de prueba para GEKO. Fue desarrollada con Android Studio 3.4.1, es una aplicación nativa con el lenguaje JAVA. Utiliza los servicios de AWS (Amazon Web Services) para conectarse a una API REST escrit");
                                                                                                                                                        handler_19.postDelayed(new Runnable() {
                                                                                                                                                            @Override
                                                                                                                                                            public void run() {
                                                                                                                                                                tv_typewriter.setText("Esta es una aplicación de prueba para GEKO. Fue desarrollada con Android Studio 3.4.1, es una aplicación nativa con el lenguaje JAVA. Utiliza los servicios de AWS (Amazon Web Services) para conectarse a una API REST escrita en Node.js");
                                                                                                                                                                handler_20.postDelayed(new Runnable() {
                                                                                                                                                                    @Override
                                                                                                                                                                    public void run() {
                                                                                                                                                                        tv_typewriter.setText("Esta es una aplicación de prueba para GEKO. Fue desarrollada con Android Studio 3.4.1, es una aplicación nativa con el lenguaje JAVA. Utiliza los servicios de AWS (Amazon Web Services) para conectarse a una API REST escrita en Node.js y Express.");
                                                                                                                                                                        handler_21.postDelayed(new Runnable() {
                                                                                                                                                                            @Override
                                                                                                                                                                            public void run() {
                                                                                                                                                                                tv_typewriter.setText("Esta es una aplicación de prueba para GEKO. Fue desarrollada con Android Studio 3.4.1, es una aplicación nativa con el lenguaje JAVA. Utiliza los servicios de AWS (Amazon Web Services) para conectarse a una API REST escrita en Node.js y Express. El código de pro");
                                                                                                                                                                                handler_22.postDelayed(new Runnable() {
                                                                                                                                                                                    @Override
                                                                                                                                                                                    public void run() {
                                                                                                                                                                                        tv_typewriter.setText("Esta es una aplicación de prueba para GEKO. Fue desarrollada con Android Studio 3.4.1, es una aplicación nativa con el lenguaje JAVA. Utiliza los servicios de AWS (Amazon Web Services) para conectarse a una API REST escrita en Node.js y Express. El código de programación lo he su");
                                                                                                                                                                                        handler_23.postDelayed(new Runnable() {
                                                                                                                                                                                            @Override
                                                                                                                                                                                            public void run() {
                                                                                                                                                                                                tv_typewriter.setText("Esta es una aplicación de prueba para GEKO. Fue desarrollada con Android Studio 3.4.1, es una aplicación nativa con el lenguaje JAVA. Utiliza los servicios de AWS (Amazon Web Services) para conectarse a una API REST escrita en Node.js y Express. El código de programación lo he subido a GITHUB ");
                                                                                                                                                                                                handler_24.postDelayed(new Runnable() {
                                                                                                                                                                                                    @Override
                                                                                                                                                                                                    public void run() {
                                                                                                                                                                                                        tv_typewriter.setText("Esta es una aplicación de prueba para GEKO. Fue desarrollada con Android Studio 3.4.1, es una aplicación nativa con el lenguaje JAVA. Utiliza los servicios de AWS (Amazon Web Services) para conectarse a una API REST escrita en Node.js y Express. El código de programación lo he subido a GITHUB mediante comand");
                                                                                                                                                                                                        handler_25.postDelayed(new Runnable() {
                                                                                                                                                                                                            @Override
                                                                                                                                                                                                            public void run() {
                                                                                                                                                                                                                tv_typewriter.setText("Esta es una aplicación de prueba para GEKO. Fue desarrollada con Android Studio 3.4.1, es una aplicación nativa con el lenguaje JAVA. Utiliza los servicios de AWS (Amazon Web Services) para conectarse a una API REST escrita en Node.js y Express. El código de programación lo he subido a GITHUB mediante comandos GIT en mi p");
                                                                                                                                                                                                                handler_26.postDelayed(new Runnable() {
                                                                                                                                                                                                                    @Override
                                                                                                                                                                                                                    public void run() {
                                                                                                                                                                                                                        tv_typewriter.setText("Esta es una aplicación de prueba para GEKO. Fue desarrollada con Android Studio 3.4.1, es una aplicación nativa con el lenguaje JAVA. Utiliza los servicios de AWS (Amazon Web Services) para conectarse a una API REST escrita en Node.js y Express. El código de programación lo he subido a GITHUB mediante comandos GIT en mi perfil pe");
                                                                                                                                                                                                                        handler_27.postDelayed(new Runnable() {
                                                                                                                                                                                                                            @Override
                                                                                                                                                                                                                            public void run() {
                                                                                                                                                                                                                                tv_typewriter.setText("Esta es una aplicación de prueba para GEKO. Fue desarrollada con Android Studio 3.4.1, es una aplicación nativa con el lenguaje JAVA. Utiliza los servicios de AWS (Amazon Web Services) para conectarse a una API REST escrita en Node.js y Express. El código de programación lo he subido a GITHUB mediante comandos GIT en mi perfil persona");
                                                                                                                                                                                                                                handler_28.postDelayed(new Runnable() {
                                                                                                                                                                                                                                    @Override
                                                                                                                                                                                                                                    public void run() {
                                                                                                                                                                                                                                        tv_typewriter.setText("Esta es una aplicación de prueba para GEKO. Fue desarrollada con Android Studio 3.4.1, es una aplicación nativa con el lenguaje JAVA. Utiliza los servicios de AWS (Amazon Web Services) para conectarse a una API REST escrita en Node.js y Express. El código de programación lo he subido a GITHUB mediante comandos GIT en mi perfil personal. Cualquier");
                                                                                                                                                                                                                                        handler_29.postDelayed(new Runnable() {
                                                                                                                                                                                                                                            @Override
                                                                                                                                                                                                                                            public void run() {
                                                                                                                                                                                                                                                tv_typewriter.setText("Esta es una aplicación de prueba para GEKO. Fue desarrollada con Android Studio 3.4.1, es una aplicación nativa con el lenguaje JAVA. Utiliza los servicios de AWS (Amazon Web Services) para conectarse a una API REST escrita en Node.js y Express. El código de programación lo he subido a GITHUB mediante comandos GIT en mi perfil personal. Cualquier duda estoy a la orden.");
                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                        }, 250);
                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                }, 250);
                                                                                                                                                                                                                            }
                                                                                                                                                                                                                        }, 250);
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                }, 250);
                                                                                                                                                                                                            }
                                                                                                                                                                                                        }, 250);
                                                                                                                                                                                                    }
                                                                                                                                                                                                }, 250);
                                                                                                                                                                                            }
                                                                                                                                                                                        }, 250);
                                                                                                                                                                                    }
                                                                                                                                                                                }, 250);
                                                                                                                                                                            }
                                                                                                                                                                        }, 250);
                                                                                                                                                                    }
                                                                                                                                                                }, 250);
                                                                                                                                                            }
                                                                                                                                                        }, 250);
                                                                                                                                                    }
                                                                                                                                                }, 250);
                                                                                                                                            }
                                                                                                                                        }, 250);
                                                                                                                                    }
                                                                                                                                }, 250);
                                                                                                                            }
                                                                                                                        }, 250);
                                                                                                                    }
                                                                                                                }, 250);
                                                                                                            }
                                                                                                        }, 250);
                                                                                                    }
                                                                                                }, 250);
                                                                                            }
                                                                                        }, 250);
                                                                                    }
                                                                                }, 250);
                                                                            }
                                                                        }, 250);
                                                                    }
                                                                }, 250);
                                                            }
                                                        }, 250);
                                                    }
                                                }, 250);
                                            }
                                        }, 250);
                                    }
                                }, 250);
                            }
                        }, 250);
                    }
                }, 250);


            }
        }, 1000);

    }


    private void PlayTypewriter(){
        mp_typewriter = MediaPlayer.create(SplashActivity.this,R.raw.typewriter);
        mp_typewriter.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });

        mp_typewriter.start();
    }


}

