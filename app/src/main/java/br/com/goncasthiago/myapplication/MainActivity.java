package br.com.goncasthiago.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.app.Fragment;
import android.view.ViewGroup;


//Activity principal

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }




    //Activity do fragment

    public static class PlaceholderFragment extends Fragment {

        public PlaceholderFragment() {
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_main, container, false);
            
            String [ ] forecastArray = {"Today - Sunny 88/63","Tomorrow - Foggy 88/63","Wed - Asteroids 88/63","Thu - Heavy Rain 88/63", "Fri - HELP TRAPPED IN WEATHERSTATION 88/63"};
            
            List<String> weekForecast = new ArrayList<String>(Arrays.asList(forecastArray));
            return rootView;
        }
    }

}
