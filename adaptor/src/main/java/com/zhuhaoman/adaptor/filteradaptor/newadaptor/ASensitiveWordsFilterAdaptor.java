package com.zhuhaoman.adaptor.filteradaptor.newadaptor;

import com.zhuhaoman.adaptor.filteradaptor.old.ASensitiveWordsFilter;

/**
 * @ClassName ASensitiveWordsFilterAdaptor
 * @Description TODO
 * @Author zhuhaoman
 * @Date 2020/4/23 13:22
 **/
public class ASensitiveWordsFilterAdaptor implements ISensitiveWordsFilter {
    private ASensitiveWordsFilter aFilter;

    @Override
    public String filter(String text) {
        String maskedText = aFilter.filterSexyWords(text);
        maskedText = aFilter.filterPoliticalWords(maskedText);
        return maskedText;
    }
}
