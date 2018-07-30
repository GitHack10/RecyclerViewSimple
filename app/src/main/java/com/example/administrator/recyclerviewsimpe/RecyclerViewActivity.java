package com.example.administrator.recyclerviewsimpe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;

public class RecyclerViewActivity extends AppCompatActivity {

    private RecyclerView carRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);
        initViews();

        for (int i = 0; i < Car.carModel.length; i++) {
            Car.cars.add(new Car(Car.carImg[i], Car.carModel[i], Car.carECapacity[i], Car.carTransmission[i],
                    Car.carClass[i], Car.carColor[i]));
        }

        carRecyclerView.setAdapter(new CarItemAdapter(Car.cars));
    }

    private void initViews() {
        carRecyclerView = findViewById(R.id.RecyclerView_recyclerView_car);
    }
}