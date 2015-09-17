package ie.careersportal.alan.pointscalculator2017plus;

//import android.support.v7.app.ActionBarActivity;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.net.Uri;
import android.widget.Button;
import android.widget.TextView;


public class menu extends Activity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);

        Button courseSearch = (Button) findViewById(R.id.courseSearch);
        Button careersportal = (Button) findViewById(R.id.careersPortal);
        Button collegesDirect = (Button) findViewById(R.id.collegesdirect);
        Button smsMessage = (Button) findViewById(R.id.smsresults);
        Button twitter = (Button) findViewById(R.id.twitter);
        Button facebook = (Button) findViewById(R.id.facebook);
        Button about = (Button) findViewById(R.id.aboutBtn);
        Button help = (Button) findViewById(R.id.help);

        Bundle extras23 = getIntent().getExtras();
        final ArrayList<Integer> totalsArray  = extras23.getIntegerArrayList("numbersFromHigher");
        final int myCount = extras23.getInt("myCount");

        Collections.sort(totalsArray, Collections.reverseOrder());



        int bla = 0;
        int bla2 =0;



        Iterator<Integer> i;
        i = totalsArray.iterator();

        // create a var to cap the totals to 6
        int B = 0;
        // loop to sum
        while (i.hasNext())
        {
            B++;
            if(B<=6){
                bla += i.next();

            }else{
                //not sure here but doing something to set a catch..
                bla2 += i.next();
            }
        }


        TextView menuTitle3 = (TextView)findViewById(R.id.about);
        //menuTitle3.setText("Total is "+bla);

        //TextView showing = (TextView)findViewById(R.id.show2);
        //showing.setText("Hi there "+totals2[3]+" and "+totals2[0]);


        courseSearch.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("http://www.careersportal.ie/courses/simple_search.php?&s_CheckBox1=1");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);


            }
        });
        careersportal.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("http://www.careersportal.ie");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);

            }
        });

        collegesDirect.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("http://careersportal.ie/colleges/index.php");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);

            }
        });
        twitter.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://mobile.twitter.com/careersportal");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);

            }
        });
        facebook.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://m.facebook.com/CareersPortal");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);

            }
        });
        about.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent Intent = new Intent(menu.this,About.class);

                startActivity(Intent);

            }
        });

        help.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent Intent = new Intent(menu.this,Help.class);

                startActivity(Intent);

            }
        });
        smsMessage.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Collections.sort(totalsArray, Collections.reverseOrder());



                int bla = 0;
                int bla2 =0;



                Iterator<Integer> i;
                i = totalsArray.iterator();

                // create a var to cap the totals to 6
                int B = 0;
                // loop to sum
                while (i.hasNext())
                {
                    B++;
                    if(B<=6){
                        bla += i.next();

                    }else{
                        //not sure here but doing something to set a catch..
                        bla2 += i.next();
                    }
                }

                // TODO Auto-generated method stub


                // pre-conditions


                String uri= "smsto:";
                Intent intent = new Intent(Intent.ACTION_SENDTO, Uri.parse(uri));
                intent.putExtra("sms_body","Hi, I used the Careersportal.ie Points Calculator 2017 Plus to calculate my leaving Cert results and I  got "+ bla+" points.");
                intent.putExtra("compose_mode", true);
                startActivity(intent);
                finish();


            }
        });

    }
}

