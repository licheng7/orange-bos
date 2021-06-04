package org.orange.gateway.gateway_infrastructure.proxy;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.cloud.gateway.filter.NettyRoutingFilter;
import org.springframework.stereotype.Component;

/**
 * Created with IDEA
 * author:licheng
 * Date:2021/5/19
 * Time:下午3:51
 **/
@Slf4j
@Component
public class NettyRoutingFilterFactoryBean implements FactoryBean<GlobalFilter> {

    @Autowired
    private NettyRoutingFilter routingFilter;

    @Override
    public GlobalFilter getObject() throws Exception {
        NettyRoutingFilterProxyFactory nettyRoutingFilterProxyFactory = new NettyRoutingFilterProxyFactory();
        GlobalFilter proxy = (GlobalFilter) nettyRoutingFilterProxyFactory.createProxy(routingFilter);
        return proxy;
    }

    @Override
    public Class<?> getObjectType() {
        return NettyRoutingFilter.class;
    }

    @Override
    public boolean isSingleton() {
        return FactoryBean.super.isSingleton();
    }
}
