package org.cstamas.testground;

public class MyHandler
{
  public <T> Handler<T> wrap(final Handler<T> handler) {
    return t -> {
      try {
        handler.handle(t);
      }
      catch (Exception e) {
        throw e;
      }
    };
  }
}
