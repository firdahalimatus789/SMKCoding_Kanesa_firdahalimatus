package id.kanesacoding.biodata;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import static android.app.DatePickerDialog.*;

public class MainActivity extends AppCompatActivity {
    EditText namapanjang,namapanggilan,tempatlahir,alamat,hobi,status,umur,email,nohp;
    Spinner jkelamin;
    Button tglLahir, proses;
    TextView kalimatpengenalandiri;
    private Class<?> mTahun;
    private Class<?> mBulan;
    private Class<?> mHari;

    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        namapanjang = (EditText) findViewById(R.id.edt_namapanjang);
        namapanggilan = (EditText) findViewById(R.id.edt_namapanggilan);
        tempatlahir = (EditText) findViewById(R.id.edt_tempatlahir);
        alamat = (EditText) findViewById(R.id.edt_alamat);
        hobi = (EditText) findViewById(R.id.edt_hobi);
        status = (EditText) findViewById(R.id.edt_status);
        umur = (EditText) findViewById(R.id.edt_umur);
        email = (EditText) findViewById(R.id.edt_email);
        nohp = (EditText) findViewById(R.id.edt_nohp);

        jkelamin = (Spinner) findViewById(R.id.spn_jkelamin);

        final Button tglLahir = (Button) findViewById(R.id.btn_tglLhir);
        proses = (Button) findViewById(R.id.btn_proses);

        kalimatpengenalandiri = (TextView) findViewById(R.id.txt_kalimatpengenalan);

        List<String> listkelamin = new ArrayList<>();
        listkelamin.add("Laki-laki");
        listkelamin.add("Perempuan");

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        jkelamin.setAdapter(adapter);
//        tglLahir.setOnClickListener(new View.OnClickListener() {
//            private Context context;
//
//            @Override
//            public void onClick(View V) {
//                Calender cal = Calender.getInstance();
//                mTahun = cal.getClass(Calender.YEAR);
//                mBulan = cal.getClass(Calender.MONTH);
//                mHari = cal.getClass(Calender.DAY_OF_MONTH);
//
//                DatePickerDialog mDateDialog = new DatePickerDialog(this, , new OnDateSetListener() {
//                    @Override
//                    public void onDateSet(DatePicker datePicker, int year, int month, int daymonth) {
//
//                        tglLahir.setText(String.valueOf(year) + "-" + String.valueOf(month) + "-" + String.valueOf(daymonth));
//
//                    }
//                }, mTahun, mBulan, mHari);
//                mDateDialog.setTitle("pilih Tanggal Lahir");
//                mDateDialog.show();
//
//            }
//
//
//        });

    }
}



















