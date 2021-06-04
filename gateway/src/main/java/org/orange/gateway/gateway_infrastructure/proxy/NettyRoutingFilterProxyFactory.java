package org.orange.gateway.gateway_infrastructure.proxy;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.web.server.ServerWebExchange;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.net.URI;

import static org.springframework.cloud.gateway.support.ServerWebExchangeUtils.GATEWAY_REQUEST_URL_ATTR;

/**
 * Created with IDEA
 * author:licheng
 * Date:2021/5/19
 * Time:下午4:20
 **/
@Slf4j
public class NettyRoutingFilterProxyFactory<T> extends AbstractProxyFactory<T> {

    @Override
    public Object createProxy(T target) {

        this.target = target;

        NettyRoutingProxy nettyRoutingProxy = new NettyRoutingProxy();
        return Proxy.newProxyInstance(this.getClass().getClassLoader(),
                target.getClass().getInterfaces(), nettyRoutingProxy);
    }


    private class NettyRoutingProxy implements InvocationHandler {

        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

            if("filter".equals(method.getName())) {

                log.info("我就是打印一下，确定filter代理方法执行了");
                ServerWebExchange exchange = (ServerWebExchange) args[0];
                GatewayFilterChain chain = (GatewayFilterChain) args[1];

                URI requestUrl = exchange.getRequiredAttribute(GATEWAY_REQUEST_URL_ATTR);

                //method.invoke(target, args);
            }

            return method.invoke(target, args);
        }


    }
}
