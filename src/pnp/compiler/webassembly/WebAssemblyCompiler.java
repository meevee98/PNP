package pnp.compiler.webassembly;

import pnp.compiler.exception.CompilationException;
import pnp.compiler.semantic.Analyser;

public class WebAssemblyCompiler {

    WebAssemblyCompiler() {
        analyser = new Analyser();
    }
    Analyser analyser;


    void analisar(String fonte) throws CompilationException {
        analyser.analyse(fonte);
    }

    public static void main(String[] args) {
        WebAssemblyCompiler m = new WebAssemblyCompiler();
//        String projectPath = System.getProperty("user.dir");
        String fonte = "C:\\Users\\mirel\\Documents\\test.pnp";
//        String fonte = "C:\\Users\\Dell\\Documents\\test.pnp";
//        String fonte = args[0];
        if (args.length > 0) {
            fonte = args[0];
        }
        try {
            m.analisar(fonte);

            WebAssemblyGenerator gerador = new WebAssemblyGenerator();
            String codigo = gerador.convert(m.analyser.getMainSymbolTable());
            System.out.println(codigo);
        }
        catch (CompilationException ex) {
            if (ex.getMessage() != null) {
                System.out.println(ex.getMessage());
            }
        }
    }
}
