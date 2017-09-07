package com.anisdroid.Create_Database;
import android.app.*;
import android.os.*;
import android.widget.*;
import java.util.*;
import android.database.*;

public class My_List_View extends Activity
{
	My_DB_Helper ddd;
	ListView lll;

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		// TODO: Implement this method
		super.onCreate(savedInstanceState);
		setContentView(R.layout.my_list_view);
		
		ddd = new My_DB_Helper(this);
		
		lll = (ListView) findViewById(R.id.my_list_id);
		
		ArrayList<String> al = new ArrayList<>();
		
		Cursor cr = ddd.viewData();
		
		while(cr.moveToNext()){
			
			al.add(cr.getString(1));
			
			ListAdapter la = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,al);
			lll.setAdapter(la);
			
		}
		
	}
	
}
