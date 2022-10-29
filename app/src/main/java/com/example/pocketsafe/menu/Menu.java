package com.example.pocketsafe.menu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;


import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.example.pocketsafe.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;

import java.util.ArrayList;
import java.util.List;

public class Menu extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private final List<Fragment> mFragmentList = new ArrayList<>();
    private ViewPager viewPager;
    private ViewPagerAdapter adapter;
    private NavigationView navigationView;
    MenuItem prevMenuItem;
    BottomNavigationView bottomBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_fragment2);

        viewPager = (ViewPager) findViewById(R.id.vp_horizontal);
        viewPager.setOffscreenPageLimit(100);
        adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new HomeFragment());
        adapter.addFragment(new RecordatoriosFragment());
        adapter.addFragment(new GastosFragment());
        viewPager.setAdapter(adapter);
        viewPager.setCurrentItem(0);
         bottomBar = findViewById(R.id.bottom_navigation_id);

        bottomBar.setOnNavigationItemSelectedListener(
                new BottomNavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                        switch (item.getItemId()) {
                            case R.id.myhome:
                                viewPager.setCurrentItem(0);
                                break;
                            case R.id.gastos:
                                viewPager.setCurrentItem(1);
                                break;
                            case R.id.recordatorios:
                                viewPager.setCurrentItem(2);
                                break;
                        }
                        return false;
                    }
                });
        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                if (prevMenuItem != null) {
                    prevMenuItem.setChecked(false);
                }
                else {
                    bottomBar.getMenu().getItem(0).setChecked(false); }
                bottomBar.getMenu().getItem(position).setChecked(true);
                prevMenuItem = bottomBar.getMenu().getItem(position);
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.myhome) {
            viewPager.setCurrentItem(0);
            Intent intent = new Intent( Menu.this, HomeFragment.class);
            startActivity(intent);
        }
        return false;
    }

    class ViewPagerAdapter extends FragmentPagerAdapter {
                    public ViewPagerAdapter(FragmentManager manager) {
                    super(manager);
                    }

        @NonNull
        @Override
        public Fragment getItem(int position) {
            return mFragmentList.get(position);
        }

        @Override
        public int getCount() {
            return mFragmentList.size();
        }

        public void addFragment(Fragment fragment) {
                        mFragmentList.add(fragment);
        }
    }
}