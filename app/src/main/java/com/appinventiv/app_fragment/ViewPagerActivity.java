package com.appinventiv.app_fragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.util.Log;

import com.appinventiv.app_fragment.Fragments.BlankFragment;
import com.appinventiv.app_fragment.Fragments.BlankFragment1;
import com.appinventiv.app_fragment.Fragments.BlankFragment2;
import com.appinventiv.app_fragment.Fragments.BlankFragment3;
import com.appinventiv.app_fragment.Fragments.BlankFragment4;
import com.appinventiv.app_fragment.Fragments.ScreenSlidePageFragment;
import com.appinventiv.app_fragment.Fragments.ZoomOutPageTransformer;

public class ViewPagerActivity extends FragmentActivity {

    private static final int NUM_PAGES = 10;

    private ViewPager mPager;

    private PagerAdapter pagerAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_pager);


        mPager = (ViewPager) findViewById(R.id.pager);
        mPager.setPageTransformer(true, new ZoomOutPageTransformer());
        pagerAdapter = new ScreenSlidePagerAdapter(getSupportFragmentManager());
        mPager.setAdapter(pagerAdapter);
    }

    @Override
    public void onBackPressed() {
        if (mPager.getCurrentItem() == 0) {

            super.onBackPressed();
        } else {
            mPager.setCurrentItem(mPager.getCurrentItem() - 1);
        }
    }

    private class ScreenSlidePagerAdapter extends FragmentStatePagerAdapter {
        public ScreenSlidePagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            switch(position)
            {
                case 0: return new BlankFragment();
                case 1: return new BlankFragment1();
                case 2: return new BlankFragment2();
                case 3: return new BlankFragment3();
                case 4: return new BlankFragment4();
                default : return new ScreenSlidePageFragment();
            }
        }

        @Override
        public int getCount() {
            return NUM_PAGES;
        }
    }
}
