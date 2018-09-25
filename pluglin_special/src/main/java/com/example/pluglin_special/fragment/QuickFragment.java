package com.example.pluglin_special.fragment;

import android.os.Bundle;
import android.view.View;

import com.example.pluglin_special.BaseFragment;
import com.example.pluglin_special.R;

/**
 * author: kun .
 * date:   On 2018/9/25
 */
public class QuickFragment extends BaseFragment {


    public static QuickFragment newInstance(){
        return new QuickFragment();
    }
    @Override
    public int getLayout() {
        return R.layout.fragment_quick_layout;
    }

    @Override
    public void initView(View inflate, Bundle savedInstanceState) {

    }

    @Override
    public void initListener() {
    }
}
