package lap.hou.com.lesson6_retrofitandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ShowBookDetails extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_book_details);

        //Initializing Views
        TextView textViewBookId = (TextView) findViewById(R.id.textViewBookId);
        TextView textViewBookName = (TextView) findViewById(R.id.textViewBookName);
        TextView textViewBookPrice = (TextView) findViewById(R.id.textViewBookPrice);
        TextView textViewBookInStock = (TextView) findViewById(R.id.textViewBookInStock);

        //Getting intent
        Intent intent = getIntent();

        //Displaying values by fetching from intent
        textViewBookId.setText(String.valueOf(intent.getIntExtra(MainActivity.KEY_BOOK_ID, 0)));
        textViewBookName.setText(intent.getStringExtra(MainActivity.KEY_BOOK_NAME));
        textViewBookPrice.setText(intent.getStringExtra(MainActivity.KEY_BOOK_PRICE));
        textViewBookInStock.setText(String.valueOf(intent.getIntExtra(MainActivity.KEY_BOOK_STOCK,0)));
    }
}
