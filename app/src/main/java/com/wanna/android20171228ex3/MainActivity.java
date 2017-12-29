package com.wanna.android20171228ex3;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("LOG","This is onCreate");
    }
    public void clickOInternet(View v)
    {
        Uri uri=Uri.parse("https://www.google.com.tw/");
        Intent it = new Intent(Intent.ACTION_VIEW,uri);
        startActivity(it);


    }
    public void clickMap(View v)
    {
        Uri uri=Uri.parse("geo:0,0?q=中和區中和國小");
        Intent it=new Intent(Intent.ACTION_VIEW,uri);
        startActivity(it);
    }
    public void clickTel(View v)
    {
        Uri uri=Uri.parse("tel:0988816014");
        Intent it=new Intent(Intent.ACTION_DIAL,uri);
        startActivity(it);
    }
    //圖片放至附件檔
    public void clickImage(View v)
    {
        Intent it = new Intent();
        it.setAction(Intent.ACTION_SEND);
        it.setType("image/jpg");
        Uri uri=Uri.parse("android.resource://" + getApplicationContext().getPackageName() + "/" + R.drawable.image);
        it.putExtra("FFF",uri);
        //it.putExtra(Intent.EXTRA_STREAM,uri);
        startActivity(it);
    }

    //分享文字
    public void clickWrite(View v)
    {
        Intent it=new Intent();
        it.setAction(Intent.ACTION_SEND);
        it.setType("text/plain");
        it.putExtra("DDD","DDD分享");
        //it.putExtra(Intent.EXTRA_TEXT,"分享文字123456789");
        startActivity(it);


    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("LOG","This is onResume");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("LOG","This is onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("LOG","This is onDestroy");
    }
}
