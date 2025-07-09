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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ComplianceBenchmarkStandard extends AbstractModel {

    /**
    * Compliance standard ID
    */
    @SerializedName("StandardId")
    @Expose
    private Long StandardId;

    /**
    * Compliance standard name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Number of items contained in the compliance standard
    */
    @SerializedName("PolicyItemCount")
    @Expose
    private Long PolicyItemCount;

    /**
    * Whether to enable the standard
    */
    @SerializedName("Enabled")
    @Expose
    private Boolean Enabled;

    /**
    * Description of the standard
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
     * Get Compliance standard ID 
     * @return StandardId Compliance standard ID
     */
    public Long getStandardId() {
        return this.StandardId;
    }

    /**
     * Set Compliance standard ID
     * @param StandardId Compliance standard ID
     */
    public void setStandardId(Long StandardId) {
        this.StandardId = StandardId;
    }

    /**
     * Get Compliance standard name 
     * @return Name Compliance standard name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Compliance standard name
     * @param Name Compliance standard name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Number of items contained in the compliance standard 
     * @return PolicyItemCount Number of items contained in the compliance standard
     */
    public Long getPolicyItemCount() {
        return this.PolicyItemCount;
    }

    /**
     * Set Number of items contained in the compliance standard
     * @param PolicyItemCount Number of items contained in the compliance standard
     */
    public void setPolicyItemCount(Long PolicyItemCount) {
        this.PolicyItemCount = PolicyItemCount;
    }

    /**
     * Get Whether to enable the standard 
     * @return Enabled Whether to enable the standard
     */
    public Boolean getEnabled() {
        return this.Enabled;
    }

    /**
     * Set Whether to enable the standard
     * @param Enabled Whether to enable the standard
     */
    public void setEnabled(Boolean Enabled) {
        this.Enabled = Enabled;
    }

    /**
     * Get Description of the standard 
     * @return Description Description of the standard
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Description of the standard
     * @param Description Description of the standard
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    public ComplianceBenchmarkStandard() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ComplianceBenchmarkStandard(ComplianceBenchmarkStandard source) {
        if (source.StandardId != null) {
            this.StandardId = new Long(source.StandardId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.PolicyItemCount != null) {
            this.PolicyItemCount = new Long(source.PolicyItemCount);
        }
        if (source.Enabled != null) {
            this.Enabled = new Boolean(source.Enabled);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StandardId", this.StandardId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "PolicyItemCount", this.PolicyItemCount);
        this.setParamSimple(map, prefix + "Enabled", this.Enabled);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

