package guit.demo.client;

import com.google.gwt.event.dom.client.KeyCodes;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.google.inject.Inject;

import com.guit.client.apt.GwtPresenter;
import com.guit.client.binder.ViewHandler;
import com.guit.client.binder.contributor.KeyCode;
import com.guit.client.display.RootPanelDisplay;
import com.guit.client.place.Place;

@GwtPresenter(autofocus = "user")
public class Home extends HomePresenter implements Place<Void> {

  @Inject
  @RootPanelDisplay
  AcceptsOneWidget display;

  @Override
  public void go(Void data) {
    display.setWidget(getView());
    user.value("");
    password.value("");
  }

  @ViewHandler
  @KeyCode(KeyCodes.KEY_ENTER)
  void user$password$keyDown() {
    login$click();
  }

  @ViewHandler
  void login$click() {
    if (user.value().equals("root") && password.value().equals("root")) {
      placeManager.go(About.class);
    } else {
      Window.alert("Bad user/password");
    }
  }
}
