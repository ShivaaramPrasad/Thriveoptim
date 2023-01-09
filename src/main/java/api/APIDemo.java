package api;

public class APIDemo {
	/*
	 * 
 What is api 
- Acronym for "Application programming interface"

- APIs are the little pieces of code that make it possible for digital devices,
software applications, and data servers to talk with each other

API is an intermediary via which the software application accesses the server
/ resources

How Dos APi work?

APIs acts as middleman between the systems
APIs communicate through set of definitions and protocols that allow software
components to talk to each other

Why APIs??
APIs are technology agnostic
APIs provide the abstraction of the functionality between the two systems
APIs can add an additional layer of security
APIs can be reused

Web evolvement
Web 1.0 - static access for resources, read-only
Web 2.0 - Data gathering from users, Advertisements, no data privacy
Web 3.0 - owning the resources, more privacy e.g: crypto, NFTs

Who & where APIs are used?
-APIs are very versatile and can be used on web-based systems, operating
systems, database systems and computer hardware.

-All social media APPs - Twitter, instagram, facebook
-All content streaming platforms - Netflix, Amazon, Hotstar
-All cloud platforms - AWS, Azure, PCF
-Selenium uses API to process the selenese commands
-JIRA/ Service now

Types of APIs
Request driven / sync APIs
Event driven / Async APIs

Sync / request driven APIs
An API that makes an explicit call to another service and awaits on response
then process
Eg:- A payment gateway application calls the check balance API on the bank side


OSI— open system interconnection
physical layer. data layer, transport layer. network session, presentation, application
FTP/ sftp - 21/22
SMB -445
LDAP— 369 (Authentications/ 1M)
kerberos —88 (authorization)
SMTP — 25 ( local email the email)
HTTP - 80 (w/o secure)
HTTPS - 443
POP3 — (post offices protocol— 3)— 110 ( retrieve the email)
TELNET

DBMS
TCP/IP — transmission control protocol — connection oriented
UDP - user datagram protocol — connection tess
had shake:

TCP/IP — transmission control protocol— connection oriented
UDP - user datagram protocol- connection less - every call is anonymous
handshake: process of evaluating the client / defining the relationship- SSL/TLS

relationship- SSL/ TLS
client—> server
client—> request
server—> response
Client--> acknowledges

3— way handshake

Async / Event driven APIs

These works based on events, these systems subscribes to a messaging
channel and keep on receiving the data that the publisher publishes
These systems never explicitly call a service for data
Eg: While booking a OLA cab, all the drivers within the radius are listening to the
topic and get notified on a ride
All the followers on social media get notified upon their follower tweet / post

/tweet
— info gets stored in DB
— on DB CDC (Change data capture)— when ever there is an update to the table trigger pipieline
— it produces an event into the queue (topic)
— my X number of followers listens to the topic (lost connects)
— it reflects in thier feed
Topic: —
— Schema (Json/ Avro/ XML)
— retention period — 10 mins
— partitions
- 6/ 12
when a message would get removed:-
— when ever a consumer succesfully reads and sends an acknowlgement
— whenever the retention peroid is met
RabbitMQ
pubsub—> publusher, subscribe
kafka —
epoxian
Kinesis—> AWE/

Application—> produces events on to a topic (Throtteling)— limit the access
— consider only 1 ping in any given minute
— consider the event when there is a state change (offline/ online)
kafka
event
/ (BEB= business event bus)
to produced to the kafka topics—
— consumer


SOAP - simple object access protocol

A messaging protocol which exchanges structured info in the implementation
of web services
It only supports XML for data exchange
It supports only one HTTP verb, POST
It works purely based on WSDL (web service descriptive language)
It carries heavier payload
It can't be cached as its stateful


REST-Representational state transfer
- is an architectural style to create webservices, built over HTTP protocol
It supports JSON, XML, HTML, Multipart
It supports many HTTP methods - POST, PUT, PATCH, GET, DELETE
It is stateless and can be cached
Carries lesser payload

REST limitations
N+l service calls
Data fetching


GraphQL
-It's a query language for API, implemented by Facebook
-It accesses multiple resources in single request
-It's very faster and gets the predictable results
- It uses types and fields
- It uses only one endpoint to fetch all the information
- It uses the types and fields for data fetch

GraphQL limitations
- The client defined schema might take the server down if its incorrect
- The caching can't be done efficiently since it doesn't follow global HTTP standards
- It needs tool to prepare request

	GRPC- google remote procedure call
	gRPC is a technology for implementing RPC APIs that uses HTTP 2.0 as its
	underlying transport protocol
	It works based on protocol buffers, a google's serialized technique to
	exchange the data
	Protocol buffer is language and platform agnostic
	Unlike REST, gRPCS addresses the procedures and hides the data

Types of Async APIs
Kafka
Pubsub
Webhooks
Web socket


Monolith— (reasonable sized)
- deployment is easier (not much headache in dependency analysis)
— All knowledge at single source (easy to gain the domain and system)
— faster development
downsides-
- Single point of failure
— selective scaling is impossible
- single data source
— as the application grows maintainance goes high
Amazon.com
— 5ØØØTPS (5000 transactions per second)
— scale more (deploy more number instances)
/search
/payment
/user—profile
/wms — 10 TPS (10 transactions per second)— minimun instances would be more than enough
Microservice — break down the application into a smatter logical subsystems
- independent deployment can happen
- easy to scale
— team can own a set of microservices, whose scope is well defined
- tech stack can be independent
— Application very faster


What is microservice?

Microservice is an architectural style that structures an application as a small
logical subsystems
Microservices can have one or a few APIS exposed

Difference between API, Web service & Microservice



API:
An intermediary between systems, could be a weboervice, a utility,  jar, library , driver
Web service: Webservice is an API that works over web (HTTP& HTTPS)
Microservice: Its an architecture that breaks the bigger apps into
smaller cohesive subsystems, it consists of web services

Why Microservices??
-Highly maintainable and testable
-Loosely coupled
- Independently deployable
-Organized around business capabilities
-Owned by a small team
- Easy to scale
- Information hiding

API first approach
-It's the modern application development strategy
-This principle states that identify the APIs and build first


tool adoption — CI/CD, dep loyment tools, logging dashboards
product— engineering (dev & test & infra)
UI, service layer, DB
API first appraoch
UT/ LIX — sketches (figma, wiref rame)
SRS— PRD— product requirement document (business level use cases)
HLD- LLD- TRD technical requirement document sharding, async)
SDETs- TRD(implement the automation process) ,
Dev completes— manual OA
Unit tests
(API contracts, SQL querie, caching technqiues,
PRD(where the test cases)- backend automation
Integration tests (SDETs)— service level automation / Swagger/ confluenec/ Jira
API end to end validation (Acces tpken, API ) — pø, pl
UI validation — UI manual
in sprint- sign—off fthe product

Test driven development
A development principle that says not even a single line Of production code w/o a test
The development is done to make sure the tests are passed
This strategy ensures that there are no big leaks to higher stages


REST API



Headers
Content-Type - type of request body
Accept - content type of the response body
Authorization - header that helps gaining access of the resources


Request URL
It's a combination Of hostname and the context path
Eg:- https://gorest.co.in/public/v2}users
Host: https://goratco.in
base path: /pubIic/v2
Resource: lusers

params
Path params - path params are used with the endpoint to precisely reach the resource
Query params - query params acts like a filters to manipulate the response
Form params - Request params while inserting the media content type

Authentication
The process of the identity of the user
Accounting
The Ot trackilg the usage Of the regot:ceg

Types of Authentication
Basic auth
Oauth
Tokens
API key

	 */

}
