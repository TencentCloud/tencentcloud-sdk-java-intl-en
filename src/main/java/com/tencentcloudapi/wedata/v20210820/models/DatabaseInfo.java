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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DatabaseInfo extends AbstractModel {

    /**
    * Data source name
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("DatasourceName")
    @Expose
    private String DatasourceName;

    /**
    * Data Source IDNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("DatasourceId")
    @Expose
    private String DatasourceId;

    /**
    * Database nameNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("DatabaseName")
    @Expose
    private String DatabaseName;

    /**
    * Database id
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("DatabaseId")
    @Expose
    private String DatabaseId;

    /**
    * Instance Id
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Data source typeNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("DatasourceType")
    @Expose
    private Long DatasourceType;

    /**
    * Database Original Name
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("OriginDatabaseName")
    @Expose
    private String OriginDatabaseName;

    /**
    * Schema NameNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("OriginSchemaName")
    @Expose
    private String OriginSchemaName;

    /**
    * 0 or Not Returned. Undefined, 1. generation 2. development
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("DsEnvType")
    @Expose
    private Long DsEnvType;

    /**
     * Get Data source name
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return DatasourceName Data source name
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getDatasourceName() {
        return this.DatasourceName;
    }

    /**
     * Set Data source name
Note: This field may return null, indicating that no valid value can be obtained.
     * @param DatasourceName Data source name
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setDatasourceName(String DatasourceName) {
        this.DatasourceName = DatasourceName;
    }

    /**
     * Get Data Source IDNote: This field may return null, indicating that no valid value can be obtained. 
     * @return DatasourceId Data Source IDNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getDatasourceId() {
        return this.DatasourceId;
    }

    /**
     * Set Data Source IDNote: This field may return null, indicating that no valid value can be obtained.
     * @param DatasourceId Data Source IDNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setDatasourceId(String DatasourceId) {
        this.DatasourceId = DatasourceId;
    }

    /**
     * Get Database nameNote: This field may return null, indicating that no valid value can be obtained. 
     * @return DatabaseName Database nameNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getDatabaseName() {
        return this.DatabaseName;
    }

    /**
     * Set Database nameNote: This field may return null, indicating that no valid value can be obtained.
     * @param DatabaseName Database nameNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setDatabaseName(String DatabaseName) {
        this.DatabaseName = DatabaseName;
    }

    /**
     * Get Database id
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return DatabaseId Database id
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getDatabaseId() {
        return this.DatabaseId;
    }

    /**
     * Set Database id
Note: This field may return null, indicating that no valid value can be obtained.
     * @param DatabaseId Database id
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setDatabaseId(String DatabaseId) {
        this.DatabaseId = DatabaseId;
    }

    /**
     * Get Instance Id
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return InstanceId Instance Id
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance Id
Note: This field may return null, indicating that no valid value can be obtained.
     * @param InstanceId Instance Id
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Data source typeNote: This field may return null, indicating that no valid value can be obtained. 
     * @return DatasourceType Data source typeNote: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getDatasourceType() {
        return this.DatasourceType;
    }

    /**
     * Set Data source typeNote: This field may return null, indicating that no valid value can be obtained.
     * @param DatasourceType Data source typeNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setDatasourceType(Long DatasourceType) {
        this.DatasourceType = DatasourceType;
    }

    /**
     * Get Database Original Name
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return OriginDatabaseName Database Original Name
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getOriginDatabaseName() {
        return this.OriginDatabaseName;
    }

    /**
     * Set Database Original Name
Note: This field may return null, indicating that no valid value can be obtained.
     * @param OriginDatabaseName Database Original Name
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setOriginDatabaseName(String OriginDatabaseName) {
        this.OriginDatabaseName = OriginDatabaseName;
    }

    /**
     * Get Schema NameNote: This field may return null, indicating that no valid value can be obtained. 
     * @return OriginSchemaName Schema NameNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getOriginSchemaName() {
        return this.OriginSchemaName;
    }

    /**
     * Set Schema NameNote: This field may return null, indicating that no valid value can be obtained.
     * @param OriginSchemaName Schema NameNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setOriginSchemaName(String OriginSchemaName) {
        this.OriginSchemaName = OriginSchemaName;
    }

    /**
     * Get 0 or Not Returned. Undefined, 1. generation 2. development
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return DsEnvType 0 or Not Returned. Undefined, 1. generation 2. development
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getDsEnvType() {
        return this.DsEnvType;
    }

    /**
     * Set 0 or Not Returned. Undefined, 1. generation 2. development
Note: This field may return null, indicating that no valid value can be obtained.
     * @param DsEnvType 0 or Not Returned. Undefined, 1. generation 2. development
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setDsEnvType(Long DsEnvType) {
        this.DsEnvType = DsEnvType;
    }

    public DatabaseInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DatabaseInfo(DatabaseInfo source) {
        if (source.DatasourceName != null) {
            this.DatasourceName = new String(source.DatasourceName);
        }
        if (source.DatasourceId != null) {
            this.DatasourceId = new String(source.DatasourceId);
        }
        if (source.DatabaseName != null) {
            this.DatabaseName = new String(source.DatabaseName);
        }
        if (source.DatabaseId != null) {
            this.DatabaseId = new String(source.DatabaseId);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.DatasourceType != null) {
            this.DatasourceType = new Long(source.DatasourceType);
        }
        if (source.OriginDatabaseName != null) {
            this.OriginDatabaseName = new String(source.OriginDatabaseName);
        }
        if (source.OriginSchemaName != null) {
            this.OriginSchemaName = new String(source.OriginSchemaName);
        }
        if (source.DsEnvType != null) {
            this.DsEnvType = new Long(source.DsEnvType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DatasourceName", this.DatasourceName);
        this.setParamSimple(map, prefix + "DatasourceId", this.DatasourceId);
        this.setParamSimple(map, prefix + "DatabaseName", this.DatabaseName);
        this.setParamSimple(map, prefix + "DatabaseId", this.DatabaseId);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "DatasourceType", this.DatasourceType);
        this.setParamSimple(map, prefix + "OriginDatabaseName", this.OriginDatabaseName);
        this.setParamSimple(map, prefix + "OriginSchemaName", this.OriginSchemaName);
        this.setParamSimple(map, prefix + "DsEnvType", this.DsEnvType);

    }
}

