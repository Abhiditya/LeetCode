class MovieRentingSystem {
    private static class Entry {
        int shop, movie, price;
        Entry(int s, int m, int p) { shop = s; movie = m; price = p; }
    }

    private final Map<Integer, TreeSet<Entry>> available;
    private final TreeSet<Entry> rented;
    private final Map<String, Entry> map;

    public MovieRentingSystem(int n, int[][] entries) {
        available = new HashMap<>();
        rented = new TreeSet<>((a, b) -> 
            a.price != b.price ? a.price - b.price :
            a.shop != b.shop ? a.shop - b.shop :
            a.movie - b.movie
        );
        map = new HashMap<>();
        for (int[] e : entries) {
            Entry entry = new Entry(e[0], e[1], e[2]);
            map.put(e[0] + "#" + e[1], entry);
            available.computeIfAbsent(e[1], k -> new TreeSet<>((a, b) ->
                a.price != b.price ? a.price - b.price :
                a.shop - b.shop
            )).add(entry);
        }
    }

    public List<Integer> search(int movie) {
        List<Integer> res = new ArrayList<>();
        if (!available.containsKey(movie)) return res;
        Iterator<Entry> it = available.get(movie).iterator();
        for (int i = 0; i < 5 && it.hasNext(); i++) {
            res.add(it.next().shop);
        }
        return res;
    }

    public void rent(int shop, int movie) {
        Entry e = map.get(shop + "#" + movie);
        available.get(movie).remove(e);
        rented.add(e);
    }

    public void drop(int shop, int movie) {
        Entry e = map.get(shop + "#" + movie);
        rented.remove(e);
        available.get(movie).add(e);
    }

    public List<List<Integer>> report() {
        List<List<Integer>> res = new ArrayList<>();
        Iterator<Entry> it = rented.iterator();
        for (int i = 0; i < 5 && it.hasNext(); i++) {
            Entry e = it.next();
            res.add(Arrays.asList(e.shop, e.movie));
        }
        return res;
    }
}

/**
 * Your MovieRentingSystem object will be instantiated and called as such:
 * MovieRentingSystem obj = new MovieRentingSystem(n, entries);
 * List<Integer> param_1 = obj.search(movie);
 * obj.rent(shop,movie);
 * obj.drop(shop,movie);
 * List<List<Integer>> param_4 = obj.report();
 */