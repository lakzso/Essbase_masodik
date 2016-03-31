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
	  \pgfplotsset{compat=1.5}
	  \begin{document}
	  \section{Objektumok költség megoszlása}
	  \begin {tikzpicture}
	  \pie {«ktgh»/ Költséghelyek , «szolg»/ Szolgáltatások , «gepj»/ Autók , «ugyf»/ Ügyfelek }
	  \end {tikzpicture}
	  
	  
	  \section{Adott objektum költség megoszlása}
	  
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
	  
	  
	  
	  \end{document}
	'''
	
}