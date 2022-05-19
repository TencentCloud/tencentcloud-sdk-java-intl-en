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
package com.tencentcloudapi.clb.v20180317.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Quota extends AbstractModel{

    /**
    * Quota name. Valid values:
<li> `TOTAL_OPEN_CLB_QUOTA`: Quota of public network CLB instances in the current region</li>
<li> `TOTAL_INTERNAL_CLB_QUOTA`: Quota of private network CLB instances in the current region</li>
<li> `TOTAL_LISTENER_QUOTA`: Quota of listeners under one CLB instance</li>
<li> `TOTAL_LISTENER_RULE_QUOTA`: Quota of forwarding rules under one listener</li>
<li> `TOTAL_TARGET_BIND_QUOTA`: Quota of CVM instances can be bound under one forwarding rule</li>
<li> `TOTAL_SNAP_IP_QUOTA`: Quota of SNAT IPs for cross-region binding 2.0 under one CLB instance </li>
<li> `TOTAL_ISP_CLB_QUOTA`: Quota of triple-ISP (CMCC/CUCC/CTCC) CLB instances in the current region</li>
    */
    @SerializedName("QuotaId")
    @Expose
    private String QuotaId;

    /**
    * Currently used quantity. If it is `null`, it is meaningless.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("QuotaCurrent")
    @Expose
    private Long QuotaCurrent;

    /**
    * Quota limit.
    */
    @SerializedName("QuotaLimit")
    @Expose
    private Long QuotaLimit;

    /**
     * Get Quota name. Valid values:
<li> `TOTAL_OPEN_CLB_QUOTA`: Quota of public network CLB instances in the current region</li>
<li> `TOTAL_INTERNAL_CLB_QUOTA`: Quota of private network CLB instances in the current region</li>
<li> `TOTAL_LISTENER_QUOTA`: Quota of listeners under one CLB instance</li>
<li> `TOTAL_LISTENER_RULE_QUOTA`: Quota of forwarding rules under one listener</li>
<li> `TOTAL_TARGET_BIND_QUOTA`: Quota of CVM instances can be bound under one forwarding rule</li>
<li> `TOTAL_SNAP_IP_QUOTA`: Quota of SNAT IPs for cross-region binding 2.0 under one CLB instance </li>
<li> `TOTAL_ISP_CLB_QUOTA`: Quota of triple-ISP (CMCC/CUCC/CTCC) CLB instances in the current region</li> 
     * @return QuotaId Quota name. Valid values:
<li> `TOTAL_OPEN_CLB_QUOTA`: Quota of public network CLB instances in the current region</li>
<li> `TOTAL_INTERNAL_CLB_QUOTA`: Quota of private network CLB instances in the current region</li>
<li> `TOTAL_LISTENER_QUOTA`: Quota of listeners under one CLB instance</li>
<li> `TOTAL_LISTENER_RULE_QUOTA`: Quota of forwarding rules under one listener</li>
<li> `TOTAL_TARGET_BIND_QUOTA`: Quota of CVM instances can be bound under one forwarding rule</li>
<li> `TOTAL_SNAP_IP_QUOTA`: Quota of SNAT IPs for cross-region binding 2.0 under one CLB instance </li>
<li> `TOTAL_ISP_CLB_QUOTA`: Quota of triple-ISP (CMCC/CUCC/CTCC) CLB instances in the current region</li>
     */
    public String getQuotaId() {
        return this.QuotaId;
    }

    /**
     * Set Quota name. Valid values:
<li> `TOTAL_OPEN_CLB_QUOTA`: Quota of public network CLB instances in the current region</li>
<li> `TOTAL_INTERNAL_CLB_QUOTA`: Quota of private network CLB instances in the current region</li>
<li> `TOTAL_LISTENER_QUOTA`: Quota of listeners under one CLB instance</li>
<li> `TOTAL_LISTENER_RULE_QUOTA`: Quota of forwarding rules under one listener</li>
<li> `TOTAL_TARGET_BIND_QUOTA`: Quota of CVM instances can be bound under one forwarding rule</li>
<li> `TOTAL_SNAP_IP_QUOTA`: Quota of SNAT IPs for cross-region binding 2.0 under one CLB instance </li>
<li> `TOTAL_ISP_CLB_QUOTA`: Quota of triple-ISP (CMCC/CUCC/CTCC) CLB instances in the current region</li>
     * @param QuotaId Quota name. Valid values:
<li> `TOTAL_OPEN_CLB_QUOTA`: Quota of public network CLB instances in the current region</li>
<li> `TOTAL_INTERNAL_CLB_QUOTA`: Quota of private network CLB instances in the current region</li>
<li> `TOTAL_LISTENER_QUOTA`: Quota of listeners under one CLB instance</li>
<li> `TOTAL_LISTENER_RULE_QUOTA`: Quota of forwarding rules under one listener</li>
<li> `TOTAL_TARGET_BIND_QUOTA`: Quota of CVM instances can be bound under one forwarding rule</li>
<li> `TOTAL_SNAP_IP_QUOTA`: Quota of SNAT IPs for cross-region binding 2.0 under one CLB instance </li>
<li> `TOTAL_ISP_CLB_QUOTA`: Quota of triple-ISP (CMCC/CUCC/CTCC) CLB instances in the current region</li>
     */
    public void setQuotaId(String QuotaId) {
        this.QuotaId = QuotaId;
    }

    /**
     * Get Currently used quantity. If it is `null`, it is meaningless.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return QuotaCurrent Currently used quantity. If it is `null`, it is meaningless.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getQuotaCurrent() {
        return this.QuotaCurrent;
    }

    /**
     * Set Currently used quantity. If it is `null`, it is meaningless.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param QuotaCurrent Currently used quantity. If it is `null`, it is meaningless.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setQuotaCurrent(Long QuotaCurrent) {
        this.QuotaCurrent = QuotaCurrent;
    }

    /**
     * Get Quota limit. 
     * @return QuotaLimit Quota limit.
     */
    public Long getQuotaLimit() {
        return this.QuotaLimit;
    }

    /**
     * Set Quota limit.
     * @param QuotaLimit Quota limit.
     */
    public void setQuotaLimit(Long QuotaLimit) {
        this.QuotaLimit = QuotaLimit;
    }

    public Quota() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Quota(Quota source) {
        if (source.QuotaId != null) {
            this.QuotaId = new String(source.QuotaId);
        }
        if (source.QuotaCurrent != null) {
            this.QuotaCurrent = new Long(source.QuotaCurrent);
        }
        if (source.QuotaLimit != null) {
            this.QuotaLimit = new Long(source.QuotaLimit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "QuotaId", this.QuotaId);
        this.setParamSimple(map, prefix + "QuotaCurrent", this.QuotaCurrent);
        this.setParamSimple(map, prefix + "QuotaLimit", this.QuotaLimit);

    }
}

