package analizadorLexico;


import analizadorLexico.Token;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import javax.swing.table.AbstractTableModel;

public class tabelaLexica extends AbstractTableModel {
    private final Stack<Token> bufferTokens;
    private final List<String> titulo;
    
    public tabelaLexica(Stack<Token> bufferTokens) {
        this.bufferTokens = bufferTokens;
        titulo = new ArrayList<>();
        titulo.add("id");
        titulo.add("palavra");
    }

    @Override
    public int getRowCount() {
        return bufferTokens.size();
    }

    @Override
    public int getColumnCount() {
        return 2;
    }

    @Override
    public String getColumnName(int num) {
        return this.titulo.get(num);
    }

    @Override
    public Object getValueAt(int linha, int coluna) {
        if(coluna == 0){
            return bufferTokens.get(linha).getCodigo();
        } else {
            return bufferTokens.get(linha).getNome();
        }
    }
}

