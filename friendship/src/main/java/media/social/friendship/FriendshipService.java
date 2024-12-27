package media.social.friendship;

import media.social.profile.Profile;

public interface FriendshipService {
    /**
     * Добавляет в друзья
     */
    void addToFriends(Profile profile1, Profile profile2);

    /**
     * Удаляет из друзей
     */
    void removeFromFriends(Profile profile1, Profile profile2);
}
