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

public class Contract extends AbstractModel {

    /**
    * The application name.
    */
    @SerializedName("ApplyName")
    @Expose
    private String ApplyName;

    /**
    * The contract status. `true`: Enabled; `false`: Not enabled.
    */
    @SerializedName("Enable")
    @Expose
    private Boolean Enable;

    /**
    * The CNS address of the contract.
    */
    @SerializedName("Hash")
    @Expose
    private String Hash;

    /**
    * The desensitized CNS address.
    */
    @SerializedName("HashShow")
    @Expose
    private String HashShow;

    /**
    * The DID of the organization that deployed the contract.
    */
    @SerializedName("WeId")
    @Expose
    private String WeId;

    /**
    * The name of the organization that deployed the contract.
    */
    @SerializedName("DeployName")
    @Expose
    private String DeployName;

    /**
    * The group.
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * The deployment time.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
     * Get The application name. 
     * @return ApplyName The application name.
     */
    public String getApplyName() {
        return this.ApplyName;
    }

    /**
     * Set The application name.
     * @param ApplyName The application name.
     */
    public void setApplyName(String ApplyName) {
        this.ApplyName = ApplyName;
    }

    /**
     * Get The contract status. `true`: Enabled; `false`: Not enabled. 
     * @return Enable The contract status. `true`: Enabled; `false`: Not enabled.
     */
    public Boolean getEnable() {
        return this.Enable;
    }

    /**
     * Set The contract status. `true`: Enabled; `false`: Not enabled.
     * @param Enable The contract status. `true`: Enabled; `false`: Not enabled.
     */
    public void setEnable(Boolean Enable) {
        this.Enable = Enable;
    }

    /**
     * Get The CNS address of the contract. 
     * @return Hash The CNS address of the contract.
     */
    public String getHash() {
        return this.Hash;
    }

    /**
     * Set The CNS address of the contract.
     * @param Hash The CNS address of the contract.
     */
    public void setHash(String Hash) {
        this.Hash = Hash;
    }

    /**
     * Get The desensitized CNS address. 
     * @return HashShow The desensitized CNS address.
     */
    public String getHashShow() {
        return this.HashShow;
    }

    /**
     * Set The desensitized CNS address.
     * @param HashShow The desensitized CNS address.
     */
    public void setHashShow(String HashShow) {
        this.HashShow = HashShow;
    }

    /**
     * Get The DID of the organization that deployed the contract. 
     * @return WeId The DID of the organization that deployed the contract.
     */
    public String getWeId() {
        return this.WeId;
    }

    /**
     * Set The DID of the organization that deployed the contract.
     * @param WeId The DID of the organization that deployed the contract.
     */
    public void setWeId(String WeId) {
        this.WeId = WeId;
    }

    /**
     * Get The name of the organization that deployed the contract. 
     * @return DeployName The name of the organization that deployed the contract.
     */
    public String getDeployName() {
        return this.DeployName;
    }

    /**
     * Set The name of the organization that deployed the contract.
     * @param DeployName The name of the organization that deployed the contract.
     */
    public void setDeployName(String DeployName) {
        this.DeployName = DeployName;
    }

    /**
     * Get The group. 
     * @return GroupId The group.
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set The group.
     * @param GroupId The group.
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get The deployment time. 
     * @return CreateTime The deployment time.
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set The deployment time.
     * @param CreateTime The deployment time.
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    public Contract() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Contract(Contract source) {
        if (source.ApplyName != null) {
            this.ApplyName = new String(source.ApplyName);
        }
        if (source.Enable != null) {
            this.Enable = new Boolean(source.Enable);
        }
        if (source.Hash != null) {
            this.Hash = new String(source.Hash);
        }
        if (source.HashShow != null) {
            this.HashShow = new String(source.HashShow);
        }
        if (source.WeId != null) {
            this.WeId = new String(source.WeId);
        }
        if (source.DeployName != null) {
            this.DeployName = new String(source.DeployName);
        }
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ApplyName", this.ApplyName);
        this.setParamSimple(map, prefix + "Enable", this.Enable);
        this.setParamSimple(map, prefix + "Hash", this.Hash);
        this.setParamSimple(map, prefix + "HashShow", this.HashShow);
        this.setParamSimple(map, prefix + "WeId", this.WeId);
        this.setParamSimple(map, prefix + "DeployName", this.DeployName);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);

    }
}

