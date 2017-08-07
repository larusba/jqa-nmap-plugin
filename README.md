# jqa-nmap-plugin
NMap Plugin of jQAssistant. It enables jQAssistant to scan and to analyze nmap xml output. https://www.jqassistant.org

**Current version**: 1.1.3-0.2, compatible with:
- [Nmap](https://nmap.org/) 7.50
- [JQAssistant](https://www.jqassistant.org) 1.3.0
- Java 1.7
- Neo4j 3.2
                  
# Graph
The scan operation creates the nodes with labels: 
- Network
- Host
- NetworkPort
- NetworkServiceInstance
- NetworkScript
- NetworkScriptElem
- NetworkScriptTable

The nodes are always created, not merged.

# Rules
There are 4 concepts shipped with the plugin:
- "nmap-rules:CreateService": Add to graph the "NetworkService" nodes
- "nmap-rules:LinkServiceToInstance": Add to graph the relationship between NetworkService and NetworkServiceInstance nodes.
- "nmap-rules:MySqlDatabases": Add to graph the MySqlSchema nodes.
- "nmap-rules:OracleSid": Add to graph the OracleSid nodes.

# Build & Install
*JQA_HOME* is the directory where your JQAssistance is installed.
```
mvn clean package
cp target/jqa-nmap-plugin-* $JQA_HOME/plugins/
```
Please, make sure the *com.buschmais.jqassistant.plugin-common-1.3.jar* is present in the *plugins* directory.

# Scan Example
Scan a local network and create the *network.xml* file
```
nmap -T4 -A -p 1-1000 -oX network.xml scanme.nmap.org
./bin/jqassistant.sh scan -reset -f network.xml
./bin/jqassistant.sh server
```
# Analize Example
Run the concepts over the graph. First you have to create a rules file
```
touch $JQA_HOME/jqassistant/rules/rules.xml
```
and call the concepts 
```
<jqa:jqassistant-rules xmlns:jqa="http://www.buschmais.com/jqassistant/core/analysis/rules/schema/v1.1">

    <group id="my-rules:MyGroup">
        <includeConcept refId="nmap-rules:LinkServiceToInstance" />
    </group>

</jqa:jqassistant-rules>
```
and then run the analize phase
```
./bin/jqassistant.sh analyze -groups "my-rules:MyGroup"
```
