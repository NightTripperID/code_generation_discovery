package compiler;

import javax.tools.SimpleJavaFileObject;
import java.net.URI;

public class StringBuilderJavaSource extends SimpleJavaFileObject {

    private StringBuilder code;
    /**
     * Constructs a new compiler.StringBuilderJavaSource
     */
    protected StringBuilderJavaSource(String name) {
        super(URI.create("string:///" + name.replace('.', '/') + Kind.SOURCE.extension), Kind.SOURCE);
        code = new StringBuilder();
    }

    public CharSequence getCharContent(boolean ignoreCodingErrors) {
        return code;
    }

    public void append(String str) {
        code.append(str);
        code.append('\n');
    }
}
