package search.estate.real.com.myrealestate.networking.api;


import java.util.List;
import java.util.Map;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.QueryMap;
import search.estate.real.com.myrealestate.domain.Search;
import search.estate.real.com.myrealestate.networking.core.BaseService;
import search.estate.real.com.myrealestate.domain.Filter;

public interface SearchI {

    @Headers("Authorization: " + BaseService.PUBLIC_KEY_TEST)
    @GET("search")
    Call<Search> search(@QueryMap Map<String, String> queryString);

    @Headers("Authorization: " + BaseService.PUBLIC_KEY_TEST)
    @GET("search/filters")
    Call<List<Filter>> getFilters();

}
