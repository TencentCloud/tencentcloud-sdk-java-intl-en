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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BillingData extends AbstractModel {

    /**
    * Data timestamp.
    */
    @SerializedName("Time")
    @Expose
    private String Time;

    /**
    * Value.
    */
    @SerializedName("Value")
    @Expose
    private Long Value;

    /**
    * Zone ID (or content identifier if enabled).
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * Domain name.
    */
    @SerializedName("Host")
    @Expose
    private String Host;

    /**
    * Layer-4 proxy instance ID.
    */
    @SerializedName("ProxyId")
    @Expose
    private String ProxyId;

    /**
    * Billing region (based on EdgeOne node location). Values: 
<li>CH: Mainland China</li> <li>AF: Africa</li> <li>AS1: Asia Pacific Region 1</li> <li>AS2: Asia Pacific Region 2</li> <li>AS3: Asia Pacific Region 3</li> <li>EU: Europe</li> <li>MidEast: Middle East</li> <li>NA: North America</li> <li>SA: South America</li>
    */
    @SerializedName("RegionId")
    @Expose
    private String RegionId;

    /**
     * Get Data timestamp. 
     * @return Time Data timestamp.
     */
    public String getTime() {
        return this.Time;
    }

    /**
     * Set Data timestamp.
     * @param Time Data timestamp.
     */
    public void setTime(String Time) {
        this.Time = Time;
    }

    /**
     * Get Value. 
     * @return Value Value.
     */
    public Long getValue() {
        return this.Value;
    }

    /**
     * Set Value.
     * @param Value Value.
     */
    public void setValue(Long Value) {
        this.Value = Value;
    }

    /**
     * Get Zone ID (or content identifier if enabled). 
     * @return ZoneId Zone ID (or content identifier if enabled).
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set Zone ID (or content identifier if enabled).
     * @param ZoneId Zone ID (or content identifier if enabled).
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get Domain name. 
     * @return Host Domain name.
     */
    public String getHost() {
        return this.Host;
    }

    /**
     * Set Domain name.
     * @param Host Domain name.
     */
    public void setHost(String Host) {
        this.Host = Host;
    }

    /**
     * Get Layer-4 proxy instance ID. 
     * @return ProxyId Layer-4 proxy instance ID.
     */
    public String getProxyId() {
        return this.ProxyId;
    }

    /**
     * Set Layer-4 proxy instance ID.
     * @param ProxyId Layer-4 proxy instance ID.
     */
    public void setProxyId(String ProxyId) {
        this.ProxyId = ProxyId;
    }

    /**
     * Get Billing region (based on EdgeOne node location). Values: 
<li>CH: Mainland China</li> <li>AF: Africa</li> <li>AS1: Asia Pacific Region 1</li> <li>AS2: Asia Pacific Region 2</li> <li>AS3: Asia Pacific Region 3</li> <li>EU: Europe</li> <li>MidEast: Middle East</li> <li>NA: North America</li> <li>SA: South America</li> 
     * @return RegionId Billing region (based on EdgeOne node location). Values: 
<li>CH: Mainland China</li> <li>AF: Africa</li> <li>AS1: Asia Pacific Region 1</li> <li>AS2: Asia Pacific Region 2</li> <li>AS3: Asia Pacific Region 3</li> <li>EU: Europe</li> <li>MidEast: Middle East</li> <li>NA: North America</li> <li>SA: South America</li>
     */
    public String getRegionId() {
        return this.RegionId;
    }

    /**
     * Set Billing region (based on EdgeOne node location). Values: 
<li>CH: Mainland China</li> <li>AF: Africa</li> <li>AS1: Asia Pacific Region 1</li> <li>AS2: Asia Pacific Region 2</li> <li>AS3: Asia Pacific Region 3</li> <li>EU: Europe</li> <li>MidEast: Middle East</li> <li>NA: North America</li> <li>SA: South America</li>
     * @param RegionId Billing region (based on EdgeOne node location). Values: 
<li>CH: Mainland China</li> <li>AF: Africa</li> <li>AS1: Asia Pacific Region 1</li> <li>AS2: Asia Pacific Region 2</li> <li>AS3: Asia Pacific Region 3</li> <li>EU: Europe</li> <li>MidEast: Middle East</li> <li>NA: North America</li> <li>SA: South America</li>
     */
    public void setRegionId(String RegionId) {
        this.RegionId = RegionId;
    }

    public BillingData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BillingData(BillingData source) {
        if (source.Time != null) {
            this.Time = new String(source.Time);
        }
        if (source.Value != null) {
            this.Value = new Long(source.Value);
        }
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.Host != null) {
            this.Host = new String(source.Host);
        }
        if (source.ProxyId != null) {
            this.ProxyId = new String(source.ProxyId);
        }
        if (source.RegionId != null) {
            this.RegionId = new String(source.RegionId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Time", this.Time);
        this.setParamSimple(map, prefix + "Value", this.Value);
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "Host", this.Host);
        this.setParamSimple(map, prefix + "ProxyId", this.ProxyId);
        this.setParamSimple(map, prefix + "RegionId", this.RegionId);

    }
}

