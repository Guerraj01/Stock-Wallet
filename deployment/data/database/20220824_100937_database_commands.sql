CREATE TABLE "myfirstmodule$sumprofit" (
	"id" BIGINT NOT NULL,
	"value" DECIMAL(28, 8) NULL,
	PRIMARY KEY("id"));
INSERT INTO "mendixsystem$entity" ("id", 
"entity_name", 
"table_name", 
"remote", 
"remote_primary_key")
 VALUES ('3acd0fe1-31e9-46ba-8253-7d14898f1a8e', 
'MyFirstModule.SumProfit', 
'myfirstmodule$sumprofit', 
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
 VALUES ('89457f47-114c-4e5d-9152-e10f1e07e7fa', 
'3acd0fe1-31e9-46ba-8253-7d14898f1a8e', 
'Value', 
'value', 
5, 
0, 
'0', 
false);
CREATE TABLE "myfirstmodule$stock_sumprofit" (
	"myfirstmodule$stockid" BIGINT NOT NULL,
	"myfirstmodule$sumprofitid" BIGINT NOT NULL,
	PRIMARY KEY("myfirstmodule$stockid","myfirstmodule$sumprofitid"),
	CONSTRAINT "uniq_myfirstmodule$stock_sumprofit_myfirstmodule$stockid" UNIQUE ("myfirstmodule$stockid"));
CREATE INDEX "idx_myfirstmodule$stock_sumprofit_myfirstmodule$sumprofit_myfirstmodule$stock" ON "myfirstmodule$stock_sumprofit" ("myfirstmodule$sumprofitid" ASC,"myfirstmodule$stockid" ASC);
INSERT INTO "mendixsystem$association" ("id", 
"association_name", 
"table_name", 
"parent_entity_id", 
"child_entity_id", 
"parent_column_name", 
"child_column_name", 
"index_name")
 VALUES ('7e94a5cc-2855-4c11-870e-9f8278506254', 
'MyFirstModule.Stock_SumProfit', 
'myfirstmodule$stock_sumprofit', 
'eb00e73a-ca2e-4428-bb9f-20213fe3f531', 
'3acd0fe1-31e9-46ba-8253-7d14898f1a8e', 
'myfirstmodule$stockid', 
'myfirstmodule$sumprofitid', 
'idx_myfirstmodule$stock_sumprofit_myfirstmodule$sumprofit_myfirstmodule$stock');
INSERT INTO "mendixsystem$unique_constraint" ("name", 
"table_id", 
"column_id")
 VALUES ('uniq_myfirstmodule$stock_sumprofit_myfirstmodule$stockid', 
'7e94a5cc-2855-4c11-870e-9f8278506254', 
'7a12b0cb-1b35-3781-8a3f-33bccec35952');
UPDATE "mendixsystem$version"
 SET "versionnumber" = '4.2', 
"lastsyncdate" = '20220824 10:09:37';
