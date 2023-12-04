package ObserverPattern;
import java.util.HashSet;
import java.util.Set;
public class NewsAgency{
    private final Set<Subscriber> subscribers = new HashSet<>();

    public void addSubscriber(Subscriber subscriber) {
        subscribers.add(subscriber);
    }
    public void removeSubscriber(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }
    public void notifSubs(String news) {
        for (Subscriber subscriber : subscribers) {
            subscriber.update(news);
        }
    }

    public void printNews(String headline, String descriptiveNews) {
        String outline = new String(new char[150]).replace("\0", "-");
        System.out.println(outline);
        System.out.println("The top story of the Day:0 \n " + headline + "");
        System.out.println(outline);
        notifSubs(descriptiveNews);
        System.out.println(outline);
        System.out.println("Keep up with the most recent news update. We are grateful that you believe ABS-CBN News.");
        System.out.println(outline + "\n");
    }
}
