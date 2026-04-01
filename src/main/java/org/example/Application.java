package org.example;

import com.webforj.App;
import com.webforj.annotation.AppTitle;
import com.webforj.annotation.Routify;
import com.webforj.annotation.StyleSheet;

@Routify(packages = "org.example")
@AppTitle("Small webforJ App")
@StyleSheet("ws://app.css")
public class Application extends App {
}
