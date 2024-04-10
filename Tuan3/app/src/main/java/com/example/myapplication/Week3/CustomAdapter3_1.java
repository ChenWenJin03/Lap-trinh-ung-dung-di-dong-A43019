package com.example.myapplication.Week3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.myapplication.R;
import java.util.ArrayList;

public class CustomAdapter3_1 extends BaseAdapter {
    private Context context;
    private ArrayList<Contact> objects;
    public CustomAdapter3_1(ArrayList<Contact> objects, Context context){
        this.objects = objects;
        this.context = context;
    }

    //Đếm số lượng item:
    @Override
    public int getCount() {return objects.size();}
    //Lấy ra 1 item:
    @Override
    public Object getItem(int position) {return objects.get(position);}
    //Lấy ra ID của item:
    @Override
    public long getItemId(int position) {return position;}
    //Tạo View và gán dữ liệu:
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //b1-tao view -> sinh ra lop viewHolder de anh xa voi itemView
        ViewHolder holder;
        //neu chua ton tai view -> tao view moi
        if(convertView == null){
            holder = new ViewHolder();//tao view moi
            //anh xa layout
            convertView = LayoutInflater.from(context).inflate(R.layout.item_listview,null);
            //anh xa tung thanh phan
            holder.img_avatar = convertView.findViewById(R.id.img_avatar);
            holder.tv_name = convertView.findViewById(R.id.tv_name);
            holder.tv_phone = convertView.findViewById(R.id.tv_phone);
            //tao template de lan sau su dung
            convertView.setTag(holder);
        }else{
            holder = (ViewHolder) convertView.getTag();}
        //b2-gan du lieu
        holder.img_avatar.setImageResource(objects.get(position).getAvatar());
        holder.tv_name.setText(objects.get(position).getName());
        holder.tv_phone.setText(objects.get(position).getPhone());
        return convertView;
    }
    class ViewHolder{
        ImageView img_avatar;
        TextView tv_name, tv_phone;
    }
}