package org.orange.provider_facade.api;

import org.orange.provider_facade.api.request.Test1Method1Request;
import org.orange.provider_facade.api.response.Test1Method1Response;

/**
 * Created with IDEA
 * author:licheng
 * Date:2021/5/31
 * Time:上午1:21
 **/
public interface ProvideTestService {

    Test1Method1Response method1(Test1Method1Request request);

    String method2();
}
