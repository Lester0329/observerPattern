package ObserverPattern;

public class RealtimeNewsService {
    public static void main(String[] args) {
        NewsAgency newsAgency = new NewsAgency();
        Subscriber subscriber1 = new SubscriberLimit("Maruku Senpai");
        Subscriber subscriber2 = new SubscriberLimit("Raya Senpai");

        newsAgency.addSubscriber(subscriber1);
        newsAgency.addSubscriber(subscriber2);

        String firstHeadline ="Chapter closed: Kathryn Bernardo and Daniel Padilla confirm breakup!";
        String firstNews = "“Chapter closed,” the 27-year-old actress wrote in her caption, while sharing an old photo of her and Daniel. \n" +
                "\t\t\t\t\t\t\t\t“I hope this finally helps all of us move forward. I won’t be entertaining questions regarding this anymore. " +
                "\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tThank you for understanding.";
        newsAgency.printNews(firstHeadline, firstNews);

        String secondHeadline = "Philippine quake aftershocks force thousands to stay in evacuation centres";
        String secondNews = "MANILA, Dec 4 (Reuters) - Strong aftershocks from an earthquake that has killed at least three people and a new tremor \n\t\t\t\t\t\tin southern Philippines are forcing thousands of residents to stay in evacuation centres, disaster officials said on Monday.";
        newsAgency.printNews(secondHeadline, secondNews);

        newsAgency.removeSubscriber(subscriber1);
        String thirdHeadline = "ISIL claims responsibility for bombing at Catholic mass in Philippines";
        String thirdNews = "The ISIL (ISIS) group has claimed responsibility for the bombing of a Catholic mass service in \n\t\t\t\t\t\tthe southern Philippines that killed at least four people and injured dozens more.";
        newsAgency.printNews(thirdHeadline, thirdNews);

        newsAgency.removeSubscriber(subscriber2);
        String fourthHeadline = "Philippines' 1,340 COVID-19 cases from Nov. 28-Dec. 4 highest in 19 weeks";
        String fourthNews = "The Philippines recorded 1,340 new coronavirus cases from November 28 to December 4, 2023, \n\t\t\t\t\t\tthe highest number of fresh infections in 19 weeks, data from the Department of Health (DOH) showed.\"";
        newsAgency.printNews(fourthHeadline, fourthNews);

    }
}
