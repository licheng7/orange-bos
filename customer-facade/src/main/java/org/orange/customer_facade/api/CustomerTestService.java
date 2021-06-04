package org.orange.customer_facade.api;

import org.orange.customer_facade.api.request.Test1Method1Request;
import org.orange.customer_facade.api.response.Test1Method1Response;

/**
 * Created with IDEA
 * author:licheng
 * Date:2021/5/27
 * Time:下午5:54
 **/
public interface CustomerTestService {

    Test1Method1Response method1(Test1Method1Request request);

    String method2();
}
