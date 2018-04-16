package com.hyuki.dp.Iterator.A1;

import java.util.Iterator;

public class BookShelfIterator implements Iterator<Book> {
	private BookShelf bookShelf;
	private int index;

	public BookShelfIterator(BookShelf bookShelf) {
		this.bookShelf = bookShelf;
		this.index = 0;
	}

	@Override
	public boolean hasNext() {
		if (index < bookShelf.getLength()) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public Book next() {
		// ひとまず順方向にスキャン。他には、逆方向に進んだり、最後尾から始めるなど
		Book book = bookShelf.getBookAt(index);
		index++;
		return book;
	}
}
