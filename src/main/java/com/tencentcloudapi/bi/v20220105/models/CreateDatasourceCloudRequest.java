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

public class CreateDatasourceCloudRequest extends AbstractModel {

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
    private String ProjectId;

    /**
    * Private network IP address of the public cloud.
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
    * Private network port of the public cloud.
    */
    @SerializedName("Vport")
    @Expose
    private String Vport;

    /**
    * VPC identifier.
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * Unified VPC identifier.
    */
    @SerializedName("UniqVpcId")
    @Expose
    private String UniqVpcId;

    /**
    * Region identifier (gz, bj).
    */
    @SerializedName("RegionId")
    @Expose
    private String RegionId;

    /**
    * Extension parameter.
    */
    @SerializedName("ExtraParam")
    @Expose
    private String ExtraParam;

    /**
    * Instance ID.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Product name of the data source.
    */
    @SerializedName("ProdDbName")
    @Expose
    private String ProdDbName;

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
    * Cluster ID.
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 
    */
    @SerializedName("Schema")
    @Expose
    private String Schema;

    /**
    * 
    */
    @SerializedName("DbVersion")
    @Expose
    private String DbVersion;

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
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Project ID.
     * @param ProjectId Project ID.
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get Private network IP address of the public cloud. 
     * @return Vip Private network IP address of the public cloud.
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set Private network IP address of the public cloud.
     * @param Vip Private network IP address of the public cloud.
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    /**
     * Get Private network port of the public cloud. 
     * @return Vport Private network port of the public cloud.
     */
    public String getVport() {
        return this.Vport;
    }

    /**
     * Set Private network port of the public cloud.
     * @param Vport Private network port of the public cloud.
     */
    public void setVport(String Vport) {
        this.Vport = Vport;
    }

    /**
     * Get VPC identifier. 
     * @return VpcId VPC identifier.
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set VPC identifier.
     * @param VpcId VPC identifier.
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get Unified VPC identifier. 
     * @return UniqVpcId Unified VPC identifier.
     */
    public String getUniqVpcId() {
        return this.UniqVpcId;
    }

    /**
     * Set Unified VPC identifier.
     * @param UniqVpcId Unified VPC identifier.
     */
    public void setUniqVpcId(String UniqVpcId) {
        this.UniqVpcId = UniqVpcId;
    }

    /**
     * Get Region identifier (gz, bj). 
     * @return RegionId Region identifier (gz, bj).
     */
    public String getRegionId() {
        return this.RegionId;
    }

    /**
     * Set Region identifier (gz, bj).
     * @param RegionId Region identifier (gz, bj).
     */
    public void setRegionId(String RegionId) {
        this.RegionId = RegionId;
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
     * Get Instance ID. 
     * @return InstanceId Instance ID.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID.
     * @param InstanceId Instance ID.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Product name of the data source. 
     * @return ProdDbName Product name of the data source.
     */
    public String getProdDbName() {
        return this.ProdDbName;
    }

    /**
     * Set Product name of the data source.
     * @param ProdDbName Product name of the data source.
     */
    public void setProdDbName(String ProdDbName) {
        this.ProdDbName = ProdDbName;
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
     * Get Cluster ID. 
     * @return ClusterId Cluster ID.
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set Cluster ID.
     * @param ClusterId Cluster ID.
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get  
     * @return Schema 
     */
    public String getSchema() {
        return this.Schema;
    }

    /**
     * Set 
     * @param Schema 
     */
    public void setSchema(String Schema) {
        this.Schema = Schema;
    }

    /**
     * Get  
     * @return DbVersion 
     */
    public String getDbVersion() {
        return this.DbVersion;
    }

    /**
     * Set 
     * @param DbVersion 
     */
    public void setDbVersion(String DbVersion) {
        this.DbVersion = DbVersion;
    }

    public CreateDatasourceCloudRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateDatasourceCloudRequest(CreateDatasourceCloudRequest source) {
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
            this.ProjectId = new String(source.ProjectId);
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
        if (source.UniqVpcId != null) {
            this.UniqVpcId = new String(source.UniqVpcId);
        }
        if (source.RegionId != null) {
            this.RegionId = new String(source.RegionId);
        }
        if (source.ExtraParam != null) {
            this.ExtraParam = new String(source.ExtraParam);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.ProdDbName != null) {
            this.ProdDbName = new String(source.ProdDbName);
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
        if (source.Schema != null) {
            this.Schema = new String(source.Schema);
        }
        if (source.DbVersion != null) {
            this.DbVersion = new String(source.DbVersion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ServiceType", this.ServiceType);
        this.setParamSimple(map, prefix + "DbType", this.DbType);
        this.setParamSimple(map, prefix + "Charset", this.Charset);
        this.setParamSimple(map, prefix + "DbUser", this.DbUser);
        this.setParamSimple(map, prefix + "DbPwd", this.DbPwd);
        this.setParamSimple(map, prefix + "DbName", this.DbName);
        this.setParamSimple(map, prefix + "SourceName", this.SourceName);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "Vip", this.Vip);
        this.setParamSimple(map, prefix + "Vport", this.Vport);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "UniqVpcId", this.UniqVpcId);
        this.setParamSimple(map, prefix + "RegionId", this.RegionId);
        this.setParamSimple(map, prefix + "ExtraParam", this.ExtraParam);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "ProdDbName", this.ProdDbName);
        this.setParamSimple(map, prefix + "DataOrigin", this.DataOrigin);
        this.setParamSimple(map, prefix + "DataOriginProjectId", this.DataOriginProjectId);
        this.setParamSimple(map, prefix + "DataOriginDatasourceId", this.DataOriginDatasourceId);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "Schema", this.Schema);
        this.setParamSimple(map, prefix + "DbVersion", this.DbVersion);

    }
}

