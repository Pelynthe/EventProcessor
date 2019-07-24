package ru.sberbank.school.news.converter;

import lombok.NonNull;
import org.springframework.stereotype.Component;
import ru.sberbank.school.feign.model.NewsModel;
import ru.sberbank.school.news.entity.News;

@Component
public class NewsConverter {

    public NewsModel convertToModel (@NonNull News news) {
        return NewsModel.builder()
                .id(news.getId())
                .idEvent(news.getIdEvent())
                .headline(news.getHeadline())
                .text(news.getText())
                .timestamp(news.getTimestamp())
                .build();
    }

    public News convertToEntity (@NonNull NewsModel news) {
        return News.builder()
                .id(news.getId())
                .idEvent(news.getIdEvent())
                .headline(news.getHeadline())
                .text(news.getText())
                .timestamp(news.getTimestamp())
                .build();
    }
}