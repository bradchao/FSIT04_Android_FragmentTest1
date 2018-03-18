package tw.org.iii.myfragmenttest1;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private F1 f1;
    private F2 f2;
    private FragmentManager fmgr;
    private FragmentTransaction tran;
    private boolean isF1;
    private TextView title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        title = findViewById(R.id.title);

        f1 = new F1(); f2 = new F2();
        fmgr = getSupportFragmentManager();

        tran = fmgr.beginTransaction();
        tran.add(R.id.container, f1);
        tran.commit();

        isF1 = true;
    }

    public void change(View view) {
        isF1 = !isF1;

        tran = fmgr.beginTransaction();
        tran.replace(R.id.container, isF1?f1:f2);
        //tran.addToBackStack(null);
        tran.commit();
    }

    public void changeF1Title(View view) {
        f1.setMyTitle("" + (int)(Math.random()*49+1));
    }

    public void setMainTitle(String newTitle){
        title.setText(newTitle);
    }

}
