package htl.grieskirchen.androidstudio.kundenbersicht;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Customer> customers = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initUI();
    }

    private void initUI() {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(getAssets().open("customers_data.csv")))) {
            String line = br.readLine();
            while(line!=null){
                customers.add(new Customer(line));
                line = br.readLine();
            }
        }catch(Exception e){
            Log.e("initUI","Error at reading File");
        }
    }
}