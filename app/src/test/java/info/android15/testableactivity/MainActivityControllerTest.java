package info.android15.testableactivity;

import android.view.View;
import android.widget.Button;

import org.junit.Test;
import org.mockito.Mockito;

import static org.mockito.Matchers.any;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class MainActivityControllerTest {

    @Test
    public void testOnCreate() throws Exception {
        MainActivity activity = Mockito.mock(MainActivity.class);
        Button buttonClickMe = Mockito.mock(Button.class);
        when(activity.findViewById(R.id.buttonClickMe)).thenReturn(buttonClickMe);

        MainActivityController controller = new MainActivityController(activity);
        controller.onCreate(null);

        verify(buttonClickMe, times(1)).setOnClickListener(any(View.OnClickListener.class));
    }
}
