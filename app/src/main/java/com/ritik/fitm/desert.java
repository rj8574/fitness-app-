package com.ritik.fitm;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class desert extends AppCompatActivity {
    ListView listView;
    String name[]={"Energy Bar","BERRIES BAKED OATMEAL","Greek Yogurt Berry Tart ",
            "Ice Cream","Banana Shake","Alomond milk","Dark Chocolate","Oats","mango shake","pastry"
    };
    String desc[]={"","","", " "," "," ","","","",""};
    int[] images ={R.drawable.energbar,R.drawable.oat,R.drawable.yogurt,R.drawable.icecream,
            R.drawable.milkshake,R.drawable.milk,R.drawable.chocolate,
            R.drawable.oat,R.drawable.milkshake,R.drawable.strawberrycheesecake};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desert);
        listView = findViewById(R.id.listview);

        desert.MyAdapter adapter=new desert.MyAdapter(this,name,desc,images);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0)
                {
                    Intent intent= new Intent(getApplicationContext(),DietLast.class);

                    Bundle bundle=new Bundle();
                    bundle.putInt("images",images[0]);
                    intent.putExtras(bundle);

                    intent.putExtra("title",name[0]);
                    intent.putExtra("descrption",desc);

                    intent.putExtra("position",""+0);
                    startActivity(intent);
                }
                if(position==1)
                {
                    Intent intent= new Intent(getApplicationContext(),DietLast.class);

                    Bundle bundle=new Bundle();
                    bundle.putInt("images",images[1]);
                    intent.putExtras(bundle);

                    intent.putExtra("title",name[1]);
                    intent.putExtra("descrption",desc);

                    intent.putExtra("position",""+1);
                    startActivity(intent);
                }
                if(position==2)
                {
                    Intent intent= new Intent(getApplicationContext(),DietLast.class);

                    Bundle bundle=new Bundle();
                    bundle.putInt("images",images[2]);
                    intent.putExtras(bundle);

                    intent.putExtra("title",name[2]);
                    intent.putExtra("descrption",desc);

                    intent.putExtra("position",""+2);
                    startActivity(intent);
                }
                if(position==3)
                {
                    Intent intent= new Intent(getApplicationContext(),DietLast.class);

                    Bundle bundle=new Bundle();
                    bundle.putInt("images",images[3]);
                    intent.putExtras(bundle);

                    intent.putExtra("title",name[3]);
                    intent.putExtra("descrption",desc);

                    intent.putExtra("position",""+3);
                    startActivity(intent);
                }
                if(position==4)
                {
                    Intent intent= new Intent(getApplicationContext(),DietLast.class);

                    Bundle bundle=new Bundle();
                    bundle.putInt("images",images[4]);
                    intent.putExtras(bundle);

                    intent.putExtra("title",name[4]);
                    intent.putExtra("descrption",desc);

                    intent.putExtra("position",""+4);
                    startActivity(intent);
                }
                if(position==5)
                {
                    Intent intent= new Intent(getApplicationContext(),DietLast.class);

                    Bundle bundle=new Bundle();
                    bundle.putInt("images",images[5]);
                    intent.putExtras(bundle);

                    intent.putExtra("title",name[5]);
                    intent.putExtra("descrption",desc);

                    intent.putExtra("position",""+5);
                    startActivity(intent);
                }
                if(position==6)
                {
                    Intent intent= new Intent(getApplicationContext(),DietLast.class);

                    Bundle bundle=new Bundle();
                    bundle.putInt("images",images[6]);
                    intent.putExtras(bundle);

                    intent.putExtra("title",name[6]);
                    intent.putExtra("descrption",desc);

                    intent.putExtra("position",""+6);
                    startActivity(intent);
                }
                if(position==7)
                {
                    Intent intent= new Intent(getApplicationContext(),DietLast.class);

                    Bundle bundle=new Bundle();
                    bundle.putInt("images",images[7]);
                    intent.putExtras(bundle);

                    intent.putExtra("title",name[7]);
                    intent.putExtra("descrption",desc);

                    intent.putExtra("position",""+7);
                    startActivity(intent);
                }
                if(position==8)
                {
                    Intent intent= new Intent(getApplicationContext(),DietLast.class);

                    Bundle bundle=new Bundle();
                    bundle.putInt("images",images[8]);
                    intent.putExtras(bundle);

                    intent.putExtra("title",name[8]);
                    intent.putExtra("descrption",desc);

                    intent.putExtra("position",""+8);
                    startActivity(intent);
                }
                if(position==9)
                {
                    Intent intent= new Intent(getApplicationContext(),DietLast.class);

                    Bundle bundle=new Bundle();
                    bundle.putInt("images",images[9]);
                    intent.putExtras(bundle);

                    intent.putExtra("title",name[9]);
                    intent.putExtra("descrption",desc);

                    intent.putExtra("position",""+9);
                    startActivity(intent);
                }
                if(position==10)
                {
                    Intent intent= new Intent(getApplicationContext(),DietLast.class);

                    Bundle bundle=new Bundle();
                    bundle.putInt("images",images[10]);
                    intent.putExtras(bundle);

                    intent.putExtra("title",name[10]);
                    intent.putExtra("descrption",desc);

                    intent.putExtra("position",""+10);
                    startActivity(intent);
                }

            }
        });


    }
    class MyAdapter extends ArrayAdapter<String> {
        Context context;
        String rtitle[];
        String rdesc[];
        int rImg[];

        MyAdapter(@NonNull Context c, String title[], String description[], int img[]) {
            super(c,R.layout.food_list,R.id.workoutName,title);
            this.context=c;
            this.rtitle=title;
            this.rdesc =description;
            this.rImg =img;

        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            LayoutInflater layoutInflater=(LayoutInflater)getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View food_list=layoutInflater.inflate(R.layout.food_list,parent,false);
            ImageView images=food_list.findViewById(R.id.profile);
            TextView name=food_list.findViewById(R.id.workoutName);
            TextView desc=food_list.findViewById(R.id.desc);

            images.setImageResource(rImg[position]);
            name.setText(rtitle[position]);
            desc.setText(rdesc[position]);
            return food_list;

        }
    }
}
