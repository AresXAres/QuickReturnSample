package app.example.quickreturnsample;

import android.support.design.widget.CoordinatorLayout;
//import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ListView;

public class MainActivity extends Activity  {
	
	private CoordinatorLayout cdLayout;
	private ListView mList; 

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		mList = (ListView)findViewById(R.id.list);
		cdLayout = (CoordinatorLayout)findViewById(R.id.main_content);
		
		ArrayList<String> employeeList = new ArrayList<String>();
		ArrayAdapter myAdapter = new ArrayAdapter<String>(this, R.layout.item, employeeList);
		
		employeeList.add("Jerry");
		employeeList.add("Jerry");
		employeeList.add("Jerry"); 
		employeeList.add("Jerry");
		employeeList.add("Jerry");
		employeeList.add("Jerry");
		employeeList.add("Jerry");
		employeeList.add("Jerry");
		employeeList.add("Jerry");
		employeeList.add("Jerry");
		employeeList.add("Jerry");
		employeeList.add("Jerry");
		employeeList.add("Jerry");
		employeeList.add("Jerry");
		employeeList.add("Jerry");
		employeeList.add("Jerry");
		employeeList.add("Jerry");
		employeeList.add("Jerry");
		employeeList.add("Jerry");
		employeeList.add("Jerry");
		employeeList.add("Jerry");
		
		mList.setAdapter(myAdapter);
		
		Log.d("Debug", "Build.VERSION.SDK_INT="+Build.VERSION.SDK_INT);
		if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
			Log.d("Debug", "setNestedScrollingEnabled");
			mList.setNestedScrollingEnabled(true);
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
	
	
}
