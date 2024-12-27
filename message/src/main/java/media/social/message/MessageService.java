package media.social.message;

import media.social.profile.Profile;

public interface MessageService {
    /**
     * Отправка сообщения от одного пользователя другому
     */
    void sendMessage(String message, Profile sender, Profile recipient);
}
