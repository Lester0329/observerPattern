package ObserverPattern;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class SubscriberLimit implements Subscriber {
    private final String name;
    private static final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");

    public SubscriberLimit(String name) {
        this.name = name;
    }

    @Override
    public void update(String news) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println("[" + dtf.format(now) + "] " + name + ": " + news);
    }
}
