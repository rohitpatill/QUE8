package com.example.que8;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;

public class MainActivity extends AppCompatActivity {

    private Button colorButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        colorButton = findViewById(R.id.colorButton);

        colorButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showPopupMenu(v);
            }
        });
    }

    private void showPopupMenu(View view) {
        PopupMenu popupMenu = new PopupMenu(this, view);
        popupMenu.getMenuInflater().inflate(R.menu.popup_menu, popupMenu.getMenu());

        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                if (item.getItemId() == R.id.red) {
                    colorButton.setBackgroundColor(getResources().getColor(R.color.colorRed));
                } else if (item.getItemId() == R.id.green) {
                    colorButton.setBackgroundColor(getResources().getColor(R.color.colorGreen));
                } else if (item.getItemId() == R.id.blue) {
                    colorButton.setBackgroundColor(getResources().getColor(R.color.colorBlue));
                }
                return false;
            }
        });

        popupMenu.show();
    }
}
