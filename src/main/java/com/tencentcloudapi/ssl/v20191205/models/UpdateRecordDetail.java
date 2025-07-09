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
package com.tencentcloudapi.ssl.v20191205.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateRecordDetail extends AbstractModel {

    /**
    * Update detail record id.
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * New and old certificate update - new certificate id.
    */
    @SerializedName("CertId")
    @Expose
    private String CertId;

    /**
    * Old and new certificate update - old certificate id.
    */
    @SerializedName("OldCertId")
    @Expose
    private String OldCertId;

    /**
    * Deployment domain name list
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Domains")
    @Expose
    private String [] Domains;

    /**
    * Type of cloud resource for updating old and new certs.
- clb.
- cdn.
- ddos.
- live.
- vod.
- waf.
- apigateway.
- teo.
- tke.
- cos.
- tse.
- tcb.
    */
    @SerializedName("ResourceType")
    @Expose
    private String ResourceType;

    /**
    * Deployment region
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * Deployment status. valid values:.
0: To be deployed.
1: Deployment successful.
2: Deployment failed.
3: Deploying.
4: Rollback succeeded.
5: Rollback failure.
6: No resource, no need for deployment.
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Deployment error message
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("ErrorMsg")
    @Expose
    private String ErrorMsg;

    /**
    * Deployment time
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Last update time
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * Deployment instance ID
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Deployment instance name
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * Deployment listener ID (only for CLB)
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("ListenerId")
    @Expose
    private String ListenerId;

    /**
    * Deployment listener name (only for CLB)
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("ListenerName")
    @Expose
    private String ListenerName;

    /**
    * Protocol
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * Whether SNI is enabled (only for CLB)
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("SniSwitch")
    @Expose
    private Long SniSwitch;

    /**
    * Bucket name (only for COS)
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Bucket")
    @Expose
    private String Bucket;

    /**
    * Port
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * Namespace (only for TKE)
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * Secret name (only for TKE)
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("SecretName")
    @Expose
    private String SecretName;

    /**
    * Environment ID
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("EnvId")
    @Expose
    private String EnvId;

    /**
    * TCB deployment type
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("TCBType")
    @Expose
    private String TCBType;

    /**
    * Listener url (only for CLB).
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
     * Get Update detail record id. 
     * @return Id Update detail record id.
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set Update detail record id.
     * @param Id Update detail record id.
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get New and old certificate update - new certificate id. 
     * @return CertId New and old certificate update - new certificate id.
     */
    public String getCertId() {
        return this.CertId;
    }

    /**
     * Set New and old certificate update - new certificate id.
     * @param CertId New and old certificate update - new certificate id.
     */
    public void setCertId(String CertId) {
        this.CertId = CertId;
    }

    /**
     * Get Old and new certificate update - old certificate id. 
     * @return OldCertId Old and new certificate update - old certificate id.
     */
    public String getOldCertId() {
        return this.OldCertId;
    }

    /**
     * Set Old and new certificate update - old certificate id.
     * @param OldCertId Old and new certificate update - old certificate id.
     */
    public void setOldCertId(String OldCertId) {
        this.OldCertId = OldCertId;
    }

    /**
     * Get Deployment domain name list
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return Domains Deployment domain name list
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String [] getDomains() {
        return this.Domains;
    }

    /**
     * Set Deployment domain name list
Note: This field may return null, indicating that no valid value can be obtained.
     * @param Domains Deployment domain name list
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setDomains(String [] Domains) {
        this.Domains = Domains;
    }

    /**
     * Get Type of cloud resource for updating old and new certs.
- clb.
- cdn.
- ddos.
- live.
- vod.
- waf.
- apigateway.
- teo.
- tke.
- cos.
- tse.
- tcb. 
     * @return ResourceType Type of cloud resource for updating old and new certs.
- clb.
- cdn.
- ddos.
- live.
- vod.
- waf.
- apigateway.
- teo.
- tke.
- cos.
- tse.
- tcb.
     */
    public String getResourceType() {
        return this.ResourceType;
    }

    /**
     * Set Type of cloud resource for updating old and new certs.
- clb.
- cdn.
- ddos.
- live.
- vod.
- waf.
- apigateway.
- teo.
- tke.
- cos.
- tse.
- tcb.
     * @param ResourceType Type of cloud resource for updating old and new certs.
- clb.
- cdn.
- ddos.
- live.
- vod.
- waf.
- apigateway.
- teo.
- tke.
- cos.
- tse.
- tcb.
     */
    public void setResourceType(String ResourceType) {
        this.ResourceType = ResourceType;
    }

    /**
     * Get Deployment region
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return Region Deployment region
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set Deployment region
Note: This field may return null, indicating that no valid value can be obtained.
     * @param Region Deployment region
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get Deployment status. valid values:.
0: To be deployed.
1: Deployment successful.
2: Deployment failed.
3: Deploying.
4: Rollback succeeded.
5: Rollback failure.
6: No resource, no need for deployment. 
     * @return Status Deployment status. valid values:.
0: To be deployed.
1: Deployment successful.
2: Deployment failed.
3: Deploying.
4: Rollback succeeded.
5: Rollback failure.
6: No resource, no need for deployment.
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Deployment status. valid values:.
0: To be deployed.
1: Deployment successful.
2: Deployment failed.
3: Deploying.
4: Rollback succeeded.
5: Rollback failure.
6: No resource, no need for deployment.
     * @param Status Deployment status. valid values:.
0: To be deployed.
1: Deployment successful.
2: Deployment failed.
3: Deploying.
4: Rollback succeeded.
5: Rollback failure.
6: No resource, no need for deployment.
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Deployment error message
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return ErrorMsg Deployment error message
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getErrorMsg() {
        return this.ErrorMsg;
    }

    /**
     * Set Deployment error message
Note: This field may return null, indicating that no valid value can be obtained.
     * @param ErrorMsg Deployment error message
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setErrorMsg(String ErrorMsg) {
        this.ErrorMsg = ErrorMsg;
    }

    /**
     * Get Deployment time 
     * @return CreateTime Deployment time
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Deployment time
     * @param CreateTime Deployment time
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Last update time 
     * @return UpdateTime Last update time
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Last update time
     * @param UpdateTime Last update time
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get Deployment instance ID
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return InstanceId Deployment instance ID
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Deployment instance ID
Note: This field may return null, indicating that no valid value can be obtained.
     * @param InstanceId Deployment instance ID
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Deployment instance name
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return InstanceName Deployment instance name
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set Deployment instance name
Note: This field may return null, indicating that no valid value can be obtained.
     * @param InstanceName Deployment instance name
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get Deployment listener ID (only for CLB)
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return ListenerId Deployment listener ID (only for CLB)
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getListenerId() {
        return this.ListenerId;
    }

    /**
     * Set Deployment listener ID (only for CLB)
Note: This field may return null, indicating that no valid value can be obtained.
     * @param ListenerId Deployment listener ID (only for CLB)
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setListenerId(String ListenerId) {
        this.ListenerId = ListenerId;
    }

    /**
     * Get Deployment listener name (only for CLB)
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return ListenerName Deployment listener name (only for CLB)
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getListenerName() {
        return this.ListenerName;
    }

    /**
     * Set Deployment listener name (only for CLB)
Note: This field may return null, indicating that no valid value can be obtained.
     * @param ListenerName Deployment listener name (only for CLB)
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setListenerName(String ListenerName) {
        this.ListenerName = ListenerName;
    }

    /**
     * Get Protocol
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return Protocol Protocol
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set Protocol
Note: This field may return null, indicating that no valid value can be obtained.
     * @param Protocol Protocol
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get Whether SNI is enabled (only for CLB)
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return SniSwitch Whether SNI is enabled (only for CLB)
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getSniSwitch() {
        return this.SniSwitch;
    }

    /**
     * Set Whether SNI is enabled (only for CLB)
Note: This field may return null, indicating that no valid value can be obtained.
     * @param SniSwitch Whether SNI is enabled (only for CLB)
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setSniSwitch(Long SniSwitch) {
        this.SniSwitch = SniSwitch;
    }

    /**
     * Get Bucket name (only for COS)
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return Bucket Bucket name (only for COS)
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getBucket() {
        return this.Bucket;
    }

    /**
     * Set Bucket name (only for COS)
Note: This field may return null, indicating that no valid value can be obtained.
     * @param Bucket Bucket name (only for COS)
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setBucket(String Bucket) {
        this.Bucket = Bucket;
    }

    /**
     * Get Port
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return Port Port
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set Port
Note: This field may return null, indicating that no valid value can be obtained.
     * @param Port Port
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get Namespace (only for TKE)
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return Namespace Namespace (only for TKE)
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set Namespace (only for TKE)
Note: This field may return null, indicating that no valid value can be obtained.
     * @param Namespace Namespace (only for TKE)
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * Get Secret name (only for TKE)
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return SecretName Secret name (only for TKE)
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getSecretName() {
        return this.SecretName;
    }

    /**
     * Set Secret name (only for TKE)
Note: This field may return null, indicating that no valid value can be obtained.
     * @param SecretName Secret name (only for TKE)
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setSecretName(String SecretName) {
        this.SecretName = SecretName;
    }

    /**
     * Get Environment ID
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return EnvId Environment ID
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getEnvId() {
        return this.EnvId;
    }

    /**
     * Set Environment ID
Note: This field may return null, indicating that no valid value can be obtained.
     * @param EnvId Environment ID
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setEnvId(String EnvId) {
        this.EnvId = EnvId;
    }

    /**
     * Get TCB deployment type
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return TCBType TCB deployment type
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getTCBType() {
        return this.TCBType;
    }

    /**
     * Set TCB deployment type
Note: This field may return null, indicating that no valid value can be obtained.
     * @param TCBType TCB deployment type
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setTCBType(String TCBType) {
        this.TCBType = TCBType;
    }

    /**
     * Get Listener url (only for CLB).
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Url Listener url (only for CLB).
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set Listener url (only for CLB).
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Url Listener url (only for CLB).
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    public UpdateRecordDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateRecordDetail(UpdateRecordDetail source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.CertId != null) {
            this.CertId = new String(source.CertId);
        }
        if (source.OldCertId != null) {
            this.OldCertId = new String(source.OldCertId);
        }
        if (source.Domains != null) {
            this.Domains = new String[source.Domains.length];
            for (int i = 0; i < source.Domains.length; i++) {
                this.Domains[i] = new String(source.Domains[i]);
            }
        }
        if (source.ResourceType != null) {
            this.ResourceType = new String(source.ResourceType);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
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
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.ListenerId != null) {
            this.ListenerId = new String(source.ListenerId);
        }
        if (source.ListenerName != null) {
            this.ListenerName = new String(source.ListenerName);
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.SniSwitch != null) {
            this.SniSwitch = new Long(source.SniSwitch);
        }
        if (source.Bucket != null) {
            this.Bucket = new String(source.Bucket);
        }
        if (source.Port != null) {
            this.Port = new Long(source.Port);
        }
        if (source.Namespace != null) {
            this.Namespace = new String(source.Namespace);
        }
        if (source.SecretName != null) {
            this.SecretName = new String(source.SecretName);
        }
        if (source.EnvId != null) {
            this.EnvId = new String(source.EnvId);
        }
        if (source.TCBType != null) {
            this.TCBType = new String(source.TCBType);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "CertId", this.CertId);
        this.setParamSimple(map, prefix + "OldCertId", this.OldCertId);
        this.setParamArraySimple(map, prefix + "Domains.", this.Domains);
        this.setParamSimple(map, prefix + "ResourceType", this.ResourceType);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ErrorMsg", this.ErrorMsg);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "ListenerId", this.ListenerId);
        this.setParamSimple(map, prefix + "ListenerName", this.ListenerName);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "SniSwitch", this.SniSwitch);
        this.setParamSimple(map, prefix + "Bucket", this.Bucket);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamSimple(map, prefix + "SecretName", this.SecretName);
        this.setParamSimple(map, prefix + "EnvId", this.EnvId);
        this.setParamSimple(map, prefix + "TCBType", this.TCBType);
        this.setParamSimple(map, prefix + "Url", this.Url);

    }
}

