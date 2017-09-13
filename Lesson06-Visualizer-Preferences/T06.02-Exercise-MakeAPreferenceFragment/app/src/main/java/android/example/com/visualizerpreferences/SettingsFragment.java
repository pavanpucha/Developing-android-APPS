package android.example.com.visualizerpreferences;

//import android.example.com.visualizerpreferences.R;
import android.os.Bundle;
import android.support.v7.preference.PreferenceFragmentCompat;

/**
 * Created by pavan on 9/12/2017.
 */


// Completed (5) In SettingsFragment's onCreatePreferences method add the preference file using the
// addPreferencesFromResource method

public class SettingsFragment extends PreferenceFragmentCompat {
    @Override
    public void onCreatePreferences(Bundle savedInstanceState, String rootKey) {
        addPreferencesFromResource(R.xml.pref_visualizer);
    }
}
