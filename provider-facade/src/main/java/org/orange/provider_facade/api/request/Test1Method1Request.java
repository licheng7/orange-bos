package org.orange.provider_facade.api.request;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;
import java.util.List;

/**
 * Created with IDEA
 * author:licheng
 * Date:2021/4/29
 * Time:下午4:17
 **/
@Data
@ToString
public class Test1Method1Request implements Serializable {

    private static final long serialVersionUID = -2061850307649580377L;

    private int id;

    private String name;

    private List<String> list;
}
