package org.atgas.sync.media.beyondTV.commands;

public interface Command<T> {
   public void invoke(T item) throws Exception;
}
