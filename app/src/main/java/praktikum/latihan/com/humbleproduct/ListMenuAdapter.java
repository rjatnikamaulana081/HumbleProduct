package praktikum.latihan.com.humbleproduct;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListMenuAdapter extends RecyclerView.Adapter<ListMenuAdapter.ListMenuViewHolder> {

    //deklarasi global variabel
    private Context context;
    private final ArrayList<MenuModel> listResto;

    //konstruktor untuk menerima data adapter
    public ListMenuAdapter(Context context, ArrayList<MenuModel> listResto) {
        this.context = context;
        this.listResto = listResto;
    }

    //view holder berfungsi untuk setting list item yang digunakan
    @Override
    public ListMenuViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View mItemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list, null, false);

        RecyclerView.LayoutParams layoutParams = new RecyclerView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        mItemView.setLayoutParams(layoutParams);

        return new ListMenuViewHolder(mItemView, this);
    }

    //bind view holder berfungsi untuk set data ke view yang ditampilkan pada list item
    @Override
    public void onBindViewHolder(ListMenuViewHolder holder, int position) {
        final MenuModel mCurrent = listResto.get(position);
        holder.namaMenu.setText(mCurrent.getNamaBarang());
        holder.hargaMenu.setText(mCurrent.getHargaBarang());
        holder.gambarMenu.setImageResource(mCurrent.getFotoBarang());

    }

    //untuk menghitung jumlah data yang ada pada list
    @Override
    public int getItemCount() {
        return listResto.size();
    }

    public class ListMenuViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        private TextView namaMenu,hargaMenu,keteranganMenu,cvDetail;
        private ImageView gambarMenu;
        private CardView cdView;

        final ListMenuAdapter mAdapter;

        //untuk casting view yang digunakan pada list item
        public ListMenuViewHolder(View itemView, ListMenuAdapter adapter) {
            super(itemView);
            cdView = itemView.findViewById(R.id.cd_view);
            namaMenu = itemView.findViewById(R.id.nama_barang);
            hargaMenu = itemView.findViewById(R.id.harga);
            gambarMenu = itemView.findViewById(R.id.gambar);

            this.mAdapter = adapter;
            cdView.setOnClickListener(this);
        }

        //untuk menambah action click pada list item
        @Override
        public void onClick(View view) {
            int mPosition = getLayoutPosition();
            MenuModel element = listResto.get(mPosition);

            //intent ke main activity dengan passing data
            Intent i = new Intent(context, detail.class);

            i.putExtra("nama", element.getNamaBarang());
            i.putExtra("harga", element.getHargaBarang());
            i.putExtra("deskripsi", element.getDeskripsiMenu());
            i.putExtra("foto", element.getFotoBarang());

            context.startActivity(i);
            mAdapter.notifyDataSetChanged();
        }
    }
}