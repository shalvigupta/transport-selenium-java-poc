$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Transport.feature");
formatter.feature({
  "line": 1,
  "name": "POC feature",
  "description": "",
  "id": "poc-feature",
  "keyword": "Feature"
});
formatter.before({
  "duration": 2321056725,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "A trip request can be executed and results returned",
  "description": "",
  "id": "poc-feature;a-trip-request-can-be-executed-and-results-returned",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "Phileas is planning a trip",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "he executes a trip plan from \"North Sydney station\" to \"Town Hall Station\"",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "a list of trips should be provided",
  "keyword": "Then "
});
formatter.match({
  "location": "TransportTest.phileas_is_planning_a_trip()"
});
formatter.result({
  "duration": 3255758966,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "North Sydney station",
      "offset": 30
    },
    {
      "val": "Town Hall Station",
      "offset": 56
    }
  ],
  "location": "TransportTest.he_executes_a_trip_plan_from_to(String,String)"
});
formatter.result({
  "duration": 2547527463,
  "status": "passed"
});
formatter.match({
  "location": "TransportTest.a_list_of_trips_should_be_provided()"
});
formatter.result({
  "duration": 615386490,
  "status": "passed"
});
formatter.after({
  "duration": 179565832,
  "status": "passed"
});
});