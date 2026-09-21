package com.example.roomrental;
import android.content.DialogInterface;
import android.widget.TextView;
import android.os.Bundle;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        BottomNavigationView bottomNav = findViewById(R.id.bottomNavigation);
        bottomNav.setOnItemSelectedListener(item -> {
            int itemId = item.getItemId();
            if (itemId == R.id.nav_home) {
                return true;
            } else if (itemId == R.id.nav_explore) {
                return true;
            } else if (itemId == R.id.nav_saved) {
                return true;
            } else if (itemId == R.id.nav_messages) {
                return true;
            } else if (itemId == R.id.nav_profile) {
                return true;
            }
            return false;
        });
        TextView textView = findViewById(R.id.textView);

        String name = getIntent().getStringExtra("username");

        textView.setText(name);

        TextView exit = findViewById(R.id.tvSeeAll);
        exit.setOnClickListener(v -> {
            showDialog();
        });

        Toast.makeText(HomeActivity.this,
                "Login Successful ,Welcome " + name,
                Toast.LENGTH_SHORT).show();




    }

    public void showDialog(){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Exit");
        builder.setMessage("Do You Want To Close The Application?");
        builder.setPositiveButton("yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });
        builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });
        AlertDialog dialog = builder.create();
        dialog.show();
    }
}