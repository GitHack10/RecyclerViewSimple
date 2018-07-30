package com.example.administrator.recyclerviewsimpe;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class CarItemAdapter extends RecyclerView.Adapter<CarItemAdapter.ItemViewHolder> {

    private List<Car> cars;

    public CarItemAdapter(List<Car> cars) {
        this.cars = cars;
    }

    @NonNull
    @Override
    public ItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(
                R.layout.item_car, parent, false);

        return new ItemViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemViewHolder holder, int position) {
        holder.setData(cars.get(position));
    }

    @Override
    public int getItemCount() {
        return cars.size();
    }

    public class ItemViewHolder extends RecyclerView.ViewHolder {

        private ImageView carImageView;

        private TextView carModelTextView;
        private TextView carEcapacityTextView;
        private TextView carTransmissionTextView;
        private TextView carClassTextView;
        private TextView carColorTextView;

        public ItemViewHolder(View itemView) {
            super(itemView);
            initViews(itemView);
        }

        private void initViews(View itemView) {
            carImageView = itemView.findViewById(R.id.ImageView_itemCar_icon);

            carModelTextView = itemView.findViewById(R.id.TextView_itemCar_carModel);
            carEcapacityTextView = itemView.findViewById(R.id.TextView_itemCar_carECapacity);
            carTransmissionTextView = itemView.findViewById(R.id.TextView_itemCar_carTransmission);
            carClassTextView = itemView.findViewById(R.id.TextView_itemCar_carClass);
            carColorTextView = itemView.findViewById(R.id.TextView_itemCar_carColor);
        }

        public void setData(Car car) {
            carModelTextView.setText(car.getModel());
            carEcapacityTextView.setText(car.geteCapacity());
            carTransmissionTextView.setText(car.getTransmission());
            carClassTextView.setText(car.getClasss());
            carColorTextView.setText(car.getColor());

            carImageView.setImageResource(car.getImg());
        }
    }
}