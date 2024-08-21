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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CopyDLCTableRequest extends AbstractModel {

    /**
    * Description of the source data table name
    */
    @SerializedName("SourceData")
    @Expose
    private DMSSourceDatabaseInfo [] SourceData;

    /**
    * Target database name
    */
    @SerializedName("DestinationDatabaseName")
    @Expose
    private String DestinationDatabaseName;

    /**
    * Target data table name
    */
    @SerializedName("DestinationTableName")
    @Expose
    private String DestinationTableName;

    /**
    * Engine name
    */
    @SerializedName("DataEngineName")
    @Expose
    private String DataEngineName;

    /**
    * Whether to create a new table
    */
    @SerializedName("IsCreateTable")
    @Expose
    private Boolean IsCreateTable;

    /**
    * Catalog name
    */
    @SerializedName("Catalog")
    @Expose
    private String Catalog;

    /**
    * Resource group name
    */
    @SerializedName("ResourceGroupName")
    @Expose
    private String ResourceGroupName;

    /**
     * Get Description of the source data table name 
     * @return SourceData Description of the source data table name
     */
    public DMSSourceDatabaseInfo [] getSourceData() {
        return this.SourceData;
    }

    /**
     * Set Description of the source data table name
     * @param SourceData Description of the source data table name
     */
    public void setSourceData(DMSSourceDatabaseInfo [] SourceData) {
        this.SourceData = SourceData;
    }

    /**
     * Get Target database name 
     * @return DestinationDatabaseName Target database name
     */
    public String getDestinationDatabaseName() {
        return this.DestinationDatabaseName;
    }

    /**
     * Set Target database name
     * @param DestinationDatabaseName Target database name
     */
    public void setDestinationDatabaseName(String DestinationDatabaseName) {
        this.DestinationDatabaseName = DestinationDatabaseName;
    }

    /**
     * Get Target data table name 
     * @return DestinationTableName Target data table name
     */
    public String getDestinationTableName() {
        return this.DestinationTableName;
    }

    /**
     * Set Target data table name
     * @param DestinationTableName Target data table name
     */
    public void setDestinationTableName(String DestinationTableName) {
        this.DestinationTableName = DestinationTableName;
    }

    /**
     * Get Engine name 
     * @return DataEngineName Engine name
     */
    public String getDataEngineName() {
        return this.DataEngineName;
    }

    /**
     * Set Engine name
     * @param DataEngineName Engine name
     */
    public void setDataEngineName(String DataEngineName) {
        this.DataEngineName = DataEngineName;
    }

    /**
     * Get Whether to create a new table 
     * @return IsCreateTable Whether to create a new table
     */
    public Boolean getIsCreateTable() {
        return this.IsCreateTable;
    }

    /**
     * Set Whether to create a new table
     * @param IsCreateTable Whether to create a new table
     */
    public void setIsCreateTable(Boolean IsCreateTable) {
        this.IsCreateTable = IsCreateTable;
    }

    /**
     * Get Catalog name 
     * @return Catalog Catalog name
     */
    public String getCatalog() {
        return this.Catalog;
    }

    /**
     * Set Catalog name
     * @param Catalog Catalog name
     */
    public void setCatalog(String Catalog) {
        this.Catalog = Catalog;
    }

    /**
     * Get Resource group name 
     * @return ResourceGroupName Resource group name
     */
    public String getResourceGroupName() {
        return this.ResourceGroupName;
    }

    /**
     * Set Resource group name
     * @param ResourceGroupName Resource group name
     */
    public void setResourceGroupName(String ResourceGroupName) {
        this.ResourceGroupName = ResourceGroupName;
    }

    public CopyDLCTableRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CopyDLCTableRequest(CopyDLCTableRequest source) {
        if (source.SourceData != null) {
            this.SourceData = new DMSSourceDatabaseInfo[source.SourceData.length];
            for (int i = 0; i < source.SourceData.length; i++) {
                this.SourceData[i] = new DMSSourceDatabaseInfo(source.SourceData[i]);
            }
        }
        if (source.DestinationDatabaseName != null) {
            this.DestinationDatabaseName = new String(source.DestinationDatabaseName);
        }
        if (source.DestinationTableName != null) {
            this.DestinationTableName = new String(source.DestinationTableName);
        }
        if (source.DataEngineName != null) {
            this.DataEngineName = new String(source.DataEngineName);
        }
        if (source.IsCreateTable != null) {
            this.IsCreateTable = new Boolean(source.IsCreateTable);
        }
        if (source.Catalog != null) {
            this.Catalog = new String(source.Catalog);
        }
        if (source.ResourceGroupName != null) {
            this.ResourceGroupName = new String(source.ResourceGroupName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "SourceData.", this.SourceData);
        this.setParamSimple(map, prefix + "DestinationDatabaseName", this.DestinationDatabaseName);
        this.setParamSimple(map, prefix + "DestinationTableName", this.DestinationTableName);
        this.setParamSimple(map, prefix + "DataEngineName", this.DataEngineName);
        this.setParamSimple(map, prefix + "IsCreateTable", this.IsCreateTable);
        this.setParamSimple(map, prefix + "Catalog", this.Catalog);
        this.setParamSimple(map, prefix + "ResourceGroupName", this.ResourceGroupName);

    }
}

