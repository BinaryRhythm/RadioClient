package com.gwi.hiden;

import com.gwi.hiden.fragment.BroadcastFragment;
import com.gwi.hiden.fragment.MulticastFragment;
import com.gwi.hiden.fragment.ReceiveFragment;
import com.gwi.hiden.fragment.UnicastFragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;


public class TabFragmentAdapter extends FragmentPagerAdapter{

	public TabFragmentAdapter(FragmentManager fm) {
		super(fm);
	}

	@Override
	public Fragment getItem(int arg0) {
		Fragment ft = null;
		switch (arg0) {
		case 0: // broadcast
		   ft = new BroadcastFragment();
		break;
		case 1: // unicast
			ft = new UnicastFragment();
			break;
		case 2:  // multicast
			ft =  new MulticastFragment();
			break;
		case 3:
			ft = new ReceiveFragment();
			break;
		default:
//			ft = new UnicastFragment();			
//			Bundle args = new Bundle();
//			args.putString(MainActivity.ARGUMENTS_NAME, MainActivity.tabTitle[arg0]);
//			ft.setArguments(args);
//			
			break;
		}
		return ft;
	}

	@Override
	public int getCount() {
		
		return 4;//MainActivity.tabTitle.length;
	}
	
}