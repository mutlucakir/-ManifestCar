package com.mtlckr.manifestcar;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

public class ViewPagerAdapter extends PagerAdapter {

    private Context context;
    private LayoutInflater layoutInflater;
    private Integer [] group_audi = {R.drawable.car_audi,R.drawable.car_audi_a5sportback,R.drawable.car_audi_suv_q3sportback};
    private Integer [] group_alfaromeo = {R.drawable.car_alfaromeo,R.drawable.car_alfaromeo_giulietta, R.drawable.car_alfaromeo_suv_stelvio};
    private Integer [] group_bmw = {R.drawable.car_bmw,R.drawable.car_bmw_3series, R.drawable.car_bmw_suv_x3};
    private Integer [] group_citroen = {R.drawable.car_citroen,R.drawable.car_citroen_celysee,R.drawable.car_citroen_suv_c5aircross,};
    private Integer [] group_dacia = {R.drawable.car_dacia,R.drawable.car_dacia_sandero,R.drawable.car_dacia_suv_sanderostepway};
    private Integer [] group_ds = {R.drawable.car_ds,R.drawable.car_ds_9,R.drawable.car_ds_suv_7crossback};
    private Integer [] group_fiat = {R.drawable.car_fiat,R.drawable.car_fiat_egea,R.drawable.car_fiat_suv_500x};
    private Integer [] group_ford = {R.drawable.car_ford,R.drawable.car_ford_focus,R.drawable.car_ford_suv_kuga};
    private Integer [] group_honda = {R.drawable.car_honda,R.drawable.car_honda_civic,R.drawable.car_honda_suv_crv};
    private Integer [] group_hyundai = {R.drawable.car_hyundai,R.drawable.car_hyundai_elantra,R.drawable.car_hyundai_suv_tucson};
    private Integer [] group_jaguar = {R.drawable.car_jaguar,R.drawable.main_ara};
    private Integer [] group_kia = {R.drawable.car_kia,R.drawable.car_kia_ceed,R.drawable.car_kia_suv_sportage};
    private Integer [] group_mazda = {R.drawable.car_mazda,R.drawable.car_mazda_6,R.drawable.car_mazda_suv_cx5};
    private Integer [] group_mercedes = {R.drawable.car_mercedes,R.drawable.car_mercedes_eseries,R.drawable.car_mercedes_suv_gla};
    private Integer [] group_mini = {R.drawable.car_mini,R.drawable.main_ara};
    private Integer [] group_mitsubishi = {R.drawable.car_mitsubishi,R.drawable.car_mitsubishi_lancer,R.drawable.car_mitsubishi_suv_eclipsecross};
    private Integer [] group_nissan = {R.drawable.car_nissan,R.drawable.car_nissan_micra,R.drawable.car_nissan_suv_qashqai};
    private Integer [] group_opel = {R.drawable.car_opel,R.drawable.car_opel_insignia,R.drawable.car_opel_suv_grandlandx};
    private Integer [] group_peugeot = {R.drawable.car_peugeot,R.drawable.car_peugeot_508,R.drawable.car_peugeot_suv_3008};
    private Integer [] group_renault = {R.drawable.car_renault,R.drawable.car_renault_megane,R.drawable.car_renault_suv_koleos};
    private Integer [] group_seat = {R.drawable.car_seat,R.drawable.car_seat_leon,R.drawable.car_seat_suv_tarraco};
    private Integer [] group_skoda = {R.drawable.car_skoda,R.drawable.car_skoda_octavia,R.drawable.car_skoda_suv_kodiaq};
    private Integer [] group_subaru = {R.drawable.car_subaru,R.drawable.main_ara};
    private Integer [] group_suzuki = {R.drawable.car_suzuki,R.drawable.car_suzuki_swift,R.drawable.car_suzuki_suv_vitara};
    private Integer [] group_toyota = {R.drawable.car_toyota,R.drawable.car_toyota_corolla,R.drawable.car_toyota_suv_chr};
    private Integer [] group_volkswagen = {R.drawable.car_volkswagen,R.drawable.car_volkswagen_golf,R.drawable.car_volkswagen_suv_tiguan};
    private Integer [] group_volvo = {R.drawable.car_volvo,R.drawable.car_volvo_s90,R.drawable.car_volvo_xc90};


    public ViewPagerAdapter(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return group_audi.length;
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
        imageView.setImageResource(group_audi[position]);

        layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(position == 1)
                {
                  //  Toast.makeText(context, "1", Toast.LENGTH_LONG).show();
                }
                else if (position == 2)
                {
                  //  Toast.makeText(context, "2", Toast.LENGTH_LONG).show();
                }
                else if (position == 3)
                {
                    //  Toast.makeText(context, "3", Toast.LENGTH_LONG).show();
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
