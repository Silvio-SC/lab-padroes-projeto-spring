package one.digitalinnovation.gof.model;

import one.digitalinnovation.gof.model.RequestGame.GameType;

public class GoReq implements RequestHandler{

    @Override
    public boolean canHandleRequest(RequestGame req) {
        return req.getGameType() == GameType.Go;
    }

    public String handle(RequestGame req) {
        req.markHandled();
        return "IGF"; 
    }
}
