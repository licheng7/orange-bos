package org.orange.customer.customer_api;

import org.apache.dubbo.config.annotation.Service;
import org.orange.customer.customer_infrastructure.ports.ProviderTestClient;
import org.orange.customer_facade.api.CustomerTestService;
import org.orange.customer_facade.api.request.Test1Method1Request;
import org.orange.customer_facade.api.response.Test1Method1Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created with IDEA
 * author:licheng
 * Date:2021/5/27
 * Time:下午8:49
 **/
@RestController
@RequestMapping("test1")
@Service(timeout = 5000, group = "customer-test", version = "${spring.application.version}")
public class CustomerTestServiceImpl implements CustomerTestService {

    @Resource
    private ProviderTestClient providerTestClient;

    @RequestMapping("method1")
    @Override
    public Test1Method1Response method1(Test1Method1Request request) {
        return null;
    }

    @RequestMapping("method2")
    @Override
    public String method2() {
        return "customer"+providerTestClient.method2();
    }
}
