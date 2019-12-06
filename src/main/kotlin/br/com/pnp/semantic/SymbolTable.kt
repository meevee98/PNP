package br.com.pnp.semantic

import br.com.pnp.compiler.model.construct.Variable
import br.com.pnp.model.construct.Construct
import java.util.ArrayList

class SymbolTable() {
    private var parent: SymbolTable? = null
    private val symbols = LinkedHashMap<String, Construct>()

    val variables: List<Variable>
        get() {
            val variables = ArrayList<Variable>()

            for (entry in symbols.values) {
                if (entry is Variable) {
                    variables.add(entry)
                }
            }

            return variables
        }

    private constructor(parent: SymbolTable): this() {
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

    fun tryPutValue(key: String, value: Construct) {
        if (!symbols.containsKey(key)) {
            symbols[key] = value
        }
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
}
