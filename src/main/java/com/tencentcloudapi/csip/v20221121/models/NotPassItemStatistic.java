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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class NotPassItemStatistic extends AbstractModel {

    /**
    * Policy type. Valid values: SYSTEM (system policy), SELF (custom policy).
    */
    @SerializedName("PolicyType")
    @Expose
    private String PolicyType;

    /**
    * Policy ID. 0 for a SYSTEM policy.
    */
    @SerializedName("PolicyID")
    @Expose
    private Long PolicyID;

    /**
    * Parent category ID. 0 for SELF policies.
    */
    @SerializedName("ParentCategoryID")
    @Expose
    private Long ParentCategoryID;

    /**
    * Number of failed check items under this policy.
    */
    @SerializedName("NotPassCount")
    @Expose
    private Long NotPassCount;

    /**
    * Policy or category name. SYSTEM takes the parent category name, and SELF takes the policy name.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
     * Get Policy type. Valid values: SYSTEM (system policy), SELF (custom policy). 
     * @return PolicyType Policy type. Valid values: SYSTEM (system policy), SELF (custom policy).
     */
    public String getPolicyType() {
        return this.PolicyType;
    }

    /**
     * Set Policy type. Valid values: SYSTEM (system policy), SELF (custom policy).
     * @param PolicyType Policy type. Valid values: SYSTEM (system policy), SELF (custom policy).
     */
    public void setPolicyType(String PolicyType) {
        this.PolicyType = PolicyType;
    }

    /**
     * Get Policy ID. 0 for a SYSTEM policy. 
     * @return PolicyID Policy ID. 0 for a SYSTEM policy.
     */
    public Long getPolicyID() {
        return this.PolicyID;
    }

    /**
     * Set Policy ID. 0 for a SYSTEM policy.
     * @param PolicyID Policy ID. 0 for a SYSTEM policy.
     */
    public void setPolicyID(Long PolicyID) {
        this.PolicyID = PolicyID;
    }

    /**
     * Get Parent category ID. 0 for SELF policies. 
     * @return ParentCategoryID Parent category ID. 0 for SELF policies.
     */
    public Long getParentCategoryID() {
        return this.ParentCategoryID;
    }

    /**
     * Set Parent category ID. 0 for SELF policies.
     * @param ParentCategoryID Parent category ID. 0 for SELF policies.
     */
    public void setParentCategoryID(Long ParentCategoryID) {
        this.ParentCategoryID = ParentCategoryID;
    }

    /**
     * Get Number of failed check items under this policy. 
     * @return NotPassCount Number of failed check items under this policy.
     */
    public Long getNotPassCount() {
        return this.NotPassCount;
    }

    /**
     * Set Number of failed check items under this policy.
     * @param NotPassCount Number of failed check items under this policy.
     */
    public void setNotPassCount(Long NotPassCount) {
        this.NotPassCount = NotPassCount;
    }

    /**
     * Get Policy or category name. SYSTEM takes the parent category name, and SELF takes the policy name. 
     * @return Name Policy or category name. SYSTEM takes the parent category name, and SELF takes the policy name.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Policy or category name. SYSTEM takes the parent category name, and SELF takes the policy name.
     * @param Name Policy or category name. SYSTEM takes the parent category name, and SELF takes the policy name.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    public NotPassItemStatistic() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NotPassItemStatistic(NotPassItemStatistic source) {
        if (source.PolicyType != null) {
            this.PolicyType = new String(source.PolicyType);
        }
        if (source.PolicyID != null) {
            this.PolicyID = new Long(source.PolicyID);
        }
        if (source.ParentCategoryID != null) {
            this.ParentCategoryID = new Long(source.ParentCategoryID);
        }
        if (source.NotPassCount != null) {
            this.NotPassCount = new Long(source.NotPassCount);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PolicyType", this.PolicyType);
        this.setParamSimple(map, prefix + "PolicyID", this.PolicyID);
        this.setParamSimple(map, prefix + "ParentCategoryID", this.ParentCategoryID);
        this.setParamSimple(map, prefix + "NotPassCount", this.NotPassCount);
        this.setParamSimple(map, prefix + "Name", this.Name);

    }
}

