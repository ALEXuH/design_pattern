package pattern.filter;

import java.util.List;

/**
 * Created by ALEXuH on 2018/12/26
 */
public class Filter3 implements Filter {

    private Filter fil;
    private Filter fi2;

    public Filter3(Filter fi1, Filter fi2) {
        this.fil = fi1;
        this.fi2 = fi2;
    }
    public List<Person> filter(List<Person> list) {
        return this.fi2.filter(this.fil.filter(list));
    }
}
