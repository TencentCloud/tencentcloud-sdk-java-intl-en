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

public class DescribeDatabaseObjectsRequest extends AbstractModel {

    /**
    * Instance ID. obtain through the api [DescribeDBInstances](https://www.tencentcloud.com/document/api/409/16773?from_cn_redirect=1).
    */
    @SerializedName("DBInstanceId")
    @Expose
    private String DBInstanceId;

    /**
    * Specifies the object type for querying. supported objects: database, schema, sequence, procedure, type, function, table, view, matview, column.
    */
    @SerializedName("ObjectType")
    @Expose
    private String ObjectType;

    /**
    * Number of items displayed at a time. default 20. value range 0-100.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Data offset, starting from 0.		
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Describes the database the query object belongs to. this parameter is required when the query object type is not database.
    */
    @SerializedName("DatabaseName")
    @Expose
    private String DatabaseName;

    /**
    * Specifies the mode belonging to the query object. this parameter is required when the query object type is not database or schema.
    */
    @SerializedName("SchemaName")
    @Expose
    private String SchemaName;

    /**
    * Specifies the table belonging to the query object. this parameter is required when the query object type is column.
    */
    @SerializedName("TableName")
    @Expose
    private String TableName;

    /**
     * Get Instance ID. obtain through the api [DescribeDBInstances](https://www.tencentcloud.com/document/api/409/16773?from_cn_redirect=1). 
     * @return DBInstanceId Instance ID. obtain through the api [DescribeDBInstances](https://www.tencentcloud.com/document/api/409/16773?from_cn_redirect=1).
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * Set Instance ID. obtain through the api [DescribeDBInstances](https://www.tencentcloud.com/document/api/409/16773?from_cn_redirect=1).
     * @param DBInstanceId Instance ID. obtain through the api [DescribeDBInstances](https://www.tencentcloud.com/document/api/409/16773?from_cn_redirect=1).
     */
    public void setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
    }

    /**
     * Get Specifies the object type for querying. supported objects: database, schema, sequence, procedure, type, function, table, view, matview, column. 
     * @return ObjectType Specifies the object type for querying. supported objects: database, schema, sequence, procedure, type, function, table, view, matview, column.
     */
    public String getObjectType() {
        return this.ObjectType;
    }

    /**
     * Set Specifies the object type for querying. supported objects: database, schema, sequence, procedure, type, function, table, view, matview, column.
     * @param ObjectType Specifies the object type for querying. supported objects: database, schema, sequence, procedure, type, function, table, view, matview, column.
     */
    public void setObjectType(String ObjectType) {
        this.ObjectType = ObjectType;
    }

    /**
     * Get Number of items displayed at a time. default 20. value range 0-100. 
     * @return Limit Number of items displayed at a time. default 20. value range 0-100.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of items displayed at a time. default 20. value range 0-100.
     * @param Limit Number of items displayed at a time. default 20. value range 0-100.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Data offset, starting from 0.		 
     * @return Offset Data offset, starting from 0.		
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Data offset, starting from 0.		
     * @param Offset Data offset, starting from 0.		
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Describes the database the query object belongs to. this parameter is required when the query object type is not database. 
     * @return DatabaseName Describes the database the query object belongs to. this parameter is required when the query object type is not database.
     */
    public String getDatabaseName() {
        return this.DatabaseName;
    }

    /**
     * Set Describes the database the query object belongs to. this parameter is required when the query object type is not database.
     * @param DatabaseName Describes the database the query object belongs to. this parameter is required when the query object type is not database.
     */
    public void setDatabaseName(String DatabaseName) {
        this.DatabaseName = DatabaseName;
    }

    /**
     * Get Specifies the mode belonging to the query object. this parameter is required when the query object type is not database or schema. 
     * @return SchemaName Specifies the mode belonging to the query object. this parameter is required when the query object type is not database or schema.
     */
    public String getSchemaName() {
        return this.SchemaName;
    }

    /**
     * Set Specifies the mode belonging to the query object. this parameter is required when the query object type is not database or schema.
     * @param SchemaName Specifies the mode belonging to the query object. this parameter is required when the query object type is not database or schema.
     */
    public void setSchemaName(String SchemaName) {
        this.SchemaName = SchemaName;
    }

    /**
     * Get Specifies the table belonging to the query object. this parameter is required when the query object type is column. 
     * @return TableName Specifies the table belonging to the query object. this parameter is required when the query object type is column.
     */
    public String getTableName() {
        return this.TableName;
    }

    /**
     * Set Specifies the table belonging to the query object. this parameter is required when the query object type is column.
     * @param TableName Specifies the table belonging to the query object. this parameter is required when the query object type is column.
     */
    public void setTableName(String TableName) {
        this.TableName = TableName;
    }

    public DescribeDatabaseObjectsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDatabaseObjectsRequest(DescribeDatabaseObjectsRequest source) {
        if (source.DBInstanceId != null) {
            this.DBInstanceId = new String(source.DBInstanceId);
        }
        if (source.ObjectType != null) {
            this.ObjectType = new String(source.ObjectType);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
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
        this.setParamSimple(map, prefix + "DBInstanceId", this.DBInstanceId);
        this.setParamSimple(map, prefix + "ObjectType", this.ObjectType);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "DatabaseName", this.DatabaseName);
        this.setParamSimple(map, prefix + "SchemaName", this.SchemaName);
        this.setParamSimple(map, prefix + "TableName", this.TableName);

    }
}

