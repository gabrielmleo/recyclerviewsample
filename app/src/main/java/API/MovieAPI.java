package API;

import model.Movie;
import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by gabri on 25/10/2016.
 */
public interface MovieAPI {

    @GET("movies")
    Call<Movie> getMovie();
}
