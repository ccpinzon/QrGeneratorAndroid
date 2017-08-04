package com.example.cristhian.qrexample;

import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import net.glxn.qrgen.android.QRCode;
import net.glxn.qrgen.core.scheme.VCard;

public class MainActivity extends AppCompatActivity {

    private ImageView _imgQR;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initComponets();


    }

    private void initComponets() {
        _imgQR = (ImageView) findViewById(R.id.imgQR);
        VCard card = new VCard("mieds")
                .setEmail("usarioprueba")
                .setAddress("Calle 123")
                .setTitle("Prueba")
                .setPhoneNumber("3017637292");

        


        Bitmap myBitmap = QRCode.from("907483").withColor(0xFFFF0000, 0xFFFFFFAA).bitmap();

        _imgQR.setImageBitmap(myBitmap);



    }
}
