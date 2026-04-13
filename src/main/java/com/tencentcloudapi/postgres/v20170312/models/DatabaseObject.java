/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.postgres.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DatabaseObject extends AbstractModel {

    /**
    * Specifies the supported object types in the database: account, database, schema, sequence, procedure, type, function, table, view, matview, column.
    */
    @SerializedName("ObjectType")
    @Expose
    private String ObjectType;

    /**
    * Specifies the database object name.
    */
    @SerializedName("ObjectName")
    @Expose
    private String ObjectName;

    /**
    * Describes the database object and the database name it belongs to. this parameter is required when the description object type is not database.
    */
    @SerializedName("DatabaseName")
    @Expose
    private String DatabaseName;

    /**
    * Specifies the schema name of the database object to describe. this parameter is required when the description object is not database or schema.
    */
    @SerializedName("SchemaName")
    @Expose
    private String SchemaName;

    /**
    * Specifies the database object to describe and the table name it belongs to. this parameter is required when the object type is column.
    */
    @SerializedName("TableName")
    @Expose
    private String TableName;

    /**
     * Get Specifies the supported object types in the database: account, database, schema, sequence, procedure, type, function, table, view, matview, column. 
     * @return ObjectType Specifies the supported object types in the database: account, database, schema, sequence, procedure, type, function, table, view, matview, column.
     */
    public String getObjectType() {
        return this.ObjectType;
    }

    /**
     * Set Specifies the supported object types in the database: account, database, schema, sequence, procedure, type, function, table, view, matview, column.
     * @param ObjectType Specifies the supported object types in the database: account, database, schema, sequence, procedure, type, function, table, view, matview, column.
     */
    public void setObjectType(String ObjectType) {
        this.ObjectType = ObjectType;
    }

    /**
     * Get Specifies the database object name. 
     * @return ObjectName Specifies the database object name.
     */
    public String getObjectName() {
        return this.ObjectName;
    }

    /**
     * Set Specifies the database object name.
     * @param ObjectName Specifies the database object name.
     */
    public void setObjectName(String ObjectName) {
        this.ObjectName = ObjectName;
    }

    /**
     * Get Describes the database object and the database name it belongs to. this parameter is required when the description object type is not database. 
     * @return DatabaseName Describes the database object and the database name it belongs to. this parameter is required when the description object type is not database.
     */
    public String getDatabaseName() {
        return this.DatabaseName;
    }

    /**
     * Set Describes the database object and the database name it belongs to. this parameter is required when the description object type is not database.
     * @param DatabaseName Describes the database object and the database name it belongs to. this parameter is required when the description object type is not database.
     */
    public void setDatabaseName(String DatabaseName) {
        this.DatabaseName = DatabaseName;
    }

    /**
     * Get Specifies the schema name of the database object to describe. this parameter is required when the description object is not database or schema. 
     * @return SchemaName Specifies the schema name of the database object to describe. this parameter is required when the description object is not database or schema.
     */
    public String getSchemaName() {
        return this.SchemaName;
    }

    /**
     * Set Specifies the schema name of the database object to describe. this parameter is required when the description object is not database or schema.
     * @param SchemaName Specifies the schema name of the database object to describe. this parameter is required when the description object is not database or schema.
     */
    public void setSchemaName(String SchemaName) {
        this.SchemaName = SchemaName;
    }

    /**
     * Get Specifies the database object to describe and the table name it belongs to. this parameter is required when the object type is column. 
     * @return TableName Specifies the database object to describe and the table name it belongs to. this parameter is required when the object type is column.
     */
    public String getTableName() {
        return this.TableName;
    }

    /**
     * Set Specifies the database object to describe and the table name it belongs to. this parameter is required when the object type is column.
     * @param TableName Specifies the database object to describe and the table name it belongs to. this parameter is required when the object type is column.
     */
    public void setTableName(String TableName) {
        this.TableName = TableName;
    }

    public DatabaseObject() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DatabaseObject(DatabaseObject source) {
        if (source.ObjectType != null) {
            this.ObjectType = new String(source.ObjectType);
        }
        if (source.ObjectName != null) {
            this.ObjectName = new String(source.ObjectName);
        }
        if (source.DatabaseName != null) {
            this.DatabaseName = new String(source.DatabaseName);
        }
        if (source.SchemaName != null) {
            this.SchemaName = new String(source.SchemaName);
        }
        if (source.TableName != null) {
            this.TableName = new String(source.TableName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ObjectType", this.ObjectType);
        this.setParamSimple(map, prefix + "ObjectName", this.ObjectName);
        this.setParamSimple(map, prefix + "DatabaseName", this.DatabaseName);
        this.setParamSimple(map, prefix + "SchemaName", this.SchemaName);
        this.setParamSimple(map, prefix + "TableName", this.TableName);

    }
}

