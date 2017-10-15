package lap.hou.com.lesson6_retrofitandroid;

import java.util.List;

import retrofit.Callback;
import retrofit.http.GET;

/**
 * Created by Lap on 14/10/2017.
 */

public interface BooksAPI {
    @GET("/bins/1ehhr5.json")
    public void getBooks(Callback<List<Book>> response);

}
