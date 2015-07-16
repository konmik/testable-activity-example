package info.android15.testableactivity;

import android.os.Bundle;

public class MainActivity extends ControlledActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setController(new MainActivityController(this));
        super.onCreate(savedInstanceState);
    }
}
