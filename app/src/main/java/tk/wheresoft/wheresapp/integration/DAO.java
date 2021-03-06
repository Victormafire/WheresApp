package tk.wheresoft.wheresapp.integration;

import java.util.List;

/**
 * Created by Victorma on 25/11/2014.
 */
public interface DAO<T> {
    public static String filterChange = "tk.wheresoft.wheresapp";

    public boolean create(T t);

    public T read(T t);

    public boolean update(T t);

    public boolean delete(T t);

    public boolean deleteAll();

    public List<T> discover(T t);

    public List<T> discover(T t, int limit, int page);
}
