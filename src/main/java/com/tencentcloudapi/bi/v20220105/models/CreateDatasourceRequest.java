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

public class CreateDatasourceRequest extends AbstractModel {

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
    * The backend provides dictionaries: domain type. 1. Tencent Cloud, 2. local.
    */
    @SerializedName("ServiceType")
    @Expose
    private String ServiceType;

    /**
    * Drive.
    */
    @SerializedName("DbType")
    @Expose
    private String DbType;

    /**
    * Database encoding.
    */
    @SerializedName("Charset")
    @Expose
    private String Charset;

    /**
    * Username.
    */
    @SerializedName("DbUser")
    @Expose
    private String DbUser;

    /**
    * Password.
    */
    @SerializedName("DbPwd")
    @Expose
    private String DbPwd;

    /**
    * Database name.
    */
    @SerializedName("DbName")
    @Expose
    private String DbName;

    /**
    * Database alias.
    */
    @SerializedName("SourceName")
    @Expose
    private String SourceName;

    /**
    * Project ID.
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * Catalog value.
    */
    @SerializedName("Catalog")
    @Expose
    private String Catalog;

    /**
    * Third-party data source identifier.
    */
    @SerializedName("DataOrigin")
    @Expose
    private String DataOrigin;

    /**
    * Third-party project ID.
    */
    @SerializedName("DataOriginProjectId")
    @Expose
    private String DataOriginProjectId;

    /**
    * Third-party data source ID.
    */
    @SerializedName("DataOriginDatasourceId")
    @Expose
    private String DataOriginDatasourceId;

    /**
    * Extension parameter.
    */
    @SerializedName("ExtraParam")
    @Expose
    private String ExtraParam;

    /**
    * Unified identifier of the Tencent Cloud VPC.
    */
    @SerializedName("UniqVpcId")
    @Expose
    private String UniqVpcId;

    /**
    * VPC IP address.
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
    * VPC port.
    */
    @SerializedName("Vport")
    @Expose
    private String Vport;

    /**
    * Tencent Cloud VPC identifier.
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * Operation permission limitation.
    */
    @SerializedName("OperationAuthLimit")
    @Expose
    private String [] OperationAuthLimit;

    /**
    * Enables VPC.
    */
    @SerializedName("UseVPC")
    @Expose
    private Boolean UseVPC;

    /**
    * Region.
    */
    @SerializedName("RegionId")
    @Expose
    private String RegionId;

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
     * Get The backend provides dictionaries: domain type. 1. Tencent Cloud, 2. local. 
     * @return ServiceType The backend provides dictionaries: domain type. 1. Tencent Cloud, 2. local.
     */
    public String getServiceType() {
        return this.ServiceType;
    }

    /**
     * Set The backend provides dictionaries: domain type. 1. Tencent Cloud, 2. local.
     * @param ServiceType The backend provides dictionaries: domain type. 1. Tencent Cloud, 2. local.
     */
    public void setServiceType(String ServiceType) {
        this.ServiceType = ServiceType;
    }

    /**
     * Get Drive. 
     * @return DbType Drive.
     */
    public String getDbType() {
        return this.DbType;
    }

    /**
     * Set Drive.
     * @param DbType Drive.
     */
    public void setDbType(String DbType) {
        this.DbType = DbType;
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
     * Get Password. 
     * @return DbPwd Password.
     */
    public String getDbPwd() {
        return this.DbPwd;
    }

    /**
     * Set Password.
     * @param DbPwd Password.
     */
    public void setDbPwd(String DbPwd) {
        this.DbPwd = DbPwd;
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
     * Get Project ID. 
     * @return ProjectId Project ID.
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Project ID.
     * @param ProjectId Project ID.
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get Catalog value. 
     * @return Catalog Catalog value.
     */
    public String getCatalog() {
        return this.Catalog;
    }

    /**
     * Set Catalog value.
     * @param Catalog Catalog value.
     */
    public void setCatalog(String Catalog) {
        this.Catalog = Catalog;
    }

    /**
     * Get Third-party data source identifier. 
     * @return DataOrigin Third-party data source identifier.
     */
    public String getDataOrigin() {
        return this.DataOrigin;
    }

    /**
     * Set Third-party data source identifier.
     * @param DataOrigin Third-party data source identifier.
     */
    public void setDataOrigin(String DataOrigin) {
        this.DataOrigin = DataOrigin;
    }

    /**
     * Get Third-party project ID. 
     * @return DataOriginProjectId Third-party project ID.
     */
    public String getDataOriginProjectId() {
        return this.DataOriginProjectId;
    }

    /**
     * Set Third-party project ID.
     * @param DataOriginProjectId Third-party project ID.
     */
    public void setDataOriginProjectId(String DataOriginProjectId) {
        this.DataOriginProjectId = DataOriginProjectId;
    }

    /**
     * Get Third-party data source ID. 
     * @return DataOriginDatasourceId Third-party data source ID.
     */
    public String getDataOriginDatasourceId() {
        return this.DataOriginDatasourceId;
    }

    /**
     * Set Third-party data source ID.
     * @param DataOriginDatasourceId Third-party data source ID.
     */
    public void setDataOriginDatasourceId(String DataOriginDatasourceId) {
        this.DataOriginDatasourceId = DataOriginDatasourceId;
    }

    /**
     * Get Extension parameter. 
     * @return ExtraParam Extension parameter.
     */
    public String getExtraParam() {
        return this.ExtraParam;
    }

    /**
     * Set Extension parameter.
     * @param ExtraParam Extension parameter.
     */
    public void setExtraParam(String ExtraParam) {
        this.ExtraParam = ExtraParam;
    }

    /**
     * Get Unified identifier of the Tencent Cloud VPC. 
     * @return UniqVpcId Unified identifier of the Tencent Cloud VPC.
     */
    public String getUniqVpcId() {
        return this.UniqVpcId;
    }

    /**
     * Set Unified identifier of the Tencent Cloud VPC.
     * @param UniqVpcId Unified identifier of the Tencent Cloud VPC.
     */
    public void setUniqVpcId(String UniqVpcId) {
        this.UniqVpcId = UniqVpcId;
    }

    /**
     * Get VPC IP address. 
     * @return Vip VPC IP address.
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set VPC IP address.
     * @param Vip VPC IP address.
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    /**
     * Get VPC port. 
     * @return Vport VPC port.
     */
    public String getVport() {
        return this.Vport;
    }

    /**
     * Set VPC port.
     * @param Vport VPC port.
     */
    public void setVport(String Vport) {
        this.Vport = Vport;
    }

    /**
     * Get Tencent Cloud VPC identifier. 
     * @return VpcId Tencent Cloud VPC identifier.
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set Tencent Cloud VPC identifier.
     * @param VpcId Tencent Cloud VPC identifier.
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get Operation permission limitation. 
     * @return OperationAuthLimit Operation permission limitation.
     */
    public String [] getOperationAuthLimit() {
        return this.OperationAuthLimit;
    }

    /**
     * Set Operation permission limitation.
     * @param OperationAuthLimit Operation permission limitation.
     */
    public void setOperationAuthLimit(String [] OperationAuthLimit) {
        this.OperationAuthLimit = OperationAuthLimit;
    }

    /**
     * Get Enables VPC. 
     * @return UseVPC Enables VPC.
     */
    public Boolean getUseVPC() {
        return this.UseVPC;
    }

    /**
     * Set Enables VPC.
     * @param UseVPC Enables VPC.
     */
    public void setUseVPC(Boolean UseVPC) {
        this.UseVPC = UseVPC;
    }

    /**
     * Get Region. 
     * @return RegionId Region.
     */
    public String getRegionId() {
        return this.RegionId;
    }

    /**
     * Set Region.
     * @param RegionId Region.
     */
    public void setRegionId(String RegionId) {
        this.RegionId = RegionId;
    }

    public CreateDatasourceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateDatasourceRequest(CreateDatasourceRequest source) {
        if (source.DbHost != null) {
            this.DbHost = new String(source.DbHost);
        }
        if (source.DbPort != null) {
            this.DbPort = new Long(source.DbPort);
        }
        if (source.ServiceType != null) {
            this.ServiceType = new String(source.ServiceType);
        }
        if (source.DbType != null) {
            this.DbType = new String(source.DbType);
        }
        if (source.Charset != null) {
            this.Charset = new String(source.Charset);
        }
        if (source.DbUser != null) {
            this.DbUser = new String(source.DbUser);
        }
        if (source.DbPwd != null) {
            this.DbPwd = new String(source.DbPwd);
        }
        if (source.DbName != null) {
            this.DbName = new String(source.DbName);
        }
        if (source.SourceName != null) {
            this.SourceName = new String(source.SourceName);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.Catalog != null) {
            this.Catalog = new String(source.Catalog);
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
        if (source.ExtraParam != null) {
            this.ExtraParam = new String(source.ExtraParam);
        }
        if (source.UniqVpcId != null) {
            this.UniqVpcId = new String(source.UniqVpcId);
        }
        if (source.Vip != null) {
            this.Vip = new String(source.Vip);
        }
        if (source.Vport != null) {
            this.Vport = new String(source.Vport);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.OperationAuthLimit != null) {
            this.OperationAuthLimit = new String[source.OperationAuthLimit.length];
            for (int i = 0; i < source.OperationAuthLimit.length; i++) {
                this.OperationAuthLimit[i] = new String(source.OperationAuthLimit[i]);
            }
        }
        if (source.UseVPC != null) {
            this.UseVPC = new Boolean(source.UseVPC);
        }
        if (source.RegionId != null) {
            this.RegionId = new String(source.RegionId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DbHost", this.DbHost);
        this.setParamSimple(map, prefix + "DbPort", this.DbPort);
        this.setParamSimple(map, prefix + "ServiceType", this.ServiceType);
        this.setParamSimple(map, prefix + "DbType", this.DbType);
        this.setParamSimple(map, prefix + "Charset", this.Charset);
        this.setParamSimple(map, prefix + "DbUser", this.DbUser);
        this.setParamSimple(map, prefix + "DbPwd", this.DbPwd);
        this.setParamSimple(map, prefix + "DbName", this.DbName);
        this.setParamSimple(map, prefix + "SourceName", this.SourceName);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "Catalog", this.Catalog);
        this.setParamSimple(map, prefix + "DataOrigin", this.DataOrigin);
        this.setParamSimple(map, prefix + "DataOriginProjectId", this.DataOriginProjectId);
        this.setParamSimple(map, prefix + "DataOriginDatasourceId", this.DataOriginDatasourceId);
        this.setParamSimple(map, prefix + "ExtraParam", this.ExtraParam);
        this.setParamSimple(map, prefix + "UniqVpcId", this.UniqVpcId);
        this.setParamSimple(map, prefix + "Vip", this.Vip);
        this.setParamSimple(map, prefix + "Vport", this.Vport);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamArraySimple(map, prefix + "OperationAuthLimit.", this.OperationAuthLimit);
        this.setParamSimple(map, prefix + "UseVPC", this.UseVPC);
        this.setParamSimple(map, prefix + "RegionId", this.RegionId);

    }
}

