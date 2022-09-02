ALTER TABLE "myfirstmodule$stock" ADD "address" VARCHAR_IGNORECASE(200) NULL;
INSERT INTO "mendixsystem$attribute" ("id", 
"entity_id", 
"attribute_name", 
"column_name", 
"type", 
"length", 
"default_value", 
"is_auto_number")
 VALUES ('b2ffc3f5-2833-4bf7-a753-76f5633af74e', 
'eb00e73a-ca2e-4428-bb9f-20213fe3f531', 
'Address', 
'address', 
30, 
200, 
'', 
false);
UPDATE "mendixsystem$version"
 SET "versionnumber" = '4.2', 
"lastsyncdate" = '20220819 12:01:58';
