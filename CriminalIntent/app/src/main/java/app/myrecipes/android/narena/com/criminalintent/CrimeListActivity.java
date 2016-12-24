package app.myrecipes.android.narena.com.criminalintent;


import android.support.v4.app.Fragment;

/**
 * Created by ibrisimovicnarena on 12/22/16.
 */

public class CrimeListActivity extends SingleFragmentActivity {

    protected Fragment createFragment(){
        return  new CrimeListFragment();
    }
}
