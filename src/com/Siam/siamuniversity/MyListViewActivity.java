package com.Siam.siamuniversity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.AdapterView.OnItemClickListener;

public class MyListViewActivity extends Activity {
	ListView myListView;
    List <String> itemString=new ArrayList<String>();
    List <Object> itemImage=new ArrayList<Object>();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		 setContentView(R.layout.activity_my_list_view);

	        ArrayList<HashMap<String, Object>> listItem =new ArrayList<HashMap<String, Object>>();
	        myListView = (ListView) findViewById(R.id.listView1);
	        
	       

	        HashMap <String, Object> itemMap =new HashMap <String,Object>();
	        itemMap.put("itemString","xxx1" );
	        itemMap.put("itemImage",R.drawable.ic_launcher);
	        listItem.add(itemMap);

	        itemMap =new HashMap <String,Object>();
	        itemMap.put("itemString","xxx2" );
	        itemMap.put("itemImage",R.drawable.ic_launcher);
	        listItem.add(itemMap);

	        itemMap =new HashMap <String,Object>();
	        itemMap.put("itemString","xxx3" );
	        itemMap.put("itemImage",R.drawable.ic_launcher);
	        listItem.add(itemMap);
	        
	        itemMap =new HashMap <String,Object>();
	        itemMap.put("itemString","xxx3" );
	        itemMap.put("itemImage",R.drawable.ic_launcher);
	        listItem.add(itemMap);


	        SimpleAdapter mySimpleAdapter = new SimpleAdapter(this,listItem,R.layout.activity_my_list_view, new String[] { "itemString", "itemImage" },
	                new int[] { R.id.ItemString, R.id.ItemImage });

	        myListView.setAdapter(mySimpleAdapter);
	        myListView.setOnItemClickListener(new OnItemClickListener(){

	            @Override
	            public void onItemClick(AdapterView<?> arg0,View arg1, int arg2,long arg3){
	            	Intent one=null;
	            	switch (arg2){
	            	case 0:one=new Intent(MyListViewActivity.this,WordsTestActivity0.class);
	            	break;
	            	case 1:one=new Intent(MyListViewActivity.this,Word1Activity.class);
	            	break;
	            	case 2:one=new Intent(MyListViewActivity.this,Word2Activity.class);
	            	break;
	            	case 3:one=new Intent(MyListViewActivity.this,Word3Activity.class);
	            	break;
	            	}
	        		startActivity(one);
	            }
	        });
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.my_list_view, menu);
		return true;
	}

}
