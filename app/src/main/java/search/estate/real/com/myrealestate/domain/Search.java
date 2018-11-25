package search.estate.real.com.myrealestate.domain;

import java.util.List;

public class Search {

    private List<Result> results;
    private Paging paging;
    private List<Filter> filters;
    private List<Availablefilter> availablefilters;

    public List<Result> getResults() {
        return results;
    }

    public Paging getPaging() {
        return paging;
    }

    public List<Filter> getFilters() {
        return filters;
    }

    public List<Availablefilter> getAvailablefilters() {
        return availablefilters;
    }
}
