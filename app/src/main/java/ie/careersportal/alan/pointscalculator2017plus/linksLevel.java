package ie.careersportal.alan.pointscalculator2017plus;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class linksLevel extends Activity {
    int mycounting = 0;

    Button LM,LD,LP,reset,menu;
    List<Integer> totalsArray = new ArrayList<Integer>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.links_level);


        TextView BigTotal1 = (TextView)findViewById(R.id.total_H);
        Typeface typeFace = Typeface.createFromAsset(getAssets(), "fonts/Hoefler Text.ttf");
        BigTotal1.setTypeface(typeFace);


        // get variables from intent




        Bundle extras23 = getIntent().getExtras();
        final ArrayList<Integer> totalsArray  = extras23.getIntegerArrayList("numbersFromHigher2");

        final  int mybackVarNow = getIntent().getIntExtra("mybackVar",0);

        if(mybackVarNow == 8){
            Button mainOrdView = (Button)findViewById(R.id.ordinaryView);
            mainOrdView.setVisibility(View.INVISIBLE);
        }else if (mybackVarNow == 9){
            Button mainHiView = (Button)findViewById(R.id.higherView);
            mainHiView.setVisibility(View.INVISIBLE);

        }

        //TextView BigTotal1 = (TextView)findViewById(R.id.total_H);
        Collections.sort(totalsArray, Collections.reverseOrder());



        int bla = 0;
        int bla2 =0;

        //starts off total

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



        // set the total on the screen
        //TextView BigTotal1 = (TextView)findViewById(R.id.total_H);
        BigTotal1.setText(""+bla);
        //BigTotal1.setText(""+totals5[0]);
        TextView totalSub = (TextView)findViewById(R.id.totalPointsValue);
        totalSub.setText(""+B);


        //start buttons
        Button LD = (Button)findViewById(R.id.distinction);
        LD.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                totalsArray.add(66);






                //sorting array
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
                        if(B==6){
                            TextView topSix = (TextView)findViewById(R.id.topSix_H);
                            topSix.setVisibility(View.VISIBLE);
                        }

                    }else{
                        //not sure here but doing something to set a catch..
                        bla2 += i.next();
                    }
                }





                // set the total on the screen
                TextView BigTotal1 = (TextView)findViewById(R.id.total_H);
                BigTotal1.setText(""+bla);

                TextView totalSub = (TextView)findViewById(R.id.totalPointsValue);
                totalSub.setText(""+B);
                // log for all reports
                System.out.println("hello"+totalsArray.toString());

            }
        });
        Button LM = (Button)findViewById(R.id.Merit);
        LM.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                totalsArray.add(46);






                //sorting array
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
                        if(B==6){
                            TextView topSix = (TextView)findViewById(R.id.topSix_H);
                            topSix.setVisibility(View.VISIBLE);
                        }

                    }else{
                        //not sure here but doing something to set a catch..
                        bla2 += i.next();
                    }
                }





                // set the total on the screen
                TextView BigTotal1 = (TextView)findViewById(R.id.total_H);
                BigTotal1.setText(""+bla);

                TextView totalSub = (TextView)findViewById(R.id.totalPointsValue);
                totalSub.setText(""+B);
                // log for all reports
                System.out.println("hello"+totalsArray.toString());

            }
        });
        Button LP = (Button)findViewById(R.id.Pass);
        LP.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                totalsArray.add(28);






                //sorting array
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
                        if(B==6){
                            TextView topSix = (TextView)findViewById(R.id.topSix_H);
                            topSix.setVisibility(View.VISIBLE);
                        }

                    }else{
                        //not sure here but doing something to set a catch..
                        bla2 += i.next();
                    }
                }





                // set the total on the screen
                TextView BigTotal1 = (TextView)findViewById(R.id.total_H);
                BigTotal1.setText(""+bla);

                TextView totalSub = (TextView)findViewById(R.id.totalPointsValue);
                totalSub.setText(""+B);
                // log for all reports
                System.out.println("hello"+totalsArray.toString());

            }
        });

        reset = (Button)findViewById(R.id.reset);
        reset.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {


                Intent resetIntent = new Intent(linksLevel.this,MainActivity.class);
                startActivity(resetIntent);

            }
        });


        menu = (Button)findViewById(R.id.menu);
        menu.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {
                Intent highIntentMenu = new Intent(linksLevel.this,menu.class);
                highIntentMenu.putIntegerArrayListExtra("numbersFromHigher",  (ArrayList<Integer>) totalsArray);
                //highIntentMenu.putExtra("myCount", count);

                startActivityForResult(highIntentMenu,0);

            }
        });

        Button mainHiView = (Button)findViewById(R.id.higherView);
        mainHiView.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub

                Intent highIntent3 = new Intent(linksLevel.this,HigherLevel.class);
                //highIntent3.putIntegerArrayListExtra("numbersFromHigher",  (ArrayList<Integer>) totalsArray);
                //startActivity(highIntent2);
                Bundle backpack = new Bundle();
                backpack.putIntegerArrayList("numbersFromHigher",  (ArrayList<Integer>) totalsArray);
                highIntent3.putExtras(backpack) ;

                setResult(RESULT_OK, highIntent3);
                finish();

            }

        });



        Button mainOrdView = (Button)findViewById(R.id.ordinaryView);
        mainOrdView.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub

                Intent highIntent4 = new Intent(linksLevel.this,OrdinaryLevel.class);
                //highIntent3.putIntegerArrayListExtra("numbersFromHigher",  (ArrayList<Integer>) totalsArray);
                //startActivity(highIntent2);
                Bundle backpack = new Bundle();
                backpack.putIntegerArrayList("numbersFromHigher2",  (ArrayList<Integer>) totalsArray);
                highIntent4.putExtras(backpack) ;

                setResult(RESULT_OK, highIntent4);
                finish();

            }

        });





			/*	Button mainOrdView24 = (Button)findViewById(R.id.ordinaryView);
				mainOrdView24.setOnClickListener(new View.OnClickListener() {

					@Override
					public void onClick(View v) {
						// TODO Auto-generated method stub

						Intent highIntent24 = new Intent(linksLevel.this,OrdinaryLevel.class);
						highIntent24.putIntegerArrayListExtra("numbersFromHigher2",  (ArrayList<Integer>) totalsArray);


						startActivityForResult(highIntent24,0);

					}




				});	*/



    }



}
