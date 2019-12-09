package Space.Kolbasoff.puzzelofmath;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class GameLevels extends AppCompatActivity implements Manager  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gamelevels);

        Window w =getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);


        Button button_back = (Button)findViewById(R.id.button_back);
        button_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    Intent intent = new Intent (GameLevels.this,MainActivity.class);
                    startActivity(intent);finish();
                } catch ( Exception e){}
            }
        });


        TextView textView1 = (TextView) findViewById(R.id.textView1);
        textView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{manager.setI(1);
                    Intent intent = new Intent (GameLevels.this,Level1.class);
                    startActivity(intent);finish();
                } catch ( Exception e){}
            }
        });

        TextView textView2 = (TextView) findViewById(R.id.textView2);
        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{ manager.setI(2);
                    Intent intent = new Intent (GameLevels.this,Level1.class);
                    startActivity(intent);finish();
                } catch ( Exception e){}
            }
        });
        TextView textView3 = (TextView) findViewById(R.id.textView3);
        textView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{ manager.setI(3);
                    Intent intent = new Intent (GameLevels.this,Level1.class);
                    startActivity(intent);finish();
                } catch ( Exception e){}
            }
        });
        TextView textView4 = (TextView) findViewById(R.id.textView4);
        textView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{ manager.setI(4);
                    Intent intent = new Intent (GameLevels.this,Level1.class);
                    startActivity(intent);finish();
                } catch ( Exception e){}
            }
        });
        TextView textView5 = (TextView) findViewById(R.id.textView5);
        textView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{ manager.setI(5);
                    Intent intent = new Intent (GameLevels.this,Level1.class);
                    startActivity(intent);finish();
                } catch ( Exception e){}
            }
        });
        TextView textView6 = (TextView) findViewById(R.id.textView6);
        textView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{ manager.setI(6);
                    Intent intent = new Intent (GameLevels.this,Level1.class);
                    startActivity(intent);finish();
                } catch ( Exception e){}
            }
        });
        TextView textView7 = (TextView) findViewById(R.id.textView7);
        textView7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{ manager.setI(7);
                    Intent intent = new Intent (GameLevels.this,Level1.class);
                    startActivity(intent);finish();
                } catch ( Exception e){}
            }
        });
        TextView textView8 = (TextView) findViewById(R.id.textView8);
        textView8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{ manager.setI(8);
                    Intent intent = new Intent (GameLevels.this,Level1.class);
                    startActivity(intent);finish();
                } catch ( Exception e){}
            }
        });
        TextView textView9 = (TextView) findViewById(R.id.textView9);
        textView9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{ manager.setI(9);
                    Intent intent = new Intent (GameLevels.this,Level1.class);
                    startActivity(intent);finish();

                } catch ( Exception e){}
            }
        });


    }
    @Override
    public void onBackPressed(){

            try{
                Intent intent = new Intent (GameLevels.this,MainActivity.class);
                startActivity(intent);finish();
            } catch ( Exception e){}

    }
}
