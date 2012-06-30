package guit.demo.server;

import com.google.inject.servlet.ServletModule;

import com.guit.server.command.CommandHook;
import com.guit.server.guice.GuiceGwtServlet;
import com.guit.server.guice.GuitModule;

public class DemoModule extends ServletModule {

  @Override
  protected void configureServlets() {
    serve("/demo/service").with(GuiceGwtServlet.class);

    bind(CommandHook.class).to(Hook.class);

    install(new GuitModule());
  }
}
