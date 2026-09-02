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

public class ScanBaselinePolicyListRequest extends AbstractModel {

    /**
    * <p>Baseline policy type. Values:</p><ul><li>SYSTEM: system policy (CSIP built-in)</li><li>SELF: user-defined policy</li></ul>
    */
    @SerializedName("PolicyType")
    @Expose
    private String PolicyType;

    /**
    * <p>List of baseline policy IDs to rescan. It cannot be empty and 0 is not allowed as an element.</p>
    */
    @SerializedName("PolicyIDList")
    @Expose
    private Long [] PolicyIDList;

    /**
    * <p>Group account member id</p>
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
     * Get <p>Baseline policy type. Values:</p><ul><li>SYSTEM: system policy (CSIP built-in)</li><li>SELF: user-defined policy</li></ul> 
     * @return PolicyType <p>Baseline policy type. Values:</p><ul><li>SYSTEM: system policy (CSIP built-in)</li><li>SELF: user-defined policy</li></ul>
     */
    public String getPolicyType() {
        return this.PolicyType;
    }

    /**
     * Set <p>Baseline policy type. Values:</p><ul><li>SYSTEM: system policy (CSIP built-in)</li><li>SELF: user-defined policy</li></ul>
     * @param PolicyType <p>Baseline policy type. Values:</p><ul><li>SYSTEM: system policy (CSIP built-in)</li><li>SELF: user-defined policy</li></ul>
     */
    public void setPolicyType(String PolicyType) {
        this.PolicyType = PolicyType;
    }

    /**
     * Get <p>List of baseline policy IDs to rescan. It cannot be empty and 0 is not allowed as an element.</p> 
     * @return PolicyIDList <p>List of baseline policy IDs to rescan. It cannot be empty and 0 is not allowed as an element.</p>
     */
    public Long [] getPolicyIDList() {
        return this.PolicyIDList;
    }

    /**
     * Set <p>List of baseline policy IDs to rescan. It cannot be empty and 0 is not allowed as an element.</p>
     * @param PolicyIDList <p>List of baseline policy IDs to rescan. It cannot be empty and 0 is not allowed as an element.</p>
     */
    public void setPolicyIDList(Long [] PolicyIDList) {
        this.PolicyIDList = PolicyIDList;
    }

    /**
     * Get <p>Group account member id</p> 
     * @return MemberId <p>Group account member id</p>
     */
    public String [] getMemberId() {
        return this.MemberId;
    }

    /**
     * Set <p>Group account member id</p>
     * @param MemberId <p>Group account member id</p>
     */
    public void setMemberId(String [] MemberId) {
        this.MemberId = MemberId;
    }

    public ScanBaselinePolicyListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ScanBaselinePolicyListRequest(ScanBaselinePolicyListRequest source) {
        if (source.PolicyType != null) {
            this.PolicyType = new String(source.PolicyType);
        }
        if (source.PolicyIDList != null) {
            this.PolicyIDList = new Long[source.PolicyIDList.length];
            for (int i = 0; i < source.PolicyIDList.length; i++) {
                this.PolicyIDList[i] = new Long(source.PolicyIDList[i]);
            }
        }
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PolicyType", this.PolicyType);
        this.setParamArraySimple(map, prefix + "PolicyIDList.", this.PolicyIDList);
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);

    }
}

