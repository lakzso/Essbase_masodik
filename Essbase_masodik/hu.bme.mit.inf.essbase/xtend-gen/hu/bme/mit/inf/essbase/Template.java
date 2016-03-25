package hu.bme.mit.inf.essbase;

import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class Template {
  public CharSequence getLatexContent(final long ktgh, final long szolg, final long gepj, final long ugyf) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\\documentclass{article}");
    _builder.newLine();
    _builder.append("\\usepackage{t1enc}");
    _builder.newLine();
    _builder.append("\\usepackage[latin2]{inputenc}");
    _builder.newLine();
    _builder.append("\\def\\magyarOptions{hyphenation=huhyphn}");
    _builder.newLine();
    _builder.append("\\usepackage[magyar]{babel}");
    _builder.newLine();
    _builder.append("\\usepackage{pgfplots}");
    _builder.newLine();
    _builder.append("\\usepackage{pgf-pie}");
    _builder.newLine();
    _builder.append("\\begin{document}");
    _builder.newLine();
    _builder.append("\\section{Objektumok költség megszlása}");
    _builder.newLine();
    _builder.append("\\begin {tikzpicture}");
    _builder.newLine();
    _builder.append("\\pie {");
    _builder.append(ktgh, "");
    _builder.append("/ Költséghelyek , ");
    _builder.append(szolg, "");
    _builder.append("/ Szolgáltatások , ");
    _builder.append(gepj, "");
    _builder.append("/ Autók , ");
    _builder.append(ugyf, "");
    _builder.append("/ Ügyfelek }");
    _builder.newLineIfNotEmpty();
    _builder.append("\\end {tikzpicture}");
    _builder.newLine();
    _builder.newLine();
    _builder.newLine();
    _builder.append("\\end{document}");
    _builder.newLine();
    return _builder;
  }
}
