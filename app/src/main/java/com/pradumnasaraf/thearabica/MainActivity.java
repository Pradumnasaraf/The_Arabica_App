package com.pradumnasaraf.thearabica;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    int quantity1 = 0;
    int quantity2 = 0;
    int quantity3 = 0;
    int quantity4 = 0;
    int quantity5 = 0;
    float TotalAmount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button minus1 = findViewById(R.id.minusButton1);
        Button minus2 = findViewById(R.id.minusButton2);
        Button minus3 = findViewById(R.id.minusButton3);
        Button minus4 = findViewById(R.id.minusButton4);
        Button minus5 = findViewById(R.id.minusButton5);
        Button plus1 = findViewById(R.id.plusButton1);
        Button plus2 = findViewById(R.id.plusButton2);
        Button plus3 = findViewById(R.id.plusButton3);
        Button plus4 = findViewById(R.id.plusButton4);
        Button plus5 = findViewById(R.id.plusButton5);


        minus1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (quantity1 == 0) {
                    Toast.makeText(MainActivity.this, "Quantity Can't Be Less Than 0", Toast.LENGTH_SHORT).show();
                } else {
                    quantity1--;
                    TotalAmount -= 1 * 2.0;
                    displayQuantity1();
                    Cal();
                }
            }
        });

        minus2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (quantity2 == 0) {
                    Toast.makeText(MainActivity.this, "Quantity Can't Be Less Than 0", Toast.LENGTH_SHORT).show();
                    return;
                }
                quantity2--;
                TotalAmount -= 1 * 3.0;
                displayQuantity2();
                Cal();
            }
        });

        minus3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (quantity3 == 0) {
                    Toast.makeText(MainActivity.this, "Quantity Can't Be Less Than 0", Toast.LENGTH_SHORT).show();
                } else {
                    quantity3--;
                    TotalAmount -= 1 * 3.5;
                    displayQuantity3();
                    Cal();
                }
            }
        });

        minus4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (quantity4 == 0) {
                    Toast.makeText(MainActivity.this, "Quantity Can't Be Less Than 0", Toast.LENGTH_SHORT).show();
                } else {
                    quantity4--;
                    TotalAmount -= 1 * 3.5;
                    displayQuantity4();
                    Cal();
                }
            }
        });

        minus5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (quantity5 == 0) {
                    Toast.makeText(MainActivity.this, "Quantity Can't Be Less Than 0", Toast.LENGTH_SHORT).show();
                } else {
                    quantity5--;
                    TotalAmount -= 1 * 3.7;
                    displayQuantity5();
                    Cal();
                }
            }
        });
        plus1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (quantity1 == 10) {
                    Toast.makeText(MainActivity.this, "You Can't Have More Than 10 Cups Of Coffee", Toast.LENGTH_SHORT).show();
                } else {
                    quantity1++;
                    TotalAmount += 1 * 2.0;
                    displayQuantity1();
                    Cal();
                }
            }
        });

        plus2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (quantity2 == 10) {
                    Toast.makeText(MainActivity.this, "You Can't Have More Than 10 Cups Of Coffee",
                            Toast.LENGTH_SHORT).show();
                } else {
                    quantity2++;
                    TotalAmount += 1 * 3.0;
                    displayQuantity2();
                    Cal();
                }
            }
        });

        plus3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (quantity3 == 10) {
                    Toast.makeText(MainActivity.this, "You Can't Have More Than 10 Cups Of Coffee", Toast.LENGTH_SHORT).show();
                } else {
                    quantity3++;
                    TotalAmount += 1 * 3.5;
                    displayQuantity3();
                    Cal();
                }
            }
        });

        plus4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (quantity4 == 10) {
                    Toast.makeText(MainActivity.this, "You Can't Have More Than 10 Cups Of Coffee", Toast.LENGTH_SHORT).show();
                } else {
                    quantity4++;
                    TotalAmount += 1 * 3.5;
                    displayQuantity4();
                    Cal();
                }
            }
        });

        plus5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (quantity5 == 10) {
                    Toast.makeText(MainActivity.this, "You Can't Have More Than 10 Cups Of Coffee", Toast.LENGTH_SHORT).show();
                } else {
                    quantity5++;
                    TotalAmount += 1 * 3.7;
                    displayQuantity5();
                    Cal();
                }
            }
        });

    }

    private void displayQuantity1() {
        TextView t = findViewById(R.id.productQuantityView1);
        t.setText(String.valueOf(quantity1));
    }

    private void displayQuantity2() {
        TextView t = findViewById(R.id.productQuantityView2);
        t.setText(String.valueOf(quantity2));
    }

    private void displayQuantity3() {
        TextView t = findViewById(R.id.productQuantityView3);
        t.setText(String.valueOf(quantity3));
    }

    private void displayQuantity4() {
        TextView t = findViewById(R.id.productQuantityView4);
        t.setText(String.valueOf(quantity4));
    }

    private void displayQuantity5() {
        TextView t = findViewById(R.id.productQuantityView5);
        t.setText(String.valueOf(quantity5));
    }


    public void Cal() {

        TextView t = findViewById(R.id.Order_total);
        if (TotalAmount <= 0.0) {
            t.setText("$0 :-)");
        } else {
            t.setText("$" + new DecimalFormat("0.00").format(TotalAmount));
        }

    }


}