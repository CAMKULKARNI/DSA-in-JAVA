import java.util.LinkedList;

public class HashTable {
    private class Entry {
        private final int key;
        private String value;

        public Entry(final int key, final String value) {
            this.key = key;
            this.value = value;
        }
    }

    private final LinkedList<Entry>[] entries = new LinkedList[5];

    public void put(final int key, final String value) {
        final int index = hash(key);
        if (entries[index] == null) {
            entries[index] = new LinkedList<>();
        }

        for (final var entry : entries[index]) {
            if (entry.key == key) {
                entry.value = value;
                return;
            }
        }

        entries[index].addLast(new Entry(key, value));
    }

    public String get(final int key) {
        final var index = hash(key);
        final var bucket = entries[index];
        if (bucket != null) {
            for (final var entry : bucket) {
                if (entry.key == key) {
                    return entry.value;
                }
            }
        }

        return null;
    }

    public void remove(final int key) {
        final var index = hash(key);
        final var bucket = entries[index];
        if (bucket == null) {
            throw new IllegalStateException("Invalid Entry");
        }

        for (final var entry : bucket) {
            if (entry.key == key) {
                bucket.remove(entry);
                return;
            }
        }

        throw new IllegalStateException("Invalid Entry");
    }

    private int hash(final int key) {
        return key % entries.length;
    }
}
