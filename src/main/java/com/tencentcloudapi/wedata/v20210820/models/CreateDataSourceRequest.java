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

public class CreateDataSourceRequest extends AbstractModel {

    /**
    * Data Source Name, cannot be empty under the same SpaceName
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Data Source Category: Binding Engine, Binding Database
    */
    @SerializedName("Category")
    @Expose
    private String Category;

    /**
    * Data Source Type: enumerated values
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Project ID
    */
    @SerializedName("OwnerProjectId")
    @Expose
    private String OwnerProjectId;

    /**
    * Project Name
    */
    @SerializedName("OwnerProjectName")
    @Expose
    private String OwnerProjectName;

    /**
    * Project Name (Chinese)
    */
    @SerializedName("OwnerProjectIdent")
    @Expose
    private String OwnerProjectIdent;

    /**
    * Configuration Information Extension of Business Data Source
    */
    @SerializedName("BizParams")
    @Expose
    private String BizParams;

    /**
    * Data source configuration information, stored as JSON KV. The KV storage information varies according to the data source type
    */
    @SerializedName("Params")
    @Expose
    private String Params;

    /**
    * Data source description information
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Data Source Display Name, for visual inspection
    */
    @SerializedName("Display")
    @Expose
    private String Display;

    /**
    * If the data source list is bound to a database, then it is the database name
    */
    @SerializedName("DatabaseName")
    @Expose
    private String DatabaseName;

    /**
    * Instance ID of the data source engine, e.g., CDB Instance ID
    */
    @SerializedName("Instance")
    @Expose
    private String Instance;

    /**
    * Visibility of the data source, where 1 is visible and 0 is not visible. Default is 1
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Name of the business space to which the data source belongs
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * Collection Status
    */
    @SerializedName("Collect")
    @Expose
    private String Collect;

    /**
    * COS Bucket Information
    */
    @SerializedName("COSBucket")
    @Expose
    private String COSBucket;

    /**
    * cos region
    */
    @SerializedName("COSRegion")
    @Expose
    private String COSRegion;

    /**
    * Connection Test Result
    */
    @SerializedName("ConnectResult")
    @Expose
    private String ConnectResult;

    /**
    * Development Environment Data Source Configuration
    */
    @SerializedName("DevelopmentParams")
    @Expose
    private String DevelopmentParams;

    /**
     * Get Data Source Name, cannot be empty under the same SpaceName 
     * @return Name Data Source Name, cannot be empty under the same SpaceName
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Data Source Name, cannot be empty under the same SpaceName
     * @param Name Data Source Name, cannot be empty under the same SpaceName
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Data Source Category: Binding Engine, Binding Database 
     * @return Category Data Source Category: Binding Engine, Binding Database
     */
    public String getCategory() {
        return this.Category;
    }

    /**
     * Set Data Source Category: Binding Engine, Binding Database
     * @param Category Data Source Category: Binding Engine, Binding Database
     */
    public void setCategory(String Category) {
        this.Category = Category;
    }

    /**
     * Get Data Source Type: enumerated values 
     * @return Type Data Source Type: enumerated values
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Data Source Type: enumerated values
     * @param Type Data Source Type: enumerated values
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Project ID 
     * @return OwnerProjectId Project ID
     */
    public String getOwnerProjectId() {
        return this.OwnerProjectId;
    }

    /**
     * Set Project ID
     * @param OwnerProjectId Project ID
     */
    public void setOwnerProjectId(String OwnerProjectId) {
        this.OwnerProjectId = OwnerProjectId;
    }

    /**
     * Get Project Name 
     * @return OwnerProjectName Project Name
     */
    public String getOwnerProjectName() {
        return this.OwnerProjectName;
    }

    /**
     * Set Project Name
     * @param OwnerProjectName Project Name
     */
    public void setOwnerProjectName(String OwnerProjectName) {
        this.OwnerProjectName = OwnerProjectName;
    }

    /**
     * Get Project Name (Chinese) 
     * @return OwnerProjectIdent Project Name (Chinese)
     */
    public String getOwnerProjectIdent() {
        return this.OwnerProjectIdent;
    }

    /**
     * Set Project Name (Chinese)
     * @param OwnerProjectIdent Project Name (Chinese)
     */
    public void setOwnerProjectIdent(String OwnerProjectIdent) {
        this.OwnerProjectIdent = OwnerProjectIdent;
    }

    /**
     * Get Configuration Information Extension of Business Data Source 
     * @return BizParams Configuration Information Extension of Business Data Source
     */
    public String getBizParams() {
        return this.BizParams;
    }

    /**
     * Set Configuration Information Extension of Business Data Source
     * @param BizParams Configuration Information Extension of Business Data Source
     */
    public void setBizParams(String BizParams) {
        this.BizParams = BizParams;
    }

    /**
     * Get Data source configuration information, stored as JSON KV. The KV storage information varies according to the data source type 
     * @return Params Data source configuration information, stored as JSON KV. The KV storage information varies according to the data source type
     */
    public String getParams() {
        return this.Params;
    }

    /**
     * Set Data source configuration information, stored as JSON KV. The KV storage information varies according to the data source type
     * @param Params Data source configuration information, stored as JSON KV. The KV storage information varies according to the data source type
     */
    public void setParams(String Params) {
        this.Params = Params;
    }

    /**
     * Get Data source description information 
     * @return Description Data source description information
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Data source description information
     * @param Description Data source description information
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Data Source Display Name, for visual inspection 
     * @return Display Data Source Display Name, for visual inspection
     */
    public String getDisplay() {
        return this.Display;
    }

    /**
     * Set Data Source Display Name, for visual inspection
     * @param Display Data Source Display Name, for visual inspection
     */
    public void setDisplay(String Display) {
        this.Display = Display;
    }

    /**
     * Get If the data source list is bound to a database, then it is the database name 
     * @return DatabaseName If the data source list is bound to a database, then it is the database name
     */
    public String getDatabaseName() {
        return this.DatabaseName;
    }

    /**
     * Set If the data source list is bound to a database, then it is the database name
     * @param DatabaseName If the data source list is bound to a database, then it is the database name
     */
    public void setDatabaseName(String DatabaseName) {
        this.DatabaseName = DatabaseName;
    }

    /**
     * Get Instance ID of the data source engine, e.g., CDB Instance ID 
     * @return Instance Instance ID of the data source engine, e.g., CDB Instance ID
     */
    public String getInstance() {
        return this.Instance;
    }

    /**
     * Set Instance ID of the data source engine, e.g., CDB Instance ID
     * @param Instance Instance ID of the data source engine, e.g., CDB Instance ID
     */
    public void setInstance(String Instance) {
        this.Instance = Instance;
    }

    /**
     * Get Visibility of the data source, where 1 is visible and 0 is not visible. Default is 1 
     * @return Status Visibility of the data source, where 1 is visible and 0 is not visible. Default is 1
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Visibility of the data source, where 1 is visible and 0 is not visible. Default is 1
     * @param Status Visibility of the data source, where 1 is visible and 0 is not visible. Default is 1
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Name of the business space to which the data source belongs 
     * @return ClusterId Name of the business space to which the data source belongs
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set Name of the business space to which the data source belongs
     * @param ClusterId Name of the business space to which the data source belongs
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get Collection Status 
     * @return Collect Collection Status
     */
    public String getCollect() {
        return this.Collect;
    }

    /**
     * Set Collection Status
     * @param Collect Collection Status
     */
    public void setCollect(String Collect) {
        this.Collect = Collect;
    }

    /**
     * Get COS Bucket Information 
     * @return COSBucket COS Bucket Information
     */
    public String getCOSBucket() {
        return this.COSBucket;
    }

    /**
     * Set COS Bucket Information
     * @param COSBucket COS Bucket Information
     */
    public void setCOSBucket(String COSBucket) {
        this.COSBucket = COSBucket;
    }

    /**
     * Get cos region 
     * @return COSRegion cos region
     */
    public String getCOSRegion() {
        return this.COSRegion;
    }

    /**
     * Set cos region
     * @param COSRegion cos region
     */
    public void setCOSRegion(String COSRegion) {
        this.COSRegion = COSRegion;
    }

    /**
     * Get Connection Test Result 
     * @return ConnectResult Connection Test Result
     */
    public String getConnectResult() {
        return this.ConnectResult;
    }

    /**
     * Set Connection Test Result
     * @param ConnectResult Connection Test Result
     */
    public void setConnectResult(String ConnectResult) {
        this.ConnectResult = ConnectResult;
    }

    /**
     * Get Development Environment Data Source Configuration 
     * @return DevelopmentParams Development Environment Data Source Configuration
     */
    public String getDevelopmentParams() {
        return this.DevelopmentParams;
    }

    /**
     * Set Development Environment Data Source Configuration
     * @param DevelopmentParams Development Environment Data Source Configuration
     */
    public void setDevelopmentParams(String DevelopmentParams) {
        this.DevelopmentParams = DevelopmentParams;
    }

    public CreateDataSourceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateDataSourceRequest(CreateDataSourceRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Category != null) {
            this.Category = new String(source.Category);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.OwnerProjectId != null) {
            this.OwnerProjectId = new String(source.OwnerProjectId);
        }
        if (source.OwnerProjectName != null) {
            this.OwnerProjectName = new String(source.OwnerProjectName);
        }
        if (source.OwnerProjectIdent != null) {
            this.OwnerProjectIdent = new String(source.OwnerProjectIdent);
        }
        if (source.BizParams != null) {
            this.BizParams = new String(source.BizParams);
        }
        if (source.Params != null) {
            this.Params = new String(source.Params);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Display != null) {
            this.Display = new String(source.Display);
        }
        if (source.DatabaseName != null) {
            this.DatabaseName = new String(source.DatabaseName);
        }
        if (source.Instance != null) {
            this.Instance = new String(source.Instance);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.Collect != null) {
            this.Collect = new String(source.Collect);
        }
        if (source.COSBucket != null) {
            this.COSBucket = new String(source.COSBucket);
        }
        if (source.COSRegion != null) {
            this.COSRegion = new String(source.COSRegion);
        }
        if (source.ConnectResult != null) {
            this.ConnectResult = new String(source.ConnectResult);
        }
        if (source.DevelopmentParams != null) {
            this.DevelopmentParams = new String(source.DevelopmentParams);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Category", this.Category);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "OwnerProjectId", this.OwnerProjectId);
        this.setParamSimple(map, prefix + "OwnerProjectName", this.OwnerProjectName);
        this.setParamSimple(map, prefix + "OwnerProjectIdent", this.OwnerProjectIdent);
        this.setParamSimple(map, prefix + "BizParams", this.BizParams);
        this.setParamSimple(map, prefix + "Params", this.Params);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Display", this.Display);
        this.setParamSimple(map, prefix + "DatabaseName", this.DatabaseName);
        this.setParamSimple(map, prefix + "Instance", this.Instance);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "Collect", this.Collect);
        this.setParamSimple(map, prefix + "COSBucket", this.COSBucket);
        this.setParamSimple(map, prefix + "COSRegion", this.COSRegion);
        this.setParamSimple(map, prefix + "ConnectResult", this.ConnectResult);
        this.setParamSimple(map, prefix + "DevelopmentParams", this.DevelopmentParams);

    }
}

