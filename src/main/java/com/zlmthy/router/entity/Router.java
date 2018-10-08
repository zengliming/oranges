package com.zlmthy.router.entity;

import com.zlmthy.enums.RequestMethod;
import io.netty.handler.codec.http.HttpMethod;

import java.lang.reflect.Method;

/**
 * @author zengliming
 * @ClassName Router
 * @Description TODO
 * @date 2018/9/5 17:07
 */
public class Router {

    /**
     * 路由的路径
     */
    private String path;

    /**
     * 路由所对应的方法
     */
    private Method method;

    /**
     * 路由的路径
     */
    private Class<?> controller;

    /**
     * 请求方式
     */
    private RequestMethod[] httpMethods;

    public Router() {
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Method getMethod() {
        return method;
    }

    public void setMethod(Method method) {
        this.method = method;
    }

    public Class<?> getController() {
        return controller;
    }

    public void setController(Class<?> controller) {
        this.controller = controller;
    }

    public RequestMethod[] getHttpMethods() {
        return httpMethods;
    }

    public void setHttpMethods(RequestMethod[] httpMethods) {
        this.httpMethods = httpMethods;
    }
}
