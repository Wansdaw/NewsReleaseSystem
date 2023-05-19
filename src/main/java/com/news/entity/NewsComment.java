package com.news.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 
 * </p>
 *
 * @author Sancean
 * @since 2023-05-18
 */
@Getter
@Setter
@TableName("news_comment")
public class NewsComment implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 新闻id
     */
    private Integer newsId;

    /**
     * 评论id
     */
    private Integer commentId;
}
