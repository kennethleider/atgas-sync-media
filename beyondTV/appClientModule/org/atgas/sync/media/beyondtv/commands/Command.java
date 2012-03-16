package org.atgas.sync.media.beyondtv.commands;

public interface Command<T> {
   public void invoke(T item) throws Exception;
}
