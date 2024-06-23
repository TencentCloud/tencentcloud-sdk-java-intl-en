/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTableSchemaInfoRequest extends AbstractModel {

    /**
    * Table Name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Database name
    */
    @SerializedName("DatabaseName")
    @Expose
    private String DatabaseName;

    /**
    * Data Source Types (e.g., MYSQL, HIVE, KAFKA, etc.)
    */
    @SerializedName("MsType")
    @Expose
    private String MsType;

    /**
    * Data source ID
    */
    @SerializedName("DatasourceId")
    @Expose
    private String DatasourceId;

    /**
    * Connection Type (example value: rpc)
    */
    @SerializedName("ConnectionType")
    @Expose
    private String ConnectionType;

    /**
    * Schema Name under Metadata Database
    */
    @SerializedName("SchemaName")
    @Expose
    private String SchemaName;

    /**
     * Get Table Name 
     * @return Name Table Name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Table Name
     * @param Name Table Name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Database name 
     * @return DatabaseName Database name
     */
    public String getDatabaseName() {
        return this.DatabaseName;
    }

    /**
     * Set Database name
     * @param DatabaseName Database name
     */
    public void setDatabaseName(String DatabaseName) {
        this.DatabaseName = DatabaseName;
    }

    /**
     * Get Data Source Types (e.g., MYSQL, HIVE, KAFKA, etc.) 
     * @return MsType Data Source Types (e.g., MYSQL, HIVE, KAFKA, etc.)
     */
    public String getMsType() {
        return this.MsType;
    }

    /**
     * Set Data Source Types (e.g., MYSQL, HIVE, KAFKA, etc.)
     * @param MsType Data Source Types (e.g., MYSQL, HIVE, KAFKA, etc.)
     */
    public void setMsType(String MsType) {
        this.MsType = MsType;
    }

    /**
     * Get Data source ID 
     * @return DatasourceId Data source ID
     */
    public String getDatasourceId() {
        return this.DatasourceId;
    }

    /**
     * Set Data source ID
     * @param DatasourceId Data source ID
     */
    public void setDatasourceId(String DatasourceId) {
        this.DatasourceId = DatasourceId;
    }

    /**
     * Get Connection Type (example value: rpc) 
     * @return ConnectionType Connection Type (example value: rpc)
     */
    public String getConnectionType() {
        return this.ConnectionType;
    }

    /**
     * Set Connection Type (example value: rpc)
     * @param ConnectionType Connection Type (example value: rpc)
     */
    public void setConnectionType(String ConnectionType) {
        this.ConnectionType = ConnectionType;
    }

    /**
     * Get Schema Name under Metadata Database 
     * @return SchemaName Schema Name under Metadata Database
     */
    public String getSchemaName() {
        return this.SchemaName;
    }

    /**
     * Set Schema Name under Metadata Database
     * @param SchemaName Schema Name under Metadata Database
     */
    public void setSchemaName(String SchemaName) {
        this.SchemaName = SchemaName;
    }

    public DescribeTableSchemaInfoRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTableSchemaInfoRequest(DescribeTableSchemaInfoRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.DatabaseName != null) {
            this.DatabaseName = new String(source.DatabaseName);
        }
        if (source.MsType != null) {
            this.MsType = new String(source.MsType);
        }
        if (source.DatasourceId != null) {
            this.DatasourceId = new String(source.DatasourceId);
        }
        if (source.ConnectionType != null) {
            this.ConnectionType = new String(source.ConnectionType);
        }
        if (source.SchemaName != null) {
            this.SchemaName = new String(source.SchemaName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "DatabaseName", this.DatabaseName);
        this.setParamSimple(map, prefix + "MsType", this.MsType);
        this.setParamSimple(map, prefix + "DatasourceId", this.DatasourceId);
        this.setParamSimple(map, prefix + "ConnectionType", this.ConnectionType);
        this.setParamSimple(map, prefix + "SchemaName", this.SchemaName);

    }
}

