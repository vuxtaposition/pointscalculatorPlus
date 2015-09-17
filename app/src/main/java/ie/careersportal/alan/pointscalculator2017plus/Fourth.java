package ie.careersportal.alan.pointscalculator2017plus;

import java.util.ArrayList;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Fourth extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fourth);

        Bundle extras = getIntent().getExtras();
        final int[] totals4 = extras.getIntArray("numbers3");

        final int noMathsBefore = extras.getInt("noMathsBefore");
        final int didMaths = extras.getInt("didMaths");
        final int myFail = extras.getInt("myFail");


        Button highBtn = (Button) findViewById(R.id.higherBtn);
        Button yestolinks = (Button) findViewById(R.id.yestolinks);

        //Button linkBtn = (Button) findViewById(R.id.linkBtn);


        highBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                int nolinksDone;
                nolinksDone = 666;
                Intent highIntent = new Intent(Fourth.this,HigherLevel.class);
                highIntent.putExtra("numbers4",  totals4);
                highIntent.putExtra("didMaths",  didMaths);
                highIntent.putExtra("nolinksDone",  nolinksDone);
                highIntent.putExtra("myFail",  myFail);
                startActivity(highIntent);




            }
        });

        yestolinks.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                Intent highIntent = new Intent(Fourth.this,NewLinksPage.class);
                highIntent.putExtra("numbers4",  totals4);
                highIntent.putExtra("didMaths",  didMaths);
                highIntent.putExtra("noMathsBefore",  noMathsBefore);
                startActivity(highIntent);


            }
        });


    }



}
