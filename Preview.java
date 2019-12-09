package Space.Kolbasoff.puzzelofmath;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;


import androidx.appcompat.app.AppCompatActivity;

public class Preview extends AppCompatActivity implements Manager {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.preview);


        Button Next=(Button) findViewById(R.id.Next);
        Next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try{
                    manager.increment();
                    Intent intent = new Intent (Preview.this,Level1.class);
                    startActivity(intent);finish();
                } catch ( Exception e){}
            }
        });

        Window w =getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);


    }
    @Override
    public void onBackPressed(){

        try{
            Intent intent = new Intent (Preview.this,Level1.class);
            startActivity(intent);finish();
        } catch ( Exception e){}

    }

}
