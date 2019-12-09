package br.com.pnp.compiler.semantic;

import br.com.pnp.compiler.model.construct.Construct;
import br.com.pnp.compiler.model.construct.Variable;

import java.util.*;

public class SymbolTable {
    private SymbolTable parent = null;
    private HashMap<String, Construct> symbols = new LinkedHashMap<>();

    SymbolTable() { }

    private SymbolTable(SymbolTable parent) {
        this.parent = parent;
    }

    public SymbolTable startNewScope() {
        return new SymbolTable(this);
    }

    public SymbolTable lastScope() {
        return parent;
    }

    public Construct tryGetValue(String key) {
        if (symbols.containsKey(key)) {
            return symbols.get(key);
        }
        if (parent != null) {
            return parent.tryGetValue(key);
        }
        return null;
    }

    public void tryPutValue(String key, Construct value) {
        if (!symbols.containsKey(key)) {
            symbols.put(key, value);
        }
    }

    public boolean existsInThisScope(String key) {
        return symbols.containsKey(key);
    }

    public boolean exists(String key) {
        if (!symbols.containsKey(key)) {
            return parent.exists(key);
        }
        return true;
    }

    public List<Variable> getVariables() {
        List<Variable> variables = new ArrayList<>();

        for (Construct entry : symbols.values()) {
            if (entry instanceof Variable) {
                variables.add((Variable)entry);
            }
        }

        return variables;
    }

    public Collection<Construct> getValues() {
        return symbols.values();
    }
}
