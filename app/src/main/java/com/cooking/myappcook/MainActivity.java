package com.cooking.myappcook;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import java.text.NumberFormat;

import static android.R.attr.id;


public class MainActivity extends AppCompatActivity {

    int quantity = 2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /** this method is called when the button "Order" is clicked */

     public void submitOrder(View view) {
        int price = calculatePrice();
        String priceMessage = "That would be $" + price + "\nThanks.";
        displayMessage(priceMessage);

    }

    /**
     * Calculates the price of the order.
     *@return total price
     */
    private int calculatePrice() {
        int price = quantity * 5;
        return price;
    }



    /**
     * This method displays the given text on the screen.
     */
    private void displayMessage(String message) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(message);

    }
    public void increment(View view) {
        quantity = quantity + 1;
        displayQuantity(quantity);
    }

    public void decrement (View view) {
        quantity = quantity - 1;
        displayQuantity(quantity);
    }

    private void displayQuantity(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }
    /** This method display the given quantity value on the screen */

    private void displayPrice(int number) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }

}



