package com.vighzhen.vigojbackend.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.vighzhen.vigojbackend.model.dto.post.PostQueryRequest;
import com.vighzhen.vigojbackend.model.entity.Post;
import javax.annotation.Resource;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * 帖子服务测试
 *
 * @author <a href="https://github.com/livighzhen">程序员皮</a>
 * 
 */
@SpringBootTest
class PostServiceTest {

    @Resource
    private com.vighzhen.vigojbackend.service.PostService postService;

    @Test
    void searchFromEs() {
        PostQueryRequest postQueryRequest = new PostQueryRequest();
        postQueryRequest.setUserId(1L);
        Page<Post> postPage = postService.searchFromEs(postQueryRequest);
        Assertions.assertNotNull(postPage);
    }

}