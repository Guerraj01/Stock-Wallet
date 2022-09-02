ALTER TABLE "system$image" ADD "submetaobjectname" VARCHAR_IGNORECASE(255) NULL;
UPDATE "system$image"
 SET "submetaobjectname" = 'System.Image';
CREATE INDEX "idx_system$image_submetaobjectname_asc" ON "system$image" ("submetaobjectname" ASC,"id" ASC);
INSERT INTO "mendixsystem$attribute" ("id", 
"entity_id", 
"attribute_name", 
"column_name", 
"type", 
"length", 
"default_value", 
"is_auto_number")
 VALUES ('272f49fe-6a64-3ede-a32d-344a34e57b9f', 
'37827192-315d-4ab6-85b8-f626f866ea76', 
'submetaobjectname', 
'submetaobjectname', 
30, 
255, 
'System.Image', 
false);
INSERT INTO "mendixsystem$index" ("id", 
"table_id", 
"index_name")
 VALUES ('00a9ec1c-4fab-368f-83d4-ffa8ff501c8c', 
'37827192-315d-4ab6-85b8-f626f866ea76', 
'idx_system$image_submetaobjectname_asc');
INSERT INTO "mendixsystem$index_column" ("index_id", 
"column_id", 
"sort_order", 
"ordinal")
 VALUES ('00a9ec1c-4fab-368f-83d4-ffa8ff501c8c', 
'272f49fe-6a64-3ede-a32d-344a34e57b9f', 
false, 
0);
CREATE TABLE "myfirstmodule$userimage" (
	"id" BIGINT NOT NULL,
	PRIMARY KEY("id"));
INSERT INTO "mendixsystem$entity" ("id", 
"entity_name", 
"table_name", 
"superentity_id", 
"remote", 
"remote_primary_key")
 VALUES ('4187d31e-c9a5-4665-9c89-b5151c524f63', 
'MyFirstModule.UserImage', 
'myfirstmodule$userimage', 
'37827192-315d-4ab6-85b8-f626f866ea76', 
false, 
false);
CREATE TABLE "myfirstmodule$userimage_account" (
	"myfirstmodule$userimageid" BIGINT NOT NULL,
	"administration$accountid" BIGINT NOT NULL,
	PRIMARY KEY("myfirstmodule$userimageid","administration$accountid"),
	CONSTRAINT "uniq_myfirstmodule$userimage_account_administration$accountid" UNIQUE ("administration$accountid"),
	CONSTRAINT "uniq_myfirstmodule$userimage_account_myfirstmodule$userimageid" UNIQUE ("myfirstmodule$userimageid"));
CREATE INDEX "idx_myfirstmodule$userimage_account_administration$account_myfirstmodule$userimage" ON "myfirstmodule$userimage_account" ("administration$accountid" ASC,"myfirstmodule$userimageid" ASC);
INSERT INTO "mendixsystem$association" ("id", 
"association_name", 
"table_name", 
"parent_entity_id", 
"child_entity_id", 
"parent_column_name", 
"child_column_name", 
"index_name")
 VALUES ('abb9bfd5-6534-4333-a2cc-fa91efe90df0', 
'MyFirstModule.UserImage_Account', 
'myfirstmodule$userimage_account', 
'4187d31e-c9a5-4665-9c89-b5151c524f63', 
'ec66fba1-2aad-4b62-892b-95a146ec7e22', 
'myfirstmodule$userimageid', 
'administration$accountid', 
'idx_myfirstmodule$userimage_account_administration$account_myfirstmodule$userimage');
INSERT INTO "mendixsystem$unique_constraint" ("name", 
"table_id", 
"column_id")
 VALUES ('uniq_myfirstmodule$userimage_account_administration$accountid', 
'abb9bfd5-6534-4333-a2cc-fa91efe90df0', 
'395f2335-06a0-361f-9275-f170e567550d');
INSERT INTO "mendixsystem$unique_constraint" ("name", 
"table_id", 
"column_id")
 VALUES ('uniq_myfirstmodule$userimage_account_myfirstmodule$userimageid', 
'abb9bfd5-6534-4333-a2cc-fa91efe90df0', 
'4a49c511-fc05-3e4e-8a8e-32fe5573b8e8');
UPDATE "mendixsystem$version"
 SET "versionnumber" = '4.2', 
"lastsyncdate" = '20220819 17:22:29';
