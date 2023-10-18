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
package com.tencentcloudapi.dnspod.v20210323.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSubdomainAnalyticsRequest extends AbstractModel {

    /**
    * The domain of the DNS query volume to be queried
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * Query start date in the format of `YYYY-MM-DD`
    */
    @SerializedName("StartDate")
    @Expose
    private String StartDate;

    /**
    * Query end date in the format of `YYYY-MM-DD`
    */
    @SerializedName("EndDate")
    @Expose
    private String EndDate;

    /**
    * The subdomain of the DNS query volume to be queried
    */
    @SerializedName("Subdomain")
    @Expose
    private String Subdomain;

    /**
    * `DATE`: Daily. `HOUR`: Hourly
    */
    @SerializedName("DnsFormat")
    @Expose
    private String DnsFormat;

    /**
    * The domain ID. `DomainId` takes priority over `Domain`. If `DomainId` is passed in, `Domain` is ignored. You can view all `Domain` and `DomainId` values via the `DescribeDomainList` API.
    */
    @SerializedName("DomainId")
    @Expose
    private Long DomainId;

    /**
     * Get The domain of the DNS query volume to be queried 
     * @return Domain The domain of the DNS query volume to be queried
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set The domain of the DNS query volume to be queried
     * @param Domain The domain of the DNS query volume to be queried
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get Query start date in the format of `YYYY-MM-DD` 
     * @return StartDate Query start date in the format of `YYYY-MM-DD`
     */
    public String getStartDate() {
        return this.StartDate;
    }

    /**
     * Set Query start date in the format of `YYYY-MM-DD`
     * @param StartDate Query start date in the format of `YYYY-MM-DD`
     */
    public void setStartDate(String StartDate) {
        this.StartDate = StartDate;
    }

    /**
     * Get Query end date in the format of `YYYY-MM-DD` 
     * @return EndDate Query end date in the format of `YYYY-MM-DD`
     */
    public String getEndDate() {
        return this.EndDate;
    }

    /**
     * Set Query end date in the format of `YYYY-MM-DD`
     * @param EndDate Query end date in the format of `YYYY-MM-DD`
     */
    public void setEndDate(String EndDate) {
        this.EndDate = EndDate;
    }

    /**
     * Get The subdomain of the DNS query volume to be queried 
     * @return Subdomain The subdomain of the DNS query volume to be queried
     */
    public String getSubdomain() {
        return this.Subdomain;
    }

    /**
     * Set The subdomain of the DNS query volume to be queried
     * @param Subdomain The subdomain of the DNS query volume to be queried
     */
    public void setSubdomain(String Subdomain) {
        this.Subdomain = Subdomain;
    }

    /**
     * Get `DATE`: Daily. `HOUR`: Hourly 
     * @return DnsFormat `DATE`: Daily. `HOUR`: Hourly
     */
    public String getDnsFormat() {
        return this.DnsFormat;
    }

    /**
     * Set `DATE`: Daily. `HOUR`: Hourly
     * @param DnsFormat `DATE`: Daily. `HOUR`: Hourly
     */
    public void setDnsFormat(String DnsFormat) {
        this.DnsFormat = DnsFormat;
    }

    /**
     * Get The domain ID. `DomainId` takes priority over `Domain`. If `DomainId` is passed in, `Domain` is ignored. You can view all `Domain` and `DomainId` values via the `DescribeDomainList` API. 
     * @return DomainId The domain ID. `DomainId` takes priority over `Domain`. If `DomainId` is passed in, `Domain` is ignored. You can view all `Domain` and `DomainId` values via the `DescribeDomainList` API.
     */
    public Long getDomainId() {
        return this.DomainId;
    }

    /**
     * Set The domain ID. `DomainId` takes priority over `Domain`. If `DomainId` is passed in, `Domain` is ignored. You can view all `Domain` and `DomainId` values via the `DescribeDomainList` API.
     * @param DomainId The domain ID. `DomainId` takes priority over `Domain`. If `DomainId` is passed in, `Domain` is ignored. You can view all `Domain` and `DomainId` values via the `DescribeDomainList` API.
     */
    public void setDomainId(Long DomainId) {
        this.DomainId = DomainId;
    }

    public DescribeSubdomainAnalyticsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSubdomainAnalyticsRequest(DescribeSubdomainAnalyticsRequest source) {
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.StartDate != null) {
            this.StartDate = new String(source.StartDate);
        }
        if (source.EndDate != null) {
            this.EndDate = new String(source.EndDate);
        }
        if (source.Subdomain != null) {
            this.Subdomain = new String(source.Subdomain);
        }
        if (source.DnsFormat != null) {
            this.DnsFormat = new String(source.DnsFormat);
        }
        if (source.DomainId != null) {
            this.DomainId = new Long(source.DomainId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "StartDate", this.StartDate);
        this.setParamSimple(map, prefix + "EndDate", this.EndDate);
        this.setParamSimple(map, prefix + "Subdomain", this.Subdomain);
        this.setParamSimple(map, prefix + "DnsFormat", this.DnsFormat);
        this.setParamSimple(map, prefix + "DomainId", this.DomainId);

    }
}

