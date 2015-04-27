package Table;

import java.util.List;

/**
 * Created by bondar on 4/27/2015.
 *
 * 1. ??????? ????? ??????? ? ????????:
 a. listRowNames
 b. listHeaderNames
 c. TakeColumn (return List<String>)
 d. TakeRow (return List<String>)
 e.  (return String)*
 */
public interface Tableable {
    public List<String> listRowNames();
    public List<String> listHeaderNames();
    public List<String> takeColumn();
    public List<String> takeRow();
}
