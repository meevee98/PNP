package pnp.compiler.semantic;

import pnp.compiler.model.construct.Construct;

import java.util.HashMap;

public class SymbolTable {
    private SymbolTable parent = null;
    private HashMap<String, Construct> symbols = new HashMap<>();

    SymbolTable() { }

    private SymbolTable(SymbolTable parent) {
        this.parent = parent;
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
}
