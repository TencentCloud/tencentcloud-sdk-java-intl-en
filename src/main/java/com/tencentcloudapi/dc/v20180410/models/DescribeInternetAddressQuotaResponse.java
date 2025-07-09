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
package com.tencentcloudapi.dc.v20180410.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeInternetAddressQuotaResponse extends AbstractModel {

    /**
    * Minimum prefix length allowed for a public IPv6 address
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("Ipv6PrefixLen")
    @Expose
    private Long Ipv6PrefixLen;

    /**
    * Quota of BGP IPv4 addresses
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("Ipv4BgpQuota")
    @Expose
    private Long Ipv4BgpQuota;

    /**
    * Quota of non-BGP IPv4 addresses
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("Ipv4OtherQuota")
    @Expose
    private Long Ipv4OtherQuota;

    /**
    * Used number of BGP IPv4 addresses
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("Ipv4BgpNum")
    @Expose
    private Long Ipv4BgpNum;

    /**
    * Used number of non-BGP IPv4 addresses
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("Ipv4OtherNum")
    @Expose
    private Long Ipv4OtherNum;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Minimum prefix length allowed for a public IPv6 address
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return Ipv6PrefixLen Minimum prefix length allowed for a public IPv6 address
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public Long getIpv6PrefixLen() {
        return this.Ipv6PrefixLen;
    }

    /**
     * Set Minimum prefix length allowed for a public IPv6 address
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param Ipv6PrefixLen Minimum prefix length allowed for a public IPv6 address
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setIpv6PrefixLen(Long Ipv6PrefixLen) {
        this.Ipv6PrefixLen = Ipv6PrefixLen;
    }

    /**
     * Get Quota of BGP IPv4 addresses
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return Ipv4BgpQuota Quota of BGP IPv4 addresses
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public Long getIpv4BgpQuota() {
        return this.Ipv4BgpQuota;
    }

    /**
     * Set Quota of BGP IPv4 addresses
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param Ipv4BgpQuota Quota of BGP IPv4 addresses
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setIpv4BgpQuota(Long Ipv4BgpQuota) {
        this.Ipv4BgpQuota = Ipv4BgpQuota;
    }

    /**
     * Get Quota of non-BGP IPv4 addresses
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return Ipv4OtherQuota Quota of non-BGP IPv4 addresses
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public Long getIpv4OtherQuota() {
        return this.Ipv4OtherQuota;
    }

    /**
     * Set Quota of non-BGP IPv4 addresses
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param Ipv4OtherQuota Quota of non-BGP IPv4 addresses
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setIpv4OtherQuota(Long Ipv4OtherQuota) {
        this.Ipv4OtherQuota = Ipv4OtherQuota;
    }

    /**
     * Get Used number of BGP IPv4 addresses
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return Ipv4BgpNum Used number of BGP IPv4 addresses
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public Long getIpv4BgpNum() {
        return this.Ipv4BgpNum;
    }

    /**
     * Set Used number of BGP IPv4 addresses
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param Ipv4BgpNum Used number of BGP IPv4 addresses
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setIpv4BgpNum(Long Ipv4BgpNum) {
        this.Ipv4BgpNum = Ipv4BgpNum;
    }

    /**
     * Get Used number of non-BGP IPv4 addresses
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return Ipv4OtherNum Used number of non-BGP IPv4 addresses
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public Long getIpv4OtherNum() {
        return this.Ipv4OtherNum;
    }

    /**
     * Set Used number of non-BGP IPv4 addresses
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param Ipv4OtherNum Used number of non-BGP IPv4 addresses
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setIpv4OtherNum(Long Ipv4OtherNum) {
        this.Ipv4OtherNum = Ipv4OtherNum;
    }

    /**
     * Get The unique request ID, which is returned for each request. RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     * @param RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeInternetAddressQuotaResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeInternetAddressQuotaResponse(DescribeInternetAddressQuotaResponse source) {
        if (source.Ipv6PrefixLen != null) {
            this.Ipv6PrefixLen = new Long(source.Ipv6PrefixLen);
        }
        if (source.Ipv4BgpQuota != null) {
            this.Ipv4BgpQuota = new Long(source.Ipv4BgpQuota);
        }
        if (source.Ipv4OtherQuota != null) {
            this.Ipv4OtherQuota = new Long(source.Ipv4OtherQuota);
        }
        if (source.Ipv4BgpNum != null) {
            this.Ipv4BgpNum = new Long(source.Ipv4BgpNum);
        }
        if (source.Ipv4OtherNum != null) {
            this.Ipv4OtherNum = new Long(source.Ipv4OtherNum);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Ipv6PrefixLen", this.Ipv6PrefixLen);
        this.setParamSimple(map, prefix + "Ipv4BgpQuota", this.Ipv4BgpQuota);
        this.setParamSimple(map, prefix + "Ipv4OtherQuota", this.Ipv4OtherQuota);
        this.setParamSimple(map, prefix + "Ipv4BgpNum", this.Ipv4BgpNum);
        this.setParamSimple(map, prefix + "Ipv4OtherNum", this.Ipv4OtherNum);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

