package search.estate.real.com.myrealestate.networking.core;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class BaseService {


    private static final String BASE_URL = "https://yzuftvqqh1.execute-api.us-east-1.amazonaws.com/challenge/";
    public static final String PUBLIC_KEY_TEST = "key=C6CC74BD9C22C7376CE4629BBC11F9080ABDCD1F807059380FEECB35B1ABC1DC";
    private static Retrofit retrofit = null;

    public static Retrofit getClient() {
        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .addConverterFactory(GsonConverterFactory.create())
                    .baseUrl(BASE_URL)
                    .build();
        }
        return retrofit;
    }

    public static <T> T getInterface(Class<T> tClass) {
        Retrofit retrofit = getClient();
        return retrofit.create(tClass);
    }

}
