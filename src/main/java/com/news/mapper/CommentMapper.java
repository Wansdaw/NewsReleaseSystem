package com.news.mapper;

import com.news.entity.Comment;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author Sancean
 * @since 2023-05-18
 */
@Mapper
public interface CommentMapper extends BaseMapper<Comment> {

}
