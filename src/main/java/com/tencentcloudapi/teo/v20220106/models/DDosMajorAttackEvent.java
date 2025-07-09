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
package com.tencentcloudapi.teo.v20220106.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DDosMajorAttackEvent extends AbstractModel {

    /**
    * DDoS policy group ID
    */
    @SerializedName("PolicyId")
    @Expose
    private Long PolicyId;

    /**
    * Maximum attack bandwidth
    */
    @SerializedName("AttackMaxBandWidth")
    @Expose
    private Long AttackMaxBandWidth;

    /**
    * Attack time in seconds
    */
    @SerializedName("AttackTime")
    @Expose
    private Long AttackTime;

    /**
     * Get DDoS policy group ID 
     * @return PolicyId DDoS policy group ID
     */
    public Long getPolicyId() {
        return this.PolicyId;
    }

    /**
     * Set DDoS policy group ID
     * @param PolicyId DDoS policy group ID
     */
    public void setPolicyId(Long PolicyId) {
        this.PolicyId = PolicyId;
    }

    /**
     * Get Maximum attack bandwidth 
     * @return AttackMaxBandWidth Maximum attack bandwidth
     */
    public Long getAttackMaxBandWidth() {
        return this.AttackMaxBandWidth;
    }

    /**
     * Set Maximum attack bandwidth
     * @param AttackMaxBandWidth Maximum attack bandwidth
     */
    public void setAttackMaxBandWidth(Long AttackMaxBandWidth) {
        this.AttackMaxBandWidth = AttackMaxBandWidth;
    }

    /**
     * Get Attack time in seconds 
     * @return AttackTime Attack time in seconds
     */
    public Long getAttackTime() {
        return this.AttackTime;
    }

    /**
     * Set Attack time in seconds
     * @param AttackTime Attack time in seconds
     */
    public void setAttackTime(Long AttackTime) {
        this.AttackTime = AttackTime;
    }

    public DDosMajorAttackEvent() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DDosMajorAttackEvent(DDosMajorAttackEvent source) {
        if (source.PolicyId != null) {
            this.PolicyId = new Long(source.PolicyId);
        }
        if (source.AttackMaxBandWidth != null) {
            this.AttackMaxBandWidth = new Long(source.AttackMaxBandWidth);
        }
        if (source.AttackTime != null) {
            this.AttackTime = new Long(source.AttackTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PolicyId", this.PolicyId);
        this.setParamSimple(map, prefix + "AttackMaxBandWidth", this.AttackMaxBandWidth);
        this.setParamSimple(map, prefix + "AttackTime", this.AttackTime);

    }
}

