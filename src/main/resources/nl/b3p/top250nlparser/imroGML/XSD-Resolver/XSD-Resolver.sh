#!/bin/bash
rm generated/*.xml
rm finalized/*.xsd
rm consolidated/*.xsd
java -Xmx1024m -jar saxon/saxon9he.jar -o:generated/temp.xml -s:input/configuration.xml -xsl:xslt/resolveXSDs.xslt versie=