package br.com.pnp.semantic

import br.com.pnp.model.construct.Construct
import br.com.pnp.model.construct.Variable

class SymbolTable() {
    private var parent: SymbolTable? = null
    val symbols = LinkedHashMap<String, Construct>()

    val variables: List<Variable>
        get() = symbols.values.filterIsInstance<Variable>()
    val values: List<Construct>
        get() = symbols.values.toList()

    private constructor(parent: SymbolTable) : this() {
        this.parent = parent
    }

    fun startNewScope(): SymbolTable {
        return SymbolTable(this)
    }

    fun lastScope(): SymbolTable? {
        return parent
    }

    fun tryGetValue(key: String): Construct? {
        if (symbols.containsKey(key)) {
            return symbols[key]
        }
        return parent?.tryGetValue(key)
    }

    fun tryPutValue(key: String, value: Construct): Boolean {
        if (!symbols.containsKey(key)) {
            symbols[key] = value
            return true
        }
        return false
    }

    fun existsInThisScope(key: String): Boolean {
        return symbols.containsKey(key)
    }

    fun exists(key: String): Boolean {
        if (!symbols.containsKey(key)) {
            return parent?.exists(key) ?: false
        }
        return true
    }

    fun resetTable() {
        symbols.clear()
    }
}
