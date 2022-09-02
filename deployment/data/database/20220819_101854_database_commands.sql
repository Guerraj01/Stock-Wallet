ALTER TABLE "myfirstmodule$stock" ADD "amount" INT NULL;
UPDATE "myfirstmodule$stock"
 SET "amount" = 1;
ALTER TABLE "myfirstmodule$stock" ADD "profit" DECIMAL(28, 8) NULL;
UPDATE "myfirstmodule$stock"
 SET "profit" = 0;
INSERT INTO "mendixsystem$attribute" ("id", 
"entity_id", 
"attribute_name", 
"column_name", 
"type", 
"length", 
"default_value", 
"is_auto_number")
 VALUES ('556b49d5-4dac-455b-bdea-ba40b03a0727', 
'eb00e73a-ca2e-4428-bb9f-20213fe3f531', 
'Amount', 
'amount', 
3, 
0, 
'1', 
false);
INSERT INTO "mendixsystem$attribute" ("id", 
"entity_id", 
"attribute_name", 
"column_name", 
"type", 
"length", 
"default_value", 
"is_auto_number")
 VALUES ('a2ad4454-a866-4c47-8cd8-5ca9ce46eb31', 
'eb00e73a-ca2e-4428-bb9f-20213fe3f531', 
'Profit', 
'profit', 
5, 
0, 
'0', 
false);
UPDATE "mendixsystem$version"
 SET "versionnumber" = '4.2', 
"lastsyncdate" = '20220819 10:18:54';
