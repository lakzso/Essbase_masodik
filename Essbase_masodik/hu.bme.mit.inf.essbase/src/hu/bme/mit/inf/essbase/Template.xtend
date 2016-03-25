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
	  \section{Objektumok költség megszlása}
	  \begin {tikzpicture}
	  \pie {«ktgh»/ Költséghelyek , «szolg»/ Szolgáltatások , «gepj»/ Autók , «ugyf»/ Ügyfelek }
	  \end {tikzpicture}
	  
	  \begin{tikzpicture}
	  \begin{axis}[
	  view={120}{40},
	  width=220pt,
	  height=220pt,
	  grid=major,
	  z buffer=sort,
	  xmin=-1,xmax=9,
	  ymin=-1,ymax=9,
	  zmin=-1,zmax=9,
	  enlargelimits=upper,
	  xtick={-1,1,...,19},
	  ytick={-1,1,...,19},
	  ztick={-1,1,...,19},
	  xlabel={$Ugyfel$},
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