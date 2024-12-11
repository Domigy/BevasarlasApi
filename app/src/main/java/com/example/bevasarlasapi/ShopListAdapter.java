package com.example.bevasarlasapi;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class ShopListAdapter extends BaseAdapter {
    private List<ShopList> shopLists;
    private Context context;

    public ShopListAdapter(List<ShopList> shopLists, Context context) {
        this.shopLists = shopLists;
        this.context = context;
    }

    @Override
    public int getCount() {
        return shopLists.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view= LayoutInflater.from(context).inflate(R.layout.shop_list_items, viewGroup, false);

        TextView tvName= view.findViewById(R.id.tv_Name);
        TextView tvCount= view.findViewById(R.id.tvCount);
        TextView tvPrice = view.findViewById(R.id.tvPrice);
        TextView tvCategory = view.findViewById(R.id.tvCategory);

        ShopList shopList = shopLists.get(i);

        tvName.setText(shopList.getName());
        tvCount.setText(shopList.getCount());
        tvPrice.setText(shopList.getPrice());
        tvCategory.setText(shopList.getCategory());






        return view;
    }
}
