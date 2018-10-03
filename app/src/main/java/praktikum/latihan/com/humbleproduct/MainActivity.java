package praktikum.latihan.com.humbleproduct;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btn_alamat, btn_belanja, btn_telepon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_alamat = (Button) findViewById(R.id.btn_alamat);
        btn_alamat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Intent.ACTION_VIEW,Uri.parse("http://maps.google.com/maps?sddr=-6.917314&daddr=107.721009"));
                startActivity(intent);
            }
        });

        btn_belanja = (Button) findViewById(R.id.btn_belanja);
        btn_belanja.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,menu.class);
                startActivity(intent);
            }
        });

        btn_telepon = (Button) findViewById(R.id.btn_telepon);
        btn_telepon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:+2685722924777"));
                startActivity(intent);
            }
        });
    }
}
