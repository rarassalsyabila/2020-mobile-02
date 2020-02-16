package id.putraprima.marketplacelayout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void chooseRegister(View view) {
        Intent intent = new Intent(this, register.class);
        startActivity(intent);
    }
    public void chooseLog(View view) {
        Intent intent = new Intent(this, profile.class);
        startActivity(intent);
    }
    public void chooseBack(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
