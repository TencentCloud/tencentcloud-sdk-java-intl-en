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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DidServiceInfo extends AbstractModel {

    /**
    * The DID service ID.
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * The application ID.
    */
    @SerializedName("Appid")
    @Expose
    private Long Appid;

    /**
    * The account ID.
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * The consortium ID.
    */
    @SerializedName("ConsortiumId")
    @Expose
    private Long ConsortiumId;

    /**
    * The consortium name.
    */
    @SerializedName("ConsortiumName")
    @Expose
    private String ConsortiumName;

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
    * The chain ID.
    */
    @SerializedName("ChainId")
    @Expose
    private String ChainId;

    /**
    * Whether you are the owner of the consortium. `1`: Yes; `0`: No.
    */
    @SerializedName("RoleType")
    @Expose
    private Long RoleType;

    /**
    * The organization DID.
    */
    @SerializedName("AgencyDid")
    @Expose
    private String AgencyDid;

    /**
    * The organization name.
    */
    @SerializedName("CreateOrg")
    @Expose
    private String CreateOrg;

    /**
    * The endpoint.
    */
    @SerializedName("Endpoint")
    @Expose
    private String Endpoint;

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
    * The group name.
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
     * Get The DID service ID. 
     * @return Id The DID service ID.
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set The DID service ID.
     * @param Id The DID service ID.
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get The application ID. 
     * @return Appid The application ID.
     */
    public Long getAppid() {
        return this.Appid;
    }

    /**
     * Set The application ID.
     * @param Appid The application ID.
     */
    public void setAppid(Long Appid) {
        this.Appid = Appid;
    }

    /**
     * Get The account ID. 
     * @return Uin The account ID.
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set The account ID.
     * @param Uin The account ID.
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get The consortium ID. 
     * @return ConsortiumId The consortium ID.
     */
    public Long getConsortiumId() {
        return this.ConsortiumId;
    }

    /**
     * Set The consortium ID.
     * @param ConsortiumId The consortium ID.
     */
    public void setConsortiumId(Long ConsortiumId) {
        this.ConsortiumId = ConsortiumId;
    }

    /**
     * Get The consortium name. 
     * @return ConsortiumName The consortium name.
     */
    public String getConsortiumName() {
        return this.ConsortiumName;
    }

    /**
     * Set The consortium name.
     * @param ConsortiumName The consortium name.
     */
    public void setConsortiumName(String ConsortiumName) {
        this.ConsortiumName = ConsortiumName;
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
     * Get The chain ID. 
     * @return ChainId The chain ID.
     */
    public String getChainId() {
        return this.ChainId;
    }

    /**
     * Set The chain ID.
     * @param ChainId The chain ID.
     */
    public void setChainId(String ChainId) {
        this.ChainId = ChainId;
    }

    /**
     * Get Whether you are the owner of the consortium. `1`: Yes; `0`: No. 
     * @return RoleType Whether you are the owner of the consortium. `1`: Yes; `0`: No.
     */
    public Long getRoleType() {
        return this.RoleType;
    }

    /**
     * Set Whether you are the owner of the consortium. `1`: Yes; `0`: No.
     * @param RoleType Whether you are the owner of the consortium. `1`: Yes; `0`: No.
     */
    public void setRoleType(Long RoleType) {
        this.RoleType = RoleType;
    }

    /**
     * Get The organization DID. 
     * @return AgencyDid The organization DID.
     */
    public String getAgencyDid() {
        return this.AgencyDid;
    }

    /**
     * Set The organization DID.
     * @param AgencyDid The organization DID.
     */
    public void setAgencyDid(String AgencyDid) {
        this.AgencyDid = AgencyDid;
    }

    /**
     * Get The organization name. 
     * @return CreateOrg The organization name.
     */
    public String getCreateOrg() {
        return this.CreateOrg;
    }

    /**
     * Set The organization name.
     * @param CreateOrg The organization name.
     */
    public void setCreateOrg(String CreateOrg) {
        this.CreateOrg = CreateOrg;
    }

    /**
     * Get The endpoint. 
     * @return Endpoint The endpoint.
     */
    public String getEndpoint() {
        return this.Endpoint;
    }

    /**
     * Set The endpoint.
     * @param Endpoint The endpoint.
     */
    public void setEndpoint(String Endpoint) {
        this.Endpoint = Endpoint;
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
     * Get The group name. 
     * @return GroupName The group name.
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set The group name.
     * @param GroupName The group name.
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    public DidServiceInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DidServiceInfo(DidServiceInfo source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Appid != null) {
            this.Appid = new Long(source.Appid);
        }
        if (source.Uin != null) {
            this.Uin = new String(source.Uin);
        }
        if (source.ConsortiumId != null) {
            this.ConsortiumId = new Long(source.ConsortiumId);
        }
        if (source.ConsortiumName != null) {
            this.ConsortiumName = new String(source.ConsortiumName);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.GroupId != null) {
            this.GroupId = new Long(source.GroupId);
        }
        if (source.ChainId != null) {
            this.ChainId = new String(source.ChainId);
        }
        if (source.RoleType != null) {
            this.RoleType = new Long(source.RoleType);
        }
        if (source.AgencyDid != null) {
            this.AgencyDid = new String(source.AgencyDid);
        }
        if (source.CreateOrg != null) {
            this.CreateOrg = new String(source.CreateOrg);
        }
        if (source.Endpoint != null) {
            this.Endpoint = new String(source.Endpoint);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.GroupName != null) {
            this.GroupName = new String(source.GroupName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Appid", this.Appid);
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "ConsortiumId", this.ConsortiumId);
        this.setParamSimple(map, prefix + "ConsortiumName", this.ConsortiumName);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "ChainId", this.ChainId);
        this.setParamSimple(map, prefix + "RoleType", this.RoleType);
        this.setParamSimple(map, prefix + "AgencyDid", this.AgencyDid);
        this.setParamSimple(map, prefix + "CreateOrg", this.CreateOrg);
        this.setParamSimple(map, prefix + "Endpoint", this.Endpoint);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);

    }
}

