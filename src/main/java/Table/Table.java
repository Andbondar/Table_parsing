package Table;

import java.util.List;

/**
 * Created by bondar on 4/27/2015.
 */
public class Table implements Tableable{
    @Override
    public List<String> listRowNames() {
        return null;
    }

    @Override
    public List<String> listHeaderNames() {
        return null;
    }

    @Override
    public List<String> takeColumn() {
        return null;
    }

    @Override
    public List<String> takeRow() {
        return null;
    }
}
