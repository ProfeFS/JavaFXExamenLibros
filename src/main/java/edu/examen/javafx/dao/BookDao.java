package edu.examen.javafx.dao;

import java.sql.SQLException;
import java.util.List;

import edu.examen.javafx.modelo.Book;

public interface BookDao {
	List<Book> getAllBooks() throws SQLException;

	void insertBook(Book book) throws SQLException;

	void updateBook(Book book) throws SQLException;

}
