package edu.ntu.csie.agent.sweetreward;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.util.Log;

public class SettingActivity extends FragmentActivity {
	private static final String TAG = SettingActivity.class.getSimpleName();
	
	private LoginFragment mFacebookLoginFragment;
		
	@Override
    protected void onCreate(Bundle savedInstanceState) {
		Log.d(TAG, "Start SettingActivity");
		
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);
        
        if (savedInstanceState == null) {
            // Add the fragment on initial activity setup
            mFacebookLoginFragment = new LoginFragment();
            getSupportFragmentManager()
            .beginTransaction()
            .add(android.R.id.content, mFacebookLoginFragment)
            .commit();
        } else {
            // Or set the fragment from restored state info
            mFacebookLoginFragment = (LoginFragment) getSupportFragmentManager()
            .findFragmentById(android.R.id.content);
        }
        
   
    }
}
