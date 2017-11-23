package com.bawei.monilianxi;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.bawei.monilianxi.Adapter.MyAdapter;
import com.bawei.monilianxi.Api.Api;
import com.bawei.monilianxi.bean.News;
import com.bawei.monilianxi.presenter.presenter;
import com.bawei.monilianxi.view.Iview;

import java.util.List;

public class MainActivity extends AppCompatActivity implements Iview{

    private RecyclerView recyclerView;
    private MyAdapter myAdapter;
    private com.bawei.monilianxi.presenter.presenter presenter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        presenter = new presenter(this);
       presenter.getOk(Api.URL);
        recyclerView = (RecyclerView) findViewById(R.id.recycler);
    }


    @Override
    public void showSuccess(final List<News.DataBean> list) {
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        myAdapter = new MyAdapter(this,list);
        recyclerView.setAdapter(myAdapter);
        myAdapter.setOnClickLisener(new MyAdapter.OnClickLisener() {
            @Override
            public void OnDainji(View v, int position) {
                Intent intent = new Intent(MainActivity.this, VideoActivity.class);
                intent.putExtra("url", list.get(position).getVedio_url());
                startActivity(intent);
            }

            @Override
            public void OnLong(View v, int position) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("mm",list.get(position).getVedio_url());
                startActivity(intent);

            }
        });

    }

    @Override
    public void showError(String s) {

    }
}
