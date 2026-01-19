package com.rodrigoleite.fundamentosjava.aula46;

public interface BancoDados extends SqlDCL, SqlDML, SqlDLL{

    void abrirConexao();
    void fecharConexao();
}
