package com.bawei.monilianxi.model;

import com.bawei.monilianxi.bean.News;

import java.util.List;

/**
 * Created by dell on 2017/11/23.
 */

public interface OnselectLick {
    void dataSuccess(List<News.DataBean> list);
    void dataErrror(String s);


}
