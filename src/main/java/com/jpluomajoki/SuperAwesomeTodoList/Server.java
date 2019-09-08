package com.jpluomajoki.SuperAwesomeTodoList;

import io.vertx.core.Vertx;
import io.vertx.core.http.HttpServer;
import io.vertx.ext.web.Router;

public class Server {

    private Vertx vertx;
    private HttpServer httpServer;

    public Server() {
        // Use default settings for now. Later could create a second constructor for custom settings.
        this.vertx = Vertx.vertx();
        Router router = Router.router(vertx);
        this.httpServer = vertx.createHttpServer();
    }


}
