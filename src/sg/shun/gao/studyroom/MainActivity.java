package sg.shun.gao.studyroom;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {
	
	static final String TAG = MainActivity.class.getSimpleName();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		Button button = (Button) findViewById(R.id.button1);
		OnClickListener listener = new OpenNewActivityListener();
		button.setOnClickListener(listener);
		
		EditText editText = (EditText) findViewById(R.id.editText);
		Editable editable = editText.getText();
	}
	
	class OpenNewActivityListener implements OnClickListener {

		@Override
		public void onClick(View v) {
			Log.v(TAG, "OpenNewActivityListener.onClick()");
			
			Intent intent = new Intent(MainActivity.this, SecondActivity.class);
			startActivity(intent);
		}
		
	}
}
