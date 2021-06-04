package org.orange.gateway.gateway_infrastructure.proxy;

/**
 * Created with IDEA
 * author:licheng
 * Date:2021/5/19
 * Time:下午4:23
 **/
public abstract class AbstractProxyFactory<T> implements ProxyFactory<T> {

    T target;
}
