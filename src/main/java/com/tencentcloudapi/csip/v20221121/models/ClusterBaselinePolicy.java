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

public class ClusterBaselinePolicy extends AbstractModel {

    /**
    * <p>Baseline policy ID.</p>
    */
    @SerializedName("PolicyID")
    @Expose
    private Long PolicyID;

    /**
    * <p>Baseline policy name.</p>
    */
    @SerializedName("PolicyName")
    @Expose
    private String PolicyName;

    /**
    * <p>Asset type to detect.<br>Enumeration values:<br>HOST: host<br>CLUSTER: container cluster</p>
    */
    @SerializedName("CheckAssetType")
    @Expose
    private String CheckAssetType;

    /**
    * <p>Baseline system parent category ID.</p>
    */
    @SerializedName("ParentCategoryID")
    @Expose
    private Long ParentCategoryID;

    /**
    * <p>Whether it is a system baseline policy. true means system policy, false means custom policy.</p>
    */
    @SerializedName("IsSystem")
    @Expose
    private Boolean IsSystem;

    /**
     * Get <p>Baseline policy ID.</p> 
     * @return PolicyID <p>Baseline policy ID.</p>
     */
    public Long getPolicyID() {
        return this.PolicyID;
    }

    /**
     * Set <p>Baseline policy ID.</p>
     * @param PolicyID <p>Baseline policy ID.</p>
     */
    public void setPolicyID(Long PolicyID) {
        this.PolicyID = PolicyID;
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
     * Get <p>Asset type to detect.<br>Enumeration values:<br>HOST: host<br>CLUSTER: container cluster</p> 
     * @return CheckAssetType <p>Asset type to detect.<br>Enumeration values:<br>HOST: host<br>CLUSTER: container cluster</p>
     */
    public String getCheckAssetType() {
        return this.CheckAssetType;
    }

    /**
     * Set <p>Asset type to detect.<br>Enumeration values:<br>HOST: host<br>CLUSTER: container cluster</p>
     * @param CheckAssetType <p>Asset type to detect.<br>Enumeration values:<br>HOST: host<br>CLUSTER: container cluster</p>
     */
    public void setCheckAssetType(String CheckAssetType) {
        this.CheckAssetType = CheckAssetType;
    }

    /**
     * Get <p>Baseline system parent category ID.</p> 
     * @return ParentCategoryID <p>Baseline system parent category ID.</p>
     */
    public Long getParentCategoryID() {
        return this.ParentCategoryID;
    }

    /**
     * Set <p>Baseline system parent category ID.</p>
     * @param ParentCategoryID <p>Baseline system parent category ID.</p>
     */
    public void setParentCategoryID(Long ParentCategoryID) {
        this.ParentCategoryID = ParentCategoryID;
    }

    /**
     * Get <p>Whether it is a system baseline policy. true means system policy, false means custom policy.</p> 
     * @return IsSystem <p>Whether it is a system baseline policy. true means system policy, false means custom policy.</p>
     */
    public Boolean getIsSystem() {
        return this.IsSystem;
    }

    /**
     * Set <p>Whether it is a system baseline policy. true means system policy, false means custom policy.</p>
     * @param IsSystem <p>Whether it is a system baseline policy. true means system policy, false means custom policy.</p>
     */
    public void setIsSystem(Boolean IsSystem) {
        this.IsSystem = IsSystem;
    }

    public ClusterBaselinePolicy() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ClusterBaselinePolicy(ClusterBaselinePolicy source) {
        if (source.PolicyID != null) {
            this.PolicyID = new Long(source.PolicyID);
        }
        if (source.PolicyName != null) {
            this.PolicyName = new String(source.PolicyName);
        }
        if (source.CheckAssetType != null) {
            this.CheckAssetType = new String(source.CheckAssetType);
        }
        if (source.ParentCategoryID != null) {
            this.ParentCategoryID = new Long(source.ParentCategoryID);
        }
        if (source.IsSystem != null) {
            this.IsSystem = new Boolean(source.IsSystem);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PolicyID", this.PolicyID);
        this.setParamSimple(map, prefix + "PolicyName", this.PolicyName);
        this.setParamSimple(map, prefix + "CheckAssetType", this.CheckAssetType);
        this.setParamSimple(map, prefix + "ParentCategoryID", this.ParentCategoryID);
        this.setParamSimple(map, prefix + "IsSystem", this.IsSystem);

    }
}

