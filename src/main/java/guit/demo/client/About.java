package guit.demo.client;

import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.google.inject.Inject;

import com.guit.client.apt.GwtPresenter;
import com.guit.client.command.Async;
import com.guit.client.display.RootPanelDisplay;
import com.guit.client.place.Place;

@GwtPresenter
public class About extends AboutPresenter implements Place<Void> {

  @Inject
  @RootPanelDisplay
  AcceptsOneWidget display;

  @Inject
  ServerServiceAsync serverServiceAsync;

  @Override
  public void go(Void data) {
    display.setWidget(getView());
    serverServiceAsync.getContent().fire(new Async<String>() {
      @Override
      public void success(String html) {
        content.html(html);
      }

      @Override
      public void failure(Throwable throwable) {
        Window.alert(throwable.getMessage());
      }
    });
  }
}
