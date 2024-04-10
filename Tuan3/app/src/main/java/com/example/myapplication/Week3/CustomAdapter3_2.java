package com.example.myapplication.Week3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.myapplication.R;

import java.util.ArrayList;

public class CustomAdapter3_2 extends BaseAdapter {
    private ArrayList<Model> lsModel;
    private Context context;
    public CustomAdapter3_2(ArrayList<Model> lsModel, Context context) {
        this.lsModel = lsModel;
        this.context = context;
    }
    //Đếm số lượng item:
    @Override
    public int getCount() {return lsModel.size();}


    //Lấy ra 1 item:
    @Override
    public Object getItem(int position) {return lsModel.get(position);}

    //Lấy ra ID của item:
    @Override
    public long getItemId(int position) {return position;}

    //Tạo View và gán dữ liệu:
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //b1-tao view -> sinh ra lop viewHolder de anh xa voi itemView
        CustomAdapter3_2.ViewHolder holder;
        //neu chua ton tai view -> tao view moi
        if(convertView == null){
            holder = new CustomAdapter3_2.ViewHolder();//tao view moi
            //anh xa layout
            convertView = LayoutInflater.from(context).inflate(R.layout.item_gridview,null);
            //anh xa tung thanh phan
            holder.img_model = convertView.findViewById(R.id.demo32_item_model);
            //tao template de lan sau su dung
            convertView.setTag(holder);
        }else{
            holder = (CustomAdapter3_2.ViewHolder) convertView.getTag();}
        //b2-gan du lieu
        holder.img_model.setImageResource(lsModel.get(position).getImage());
        return convertView;
    }
    class ViewHolder{
        ImageView img_model;
    }
}
