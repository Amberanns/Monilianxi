package com.bawei.monilianxi.view;

import com.bawei.monilianxi.bean.News;

import java.util.List;

/**
 * Created by dell on 2017/11/23.
 */

public interface Iview {
//    public static final String URL_BU="http://result.eolinker.com/";
//    iYXEPGn4e9c6dafce6e5cdd23287d2bb136ee7e9194d3e9?uri=vedio
    void showSuccess(List<News.DataBean> list);
    void showError(String s);



}
