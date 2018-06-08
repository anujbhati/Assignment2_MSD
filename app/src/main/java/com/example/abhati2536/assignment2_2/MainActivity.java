package com.example.abhati2536.assignment2_2;

import android.content.Intent;
import android.graphics.Bitmap;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void takeSelfie(View view){

        Intent takePictureIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);

        startActivityForResult(takePictureIntent, 26);

    }



    protected void onActivityResult(int requestCode, int resultCode, Intent data ){

        Bundle extras = data.getExtras();

        Bitmap bmp = (Bitmap) extras.get("data");

        // Here set the bmp data to the image view that you dragged and dropped on your app ui designer.
        ImageView img = (ImageView)findViewById(R.id.imageView);
        img.setImageBitmap(bmp);


    }
}
