# selenium-grid-testng

# How To Run
1. Start Selenium Server Standalone
`java -jar selenium-server-standalone-<version>.jar -role hub`

2. Start Node
`java -jar selenium-server-standalone-<version>.jar -role node  -hub http://localhost:4444/grid/register`

3. Start tests
`mvn clean -P chrome,grid,localhost test`
