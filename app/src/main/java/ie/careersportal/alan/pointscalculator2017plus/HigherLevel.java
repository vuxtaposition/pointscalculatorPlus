package ie.careersportal.alan.pointscalculator2017plus;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class HigherLevel extends Activity {
    Button H1, H2, H3, H4, H5, H6, H7, H8, X, reset, menu;
    int HigherTextLable;
    List<Integer> totalsArray = new ArrayList<Integer>();

    int hiddenLinks;
    int sum = 0;
    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.higher_level);

        TextView BigTotal1 = (TextView) findViewById(R.id.total_H);
        Typeface typeFace = Typeface.createFromAsset(getAssets(), "fonts/Hoefler Text.ttf");
        BigTotal1.setTypeface(typeFace);

        // get variables from intent
        Bundle extras = getIntent().getExtras();
        final int[] totals5 = extras.getIntArray("numbers4");
        final int addLinks = extras.getInt("addLinks");
        final int noMathsBefore = extras.getInt("noMathsBefore");
        final int didMaths = extras.getInt("didMaths");
        final int noLinksDone = extras.getInt("nolinksDone");
        final int myFail = extras.getInt("myFail");


        if (addLinks == 43) { // check if links Module was added

            count = 1;
        }
        Button mainOrdView = (Button) findViewById(R.id.ordinaryView);
        mainOrdView.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub

                Intent highIntent2 = new Intent(HigherLevel.this, OrdinaryLevel.class);
                highIntent2.putIntegerArrayListExtra("numbersFromHigher", (ArrayList<Integer>) totalsArray);
                highIntent2.putExtra("myCount", count);
                highIntent2.putExtra("addLinks", addLinks);
                highIntent2.putExtra("didMaths", didMaths);


                startActivityForResult(highIntent2, 0);

            }

        });


        Button mainLinkView = (Button) findViewById(R.id.linkView);
        mainLinkView.setVisibility(View.INVISIBLE);


        for (int j = 0; j <= 1; j++) {
            System.out.println("No maths..but " + totals5[j]);
        }


        if (noMathsBefore == 1) {
            count = count - 1;

        }


        // check for subject count
        for (int i = 0; i < totals5.length; i++) {

            if (totals5[i] == 22) {
                TextView totalSub = (TextView) findViewById(R.id.totalPointsValue);


                count = count + 1;

                if (addLinks == 43) { // check if links Module was added

                    count = count - 1;
                }


                totalSub.setText("" + count);
                totals5[i] = 0;
                int nothing = 0;
                totalsArray.add(nothing); // count as a subject even if a fail!
            }


            sum += totals5[i];
        }

        if (didMaths == 999) {
            TextView bonus = (TextView) findViewById(R.id.Bonus);

            bonus.setVisibility(View.VISIBLE);

        }


        //checking if they got 25 points or not
        if (sum > 25) {


            count = count + 1;
            TextView totalSub = (TextView) findViewById(R.id.totalPointsValue);
            totalSub.setText("" + count);

            try {
                for (int i = 0; i <= 1; i++) {
                    totalsArray.add(totals5[i]);

                    System.out.println("Just added " + totals5[i]);
                }
            } catch (Exception e) {
                System.out.println(" problem " + e);
            }

            //totalsArray.add(sum);

        }


        BigTotal1.setText("" + sum);


        if (noMathsBefore == 1) {
            totalsArray.remove(0);
            System.out.println("No maths Removed!!!!");

        }

        for (int s = 0; s <= 1; s++) {
            if (totalsArray.contains(0)) {

            }
        }


        for (int i = 0; i < totalsArray.size(); i++) {

            if (totalsArray.get(i) == 0) {

                totalsArray.remove(i);
                //System.out.println("Just removed any "+totalsArray.get(i)+"'s");
            }
        }


        if (myFail == 333) {
            totalsArray.add(0);

            System.out.println("Placed a 0 into the Array!!");
        }

		/*try{

		if(noLinksDone == 666){

			if(totalsArray.size() > 0){
			totalsArray.remove(0);
			System.out.println("No Links done!!!!");
			}

		}
	}catch( Exception e ){
		System.out.println( e);

	}*/
        // Start buttons

        Button H1 = (Button) findViewById(R.id.H1);
        H1.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {


                totalsArray.add(100);

                //sorting array
                Collections.sort(totalsArray, Collections.reverseOrder());
                int bla = 0;
                int bla2 = 0;


                Iterator<Integer> i;
                i = totalsArray.iterator();

                // create a var to cap the totals to 6


                int B = 0;

                // loop to sum
                while (i.hasNext()) {

                    B++;
                    if (B <= 6) {
                        bla += i.next();
                        if (B == 6) {
                            TextView topSix = (TextView) findViewById(R.id.topSix_H);
                            topSix.setVisibility(View.VISIBLE);
                        }

                    } else {
                        //not sure here but doing something to set a catch..
                        bla2 += i.next();
                    }
                }


                // set the total on the screen
                TextView BigTotal1 = (TextView) findViewById(R.id.total_H);
                BigTotal1.setText("" + bla);


                TextView totalSub = (TextView) findViewById(R.id.totalPointsValue);

                totalSub.setText("" + B);

                // log for all reports
                System.out.println("hello" + totalsArray.toString());

            }
        });


        Button H2 = (Button) findViewById(R.id.H2);
        H2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                totalsArray.add(88);
                //sorting array
                Collections.sort(totalsArray, Collections.reverseOrder());
                int bla = 0;
                int bla2 = 0;


                Iterator<Integer> i;
                i = totalsArray.iterator();

                // create a var to cap the totals to 6
                int B = 0;
                // loop to sum
                while (i.hasNext()) {
                    B++;
                    if (B <= 6) {
                        bla += i.next();
                        if (B == 6) {
                            TextView topSix = (TextView) findViewById(R.id.topSix_H);
                            topSix.setVisibility(View.VISIBLE);
                        }

                    } else {
                        //not sure here but doing something to set a catch..
                        bla2 += i.next();
                    }
                }


                // set the total on the screen
                TextView BigTotal1 = (TextView) findViewById(R.id.total_H);
                BigTotal1.setText("" + bla);


                TextView totalSub = (TextView) findViewById(R.id.totalPointsValue);

                totalSub.setText("" + B);

                // log for all reports
                System.out.println("hello" + totalsArray.toString());

            }
        });

        Button H3 = (Button) findViewById(R.id.H3);
        H3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                totalsArray.add(77);
                //sorting array
                Collections.sort(totalsArray, Collections.reverseOrder());
                int bla = 0;
                int bla2 = 0;


                Iterator<Integer> i;
                i = totalsArray.iterator();

                // create a var to cap the totals to 6
                int B = 0;
                // loop to sum
                while (i.hasNext()) {
                    B++;
                    if (B <= 6) {
                        bla += i.next();
                        if (B == 6) {
                            TextView topSix = (TextView) findViewById(R.id.topSix_H);
                            topSix.setVisibility(View.VISIBLE);
                        }

                    } else {
                        //not sure here but doing something to set a catch..
                        bla2 += i.next();
                    }
                }


                // set the total on the screen
                TextView BigTotal1 = (TextView) findViewById(R.id.total_H);
                BigTotal1.setText("" + bla);

                TextView totalSub = (TextView) findViewById(R.id.totalPointsValue);

                totalSub.setText("" + B);

                // log for all reports
                System.out.println("hello" + totalsArray.toString());

            }
        });


        Button H4 = (Button) findViewById(R.id.H4);
        H4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                //sorting array
                totalsArray.add(66);
                Collections.sort(totalsArray, Collections.reverseOrder());
                int bla = 0;
                int bla2 = 0;


                Iterator<Integer> i;
                i = totalsArray.iterator();

                // create a var to cap the totals to 6
                int B = 0;
                // loop to sum
                while (i.hasNext()) {
                    B++;
                    if (B <= 6) {
                        bla += i.next();
                        if (B == 6) {
                            TextView topSix = (TextView) findViewById(R.id.topSix_H);
                            topSix.setVisibility(View.VISIBLE);
                        }

                    } else {
                        //not sure here but doing something to set a catch..
                        bla2 += i.next();
                    }
                }


                // set the total on the screen
                TextView BigTotal1 = (TextView) findViewById(R.id.total_H);
                BigTotal1.setText("" + bla);

                TextView totalSub = (TextView) findViewById(R.id.totalPointsValue);

                totalSub.setText("" + B);

                // log for all reports
                System.out.println("hello" + totalsArray.toString());

            }
        });


        Button H5 = (Button) findViewById(R.id.H5);
        H5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                totalsArray.add(56);
                //sorting array
                Collections.sort(totalsArray, Collections.reverseOrder());
                int bla = 0;
                int bla2 = 0;


                Iterator<Integer> i;
                i = totalsArray.iterator();

                // create a var to cap the totals to 6
                int B = 0;
                // loop to sum
                while (i.hasNext()) {
                    B++;
                    if (B <= 6) {
                        bla += i.next();
                        if (B == 6) {
                            TextView topSix = (TextView) findViewById(R.id.topSix_H);
                            topSix.setVisibility(View.VISIBLE);
                        }

                    } else {
                        //not sure here but doing something to set a catch..
                        bla2 += i.next();
                    }
                }


                // set the total on the screen
                TextView BigTotal1 = (TextView) findViewById(R.id.total_H);
                BigTotal1.setText("" + bla);

                TextView totalSub = (TextView) findViewById(R.id.totalPointsValue);

                totalSub.setText("" + B);

                // log for all reports
                System.out.println("hello" + totalsArray.toString());

            }
        });


        Button H6 = (Button) findViewById(R.id.H6);
        H6.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                totalsArray.add(46);
                //sorting array
                Collections.sort(totalsArray, Collections.reverseOrder());
                int bla = 0;
                int bla2 = 0;


                Iterator<Integer> i;
                i = totalsArray.iterator();

                // create a var to cap the totals to 6
                int B = 0;
                // loop to sum
                while (i.hasNext()) {
                    B++;
                    if (B <= 6) {
                        bla += i.next();
                        if (B == 6) {
                            TextView topSix = (TextView) findViewById(R.id.topSix_H);
                            topSix.setVisibility(View.VISIBLE);
                        }

                    } else {
                        //not sure here but doing something to set a catch..
                        bla2 += i.next();
                    }
                }


                // set the total on the screen
                TextView BigTotal1 = (TextView) findViewById(R.id.total_H);
                BigTotal1.setText("" + bla);

                TextView totalSub = (TextView) findViewById(R.id.totalPointsValue);

                totalSub.setText("" + B);

                // log for all reports
                System.out.println("hello" + totalsArray.toString());

            }
        });


        Button H7 = (Button) findViewById(R.id.H7);
        H7.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                totalsArray.add(37);
                //sorting array
                Collections.sort(totalsArray, Collections.reverseOrder());
                int bla = 0;
                int bla2 = 0;


                Iterator<Integer> i;
                i = totalsArray.iterator();

                // create a var to cap the totals to 6
                int B = 0;
                // loop to sum
                while (i.hasNext()) {
                    B++;
                    if (B <= 6) {
                        bla += i.next();
                        if (B == 6) {
                            TextView topSix = (TextView) findViewById(R.id.topSix_H);
                            topSix.setVisibility(View.VISIBLE);
                        }

                    } else {
                        //not sure here but doing something to set a catch..
                        bla2 += i.next();
                    }
                }


                // set the total on the screen
                TextView BigTotal1 = (TextView) findViewById(R.id.total_H);
                BigTotal1.setText("" + bla);

                TextView totalSub = (TextView) findViewById(R.id.totalPointsValue);

                totalSub.setText("" + B);

                // log for all reports
                System.out.println("hello" + totalsArray.toString());

            }
        });

        Button H8 = (Button) findViewById(R.id.H8);
        H8.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                totalsArray.add(0);
                //sorting array
                Collections.sort(totalsArray, Collections.reverseOrder());
                int bla = 0;
                int bla2 = 0;


                Iterator<Integer> i;
                i = totalsArray.iterator();

                // create a var to cap the totals to 6
                int B = 0;
                // loop to sum
                while (i.hasNext()) {
                    B++;
                    if (B <= 6) {
                        bla += i.next();
                        if (B == 6) {
                            TextView topSix = (TextView) findViewById(R.id.topSix_H);
                            topSix.setVisibility(View.VISIBLE);
                        }

                    } else {
                        //not sure here but doing something to set a catch..
                        bla2 += i.next();
                    }
                }


                // set the total on the screen
                TextView BigTotal1 = (TextView) findViewById(R.id.total_H);
                BigTotal1.setText("" + bla);

                TextView totalSub = (TextView) findViewById(R.id.totalPointsValue);

                totalSub.setText("" + B);

                // log for all reports
                System.out.println("hello" + totalsArray.toString());

            }
        });

        Button X = (Button) findViewById(R.id.X);
        X.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent help = new Intent(HigherLevel.this, Help.class);
                startActivity(help);
            }
        });







        reset = (Button) findViewById(R.id.reset);
        reset.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {
                for (int i = 0; i < totals5.length; i++) {

                    totals5[i] = 0;
                }
                count = count + 1;
                TextView totalSub = (TextView) findViewById(R.id.totalPointsValue);
                totalSub.setText("" + 0);
                Intent resetIntent = new Intent(HigherLevel.this, MainActivity.class);
                startActivity(resetIntent);

            }
        });


        menu = (Button) findViewById(R.id.menu);
        menu.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {
                Intent highIntentMenu = new Intent(HigherLevel.this, menu.class);
                highIntentMenu.putIntegerArrayListExtra("numbersFromHigher", (ArrayList<Integer>) totalsArray);
                highIntentMenu.putExtra("myCount", count);

                startActivityForResult(highIntentMenu, 0);

            }
        });
    }


    //ActivityResult method..........


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        // TODO Auto-generated method stub
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == RESULT_OK) {


            Bundle basket = data.getExtras();
            final int addLinks = basket.getInt("addLinks");
            final int didMaths = basket.getInt("didMaths");
            final ArrayList<Integer> totalsArray = basket.getIntegerArrayList("numbersFromHigher");

            TextView BigTotal1 = (TextView) findViewById(R.id.total_H);
            Collections.sort(totalsArray, Collections.reverseOrder());
            int bla = 0;
            int bla2 = 0;


            Iterator<Integer> i;
            i = totalsArray.iterator();

            // create a var to cap the totals to 6
            int B = 0;
            // loop to sum
            while (i.hasNext()) {
                B++;
                if (B <= 6) {
                    bla += i.next();

                } else {
                    //not sure here but doing something to set a catch..
                    bla2 += i.next();
                }
            }


            // set the total on the screen
            //TextView BigTotal1 = (TextView)findViewById(R.id.total_H);
            BigTotal1.setText("" + bla);

            TextView totalSub = (TextView) findViewById(R.id.totalPointsValue);

            totalSub.setText("" + B);


            //start buttons again

            Button mainLinkView = (Button) findViewById(R.id.linkView);
            mainLinkView.setVisibility(View.INVISIBLE);


            Button H1 = (Button) findViewById(R.id.H1);
            H1.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {

                    totalsArray.add(100);
                    //sorting array
                    Collections.sort(totalsArray, Collections.reverseOrder());
                    int bla = 0;
                    int bla2 = 0;


                    Iterator<Integer> i;
                    i = totalsArray.iterator();

                    // create a var to cap the totals to 6
                    int B = 0;
                    // loop to sum
                    while (i.hasNext()) {
                        B++;
                        if (B <= 6) {
                            bla += i.next();
                            if (B == 6) {
                                TextView topSix = (TextView) findViewById(R.id.topSix_H);
                                topSix.setVisibility(View.VISIBLE);
                            }

                        } else {
                            //not sure here but doing something to set a catch..
                            bla2 += i.next();
                        }
                    }


                    // set the total on the screen
                    TextView BigTotal1 = (TextView) findViewById(R.id.total_H);
                    BigTotal1.setText("" + bla);

                    TextView totalSub = (TextView) findViewById(R.id.totalPointsValue);

                    totalSub.setText("" + B);

                    // log for all reports
                    System.out.println("hello" + totalsArray.toString());

                }
            });
            Button H2 = (Button) findViewById(R.id.H2);
            H2.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {

                    totalsArray.add(88);
                    //sorting array
                    Collections.sort(totalsArray, Collections.reverseOrder());
                    int bla = 0;
                    int bla2 = 0;


                    Iterator<Integer> i;
                    i = totalsArray.iterator();

                    // create a var to cap the totals to 6
                    int B = 0;
                    // loop to sum
                    while (i.hasNext()) {
                        B++;
                        if (B <= 6) {
                            bla += i.next();
                            if (B == 6) {
                                TextView topSix = (TextView) findViewById(R.id.topSix_H);
                                topSix.setVisibility(View.VISIBLE);
                            }

                        } else {
                            //not sure here but doing something to set a catch..
                            bla2 += i.next();
                        }
                    }


                    // set the total on the screen
                    TextView BigTotal1 = (TextView) findViewById(R.id.total_H);
                    BigTotal1.setText("" + bla);

                    TextView totalSub = (TextView) findViewById(R.id.totalPointsValue);

                    totalSub.setText("" + B);

                    // log for all reports
                    System.out.println("hello" + totalsArray.toString());

                }
            });

            Button H3 = (Button) findViewById(R.id.H3);
            H3.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {

                    totalsArray.add(77);
                    //sorting array
                    Collections.sort(totalsArray, Collections.reverseOrder());
                    int bla = 0;
                    int bla2 = 0;


                    Iterator<Integer> i;
                    i = totalsArray.iterator();

                    // create a var to cap the totals to 6
                    int B = 0;
                    // loop to sum
                    while (i.hasNext()) {
                        B++;
                        if (B <= 6) {
                            bla += i.next();
                            if (B == 6) {
                                TextView topSix = (TextView) findViewById(R.id.topSix_H);
                                topSix.setVisibility(View.VISIBLE);
                            }

                        } else {
                            //not sure here but doing something to set a catch..
                            bla2 += i.next();
                        }
                    }


                    // set the total on the screen
                    TextView BigTotal1 = (TextView) findViewById(R.id.total_H);
                    BigTotal1.setText("" + bla);

                    TextView totalSub = (TextView) findViewById(R.id.totalPointsValue);

                    totalSub.setText("" + B);

                    // log for all reports
                    System.out.println("hello" + totalsArray.toString());

                }
            });


            Button H4 = (Button) findViewById(R.id.H4);
            H4.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {

                    //sorting array
                    totalsArray.add(66);
                    Collections.sort(totalsArray, Collections.reverseOrder());
                    int bla = 0;
                    int bla2 = 0;


                    Iterator<Integer> i;
                    i = totalsArray.iterator();

                    // create a var to cap the totals to 6
                    int B = 0;
                    // loop to sum
                    while (i.hasNext()) {
                        B++;
                        if (B <= 6) {
                            bla += i.next();
                            if (B == 6) {
                                TextView topSix = (TextView) findViewById(R.id.topSix_H);
                                topSix.setVisibility(View.VISIBLE);
                            }

                        } else {
                            //not sure here but doing something to set a catch..
                            bla2 += i.next();
                        }
                    }


                    // set the total on the screen
                    TextView BigTotal1 = (TextView) findViewById(R.id.total_H);
                    BigTotal1.setText("" + bla);

                    TextView totalSub = (TextView) findViewById(R.id.totalPointsValue);

                    totalSub.setText("" + B);

                    // log for all reports
                    System.out.println("hello" + totalsArray.toString());

                }
            });


            Button H5 = (Button) findViewById(R.id.H5);
            H5.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    Button mainLinkView = (Button) findViewById(R.id.linkView);

                    totalsArray.add(56);
                    //sorting array
                    Collections.sort(totalsArray, Collections.reverseOrder());
                    int bla = 0;
                    int bla2 = 0;


                    Iterator<Integer> i;
                    i = totalsArray.iterator();

                    // create a var to cap the totals to 6
                    int B = 0;
                    // loop to sum
                    while (i.hasNext()) {
                        B++;
                        if (B <= 6) {
                            bla += i.next();
                            if (B == 6) {
                                TextView topSix = (TextView) findViewById(R.id.topSix_H);
                                topSix.setVisibility(View.VISIBLE);
                            }

                        } else {
                            //not sure here but doing something to set a catch..
                            bla2 += i.next();
                        }
                    }


                    // set the total on the screen
                    TextView BigTotal1 = (TextView) findViewById(R.id.total_H);
                    BigTotal1.setText("" + bla);


                    TextView totalSub = (TextView) findViewById(R.id.totalPointsValue);

                    totalSub.setText("" + B);

                    // log for all reports
                    System.out.println("hello" + totalsArray.toString());

                }
            });


            Button H6 = (Button) findViewById(R.id.H6);
            H6.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    Button mainLinkView = (Button) findViewById(R.id.linkView);

                    totalsArray.add(46);
                    //sorting array
                    Collections.sort(totalsArray, Collections.reverseOrder());
                    int bla = 0;
                    int bla2 = 0;


                    Iterator<Integer> i;
                    i = totalsArray.iterator();

                    // create a var to cap the totals to 6
                    int B = 0;
                    // loop to sum
                    while (i.hasNext()) {
                        B++;
                        if (B <= 6) {
                            bla += i.next();
                            if (B == 6) {
                                TextView topSix = (TextView) findViewById(R.id.topSix_H);
                                topSix.setVisibility(View.VISIBLE);
                            }

                        } else {
                            //not sure here but doing something to set a catch..
                            bla2 += i.next();
                        }
                    }


                    // set the total on the screen
                    TextView BigTotal1 = (TextView) findViewById(R.id.total_H);
                    BigTotal1.setText("" + bla);


                    TextView totalSub = (TextView) findViewById(R.id.totalPointsValue);

                    totalSub.setText("" + B);

                    // log for all reports
                    System.out.println("hello" + totalsArray.toString());

                }
            });


            Button H7 = (Button) findViewById(R.id.H7);
            H7.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {

                    totalsArray.add(37);
                    //sorting array
                    Collections.sort(totalsArray, Collections.reverseOrder());
                    int bla = 0;
                    int bla2 = 0;


                    Iterator<Integer> i;
                    i = totalsArray.iterator();

                    // create a var to cap the totals to 6
                    int B = 0;
                    // loop to sum
                    while (i.hasNext()) {
                        B++;
                        if (B <= 6) {
                            bla += i.next();
                            if (B == 6) {
                                TextView topSix = (TextView) findViewById(R.id.topSix_H);
                                topSix.setVisibility(View.VISIBLE);
                            }

                        } else {
                            //not sure here but doing something to set a catch..
                            bla2 += i.next();
                        }
                    }


                    // set the total on the screen
                    TextView BigTotal1 = (TextView) findViewById(R.id.total_H);
                    BigTotal1.setText("" + bla);

                    TextView totalSub = (TextView) findViewById(R.id.totalPointsValue);

                    totalSub.setText("" + B);

                    // log for all reports
                    System.out.println("hello" + totalsArray.toString());

                }
            });

            Button H8 = (Button) findViewById(R.id.H8);
            H8.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {

                    totalsArray.add(0);
                    //sorting array
                    Collections.sort(totalsArray, Collections.reverseOrder());
                    int bla = 0;
                    int bla2 = 0;


                    Iterator<Integer> i;
                    i = totalsArray.iterator();

                    // create a var to cap the totals to 6
                    int B = 0;
                    // loop to sum
                    while (i.hasNext()) {
                        B++;
                        if (B <= 6) {
                            bla += i.next();
                            if (B == 6) {
                                TextView topSix = (TextView) findViewById(R.id.topSix_H);
                                topSix.setVisibility(View.VISIBLE);
                            }

                        } else {
                            //not sure here but doing something to set a catch..
                            bla2 += i.next();
                        }
                    }


                    // set the total on the screen
                    TextView BigTotal1 = (TextView) findViewById(R.id.total_H);
                    BigTotal1.setText("" + bla);

                    TextView totalSub = (TextView) findViewById(R.id.totalPointsValue);

                    totalSub.setText("" + B);

                    // log for all reports
                    System.out.println("hello" + totalsArray.toString());

                }
            });

            Button X = (Button) findViewById(R.id.X);
            X.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {

                    Intent help = new Intent(HigherLevel.this, Help.class);
                    startActivity(help);
                }
            });


            //resend total to ordinary level
            Button mainOrdView = (Button) findViewById(R.id.ordinaryView);
            mainOrdView.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    // TODO Auto-generated method stub

                    Intent highIntent2 = new Intent(HigherLevel.this, OrdinaryLevel.class);
                    highIntent2.putIntegerArrayListExtra("numbersFromHigher", (ArrayList<Integer>) totalsArray);
                    highIntent2.putExtra("didMaths", didMaths);
                    //startActivity(highIntent2);

                    startActivityForResult(highIntent2, 0);

                }

            });

            //Button mainLinkView = (Button)findViewById(R.id.linkView);
            mainLinkView.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    // TODO Auto-generated method stub

                    Intent highIntent3 = new Intent(HigherLevel.this, linksLevel.class);
                    highIntent3.putIntegerArrayListExtra("numbersFromHigher2", (ArrayList<Integer>) totalsArray);

                    //startActivity(highIntent3);
                    startActivityForResult(highIntent3, 0);

                }

            });


        }

    }


}

