package ie.careersportal.alan.pointscalculator2017plus;

//import android.support.v7.app.ActionBarActivity;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Second extends Activity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second);

        Button yesGo = (Button) findViewById(R.id.collegesdirect);
        Button noGo = (Button) findViewById(R.id.careersPortal);

        Bundle extras = getIntent().getExtras();
        final int[] totals2 = extras.getIntArray("numbers");

        //TextView showing = (TextView)findViewById(R.id.show2);
        //showing.setText("Hi there "+totals2[3]+" and "+totals2[0]);


        yesGo.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent yesIntent = new Intent(Second.this,Third.class);
                yesIntent.putExtra("numbers2",  totals2);
                startActivity(yesIntent);


            }
        });
        noGo.setOnClickListener(new View.OnClickListener() {
            int noMathsBefore = 1;
            @Override
            public void onClick(View v) {
                Intent noIntent = new Intent(Second.this,Fourth.class);
                noIntent.putExtra("numbers3", totals2);
                noIntent.putExtra("noMathsBefore", noMathsBefore);
                startActivity(noIntent);

            }
        });




    }
}
