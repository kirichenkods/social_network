import media.social.friendship.FriendshipService;
import media.social.profile.Profile;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

public class FriendshipServiceTest {
    @Mock
    FriendshipService friendshipService;
    Profile profile1;
    Profile profile2;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        profile1 = new Profile();
        profile2 = new Profile();
    }
    @Test
    void givenFriendshipService_whenAddFriends_thenMethodIsCalled() {
        friendshipService.removeFromFriends(profile1, profile2);
        Mockito.verify(friendshipService).removeFromFriends(profile1, profile2);
    }

    @Test
    void givenFriendshipService_whenRemoveFriends_thenMethodIsCalled() {
        friendshipService.addToFriends(profile1, profile2);
        Mockito.verify(friendshipService).addToFriends(profile1, profile2);
    }

}
