package praktikum.latihan.com.humbleproduct;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Adapter;
import android.widget.Button;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class ListMenuActivity extends AppCompatActivity {
    private Button belanja;
    RecyclerView mRecyclerView;
    ListMenuAdapter mAdapter;

    ArrayList<MenuModel> daftarBarang = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_menu);
        belanja= findViewById(R.id.shopping);

        String B1="Barang ini tebuat dari bahan berkualitas tinggi dan tentunya nyaman jika dipakai.Ukuran yang tersedia S-XXL, untuk pemesanan lebih banyak bakalan ada potongan harga.";
        String B2="Barang ini tebuat dari bahan berkualitas tinggi dan tentunya nyaman jika dipakai.Ukuran yang tersedia S-XXL, untuk pemesanan lebih banyak bakalan ada potongan harga.";
        String B3="Barang ini tebuat dari bahan berkualitas tinggi dan tentunya nyaman jika dipakai.Ukuran yang tersedia S-XXL, untuk pemesanan lebih banyak bakalan ada potongan harga.";
        String B4="Barang ini tebuat dari bahan berkualitas tinggi dan tentunya nyaman jika dipakai.Ukuran yang tersedia S-XXL, untuk pemesanan lebih banyak bakalan ada potongan harga.";
        String B5="Barang ini tebuat dari bahan berkualitas tinggi dan tentunya nyaman jika dipakai.Ukuran yang tersedia S-XXL, untuk pemesanan lebih banyak bakalan ada potongan harga.";
        String B6="Barang ini tebuat dari bahan berkualitas tinggi dan tentunya nyaman jika dipakai.Ukuran yang tersedia S-XXL, untuk pemesanan lebih banyak bakalan ada potongan harga.";
        String B7="Barang ini tebuat dari bahan berkualitas tinggi dan tentunya nyaman jika dipakai.Ukuran yang tersedia S-XXL, untuk pemesanan lebih banyak bakalan ada potongan harga.";

        daftarBarang.add(new MenuModel("T-Shirt Polos", "Rp. 55.000", B1, R.drawable.baju1));
        daftarBarang.add(new MenuModel("T-Shirt Panjang", "Rp. 70.000", B2, R.drawable.baju2));
        daftarBarang.add(new MenuModel("Polo Shirt", "Rp. 80.000", B3, R.drawable.baju3));
        daftarBarang.add(new MenuModel("Kemeja Flanel", "Rp. 225.000", B4, R.drawable.bflanel));
        daftarBarang.add(new MenuModel("Hoodie", "Rp. 250.000", B5, R.drawable.bhoodie));
        daftarBarang.add(new MenuModel("Jaket Jeans", "Rp. 350.000", B6, R.drawable.bjeans));
        daftarBarang.add(new MenuModel("Kemeja", "Rp. 180.000", B7, R.drawable.bkemeja));

        mRecyclerView = findViewById(R.id.rv_barang);
        mAdapter = new ListMenuAdapter(ListMenuActivity.this, daftarBarang);
        mRecyclerView.setAdapter(mAdapter);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        belanja.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ListMenuActivity.this,menu.class);
                startActivity(intent);

            }
        });

    }
}

