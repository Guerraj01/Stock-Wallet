ALTER TABLE "myfirstmodule$stock_user" DROP CONSTRAINT "uniq_myfirstmodule$stock_user_myfirstmodule$stockid";
DROP INDEX "idx_myfirstmodule$stock_user_system$user_myfirstmodule$stock";
ALTER TABLE "myfirstmodule$stock_user" RENAME TO "816ac58c2a854ac3beaf5b029d833380";
ALTER TABLE "myfirstmodule$stock" ADD "system$owner" BIGINT NULL;
CREATE INDEX "idx_myfirstmodule$stock_system$owner" ON "myfirstmodule$stock" ("system$owner" ASC,"id" ASC);
INSERT INTO "mendixsystem$association" ("id", 
"association_name", 
"table_name", 
"parent_entity_id", 
"child_entity_id", 
"parent_column_name", 
"child_column_name")
 VALUES ('e8f2a298-b328-306d-88dd-677726311c36', 
'System.owner', 
'system$owner', 
'eb00e73a-ca2e-4428-bb9f-20213fe3f531', 
'282e2e60-88a5-469d-84a5-ba8d9151644f', 
'id', 
'system$owner');
INSERT INTO "mendixsystem$index" ("id", 
"table_id", 
"index_name")
 VALUES ('fb4e8e68-8e47-3f9d-a7e7-7bffccd7d03e', 
'eb00e73a-ca2e-4428-bb9f-20213fe3f531', 
'idx_myfirstmodule$stock_system$owner');
INSERT INTO "mendixsystem$index_column" ("index_id", 
"column_id", 
"sort_order", 
"ordinal")
 VALUES ('fb4e8e68-8e47-3f9d-a7e7-7bffccd7d03e', 
'e8f2a298-b328-306d-88dd-677726311c36', 
false, 
0);
DELETE FROM "mendixsystem$association" 
 WHERE "id" = '256e48bb-cd80-4346-9620-5d27cf3cc0bc';
DELETE FROM "mendixsystem$unique_constraint" 
 WHERE "name" = 'uniq_myfirstmodule$stock_user_myfirstmodule$stockid' AND "column_id" = '65ac3534-efc2-3ac3-b77f-2b1bfbae52c2';
CREATE TABLE "myfirstmodule$stock_account" (
	"myfirstmodule$stockid" BIGINT NOT NULL,
	"administration$accountid" BIGINT NOT NULL,
	PRIMARY KEY("myfirstmodule$stockid","administration$accountid"),
	CONSTRAINT "uniq_myfirstmodule$stock_account_myfirstmodule$stockid" UNIQUE ("myfirstmodule$stockid"));
CREATE INDEX "idx_myfirstmodule$stock_account_administration$account_myfirstmodule$stock" ON "myfirstmodule$stock_account" ("administration$accountid" ASC,"myfirstmodule$stockid" ASC);
INSERT INTO "mendixsystem$association" ("id", 
"association_name", 
"table_name", 
"parent_entity_id", 
"child_entity_id", 
"parent_column_name", 
"child_column_name", 
"index_name")
 VALUES ('efd5fa6e-a5f1-47c5-9128-e58715e6fe4e', 
'MyFirstModule.Stock_Account', 
'myfirstmodule$stock_account', 
'eb00e73a-ca2e-4428-bb9f-20213fe3f531', 
'ec66fba1-2aad-4b62-892b-95a146ec7e22', 
'myfirstmodule$stockid', 
'administration$accountid', 
'idx_myfirstmodule$stock_account_administration$account_myfirstmodule$stock');
INSERT INTO "mendixsystem$unique_constraint" ("name", 
"table_id", 
"column_id")
 VALUES ('uniq_myfirstmodule$stock_account_myfirstmodule$stockid', 
'efd5fa6e-a5f1-47c5-9128-e58715e6fe4e', 
'14e099ed-cf74-3492-8834-79a58d346aef');
DROP TABLE "816ac58c2a854ac3beaf5b029d833380";
UPDATE "mendixsystem$version"
 SET "versionnumber" = '4.2', 
"lastsyncdate" = '20220819 15:23:30';
