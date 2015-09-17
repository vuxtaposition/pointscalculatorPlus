package ie.careersportal.alan.pointscalculator2017plus;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Third extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.third);

        Bundle extras = getIntent().getExtras();

        final int[] totals3 = extras.getIntArray("numbers2");
        final int noMathsBefore = extras.getInt("noMathsBefore");

        Button H1 = (Button) findViewById(R.id.H1);
        H1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                totals3[0] = 125;
                int didMaths;
                didMaths = 999;
                Intent A1Intent = new Intent(Third.this, Fourth.class);
                A1Intent.putExtra("numbers3", totals3);
                A1Intent.putExtra("didMaths", didMaths);
                startActivity(A1Intent);
            }
        });

        Button H2 = (Button) findViewById(R.id.H2);
        H2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                totals3[0] = 113;
                int didMaths;
                didMaths = 999;
                Intent A1Intent = new Intent(Third.this, Fourth.class);
                A1Intent.putExtra("numbers3", totals3);
                A1Intent.putExtra("didMaths", didMaths);
                startActivity(A1Intent);

            }
        });

        Button H3 = (Button) findViewById(R.id.H3);
        H3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                totals3[0] = 102;
                int didMaths;
                didMaths = 999;
                Intent A1Intent = new Intent(Third.this, Fourth.class);
                A1Intent.putExtra("numbers3", totals3);
                A1Intent.putExtra("didMaths", didMaths);
                startActivity(A1Intent);

            }
        });

        Button H4 = (Button) findViewById(R.id.H4);
        H4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                totals3[0] = 91;
                int didMaths;
                didMaths = 999;
                Intent A1Intent = new Intent(Third.this, Fourth.class);
                A1Intent.putExtra("numbers3", totals3);
                A1Intent.putExtra("didMaths", didMaths);
                startActivity(A1Intent);

            }
        });

        Button H5 = (Button) findViewById(R.id.H5);
        H5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                totals3[0] = 81;
                int didMaths;
                didMaths = 999;
                Intent A1Intent = new Intent(Third.this, Fourth.class);
                A1Intent.putExtra("numbers3", totals3);
                A1Intent.putExtra("didMaths", didMaths);
                startActivity(A1Intent);

            }
        });

        Button H6 = (Button) findViewById(R.id.H6);
        H6.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                totals3[0] = 71;
                int didMaths;
                didMaths = 999;
                Intent A1Intent = new Intent(Third.this, Fourth.class);
                A1Intent.putExtra("numbers3", totals3);
                A1Intent.putExtra("didMaths", didMaths);
                startActivity(A1Intent);

            }
        });

        Button H7 = (Button) findViewById(R.id.H7);
        H7.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                totals3[0] = 22;
                int myFail;
                myFail = 333;
                Intent A1Intent = new Intent(Third.this, Fourth.class);

                A1Intent.putExtra("noMathsBefore", noMathsBefore);
                A1Intent.putExtra("numbers3", totals3);
                A1Intent.putExtra("myFail", myFail);
                startActivity(A1Intent);

            }
        });

        Button H8 = (Button) findViewById(R.id.H8);
        H8.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                totals3[0] = 22;
                int myFail;
                myFail = 333;
                Intent A1Intent = new Intent(Third.this, Fourth.class);

                A1Intent.putExtra("noMathsBefore", noMathsBefore);
                A1Intent.putExtra("numbers3", totals3);
                A1Intent.putExtra("myFail", myFail);
                startActivity(A1Intent);

            }
        });

        Button X = (Button) findViewById(R.id.X);
        X.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent resetIntent = new Intent(Third.this, MainActivity.class);
                startActivity(resetIntent);

            }
        });





       

        // TextView showMe = (TextView)findViewById(R.id.show3);

        // showMe.setText("And now for "+totals3[0]);
    }

}
