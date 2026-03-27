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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class IPFilterPolicy extends AbstractModel {

    /**
    * IP access restriction status. Optional values:
<li>Enabled: enable;</li>
<li>Disabled: disable.</li>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * IP access restriction type:
<li>Black: blocklist-based verification. Only IP requests from the IPList will be blocked.</li>
<li>White: allowlist-based verification. Only IP requests from the IPList will be allowed.</li>When Status is set to Enabled, FilterType must be assigned.
    */
    @SerializedName("FilterType")
    @Expose
    private String FilterType;

    /**
    * IP list, supporting IPV4 addresses in X.X.X.X format, IPV6 addresses in X:X:X:X:X:X:X:X format, or CIDR notation /N (IPV4: 1 ≤ N ≤ 32; IPV6: 1 ≤ N ≤ 128). A maximum of 200 IPs or CIDR blocks can be added. When Status is set to Enabled, IPList must be assigned.
    */
    @SerializedName("IPList")
    @Expose
    private String [] IPList;

    /**
     * Get IP access restriction status. Optional values:
<li>Enabled: enable;</li>
<li>Disabled: disable.</li> 
     * @return Status IP access restriction status. Optional values:
<li>Enabled: enable;</li>
<li>Disabled: disable.</li>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set IP access restriction status. Optional values:
<li>Enabled: enable;</li>
<li>Disabled: disable.</li>
     * @param Status IP access restriction status. Optional values:
<li>Enabled: enable;</li>
<li>Disabled: disable.</li>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get IP access restriction type:
<li>Black: blocklist-based verification. Only IP requests from the IPList will be blocked.</li>
<li>White: allowlist-based verification. Only IP requests from the IPList will be allowed.</li>When Status is set to Enabled, FilterType must be assigned. 
     * @return FilterType IP access restriction type:
<li>Black: blocklist-based verification. Only IP requests from the IPList will be blocked.</li>
<li>White: allowlist-based verification. Only IP requests from the IPList will be allowed.</li>When Status is set to Enabled, FilterType must be assigned.
     */
    public String getFilterType() {
        return this.FilterType;
    }

    /**
     * Set IP access restriction type:
<li>Black: blocklist-based verification. Only IP requests from the IPList will be blocked.</li>
<li>White: allowlist-based verification. Only IP requests from the IPList will be allowed.</li>When Status is set to Enabled, FilterType must be assigned.
     * @param FilterType IP access restriction type:
<li>Black: blocklist-based verification. Only IP requests from the IPList will be blocked.</li>
<li>White: allowlist-based verification. Only IP requests from the IPList will be allowed.</li>When Status is set to Enabled, FilterType must be assigned.
     */
    public void setFilterType(String FilterType) {
        this.FilterType = FilterType;
    }

    /**
     * Get IP list, supporting IPV4 addresses in X.X.X.X format, IPV6 addresses in X:X:X:X:X:X:X:X format, or CIDR notation /N (IPV4: 1 ≤ N ≤ 32; IPV6: 1 ≤ N ≤ 128). A maximum of 200 IPs or CIDR blocks can be added. When Status is set to Enabled, IPList must be assigned. 
     * @return IPList IP list, supporting IPV4 addresses in X.X.X.X format, IPV6 addresses in X:X:X:X:X:X:X:X format, or CIDR notation /N (IPV4: 1 ≤ N ≤ 32; IPV6: 1 ≤ N ≤ 128). A maximum of 200 IPs or CIDR blocks can be added. When Status is set to Enabled, IPList must be assigned.
     */
    public String [] getIPList() {
        return this.IPList;
    }

    /**
     * Set IP list, supporting IPV4 addresses in X.X.X.X format, IPV6 addresses in X:X:X:X:X:X:X:X format, or CIDR notation /N (IPV4: 1 ≤ N ≤ 32; IPV6: 1 ≤ N ≤ 128). A maximum of 200 IPs or CIDR blocks can be added. When Status is set to Enabled, IPList must be assigned.
     * @param IPList IP list, supporting IPV4 addresses in X.X.X.X format, IPV6 addresses in X:X:X:X:X:X:X:X format, or CIDR notation /N (IPV4: 1 ≤ N ≤ 32; IPV6: 1 ≤ N ≤ 128). A maximum of 200 IPs or CIDR blocks can be added. When Status is set to Enabled, IPList must be assigned.
     */
    public void setIPList(String [] IPList) {
        this.IPList = IPList;
    }

    public IPFilterPolicy() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IPFilterPolicy(IPFilterPolicy source) {
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.FilterType != null) {
            this.FilterType = new String(source.FilterType);
        }
        if (source.IPList != null) {
            this.IPList = new String[source.IPList.length];
            for (int i = 0; i < source.IPList.length; i++) {
                this.IPList[i] = new String(source.IPList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "FilterType", this.FilterType);
        this.setParamArraySimple(map, prefix + "IPList.", this.IPList);

    }
}

