package com.rodrigoleite.fundamentosjava.aula46;

public interface SqlDML {

    void select(String query);
    void insert(String query);
    void delete(String query);
    void upadate(String query);
}
