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

public class BaselinePolicyBrief extends AbstractModel {

    /**
    * <p>Baseline policy ID.</p>
    */
    @SerializedName("ID")
    @Expose
    private Long ID;

    /**
    * <p>Baseline policy name.</p>
    */
    @SerializedName("PolicyName")
    @Expose
    private String PolicyName;

    /**
    * <p>Whether it is a system built-in policy. true indicates yes, false indicates no (user-defined policy).</p>
    */
    @SerializedName("IsSystem")
    @Expose
    private Boolean IsSystem;

    /**
     * Get <p>Baseline policy ID.</p> 
     * @return ID <p>Baseline policy ID.</p>
     */
    public Long getID() {
        return this.ID;
    }

    /**
     * Set <p>Baseline policy ID.</p>
     * @param ID <p>Baseline policy ID.</p>
     */
    public void setID(Long ID) {
        this.ID = ID;
    }

    /**
     * Get <p>Baseline policy name.</p> 
     * @return PolicyName <p>Baseline policy name.</p>
     */
    public String getPolicyName() {
        return this.PolicyName;
    }

    /**
     * Set <p>Baseline policy name.</p>
     * @param PolicyName <p>Baseline policy name.</p>
     */
    public void setPolicyName(String PolicyName) {
        this.PolicyName = PolicyName;
    }

    /**
     * Get <p>Whether it is a system built-in policy. true indicates yes, false indicates no (user-defined policy).</p> 
     * @return IsSystem <p>Whether it is a system built-in policy. true indicates yes, false indicates no (user-defined policy).</p>
     */
    public Boolean getIsSystem() {
        return this.IsSystem;
    }

    /**
     * Set <p>Whether it is a system built-in policy. true indicates yes, false indicates no (user-defined policy).</p>
     * @param IsSystem <p>Whether it is a system built-in policy. true indicates yes, false indicates no (user-defined policy).</p>
     */
    public void setIsSystem(Boolean IsSystem) {
        this.IsSystem = IsSystem;
    }

    public BaselinePolicyBrief() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BaselinePolicyBrief(BaselinePolicyBrief source) {
        if (source.ID != null) {
            this.ID = new Long(source.ID);
        }
        if (source.PolicyName != null) {
            this.PolicyName = new String(source.PolicyName);
        }
        if (source.IsSystem != null) {
            this.IsSystem = new Boolean(source.IsSystem);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamSimple(map, prefix + "PolicyName", this.PolicyName);
        this.setParamSimple(map, prefix + "IsSystem", this.IsSystem);

    }
}

