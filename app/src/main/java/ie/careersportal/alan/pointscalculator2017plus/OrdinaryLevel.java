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

public class OrdinaryLevel extends Activity {

    Button O1, O2, O3, O4, O5, O6, O7, O8, OD1,reset, menu;
    List<Integer> totalsArray = new ArrayList<Integer>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ordinary_level);
        int sum = 0;
        int count = 0;


        TextView BigTotal1 = (TextView) findViewById(R.id.total_H);
        Typeface typeFace = Typeface.createFromAsset(getAssets(),
                "fonts/Hoefler Text.ttf");
        BigTotal1.setTypeface(typeFace);

        // get variables from intent
        Bundle extras23 = getIntent().getExtras();
        final ArrayList<Integer> totalsArray = extras23
                .getIntegerArrayList("numbersFromHigher");
        final int addLinks = extras23.getInt("addLinks");
        final int didMaths = extras23.getInt("didMaths");







        // starts off total
        // TextView BigTotal1 = (TextView)findViewById(R.id.total_H);
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
                // not sure here but doing something to set a catch..
                bla2 += i.next();
            }
        }

        // set the total on the screen
        // TextView BigTotal1 = (TextView)findViewById(R.id.total_H);
        BigTotal1.setText("" + bla);
        // BigTotal1.setText(""+totals5[0]);
        TextView totalSub = (TextView) findViewById(R.id.totalPointsValue);

        totalSub.setText("" + B);




        if(didMaths == 999){
            TextView bonus = (TextView)findViewById(R.id.Bonus);

            bonus.setVisibility(View.VISIBLE);

        }

        // Start buttons

        Button O1 = (Button) findViewById(R.id.O1);

        O1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                totalsArray.add(56);

                // sorting array
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
                        // not sure here but doing something to set a catch..
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

        Button O2 = (Button) findViewById(R.id.O2);
        O2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                totalsArray.add(46);

                // sorting array
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
                        // not sure here but doing something to set a catch..
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

        Button O3 = (Button) findViewById(R.id.O3);
        O3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                totalsArray.add(37);

                // sorting array
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
                        // not sure here but doing something to set a catch..
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

        Button O4 = (Button) findViewById(R.id.O4);
        O4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                totalsArray.add(28);

                // sorting array
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
                        // not sure here but doing something to set a catch..
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

        Button O5 = (Button) findViewById(R.id.O5);
        O5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                totalsArray.add(20);

                // sorting array
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
                        // not sure here but doing something to set a catch..
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

        Button O6 = (Button) findViewById(R.id.O6);
        O6.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                totalsArray.add(12);

                // sorting array
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
                        // not sure here but doing something to set a catch..
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

        Button O7 = (Button) findViewById(R.id.O7);
        O7.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                totalsArray.add(0);

                // sorting array
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
                        // not sure here but doing something to set a catch..
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

        Button O8 = (Button) findViewById(R.id.O8);
        O8.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                totalsArray.add(0);

                // sorting array
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
                        // not sure here but doing something to set a catch..
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
                Intent help = new Intent(OrdinaryLevel.this, Help.class);
                startActivity(help);
            }
        });






        reset = (Button) findViewById(R.id.reset);
        reset.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent resetIntent = new Intent(OrdinaryLevel.this,
                        MainActivity.class);
                startActivity(resetIntent);

            }
        });

        menu = (Button) findViewById(R.id.menu);
        menu.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent highIntentMenu = new Intent(OrdinaryLevel.this,
                        menu.class);
                highIntentMenu.putIntegerArrayListExtra("numbersFromHigher",
                        (ArrayList<Integer>) totalsArray);
                // highIntentMenu.putExtra("myCount", count);

                startActivityForResult(highIntentMenu, 0);

            }
        });

        // Button mainLinkView = (Button)findViewById(R.id.linkView);

        Button mainLinkView = (Button) findViewById(R.id.linkView);
        mainLinkView.setVisibility(View.INVISIBLE);

        mainLinkView.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                int backVar = 9;
                Intent highIntent3 = new Intent(OrdinaryLevel.this,
                        linksLevel.class);
                highIntent3.putIntegerArrayListExtra("numbersFromHigher2",
                        (ArrayList<Integer>) totalsArray);
                highIntent3.putExtra("mybackVar", backVar);
                // startActivity(highIntent3);
                startActivityForResult(highIntent3, 0);

            }

        });

        Button mainOrdView = (Button) findViewById(R.id.higherView);

        mainOrdView.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub

                Intent highIntent3 = new Intent(OrdinaryLevel.this,
                        HigherLevel.class);
                // highIntent3.putIntegerArrayListExtra("numbersFromHigher",
                // (ArrayList<Integer>) totalsArray);
                // startActivity(highIntent2);
                Bundle backpack = new Bundle();
                backpack.putIntegerArrayList("numbersFromHigher",
                        (ArrayList<Integer>) totalsArray);
                highIntent3.putExtras(backpack);
                highIntent3.putExtra("addLinks", addLinks);
                highIntent3.putExtra("didMaths", didMaths);
                setResult(RESULT_OK, highIntent3);
                finish();

            }

        });

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        // TODO Auto-generated method stub
        super.onActivityResult(requestCode, resultCode, data);

        if (resultCode == RESULT_OK) {

            Button mainLinkView = (Button) findViewById(R.id.linkView);
            mainLinkView.setVisibility(View.INVISIBLE);



            Bundle basket = data.getExtras();
            final ArrayList<Integer> totalsArray = basket
                    .getIntegerArrayList("numbersFromHigher2");
            final int didMaths = basket.getInt("didMaths");


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
                    // not sure here but doing something to set a catch..
                    bla2 += i.next();
                }
            }

            // set the total on the screen
            // TextView BigTotal1 = (TextView)findViewById(R.id.total_H);
            BigTotal1.setText("" + bla);

            TextView totalSub = (TextView) findViewById(R.id.totalPointsValue);
            totalSub.setText("" + B);

            if(didMaths == 999){
                TextView bonus = (TextView)findViewById(R.id.Bonus);

                bonus.setVisibility(View.VISIBLE);

            }

            // start buttons again

            // Button mainLinkView = (Button)findViewById(R.id.linkView);
            mainLinkView.setVisibility(View.INVISIBLE);
            // Button didyoudo = (Button)findViewById(R.id.didyou);


            Button O1 = (Button) findViewById(R.id.O1);

            O1.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {

                    totalsArray.add(56);

                    // sorting array
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
                            // not sure here but doing something to set a
                            // catch..
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

            Button O2 = (Button) findViewById(R.id.O2);
            O2.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    totalsArray.add(46);

                    // sorting array
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
                            // not sure here but doing something to set a
                            // catch..
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

            Button O3 = (Button) findViewById(R.id.O3);
            O3.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    totalsArray.add(37);

                    // sorting array
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
                            // not sure here but doing something to set a
                            // catch..
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

            Button O4 = (Button) findViewById(R.id.O4);
            O4.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    totalsArray.add(28);

                    // sorting array
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
                            // not sure here but doing something to set a
                            // catch..
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

            Button O5 = (Button) findViewById(R.id.O5);
            O5.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    totalsArray.add(20);

                    // sorting array
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
                            // not sure here but doing something to set a
                            // catch..
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

            Button O6 = (Button) findViewById(R.id.O6);
            O6.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    totalsArray.add(12);

                    // sorting array
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
                            // not sure here but doing something to set a
                            // catch..
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

            Button O7 = (Button) findViewById(R.id.O7);
            O7.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {

                    totalsArray.add(0);
                    // sorting array
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
                            // not sure here but doing something to set a
                            // catch..
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

            Button O8 = (Button) findViewById(R.id.O8);
            O8.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    totalsArray.add(0);

                    // sorting array
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
                            // not sure here but doing something to set a
                            // catch..
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
                    Intent help = new Intent(OrdinaryLevel.this, Help.class);
                    startActivity(help);
                }
            });


            Button mainOrdView = (Button) findViewById(R.id.higherView);
            mainOrdView.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    // TODO Auto-generated method stub

                    Intent highIntent3 = new Intent(OrdinaryLevel.this,
                            HigherLevel.class);
                    // highIntent3.putIntegerArrayListExtra("numbersFromHigher",
                    // (ArrayList<Integer>) totalsArray);
                    // startActivity(highIntent2);
                    Bundle backpack = new Bundle();
                    backpack.putIntegerArrayList("numbersFromHigher",
                            (ArrayList<Integer>) totalsArray);
                    highIntent3.putExtras(backpack);

                    setResult(RESULT_OK, highIntent3);
                    finish();

                }

            });

        }

    }

}
