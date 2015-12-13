package org.springframework.social.daum.api;

import java.io.Serializable;
import java.util.List;

/**
 * Created by wonwoo on 15. 12. 13..
 */
public class DaumBlogList extends DaumObject implements Serializable {
    private static final long serialVersionUID = 1L;

    private DaumBlogChannel channel;

    public DaumBlogChannel getChannel() {
        return channel;
    }
}