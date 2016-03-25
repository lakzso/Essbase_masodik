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
	  \section{Objektumok költség megszlása}
	  \begin {tikzpicture}
	  \pie {«ktgh»/ Költséghelyek , «szolg»/ Szolgáltatások , «gepj»/ Autók , «ugyf»/ Ügyfelek }
	  \end {tikzpicture}
	  
	  
	  \end{document}
	'''
	
}