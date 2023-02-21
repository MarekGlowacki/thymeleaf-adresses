package online.javafun.urls;

import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class PictureRepository {
    private final Map<String, Picture> pictures = new HashMap<>();

    public PictureRepository() {
        Picture picture1 = new Picture("dog", "Mądry przyjaciel", "husky.jpg");
        Picture picture2 = new Picture("cat", "Koteł", "kot.jpg");
        Picture picture3 = new Picture("kilof", "Żeby do czegoś dojść, trzeba zapierdalać!", "working-hard.jpg");

        pictures.put(picture1.getId(), picture1);
        pictures.put(picture2.getId(), picture2);
        pictures.put(picture3.getId(), picture3);
    }

    Picture findImageById(String id) {
        return pictures.get(id);
    }

    Collection<Picture> findAll() {
        return pictures.values();
    }

}
