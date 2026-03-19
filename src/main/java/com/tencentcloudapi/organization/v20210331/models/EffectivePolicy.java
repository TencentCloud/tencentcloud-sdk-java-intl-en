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

public class EffectivePolicy extends AbstractModel {

    /**
    * Target ID.
    */
    @SerializedName("TargetId")
    @Expose
    private Long TargetId;

    /**
    * Effective policy content.
    */
    @SerializedName("PolicyContent")
    @Expose
    private String PolicyContent;

    /**
    * Effective policy update time.
    */
    @SerializedName("LastUpdatedTimestamp")
    @Expose
    private Long LastUpdatedTimestamp;

    /**
     * Get Target ID. 
     * @return TargetId Target ID.
     */
    public Long getTargetId() {
        return this.TargetId;
    }

    /**
     * Set Target ID.
     * @param TargetId Target ID.
     */
    public void setTargetId(Long TargetId) {
        this.TargetId = TargetId;
    }

    /**
     * Get Effective policy content. 
     * @return PolicyContent Effective policy content.
     */
    public String getPolicyContent() {
        return this.PolicyContent;
    }

    /**
     * Set Effective policy content.
     * @param PolicyContent Effective policy content.
     */
    public void setPolicyContent(String PolicyContent) {
        this.PolicyContent = PolicyContent;
    }

    /**
     * Get Effective policy update time. 
     * @return LastUpdatedTimestamp Effective policy update time.
     */
    public Long getLastUpdatedTimestamp() {
        return this.LastUpdatedTimestamp;
    }

    /**
     * Set Effective policy update time.
     * @param LastUpdatedTimestamp Effective policy update time.
     */
    public void setLastUpdatedTimestamp(Long LastUpdatedTimestamp) {
        this.LastUpdatedTimestamp = LastUpdatedTimestamp;
    }

    public EffectivePolicy() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EffectivePolicy(EffectivePolicy source) {
        if (source.TargetId != null) {
            this.TargetId = new Long(source.TargetId);
        }
        if (source.PolicyContent != null) {
            this.PolicyContent = new String(source.PolicyContent);
        }
        if (source.LastUpdatedTimestamp != null) {
            this.LastUpdatedTimestamp = new Long(source.LastUpdatedTimestamp);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TargetId", this.TargetId);
        this.setParamSimple(map, prefix + "PolicyContent", this.PolicyContent);
        this.setParamSimple(map, prefix + "LastUpdatedTimestamp", this.LastUpdatedTimestamp);

    }
}

