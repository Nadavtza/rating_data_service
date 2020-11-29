package movies.server.ratingdataservice.resources;

import movies.server.ratingdataservice.models.Rating;
import movies.server.ratingdataservice.models.UserRating;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RestController
@RequestMapping("/ratingsdata")
public class RatingResource {

    @RequestMapping(value = "/{movieId}" , method = RequestMethod.GET)
    public Rating getMovieRating(@PathVariable String movieId) {
        return new Rating(movieId,4);
    }

    @RequestMapping(value = "users/{userId}" , method = RequestMethod.GET)
    public UserRating getUserRating(@PathVariable String userId) {
        return new UserRating(Arrays.asList(
                new Rating("34321", 3),
                new Rating("554321", 7),
                new Rating("621", 2)
        ));
    }
}
