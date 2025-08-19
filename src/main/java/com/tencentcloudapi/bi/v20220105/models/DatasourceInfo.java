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
package com.tencentcloudapi.bi.v20220105.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DatasourceInfo extends AbstractModel {

    /**
    * Database ID.
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * Database name.
    */
    @SerializedName("DbName")
    @Expose
    private String DbName;

    /**
    * Domain type. Valid values: 1: Tencent Cloud; 2: local.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ServiceType")
    @Expose
    private String ServiceType;

    /**
    * Database alias.
    */
    @SerializedName("SourceName")
    @Expose
    private String SourceName;

    /**
    * Database driver.
    */
    @SerializedName("DbType")
    @Expose
    private String DbType;

    /**
    * HOST
    */
    @SerializedName("DbHost")
    @Expose
    private String DbHost;

    /**
    * Port.
    */
    @SerializedName("DbPort")
    @Expose
    private Long DbPort;

    /**
    * Username.
    */
    @SerializedName("DbUser")
    @Expose
    private String DbUser;

    /**
    * Database encoding.
    */
    @SerializedName("Charset")
    @Expose
    private String Charset;

    /**
    * Creation time.

    */
    @SerializedName("CreatedAt")
    @Expose
    private String CreatedAt;

    /**
    * Modification time.
    */
    @SerializedName("UpdatedAt")
    @Expose
    private String UpdatedAt;

    /**
    * Creator.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CreatedUser")
    @Expose
    private String CreatedUser;

    /**
    * Catalog value.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Catalog")
    @Expose
    private String Catalog;

    /**
    * Connection type.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ConnectType")
    @Expose
    private String ConnectType;

    /**
    * Project ID.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * Data source description.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Desc")
    @Expose
    private String Desc;

    /**
    * Data source status.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Source platform.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SourcePlat")
    @Expose
    private String SourcePlat;

    /**
    * Extension parameter.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ExtraParam")
    @Expose
    private String ExtraParam;

    /**
    * Additional information.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AddInfo")
    @Expose
    private String AddInfo;

    /**
    * Project name.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ProjectName")
    @Expose
    private String ProjectName;

    /**
    * Engine type.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("EngineType")
    @Expose
    private String EngineType;

    /**
    * Data source owner.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Manager")
    @Expose
    private String Manager;

    /**
    * Operation personnel allowlist.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("OperatorWhitelist")
    @Expose
    private String OperatorWhitelist;

    /**
    * VPC information of the data source.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * uniqVpc information of the data source.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UniqVpcId")
    @Expose
    private String UniqVpcId;

    /**
    * Data source region information.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RegionId")
    @Expose
    private String RegionId;

    /**
    * Operation attributes.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("StateAction")
    @Expose
    private BaseStateAction StateAction;

    /**
    * Updater.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UpdatedUser")
    @Expose
    private String UpdatedUser;

    /**
    * Permission list.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PermissionList")
    @Expose
    private PermissionGroup [] PermissionList;

    /**
    * Permission value list.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AuthList")
    @Expose
    private String [] AuthList;

    /**
    * Third-party data source identifier.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DataOrigin")
    @Expose
    private String DataOrigin;

    /**
    * Third-party project ID.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DataOriginProjectId")
    @Expose
    private String DataOriginProjectId;

    /**
    * Third-party data source ID.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DataOriginDatasourceId")
    @Expose
    private String DataOriginDatasourceId;

    /**
    * Cluster ID.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * Data source name.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DbTypeName")
    @Expose
    private String DbTypeName;

    /**
    * Enable VPC.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UseVPC")
    @Expose
    private Boolean UseVPC;

    /**
    * Associated person ID.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Owner")
    @Expose
    private String Owner;

    /**
    * Associated person name.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("OwnerName")
    @Expose
    private String OwnerName;

    /**
     * Get Database ID. 
     * @return Id Database ID.
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set Database ID.
     * @param Id Database ID.
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get Database name. 
     * @return DbName Database name.
     */
    public String getDbName() {
        return this.DbName;
    }

    /**
     * Set Database name.
     * @param DbName Database name.
     */
    public void setDbName(String DbName) {
        this.DbName = DbName;
    }

    /**
     * Get Domain type. Valid values: 1: Tencent Cloud; 2: local.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ServiceType Domain type. Valid values: 1: Tencent Cloud; 2: local.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getServiceType() {
        return this.ServiceType;
    }

    /**
     * Set Domain type. Valid values: 1: Tencent Cloud; 2: local.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ServiceType Domain type. Valid values: 1: Tencent Cloud; 2: local.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setServiceType(String ServiceType) {
        this.ServiceType = ServiceType;
    }

    /**
     * Get Database alias. 
     * @return SourceName Database alias.
     */
    public String getSourceName() {
        return this.SourceName;
    }

    /**
     * Set Database alias.
     * @param SourceName Database alias.
     */
    public void setSourceName(String SourceName) {
        this.SourceName = SourceName;
    }

    /**
     * Get Database driver. 
     * @return DbType Database driver.
     */
    public String getDbType() {
        return this.DbType;
    }

    /**
     * Set Database driver.
     * @param DbType Database driver.
     */
    public void setDbType(String DbType) {
        this.DbType = DbType;
    }

    /**
     * Get HOST 
     * @return DbHost HOST
     */
    public String getDbHost() {
        return this.DbHost;
    }

    /**
     * Set HOST
     * @param DbHost HOST
     */
    public void setDbHost(String DbHost) {
        this.DbHost = DbHost;
    }

    /**
     * Get Port. 
     * @return DbPort Port.
     */
    public Long getDbPort() {
        return this.DbPort;
    }

    /**
     * Set Port.
     * @param DbPort Port.
     */
    public void setDbPort(Long DbPort) {
        this.DbPort = DbPort;
    }

    /**
     * Get Username. 
     * @return DbUser Username.
     */
    public String getDbUser() {
        return this.DbUser;
    }

    /**
     * Set Username.
     * @param DbUser Username.
     */
    public void setDbUser(String DbUser) {
        this.DbUser = DbUser;
    }

    /**
     * Get Database encoding. 
     * @return Charset Database encoding.
     */
    public String getCharset() {
        return this.Charset;
    }

    /**
     * Set Database encoding.
     * @param Charset Database encoding.
     */
    public void setCharset(String Charset) {
        this.Charset = Charset;
    }

    /**
     * Get Creation time.
 
     * @return CreatedAt Creation time.

     */
    public String getCreatedAt() {
        return this.CreatedAt;
    }

    /**
     * Set Creation time.

     * @param CreatedAt Creation time.

     */
    public void setCreatedAt(String CreatedAt) {
        this.CreatedAt = CreatedAt;
    }

    /**
     * Get Modification time. 
     * @return UpdatedAt Modification time.
     */
    public String getUpdatedAt() {
        return this.UpdatedAt;
    }

    /**
     * Set Modification time.
     * @param UpdatedAt Modification time.
     */
    public void setUpdatedAt(String UpdatedAt) {
        this.UpdatedAt = UpdatedAt;
    }

    /**
     * Get Creator.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CreatedUser Creator.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCreatedUser() {
        return this.CreatedUser;
    }

    /**
     * Set Creator.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CreatedUser Creator.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCreatedUser(String CreatedUser) {
        this.CreatedUser = CreatedUser;
    }

    /**
     * Get Catalog value.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Catalog Catalog value.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCatalog() {
        return this.Catalog;
    }

    /**
     * Set Catalog value.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Catalog Catalog value.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCatalog(String Catalog) {
        this.Catalog = Catalog;
    }

    /**
     * Get Connection type.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ConnectType Connection type.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getConnectType() {
        return this.ConnectType;
    }

    /**
     * Set Connection type.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ConnectType Connection type.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setConnectType(String ConnectType) {
        this.ConnectType = ConnectType;
    }

    /**
     * Get Project ID.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ProjectId Project ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Project ID.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ProjectId Project ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get Data source description.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Desc Data source description.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDesc() {
        return this.Desc;
    }

    /**
     * Set Data source description.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Desc Data source description.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDesc(String Desc) {
        this.Desc = Desc;
    }

    /**
     * Get Data source status.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Status Data source status.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Data source status.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Status Data source status.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Source platform.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SourcePlat Source platform.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getSourcePlat() {
        return this.SourcePlat;
    }

    /**
     * Set Source platform.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SourcePlat Source platform.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSourcePlat(String SourcePlat) {
        this.SourcePlat = SourcePlat;
    }

    /**
     * Get Extension parameter.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ExtraParam Extension parameter.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getExtraParam() {
        return this.ExtraParam;
    }

    /**
     * Set Extension parameter.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ExtraParam Extension parameter.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setExtraParam(String ExtraParam) {
        this.ExtraParam = ExtraParam;
    }

    /**
     * Get Additional information.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AddInfo Additional information.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getAddInfo() {
        return this.AddInfo;
    }

    /**
     * Set Additional information.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AddInfo Additional information.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAddInfo(String AddInfo) {
        this.AddInfo = AddInfo;
    }

    /**
     * Get Project name.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ProjectName Project name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getProjectName() {
        return this.ProjectName;
    }

    /**
     * Set Project name.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ProjectName Project name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setProjectName(String ProjectName) {
        this.ProjectName = ProjectName;
    }

    /**
     * Get Engine type.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return EngineType Engine type.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getEngineType() {
        return this.EngineType;
    }

    /**
     * Set Engine type.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param EngineType Engine type.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setEngineType(String EngineType) {
        this.EngineType = EngineType;
    }

    /**
     * Get Data source owner.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Manager Data source owner.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getManager() {
        return this.Manager;
    }

    /**
     * Set Data source owner.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Manager Data source owner.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setManager(String Manager) {
        this.Manager = Manager;
    }

    /**
     * Get Operation personnel allowlist.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return OperatorWhitelist Operation personnel allowlist.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getOperatorWhitelist() {
        return this.OperatorWhitelist;
    }

    /**
     * Set Operation personnel allowlist.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param OperatorWhitelist Operation personnel allowlist.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setOperatorWhitelist(String OperatorWhitelist) {
        this.OperatorWhitelist = OperatorWhitelist;
    }

    /**
     * Get VPC information of the data source.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return VpcId VPC information of the data source.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set VPC information of the data source.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param VpcId VPC information of the data source.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get uniqVpc information of the data source.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return UniqVpcId uniqVpc information of the data source.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getUniqVpcId() {
        return this.UniqVpcId;
    }

    /**
     * Set uniqVpc information of the data source.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param UniqVpcId uniqVpc information of the data source.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUniqVpcId(String UniqVpcId) {
        this.UniqVpcId = UniqVpcId;
    }

    /**
     * Get Data source region information.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RegionId Data source region information.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getRegionId() {
        return this.RegionId;
    }

    /**
     * Set Data source region information.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RegionId Data source region information.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRegionId(String RegionId) {
        this.RegionId = RegionId;
    }

    /**
     * Get Operation attributes.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return StateAction Operation attributes.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public BaseStateAction getStateAction() {
        return this.StateAction;
    }

    /**
     * Set Operation attributes.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param StateAction Operation attributes.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStateAction(BaseStateAction StateAction) {
        this.StateAction = StateAction;
    }

    /**
     * Get Updater.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return UpdatedUser Updater.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getUpdatedUser() {
        return this.UpdatedUser;
    }

    /**
     * Set Updater.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param UpdatedUser Updater.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUpdatedUser(String UpdatedUser) {
        this.UpdatedUser = UpdatedUser;
    }

    /**
     * Get Permission list.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PermissionList Permission list.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public PermissionGroup [] getPermissionList() {
        return this.PermissionList;
    }

    /**
     * Set Permission list.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param PermissionList Permission list.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPermissionList(PermissionGroup [] PermissionList) {
        this.PermissionList = PermissionList;
    }

    /**
     * Get Permission value list.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AuthList Permission value list.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getAuthList() {
        return this.AuthList;
    }

    /**
     * Set Permission value list.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AuthList Permission value list.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAuthList(String [] AuthList) {
        this.AuthList = AuthList;
    }

    /**
     * Get Third-party data source identifier.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DataOrigin Third-party data source identifier.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDataOrigin() {
        return this.DataOrigin;
    }

    /**
     * Set Third-party data source identifier.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DataOrigin Third-party data source identifier.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDataOrigin(String DataOrigin) {
        this.DataOrigin = DataOrigin;
    }

    /**
     * Get Third-party project ID.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DataOriginProjectId Third-party project ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDataOriginProjectId() {
        return this.DataOriginProjectId;
    }

    /**
     * Set Third-party project ID.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DataOriginProjectId Third-party project ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDataOriginProjectId(String DataOriginProjectId) {
        this.DataOriginProjectId = DataOriginProjectId;
    }

    /**
     * Get Third-party data source ID.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DataOriginDatasourceId Third-party data source ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDataOriginDatasourceId() {
        return this.DataOriginDatasourceId;
    }

    /**
     * Set Third-party data source ID.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DataOriginDatasourceId Third-party data source ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDataOriginDatasourceId(String DataOriginDatasourceId) {
        this.DataOriginDatasourceId = DataOriginDatasourceId;
    }

    /**
     * Get Cluster ID.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ClusterId Cluster ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set Cluster ID.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ClusterId Cluster ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get Data source name.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DbTypeName Data source name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDbTypeName() {
        return this.DbTypeName;
    }

    /**
     * Set Data source name.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DbTypeName Data source name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDbTypeName(String DbTypeName) {
        this.DbTypeName = DbTypeName;
    }

    /**
     * Get Enable VPC.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return UseVPC Enable VPC.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getUseVPC() {
        return this.UseVPC;
    }

    /**
     * Set Enable VPC.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param UseVPC Enable VPC.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUseVPC(Boolean UseVPC) {
        this.UseVPC = UseVPC;
    }

    /**
     * Get Associated person ID.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Owner Associated person ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getOwner() {
        return this.Owner;
    }

    /**
     * Set Associated person ID.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Owner Associated person ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setOwner(String Owner) {
        this.Owner = Owner;
    }

    /**
     * Get Associated person name.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return OwnerName Associated person name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getOwnerName() {
        return this.OwnerName;
    }

    /**
     * Set Associated person name.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param OwnerName Associated person name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setOwnerName(String OwnerName) {
        this.OwnerName = OwnerName;
    }

    public DatasourceInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DatasourceInfo(DatasourceInfo source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.DbName != null) {
            this.DbName = new String(source.DbName);
        }
        if (source.ServiceType != null) {
            this.ServiceType = new String(source.ServiceType);
        }
        if (source.SourceName != null) {
            this.SourceName = new String(source.SourceName);
        }
        if (source.DbType != null) {
            this.DbType = new String(source.DbType);
        }
        if (source.DbHost != null) {
            this.DbHost = new String(source.DbHost);
        }
        if (source.DbPort != null) {
            this.DbPort = new Long(source.DbPort);
        }
        if (source.DbUser != null) {
            this.DbUser = new String(source.DbUser);
        }
        if (source.Charset != null) {
            this.Charset = new String(source.Charset);
        }
        if (source.CreatedAt != null) {
            this.CreatedAt = new String(source.CreatedAt);
        }
        if (source.UpdatedAt != null) {
            this.UpdatedAt = new String(source.UpdatedAt);
        }
        if (source.CreatedUser != null) {
            this.CreatedUser = new String(source.CreatedUser);
        }
        if (source.Catalog != null) {
            this.Catalog = new String(source.Catalog);
        }
        if (source.ConnectType != null) {
            this.ConnectType = new String(source.ConnectType);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.Desc != null) {
            this.Desc = new String(source.Desc);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.SourcePlat != null) {
            this.SourcePlat = new String(source.SourcePlat);
        }
        if (source.ExtraParam != null) {
            this.ExtraParam = new String(source.ExtraParam);
        }
        if (source.AddInfo != null) {
            this.AddInfo = new String(source.AddInfo);
        }
        if (source.ProjectName != null) {
            this.ProjectName = new String(source.ProjectName);
        }
        if (source.EngineType != null) {
            this.EngineType = new String(source.EngineType);
        }
        if (source.Manager != null) {
            this.Manager = new String(source.Manager);
        }
        if (source.OperatorWhitelist != null) {
            this.OperatorWhitelist = new String(source.OperatorWhitelist);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.UniqVpcId != null) {
            this.UniqVpcId = new String(source.UniqVpcId);
        }
        if (source.RegionId != null) {
            this.RegionId = new String(source.RegionId);
        }
        if (source.StateAction != null) {
            this.StateAction = new BaseStateAction(source.StateAction);
        }
        if (source.UpdatedUser != null) {
            this.UpdatedUser = new String(source.UpdatedUser);
        }
        if (source.PermissionList != null) {
            this.PermissionList = new PermissionGroup[source.PermissionList.length];
            for (int i = 0; i < source.PermissionList.length; i++) {
                this.PermissionList[i] = new PermissionGroup(source.PermissionList[i]);
            }
        }
        if (source.AuthList != null) {
            this.AuthList = new String[source.AuthList.length];
            for (int i = 0; i < source.AuthList.length; i++) {
                this.AuthList[i] = new String(source.AuthList[i]);
            }
        }
        if (source.DataOrigin != null) {
            this.DataOrigin = new String(source.DataOrigin);
        }
        if (source.DataOriginProjectId != null) {
            this.DataOriginProjectId = new String(source.DataOriginProjectId);
        }
        if (source.DataOriginDatasourceId != null) {
            this.DataOriginDatasourceId = new String(source.DataOriginDatasourceId);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.DbTypeName != null) {
            this.DbTypeName = new String(source.DbTypeName);
        }
        if (source.UseVPC != null) {
            this.UseVPC = new Boolean(source.UseVPC);
        }
        if (source.Owner != null) {
            this.Owner = new String(source.Owner);
        }
        if (source.OwnerName != null) {
            this.OwnerName = new String(source.OwnerName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "DbName", this.DbName);
        this.setParamSimple(map, prefix + "ServiceType", this.ServiceType);
        this.setParamSimple(map, prefix + "SourceName", this.SourceName);
        this.setParamSimple(map, prefix + "DbType", this.DbType);
        this.setParamSimple(map, prefix + "DbHost", this.DbHost);
        this.setParamSimple(map, prefix + "DbPort", this.DbPort);
        this.setParamSimple(map, prefix + "DbUser", this.DbUser);
        this.setParamSimple(map, prefix + "Charset", this.Charset);
        this.setParamSimple(map, prefix + "CreatedAt", this.CreatedAt);
        this.setParamSimple(map, prefix + "UpdatedAt", this.UpdatedAt);
        this.setParamSimple(map, prefix + "CreatedUser", this.CreatedUser);
        this.setParamSimple(map, prefix + "Catalog", this.Catalog);
        this.setParamSimple(map, prefix + "ConnectType", this.ConnectType);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "Desc", this.Desc);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "SourcePlat", this.SourcePlat);
        this.setParamSimple(map, prefix + "ExtraParam", this.ExtraParam);
        this.setParamSimple(map, prefix + "AddInfo", this.AddInfo);
        this.setParamSimple(map, prefix + "ProjectName", this.ProjectName);
        this.setParamSimple(map, prefix + "EngineType", this.EngineType);
        this.setParamSimple(map, prefix + "Manager", this.Manager);
        this.setParamSimple(map, prefix + "OperatorWhitelist", this.OperatorWhitelist);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "UniqVpcId", this.UniqVpcId);
        this.setParamSimple(map, prefix + "RegionId", this.RegionId);
        this.setParamObj(map, prefix + "StateAction.", this.StateAction);
        this.setParamSimple(map, prefix + "UpdatedUser", this.UpdatedUser);
        this.setParamArrayObj(map, prefix + "PermissionList.", this.PermissionList);
        this.setParamArraySimple(map, prefix + "AuthList.", this.AuthList);
        this.setParamSimple(map, prefix + "DataOrigin", this.DataOrigin);
        this.setParamSimple(map, prefix + "DataOriginProjectId", this.DataOriginProjectId);
        this.setParamSimple(map, prefix + "DataOriginDatasourceId", this.DataOriginDatasourceId);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "DbTypeName", this.DbTypeName);
        this.setParamSimple(map, prefix + "UseVPC", this.UseVPC);
        this.setParamSimple(map, prefix + "Owner", this.Owner);
        this.setParamSimple(map, prefix + "OwnerName", this.OwnerName);

    }
}

