package ru.job4j.collection;

import org.openjdk.jmh.annotations.Benchmark;

public class ArticleBenchmark {
    @Benchmark
    public void generateBy() {
        Article.generateBy(
                "Мой дядя самых честных правил, "
                        + "Когда не в шутку занемог, "
                        + "Он уважать себя заставил "
                        + "И лучше выдумать не мог. "
                        + "Его пример другим наука; "
                        + "Но, боже мой, какая скука "
                        + "С больным сидеть и день и ночь, "
                        + "Не отходя ни шагу прочь! "
                        + "Какое низкое коварство "
                        + "Полуживого забавлять, "
                        + "Ему подушки поправлять, "
                        + "Печально подносить лекарство, "
                        + "Вздыхать и думать про себя: "
                        + "Когда же черт возьмет тебя!",
                "Мой дядя мог думать про тебя и день и ночь"
        );
    }
}