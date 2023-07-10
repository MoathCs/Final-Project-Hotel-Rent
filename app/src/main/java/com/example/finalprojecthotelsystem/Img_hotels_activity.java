package com.example.finalprojecthotelsystem;


import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.view.MotionEvent;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class Img_hotels_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_img_hotels);

        RecyclerView recycler = findViewById(R.id.pizza_recycler);

//        String[] captions = new String[pizzaes.length];
//        int[] ids = new int[pizzaes.length];

//        for(int i = 0; i<captions.length;i++){
//            captions[i] = pizzaes[i].getName();
//            ids[i] = pizzaes[i].getImageID();
//        }
//        recycler.setLayoutManager(new LinearLayoutManager(this));
//        AdapterImg adapter = new AdapterImg(captions, ids);
//        recycler.setAdapter(adapter);

        recycler.addOnItemTouchListener(new RecyclerView.OnItemTouchListener() {
            @Override
            public boolean onInterceptTouchEvent(@NonNull RecyclerView rv, @NonNull MotionEvent e) {
//                View childView = rv.findChildViewUnder(e.getX(), e.getY());
//                if (childView != null && e.getAction() == MotionEvent.ACTION_UP) {
//                    int position = rv.getChildAdapterPosition(childView);
//                    // Handle the click event for the item at the given position
//                    Intent intent = new Intent(MainActivity.this, MainActivity2.class);
//                    intent.putExtra("item_position", position);
//                    startActivity(intent);
//                    return true;
//                }
                return false;
            }

            @Override
            public void onTouchEvent(@NonNull RecyclerView rv, @NonNull MotionEvent e) {}

            @Override
            public void onRequestDisallowInterceptTouchEvent(boolean disallowIntercept) {}
        });



    }
}