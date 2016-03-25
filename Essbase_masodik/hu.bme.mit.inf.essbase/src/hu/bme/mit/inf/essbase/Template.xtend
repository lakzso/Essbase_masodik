package hu.bme.mit.inf.essbase

import java.util.ArrayList

class Template {
	def getLatexContent(long ktgh,long szolg,long gepj,long ugyf) '''
	  \documentclass{article}
	  \usepackage{t1enc}
	  \usepackage[latin2]{inputenc}
	  \def\magyarOptions{hyphenation=huhyphn}
	  \usepackage[magyar]{babel}
	  \usepackage{pgfplots}
	  \usepackage{pgf-pie}
	  \begin{document}
	  \section{Objektumok k�lts�g megszl�sa}
	  \begin {tikzpicture}
	  \pie {�ktgh�/ K�lts�ghelyek , �szolg�/ Szolg�ltat�sok , �gepj�/ Aut�k , �ugyf�/ �gyfelek }
	  \end {tikzpicture}
	  
	  
	  \end{document}
	'''
	
}