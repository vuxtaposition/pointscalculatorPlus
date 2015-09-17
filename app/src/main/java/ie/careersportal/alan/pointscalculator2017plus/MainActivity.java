package ie.careersportal.alan.pointscalculator2017plus;




import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

    // array with 20 items
    int totals[] ={0,0};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button mySecond = (Button) findViewById(R.id.H1);



        //showing.setText("Here is "+totals[2]);



        mySecond.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent myintent = new Intent(MainActivity.this,Second.class);
                myintent.putExtra("numbers", totals);
                startActivity(myintent);



            }
        });


    }


}
