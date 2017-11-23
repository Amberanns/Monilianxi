package com.bawei.monilianxi.presenter;

import com.bawei.monilianxi.bean.News;
import com.bawei.monilianxi.model.Imodel;
import com.bawei.monilianxi.model.OnselectLick;
import com.bawei.monilianxi.model.model;
import com.bawei.monilianxi.view.Iview;

import java.util.List;


/**
 * Created by dell on 2017/11/23.
 */

public class presenter {
   Imodel imodel;
    Iview iview;

    public presenter(Iview iview) {
        this.iview = iview;
        imodel = new model();
    }
    public void getOk(String url) {
        imodel.RequestSuccess(url, new OnselectLick() {
            @Override
            public void dataSuccess(List<News.DataBean> list) {
                iview.showSuccess(list);


            }

            @Override
            public void dataErrror(String s) {

            }
        });

    }}