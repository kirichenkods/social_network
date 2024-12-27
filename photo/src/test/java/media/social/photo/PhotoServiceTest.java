package media.social.photo;

import media.social.profile.Profile;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.when;

class PhotoServiceTest {
    @Mock
    PhotoService photoService;
    Photo photo;
    Profile profile;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        photo = new Photo();
        profile = new Profile();
    }

    @Test
    void givenPhotoService_whenLoadPhoto_thenMethodIsCalled() {
        photoService.loadPhoto(profile, photo);
        Mockito.verify(photoService).loadPhoto(profile, photo);
    }

    @Test
    void givenPhotoService_whenGetPhotos_thenReturnListPhotos() {
        List<Photo> photos = new ArrayList<>();
        when(photoService.getPhotos(profile)).thenReturn(photos);
    }

    @Test
    void givenPhotoService_whenPutLike_thenMethodIsCalled() {
        photoService.putLike(profile, photo);
        Mockito.verify(photoService).putLike(profile, photo);
    }
}