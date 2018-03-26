package com.flutter_webview_plugin;

import java.lang.annotation.Annotation;

import android.webkit.JavascriptInterface;

/**
 * User: xujl
 * Date: 2018/3/23
 */
public class BarcodeInterface {

    @JavascriptInterface
    public void scan(){
        FlutterWebviewPlugin.channel.invokeMethod("onBarcode", null);
    }
}
