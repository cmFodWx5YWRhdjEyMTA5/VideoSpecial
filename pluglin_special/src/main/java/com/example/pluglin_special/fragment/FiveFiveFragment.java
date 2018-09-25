package com.example.pluglin_special.fragment;

import android.app.ProgressDialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.example.pluglin_special.BaseFragment;
import com.example.pluglin_special.Constant;
import com.example.pluglin_special.R;
import com.qq.e.ads.banner.ADSize;
import com.qq.e.ads.banner.AbstractBannerADListener;
import com.qq.e.ads.banner.BannerView;

/**
 * author: kun .
 * date:   On 2018/9/25
 */
public class FiveFiveFragment extends BaseFragment implements View.OnClickListener {

    private RelativeLayout mRlBanner;
    private ImageView mIvClose;
    private WebView mWebView;
    private BannerView mBannerView;
    private RelativeLayout mRlBannerLayout;
    private ProgressDialog progressBar;

    public static FiveFiveFragment newInstance(){
        return new FiveFiveFragment();
    }
    @Override
    public int getLayout() {
        return R.layout.fragment_five_five_layout;
    }

    @Override
    public void initView(View inflate, Bundle savedInstanceState) {
        mRlBanner = (RelativeLayout) inflate.findViewById(R.id.rl_banner);
        mRlBannerLayout = (RelativeLayout) inflate.findViewById(R.id.rl_banner_layout);
        mIvClose = (ImageView) inflate.findViewById(R.id.iv_banner_close);
        mWebView = (WebView) inflate.findViewById(R.id.webview);
        progressBar= new ProgressDialog(getContext());
        progressBar.setMessage("加载中");
        progressBar.show();
        getBanner();

        mWebView.getSettings().setJavaScriptEnabled(true);//启用js
        mWebView.getSettings().setBlockNetworkImage(false);//解决图片不显示
        if(Build.VERSION.SDK_INT>=Build.VERSION_CODES.LOLLIPOP){
            mWebView.getSettings().setMixedContentMode(WebSettings.MIXED_CONTENT_ALWAYS_ALLOW);
        }
        mWebView.loadUrl(Constant.FIVE_FIVE);
    }

    @Override
    public void initListener() {
        mIvClose.setOnClickListener(this);
        //不跳转浏览器
        mWebView.setWebViewClient(webViewClient);
        //点击后退按钮,让WebView后退一页
        mWebView.setOnKeyListener(mOnKeyListener);

        mWebView.setWebViewClient(new WebViewClient() {
            public boolean shouldOverrideUrlLoading(WebView view, String url) { //  重写此方法表明点击网页里面的链接还是在当前的webview里跳转，不跳到浏览器那边
                view.loadUrl(url);
                return true;
            }
        });
    }

    View.OnKeyListener mOnKeyListener=new View.OnKeyListener() {
        @Override
        public boolean onKey(View v, int keyCode, KeyEvent event) {
            if (event.getAction() == KeyEvent.ACTION_DOWN) {

                if (keyCode == KeyEvent.KEYCODE_BACK && mWebView.canGoBack()) {  //表示按返回键
                    mWebView.goBack();   //后退
                    //webview.goForward();//前进
                    return true;    //已处理
                }
            }
            return false;
        }
    };

    WebViewClient webViewClient=new WebViewClient(){
        @Override
        public void onPageFinished(WebView view, String url) {//页面加载完成
            progressBar.dismiss();
        }

        @Override
        public void onPageStarted(WebView view, String url, Bitmap favicon) {//页面开始加载
            progressBar.show();
        }

        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {

            return super.shouldOverrideUrlLoading(view, url);
        }
    };



    @Override
    public void onClick(View v) {
        int id = v.getId();
        if(id==R.id.iv_banner_close){
            mRlBannerLayout.setVisibility(View.GONE);
        }
    }

    private void getBanner() {
        mBannerView = new BannerView(getActivity(), ADSize.BANNER, Constant.APPID,
                Constant.BANNER_ADID);
        mBannerView.setRefresh(30);
        mBannerView.setADListener(new AbstractBannerADListener() {
            @Override
            public void onNoAD(int i) {
                Log.i("---onNoAD", i + "");
            }

            @Override
            public void onADReceiv() {
                Log.i("---onNoAD", "onNoAD");
            }
        });
        mRlBanner.addView(mBannerView);// 把banner加载到容器
        mBannerView.loadAD();
    }


}