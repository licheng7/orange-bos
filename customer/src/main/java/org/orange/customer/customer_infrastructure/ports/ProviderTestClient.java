package org.orange.customer.customer_infrastructure.ports;

import org.apache.dubbo.config.annotation.Reference;
import org.orange.provider_facade.api.ProvideTestService;
import org.orange.provider_facade.api.request.Test1Method1Request;
import org.orange.provider_facade.api.response.Test1Method1Response;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * Created with IDEA
 * author:licheng
 * Date:2021/6/1
 * Time:下午4:49
 **/
@Component
public class ProviderTestClient implements ProvideTestService {

    @Reference(group = "provider-test", version = "${spring.application.version}")
    private ProvideTestService provideTestService;


    @Override
    public Test1Method1Response method1(Test1Method1Request request) {
        return provideTestService.method1(request);
    }

    @Override
    public String method2() {
        return provideTestService.method2();
    }
}
