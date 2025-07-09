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
package com.tencentcloudapi.sqlserver.v20180328.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MigrateSource extends AbstractModel {

    /**
    * Source instance ID in the format of `mssql-si2823jyl`, which is used when `MigrateType` is 1 (TencentDB for SQL Server)
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * ID of source CVM instance, which is used when `MigrateType` is 2 (CVM-based self-created SQL Server database)
    */
    @SerializedName("CvmId")
    @Expose
    private String CvmId;

    /**
    * VPC ID of source CVM instance in the format of vpc-6ys9ont9, which is used when `MigrateType` is 2 (CVM-based self-created SQL Server database)
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * VPC subnet ID of source CVM instance in the format of subnet-h9extioi, which is used when `MigrateType` is 2 (CVM-based self-created SQL Server database)
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * Username, which is used when `MigrateType` is 1 or 2
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * Password, which is used when `MigrateType` is 1 or 2
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * Private IP of source CVM database, which is used when `MigrateType` is 2 (CVM-based self-created SQL Server database)
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * Port number of source CVM database, which is used when `MigrateType` is 2 (CVM-based self-created SQL Server database)
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * Source backup address for offline migration, which is used when `MigrateType` is 4 or 5
    */
    @SerializedName("Url")
    @Expose
    private String [] Url;

    /**
    * Source backup password for offline migration, which is used when `MigrateType` is 4 or 5
    */
    @SerializedName("UrlPassword")
    @Expose
    private String UrlPassword;

    /**
     * Get Source instance ID in the format of `mssql-si2823jyl`, which is used when `MigrateType` is 1 (TencentDB for SQL Server) 
     * @return InstanceId Source instance ID in the format of `mssql-si2823jyl`, which is used when `MigrateType` is 1 (TencentDB for SQL Server)
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Source instance ID in the format of `mssql-si2823jyl`, which is used when `MigrateType` is 1 (TencentDB for SQL Server)
     * @param InstanceId Source instance ID in the format of `mssql-si2823jyl`, which is used when `MigrateType` is 1 (TencentDB for SQL Server)
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get ID of source CVM instance, which is used when `MigrateType` is 2 (CVM-based self-created SQL Server database) 
     * @return CvmId ID of source CVM instance, which is used when `MigrateType` is 2 (CVM-based self-created SQL Server database)
     */
    public String getCvmId() {
        return this.CvmId;
    }

    /**
     * Set ID of source CVM instance, which is used when `MigrateType` is 2 (CVM-based self-created SQL Server database)
     * @param CvmId ID of source CVM instance, which is used when `MigrateType` is 2 (CVM-based self-created SQL Server database)
     */
    public void setCvmId(String CvmId) {
        this.CvmId = CvmId;
    }

    /**
     * Get VPC ID of source CVM instance in the format of vpc-6ys9ont9, which is used when `MigrateType` is 2 (CVM-based self-created SQL Server database) 
     * @return VpcId VPC ID of source CVM instance in the format of vpc-6ys9ont9, which is used when `MigrateType` is 2 (CVM-based self-created SQL Server database)
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set VPC ID of source CVM instance in the format of vpc-6ys9ont9, which is used when `MigrateType` is 2 (CVM-based self-created SQL Server database)
     * @param VpcId VPC ID of source CVM instance in the format of vpc-6ys9ont9, which is used when `MigrateType` is 2 (CVM-based self-created SQL Server database)
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get VPC subnet ID of source CVM instance in the format of subnet-h9extioi, which is used when `MigrateType` is 2 (CVM-based self-created SQL Server database) 
     * @return SubnetId VPC subnet ID of source CVM instance in the format of subnet-h9extioi, which is used when `MigrateType` is 2 (CVM-based self-created SQL Server database)
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set VPC subnet ID of source CVM instance in the format of subnet-h9extioi, which is used when `MigrateType` is 2 (CVM-based self-created SQL Server database)
     * @param SubnetId VPC subnet ID of source CVM instance in the format of subnet-h9extioi, which is used when `MigrateType` is 2 (CVM-based self-created SQL Server database)
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get Username, which is used when `MigrateType` is 1 or 2 
     * @return UserName Username, which is used when `MigrateType` is 1 or 2
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set Username, which is used when `MigrateType` is 1 or 2
     * @param UserName Username, which is used when `MigrateType` is 1 or 2
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get Password, which is used when `MigrateType` is 1 or 2 
     * @return Password Password, which is used when `MigrateType` is 1 or 2
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set Password, which is used when `MigrateType` is 1 or 2
     * @param Password Password, which is used when `MigrateType` is 1 or 2
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get Private IP of source CVM database, which is used when `MigrateType` is 2 (CVM-based self-created SQL Server database) 
     * @return Ip Private IP of source CVM database, which is used when `MigrateType` is 2 (CVM-based self-created SQL Server database)
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set Private IP of source CVM database, which is used when `MigrateType` is 2 (CVM-based self-created SQL Server database)
     * @param Ip Private IP of source CVM database, which is used when `MigrateType` is 2 (CVM-based self-created SQL Server database)
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * Get Port number of source CVM database, which is used when `MigrateType` is 2 (CVM-based self-created SQL Server database) 
     * @return Port Port number of source CVM database, which is used when `MigrateType` is 2 (CVM-based self-created SQL Server database)
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set Port number of source CVM database, which is used when `MigrateType` is 2 (CVM-based self-created SQL Server database)
     * @param Port Port number of source CVM database, which is used when `MigrateType` is 2 (CVM-based self-created SQL Server database)
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get Source backup address for offline migration, which is used when `MigrateType` is 4 or 5 
     * @return Url Source backup address for offline migration, which is used when `MigrateType` is 4 or 5
     */
    public String [] getUrl() {
        return this.Url;
    }

    /**
     * Set Source backup address for offline migration, which is used when `MigrateType` is 4 or 5
     * @param Url Source backup address for offline migration, which is used when `MigrateType` is 4 or 5
     */
    public void setUrl(String [] Url) {
        this.Url = Url;
    }

    /**
     * Get Source backup password for offline migration, which is used when `MigrateType` is 4 or 5 
     * @return UrlPassword Source backup password for offline migration, which is used when `MigrateType` is 4 or 5
     */
    public String getUrlPassword() {
        return this.UrlPassword;
    }

    /**
     * Set Source backup password for offline migration, which is used when `MigrateType` is 4 or 5
     * @param UrlPassword Source backup password for offline migration, which is used when `MigrateType` is 4 or 5
     */
    public void setUrlPassword(String UrlPassword) {
        this.UrlPassword = UrlPassword;
    }

    public MigrateSource() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MigrateSource(MigrateSource source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.CvmId != null) {
            this.CvmId = new String(source.CvmId);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.Password != null) {
            this.Password = new String(source.Password);
        }
        if (source.Ip != null) {
            this.Ip = new String(source.Ip);
        }
        if (source.Port != null) {
            this.Port = new Long(source.Port);
        }
        if (source.Url != null) {
            this.Url = new String[source.Url.length];
            for (int i = 0; i < source.Url.length; i++) {
                this.Url[i] = new String(source.Url[i]);
            }
        }
        if (source.UrlPassword != null) {
            this.UrlPassword = new String(source.UrlPassword);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "CvmId", this.CvmId);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "Password", this.Password);
        this.setParamSimple(map, prefix + "Ip", this.Ip);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamArraySimple(map, prefix + "Url.", this.Url);
        this.setParamSimple(map, prefix + "UrlPassword", this.UrlPassword);

    }
}

