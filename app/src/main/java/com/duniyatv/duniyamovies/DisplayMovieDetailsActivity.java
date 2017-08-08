package com.duniyatv.duniyamovies;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;
import com.squareup.picasso.Picasso;

/**
 * Created by ashgarhussain on 8/1/17.
 */

public class DisplayMovieDetailsActivity extends AppCompatActivity{

    private static final String THE_MOVIE_DB_POSTER_PREFIX = "http://image.tmdb.org/t/p/w342";
    private static final String DESCRIPTION_HEADING = "DESCRIPTION: ";
    private static final String RATING_HEADING = "POPULARITY: ";
    private static final String RELEASE_DATE_HEADING = "RELEASE DATE: ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.movie_details);
        Movie movie = new Movie();

        Bundle bundle = getIntent().getExtras();
        movie.setTitle(bundle.getString("title"));
        movie.setReleaseDate(bundle.getString("release_date"));
        movie.setPosterPath(bundle.getString("poster_path"));
        movie.setPlotSynopsis(bundle.getString("plot_synopsis"));
        movie.setRating(bundle.getDouble("rating"));

        Log.d("DEBUG","movie.title = " + movie.getTitle());
        Log.d("DEBUG","movie.releaseDate = " + movie.getReleaseDate());
        Log.d("DEBUG","movie.posterPath = " + movie.getPosterPath());
        Log.d("DEBUG","movie.plotSynopsis = " + movie.getPlotSynopsis());
        Log.d("DEBUG","movie.rating = " + movie.getRating());

        TextView title = (TextView) findViewById(R.id.detail_title);
        ImageView image = (ImageView) findViewById(R.id.detail_image);
        TextView synopsis = (TextView) findViewById(R.id.detail_synopsis);

        TextView rating = (TextView) findViewById(R.id.details_rating);
        TextView releaseDate = (TextView) findViewById(R.id.details_release_date);

        title.setText(movie.getTitle());
        title.setTypeface(null, Typeface.BOLD);

        String completePosterPath = THE_MOVIE_DB_POSTER_PREFIX+movie.getPosterPath();
        Picasso.with(this).load(completePosterPath).into(image);

        String plotSynopsis = DESCRIPTION_HEADING + movie.getPlotSynopsis();
        synopsis.setText(plotSynopsis);

        String ratingString = RATING_HEADING + Double.toString(movie.getRating());
        rating.setText(ratingString);

        String releaseDateString = RELEASE_DATE_HEADING + movie.getReleaseDate();
        releaseDate.setText(releaseDateString);
    }
}
