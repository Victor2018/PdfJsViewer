package com.cherry.pdfjs

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initialize()
    }

    fun initialize () {
        mWebView.settings.javaScriptEnabled = true
        mWebView.settings.allowFileAccess = true
        mWebView.settings.allowFileAccessFromFileURLs =true
        mWebView.settings.allowUniversalAccessFromFileURLs = true

        var pdfUrl = "https://dev.oss.hokkj.cn/hok_admin/data/6aa65d9eaf6d473b9f5b831273d390aa.pdf"
        pdfUrl = "https://hok-one.oss-accelerate.aliyuncs.com/hok_admin/data/decfdaa013b94fb193c215fc0ceb9c15.pdf"

        //这个是pdf原生UI
//        var url = "file:///android_asset/pdfjs/web/viewer.html?file=$pdfUrl"
        //自定义UI
        var url = "file:///android_asset/pdfjs/web/index.html?$pdfUrl"
        mWebView.loadUrl(url)
    }
}