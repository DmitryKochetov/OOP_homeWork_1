package DZ1.app;

import java.io.IOException;

public interface View {
    void setPresenter(Presenter presenter);

    void start() throws IOException, ClassNotFoundException;

}