package com.example.msi.bonjourcafe;

import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.example.msi.bonjourcafe.Fragments.AllFragment;
import com.example.msi.bonjourcafe.Fragments.CoffeeFragment;
import com.example.msi.bonjourcafe.Fragments.IceBlendFragment;
import com.example.msi.bonjourcafe.Fragments.IceCreamFragment;
import com.example.msi.bonjourcafe.Fragments.LassiFragment;
import com.example.msi.bonjourcafe.Fragments.NuocEpFragment;
import com.example.msi.bonjourcafe.Fragments.SodaYFragment;
import com.example.msi.bonjourcafe.Fragments.TeaFragment;
import com.example.msi.bonjourcafe.Fragments.ThucUongTruyenThongFragment;
import com.example.msi.bonjourcafe.Fragments.YogustShakeFragment;
import com.nex3z.notificationbadge.NotificationBadge;

public class HomeActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    NotificationBadge badge;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
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
        getMenuInflater().inflate(R.menu.home, menu);
        View view=menu.findItem(R.id.cart).getActionView();
       // badge=(NotificationBadge)view.findViewById(R.id.badge);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.cart) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        Fragment fragment=null;

        switch (item.getItemId()){
            case R.id.nav_All:
                fragment=new AllFragment();
                break;
            case R.id.nav_Coffee:
                fragment=new CoffeeFragment();
                break;
            case R.id.nav_Yogust_Shake:
                fragment=new YogustShakeFragment();
                break;
            case R.id.nav_SodaY:
                fragment=new SodaYFragment();
                break;
            case R.id.nav_IceCream:
                fragment=new IceCreamFragment();
                break;
            case R.id.nav_NuocEp:
                fragment=new NuocEpFragment();
                break;
            case R.id.nav_Lassi:
                fragment=new LassiFragment();
                break;
            case R.id.nav_Tea:
                fragment=new TeaFragment();
                break;
            case R.id.nav_IceBlend:
                fragment=new IceBlendFragment();
                break;
            case R.id.nav_TraditionalDrink:
                fragment=new ThucUongTruyenThongFragment();
                break;
        }

        if (fragment != null) {
            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            ft.replace(R.id.containerID, fragment);
            ft.commit();
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
