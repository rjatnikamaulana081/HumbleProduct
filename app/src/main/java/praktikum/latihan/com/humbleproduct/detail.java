package praktikum.latihan.com.humbleproduct;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class detail extends AppCompatActivity {

    private ImageView g_detail;
    private TextView d_nama, harga, note;
    String namaBrg, hargaBrg, notes;
    int gambar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        d_nama = findViewById(R.id.nama_brg);
        harga = findViewById(R.id.harga);
        note = findViewById(R.id.isinote);
        g_detail = findViewById(R.id.gambardetail);

        namaBrg=getIntent().getStringExtra("nama");
        d_nama.setText(namaBrg);
        hargaBrg=getIntent().getStringExtra("harga");
        harga.setText(hargaBrg);
        notes=getIntent().getStringExtra("deskripsi");
        note.setText(notes);
        gambar=getIntent().getIntExtra("foto", 0);
        g_detail.setImageResource(gambar);
    }
}
