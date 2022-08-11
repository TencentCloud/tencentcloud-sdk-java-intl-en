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
package com.tencentcloudapi.teo.v20220106.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeApplicationProxyResponse extends AbstractModel{

    /**
    * List of data
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("Data")
    @Expose
    private ApplicationProxy [] Data;

    /**
    * Total number of records
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * Disused
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("Quota")
    @Expose
    private Long Quota;

    /**
    * When `PlatType` is `ip`, it indicates the number of proxies that schedule via Anycast IP.
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("IpCount")
    @Expose
    private Long IpCount;

    /**
    * When `PlatType` is `domain`, it indicates the number of proxies that schedule via CNAME.
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("DomainCount")
    @Expose
    private Long DomainCount;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get List of data
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return Data List of data
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public ApplicationProxy [] getData() {
        return this.Data;
    }

    /**
     * Set List of data
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param Data List of data
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setData(ApplicationProxy [] Data) {
        this.Data = Data;
    }

    /**
     * Get Total number of records
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return TotalCount Total number of records
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set Total number of records
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param TotalCount Total number of records
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get Disused
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return Quota Disused
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public Long getQuota() {
        return this.Quota;
    }

    /**
     * Set Disused
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param Quota Disused
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setQuota(Long Quota) {
        this.Quota = Quota;
    }

    /**
     * Get When `PlatType` is `ip`, it indicates the number of proxies that schedule via Anycast IP.
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return IpCount When `PlatType` is `ip`, it indicates the number of proxies that schedule via Anycast IP.
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public Long getIpCount() {
        return this.IpCount;
    }

    /**
     * Set When `PlatType` is `ip`, it indicates the number of proxies that schedule via Anycast IP.
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param IpCount When `PlatType` is `ip`, it indicates the number of proxies that schedule via Anycast IP.
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setIpCount(Long IpCount) {
        this.IpCount = IpCount;
    }

    /**
     * Get When `PlatType` is `domain`, it indicates the number of proxies that schedule via CNAME.
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return DomainCount When `PlatType` is `domain`, it indicates the number of proxies that schedule via CNAME.
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public Long getDomainCount() {
        return this.DomainCount;
    }

    /**
     * Set When `PlatType` is `domain`, it indicates the number of proxies that schedule via CNAME.
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param DomainCount When `PlatType` is `domain`, it indicates the number of proxies that schedule via CNAME.
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setDomainCount(Long DomainCount) {
        this.DomainCount = DomainCount;
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

    public DescribeApplicationProxyResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeApplicationProxyResponse(DescribeApplicationProxyResponse source) {
        if (source.Data != null) {
            this.Data = new ApplicationProxy[source.Data.length];
            for (int i = 0; i < source.Data.length; i++) {
                this.Data[i] = new ApplicationProxy(source.Data[i]);
            }
        }
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.Quota != null) {
            this.Quota = new Long(source.Quota);
        }
        if (source.IpCount != null) {
            this.IpCount = new Long(source.IpCount);
        }
        if (source.DomainCount != null) {
            this.DomainCount = new Long(source.DomainCount);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Data.", this.Data);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "Quota", this.Quota);
        this.setParamSimple(map, prefix + "IpCount", this.IpCount);
        this.setParamSimple(map, prefix + "DomainCount", this.DomainCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

