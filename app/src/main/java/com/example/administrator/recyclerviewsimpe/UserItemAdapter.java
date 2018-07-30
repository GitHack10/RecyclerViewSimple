package com.example.administrator.recyclerviewsimpe;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

// Создаем класс адаптер, для корректного вывода списка юзеров
public class UserItemAdapter extends RecyclerView.Adapter<UserItemAdapter.ItemViewHolder> {

    // Создаем список юзеров
    private List<User> users;

    // Получаем список юзеров через конструктор
    public UserItemAdapter(List<User> users) {
        this.users = users;
    }

    // Создаем метод, который вызывается системой, когда создается новый элемент списка
    @NonNull
    @Override
    public ItemViewHolder onCreateViewHolder(
            @NonNull ViewGroup parent /* - активность, в котором появится список*/, int viewType) {

        //Создаем объект класса View, чтобы раздуть наш список в активности
        View itemView = LayoutInflater.from(
                parent.getContext()) // активность, в которой он появится
                .inflate(R.layout.item_user, // то, что появится в этой активности
                parent, false);

        // Создаем объект класса ItemViewHolder и передаем туда все то, что настроили выше и
        // возвращаем его, чтобы вывести список
        return new ItemViewHolder(itemView);
    }

    // Метод, вызываемый системой, когда необходимо заполнить созданный элемент списка
    @Override
    public void onBindViewHolder(@NonNull ItemViewHolder holder, int position) {
        // Вызываем метод holder для заполнения данными элемент списка (юзера) и
        // задаем в качестве параметра текущюю позицию в нашем списке
        holder.setData(users.get(position));
    }

    // Вызывается системой для подсчета кол-ва элементов списка (юзеров)
    @Override
    public int getItemCount() {
        return users.size();
    }

    // Создаем класс для хранения информации о View элементах
    class ItemViewHolder extends RecyclerView.ViewHolder {

        private TextView nameTextView;
        private TextView emailTextView;

        public ItemViewHolder(View itemView) {
            super(itemView);
            initViews(itemView);
        }

        // Создаем метод, в котором получаем View - элементы по ID
        private void initViews(View itemView) {
            nameTextView = itemView.findViewById(R.id.TextView_itemUser_userName);
            emailTextView = itemView.findViewById(R.id.TextView_itemUser_userEmail);
        }

        // Создаем метод, в котором устанавливаем значения для наших View - элементов
        private void setData(User user) {
            nameTextView.setText(user.getName());
            emailTextView.setText(user.getEmail());
        }
    }
}
