package praktikum.latihan.com.humbleproduct;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class menu extends AppCompatActivity {

    @BindView(R.id.cb_baju1)
    CheckBox cbBaju1;
    @BindView(R.id.et_baju1)
    EditText etBaju1;
    @BindView(R.id.cb_baju2)
    CheckBox cbBaju2;
    @BindView(R.id.et_baju2)
    EditText etBaju2;
    @BindView(R.id.cb_baju3)
    CheckBox cbBaju3;
    @BindView(R.id.et_baju3)
    EditText etBaju3;
    @BindView(R.id.cb_baju4)
    CheckBox cbBaju4;
    @BindView(R.id.et_baju4)
    EditText etBaju4;
    @BindView(R.id.cb_baju5)
    CheckBox cbBaju5;
    @BindView(R.id.et_baju5)
    EditText etBaju5;
    @BindView(R.id.cb_baju6)
    CheckBox cbBaju6;
    @BindView(R.id.et_baju6)
    EditText etBaju6;
    @BindView(R.id.cb_baju7)
    CheckBox cbBaju7;
    @BindView(R.id.et_baju7)
    EditText etBaju7;
    int baju1 = 55000, baju2 = 70000, baju3 = 80000, baju4 = 225000, baju5 = 250000, baju6 = 350000, baju7 = 180000;
    int mBaju1 = 0, mBaju2 = 0, mBaju3 = 0, mBaju4 = 0, mBaju5 = 0, mBaju6 = 0, mBaju7 = 0;
    @BindView(R.id.btn_cekharga)
    Button btnCekharga;
    @BindView(R.id.tv_totalharga)
    TextView tvTotalharga;
    @BindView(R.id.btn_beli)
    Button btnBeli;
    @BindView(R.id.linearharga)
    LinearLayout linearharga;
    int i = 2;
    int jumlah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        ButterKnife.bind(this);
        init();
    }

    public void init() {
        etBaju1.setFocusable(false);
        etBaju2.setFocusable(false);
        etBaju3.setFocusable(false);
        etBaju4.setFocusable(false);
        etBaju5.setFocusable(false);
        etBaju6.setFocusable(false);
        etBaju7.setFocusable(false);
    }

    @OnClick({R.id.cb_baju1, R.id.cb_baju2, R.id.cb_baju3, R.id.cb_baju4, R.id.cb_baju5, R.id.cb_baju6,  R.id.cb_baju7, R.id.btn_cekharga, R.id.btn_beli})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.cb_baju1:
                if (cbBaju1.isChecked()) {
                    etBaju1.setFocusable(true);
                    etBaju1.setFocusableInTouchMode(true);
                }
                break;
            case R.id.cb_baju2:
                if (cbBaju2.isChecked()) {
                    etBaju2.setFocusable(true);
                    etBaju2.setFocusableInTouchMode(true);
                }
                break;
            case R.id.cb_baju3:
                if (cbBaju3.isChecked()) {
                    etBaju3.setFocusable(true);
                    etBaju3.setFocusableInTouchMode(true);
                }
                break;
            case R.id.cb_baju4:
                if (cbBaju4.isChecked()) {
                    etBaju4.setFocusable(true);
                    etBaju4.setFocusableInTouchMode(true);
                }
                break;
            case R.id.cb_baju5:
                if (cbBaju5.isChecked()) {
                    etBaju5.setFocusable(true);
                    etBaju5.setFocusableInTouchMode(true);
                }
                break;
            case R.id.cb_baju6:
                if (cbBaju6.isChecked()) {
                    etBaju6.setFocusable(true);
                    etBaju6.setFocusableInTouchMode(true);
                }
                break;
            case R.id.cb_baju7:
                if (cbBaju7.isChecked()) {
                    etBaju7.setFocusable(true);
                    etBaju7.setFocusableInTouchMode(true);
                }
                break;
            case R.id.btn_cekharga:
                if (i % 2 == 0) {
                    linearharga.setVisibility(View.VISIBLE);
                    if (!TextUtils.isEmpty(etBaju7.getText().toString())) {
                        mBaju7 = Integer.valueOf(etBaju7.getText().toString());
                    } else {
                        mBaju7 = 0;
                    }
                    if (!TextUtils.isEmpty(etBaju6.getText().toString())) {
                        mBaju6 = Integer.valueOf(etBaju6.getText().toString());
                    } else {
                        mBaju6 = 0;
                    }
                    if (!TextUtils.isEmpty(etBaju5.getText().toString())) {
                        mBaju5 = Integer.valueOf(etBaju5.getText().toString());
                    } else {
                        mBaju5 = 0;
                    }
                    if (!TextUtils.isEmpty(etBaju4.getText().toString())) {
                        mBaju4 = Integer.valueOf(etBaju4.getText().toString());
                    } else {
                        mBaju4 = 0;
                    }
                    if (!TextUtils.isEmpty(etBaju3.getText().toString())) {
                        mBaju3 = Integer.valueOf(etBaju3.getText().toString());
                    } else {
                        mBaju3 = 0;
                    }
                    if (!TextUtils.isEmpty(etBaju2.getText().toString())) {
                        mBaju2 = Integer.valueOf(etBaju2.getText().toString());
                    } else {
                        mBaju2 = 0;
                    }
                    if (!TextUtils.isEmpty(etBaju1.getText().toString())) {
                        mBaju1 = Integer.valueOf(etBaju1.getText().toString());
                    } else {
                        mBaju1 = 0;
                    }
                    jumlah = (mBaju1 * baju1) + (mBaju2 * baju2) + (mBaju3 * baju3) + (mBaju4 * baju4) + (mBaju5 * baju5) + (mBaju6 * baju6) + (mBaju7 * baju7);
                    tvTotalharga.setText(String.valueOf(jumlah));
                } else {
                    linearharga.setVisibility(View.GONE);
                }
                i++;
                break;
            case R.id.btn_beli:
                AlertDialog alertDialog = new AlertDialog.Builder(menu.this).create();
                alertDialog.setTitle(getString(R.string.nnn));
                alertDialog.setIcon(R.drawable.home1);
                alertDialog.setMessage(getString(R.string.mm));
                alertDialog.setButton(getString(R.string.y), new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(getApplicationContext(), getString(R.string.lll), Toast.LENGTH_SHORT).show();
                        Intent i = new Intent(menu.this, MainActivity.class);
                        startActivity(i);
                    }
                });
                alertDialog.show();
                break;
        }
    }
}
