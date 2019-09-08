package com.jpluomajoki.SuperAwesomeTodoList;

import io.vertx.core.Handler;
import io.vertx.core.http.HttpServerResponse;
import io.vertx.ext.web.Router;
import io.vertx.ext.web.RoutingContext;

public class Routes {

    void createRoutes(Router router) {
        router.get("/").handler(this::rootHandler);
    }

    private void rootHandler(RoutingContext rctx) {
    }


}
