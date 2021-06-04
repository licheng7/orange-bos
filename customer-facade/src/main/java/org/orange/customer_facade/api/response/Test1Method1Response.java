package org.orange.customer_facade.api.response;

import lombok.*;

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
@NoArgsConstructor
@RequiredArgsConstructor
public class Test1Method1Response implements Serializable {

    private static final long serialVersionUID = 9159795303649815266L;

    @NonNull
    private int id;

    @NonNull
    private String name;

    @NonNull
    private List<String> list;
}
