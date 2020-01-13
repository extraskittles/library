package skittles.service;

import skittles.domain.Log;

import java.util.List;

public interface LogService {
    boolean addLog(Log log);
    void deleteLog(Log log);
    void updateLog(Log log);
    List<Log> findAllLog();
    List<Log> findByReaderNum(Integer readerNum);
}
