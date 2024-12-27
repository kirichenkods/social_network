package media.social.photo;

import media.social.profile.Profile;

import java.util.List;

public interface PhotoService {
    /**
     * Загрузка фото пользователя
     */
    void loadPhoto(Profile profile, Photo photo);

    /**
     * Возвращает все фото пользователя
     */
    List<Photo> getPhotos(Profile profile);

    /**
     * Поставить лайк на фото (убирает лайк, если ранее был поставлен)
     */
    void putLike(Profile profile, Photo photo);
}
