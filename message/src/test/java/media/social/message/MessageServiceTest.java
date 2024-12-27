package media.social.message;

import media.social.profile.Profile;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

class MessageServiceTest {

    @Mock
    MessageService messageService;
    Profile sender;
    Profile recipient;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        sender = new Profile();
        recipient = new Profile();
    }
    @Test
    void givenMessageService_whenSendMessage_thenMethodIsCalled() {
        messageService.sendMessage("Hello", sender, recipient);
        Mockito.verify(messageService).sendMessage("Hello", sender, recipient);
    }
}