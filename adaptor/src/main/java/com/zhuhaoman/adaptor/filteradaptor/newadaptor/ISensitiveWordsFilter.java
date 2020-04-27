package com.zhuhaoman.adaptor.filteradaptor.newadaptor;

/**
 * @ClassName ISensitiveWordsFilter
 * @Description 使用适配器模式进行改造
 * @Author zhuhaoman
 * @Date 2020/4/23 13:21
 **/
public interface ISensitiveWordsFilter {
    String filter(String text);
}
