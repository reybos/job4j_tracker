package ru.job4j.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.function.Function;
import java.util.function.Predicate;

public class EasyStream {
    private ListIterator<Integer> stream;
    private List<Integer> rsl;

    public static class Builder {
        private EasyStream newEasyStream;

        public Builder() {
            newEasyStream = new EasyStream();
        }

        public Builder optStream(List<Integer> source) {
            newEasyStream.stream = source.listIterator();
            return this;
        }

        public Builder optRsl() {
            newEasyStream.rsl = new ArrayList<>();
            return this;
        }

        public EasyStream build() {
            return newEasyStream;
        }
    }

    public static EasyStream of(List<Integer> source) {
        return new Builder()
                .optStream(source)
                .optRsl()
                .build();
    }

    public EasyStream map(Function<Integer, Integer> fun) {
        while (stream.hasNext()) {
            rsl.add(fun.apply(stream.next()));
        }
        return EasyStream.of(rsl);
    }

    public EasyStream filter(Predicate<Integer> fun) {
        while (stream.hasNext()) {
            Integer curr = stream.next();
            if (fun.test(curr)) {
                rsl.add(curr);
            }
        }
        return EasyStream.of(rsl);
    }

    public List<Integer> collect() {
        while (stream.hasNext()) {
            rsl.add(stream.next());
        }
        return rsl;
    }
}