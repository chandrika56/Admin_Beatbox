package com.example.android.admin;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

public class Nav extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_nav);
        Toolbar toolbar = (Toolbar) findViewById (R.id.toolbar);
        setSupportActionBar (toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById (R.id.fab);
        fab.setOnClickListener (new View.OnClickListener ( ) {
            @Override
            public void onClick(View view) {
                Snackbar.make (view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction ("Action", null).show ( );
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById (R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle (
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener (toggle);
        toggle.syncState ( );

        NavigationView navigationView = (NavigationView) findViewById (R.id.nav_view);
        navigationView.setNavigationItemSelectedListener (this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById (R.id.drawer_layout);
        if (drawer.isDrawerOpen (GravityCompat.START)) {
            drawer.closeDrawer (GravityCompat.START);
        } else {
            super.onBackPressed ( );
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater ( ).inflate (R.menu.nav, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId ( );

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected (item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId ( );

        if (id == R.id.new_vid) {
            startActivity (new Intent (this,MainActivity.class));
            // Handle the camera action
        } else if (id == R.id.viral) {
            startActivity (new Intent (this,viralvid.class));}
            else if (id == R.id.eve) {
                startActivity (new Intent (this,Eve.class));}

        else if (id == R.id.tutor) {
            startActivity (new Intent (this,Beatbox_classes.class));}
        else if (id == R.id.viewtutor) {
            startActivity (new Intent (this,Viewtutor.class));}

        else if (id == R.id.meet) {
                startActivity (new Intent (this,Meet.class));
        } else if (id == R.id.learn) {
            startActivity (new Intent (this,Learning_vid.class));
        } else if (id == R.id.solo) {
            startActivity (new Intent (this,Solo.class));
        } else if (id == R.id.tag) {startActivity (new Intent (this,Tag.class));

        } else if (id == R.id.smoke) {startActivity (new Intent (this,Smoke.class));

        }
        else if (id == R.id.loop) {startActivity (new Intent (this,Loop.class));

        }
        else if (id == R.id.crew) {startActivity (new Intent (this,Crew.class));

        }
        else if (id == R.id.jam) {startActivity (new Intent (this,jamming.class));

        }
        else if (id == R.id.studio_sess) {startActivity (new Intent (this,Studio.class));

        }
        else if (id == R.id.Beat_club) {startActivity (new Intent (this,Beats_club.class));

        }
        else if (id == R.id.all_vid) {startActivity (new Intent (this,All_vid.class));

        }
        else if (id == R.id.classes) {startActivity (new Intent (this,Beatbox_classes.class));

        }
        else if (id == R.id.event) {startActivity (new Intent (this,Events.class));

        }
        else if (id == R.id.meetup) {startActivity (new Intent (this,Meetup.class));

        }

        DrawerLayout drawer = (DrawerLayout) findViewById (R.id.drawer_layout);
        drawer.closeDrawer (GravityCompat.START);
        return true;
    }
}
