package com.digisinage.realmdatabase;


import android.app.Application;

import io.realm.Realm;
import io.realm.RealmConfiguration;

/**
 * this is the first class that is initialized when the app runs, declare that in manifest too
 */
public class MyApplication extends Application {

	@Override
	public void onCreate() {
		super.onCreate();

		Realm.init(this);

		RealmConfiguration configuration = new RealmConfiguration.Builder() // this simply returns the builder object, .build will return confugration obj
				.name("myFirstRealm.realm") // By default the name of db is "default.realm"
				.build();

		Realm.setDefaultConfiguration(configuration);
	}
}
