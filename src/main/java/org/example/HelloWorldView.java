package org.example;

import com.webforj.component.Composite;
import com.webforj.component.button.Button;
import com.webforj.component.button.ButtonTheme;
import com.webforj.component.field.TextField;
import com.webforj.component.layout.flexlayout.FlexDirection;
import com.webforj.component.layout.flexlayout.FlexLayout;
import com.webforj.component.toast.Toast;
import com.webforj.component.toast.Theme;
import com.webforj.router.annotation.Route;

@Route("/")
public class HelloWorldView extends Composite<FlexLayout> {

  private final FlexLayout self = getBoundComponent();
  private final TextField name = new TextField("What is your name?");
  private final Button helloButton = new Button("Say Hello");

  public HelloWorldView() {
    self.setDirection(FlexDirection.COLUMN);
    self.setMaxWidth(360);
    self.setStyle("margin", "2rem auto");
    self.setStyle("gap", "0.75rem");

    helloButton.setTheme(ButtonTheme.PRIMARY)
        .addClickListener(e -> Toast.show(
            "Welcome to this small webforJ app, " + name.getValue() + "!",
            Theme.GRAY));

    self.add(name, helloButton);
  }
}
