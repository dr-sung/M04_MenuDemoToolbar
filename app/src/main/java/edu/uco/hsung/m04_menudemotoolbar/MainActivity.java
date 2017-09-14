package edu.uco.hsung.m04_menudemotoolbar;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toolbar;

public class MainActivity extends Activity {

    private TextView display;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        display = (TextView) findViewById(R.id.display);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_list, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
            case R.id.menu_call:
                display.setText(R.string.menu_call);
                return true;
            case R.id.menu_edit:
                display.setText(R.string.menu_edit);
                return true;
            case R.id.submenu_copy:
                display.setText(R.string.menu_copy);
                return true;
            case R.id.submenu_paste:
                display.setText(R.string.submenu_paste);
                return true;
            case R.id.menu_email:
                display.setText(R.string.submenu_email);
                return true;
            case R.id.menu_text:
                display.setText(R.string.submenu_text);
                return true;
            case R.id.menu_buy:
                display.setText(R.string.submenu_buy);
                return true;
            case R.id.menu_sell:
                display.setText(R.string.submenu_sell);
                return true;
            case R.id.menu_trade:
                display.setText(R.string.submenu_trade);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}