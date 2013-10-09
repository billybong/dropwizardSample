package se.eyc.helloworld.data;

/**
 * User: bisj
 * Date: 2013-10-09
 * Time: 12:27
 */
public class Saying{

    private final long id;
    private final String content;

    public Saying(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
