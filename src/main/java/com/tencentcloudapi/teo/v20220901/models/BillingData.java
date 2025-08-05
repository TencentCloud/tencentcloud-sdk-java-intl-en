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
    * Specifies the data timestamp.
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
    * Site ID of the associated data point. if the content identifier feature is enabled, this item is the content identifier.
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * Specifies the domain name of the data point.
    */
    @SerializedName("Host")
    @Expose
    private String Host;

    /**
    * Specifies the layer-4 proxy instance ID the data point belongs to.
    */
    @SerializedName("ProxyId")
    @Expose
    private String ProxyId;

    /**
    * Specifies the billing region ID the data point belongs to. the billing region is determined by the EdgeOne node region where the actual service user client is located. valid values: <li>CH: chinese mainland</li><li>AF: africa</li><li>AS1: asia pacific zone 1</li><li>AS2: asia pacific zone 2</li><li>AS3: asia pacific zone 3</li><li>EU: europe</li><li>MidEast: middle east</li><li>NA: north america</li><li>SA: south america</li>.
    */
    @SerializedName("RegionId")
    @Expose
    private String RegionId;

    /**
     * Get Specifies the data timestamp. 
     * @return Time Specifies the data timestamp.
     */
    public String getTime() {
        return this.Time;
    }

    /**
     * Set Specifies the data timestamp.
     * @param Time Specifies the data timestamp.
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
     * Get Site ID of the associated data point. if the content identifier feature is enabled, this item is the content identifier. 
     * @return ZoneId Site ID of the associated data point. if the content identifier feature is enabled, this item is the content identifier.
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set Site ID of the associated data point. if the content identifier feature is enabled, this item is the content identifier.
     * @param ZoneId Site ID of the associated data point. if the content identifier feature is enabled, this item is the content identifier.
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get Specifies the domain name of the data point. 
     * @return Host Specifies the domain name of the data point.
     */
    public String getHost() {
        return this.Host;
    }

    /**
     * Set Specifies the domain name of the data point.
     * @param Host Specifies the domain name of the data point.
     */
    public void setHost(String Host) {
        this.Host = Host;
    }

    /**
     * Get Specifies the layer-4 proxy instance ID the data point belongs to. 
     * @return ProxyId Specifies the layer-4 proxy instance ID the data point belongs to.
     */
    public String getProxyId() {
        return this.ProxyId;
    }

    /**
     * Set Specifies the layer-4 proxy instance ID the data point belongs to.
     * @param ProxyId Specifies the layer-4 proxy instance ID the data point belongs to.
     */
    public void setProxyId(String ProxyId) {
        this.ProxyId = ProxyId;
    }

    /**
     * Get Specifies the billing region ID the data point belongs to. the billing region is determined by the EdgeOne node region where the actual service user client is located. valid values: <li>CH: chinese mainland</li><li>AF: africa</li><li>AS1: asia pacific zone 1</li><li>AS2: asia pacific zone 2</li><li>AS3: asia pacific zone 3</li><li>EU: europe</li><li>MidEast: middle east</li><li>NA: north america</li><li>SA: south america</li>. 
     * @return RegionId Specifies the billing region ID the data point belongs to. the billing region is determined by the EdgeOne node region where the actual service user client is located. valid values: <li>CH: chinese mainland</li><li>AF: africa</li><li>AS1: asia pacific zone 1</li><li>AS2: asia pacific zone 2</li><li>AS3: asia pacific zone 3</li><li>EU: europe</li><li>MidEast: middle east</li><li>NA: north america</li><li>SA: south america</li>.
     */
    public String getRegionId() {
        return this.RegionId;
    }

    /**
     * Set Specifies the billing region ID the data point belongs to. the billing region is determined by the EdgeOne node region where the actual service user client is located. valid values: <li>CH: chinese mainland</li><li>AF: africa</li><li>AS1: asia pacific zone 1</li><li>AS2: asia pacific zone 2</li><li>AS3: asia pacific zone 3</li><li>EU: europe</li><li>MidEast: middle east</li><li>NA: north america</li><li>SA: south america</li>.
     * @param RegionId Specifies the billing region ID the data point belongs to. the billing region is determined by the EdgeOne node region where the actual service user client is located. valid values: <li>CH: chinese mainland</li><li>AF: africa</li><li>AS1: asia pacific zone 1</li><li>AS2: asia pacific zone 2</li><li>AS3: asia pacific zone 3</li><li>EU: europe</li><li>MidEast: middle east</li><li>NA: north america</li><li>SA: south america</li>.
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

