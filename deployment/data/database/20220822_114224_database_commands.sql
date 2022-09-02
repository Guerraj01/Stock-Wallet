ALTER TABLE "myfirstmodule$stock" ADD "changeddate" TIMESTAMP NULL;
ALTER TABLE "myfirstmodule$stock" ADD "createddate" TIMESTAMP NULL;
ALTER TABLE "myfirstmodule$stock" ADD "system$changedby" BIGINT NULL;
CREATE INDEX "idx_myfirstmodule$stock_system$changedby" ON "myfirstmodule$stock" ("system$changedby" ASC,"id" ASC);
INSERT INTO "mendixsystem$attribute" ("id", 
"entity_id", 
"attribute_name", 
"column_name", 
"type", 
"length", 
"default_value", 
"is_auto_number")
 VALUES ('999341c1-825f-3b7e-a324-d96de424d963', 
'eb00e73a-ca2e-4428-bb9f-20213fe3f531', 
'createdDate', 
'createddate', 
20, 
0, 
'', 
false);
INSERT INTO "mendixsystem$attribute" ("id", 
"entity_id", 
"attribute_name", 
"column_name", 
"type", 
"length", 
"default_value", 
"is_auto_number")
 VALUES ('0cae8868-b941-33b1-94f7-044fc4bd887d', 
'eb00e73a-ca2e-4428-bb9f-20213fe3f531', 
'changedDate', 
'changeddate', 
20, 
0, 
'', 
false);
INSERT INTO "mendixsystem$association" ("id", 
"association_name", 
"table_name", 
"parent_entity_id", 
"child_entity_id", 
"parent_column_name", 
"child_column_name")
 VALUES ('994b83c4-a164-3a5d-ad17-684662a4e220', 
'System.changedBy', 
'system$changedby', 
'eb00e73a-ca2e-4428-bb9f-20213fe3f531', 
'282e2e60-88a5-469d-84a5-ba8d9151644f', 
'id', 
'system$changedby');
INSERT INTO "mendixsystem$index" ("id", 
"table_id", 
"index_name")
 VALUES ('c431d4f9-7348-38a7-b71b-19a97904b2ec', 
'eb00e73a-ca2e-4428-bb9f-20213fe3f531', 
'idx_myfirstmodule$stock_system$changedby');
INSERT INTO "mendixsystem$index_column" ("index_id", 
"column_id", 
"sort_order", 
"ordinal")
 VALUES ('c431d4f9-7348-38a7-b71b-19a97904b2ec', 
'994b83c4-a164-3a5d-ad17-684662a4e220', 
false, 
0);
UPDATE "mendixsystem$version"
 SET "versionnumber" = '4.2', 
"lastsyncdate" = '20220822 11:42:24';
