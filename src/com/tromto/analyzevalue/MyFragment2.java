package com.tromto.analyzevalue;

import android.app.Fragment;
import android.os.Bundle;
import android.widget.Toast;

public class MyFragment2 extends Fragment {
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
        
      
    			Toast t = Toast.makeText(getActivity(), "fuck the police", Toast.LENGTH_LONG);
    			    t.show();
    		
        
    }

}
