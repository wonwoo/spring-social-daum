package org.springframework.social.daum.api;

import java.io.Serializable;

/**
 * Created by wonwoo on 15. 12. 13..
 */
public class DaumBlogInfos extends DaumObject implements Serializable {
    private static final long serialVersionUID = 1L;

    private DaumBlogInfo channel;

    public DaumBlogInfo getChannel() {
        return channel;
    }
}