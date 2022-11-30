@license{
  Copyright (c) 2022 CWI
  All rights reserved. This program and the accompanying materials
  are made available under the terms of the Eclipse Public License v1.0
  which accompanies this distribution, and is available at
  http://www.eclipse.org/legal/epl-v10.html
}
@contributor{Jurgen J. Vinju - Jurgen.Vinju@cwi.nl - CWI}
@contributor{Tijs van der Storm - storm@cwi.nl - CWI}
@synopsis{Simple data visualization using graphs}
@description{
This modules provides a simple API to create graph visuals for Rascal
(relational) data, based on [Cytoscape.js](https://js.cytoscape.org/). 

This module is quite new and may undergo some tweaks in the coming time.
}
@examples{
```rascal-shell
import vis::Graphs;
graph([<x,x+1> | x <- [1..100]] + [<100,1>])
```
}
@benefits{
* Easy to use for basic graph layouts.
}
module vis::Graphs

import lang::html::IO;
import Content;

@synopsis{A graph plot from a binary relation.}
Content graph(lrel[&T x, &T y] v, str title="Graph", CytoLayoutName \layout=cose(), CytoStyle nodeStyle=defaultNodeStyle(), CytoStyle edgeStyle=defaultEdgeStyle()) 
    = content(title, graphServer(cytoscape(
        elements=graphData(v),        
        style=[
            cytoNodeStyleOf(nodeStyle),
            cytoEdgeStyleOf(edgeStyle)
        ],
        \layout=cytolayout(
            name=\layout
        )
    )));

default list[CytoData] graphData(lrel[&T x, &T y] v)
    = [cytodata(\node("<e>", label="<e>")) | e <- {*v<x>, *v<y>}] +
      [cytodata(\edge(from, to)) | <from, to> <- v]
      ;

data CytoNodeShape
    = \ellipse()
    | \triangle()
    | \round-triangle()
    | \rectangle()
    | \round-rectangle()
    | \bottom-round-rectangle()
    | \cut-rectangle()
    | \barrel()
    | \rhomboid()
    | \diamond()
    | \round-diamond()
    | \pentagon()
    | \round-pentagon()
    | \hexagon()
    | \round-hexagon()
    | \concave-hexagon()
    | \heptagon()
    | \round-heptagon()
    | \octagon()
    | \round-octagon()
    | \star()
    | \tag()
    | \round-tag()
    | \vee()
    | \polygon()
    ;

data Cytoscape 
    = cytoscape(
        list[CytoData] elements = [],
        list[CytoStyleOf] style=[],
        CytoLayout \layout = cytolayout()
    );

data CytoData
  = cytodata(CytoElement \data);

data CytoElement
  = \node(str id, str label=id)
  | \edge(str source, str target, str id="<source>-<target>", str label="")
  ;

data CytoStyleOf
    = cytoNodeStyleOf(
        CytoSelector selector = \node(),
        CytoStyle style = cytoNodeStyle()
    )
    | cytoEdgeStyleOf(
        CytoSelector selector = \edge(),
        CytoStyle style = cytoEdgeStyle()
    );

CytoStyleOf cytoNodeStyleOf(CytoStyle style) = cytoNodeStyleOf(selector=\node(), style=style);
CytoStyleOf cytoEdgeStyleOf(CytoStyle style) = cytoEdgeStyleOf(selector=\edge(), style=style);

CytoStyle defaultNodeStyle()
    = cytoNodeStyle(
        \background-color = "blue",
        color             = "white",
        \font-size        = "20pt",
        \font-weight      = bold(),
        label             = "data(label)",
        shape             =  \round-rectangle(),
        \text-halign      = CytoHorizontalAlign::\center(),
        \text-valign      = CytoVerticalAlign::\center()
    );

CytoStyle defaultEdgeStyle()
    = cytoEdgeStyle(
        width               = 3,
        \line-color         = "black",
        \target-arrow-color = "black",
        \source-arrow-color = "black",
        \target-arrow-shape = triangle(),
        \source-arrow-shape = CytoArrowHeadStyle::none(),
        \curve-style        = bezier(),
        \label              = "data(label)"
    );

data CytoFontWeight
    = normal()
    | lighter()
    | bold()
    | bolder()
    ;

data CytoHorizontalAlign
    = left()
    | center()
    | right()
    | auto()
    ;

data CytoVerticalAlign
    = top()
    | center()
    | bottom()
    | auto()
    ;


data CytoStyle
    = cytoNodeStyle(
        str color               = "white",
        str \text-opacity       = "100%",
        str \font-family        = "",
        str \font-size          = "12pt",
        str \font-style         = "",
        CytoFontWeight \font-weight = normal(),
        str \background-color   = "blue",
        str label               = "data(label)",
        CytoNodeShape shape     = circle(),
        CytoHorizontalAlign \text-halign = center(),
        CytoVerticalAlign \text-valign = \top(),
        CytoTextWrap \text-wrap = CytoTextWrap::none(),
        str \text-max-width     = "100px",
        CytoHorizontalAlign \text-justification = CytoHorizontalAlign::center(),
        int \line-height        = 1
    )
    | cytoEdgeStyle(
        int width               = 3,
        str \line-color         = "black",
        str \target-arrow-color = "black",
        str \source-arrow-color = "black",
        CytoArrowHeadStyle \target-arrow-shape = triangle(),
        CytoArrowHeadStyle \source-arrow-shape = none(),
        CytoCurveStyle \curve-style = bezier(),
        int \source-text-offset = 1,
        int \target-text-offset = 1,
        str label               = "data(label)"
    )
    ;

data CytoTextWrap
    = none()
    | wrap()
    | ellipses()
    ;



data CytoCurveStyle
    = bezier()
    | \unbundled-bezier()
    | straight()
    | segments()
    | \straight-triangle()
    | taxi()
    | haystack()
    ;
    
data CytoArrowHeadStyle
    = triangle()
    | \triangle-tee()
    | \circle-triangle()
    | \triangle-cross()
    | \triangle-backcurve()
    | vee()
    | tee()
    | square()
    | circle()
    | diamond()
    | chevron()
    | none()
    ;
data CytoSelector
    = \node()
    | \edge()
    ; 

data CytoLayout
    = cytolayout(
        CytoLayoutName name = cose()
    );

data CytoLayoutName
    = grid()
    | circle()
    | breadthfirst()
    | cose()
    ;

@synopsis{this is the main server generator for any graph value}
@description{
Given a Graph value this server captures the value and serves it
as a JSON value to the HTML client generated by ((plotHTML)).
}
Response (Request) graphServer(Cytoscape ch) {
    Response reply(get(/^\/cytoscape/)) {
        return response(ch);
    }

    // returns the main page that also contains the callbacks for retrieving data and configuration
    default Response reply(get(_)) {
        return response(writeHTMLString(plotHTML()));
    }

    return reply;
}

@synopsis{default HTML wrapper for a chart}
private HTMLElement plotHTML()
    = html([
        head([ 
            script([], src="https://cdnjs.cloudflare.com/ajax/libs/cytoscape/3.23.0/cytoscape.umd.js"),
            style([\data("#visualization {
                         '  width: 100%;
                         '  height: 100%;
                         '  position: absolute;
                         '  top: 0px;
                         'left: 0px;
                         '}")])
        ]),
        body([
            div([], id="visualization"),
            script([
                \data(
                    "fetch(\'/cytoscape\').then(resp =\> resp.json()).then(cs =\> {
                    '   cs.container = document.getElementById(\'visualization\');
                    '   cytoscape(cs);
                    '});
                    '")
            ], \type="text/javascript")
        ])
    ]);