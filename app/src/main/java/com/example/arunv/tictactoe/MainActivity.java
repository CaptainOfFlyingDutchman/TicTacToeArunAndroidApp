package com.example.arunv.tictactoe;

import android.app.Dialog;
import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button b1, b2, b3, b4, b5, b6, b7, b8, b9;

    TextView reSet,turns,leaderboard, score;
    boolean end=false;
    int turn = 1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        leaderboard= (TextView) findViewById(R.id.leader);
        turns = (TextView) findViewById(R.id.turn);
        score= (TextView) findViewById(R.id.score);
        reSet = (TextView) findViewById(R.id.reset);
        b1 = (Button) findViewById(R.id.move1);
        b2 = (Button) findViewById(R.id.move2);
        b3 = (Button) findViewById(R.id.move3);
         b4 = (Button) findViewById(R.id.move4);
        b5 = (Button) findViewById(R.id.move5);
        b6 = (Button) findViewById(R.id.move6);
        b7 = (Button) findViewById(R.id.move7);
        b8 = (Button) findViewById(R.id.move8);
        b9 = (Button) findViewById(R.id.move9);


        playGame();

        reSet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                reSet();


            }
        });


leaderboard.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent intent=new Intent(MainActivity.this,Dashboard.class);
        startActivity(intent);
    }
});


    }



            public void playGame()
    {
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (b1.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b1.setText("X");
                        turns.setText("Player O Turn");

                    } else if (turn == 2) {
                        turn = 1;
                        b1.setText("O");
                        turns.setText("Player X Turn");

                    }
                }
                endGame();

            }
        });


        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (b2.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b2.setText("X");
                        turns.setText("Player O Turn");

                    } else if (turn == 2) {
                        turn = 1;
                        b2.setText("O");
                        turns.setText("Player X Turn");

                    }
                }
                endGame();

            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (b3.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b3.setText("X");
                        turns.setText("Player O Turn");

                    } else if (turn == 2) {
                        turn = 1;
                        b3.setText("O");
                        turns.setText("Player X Turn");

                    }
                }
                endGame();

            }
        });


        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (b4.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b4.setText("X");
                        turns.setText("Player O Turn");

                    } else if (turn == 2) {
                        turn = 1;
                        b4.setText("O");
                        turns.setText("Player X Turn");
                    }
                }
                endGame();

            }
        });


        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (b5.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b5.setText("X");
                        turns.setText("Player O Turn");

                    } else if (turn == 2) {
                        turn = 1;
                        b5.setText("O");
                        turns.setText("Player X Turn");
                    }
                }
                endGame();

            }
        });


        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if (b6.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b6.setText("X");
                        turns.setText("Player O  Turn");
                    } else if (turn == 2) {
                        turn = 1;
                        b6.setText("O");
                        turns.setText("Player X Turn");
                    }
                }
                endGame();
            }
        });


        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if (b7.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b7.setText("X");
                        turns.setText("Player O Turn");
                    } else if (turn == 2) {
                        turn = 1;
                        b7.setText("O");
                        turns.setText("Player X Turn");
                    }
                }
                endGame();
            }
        });


        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if (b8.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b8.setText("X");
                        turns.setText("Player O Turn");
                    } else if (turn == 2) {
                        turn = 1;
                        b8.setText("O");
                        turns.setText("Player X Turn");
                    }
                }
                endGame();
            }
        });


        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (b9.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b9.setText("X");
                        turns.setText("Player O Turn");
                    } else if (turn == 2) {
                        turn = 1;
                        b9.setText("O");
                        turns.setText("Player X Turn");
                    }
                }
                endGame();

            }
        });


    }


    public void endGame() {

        String a, b, c, d, e, f, g, h, i;


        a = b1.getText().toString();
        b = b2.getText().toString();
        c = b3.getText().toString();
        d = b4.getText().toString();
        e = b5.getText().toString();
        f = b6.getText().toString();
        g = b7.getText().toString();
        h = b8.getText().toString();
        i = b9.getText().toString();

        if (a.equals("X") && b.equals("X") && c.equals("X")) {
            Toast.makeText(this, "PLayer X Wins!!", Toast.LENGTH_LONG).show();

            end=true;



        }


        if (d.equals("X") && e.equals("X") && f.equals("X")) {
            Toast.makeText(this, "PLayer X Wins!!", Toast.LENGTH_LONG).show();

            end=true;

        }

        if (g.equals("X") && h.equals("X") && i.equals("X")) {
            Toast.makeText(this, "PLayer X Wins!!", Toast.LENGTH_LONG).show();

            end=true;

        }

        if (a.equals("X") && d.equals("X") && g.equals("X")) {
            Toast.makeText(this, "PLayer X Wins!!", Toast.LENGTH_LONG).show();

            end=true;

        }
        if (b.equals("X") && e.equals("X") && h.equals("X")) {
            Toast.makeText(this, "PLayer X Wins!!", Toast.LENGTH_LONG).show();

            end=true;

        }

        if (c.equals("X") && f.equals("X") && i.equals("X")) {
            Toast.makeText(this, "PLayer X Wins!!", Toast.LENGTH_LONG).show();

            end=true;

        }


        if (a.equals("X") && e.equals("X") && i.equals("X")) {
            Toast.makeText(this, "PLayer X Wins!!", Toast.LENGTH_LONG).show();

            end=true;

        }

        if (c.equals("X") && e.equals("X") && g.equals("X")) {
            Toast.makeText(this, "PLayer X Wins!!", Toast.LENGTH_LONG).show();

            end=true;

        }


        if (a.equals("O") && b.equals("O") && c.equals("O")) {
            Toast.makeText(this, "PLayer O Wins!!", Toast.LENGTH_LONG).show();

            end=true;

        }


        if (d.equals("O") && e.equals("O") && f.equals("O")) {
            Toast.makeText(this, "PLayer O Wins!!", Toast.LENGTH_LONG).show();

            end=true;

        }

        if (g.equals("O") && h.equals("O") && i.equals("O")) {
            Toast.makeText(this, "PLayer O Wins!!", Toast.LENGTH_LONG).show();



            end=true;

        }

        if (a.equals("O") && d.equals("O") && g.equals("O")) {
            Toast.makeText(this, "PLayer O Wins!!", Toast.LENGTH_LONG).show();

            end=true;

        }
        if (b.equals("O") && e.equals("O") && h.equals("O")) {
            Toast.makeText(this, "PLayer O Wins!!", Toast.LENGTH_LONG).show();

            end=true;

        }

        if (c.equals("O") && f.equals("O") && i.equals("O")) {
            Toast.makeText(this, "PLayer O Wins!!", Toast.LENGTH_LONG).show();

            end=true;

        }


        if (a.equals("O") && e.equals("O") && i.equals("O")) {
            Toast.makeText(this, "PLayer O Wins!!", Toast.LENGTH_LONG).show();

            end=true;

        }

        if (c.equals("O") && e.equals("O") && g.equals("O")) {
            Toast.makeText(this, "PLayer O Wins!!", Toast.LENGTH_LONG).show();

            end=true;

        }




        if (end)
        {
            b1.setEnabled(false);
            b2.setEnabled(false);
            b3.setEnabled(false);
            b4.setEnabled(false);
            b5.setEnabled(false);
            b6.setEnabled(false);
            b7.setEnabled(false);
            b8.setEnabled(false);
            b9.setEnabled(false);



        }








        }


        public  void reSet()
        {

            Intent intent=new Intent(this,MainActivity.class);
            startActivity(intent);
            finish();





        }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        outState.putString("b1text",b1.getText().toString());
        outState.putString("b2text",b2.getText().toString());
        outState.putString("b3text",b3.getText().toString());
        outState.putString("b4text",b4.getText().toString());
        outState.putString("b5text",b5.getText().toString());
        outState.putString("b6text",b6.getText().toString());
        outState.putString("b7text",b7.getText().toString());
        outState.putString("b8text",b8.getText().toString());
        outState.putString("b9text",b9.getText().toString());


        super.onSaveInstanceState(outState);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);

        b1.setText(savedInstanceState.getString("b1text"));
        b2.setText(savedInstanceState.getString("b2text"));
        b3.setText(savedInstanceState.getString("b3text"));
        b4.setText(savedInstanceState.getString("b4text"));
        b5.setText(savedInstanceState.getString("b5text"));
        b6.setText(savedInstanceState.getString("b6text"));
        b7.setText(savedInstanceState.getString("b7text"));
        b8.setText(savedInstanceState.getString("b8text"));
        b9.setText(savedInstanceState.getString("b9text"));




    }
}
