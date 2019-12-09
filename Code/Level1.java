package Space.Kolbasoff.puzzelofmath;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class Level1 extends AppCompatActivity implements Manager {
    String answer;
    String a;
    EditText Answer;
    TextView Task;
    Button Enter;
    String str;
    private static final int SHORT_DELAY = 2000;

    public void showToast(View view) {

        Toast toast = Toast.makeText(getApplicationContext(),
                "Wrong, Try again!",
                Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.show();
    }
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.universal);
      //  a ="12";
          //  Task1 textTask=new Task1();
        // Task.append(textTask.readFile());


            Task=(TextView)findViewById(R.id.Task);
             int b = manager.getI();


        switch (b) {
            case 1:
                str=("2,4,8,16,?");
                a="32";
                break;
            case 2:
                str=("2+2*2=?");
                a="6";
                break;
            case 3:
                str=("8-8/4*3=?");
                a="2";
                break;
            case 4:
                str=("5+5*5-5=?");
                a="25";
                break;
            case 5:
                str=("■+■=8"+"\n"+"●●+■=14"+"\n"+"▲+●=11"+"\n"+"▲=?");
                a="6";
                break;
            case 6:
                str=("4,11,18,?");
                a="25";
                break;
            case 7:
                str=("A+B=60"+"\n"+"A-B=40"+"\n"+"A/B=?");
                a="5";

                break;
            case 8:
                str=("83=40"+"\n"+"27=12"+"\n"+"19=8"+"\n"+"91=?");
                a="44";
                break;
            case 9:
                str=("3,5=34"+"\n"+"8,2=68"+"\n"+"4,6=52"+"\n"+"5,1=?");
                a="81";

                break;
            default:

               break;
        }






        Task.setText(String.format(str));

            Answer=(EditText)findViewById(R.id.Answer);
        Enter=(Button) findViewById(R.id.Enter);
        Enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answer=Answer.getText().toString();
                if (a.equals(answer))
                {
                    Intent intent = new Intent (Level1.this,Preview.class);
                    startActivity(intent);finish();
                }else showToast(Task);
            }
        });





        Button button_back = (Button) findViewById(R.id.button_back);
        button_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    Intent intent = new Intent (Level1.this,GameLevels.class);
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
            Intent intent = new Intent (Level1.this,GameLevels.class);
            startActivity(intent);finish();
        } catch ( Exception e){}

    }
}
