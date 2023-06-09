package com.news.service.impl;

import com.news.entity.NewsData;
import com.news.mapper.NewsDataMapper;
import com.news.service.NewsDataService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Sancean
 * @since 2023-05-18
 */
@Service
public class NewsDataServiceImpl extends ServiceImpl<NewsDataMapper, NewsData> implements NewsDataService {

}
