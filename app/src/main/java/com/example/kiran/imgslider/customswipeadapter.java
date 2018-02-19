package com.example.kiran.imgslider;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by kiran on 11/11/17.
 */

public class customswipeadapter extends PagerAdapter {
    //array to image
    private int[] imageresources={R.drawable.america,R.drawable.argentina,R.drawable.india,R.drawable.nepal,R.drawable.spain};

    private Context ctx;
    private LayoutInflater layoutInflater;

    public customswipeadapter(Context ctx){
        this.ctx=ctx;
    }
    @Override
    public int getCount() {
        return imageresources.length;

    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return (view==(LinearLayout)object);//view is in Linear layout..
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {//where view is to show..
        //this class is used to point to swipelayout..and the component we have used in it
        layoutInflater=(LayoutInflater)ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);//to ask for service to move to layout


        View itemview = layoutInflater.inflate(R.layout.swipe_layout,container,false);//point to swipe_layout.xml

        ImageView imgview = (ImageView)itemview.findViewById(R.id.img);
        TextView txtview =(TextView)itemview.findViewById(R.id.imgcount);

        imgview.setImageResource(imageresources[position]);//to point to image resource..where to get image from
       txtview.setText("picture" + position);;//to show text (i.e IMAGE) and position
        Log.d("image", String.valueOf(position));
        container.addView(itemview);//finally adding the view in container ..we have used View itemview
//container contains the view ..it can be text view,image view....
        return itemview;//return itemview object
    }



    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((LinearLayout) object);//as in swipe layout our view is in linear
    }
}
