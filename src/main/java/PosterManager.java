public class PosterManager {
    private  String[] poster = new String[0];
    private int limit;

    public PosterManager() {
        this.limit = 10;
    }

    public PosterManager(int limit) {
        this.limit = limit;
    }

    public void add(String post) {
        String[] tmp = new String[poster.length + 1];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = poster[i];
        }
        tmp[tmp.length - 1] = post;
        poster = tmp;
    }

    public String[] findAll() {
        return poster;
    }

    public String[] findLast() {
        int resultLength;
        if (poster.length < limit) {
            resultLength = poster.length;
        } else {
            resultLength = limit;
        }
        String[] tmp = new String[10];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = poster[poster.length - 1 - i];
        }
        return tmp;
    }
}