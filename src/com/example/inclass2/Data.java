/*
 * James Keller
 * In Class Assignment 2
 * 2/18/14
 */

package com.example.inclass2;

import java.util.ArrayList;

public class Data {
  final static ArrayList<News> NEWS;
  
  static{
    ArrayList<News> news = new ArrayList<News>();
    news.add(new News("Bill Gates' impact on Microsoft", "http://rss.cnn.com/~r/rss/cnn_tech/~3/211zKK9tI50/index.html"));
    news.add(new News("Your Facebook life in 62 seconds","http://rss.cnn.com/~r/rss/cnn_tech/~3/-btwKnjLl98/index.html"));
    news.add(new News("Google may move mystery barge", "http://rss.cnn.com/~r/rss/cnn_tech/~3/lIiIdDuAxyY/index.html"));
    news.add(new News("Five forbidden text messages", "http://rss.cnn.com/~r/rss/cnn_tech/~3/g0XiRQOhuqc/index.html"));
    news.add(new News("Tech is reviving Sinatra, Tupac", "http://rss.cnn.com/~r/rss/cnn_tech/~3/_OFOQeS4rHs/index.html"));
    NEWS = news;
  }
  
  static class News{
    String title, url;

    public News(String title, String url) {
      this.title = title;
      this.url = url;
    }
    
    public String getTitle() {
      return title;
    }

    public String getUrl() {
      return url;
    }

    @Override
    public String toString() {
      return "News [title=" + title + ", url=" + url + "]";
    }
  }

}
