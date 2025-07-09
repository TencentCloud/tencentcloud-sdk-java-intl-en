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
package com.tencentcloudapi.dnspod.v20210323.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SubdomainAnalyticsInfo extends AbstractModel {

    /**
    * `DATE`: Daily; `HOUR`: Hourly
    */
    @SerializedName("DnsFormat")
    @Expose
    private String DnsFormat;

    /**
    * Total DNS query volume for the current statistical period
    */
    @SerializedName("DnsTotal")
    @Expose
    private Long DnsTotal;

    /**
    * The queried domain
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * Start date of the current statistical period
    */
    @SerializedName("StartDate")
    @Expose
    private String StartDate;

    /**
    * End date of the current statistical period
    */
    @SerializedName("EndDate")
    @Expose
    private String EndDate;

    /**
    * Subdomain
    */
    @SerializedName("Subdomain")
    @Expose
    private String Subdomain;

    /**
     * Get `DATE`: Daily; `HOUR`: Hourly 
     * @return DnsFormat `DATE`: Daily; `HOUR`: Hourly
     */
    public String getDnsFormat() {
        return this.DnsFormat;
    }

    /**
     * Set `DATE`: Daily; `HOUR`: Hourly
     * @param DnsFormat `DATE`: Daily; `HOUR`: Hourly
     */
    public void setDnsFormat(String DnsFormat) {
        this.DnsFormat = DnsFormat;
    }

    /**
     * Get Total DNS query volume for the current statistical period 
     * @return DnsTotal Total DNS query volume for the current statistical period
     */
    public Long getDnsTotal() {
        return this.DnsTotal;
    }

    /**
     * Set Total DNS query volume for the current statistical period
     * @param DnsTotal Total DNS query volume for the current statistical period
     */
    public void setDnsTotal(Long DnsTotal) {
        this.DnsTotal = DnsTotal;
    }

    /**
     * Get The queried domain 
     * @return Domain The queried domain
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set The queried domain
     * @param Domain The queried domain
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get Start date of the current statistical period 
     * @return StartDate Start date of the current statistical period
     */
    public String getStartDate() {
        return this.StartDate;
    }

    /**
     * Set Start date of the current statistical period
     * @param StartDate Start date of the current statistical period
     */
    public void setStartDate(String StartDate) {
        this.StartDate = StartDate;
    }

    /**
     * Get End date of the current statistical period 
     * @return EndDate End date of the current statistical period
     */
    public String getEndDate() {
        return this.EndDate;
    }

    /**
     * Set End date of the current statistical period
     * @param EndDate End date of the current statistical period
     */
    public void setEndDate(String EndDate) {
        this.EndDate = EndDate;
    }

    /**
     * Get Subdomain 
     * @return Subdomain Subdomain
     */
    public String getSubdomain() {
        return this.Subdomain;
    }

    /**
     * Set Subdomain
     * @param Subdomain Subdomain
     */
    public void setSubdomain(String Subdomain) {
        this.Subdomain = Subdomain;
    }

    public SubdomainAnalyticsInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SubdomainAnalyticsInfo(SubdomainAnalyticsInfo source) {
        if (source.DnsFormat != null) {
            this.DnsFormat = new String(source.DnsFormat);
        }
        if (source.DnsTotal != null) {
            this.DnsTotal = new Long(source.DnsTotal);
        }
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DnsFormat", this.DnsFormat);
        this.setParamSimple(map, prefix + "DnsTotal", this.DnsTotal);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "StartDate", this.StartDate);
        this.setParamSimple(map, prefix + "EndDate", this.EndDate);
        this.setParamSimple(map, prefix + "Subdomain", this.Subdomain);

    }
}

