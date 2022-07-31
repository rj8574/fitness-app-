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
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;


public class food extends AppCompatActivity {


    ListView listView;
    String name[] = {"Milk",
                "WheatGerm",
                "Bananas",
                "Yogurt",
                "Grapefruits",
                "KetoBread",
                "Coconut",
                "Berries",
                "Smoothie",
                "Toast",
                "Salad",
                "PitaSandwiches",
                "GrilledSandwich",
                "CarnitasBowls",
                "SweetPotato",
                "Banana",
                "YogurtShake",
                "Oatmeal",
                "ProteinBars",
                "PeanutButter",
                "Rice",
                "ChocolateMilk",
                "CottageCheese",
                "EnergyShake",
                "Smoothies",
                "BroccoliCauliflower",
                "CoconutSoup",
                "ParmesanSalad",
                "Sandwich",
                "GrilledSalad"
    };
     String desc[] = {
            "Rich in protein and a wealth of important vitamins and minerals, such as selenium and riboflavin",
            "Wheat germ is a component of the wheat kernel that contains a concentrated amount of vitamins and minerals, including manganese, thiamine and selenium.",
            "High in fiber but low in calories, bananas are a great alternative to sugary breakfast cereals to satisfy your sweet tooth first thing in the morning.",
            "Creamy, delicious and satisfying, yogurt makes an excellent addition to a weight loss diet.",
            "Grapefruits are a popular component of many diets and weight loss programs — and for good reason.",
            "Cloud bread, or oopsie bread, is very popular with low-carb and keto dieters. Cloud bread is a protein-rich alternative to regular bread and makes an excellent sandwich base",
            "Coconut is in fact a nutritious superfood that is rich in fiber, vitamins and minerals. Its incredibly healthy, nourishing versatile.",
            "A berry is a small, pulpy, and often edible fruit. Typically, berries are juicy, rounded, brightly colored, sweet, sour or tart, and do not have a stone or pit, although many pips or seeds may be present.",
            "A smoothie is a thick and creamy beverage made from pureed raw fruit, vegetables, and sometimes dairy products, typically using a blender.",
            "Toast is a form of bread that has been browned by exposure to radiant heat. This browning is the result of a Maillard reaction, altering the flavor of the bread and making it firmer so that it is ",
            "We love this take on a classic pasta salad because there are more antioxidant-rich veggies than pasta",
            "This pita pocket is lightened up with the use of low-fat Greek yogurt in place of hefty mayo.",
            "Just smear a layer of hummus onto a toasted slice of Ezekiel whole grain bread, layer on some cucumbers, feta, and tomatoes, and then top with slices",
            "Whip up a batch of this blogger and youll be feasting on high-protein lunches all weeks carnitas, pair it with some satiating beans, crispy lettuce, corn and rice,",
            "A sweet potato is the queen of the slow carbs, meaning your body digests them slowly so they can keep you feeling energized and fuller for longer. ",
            "Bananas are an exercisers BFF. They contain a good amount of glucose, a.k.a. muscle fuel. ",
            "This snack is awesome! Not only is it tasty, but it also incorporates all three macronutrients",
            "The right kind of oatmeal—think steel-cut or old-fashioned, not sugary instant oats—is ideal before a workout. ",
            "The market is flooded with protein bars, and some are better than others. Always check nutrition labels and look closely to make sure theres only one serving in the bar.",
            "Smear on a small amount of peanut butter (about 1 tablespoon) and enjoy.",
            "Rice crackers and peanut butter.",
            "Chocolate milk is sweetened chocolate-flavored milk. It can be made by mixing chocolate syrup with milk. It can be purchased pre-mixed with milk or made at home by blending milk with cocoa ",
            "Cottage cheese is a fresh cheese curd product with a mild flavor. In the past, it was known as curds and whey It is not aged. It is made by draining the cheese, as opposed to pressing it",
            "Despite its health benefits, some people are concerned about its safety. That said, whey protein is safe for most people and a convenient way to increase your protein intake.",
            "Smoothies can make a very healthy breakfast—its all about the ingredients and keeping reasonable portions.",
            "One cup of Broccoli Cheddar soup at Zoup! packs a whopping 290 calories, 20 grams of fat, 60 percent of your daily saturated fat ",
            "Soup is a primarily liquid food, generally served warm or hot (but may be cool or cold), that is made by combining ingredients of meat or vegetables with stock, or water.",
            "Tomato Parmesan Salad. The homemade oil and vinegar dressing is what makes this salad unique. Plus, it features two kinds of lettuce and garden-fresh ",
            "Toast is a form of bread that has been browned by exposure to radiant heat. This browning is the result of a Maillard reaction, altering the flavor of the bread and making it firmer so that it is ",
            "With its commitment to a mission of presenting to its customers delicious and wholesome Salads. Salad Grills has a long term vision of popularizing and"
    };
     int calories[] = {
            55,
            60,
            100,
            120,
            40,
            60,
            80,
            40,
            120,
            40,
            330,
            380,
            400,
            200,
            300,
            100,
            80,
            120,
            60,
            60,
            150,
            100,
            100,
            150,
            120,
            200,
            250,
            250,
            320,
            280
    };
     int images[]={R.drawable.milk,R.drawable.wheatsack,R.drawable.bananas,R.drawable.yogurt,
             R.drawable.grape,R.drawable.sandwich,R.drawable.coconutwater,R.drawable.berry,R.drawable.proteinshake,R.drawable.sandwich,
             R.drawable.salad,R.drawable.sandwich,R.drawable.sandwich,R.drawable.milk,R.drawable.sweepotato,R.drawable.bananas,
             R.drawable.yogurt,R.drawable.milk,R.drawable.milk,R.drawable.milk,R.drawable.milk,R.drawable.milk,
             R.drawable.milk,R.drawable.milk};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_food);
        listView = findViewById(R.id.listview);

        MyAdapter adapter=new MyAdapter(this,name,desc,images);
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
    class MyAdapter extends ArrayAdapter<String>{
        Context context;
        String rtitle[];
        String rdesc[];
        int rImg[];

        MyAdapter(@NonNull Context c,String title[],String description[], int img[]) {
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