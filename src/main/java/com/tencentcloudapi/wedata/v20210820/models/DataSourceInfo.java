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

public class DataSourceInfo extends AbstractModel {

    /**
    * If the data source list is bound to a database, then it is the database nameNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("DatabaseName")
    @Expose
    private String DatabaseName;

    /**
    * Data source description informationNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Data Source ID
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("ID")
    @Expose
    private Long ID;

    /**
    * Instance ID of the data source engine, e.g., CDB Instance IDNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Instance")
    @Expose
    private String Instance;

    /**
    * Data Source Name, cannot be empty under the same SpaceNameNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Region to which the data source engine belongs
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * Data Source Type: enumerated valuesNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Cluster ID to which the data source belongs
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * Application ID AppId
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * Configuration Information Extension of Business Data SourceNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("BizParams")
    @Expose
    private String BizParams;

    /**
    * Data Source Category: Binding Engine, Binding DatabaseNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Category")
    @Expose
    private String Category;

    /**
    * Data Source Display Name, for visual inspectionNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Display")
    @Expose
    private String Display;

    /**
    * Data Source Responsible Person Account ID
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("OwnerAccount")
    @Expose
    private String OwnerAccount;

    /**
    * Data source configuration information, stored as JSON KV. The KV storage information varies according to the data source typeNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Params")
    @Expose
    private String Params;

    /**
    * Visibility of the data source, where 1 is visible and 0 is not visible. Default is 1Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Data source owner account name
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("OwnerAccountName")
    @Expose
    private String OwnerAccountName;

    /**
    * Cluster NameNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
    * Project IDNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("OwnerProjectId")
    @Expose
    private String OwnerProjectId;

    /**
    * Project NameNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("OwnerProjectName")
    @Expose
    private String OwnerProjectName;

    /**
    * Belonging project identifier
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("OwnerProjectIdent")
    @Expose
    private String OwnerProjectIdent;

    /**
    * Authorized project
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("AuthorityProjectName")
    @Expose
    private String AuthorityProjectName;

    /**
    * Authorized user
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("AuthorityUserName")
    @Expose
    private String AuthorityUserName;

    /**
    * Edit permissions available
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Edit")
    @Expose
    private Boolean Edit;

    /**
    * Authorization permissions available
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Author")
    @Expose
    private Boolean Author;

    /**
    * Transfer permissions available
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Deliver")
    @Expose
    private Boolean Deliver;

    /**
    * Data source status
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("DataSourceStatus")
    @Expose
    private String DataSourceStatus;

    /**
    * TimeNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * Params JSON string
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("ParamsString")
    @Expose
    private String ParamsString;

    /**
    * BizParams JSON string
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("BizParamsString")
    @Expose
    private String BizParamsString;

    /**
    * Modification TimeNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("ModifiedTime")
    @Expose
    private Long ModifiedTime;

    /**
    * Data source display type, corresponding to Type
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("ShowType")
    @Expose
    private String ShowType;

    /**
    * Current data source production source Id
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("ProductId")
    @Expose
    private Long ProductId;

    /**
    * Current data source development source Id
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("DevelopmentId")
    @Expose
    private Long DevelopmentId;

    /**
    * Same as params, content is the data for the development data source
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("DevelopmentParams")
    @Expose
    private String DevelopmentParams;

    /**
     * Get If the data source list is bound to a database, then it is the database nameNote: This field may return null, indicating that no valid value can be obtained. 
     * @return DatabaseName If the data source list is bound to a database, then it is the database nameNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getDatabaseName() {
        return this.DatabaseName;
    }

    /**
     * Set If the data source list is bound to a database, then it is the database nameNote: This field may return null, indicating that no valid value can be obtained.
     * @param DatabaseName If the data source list is bound to a database, then it is the database nameNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setDatabaseName(String DatabaseName) {
        this.DatabaseName = DatabaseName;
    }

    /**
     * Get Data source description informationNote: This field may return null, indicating that no valid value can be obtained. 
     * @return Description Data source description informationNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Data source description informationNote: This field may return null, indicating that no valid value can be obtained.
     * @param Description Data source description informationNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Data Source ID
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return ID Data Source ID
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getID() {
        return this.ID;
    }

    /**
     * Set Data Source ID
Note: This field may return null, indicating that no valid value can be obtained.
     * @param ID Data Source ID
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setID(Long ID) {
        this.ID = ID;
    }

    /**
     * Get Instance ID of the data source engine, e.g., CDB Instance IDNote: This field may return null, indicating that no valid value can be obtained. 
     * @return Instance Instance ID of the data source engine, e.g., CDB Instance IDNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getInstance() {
        return this.Instance;
    }

    /**
     * Set Instance ID of the data source engine, e.g., CDB Instance IDNote: This field may return null, indicating that no valid value can be obtained.
     * @param Instance Instance ID of the data source engine, e.g., CDB Instance IDNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setInstance(String Instance) {
        this.Instance = Instance;
    }

    /**
     * Get Data Source Name, cannot be empty under the same SpaceNameNote: This field may return null, indicating that no valid value can be obtained. 
     * @return Name Data Source Name, cannot be empty under the same SpaceNameNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Data Source Name, cannot be empty under the same SpaceNameNote: This field may return null, indicating that no valid value can be obtained.
     * @param Name Data Source Name, cannot be empty under the same SpaceNameNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Region to which the data source engine belongs
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return Region Region to which the data source engine belongs
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set Region to which the data source engine belongs
Note: This field may return null, indicating that no valid value can be obtained.
     * @param Region Region to which the data source engine belongs
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get Data Source Type: enumerated valuesNote: This field may return null, indicating that no valid value can be obtained. 
     * @return Type Data Source Type: enumerated valuesNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Data Source Type: enumerated valuesNote: This field may return null, indicating that no valid value can be obtained.
     * @param Type Data Source Type: enumerated valuesNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Cluster ID to which the data source belongs
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return ClusterId Cluster ID to which the data source belongs
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set Cluster ID to which the data source belongs
Note: This field may return null, indicating that no valid value can be obtained.
     * @param ClusterId Cluster ID to which the data source belongs
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get Application ID AppId
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return AppId Application ID AppId
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set Application ID AppId
Note: This field may return null, indicating that no valid value can be obtained.
     * @param AppId Application ID AppId
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get Configuration Information Extension of Business Data SourceNote: This field may return null, indicating that no valid value can be obtained. 
     * @return BizParams Configuration Information Extension of Business Data SourceNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getBizParams() {
        return this.BizParams;
    }

    /**
     * Set Configuration Information Extension of Business Data SourceNote: This field may return null, indicating that no valid value can be obtained.
     * @param BizParams Configuration Information Extension of Business Data SourceNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setBizParams(String BizParams) {
        this.BizParams = BizParams;
    }

    /**
     * Get Data Source Category: Binding Engine, Binding DatabaseNote: This field may return null, indicating that no valid value can be obtained. 
     * @return Category Data Source Category: Binding Engine, Binding DatabaseNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getCategory() {
        return this.Category;
    }

    /**
     * Set Data Source Category: Binding Engine, Binding DatabaseNote: This field may return null, indicating that no valid value can be obtained.
     * @param Category Data Source Category: Binding Engine, Binding DatabaseNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setCategory(String Category) {
        this.Category = Category;
    }

    /**
     * Get Data Source Display Name, for visual inspectionNote: This field may return null, indicating that no valid value can be obtained. 
     * @return Display Data Source Display Name, for visual inspectionNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getDisplay() {
        return this.Display;
    }

    /**
     * Set Data Source Display Name, for visual inspectionNote: This field may return null, indicating that no valid value can be obtained.
     * @param Display Data Source Display Name, for visual inspectionNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setDisplay(String Display) {
        this.Display = Display;
    }

    /**
     * Get Data Source Responsible Person Account ID
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return OwnerAccount Data Source Responsible Person Account ID
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getOwnerAccount() {
        return this.OwnerAccount;
    }

    /**
     * Set Data Source Responsible Person Account ID
Note: This field may return null, indicating that no valid value can be obtained.
     * @param OwnerAccount Data Source Responsible Person Account ID
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setOwnerAccount(String OwnerAccount) {
        this.OwnerAccount = OwnerAccount;
    }

    /**
     * Get Data source configuration information, stored as JSON KV. The KV storage information varies according to the data source typeNote: This field may return null, indicating that no valid value can be obtained. 
     * @return Params Data source configuration information, stored as JSON KV. The KV storage information varies according to the data source typeNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getParams() {
        return this.Params;
    }

    /**
     * Set Data source configuration information, stored as JSON KV. The KV storage information varies according to the data source typeNote: This field may return null, indicating that no valid value can be obtained.
     * @param Params Data source configuration information, stored as JSON KV. The KV storage information varies according to the data source typeNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setParams(String Params) {
        this.Params = Params;
    }

    /**
     * Get Visibility of the data source, where 1 is visible and 0 is not visible. Default is 1Note: This field may return null, indicating that no valid value can be obtained. 
     * @return Status Visibility of the data source, where 1 is visible and 0 is not visible. Default is 1Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Visibility of the data source, where 1 is visible and 0 is not visible. Default is 1Note: This field may return null, indicating that no valid value can be obtained.
     * @param Status Visibility of the data source, where 1 is visible and 0 is not visible. Default is 1Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Data source owner account name
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return OwnerAccountName Data source owner account name
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getOwnerAccountName() {
        return this.OwnerAccountName;
    }

    /**
     * Set Data source owner account name
Note: This field may return null, indicating that no valid value can be obtained.
     * @param OwnerAccountName Data source owner account name
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setOwnerAccountName(String OwnerAccountName) {
        this.OwnerAccountName = OwnerAccountName;
    }

    /**
     * Get Cluster NameNote: This field may return null, indicating that no valid value can be obtained. 
     * @return ClusterName Cluster NameNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getClusterName() {
        return this.ClusterName;
    }

    /**
     * Set Cluster NameNote: This field may return null, indicating that no valid value can be obtained.
     * @param ClusterName Cluster NameNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setClusterName(String ClusterName) {
        this.ClusterName = ClusterName;
    }

    /**
     * Get Project IDNote: This field may return null, indicating that no valid value can be obtained. 
     * @return OwnerProjectId Project IDNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getOwnerProjectId() {
        return this.OwnerProjectId;
    }

    /**
     * Set Project IDNote: This field may return null, indicating that no valid value can be obtained.
     * @param OwnerProjectId Project IDNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setOwnerProjectId(String OwnerProjectId) {
        this.OwnerProjectId = OwnerProjectId;
    }

    /**
     * Get Project NameNote: This field may return null, indicating that no valid value can be obtained. 
     * @return OwnerProjectName Project NameNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getOwnerProjectName() {
        return this.OwnerProjectName;
    }

    /**
     * Set Project NameNote: This field may return null, indicating that no valid value can be obtained.
     * @param OwnerProjectName Project NameNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setOwnerProjectName(String OwnerProjectName) {
        this.OwnerProjectName = OwnerProjectName;
    }

    /**
     * Get Belonging project identifier
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return OwnerProjectIdent Belonging project identifier
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getOwnerProjectIdent() {
        return this.OwnerProjectIdent;
    }

    /**
     * Set Belonging project identifier
Note: This field may return null, indicating that no valid value can be obtained.
     * @param OwnerProjectIdent Belonging project identifier
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setOwnerProjectIdent(String OwnerProjectIdent) {
        this.OwnerProjectIdent = OwnerProjectIdent;
    }

    /**
     * Get Authorized project
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return AuthorityProjectName Authorized project
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getAuthorityProjectName() {
        return this.AuthorityProjectName;
    }

    /**
     * Set Authorized project
Note: This field may return null, indicating that no valid value can be obtained.
     * @param AuthorityProjectName Authorized project
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setAuthorityProjectName(String AuthorityProjectName) {
        this.AuthorityProjectName = AuthorityProjectName;
    }

    /**
     * Get Authorized user
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return AuthorityUserName Authorized user
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getAuthorityUserName() {
        return this.AuthorityUserName;
    }

    /**
     * Set Authorized user
Note: This field may return null, indicating that no valid value can be obtained.
     * @param AuthorityUserName Authorized user
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setAuthorityUserName(String AuthorityUserName) {
        this.AuthorityUserName = AuthorityUserName;
    }

    /**
     * Get Edit permissions available
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return Edit Edit permissions available
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Boolean getEdit() {
        return this.Edit;
    }

    /**
     * Set Edit permissions available
Note: This field may return null, indicating that no valid value can be obtained.
     * @param Edit Edit permissions available
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setEdit(Boolean Edit) {
        this.Edit = Edit;
    }

    /**
     * Get Authorization permissions available
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return Author Authorization permissions available
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Boolean getAuthor() {
        return this.Author;
    }

    /**
     * Set Authorization permissions available
Note: This field may return null, indicating that no valid value can be obtained.
     * @param Author Authorization permissions available
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setAuthor(Boolean Author) {
        this.Author = Author;
    }

    /**
     * Get Transfer permissions available
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return Deliver Transfer permissions available
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Boolean getDeliver() {
        return this.Deliver;
    }

    /**
     * Set Transfer permissions available
Note: This field may return null, indicating that no valid value can be obtained.
     * @param Deliver Transfer permissions available
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setDeliver(Boolean Deliver) {
        this.Deliver = Deliver;
    }

    /**
     * Get Data source status
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return DataSourceStatus Data source status
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getDataSourceStatus() {
        return this.DataSourceStatus;
    }

    /**
     * Set Data source status
Note: This field may return null, indicating that no valid value can be obtained.
     * @param DataSourceStatus Data source status
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setDataSourceStatus(String DataSourceStatus) {
        this.DataSourceStatus = DataSourceStatus;
    }

    /**
     * Get TimeNote: This field may return null, indicating that no valid value can be obtained. 
     * @return CreateTime TimeNote: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set TimeNote: This field may return null, indicating that no valid value can be obtained.
     * @param CreateTime TimeNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Params JSON string
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return ParamsString Params JSON string
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getParamsString() {
        return this.ParamsString;
    }

    /**
     * Set Params JSON string
Note: This field may return null, indicating that no valid value can be obtained.
     * @param ParamsString Params JSON string
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setParamsString(String ParamsString) {
        this.ParamsString = ParamsString;
    }

    /**
     * Get BizParams JSON string
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return BizParamsString BizParams JSON string
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getBizParamsString() {
        return this.BizParamsString;
    }

    /**
     * Set BizParams JSON string
Note: This field may return null, indicating that no valid value can be obtained.
     * @param BizParamsString BizParams JSON string
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setBizParamsString(String BizParamsString) {
        this.BizParamsString = BizParamsString;
    }

    /**
     * Get Modification TimeNote: This field may return null, indicating that no valid value can be obtained. 
     * @return ModifiedTime Modification TimeNote: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getModifiedTime() {
        return this.ModifiedTime;
    }

    /**
     * Set Modification TimeNote: This field may return null, indicating that no valid value can be obtained.
     * @param ModifiedTime Modification TimeNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setModifiedTime(Long ModifiedTime) {
        this.ModifiedTime = ModifiedTime;
    }

    /**
     * Get Data source display type, corresponding to Type
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return ShowType Data source display type, corresponding to Type
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getShowType() {
        return this.ShowType;
    }

    /**
     * Set Data source display type, corresponding to Type
Note: This field may return null, indicating that no valid value can be obtained.
     * @param ShowType Data source display type, corresponding to Type
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setShowType(String ShowType) {
        this.ShowType = ShowType;
    }

    /**
     * Get Current data source production source Id
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return ProductId Current data source production source Id
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getProductId() {
        return this.ProductId;
    }

    /**
     * Set Current data source production source Id
Note: This field may return null, indicating that no valid value can be obtained.
     * @param ProductId Current data source production source Id
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setProductId(Long ProductId) {
        this.ProductId = ProductId;
    }

    /**
     * Get Current data source development source Id
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return DevelopmentId Current data source development source Id
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getDevelopmentId() {
        return this.DevelopmentId;
    }

    /**
     * Set Current data source development source Id
Note: This field may return null, indicating that no valid value can be obtained.
     * @param DevelopmentId Current data source development source Id
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setDevelopmentId(Long DevelopmentId) {
        this.DevelopmentId = DevelopmentId;
    }

    /**
     * Get Same as params, content is the data for the development data source
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return DevelopmentParams Same as params, content is the data for the development data source
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getDevelopmentParams() {
        return this.DevelopmentParams;
    }

    /**
     * Set Same as params, content is the data for the development data source
Note: This field may return null, indicating that no valid value can be obtained.
     * @param DevelopmentParams Same as params, content is the data for the development data source
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setDevelopmentParams(String DevelopmentParams) {
        this.DevelopmentParams = DevelopmentParams;
    }

    public DataSourceInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DataSourceInfo(DataSourceInfo source) {
        if (source.DatabaseName != null) {
            this.DatabaseName = new String(source.DatabaseName);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.ID != null) {
            this.ID = new Long(source.ID);
        }
        if (source.Instance != null) {
            this.Instance = new String(source.Instance);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.BizParams != null) {
            this.BizParams = new String(source.BizParams);
        }
        if (source.Category != null) {
            this.Category = new String(source.Category);
        }
        if (source.Display != null) {
            this.Display = new String(source.Display);
        }
        if (source.OwnerAccount != null) {
            this.OwnerAccount = new String(source.OwnerAccount);
        }
        if (source.Params != null) {
            this.Params = new String(source.Params);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.OwnerAccountName != null) {
            this.OwnerAccountName = new String(source.OwnerAccountName);
        }
        if (source.ClusterName != null) {
            this.ClusterName = new String(source.ClusterName);
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
        if (source.AuthorityProjectName != null) {
            this.AuthorityProjectName = new String(source.AuthorityProjectName);
        }
        if (source.AuthorityUserName != null) {
            this.AuthorityUserName = new String(source.AuthorityUserName);
        }
        if (source.Edit != null) {
            this.Edit = new Boolean(source.Edit);
        }
        if (source.Author != null) {
            this.Author = new Boolean(source.Author);
        }
        if (source.Deliver != null) {
            this.Deliver = new Boolean(source.Deliver);
        }
        if (source.DataSourceStatus != null) {
            this.DataSourceStatus = new String(source.DataSourceStatus);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
        if (source.ParamsString != null) {
            this.ParamsString = new String(source.ParamsString);
        }
        if (source.BizParamsString != null) {
            this.BizParamsString = new String(source.BizParamsString);
        }
        if (source.ModifiedTime != null) {
            this.ModifiedTime = new Long(source.ModifiedTime);
        }
        if (source.ShowType != null) {
            this.ShowType = new String(source.ShowType);
        }
        if (source.ProductId != null) {
            this.ProductId = new Long(source.ProductId);
        }
        if (source.DevelopmentId != null) {
            this.DevelopmentId = new Long(source.DevelopmentId);
        }
        if (source.DevelopmentParams != null) {
            this.DevelopmentParams = new String(source.DevelopmentParams);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DatabaseName", this.DatabaseName);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamSimple(map, prefix + "Instance", this.Instance);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "BizParams", this.BizParams);
        this.setParamSimple(map, prefix + "Category", this.Category);
        this.setParamSimple(map, prefix + "Display", this.Display);
        this.setParamSimple(map, prefix + "OwnerAccount", this.OwnerAccount);
        this.setParamSimple(map, prefix + "Params", this.Params);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "OwnerAccountName", this.OwnerAccountName);
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);
        this.setParamSimple(map, prefix + "OwnerProjectId", this.OwnerProjectId);
        this.setParamSimple(map, prefix + "OwnerProjectName", this.OwnerProjectName);
        this.setParamSimple(map, prefix + "OwnerProjectIdent", this.OwnerProjectIdent);
        this.setParamSimple(map, prefix + "AuthorityProjectName", this.AuthorityProjectName);
        this.setParamSimple(map, prefix + "AuthorityUserName", this.AuthorityUserName);
        this.setParamSimple(map, prefix + "Edit", this.Edit);
        this.setParamSimple(map, prefix + "Author", this.Author);
        this.setParamSimple(map, prefix + "Deliver", this.Deliver);
        this.setParamSimple(map, prefix + "DataSourceStatus", this.DataSourceStatus);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ParamsString", this.ParamsString);
        this.setParamSimple(map, prefix + "BizParamsString", this.BizParamsString);
        this.setParamSimple(map, prefix + "ModifiedTime", this.ModifiedTime);
        this.setParamSimple(map, prefix + "ShowType", this.ShowType);
        this.setParamSimple(map, prefix + "ProductId", this.ProductId);
        this.setParamSimple(map, prefix + "DevelopmentId", this.DevelopmentId);
        this.setParamSimple(map, prefix + "DevelopmentParams", this.DevelopmentParams);

    }
}

