package skittles.service;

import skittles.domain.Book;
import skittles.domain.Reader;

import java.util.List;

public interface ReaderService {
    boolean addReader(Reader reader);
    void deleteReader(Integer readerNum);
    void updateReader(Reader reader);
    List<Reader> findAllReader();
    Reader findReaderByReaderNum(Integer readerNum);
}
