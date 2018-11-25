package search.estate.real.com.myrealestate;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import search.estate.real.com.myrealestate.domain.Filter;
import search.estate.real.com.myrealestate.domain.Search;
import search.estate.real.com.myrealestate.networking.service.SearchService;

public class RealEstateActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_real_estate);

        SearchService.getInstance().getFilters(new Callback<List<Filter>>() {
            @Override
            public void onResponse(Call<List<Filter>> call, Response<List<Filter>> response) {
                List<Filter> filters = response.body();
                Log.d("TEST 0001", call.request().url().host());
                Log.d("TEST 0001", filters.get(0).getName());
                Log.d("TEST 0001", "Size " + filters.size());
            }

            @Override
            public void onFailure(Call<List<Filter>> call, Throwable t) {
                Log.e("TEST ERROR 0001", t.getMessage());
            }
        });

        Map<String, String> queryString = new HashMap<String, String>();
        queryString.put("rows", "2");
        queryString.put("start", "2");
        SearchService.getInstance().search(queryString, new Callback<Search>() {
            @Override
            public void onResponse(Call<Search> call, Response<Search> response) {
                Search search = response.body();
                Log.d("TEST 0002", call.request().url().host());
                Log.d("TEST 0002", call.request().url().query());
                Log.d("TEST 0002", "Size Results " + search.getResults().size());
            }

            @Override
            public void onFailure(Call<Search> call, Throwable t) {
                Log.e("TEST ERROR 0002", t.getMessage());

            }
        });
    }
}
