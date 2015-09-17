package ie.careersportal.alan.pointscalculator2017plus;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class NewLinksPage extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.newlinkspage);

        int addLInks = 43;

        Bundle extras = getIntent().getExtras();
        final int[] totals3 = extras.getIntArray("numbers4");
        final int noMathsBefore = extras.getInt("noMathsBefore");
        final int didMaths = extras.getInt("didMaths");





        Button dist = (Button)findViewById(R.id.distinction);
        dist.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                totals3[1] = 66;
                int addLInks = 43;// var to see if links subject is included

                Intent A1Intent = new Intent(NewLinksPage.this,HigherLevel.class);
                A1Intent.putExtra("numbers4",  totals3);
                A1Intent.putExtra("addLinks",  addLInks);
                A1Intent.putExtra("noMathsBefore",  noMathsBefore);
                A1Intent.putExtra("didMaths",  didMaths);
                startActivity(A1Intent);
            }
        });


        Button meritBtn = (Button)findViewById(R.id.Merit);
        meritBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                totals3[1] = 46;
                int addLInks = 43; // var to see if links subject is included
                Intent A1Intent = new Intent(NewLinksPage.this,HigherLevel.class);
                A1Intent.putExtra("numbers4",  totals3);
                A1Intent.putExtra("addLinks",  addLInks);
                A1Intent.putExtra("noMathsBefore",  noMathsBefore);
                A1Intent.putExtra("didMaths",  didMaths);
                startActivity(A1Intent);

            }
        });

        Button Passbtn = (Button)findViewById(R.id.Pass);
        Passbtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                totals3[1] = 28;
                int addLInks = 43; // var to see if links subject is included
                Intent A1Intent = new Intent(NewLinksPage.this,HigherLevel.class);
                A1Intent.putExtra("numbers4",  totals3);
                A1Intent.putExtra("addLinks",  addLInks);
                A1Intent.putExtra("noMathsBefore",  noMathsBefore);
                A1Intent.putExtra("didMaths",  didMaths);
                startActivity(A1Intent);

            }
        });












        //showMe.setText("And now for "+totals3[0]);
    }


}
