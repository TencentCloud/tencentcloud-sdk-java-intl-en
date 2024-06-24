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

public class TableNameFilter extends AbstractModel {

    /**
    * Data source type
    */
    @SerializedName("MsType")
    @Expose
    private String MsType;

    /**
    * Data source ID
    */
    @SerializedName("DatasourceId")
    @Expose
    private Long DatasourceId;

    /**
    * Database name
    */
    @SerializedName("DatabaseName")
    @Expose
    private String DatabaseName;

    /**
    * schema
    */
    @SerializedName("SchemaName")
    @Expose
    private String SchemaName;

    /**
    * Table name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
     * Get Data source type 
     * @return MsType Data source type
     */
    public String getMsType() {
        return this.MsType;
    }

    /**
     * Set Data source type
     * @param MsType Data source type
     */
    public void setMsType(String MsType) {
        this.MsType = MsType;
    }

    /**
     * Get Data source ID 
     * @return DatasourceId Data source ID
     */
    public Long getDatasourceId() {
        return this.DatasourceId;
    }

    /**
     * Set Data source ID
     * @param DatasourceId Data source ID
     */
    public void setDatasourceId(Long DatasourceId) {
        this.DatasourceId = DatasourceId;
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
     * Get schema 
     * @return SchemaName schema
     */
    public String getSchemaName() {
        return this.SchemaName;
    }

    /**
     * Set schema
     * @param SchemaName schema
     */
    public void setSchemaName(String SchemaName) {
        this.SchemaName = SchemaName;
    }

    /**
     * Get Table name 
     * @return Name Table name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Table name
     * @param Name Table name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    public TableNameFilter() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TableNameFilter(TableNameFilter source) {
        if (source.MsType != null) {
            this.MsType = new String(source.MsType);
        }
        if (source.DatasourceId != null) {
            this.DatasourceId = new Long(source.DatasourceId);
        }
        if (source.DatabaseName != null) {
            this.DatabaseName = new String(source.DatabaseName);
        }
        if (source.SchemaName != null) {
            this.SchemaName = new String(source.SchemaName);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MsType", this.MsType);
        this.setParamSimple(map, prefix + "DatasourceId", this.DatasourceId);
        this.setParamSimple(map, prefix + "DatabaseName", this.DatabaseName);
        this.setParamSimple(map, prefix + "SchemaName", this.SchemaName);
        this.setParamSimple(map, prefix + "Name", this.Name);

    }
}

