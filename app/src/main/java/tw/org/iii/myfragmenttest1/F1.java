package tw.org.iii.myfragmenttest1;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class F1 extends Fragment {
    private Button f1test1, f1test2;
    private View mainView;
    private TextView title;
    private MainActivity mainActivity;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.v("brad", "onCreate");

        mainActivity = (MainActivity) getActivity();

    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Log.v("brad", "onCreateView");
        if (mainView == null) {
            mainView = inflater.inflate(
                    R.layout.fragment_f1, container, false);
            title = mainView.findViewById(R.id.f1_title);
            f1test1 = mainView.findViewById(R.id.f1_test1);
            f1test1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    doTest1();
                }
            });
            f1test2 = mainView.findViewById(R.id.f1_test2);
            f1test2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    doTest2();
                }
            });
        }

        return mainView;
    }

    public void setMyTitle(String newTitle){
        title.setText(newTitle);
    }


    private void doTest1(){
        Log.v("brad", "doTest1");
    }

    private void doTest2(){
        mainActivity.setMainTitle("Brad");
    }


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.v("brad", "onAttach");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.v("brad", "onDetach");
    }


}
