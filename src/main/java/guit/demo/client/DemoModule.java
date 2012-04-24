package guit.demo.client;

import com.google.gwt.inject.client.AbstractGinModule;

import javax.inject.Singleton;

public class DemoModule extends AbstractGinModule {

  @Override
  protected void configure() {
    bind(Home.class).in(Singleton.class);
    bind(About.class).in(Singleton.class);
  }
}
