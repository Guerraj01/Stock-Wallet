CREATE TABLE "myfirstmodule$token" (
	"id" BIGINT NOT NULL,
	"content" VARCHAR_IGNORECASE(200) NULL,
	PRIMARY KEY("id"));
INSERT INTO "mendixsystem$entity" ("id", 
"entity_name", 
"table_name", 
"remote", 
"remote_primary_key")
 VALUES ('8c2c3703-f93e-444e-b550-310addb16189', 
'MyFirstModule.Token', 
'myfirstmodule$token', 
false, 
false);
INSERT INTO "mendixsystem$attribute" ("id", 
"entity_id", 
"attribute_name", 
"column_name", 
"type", 
"length", 
"default_value", 
"is_auto_number")
 VALUES ('a6144c5d-3d75-474f-a307-9e225828c40a', 
'8c2c3703-f93e-444e-b550-310addb16189', 
'Content', 
'content', 
30, 
200, 
'', 
false);
CREATE TABLE "myfirstmodule$token_account" (
	"myfirstmodule$tokenid" BIGINT NOT NULL,
	"administration$accountid" BIGINT NOT NULL,
	PRIMARY KEY("myfirstmodule$tokenid","administration$accountid"),
	CONSTRAINT "uniq_myfirstmodule$token_account_myfirstmodule$tokenid" UNIQUE ("myfirstmodule$tokenid"));
CREATE INDEX "idx_myfirstmodule$token_account_administration$account_myfirstmodule$token" ON "myfirstmodule$token_account" ("administration$accountid" ASC,"myfirstmodule$tokenid" ASC);
INSERT INTO "mendixsystem$association" ("id", 
"association_name", 
"table_name", 
"parent_entity_id", 
"child_entity_id", 
"parent_column_name", 
"child_column_name", 
"index_name")
 VALUES ('6d8d0ec7-931a-438b-931d-17756759a82f', 
'MyFirstModule.Token_Account', 
'myfirstmodule$token_account', 
'8c2c3703-f93e-444e-b550-310addb16189', 
'ec66fba1-2aad-4b62-892b-95a146ec7e22', 
'myfirstmodule$tokenid', 
'administration$accountid', 
'idx_myfirstmodule$token_account_administration$account_myfirstmodule$token');
INSERT INTO "mendixsystem$unique_constraint" ("name", 
"table_id", 
"column_id")
 VALUES ('uniq_myfirstmodule$token_account_myfirstmodule$tokenid', 
'6d8d0ec7-931a-438b-931d-17756759a82f', 
'04b9b387-690f-3896-924a-b73866d73745');
UPDATE "mendixsystem$version"
 SET "versionnumber" = '4.2', 
"lastsyncdate" = '20220823 09:30:33';
