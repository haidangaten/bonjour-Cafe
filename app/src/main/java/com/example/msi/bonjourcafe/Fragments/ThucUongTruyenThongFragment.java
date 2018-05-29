package com.example.msi.bonjourcafe.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.msi.bonjourcafe.Adapter.RecyclerViewAdapter;
import com.example.msi.bonjourcafe.Model.Food;
import com.example.msi.bonjourcafe.R;
import com.example.msi.bonjourcafe.Retrofit.APIUtils;
import com.example.msi.bonjourcafe.Retrofit.FoodAPI;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * A simple {@link Fragment} subclass.
 */
public class ThucUongTruyenThongFragment extends Fragment {

    private RecyclerView recyclerView;
    private RecyclerViewAdapter adapter;
    private FoodAPI foodAPI;
    public ThucUongTruyenThongFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_all, container, false);
        recyclerView = (RecyclerView) view.findViewById(R.id.recycleview);
        foodAPI = APIUtils.getFoodAPI();
        foodAPI.getFood().enqueue(new Callback<List<Food>>() {
            @Override
            public void onResponse(Call<List<Food>> call, Response<List<Food>> response) {
                generateDataList(response.body());
            }

            @Override
            public void onFailure(Call<List<Food>> call, Throwable t) {

            }
        });
        return view;
    }

    private void generateDataList(List<Food> foodList) {
        List<Food> foodList2 = new ArrayList<>();


        for (Food f:foodList
                ) {

            if (f.getTenNhomHangHoa().equals("THỨC UỐNG TRUYỀN THỐNG"))
            {
                foodList2.add(f);
            }



        }

        RecyclerView.LayoutManager layoutManager=new GridLayoutManager(getActivity(),2);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        adapter=new RecyclerViewAdapter(getActivity(),foodList2);
        adapter.notifyDataSetChanged();
        recyclerView.setAdapter(adapter);

    }

}
