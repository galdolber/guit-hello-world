package guit.demo.server;

import com.guit.client.command.action.Action;
import com.guit.client.command.action.CommandException;
import com.guit.client.command.action.Response;
import com.guit.server.command.CommandHook;

public class Hook implements CommandHook {

  public void success(Action<Response> action, Response response) {
  }

  public void exception(Action<Response> action, CommandException e) {
  }

  public void unexpectedException(Throwable throwable) {
  }
}
