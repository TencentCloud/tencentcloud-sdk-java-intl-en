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
package com.tencentcloudapi.ssl.v20191205.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeployRecordItem extends AbstractModel {

    /**
    * Deployment record detail ID.
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * Bound certificate ID.
    */
    @SerializedName("OldCertId")
    @Expose
    private String OldCertId;

    /**
    * Deployment instance ID.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Specifies the deployment instance name.
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * Deploy the listener ID.
    */
    @SerializedName("ListenerId")
    @Expose
    private String ListenerId;

    /**
    * Deployment domain name list.
    */
    @SerializedName("Domains")
    @Expose
    private String [] Domains;

    /**
    * Deploy listener protocol.
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * Deployment state.
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Deployment error information.
    */
    @SerializedName("ErrorMsg")
    @Expose
    private String ErrorMsg;

    /**
    * Describes the creation time of the deployment record detail.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Specifies the last update time of the deployment record detail.
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * Deploy listener name.
    */
    @SerializedName("ListenerName")
    @Expose
    private String ListenerName;

    /**
    * Whether SNI is enabled.
    */
    @SerializedName("SniSwitch")
    @Expose
    private Long SniSwitch;

    /**
    * COS bucket name.
    */
    @SerializedName("Bucket")
    @Expose
    private String Bucket;

    /**
    * Namespace name.
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * The secret name.
    */
    @SerializedName("SecretName")
    @Expose
    private String SecretName;

    /**
    * Port
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * Deployed TCB region.
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * CLB type. valid values: 0 (classic clb); 1 (application clb).
    */
    @SerializedName("Forward")
    @Expose
    private Long Forward;

    /**
    * Certificate authentication mode: UNIDIRECTIONAL for one-way authentication, MUTUAL for MUTUAL authentication.
    */
    @SerializedName("SSLMode")
    @Expose
    private String SSLMode;

    /**
    * Deployment resource type.
    */
    @SerializedName("ResourceType")
    @Expose
    private String ResourceType;

    /**
     * Get Deployment record detail ID. 
     * @return Id Deployment record detail ID.
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set Deployment record detail ID.
     * @param Id Deployment record detail ID.
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get Bound certificate ID. 
     * @return OldCertId Bound certificate ID.
     */
    public String getOldCertId() {
        return this.OldCertId;
    }

    /**
     * Set Bound certificate ID.
     * @param OldCertId Bound certificate ID.
     */
    public void setOldCertId(String OldCertId) {
        this.OldCertId = OldCertId;
    }

    /**
     * Get Deployment instance ID. 
     * @return InstanceId Deployment instance ID.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Deployment instance ID.
     * @param InstanceId Deployment instance ID.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Specifies the deployment instance name. 
     * @return InstanceName Specifies the deployment instance name.
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set Specifies the deployment instance name.
     * @param InstanceName Specifies the deployment instance name.
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get Deploy the listener ID. 
     * @return ListenerId Deploy the listener ID.
     */
    public String getListenerId() {
        return this.ListenerId;
    }

    /**
     * Set Deploy the listener ID.
     * @param ListenerId Deploy the listener ID.
     */
    public void setListenerId(String ListenerId) {
        this.ListenerId = ListenerId;
    }

    /**
     * Get Deployment domain name list. 
     * @return Domains Deployment domain name list.
     */
    public String [] getDomains() {
        return this.Domains;
    }

    /**
     * Set Deployment domain name list.
     * @param Domains Deployment domain name list.
     */
    public void setDomains(String [] Domains) {
        this.Domains = Domains;
    }

    /**
     * Get Deploy listener protocol. 
     * @return Protocol Deploy listener protocol.
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set Deploy listener protocol.
     * @param Protocol Deploy listener protocol.
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get Deployment state. 
     * @return Status Deployment state.
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Deployment state.
     * @param Status Deployment state.
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Deployment error information. 
     * @return ErrorMsg Deployment error information.
     */
    public String getErrorMsg() {
        return this.ErrorMsg;
    }

    /**
     * Set Deployment error information.
     * @param ErrorMsg Deployment error information.
     */
    public void setErrorMsg(String ErrorMsg) {
        this.ErrorMsg = ErrorMsg;
    }

    /**
     * Get Describes the creation time of the deployment record detail. 
     * @return CreateTime Describes the creation time of the deployment record detail.
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Describes the creation time of the deployment record detail.
     * @param CreateTime Describes the creation time of the deployment record detail.
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Specifies the last update time of the deployment record detail. 
     * @return UpdateTime Specifies the last update time of the deployment record detail.
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Specifies the last update time of the deployment record detail.
     * @param UpdateTime Specifies the last update time of the deployment record detail.
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get Deploy listener name. 
     * @return ListenerName Deploy listener name.
     */
    public String getListenerName() {
        return this.ListenerName;
    }

    /**
     * Set Deploy listener name.
     * @param ListenerName Deploy listener name.
     */
    public void setListenerName(String ListenerName) {
        this.ListenerName = ListenerName;
    }

    /**
     * Get Whether SNI is enabled. 
     * @return SniSwitch Whether SNI is enabled.
     */
    public Long getSniSwitch() {
        return this.SniSwitch;
    }

    /**
     * Set Whether SNI is enabled.
     * @param SniSwitch Whether SNI is enabled.
     */
    public void setSniSwitch(Long SniSwitch) {
        this.SniSwitch = SniSwitch;
    }

    /**
     * Get COS bucket name. 
     * @return Bucket COS bucket name.
     */
    public String getBucket() {
        return this.Bucket;
    }

    /**
     * Set COS bucket name.
     * @param Bucket COS bucket name.
     */
    public void setBucket(String Bucket) {
        this.Bucket = Bucket;
    }

    /**
     * Get Namespace name. 
     * @return Namespace Namespace name.
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set Namespace name.
     * @param Namespace Namespace name.
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * Get The secret name. 
     * @return SecretName The secret name.
     */
    public String getSecretName() {
        return this.SecretName;
    }

    /**
     * Set The secret name.
     * @param SecretName The secret name.
     */
    public void setSecretName(String SecretName) {
        this.SecretName = SecretName;
    }

    /**
     * Get Port 
     * @return Port Port
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set Port
     * @param Port Port
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get Deployed TCB region. 
     * @return Region Deployed TCB region.
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set Deployed TCB region.
     * @param Region Deployed TCB region.
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get CLB type. valid values: 0 (classic clb); 1 (application clb). 
     * @return Forward CLB type. valid values: 0 (classic clb); 1 (application clb).
     */
    public Long getForward() {
        return this.Forward;
    }

    /**
     * Set CLB type. valid values: 0 (classic clb); 1 (application clb).
     * @param Forward CLB type. valid values: 0 (classic clb); 1 (application clb).
     */
    public void setForward(Long Forward) {
        this.Forward = Forward;
    }

    /**
     * Get Certificate authentication mode: UNIDIRECTIONAL for one-way authentication, MUTUAL for MUTUAL authentication. 
     * @return SSLMode Certificate authentication mode: UNIDIRECTIONAL for one-way authentication, MUTUAL for MUTUAL authentication.
     */
    public String getSSLMode() {
        return this.SSLMode;
    }

    /**
     * Set Certificate authentication mode: UNIDIRECTIONAL for one-way authentication, MUTUAL for MUTUAL authentication.
     * @param SSLMode Certificate authentication mode: UNIDIRECTIONAL for one-way authentication, MUTUAL for MUTUAL authentication.
     */
    public void setSSLMode(String SSLMode) {
        this.SSLMode = SSLMode;
    }

    /**
     * Get Deployment resource type. 
     * @return ResourceType Deployment resource type.
     */
    public String getResourceType() {
        return this.ResourceType;
    }

    /**
     * Set Deployment resource type.
     * @param ResourceType Deployment resource type.
     */
    public void setResourceType(String ResourceType) {
        this.ResourceType = ResourceType;
    }

    public DeployRecordItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeployRecordItem(DeployRecordItem source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.OldCertId != null) {
            this.OldCertId = new String(source.OldCertId);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.ListenerId != null) {
            this.ListenerId = new String(source.ListenerId);
        }
        if (source.Domains != null) {
            this.Domains = new String[source.Domains.length];
            for (int i = 0; i < source.Domains.length; i++) {
                this.Domains[i] = new String(source.Domains[i]);
            }
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.ErrorMsg != null) {
            this.ErrorMsg = new String(source.ErrorMsg);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.ListenerName != null) {
            this.ListenerName = new String(source.ListenerName);
        }
        if (source.SniSwitch != null) {
            this.SniSwitch = new Long(source.SniSwitch);
        }
        if (source.Bucket != null) {
            this.Bucket = new String(source.Bucket);
        }
        if (source.Namespace != null) {
            this.Namespace = new String(source.Namespace);
        }
        if (source.SecretName != null) {
            this.SecretName = new String(source.SecretName);
        }
        if (source.Port != null) {
            this.Port = new Long(source.Port);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.Forward != null) {
            this.Forward = new Long(source.Forward);
        }
        if (source.SSLMode != null) {
            this.SSLMode = new String(source.SSLMode);
        }
        if (source.ResourceType != null) {
            this.ResourceType = new String(source.ResourceType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "OldCertId", this.OldCertId);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "ListenerId", this.ListenerId);
        this.setParamArraySimple(map, prefix + "Domains.", this.Domains);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ErrorMsg", this.ErrorMsg);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "ListenerName", this.ListenerName);
        this.setParamSimple(map, prefix + "SniSwitch", this.SniSwitch);
        this.setParamSimple(map, prefix + "Bucket", this.Bucket);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamSimple(map, prefix + "SecretName", this.SecretName);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Forward", this.Forward);
        this.setParamSimple(map, prefix + "SSLMode", this.SSLMode);
        this.setParamSimple(map, prefix + "ResourceType", this.ResourceType);

    }
}

