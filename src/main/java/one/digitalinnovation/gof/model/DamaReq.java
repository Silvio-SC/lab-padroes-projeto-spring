package one.digitalinnovation.gof.model;

import one.digitalinnovation.gof.model.RequestGame.GameType;

public class DamaReq implements RequestHandler{
        public boolean canHandleRequest(RequestGame req) {
        return req.getGameType() == GameType.Dama;
    }

    public String handle(RequestGame req) {
        req.markHandled();
        return "FMJD"; 
    }
}
