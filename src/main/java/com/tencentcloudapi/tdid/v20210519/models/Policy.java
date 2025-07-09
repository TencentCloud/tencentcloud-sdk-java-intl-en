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
package com.tencentcloudapi.tdid.v20210519.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Policy extends AbstractModel {

    /**
    * The policy index.
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * The policy name.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * The network ID.
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * The group ID.
    */
    @SerializedName("GroupId")
    @Expose
    private Long GroupId;

    /**
    * The service ID.
    */
    @SerializedName("ServiceId")
    @Expose
    private Long ServiceId;

    /**
    * The application ID of the contract.
    */
    @SerializedName("ContractAppId")
    @Expose
    private Long ContractAppId;

    /**
    * The policy ID.
    */
    @SerializedName("PolicyId")
    @Expose
    private Long PolicyId;

    /**
    * The claim protocol type (CPT) ID.
    */
    @SerializedName("CptId")
    @Expose
    private Long CptId;

    /**
    * The JSON data.
    */
    @SerializedName("PolicyJson")
    @Expose
    private String PolicyJson;

    /**
    * The creation time.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * The last updated time.
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * The DID of the creator.
    */
    @SerializedName("CreatorDid")
    @Expose
    private String CreatorDid;

    /**
    * The application name.
    */
    @SerializedName("AppName")
    @Expose
    private String AppName;

    /**
    * The claim protocol type (CPT) index.
    */
    @SerializedName("CptIndex")
    @Expose
    private Long CptIndex;

    /**
     * Get The policy index. 
     * @return Id The policy index.
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set The policy index.
     * @param Id The policy index.
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get The policy name. 
     * @return Name The policy name.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set The policy name.
     * @param Name The policy name.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get The network ID. 
     * @return ClusterId The network ID.
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set The network ID.
     * @param ClusterId The network ID.
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get The group ID. 
     * @return GroupId The group ID.
     */
    public Long getGroupId() {
        return this.GroupId;
    }

    /**
     * Set The group ID.
     * @param GroupId The group ID.
     */
    public void setGroupId(Long GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get The service ID. 
     * @return ServiceId The service ID.
     */
    public Long getServiceId() {
        return this.ServiceId;
    }

    /**
     * Set The service ID.
     * @param ServiceId The service ID.
     */
    public void setServiceId(Long ServiceId) {
        this.ServiceId = ServiceId;
    }

    /**
     * Get The application ID of the contract. 
     * @return ContractAppId The application ID of the contract.
     */
    public Long getContractAppId() {
        return this.ContractAppId;
    }

    /**
     * Set The application ID of the contract.
     * @param ContractAppId The application ID of the contract.
     */
    public void setContractAppId(Long ContractAppId) {
        this.ContractAppId = ContractAppId;
    }

    /**
     * Get The policy ID. 
     * @return PolicyId The policy ID.
     */
    public Long getPolicyId() {
        return this.PolicyId;
    }

    /**
     * Set The policy ID.
     * @param PolicyId The policy ID.
     */
    public void setPolicyId(Long PolicyId) {
        this.PolicyId = PolicyId;
    }

    /**
     * Get The claim protocol type (CPT) ID. 
     * @return CptId The claim protocol type (CPT) ID.
     */
    public Long getCptId() {
        return this.CptId;
    }

    /**
     * Set The claim protocol type (CPT) ID.
     * @param CptId The claim protocol type (CPT) ID.
     */
    public void setCptId(Long CptId) {
        this.CptId = CptId;
    }

    /**
     * Get The JSON data. 
     * @return PolicyJson The JSON data.
     */
    public String getPolicyJson() {
        return this.PolicyJson;
    }

    /**
     * Set The JSON data.
     * @param PolicyJson The JSON data.
     */
    public void setPolicyJson(String PolicyJson) {
        this.PolicyJson = PolicyJson;
    }

    /**
     * Get The creation time. 
     * @return CreateTime The creation time.
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set The creation time.
     * @param CreateTime The creation time.
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get The last updated time. 
     * @return UpdateTime The last updated time.
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set The last updated time.
     * @param UpdateTime The last updated time.
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get The DID of the creator. 
     * @return CreatorDid The DID of the creator.
     */
    public String getCreatorDid() {
        return this.CreatorDid;
    }

    /**
     * Set The DID of the creator.
     * @param CreatorDid The DID of the creator.
     */
    public void setCreatorDid(String CreatorDid) {
        this.CreatorDid = CreatorDid;
    }

    /**
     * Get The application name. 
     * @return AppName The application name.
     */
    public String getAppName() {
        return this.AppName;
    }

    /**
     * Set The application name.
     * @param AppName The application name.
     */
    public void setAppName(String AppName) {
        this.AppName = AppName;
    }

    /**
     * Get The claim protocol type (CPT) index. 
     * @return CptIndex The claim protocol type (CPT) index.
     */
    public Long getCptIndex() {
        return this.CptIndex;
    }

    /**
     * Set The claim protocol type (CPT) index.
     * @param CptIndex The claim protocol type (CPT) index.
     */
    public void setCptIndex(Long CptIndex) {
        this.CptIndex = CptIndex;
    }

    public Policy() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Policy(Policy source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.GroupId != null) {
            this.GroupId = new Long(source.GroupId);
        }
        if (source.ServiceId != null) {
            this.ServiceId = new Long(source.ServiceId);
        }
        if (source.ContractAppId != null) {
            this.ContractAppId = new Long(source.ContractAppId);
        }
        if (source.PolicyId != null) {
            this.PolicyId = new Long(source.PolicyId);
        }
        if (source.CptId != null) {
            this.CptId = new Long(source.CptId);
        }
        if (source.PolicyJson != null) {
            this.PolicyJson = new String(source.PolicyJson);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.CreatorDid != null) {
            this.CreatorDid = new String(source.CreatorDid);
        }
        if (source.AppName != null) {
            this.AppName = new String(source.AppName);
        }
        if (source.CptIndex != null) {
            this.CptIndex = new Long(source.CptIndex);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "ServiceId", this.ServiceId);
        this.setParamSimple(map, prefix + "ContractAppId", this.ContractAppId);
        this.setParamSimple(map, prefix + "PolicyId", this.PolicyId);
        this.setParamSimple(map, prefix + "CptId", this.CptId);
        this.setParamSimple(map, prefix + "PolicyJson", this.PolicyJson);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "CreatorDid", this.CreatorDid);
        this.setParamSimple(map, prefix + "AppName", this.AppName);
        this.setParamSimple(map, prefix + "CptIndex", this.CptIndex);

    }
}

