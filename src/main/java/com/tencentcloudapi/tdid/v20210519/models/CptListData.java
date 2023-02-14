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
package com.tencentcloudapi.tdid.v20210519.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CptListData extends AbstractModel{

    /**
    * The CPT ID.
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * The name of the claim protocol type (CPT).
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
    * The claim protocol type (CPT) ID.
    */
    @SerializedName("CptId")
    @Expose
    private Long CptId;

    /**
    * The type. `1`: System CPTs; `2`: Authorization CPTs; `3`: General CPTs
    */
    @SerializedName("CptType")
    @Expose
    private Long CptType;

    /**
    * The description of the claim protocol type (CPT).
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * The JSON file of the claim protocol type (CPT).
    */
    @SerializedName("CptJson")
    @Expose
    private String CptJson;

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
     * Get The CPT ID. 
     * @return Id The CPT ID.
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set The CPT ID.
     * @param Id The CPT ID.
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get The name of the claim protocol type (CPT). 
     * @return Name The name of the claim protocol type (CPT).
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set The name of the claim protocol type (CPT).
     * @param Name The name of the claim protocol type (CPT).
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
     * Get The type. `1`: System CPTs; `2`: Authorization CPTs; `3`: General CPTs 
     * @return CptType The type. `1`: System CPTs; `2`: Authorization CPTs; `3`: General CPTs
     */
    public Long getCptType() {
        return this.CptType;
    }

    /**
     * Set The type. `1`: System CPTs; `2`: Authorization CPTs; `3`: General CPTs
     * @param CptType The type. `1`: System CPTs; `2`: Authorization CPTs; `3`: General CPTs
     */
    public void setCptType(Long CptType) {
        this.CptType = CptType;
    }

    /**
     * Get The description of the claim protocol type (CPT). 
     * @return Description The description of the claim protocol type (CPT).
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set The description of the claim protocol type (CPT).
     * @param Description The description of the claim protocol type (CPT).
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get The JSON file of the claim protocol type (CPT). 
     * @return CptJson The JSON file of the claim protocol type (CPT).
     */
    public String getCptJson() {
        return this.CptJson;
    }

    /**
     * Set The JSON file of the claim protocol type (CPT).
     * @param CptJson The JSON file of the claim protocol type (CPT).
     */
    public void setCptJson(String CptJson) {
        this.CptJson = CptJson;
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

    public CptListData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CptListData(CptListData source) {
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
        if (source.CptId != null) {
            this.CptId = new Long(source.CptId);
        }
        if (source.CptType != null) {
            this.CptType = new Long(source.CptType);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.CptJson != null) {
            this.CptJson = new String(source.CptJson);
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
        this.setParamSimple(map, prefix + "CptId", this.CptId);
        this.setParamSimple(map, prefix + "CptType", this.CptType);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "CptJson", this.CptJson);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "CreatorDid", this.CreatorDid);
        this.setParamSimple(map, prefix + "AppName", this.AppName);

    }
}

