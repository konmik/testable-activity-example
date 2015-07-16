package info.android15.testableactivity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;

import java.util.Random;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivityController extends BaseControlledActivity.Controller {

    private Activity activity;

    @Bind(R.id.buttonClickMe) Button clickMe;

    public MainActivityController(Activity activity) {
        this.activity = activity;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activity.setContentView(R.layout.activity_main);
        ButterKnife.bind(this, activity);
    }

    @OnClick(R.id.buttonClickMe)
    void onButtonClickMe() {
        clickMe.setBackgroundColor(new Random().nextInt());
    }
}
