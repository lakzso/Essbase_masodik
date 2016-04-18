package hu.bme.mit.inf.essbase;

import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class Template {
  public CharSequence getLatexContent(final long ktgh, final long szolg, final long gepj, final long ugyf) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.newLine();
    _builder.append("%----------------------------------------------------------------------------------------");
    _builder.newLine();
    _builder.append("%\tPACKAGES AND OTHER DOCUMENT CONFIGURATIONS");
    _builder.newLine();
    _builder.append("%----------------------------------------------------------------------------------------");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\\documentclass{article}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\\usepackage{fancyhdr} % Required for custom headers");
    _builder.newLine();
    _builder.append("\\usepackage{lastpage} % Required to determine the last page for the footer");
    _builder.newLine();
    _builder.append("\\usepackage{extramarks} % Required for headers and footers");
    _builder.newLine();
    _builder.append("\\usepackage[usenames,dvipsnames]{color} % Required for custom colors");
    _builder.newLine();
    _builder.append("\\usepackage{graphicx} % Required to insert images");
    _builder.newLine();
    _builder.append("\\usepackage{listings} % Required for insertion of code");
    _builder.newLine();
    _builder.append("\\usepackage{courier} % Required for the courier font");
    _builder.newLine();
    _builder.append("\\usepackage{lipsum} % Used for inserting dummy \'Lorem ipsum\' text into the template");
    _builder.newLine();
    _builder.newLine();
    _builder.append("%sajat moty�:");
    _builder.newLine();
    _builder.append("\\usepackage[magyar]{babel}");
    _builder.newLine();
    _builder.append("\\usepackage{pgfplots}");
    _builder.newLine();
    _builder.append("\\usepackage{pgf-pie}");
    _builder.newLine();
    _builder.append("\\pgfplotsset{compat=1.5}");
    _builder.newLine();
    _builder.append("\\usepackage[latin2]{inputenc}");
    _builder.newLine();
    _builder.newLine();
    _builder.newLine();
    _builder.append("% Margins");
    _builder.newLine();
    _builder.append("\\topmargin=-0.45in");
    _builder.newLine();
    _builder.append("\\evensidemargin=0in");
    _builder.newLine();
    _builder.append("\\oddsidemargin=0in");
    _builder.newLine();
    _builder.append("\\textwidth=6.5in");
    _builder.newLine();
    _builder.append("\\textheight=9.0in");
    _builder.newLine();
    _builder.append("\\headsep=0.25in");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\\linespread{1.1} % Line spacing");
    _builder.newLine();
    _builder.newLine();
    _builder.append("% Set up the header and footer");
    _builder.newLine();
    _builder.append("\\pagestyle{fancy}");
    _builder.newLine();
    _builder.append("\\lhead{\\hmwkAuthorName} % Top left header");
    _builder.newLine();
    _builder.append("\\chead{\\hmwkClass\\ (\\hmwkClassInstructor \\hmwkClassTime ): \\hmwkTitle} % Top");
    _builder.newLine();
    _builder.append("% center head");
    _builder.newLine();
    _builder.append("\\rhead{\\firstxmark} % Top right header");
    _builder.newLine();
    _builder.append("\\lfoot{\\lastxmark} % Bottom left footer");
    _builder.newLine();
    _builder.append("\\cfoot{} % Bottom center footer");
    _builder.newLine();
    _builder.append("\\rfoot{Page\\ \\thepage\\ of\\ \\protect\\pageref{LastPage}} % Bottom right footer");
    _builder.newLine();
    _builder.append("\\renewcommand\\headrulewidth{0.4pt} % Size of the header rule");
    _builder.newLine();
    _builder.append("\\renewcommand\\footrulewidth{0.4pt} % Size of the footer rule");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\\setlength\\parindent{0pt} % Removes all indentation from paragraphs");
    _builder.newLine();
    _builder.newLine();
    _builder.append("%----------------------------------------------------------------------------------------");
    _builder.newLine();
    _builder.append("%\tCODE INCLUSION CONFIGURATION");
    _builder.newLine();
    _builder.append("%----------------------------------------------------------------------------------------");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\\definecolor{MyDarkGreen}{rgb}{0.0,0.4,0.0} % This is the color used for comments");
    _builder.newLine();
    _builder.append("\\lstloadlanguages{Perl} % Load Perl syntax for listings, for a list of other languages supported see: ftp://ftp.tex.ac.uk/tex-archive/macros/latex/contrib/listings/listings.pdf");
    _builder.newLine();
    _builder.append("\\lstset{language=Perl, % Use Perl in this example");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("frame=single, % Single frame around code");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("basicstyle=\\small\\ttfamily, % Use small true type font");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("keywordstyle=[1]\\color{Blue}\\bf, % Perl functions bold and blue");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("keywordstyle=[2]\\color{Purple}, % Perl function arguments purple");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("keywordstyle=[3]\\color{Blue}\\underbar, % Custom functions underlined and blue");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("identifierstyle=, % Nothing special about identifiers                                         ");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("commentstyle=\\usefont{T1}{pcr}{m}{sl}\\color{MyDarkGreen}\\small, % Comments small dark green courier font");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("stringstyle=\\color{Purple}, % Strings are purple");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("showstringspaces=false, % Don\'t put marks in string spaces");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("tabsize=5, % 5 spaces per tab");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("%");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("% Put standard Perl functions not included in the default language here");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("morekeywords={rand},");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("%");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("% Put Perl function parameters here");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("morekeywords=[2]{on, off, interp},");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("%");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("% Put user defined functions here");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("morekeywords=[3]{test},");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("morekeywords=[4]{row},");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("morekeywords=[5]{dim},");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("morekeywords=[6]{group},");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("morekeywords=[7]{query},");
    _builder.newLine();
    _builder.append("       \t");
    _builder.append("%");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("morecomment=[l][\\color{Blue}]{...}, % Line continuation (...) like blue comment");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("numbers=left, % Line numbers on left");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("firstnumber=1, % Line numbers start with line 1");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("numberstyle=\\tiny\\color{Blue}, % Line numbers are blue and small");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("stepnumber=5 % Line numbers go in steps of 5");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("% Creates a new command to include a perl script, the first parameter is the filename of the script (without .pl), the second parameter is the caption");
    _builder.newLine();
    _builder.append("\\newcommand{\\perlscript}[2]{");
    _builder.newLine();
    _builder.append("\\begin{itemize}");
    _builder.newLine();
    _builder.append("\\item[]\\lstinputlisting[caption=#2,label=#1]{#1.pl}");
    _builder.newLine();
    _builder.append("\\end{itemize}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("%----------------------------------------------------------------------------------------");
    _builder.newLine();
    _builder.append("%\tDOCUMENT STRUCTURE COMMANDS");
    _builder.newLine();
    _builder.append("%\tSkip this unless you know what you\'re doing");
    _builder.newLine();
    _builder.append("%----------------------------------------------------------------------------------------");
    _builder.newLine();
    _builder.newLine();
    _builder.append("% Header and footer for when a page split occurs within a problem environment");
    _builder.newLine();
    _builder.append("\\newcommand{\\enterProblemHeader}[1]{");
    _builder.newLine();
    _builder.append("\\nobreak\\extramarks{#1}{#1 continued on next page\\ldots}\\nobreak");
    _builder.newLine();
    _builder.append("\\nobreak\\extramarks{#1 (continued)}{#1 continued on next page\\ldots}\\nobreak");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("% Header and footer for when a page split occurs between problem environments");
    _builder.newLine();
    _builder.append("\\newcommand{\\exitProblemHeader}[1]{");
    _builder.newLine();
    _builder.append("\\nobreak\\extramarks{#1 (continued)}{#1 continued on next page\\ldots}\\nobreak");
    _builder.newLine();
    _builder.append("\\nobreak\\extramarks{#1}{}\\nobreak");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\\setcounter{secnumdepth}{0} % Removes default section numbers");
    _builder.newLine();
    _builder.append("\\newcounter{homeworkProblemCounter} % Creates a counter to keep track of the number of problems");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\\newcommand{\\homeworkProblemName}{}");
    _builder.newLine();
    _builder.append("\\newenvironment{homeworkProblem}[1][Riport Szerkezete]{ %");
    _builder.newLine();
    _builder.append("% Makes a new environment called homeworkProblem which takes 1 argument (custom name) but the default is \"Problem #\"");
    _builder.newLine();
    _builder.append("\\stepcounter{homeworkProblemCounter} % Increase counter for number of problems");
    _builder.newLine();
    _builder.append("\\renewcommand{\\homeworkProblemName}{#1} % Assign \\homeworkProblemName the name of the problem");
    _builder.newLine();
    _builder.append("\\section{\\homeworkProblemName} % Make a section in the document with the custom problem count");
    _builder.newLine();
    _builder.append("\\enterProblemHeader{\\homeworkProblemName} % Header and footer within the environment");
    _builder.newLine();
    _builder.append("}{");
    _builder.newLine();
    _builder.append("\\exitProblemHeader{\\homeworkProblemName} % Header and footer after the environment");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\\newcommand{\\problemAnswer}[1]{ % Defines the problem answer command with the content as the only argument");
    _builder.newLine();
    _builder.append("\\noindent\\framebox[\\columnwidth][c]{\\begin{minipage}{0.98\\columnwidth}#1\\end{minipage}} % Makes the box around the problem answer and puts the content inside");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\\newcommand{\\homeworkSectionName}{}");
    _builder.newLine();
    _builder.append("\\newenvironment{homeworkSection}[1]{ % New environment for sections within homework problems, takes 1 argument - the name of the section");
    _builder.newLine();
    _builder.append("\\renewcommand{\\homeworkSectionName}{#1} % Assign \\homeworkSectionName to the name of the section from the environment argument");
    _builder.newLine();
    _builder.append("\\subsection{\\homeworkSectionName} % Make a subsection with the custom name of the subsection");
    _builder.newLine();
    _builder.append("\\enterProblemHeader{\\homeworkProblemName\\ [\\homeworkSectionName]} % Header and footer within the environment");
    _builder.newLine();
    _builder.append("}{");
    _builder.newLine();
    _builder.append("\\enterProblemHeader{\\homeworkProblemName} % Header and footer after the environment");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("%----------------------------------------------------------------------------------------");
    _builder.newLine();
    _builder.append("%\tNAME AND CLASS SECTION");
    _builder.newLine();
    _builder.append("%----------------------------------------------------------------------------------------");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\\newcommand{\\hmwkTitle}{Teszt1\\ } % Assignment title");
    _builder.newLine();
    _builder.append("\\newcommand{\\hmwkDueDate}{2016\\ �prilis\\ 18} % Due date");
    _builder.newLine();
    _builder.append("\\newcommand{\\hmwkClass}{Riport Kimenet\\ } % Course/class");
    _builder.newLine();
    _builder.append("\\newcommand{\\hmwkClassTime}{16:34} % Class/lecture time");
    _builder.newLine();
    _builder.append("\\newcommand{\\hmwkClassInstructor}{} % Teacher/lecturer");
    _builder.newLine();
    _builder.append("\\newcommand{\\hmwkAuthorName}{Lakatos Zsolt} % Your name");
    _builder.newLine();
    _builder.newLine();
    _builder.append("%----------------------------------------------------------------------------------------");
    _builder.newLine();
    _builder.append("%\tTITLE PAGE");
    _builder.newLine();
    _builder.append("%----------------------------------------------------------------------------------------");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\\title{");
    _builder.newLine();
    _builder.append("\\vspace{2in}");
    _builder.newLine();
    _builder.append("\\textmd{\\textbf{\\hmwkClass:\\ \\hmwkTitle}}\\\\");
    _builder.newLine();
    _builder.append("\\normalsize\\vspace{0.1in}\\small{Due\\ on\\ \\hmwkDueDate}\\\\");
    _builder.newLine();
    _builder.append("\\vspace{0.1in}\\large{\\textit{\\hmwkClassInstructor\\ \\hmwkClassTime}}");
    _builder.newLine();
    _builder.append("\\vspace{3in}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\\author{\\textbf{\\hmwkAuthorName}}");
    _builder.newLine();
    _builder.append("\\date{} % Insert date here if you want it to appear below your name");
    _builder.newLine();
    _builder.newLine();
    _builder.append("%----------------------------------------------------------------------------------------");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\\begin{document}");
    _builder.newLine();
    _builder.append("\\maketitle");
    _builder.newLine();
    _builder.newLine();
    _builder.append("%----------------------------------------------------------------------------------------");
    _builder.newLine();
    _builder.append("%\tTABLE OF CONTENTS");
    _builder.newLine();
    _builder.append("%----------------------------------------------------------------------------------------");
    _builder.newLine();
    _builder.newLine();
    _builder.append("%\\setcounter{tocdepth}{1} % Uncomment this line if you don\'t want subsections listed in the ToC");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\\newpage");
    _builder.newLine();
    _builder.append("\\tableofcontents");
    _builder.newLine();
    _builder.append("\\newpage");
    _builder.newLine();
    _builder.newLine();
    _builder.newLine();
    _builder.append("%----------------------------------------------------------------------------------------");
    _builder.newLine();
    _builder.append("%\tPROBLEM 1");
    _builder.newLine();
    _builder.append("%----------------------------------------------------------------------------------------");
    _builder.newLine();
    _builder.newLine();
    _builder.append("% To have just one problem per page, simply put a \\clearpage after each problem");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\\begin{homeworkProblem}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\\perlscript{raw/raw_rep}{Riport forr�sk�dja}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\\end{homeworkProblem}");
    _builder.newLine();
    _builder.append("\\newpage");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\\section{Objektumok k�lts�g megoszl�sa}");
    _builder.newLine();
    _builder.append("\\begin {tikzpicture}");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("\\pie {");
    _builder.append(ktgh, " ");
    _builder.append("/ K�lts�ghelyek , ");
    _builder.append(szolg, " ");
    _builder.append("/ Szolg�ltat�sok , ");
    _builder.append(gepj, " ");
    _builder.append("/ Aut�k , ");
    _builder.append(ugyf, " ");
    _builder.append("/ �gyfelek }");
    _builder.newLineIfNotEmpty();
    _builder.append("\\end {tikzpicture}");
    _builder.newLine();
    _builder.newLine();
    _builder.newLine();
    _builder.append("\\section{Adott objektum k�lts�g megoszl�sa}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\\begin{tikzpicture}");
    _builder.newLine();
    _builder.append("\\begin{axis}[");
    _builder.newLine();
    _builder.append("view={120}{40},");
    _builder.newLine();
    _builder.append("width=350pt,");
    _builder.newLine();
    _builder.append("height=350pt,");
    _builder.newLine();
    _builder.append("grid=major,");
    _builder.newLine();
    _builder.append("z buffer=sort,");
    _builder.newLine();
    _builder.append("xmin=-1,xmax=30,");
    _builder.newLine();
    _builder.append("ymin=-1,ymax=30,");
    _builder.newLine();
    _builder.append("zmin=-1,zmax=30,");
    _builder.newLine();
    _builder.append("enlargelimits=upper,");
    _builder.newLine();
    _builder.append("xtick={-1,1,...,30},");
    _builder.newLine();
    _builder.append("ytick={-1,1,...,30},");
    _builder.newLine();
    _builder.append("ztick={-1,1,...,30},");
    _builder.newLine();
    _builder.append("xlabel={$Objektum$},");
    _builder.newLine();
    _builder.append("ylabel={$Koltsegnem$},");
    _builder.newLine();
    _builder.append("zlabel={$Ertek$},");
    _builder.newLine();
    _builder.append("point meta={x+y+z+3},");
    _builder.newLine();
    _builder.append("colormap={summap}{");
    _builder.newLine();
    _builder.append("color=(black); color=(blue);");
    _builder.newLine();
    _builder.append("color=(black); color=(white)");
    _builder.newLine();
    _builder.append("color=(orange) color=(violet)");
    _builder.newLine();
    _builder.append("color=(red)");
    _builder.newLine();
    _builder.append("},");
    _builder.newLine();
    _builder.append("scatter/use mapped color={");
    _builder.newLine();
    _builder.append("draw=mapped color,fill=mapped color!70},");
    _builder.newLine();
    _builder.append("]");
    _builder.newLine();
    _builder.append("\\addplot3[only marks,scatter,mark=cube*,mark size=7]");
    _builder.newLine();
    _builder.append("table {plotdata/data.dat};");
    _builder.newLine();
    _builder.append("\\end{axis}");
    _builder.newLine();
    _builder.append("\\end{tikzpicture}");
    _builder.newLine();
    _builder.newLine();
    _builder.newLine();
    _builder.newLine();
    _builder.newLine();
    _builder.newLine();
    _builder.newLine();
    _builder.append("% %----------------------------------------------------------------------------------------");
    _builder.newLine();
    _builder.append("% %\tPROBLEM 2");
    _builder.newLine();
    _builder.append("% %----------------------------------------------------------------------------------------");
    _builder.newLine();
    _builder.append("% ");
    _builder.newLine();
    _builder.append("% \\begin{homeworkProblem}");
    _builder.newLine();
    _builder.append("% \\lipsum[2]");
    _builder.newLine();
    _builder.append("% ");
    _builder.newLine();
    _builder.append("% \\problemAnswer{");
    _builder.newLine();
    _builder.append("% \\begin{center}");
    _builder.newLine();
    _builder.append("% \\includegraphics[width=0.75\\columnwidth]{example_figure} % Example image");
    _builder.newLine();
    _builder.append("% \\end{center}");
    _builder.newLine();
    _builder.append("% ");
    _builder.newLine();
    _builder.append("% \\lipsum[3-5]");
    _builder.newLine();
    _builder.append("% }");
    _builder.newLine();
    _builder.append("% \\end{homeworkProblem}");
    _builder.newLine();
    _builder.append("% ");
    _builder.newLine();
    _builder.append("% %----------------------------------------------------------------------------------------");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\\end{document}");
    _builder.newLine();
    return _builder;
  }
}
