package br.com.pnp.compiler.wat

import br.com.pnp.compiler.AbstractCompiler
import br.com.pnp.exception.CompilationException
import java.io.File
import java.io.PrintWriter

class WatCompiler : AbstractCompiler() {
    override val generator = WatGenerator()

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            try {
                val compiler = WatCompiler()
                val sourcePath = args[0]
                val fromFile = File(sourcePath)

                val generatePath = if (args.size > 1) {
                    val toFile = File(args[1])
                    toFile.absolutePath.replace(toFile.extension, "wat")
                } else {
                    fromFile.absolutePath.replace(fromFile.extension, "wat")
                }

                compiler.analyse(fromFile)
                val generatedCode = compiler.generateCode()
                println(generatedCode)
                PrintWriter(generatePath).write(generatedCode)
            } catch (ex: IndexOutOfBoundsException) {
                println("Invalid argument: Missing source file path")
            } catch (ex: CompilationException) {
                println(ex.message)
            } catch (ex: Exception) {
                println(ex.message)
            }
        }
    }
}
