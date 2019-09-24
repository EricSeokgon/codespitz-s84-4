public enum CompositeSortType {
    TITLE_DESC{
        @Override
        int compare(CompositeTask a, CompositeTask b) {
            return a.getTitle().compareTo(b.getTitle());
        }
    },
    TITLE_ASC{
        @Override
        int compare(CompositeTask a, CompositeTask b) {
            return b.getTitle().compareTo(a.getTitle());
        }
    },
    DATE_DESC{
        @Override
        int compare(CompositeTask a, CompositeTask b) {
            return a.getDate().compareTo(b.getDate());
        }
    },
    DATE_ASC{
        @Override
        int compare(CompositeTask a, CompositeTask b) {
            return b.getDate().compareTo(a.getDate());
        }
    };

    abstract int compare(CompositeTask a, CompositeTask b);
}