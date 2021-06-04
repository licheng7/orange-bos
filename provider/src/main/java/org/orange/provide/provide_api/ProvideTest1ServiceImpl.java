package org.orange.provide.provide_api;

import org.apache.dubbo.config.annotation.Service;
import org.orange.provider_facade.api.ProvideTestService;
import org.orange.provider_facade.api.request.Test1Method1Request;
import org.orange.provider_facade.api.response.Test1Method1Response;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

/**
 * Created with IDEA
 * author:licheng
 * Date:2021/4/29
 * Time:下午4:56
 **/
@RestController
@RequestMapping("test1")
@Service(timeout = 5000, group = "provider-test", version = "${spring.application.version}")
@RefreshScope
public class ProvideTest1ServiceImpl implements ProvideTestService {

    @Value(value = "${a.b.c:234}")
    private String c;

    @RequestMapping("method1")
    @Override
    public Test1Method1Response method1(Test1Method1Request request) {

        return new Test1Method1Response(1, "provider",
                Arrays.asList(new String[]{"a", "b", "c"}.clone()));
    }

    @RequestMapping("method2")
    @Override
    public String method2() {
        return "provider testProperties:"+c;
    }
}
