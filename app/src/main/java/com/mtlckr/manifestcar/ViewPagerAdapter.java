package com.mtlckr.manifestcar;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

public class ViewPagerAdapter extends PagerAdapter {

    private Context context;
    private LayoutInflater layoutInflater;
    private Integer [] images = {R.drawable.audi,R.drawable.alfaromeo,R.drawable.bmw};
    private Integer [] images_alfaromeo = {R.drawable.alfaromeo,R.drawable.ara};
    private Integer [] images_bmw = {R.drawable.bmw,R.drawable.ara};
    private Integer [] images_citroen = {R.drawable.citroen,R.drawable.ara};
    private Integer [] images_dacia = {R.drawable.dacia,R.drawable.ara};
    private Integer [] images_ds = {R.drawable.ds,R.drawable.ara};
    private Integer [] images_fiat = {R.drawable.fiat,R.drawable.ara};
    private Integer [] images_ford = {R.drawable.ford,R.drawable.ara};
    private Integer [] images_honda = {R.drawable.honda,R.drawable.ara};
    private Integer [] images_hyundai = {R.drawable.hyundai,R.drawable.ara};
    private Integer [] images_jaguar = {R.drawable.jaguar,R.drawable.ara};
    private Integer [] images_kia = {R.drawable.kia,R.drawable.ara};
    private Integer [] images_mazda = {R.drawable.mazda,R.drawable.ara};
    private Integer [] images_mercedes = {R.drawable.mercedes,R.drawable.ara};
    private Integer [] images_mini = {R.drawable.mini,R.drawable.ara};
    private Integer [] images_mitsubishi = {R.drawable.mitsubishi,R.drawable.ara};
    private Integer [] images_nissan = {R.drawable.nissan,R.drawable.ara};
    private Integer [] images_opel = {R.drawable.opel,R.drawable.ara};
    private Integer [] images_peugeot = {R.drawable.peugeot,R.drawable.ara};
    private Integer [] images_renault = {R.drawable.renault,R.drawable.ara};
    private Integer [] images_seat = {R.drawable.seat,R.drawable.ara};
    private Integer [] images_skoda = {R.drawable.skoda,R.drawable.ara};
    private Integer [] images_subaru = {R.drawable.subaru,R.drawable.ara};
    private Integer [] images_suzuki = {R.drawable.suzuki,R.drawable.ara};
    private Integer [] images_toyota = {R.drawable.toyota,R.drawable.ara};
    private Integer [] images_volkswagen = {R.drawable.volkswagen,R.drawable.ara};
    private Integer [] images_volvo = {R.drawable.volvo,R.drawable.ara};


    public ViewPagerAdapter(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return images.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }

    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {

        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.custom_layout, null);
        LinearLayout layout = view.findViewById(R.id.sliderImageLayout);
        ImageView imageView = (ImageView) view.findViewById(R.id.imageViewFailure);
        imageView.setImageResource(images[position]);

        layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(position == 1)
                {
                    Toast.makeText(context, "1", Toast.LENGTH_LONG).show();
                }

                else if (position == 2)
                {
                    Toast.makeText(context, "2", Toast.LENGTH_LONG).show();

                }
            }
        });

        ViewPager vp = (ViewPager) container;
        vp.addView(view, 0);
        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        ViewPager vp = (ViewPager) container;
        View view = (View) object;
        vp.removeView(view);
    }
}
