package hu.bme.mit.inf.essbase


class Template {
	def getLatexContent(long ktgh,long szolg,long gepj,long ugyf,String filename) '''
		
		%----------------------------------------------------------------------------------------
		%	PACKAGES AND OTHER DOCUMENT CONFIGURATIONS
		%----------------------------------------------------------------------------------------
		
		\documentclass{article}
		
		\usepackage{fancyhdr} % Required for custom headers
		\usepackage{lastpage} % Required to determine the last page for the footer
		\usepackage{extramarks} % Required for headers and footers
		\usepackage[usenames,dvipsnames]{color} % Required for custom colors
		\usepackage{graphicx} % Required to insert images
		\usepackage{listings} % Required for insertion of code
		\usepackage{courier} % Required for the courier font
		\usepackage{lipsum} % Used for inserting dummy 'Lorem ipsum' text into the template
		
		%sajat moty�:
		\usepackage[magyar]{babel}
		\usepackage{pgfplots}
		\usepackage{pgf-pie}
		\pgfplotsset{compat=1.5}
		\usepackage[latin2]{inputenc}
		
		
		% Margins
		\topmargin=-0.45in
		\evensidemargin=0in
		\oddsidemargin=0in
		\textwidth=6.5in
		\textheight=9.0in
		\headsep=0.25in
		
		\linespread{1.1} % Line spacing
		
		% Set up the header and footer
		\pagestyle{fancy}
		\lhead{\hmwkAuthorName} % Top left header
		\chead{\hmwkClass\ (\hmwkClassInstructor \hmwkClassTime ): \hmwkTitle} % Top
		% center head
		\rhead{\firstxmark} % Top right header
		\lfoot{\lastxmark} % Bottom left footer
		\cfoot{} % Bottom center footer
		\rfoot{Page\ \thepage\ of\ \protect\pageref{LastPage}} % Bottom right footer
		\renewcommand\headrulewidth{0.4pt} % Size of the header rule
		\renewcommand\footrulewidth{0.4pt} % Size of the footer rule
		
		\setlength\parindent{0pt} % Removes all indentation from paragraphs
		
		%----------------------------------------------------------------------------------------
		%	CODE INCLUSION CONFIGURATION
		%----------------------------------------------------------------------------------------
		
		\definecolor{MyDarkGreen}{rgb}{0.0,0.4,0.0} % This is the color used for comments
		\lstloadlanguages{Perl} % Load Perl syntax for listings, for a list of other languages supported see: ftp://ftp.tex.ac.uk/tex-archive/macros/latex/contrib/listings/listings.pdf
		\lstset{language=Perl, % Use Perl in this example
		        frame=single, % Single frame around code
		        basicstyle=\small\ttfamily, % Use small true type font
		        keywordstyle=[1]\color{Blue}\bf, % Perl functions bold and blue
		        keywordstyle=[2]\color{Purple}, % Perl function arguments purple
		        keywordstyle=[3]\color{Blue}\underbar, % Custom functions underlined and blue
		        identifierstyle=, % Nothing special about identifiers                                         
		        commentstyle=\usefont{T1}{pcr}{m}{sl}\color{MyDarkGreen}\small, % Comments small dark green courier font
		        stringstyle=\color{Purple}, % Strings are purple
		        showstringspaces=false, % Don't put marks in string spaces
		        tabsize=5, % 5 spaces per tab
		        %
		        % Put standard Perl functions not included in the default language here
		        morekeywords={rand},
		        %
		        % Put Perl function parameters here
		        morekeywords=[2]{on, off, interp},
		        %
		        % Put user defined functions here
		        morekeywords=[3]{test},
		        morekeywords=[4]{row},
		        morekeywords=[5]{dim},
		        morekeywords=[6]{group},
		        morekeywords=[7]{query},
		       	%
		        morecomment=[l][\color{Blue}]{...}, % Line continuation (...) like blue comment
		        numbers=left, % Line numbers on left
		        firstnumber=1, % Line numbers start with line 1
		        numberstyle=\tiny\color{Blue}, % Line numbers are blue and small
		        stepnumber=5 % Line numbers go in steps of 5
		}
		
		% Creates a new command to include a perl script, the first parameter is the filename of the script (without .pl), the second parameter is the caption
		\newcommand{\perlscript}[2]{
		\begin{itemize}
		\item[]\lstinputlisting[caption=#2,label=#1]{#1.pl}
		\end{itemize}
		}
		
		%----------------------------------------------------------------------------------------
		%	DOCUMENT STRUCTURE COMMANDS
		%	Skip this unless you know what you're doing
		%----------------------------------------------------------------------------------------
		
		% Header and footer for when a page split occurs within a problem environment
		\newcommand{\enterProblemHeader}[1]{
		\nobreak\extramarks{#1}{#1 continued on next page\ldots}\nobreak
		\nobreak\extramarks{#1 (continued)}{#1 continued on next page\ldots}\nobreak
		}
		
		% Header and footer for when a page split occurs between problem environments
		\newcommand{\exitProblemHeader}[1]{
		\nobreak\extramarks{#1 (continued)}{#1 continued on next page\ldots}\nobreak
		\nobreak\extramarks{#1}{}\nobreak
		}
		
		\setcounter{secnumdepth}{0} % Removes default section numbers
		\newcounter{homeworkProblemCounter} % Creates a counter to keep track of the number of problems
		
		\newcommand{\homeworkProblemName}{}
		\newenvironment{homeworkProblem}[1][Riport Szerkezete]{ %
		% Makes a new environment called homeworkProblem which takes 1 argument (custom name) but the default is "Problem #"
		\stepcounter{homeworkProblemCounter} % Increase counter for number of problems
		\renewcommand{\homeworkProblemName}{#1} % Assign \homeworkProblemName the name of the problem
		\section{\homeworkProblemName} % Make a section in the document with the custom problem count
		\enterProblemHeader{\homeworkProblemName} % Header and footer within the environment
		}{
		\exitProblemHeader{\homeworkProblemName} % Header and footer after the environment
		}
		
		\newcommand{\problemAnswer}[1]{ % Defines the problem answer command with the content as the only argument
		\noindent\framebox[\columnwidth][c]{\begin{minipage}{0.98\columnwidth}#1\end{minipage}} % Makes the box around the problem answer and puts the content inside
		}
		
		\newcommand{\homeworkSectionName}{}
		\newenvironment{homeworkSection}[1]{ % New environment for sections within homework problems, takes 1 argument - the name of the section
		\renewcommand{\homeworkSectionName}{#1} % Assign \homeworkSectionName to the name of the section from the environment argument
		\subsection{\homeworkSectionName} % Make a subsection with the custom name of the subsection
		\enterProblemHeader{\homeworkProblemName\ [\homeworkSectionName]} % Header and footer within the environment
		}{
		\enterProblemHeader{\homeworkProblemName} % Header and footer after the environment
		}
		
		%----------------------------------------------------------------------------------------
		%	NAME AND CLASS SECTION
		%----------------------------------------------------------------------------------------
		
		\newcommand{\hmwkTitle}{�filename�\ } % Assignment title
		\newcommand{\hmwkDueDate}{2016\ �prilis\ 18} % Due date
		\newcommand{\hmwkClass}{Riport Kimenet\ } % Course/class
		\newcommand{\hmwkClassTime}{16:34} % Class/lecture time
		\newcommand{\hmwkClassInstructor}{} % Teacher/lecturer
		\newcommand{\hmwkAuthorName}{Lakatos Zsolt} % Your name
		
		%----------------------------------------------------------------------------------------
		%	TITLE PAGE
		%----------------------------------------------------------------------------------------
		
		\title{
		\vspace{2in}
		\textmd{\textbf{\hmwkClass:\ \hmwkTitle}}\\
		\normalsize\vspace{0.1in}\small{Due\ on\ \hmwkDueDate}\\
		\vspace{0.1in}\large{\textit{\hmwkClassInstructor\ \hmwkClassTime}}
		\vspace{3in}
		}
		
		\author{\textbf{\hmwkAuthorName}}
		\date{} % Insert date here if you want it to appear below your name
		
		%----------------------------------------------------------------------------------------
		
		\begin{document}
		\maketitle
		
		%----------------------------------------------------------------------------------------
		%	TABLE OF CONTENTS
		%----------------------------------------------------------------------------------------
		
		%\setcounter{tocdepth}{1} % Uncomment this line if you don't want subsections listed in the ToC
		
		\newpage
		\tableofcontents
		\newpage
		
		
		%----------------------------------------------------------------------------------------
		%	PROBLEM 1
		%----------------------------------------------------------------------------------------
		
		% To have just one problem per page, simply put a \clearpage after each problem
		
		\begin{homeworkProblem}
		
		\perlscript{raw/raw_rep}{Riport forr�sk�dja}
		
		\end{homeworkProblem}
		\newpage
		
		\section{Objektumok k�lts�g megoszl�sa}
		\begin {tikzpicture}
		 \pie {�ktgh�/ K�lts�ghelyek , �szolg�/ Szolg�ltat�sok , �gepj�/ Aut�k , �ugyf�/ �gyfelek }
		\end {tikzpicture}
		
		
		\section{Adott objektum k�lts�g megoszl�sa}
		
		\begin{tikzpicture}
		\begin{axis}[
		view={120}{40},
		width=350pt,
		height=350pt,
		grid=major,
		z buffer=sort,
		xmin=-1,xmax=30,
		ymin=-1,ymax=30,
		zmin=-1,zmax=30,
		enlargelimits=upper,
		xtick={-1,1,...,30},
		ytick={-1,1,...,30},
		ztick={-1,1,...,30},
		xlabel={$Objektum$},
		ylabel={$Koltsegnem$},
		zlabel={$Ertek$},
		point meta={x+y+z+3},
		colormap={summap}{
		color=(black); color=(blue);
		color=(black); color=(white)
		color=(orange) color=(violet)
		color=(red)
		},
		scatter/use mapped color={
		draw=mapped color,fill=mapped color!70},
		]
		\addplot3[only marks,scatter,mark=cube*,mark size=7]
		table {plotdata/data.dat};
		\end{axis}
		\end{tikzpicture}
		
		
		
		
		
		
		% %----------------------------------------------------------------------------------------
		% %	PROBLEM 2
		% %----------------------------------------------------------------------------------------
		% 
		% \begin{homeworkProblem}
		% \lipsum[2]
		% 
		% \problemAnswer{
		% \begin{center}
		% \includegraphics[width=0.75\columnwidth]{example_figure} % Example image
		% \end{center}
		% 
		% \lipsum[3-5]
		% }
		% \end{homeworkProblem}
		% 
		% %----------------------------------------------------------------------------------------
		
		\end{document}
	'''
	
}