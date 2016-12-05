package com.example.julia.lw_11;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;

public class MainActivity extends Activity  {

    Paint p;
    int mywidth=0, myheight=0;



    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        pp=new painter(this);
        setContentView(pp);

    }



    class painter extends View {
        public painter(Context context) {
            super(context);
            p = new Paint();
        }

        @Override
        protected void onSizeChanged(int w, int h, int oldw, int oldh) {
            mywidth = w;
            myheight = h;
            super.onSizeChanged(w, h, oldw, oldh);
        }

        @Override
        protected void onDraw(Canvas canvas) {
            canvas.drawARGB(80, 102, 204, 255);
            Bitmap oleg = BitmapFactory.decodeResource(getResources(), R.drawable.ui);
            Rect R1 = new Rect(650, 1, 900, 450);
            Rect R2 = new Rect(15 ,150, 400, 690);
            canvas.drawBitmap(oleg, R1, R2, p);
        }
    }

    painter pp;
}
