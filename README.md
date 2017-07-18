# jqa-nmap-plugin
NMap Plugin of jQAssistant. It enables jQAssistant to scan and to analyze nmap xml output. https://www.jqassistant.org

This plugin is built on 1.1.3 JQassistant release and [NMap](https://nmap.org/) 7.50

# Graph
The scan operation creates the nodes with labels: 
- Network
- Host
- NetworkPort
- NetworkServiceInstance

# Build & Install
*JQA_HOME* is the directory where your JQAssistance is installed.
```
mvn clean package
cp target/jqa-nmap-plugin-* $JQA_HOME/plugins/
```
Please, make sure the *com.buschmais.jqassistant.plugin-common-1.3.jar* is present in the *plugins* directory.

# Example
Scan a local network and create the *network.xml* file
```
nmap -oX network.xml -p 0-10000 -sV 192.168.178.1-254
./bin/jqassistant.sh scan -reset -f network.xml
./bin/jqassistant.sh server
```
