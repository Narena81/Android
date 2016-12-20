package app.myrecipes.android.narena.com.criminalintent;

import android.os.Bundle;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;


public class CrimeActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crime);
        //Get fragment menager
       FragmentManager fm = getSupportFragmentManager();

        Fragment fragment = fm.findFragmentById(R.id.fragment_container);
/*This code  creates and commit a fragments. Fragment transactions are used to add, remove, attach, detach,
*or replace fragmens in the fragment list.

*/
        if (fragment == null){
            fragment = new CrimeFragment();
            fm.beginTransaction().add(R.id.fragment_container,fragment).commit();
        }



    }




}
