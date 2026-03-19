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
package com.tencentcloudapi.organization.v20210331.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OrgIdentity extends AbstractModel {

    /**
    * Identity ID.
    */
    @SerializedName("IdentityId")
    @Expose
    private Long IdentityId;

    /**
    * Identity name.
    */
    @SerializedName("IdentityAliasName")
    @Expose
    private String IdentityAliasName;

    /**
    * Description.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Identity policy.
    */
    @SerializedName("IdentityPolicy")
    @Expose
    private IdentityPolicy [] IdentityPolicy;

    /**
    * Identity type. 1: preset; 2: custom.
    */
    @SerializedName("IdentityType")
    @Expose
    private Long IdentityType;

    /**
    * Update time.
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
     * Get Identity ID. 
     * @return IdentityId Identity ID.
     */
    public Long getIdentityId() {
        return this.IdentityId;
    }

    /**
     * Set Identity ID.
     * @param IdentityId Identity ID.
     */
    public void setIdentityId(Long IdentityId) {
        this.IdentityId = IdentityId;
    }

    /**
     * Get Identity name. 
     * @return IdentityAliasName Identity name.
     */
    public String getIdentityAliasName() {
        return this.IdentityAliasName;
    }

    /**
     * Set Identity name.
     * @param IdentityAliasName Identity name.
     */
    public void setIdentityAliasName(String IdentityAliasName) {
        this.IdentityAliasName = IdentityAliasName;
    }

    /**
     * Get Description. 
     * @return Description Description.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Description.
     * @param Description Description.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Identity policy. 
     * @return IdentityPolicy Identity policy.
     */
    public IdentityPolicy [] getIdentityPolicy() {
        return this.IdentityPolicy;
    }

    /**
     * Set Identity policy.
     * @param IdentityPolicy Identity policy.
     */
    public void setIdentityPolicy(IdentityPolicy [] IdentityPolicy) {
        this.IdentityPolicy = IdentityPolicy;
    }

    /**
     * Get Identity type. 1: preset; 2: custom. 
     * @return IdentityType Identity type. 1: preset; 2: custom.
     */
    public Long getIdentityType() {
        return this.IdentityType;
    }

    /**
     * Set Identity type. 1: preset; 2: custom.
     * @param IdentityType Identity type. 1: preset; 2: custom.
     */
    public void setIdentityType(Long IdentityType) {
        this.IdentityType = IdentityType;
    }

    /**
     * Get Update time. 
     * @return UpdateTime Update time.
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Update time.
     * @param UpdateTime Update time.
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public OrgIdentity() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OrgIdentity(OrgIdentity source) {
        if (source.IdentityId != null) {
            this.IdentityId = new Long(source.IdentityId);
        }
        if (source.IdentityAliasName != null) {
            this.IdentityAliasName = new String(source.IdentityAliasName);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.IdentityPolicy != null) {
            this.IdentityPolicy = new IdentityPolicy[source.IdentityPolicy.length];
            for (int i = 0; i < source.IdentityPolicy.length; i++) {
                this.IdentityPolicy[i] = new IdentityPolicy(source.IdentityPolicy[i]);
            }
        }
        if (source.IdentityType != null) {
            this.IdentityType = new Long(source.IdentityType);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IdentityId", this.IdentityId);
        this.setParamSimple(map, prefix + "IdentityAliasName", this.IdentityAliasName);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamArrayObj(map, prefix + "IdentityPolicy.", this.IdentityPolicy);
        this.setParamSimple(map, prefix + "IdentityType", this.IdentityType);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

