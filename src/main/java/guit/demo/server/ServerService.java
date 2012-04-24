package guit.demo.server;

import com.google.inject.ImplementedBy;

import com.guit.client.apt.GuitService;

@GuitService
@ImplementedBy(ServerServiceImpl.class)
public interface ServerService {
  String getContent();
}
