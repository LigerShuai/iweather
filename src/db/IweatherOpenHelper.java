package db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class IweatherOpenHelper extends SQLiteOpenHelper{

	public IweatherOpenHelper(Context context, String name,
			CursorFactory factory, int version) {
		super(context, name, factory, version);
	}

	//Province表的建表语句，将其定义为常量 
	public static final String CREATE_PROVINCE = "create table Province ("+"id integer primary key autoincrement,"
	+ "province_name text,"
	+ "province_code text)";
	
	//City
	public static final String CREATE_CITY = "create table City ("
	+"id integer primary key autoincrement,"
	+ "city_name text,"
	+ "city_code text,"
	+ "province_id integer)";
	
	//County
	public static final String CREATE_COUNTY = "create table County("
			+ "id integer primary key autoincrement,"
			+ "county_name text,"
			+ "county_code text"
			+ "city_id integer)";
	
	

	@Override
	public void onCreate(SQLiteDatabase db) {
		db.execSQL(CREATE_PROVINCE);
		db.execSQL(CREATE_CITY);
		db.execSQL(CREATE_COUNTY);
		
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		
	}	
}

