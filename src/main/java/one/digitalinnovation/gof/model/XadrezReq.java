package one.digitalinnovation.gof.model;

import one.digitalinnovation.gof.model.RequestGame.GameType;

public class XadrezReq implements RequestHandler{
    @Override
    public boolean canHandleRequest(RequestGame req) {
        return req.getGameType() == GameType.Xadrez;
    }

    public String handle(RequestGame req) {
        req.markHandled();
        return "FIDE"; 
    }


}
