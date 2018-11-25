package search.estate.real.com.myrealestate.networking.service;

import java.util.List;
import java.util.Map;

import retrofit2.Callback;
import retrofit2.http.QueryMap;
import search.estate.real.com.myrealestate.domain.Filter;
import search.estate.real.com.myrealestate.domain.Search;
import search.estate.real.com.myrealestate.networking.api.SearchI;
import search.estate.real.com.myrealestate.networking.core.BaseService;

public class SearchService {

    private static SearchService instance;
    private static SearchI searchI;

    private SearchService(){
        this.searchI = BaseService.getInterface(SearchI.class);
    }

    public static SearchService getInstance() {
        if(instance==null)
            instance=new SearchService();

        return instance;
    }

    public void search(Map<String, String> queryMap, Callback<Search> callback){
        this.searchI.search(queryMap).enqueue(callback);
    }

    public void getFilters(Callback<List<Filter>> callback) {
        this.searchI.getFilters().enqueue(callback);
    }
}
