package skittles.domain;

import java.sql.Date;

public class Log {
    private Integer id;
    private Integer bookNum;
    private Integer readerNum;
    private Date lendTime;
    private Date returnTime;
    private String bookName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getBookNum() {
        return bookNum;
    }

    public void setBookNum(Integer bookNum) {
        this.bookNum = bookNum;
    }

    public Integer getReaderNum() {
        return readerNum;
    }

    public void setReaderNum(Integer readerNum) {
        this.readerNum = readerNum;
    }

    public Date getLendTime() {
        return lendTime;
    }

    public void setLendTime(Date lendTime) {
        this.lendTime = lendTime;
    }

    public Date getReturnTime() {
        return returnTime;
    }

    public void setReturnTime(Date returnTime) {
        this.returnTime = returnTime;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    @Override
    public String toString() {
        return "Log{" +
                "id=" + id +
                ", bookNum=" + bookNum +
                ", readerNum=" + readerNum +
                ", lendTime=" + lendTime +
                ", returnTime=" + returnTime +
                ", bookName='" + bookName + '\'' +
                '}';
    }
}
