package sunypoly.kanallr.com.pathfindermasterii;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import sunypoly.kanallr.com.pathfindermasterii.R;

/**
 * Created by XPS L502X on 4/8/2017.
 */

public class FragmentTestDir extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        //Inflate the layout for this fragment

        return inflater.inflate(
                R.layout.test_dir, container, false);
    }
}