package com.tim.fragmentswithdrawer;

import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    static Fragment fragment;
    Button btnMain;
    FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        btnMain = (Button) findViewById(R.id.btn_main);
        btnMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fragment = Fragment1.newInstance();
                FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.content_main, fragment);
                fragmentTransaction.addToBackStack(null);
                btnMain.setVisibility(View.GONE);
                fragmentTransaction.commit();
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
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

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {

        FragmentTransaction fragmentTransaction;
        fragmentManager = getSupportFragmentManager();
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.item_f1) {
            fragment = Fragment1.newInstance();
            btnMain.setVisibility(View.GONE);

            if(fragmentManager.findFragmentByTag(Fragment1.TAG) == null)
            {
                fragmentTransaction = fragmentManager.beginTransaction()
                        .replace(R.id.content_main, fragment, Fragment1.TAG)
                        .addToBackStack(null);
                fragmentTransaction.commit();
            }

        } else if (id == R.id.item_f2) {
            fragment = Fragment2.newInstance();
            btnMain.setVisibility(View.GONE);

            if(fragmentManager.findFragmentByTag(Fragment2.TAG) == null)
            {
                fragmentTransaction = fragmentManager.beginTransaction()
                        .replace(R.id.content_main, fragment, Fragment2.TAG)
                        .addToBackStack(null);
                fragmentTransaction.commit();
            }

        } else if (id == R.id.item_f3) {
            fragment = Fragment3.newInstance();
            if(fragmentManager.findFragmentByTag(Fragment3.TAG) == null)
            {
                fragmentTransaction = fragmentManager.beginTransaction()
                        .replace(R.id.content_main, fragment, Fragment3.TAG)
                        .addToBackStack(null);
                fragmentTransaction.commit();
            }

        } else if (id == R.id.item_f4) {
            fragment = Fragment4.newInstance();
            if(fragmentManager.findFragmentByTag(Fragment4.TAG) == null)
            {
                fragmentTransaction = fragmentManager.beginTransaction()
                        .replace(R.id.content_main, fragment, Fragment4.TAG)
                        .addToBackStack(null);
                fragmentTransaction.commit();
            }

        } else if (id == R.id.item_f5) {
            fragment = Fragment5.newInstance();
            if(fragmentManager.findFragmentByTag(Fragment5.TAG) == null)
            {
                fragmentTransaction = fragmentManager.beginTransaction()
                        .replace(R.id.content_main, fragment, Fragment5.TAG)
                        .addToBackStack(null);
                fragmentTransaction.commit();
            }
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
