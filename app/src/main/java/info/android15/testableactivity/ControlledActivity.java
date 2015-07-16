package info.android15.testableactivity;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.NonNull;

public class ControlledActivity extends Activity {

    public static abstract class Controller {

        protected void onCreate(Bundle savedInstanceState) {
        }

        protected void onResume() {
        }

        protected void onSaveInstanceState(@NonNull Bundle outState) {
        }

        protected void onPause() {
        }

        protected void onDestroy() {
        }
    }

    private Controller controller;

    public void setController(Controller controller) {
        this.controller = controller;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        controller.onCreate(savedInstanceState);
    }

    @Override
    protected void onResume() {
        super.onResume();
        controller.onResume();
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        controller.onSaveInstanceState(outState);
    }

    @Override
    protected void onPause() {
        super.onPause();
        controller.onPause();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        controller.onDestroy();
    }
}
