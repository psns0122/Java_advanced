package day08.src.StudentIOInterface;

public interface StudentIO extends StudentInput, SearchStudent, SortedStudent {
    int printAll = 0;

    int sortBySno = 1;
    int sortByRank = 2;
}
