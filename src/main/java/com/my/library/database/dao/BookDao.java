package com.my.library.database.dao;

import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.stmt.DeleteBuilder;
import com.my.library.database.models.Book;
import org.omg.CORBA.portable.ApplicationException;

import java.sql.SQLException;

public class BookDao extends CommonDao{
    public BookDao() {
        super();
    }

    public void deleteByColumnName(String columName, int id) throws ApplicationException, SQLException {
        Dao<Book, Object> dao = getDao(Book.class);
        DeleteBuilder<Book, Object> deleteBuilder = dao.deleteBuilder();
        deleteBuilder.where().eq(columName, id);
        dao.delete(deleteBuilder.prepare());
    }
}
