package org.springframework.social.daum.api;

import java.io.Serializable;

/**
 * Created by wonwoo on 15. 12. 13..
 */
public class DaumBlogComments extends DaumObject implements Serializable {
    private static final long serialVersionUID = 1L;

    private DaumBlogComment channel;

    public DaumBlogComment getChannel() {
        return channel;
    }
}
