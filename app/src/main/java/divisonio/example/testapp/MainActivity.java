package divisonio.example.testapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    public void convertCurrency(View view) {

        EditText currencyInput = findViewById(R.id.editTextCurrencyInput);
        TextView convertedValue = findViewById(R.id.textViewValueConverted);

        double convertingValue = 1.200;

        if(currencyInput.getText().toString().isEmpty()) {
            Toast.makeText(this, "Please type in a value in USD ($)", Toast.LENGTH_SHORT).show();
        } else {
            double currencyInDollar = Double.parseDouble(currencyInput.getText().toString());
            double currencyInEuro = currencyInDollar / convertingValue;

            convertedValue.setText(String.format(Locale.getDefault(),"%.4f €", currencyInEuro));
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}