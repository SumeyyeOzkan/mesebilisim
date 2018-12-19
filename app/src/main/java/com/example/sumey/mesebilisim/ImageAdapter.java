package com.example.sumey.mesebilisim;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class ImageAdapter extends PagerAdapter {
    private Context mContext;
    private int[] mimageIds= new int[] {R.drawable.slider1,R.drawable.slider2,R.drawable.slider3};

    ImageAdapter(Context context){
        mContext= context;
    }

    @Override
    public int getCount(){
        return mimageIds.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object){
        return view==object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        ImageView imageView=new ImageView(mContext);
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView.setImageResource(mimageIds[position]);
        container.addView(imageView,0);
        return imageView;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((ImageView) object);
    }
}
