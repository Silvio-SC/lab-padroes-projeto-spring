package one.digitalinnovation.gof.model;

import one.digitalinnovation.gof.model.RequestGame.GameType;

public interface RequestHandler {

    boolean canHandleRequest(RequestGame req);

    String handle(RequestGame req);

}