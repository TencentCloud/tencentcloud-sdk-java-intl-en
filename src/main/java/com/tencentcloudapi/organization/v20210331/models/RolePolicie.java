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
package com.tencentcloudapi.organization.v20210331.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RolePolicie extends AbstractModel {

    /**
    * Policy ID.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RolePolicyId")
    @Expose
    private Long RolePolicyId;

    /**
    * Permission policy name.
    */
    @SerializedName("RolePolicyName")
    @Expose
    private String RolePolicyName;

    /**
    * Permission policy type.
    */
    @SerializedName("RolePolicyType")
    @Expose
    private String RolePolicyType;

    /**
    * Custom policy content. This parameter is only returned for custom policies.
    */
    @SerializedName("RolePolicyDocument")
    @Expose
    private String RolePolicyDocument;

    /**
    * The time when the permission policy is added to the permission configuration.
    */
    @SerializedName("AddTime")
    @Expose
    private String AddTime;

    /**
     * Get Policy ID.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RolePolicyId Policy ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getRolePolicyId() {
        return this.RolePolicyId;
    }

    /**
     * Set Policy ID.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RolePolicyId Policy ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRolePolicyId(Long RolePolicyId) {
        this.RolePolicyId = RolePolicyId;
    }

    /**
     * Get Permission policy name. 
     * @return RolePolicyName Permission policy name.
     */
    public String getRolePolicyName() {
        return this.RolePolicyName;
    }

    /**
     * Set Permission policy name.
     * @param RolePolicyName Permission policy name.
     */
    public void setRolePolicyName(String RolePolicyName) {
        this.RolePolicyName = RolePolicyName;
    }

    /**
     * Get Permission policy type. 
     * @return RolePolicyType Permission policy type.
     */
    public String getRolePolicyType() {
        return this.RolePolicyType;
    }

    /**
     * Set Permission policy type.
     * @param RolePolicyType Permission policy type.
     */
    public void setRolePolicyType(String RolePolicyType) {
        this.RolePolicyType = RolePolicyType;
    }

    /**
     * Get Custom policy content. This parameter is only returned for custom policies. 
     * @return RolePolicyDocument Custom policy content. This parameter is only returned for custom policies.
     */
    public String getRolePolicyDocument() {
        return this.RolePolicyDocument;
    }

    /**
     * Set Custom policy content. This parameter is only returned for custom policies.
     * @param RolePolicyDocument Custom policy content. This parameter is only returned for custom policies.
     */
    public void setRolePolicyDocument(String RolePolicyDocument) {
        this.RolePolicyDocument = RolePolicyDocument;
    }

    /**
     * Get The time when the permission policy is added to the permission configuration. 
     * @return AddTime The time when the permission policy is added to the permission configuration.
     */
    public String getAddTime() {
        return this.AddTime;
    }

    /**
     * Set The time when the permission policy is added to the permission configuration.
     * @param AddTime The time when the permission policy is added to the permission configuration.
     */
    public void setAddTime(String AddTime) {
        this.AddTime = AddTime;
    }

    public RolePolicie() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RolePolicie(RolePolicie source) {
        if (source.RolePolicyId != null) {
            this.RolePolicyId = new Long(source.RolePolicyId);
        }
        if (source.RolePolicyName != null) {
            this.RolePolicyName = new String(source.RolePolicyName);
        }
        if (source.RolePolicyType != null) {
            this.RolePolicyType = new String(source.RolePolicyType);
        }
        if (source.RolePolicyDocument != null) {
            this.RolePolicyDocument = new String(source.RolePolicyDocument);
        }
        if (source.AddTime != null) {
            this.AddTime = new String(source.AddTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RolePolicyId", this.RolePolicyId);
        this.setParamSimple(map, prefix + "RolePolicyName", this.RolePolicyName);
        this.setParamSimple(map, prefix + "RolePolicyType", this.RolePolicyType);
        this.setParamSimple(map, prefix + "RolePolicyDocument", this.RolePolicyDocument);
        this.setParamSimple(map, prefix + "AddTime", this.AddTime);

    }
}

