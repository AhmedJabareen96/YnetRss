package com.fursa.ahmedjabareen.rssviewer;


import com.sun.syndication.feed.synd.SyndFeed;
import com.sun.syndication.io.FeedException;
import com.sun.syndication.io.SyndFeedInput;
import com.sun.syndication.io.XmlReader;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class Entity {
    final private String url;
    private List synfeedEntries;
    public Entity(String url){
        this.url = url;
    }
    public java.lang.Object getData() throws FeedException, MalformedURLException,IOException {

            URL url = new URL(this.url);
            SyndFeedInput sfin = new SyndFeedInput();
            SyndFeed syndFeed = sfin.build(new XmlReader(url));
            synfeedEntries = syndFeed.getEntries();
            return synfeedEntries;

    }

}
