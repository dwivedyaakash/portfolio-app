package com.example.portfolioapp

import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity

class PortfolioWebViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_portfolio_web_view)

        val portfolioWebView: WebView = findViewById(R.id.wvPortfolio)
        portfolioWebView.settings.javaScriptEnabled = true
        portfolioWebView.webViewClient = WebViewClient()
        portfolioWebView.loadUrl("https://dwivedyaakash.github.io")
    }
}