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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeLiveDomainsResponse extends AbstractModel {

    /**
    * Total number of results.
    */
    @SerializedName("AllCount")
    @Expose
    private Long AllCount;

    /**
    * List of domain name details.
    */
    @SerializedName("DomainList")
    @Expose
    private DomainInfo [] DomainList;

    /**
    * The number of domain names that can be added
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("CreateLimitCount")
    @Expose
    private Long CreateLimitCount;

    /**
    * The number of domains accelerated in the Chinese mainland, globally, and outside the Chinese mainland respectively.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PlayTypeCount")
    @Expose
    private Long [] PlayTypeCount;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Total number of results. 
     * @return AllCount Total number of results.
     */
    public Long getAllCount() {
        return this.AllCount;
    }

    /**
     * Set Total number of results.
     * @param AllCount Total number of results.
     */
    public void setAllCount(Long AllCount) {
        this.AllCount = AllCount;
    }

    /**
     * Get List of domain name details. 
     * @return DomainList List of domain name details.
     */
    public DomainInfo [] getDomainList() {
        return this.DomainList;
    }

    /**
     * Set List of domain name details.
     * @param DomainList List of domain name details.
     */
    public void setDomainList(DomainInfo [] DomainList) {
        this.DomainList = DomainList;
    }

    /**
     * Get The number of domain names that can be added
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return CreateLimitCount The number of domain names that can be added
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public Long getCreateLimitCount() {
        return this.CreateLimitCount;
    }

    /**
     * Set The number of domain names that can be added
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param CreateLimitCount The number of domain names that can be added
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setCreateLimitCount(Long CreateLimitCount) {
        this.CreateLimitCount = CreateLimitCount;
    }

    /**
     * Get The number of domains accelerated in the Chinese mainland, globally, and outside the Chinese mainland respectively.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PlayTypeCount The number of domains accelerated in the Chinese mainland, globally, and outside the Chinese mainland respectively.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long [] getPlayTypeCount() {
        return this.PlayTypeCount;
    }

    /**
     * Set The number of domains accelerated in the Chinese mainland, globally, and outside the Chinese mainland respectively.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param PlayTypeCount The number of domains accelerated in the Chinese mainland, globally, and outside the Chinese mainland respectively.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPlayTypeCount(Long [] PlayTypeCount) {
        this.PlayTypeCount = PlayTypeCount;
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

    public DescribeLiveDomainsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeLiveDomainsResponse(DescribeLiveDomainsResponse source) {
        if (source.AllCount != null) {
            this.AllCount = new Long(source.AllCount);
        }
        if (source.DomainList != null) {
            this.DomainList = new DomainInfo[source.DomainList.length];
            for (int i = 0; i < source.DomainList.length; i++) {
                this.DomainList[i] = new DomainInfo(source.DomainList[i]);
            }
        }
        if (source.CreateLimitCount != null) {
            this.CreateLimitCount = new Long(source.CreateLimitCount);
        }
        if (source.PlayTypeCount != null) {
            this.PlayTypeCount = new Long[source.PlayTypeCount.length];
            for (int i = 0; i < source.PlayTypeCount.length; i++) {
                this.PlayTypeCount[i] = new Long(source.PlayTypeCount[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AllCount", this.AllCount);
        this.setParamArrayObj(map, prefix + "DomainList.", this.DomainList);
        this.setParamSimple(map, prefix + "CreateLimitCount", this.CreateLimitCount);
        this.setParamArraySimple(map, prefix + "PlayTypeCount.", this.PlayTypeCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

