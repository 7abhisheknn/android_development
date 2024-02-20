package com.example.d08_currency_converter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {
    Map<String, Double> curr1USD = new HashMap<String, Double>() {{
        put("US Dollar", 1.00);
        put("Argentine Peso", 837.163728);
        put("Australian Dollar", 1.522177);
        put("Bahraini Dinar", 0.376);
        put("Botswana Pula", 13.698725);
        put("Brazilian Real", 4.930404);
        put("British Pound", 0.790304);
        put("Bruneian Dollar", 1.343186);
        put("Bulgarian Lev", 1.805736);
        put("Canadian Dollar", 1.35092);
        put("Chilean Peso", 963.18295);
        put("Chinese Yuan Renminbi", 7.190595);
        put("Colombian Peso", 3909.125812);
        put("Czech Koruna", 23.441214);
        put("Danish Krone", 6.882227);
        put("Emirati Dirham", 3.6725);
        put("Euro", 0.923258);
        put("Hong Kong Dollar", 7.820986);
        put("Hungarian Forint", 358.243207);
        put("Icelandic Krona", 137.108651);
        put("Indian Rupee", 82.915301);
        put("Indonesian Rupiah", 15643.44597);
        put("Iranian Rial", 42009.94968);
        put("Israeli Shekel", 3.671086);
        put("Japanese Yen", 149.832608);
        put("Kazakhstani Tenge", 453.347444);
        put("Kuwaiti Dinar", 0.30772);
        put("Libyan Dinar", 4.844869);
        put("Malaysian Ringgit", 4.797623);
        put("Mauritian Rupee", 45.766203);
        put("Mexican Peso", 17.009809);
        put("Nepalese Rupee", 132.726668);
        put("New Zealand Dollar", 1.617676);
        put("Norwegian Krone", 10.455219);
        put("Omani Rial", 0.385011);
        put("Pakistani Rupee", 279.501177);
        put("Philippine Peso", 56.004115);
        put("Polish Zloty", 3.989458);
        put("Qatari Riyal", 3.64);
        put("Romanian New Leu", 4.594954);
        put("Russian Ruble", 91.847153);
        put("Saudi Arabian Riyal", 3.75);
        put("Singapore Dollar", 1.343186);
        put("South African Rand", 18.91228);
        put("South Korean Won", 1332.758148);
        put("Sri Lankan Rupee", 311.932652);
        put("Swedish Krona", 10.349391);
        put("Swiss Franc", 0.87961);
        put("Taiwan New Dollar", 31.447309);
        put("Thai Baht", 35.989864);
        put("Trinidadian Dollar", 6.787338);
        put("Turkish Lira", 30.913771);
        put("Venezuelan Bolivar", 3619178.30);
    }};
    private String[] currency = {
            "US Dollar",
            "Argentine Peso",
            "Australian Dollar",
            "Bahraini Dinar",
            "Botswana Pula",
            "Brazilian Real",
            "British Pound",
            "Bruneian Dollar",
            "Bulgarian Lev",
            "Canadian Dollar",
            "Chilean Peso",
            "Chinese Yuan Renminbi",
            "Colombian Peso",
            "Czech Koruna",
            "Danish Krone",
            "Emirati Dirham",
            "Euro",
            "Hong Kong Dollar",
            "Hungarian Forint",
            "Icelandic Krona",
            "Indian Rupee",
            "Indonesian Rupiah",
            "Iranian Rial",
            "Israeli Shekel",
            "Japanese Yen",
            "Kazakhstani Tenge",
            "Kuwaiti Dinar",
            "Libyan Dinar",
            "Malaysian Ringgit",
            "Mauritian Rupee",
            "Mexican Peso",
            "Nepalese Rupee",
            "New Zealand Dollar",
            "Norwegian Krone",
            "Omani Rial",
            "Pakistani Rupee",
            "Philippine Peso",
            "Polish Zloty",
            "Qatari Riyal",
            "Romanian New Leu",
            "Russian Ruble",
            "Saudi Arabian Riyal",
            "Singapore Dollar",
            "South African Rand",
            "South Korean Won",
            "Sri Lankan Rupee",
            "Swedish Krona",
            "Swiss Franc",
            "Taiwan New Dollar",
            "Thai Baht",
            "Trinidadian Dollar",
            "Turkish Lira",
            "Venezuelan Bolivar"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize the AutoCompleteTextView
        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) findViewById(R.id.fromCurrency);

// Create an ArrayAdapter with the options array
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, currency);

// Set the ArrayAdapter to the AutoCompleteTextView
        autoCompleteTextView.setAdapter(adapter);

        autoCompleteTextView = (AutoCompleteTextView) findViewById(R.id.toCurrency);

// Create an ArrayAdapter with the options array
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, currency);

// Set the ArrayAdapter to the AutoCompleteTextView
        autoCompleteTextView.setAdapter(adapter);

    }
}