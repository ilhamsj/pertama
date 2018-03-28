package net.skripsweet.pertama;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.Random;

public class FaktaUnikActivity extends AppCompatActivity {

    //6. bikin objek mkumpulanFakta
    private kumpulanFakta mkumpulanFakta = new kumpulanFakta();
    private  AmbilWarna mAmbilWarna = new AmbilWarna();

    //Deklarasikan variabel
    private TextView mTextFakta;
    private Button mTampilkanFakta;
    private RelativeLayout mRelativeLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pertama);

        //2. asiign
        mTextFakta      = findViewById(R.id.textFact);
        mTampilkanFakta = findViewById(R.id.buttonFakta);
        mRelativeLayout = findViewById(R.id.relativeLayout);

        //3.
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            //4. kalau diklik dia ngejalanin objek yg telah d buat
            public void onClick(View view) {

                //7. ambil nilai fakta dr class kumpulanFakta
                String fakta = mkumpulanFakta.getFakta();
                int warna = mAmbilWarna.getWarna();

                mTextFakta.setText(fakta);
                mRelativeLayout.setBackgroundColor(warna);
                mTampilkanFakta.setTextColor(warna);
            }
        };
        mTampilkanFakta.setOnClickListener(listener);
    }
}
