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
    * Numeric value.
    */
    @SerializedName("Value")
    @Expose
    private Long Value;

    /**
    * Site ID to which the data point belongs. If the content identifier feature is used, the value of this item is the content identifier.
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * Domain name to which the data point belongs.
    */
    @SerializedName("Host")
    @Expose
    private String Host;

    /**
    * ID of the Layer 4 Proxy instance to which the data point belongs.
    */
    @SerializedName("ProxyId")
    @Expose
    private String ProxyId;

    /**
    * ID of the billing region to which the data point belongs. The billing region is determined by the region of the EdgeOne node that actually serves the user client. Valid values: <li>CH: Chinese mainland</li><li>AF: Africa</li><li>AS1: Asia Pacific zone 1</li><li>AS2: Asia Pacific zone 2</li><li>AS3: Asia Pacific zone 3</li><li>EU: Europe</li><li>MidEast: Middle East</li><li>NA: North America</li><li> SA: South America</li>
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
     * Get Numeric value. 
     * @return Value Numeric value.
     */
    public Long getValue() {
        return this.Value;
    }

    /**
     * Set Numeric value.
     * @param Value Numeric value.
     */
    public void setValue(Long Value) {
        this.Value = Value;
    }

    /**
     * Get Site ID to which the data point belongs. If the content identifier feature is used, the value of this item is the content identifier. 
     * @return ZoneId Site ID to which the data point belongs. If the content identifier feature is used, the value of this item is the content identifier.
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set Site ID to which the data point belongs. If the content identifier feature is used, the value of this item is the content identifier.
     * @param ZoneId Site ID to which the data point belongs. If the content identifier feature is used, the value of this item is the content identifier.
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get Domain name to which the data point belongs. 
     * @return Host Domain name to which the data point belongs.
     */
    public String getHost() {
        return this.Host;
    }

    /**
     * Set Domain name to which the data point belongs.
     * @param Host Domain name to which the data point belongs.
     */
    public void setHost(String Host) {
        this.Host = Host;
    }

    /**
     * Get ID of the Layer 4 Proxy instance to which the data point belongs. 
     * @return ProxyId ID of the Layer 4 Proxy instance to which the data point belongs.
     */
    public String getProxyId() {
        return this.ProxyId;
    }

    /**
     * Set ID of the Layer 4 Proxy instance to which the data point belongs.
     * @param ProxyId ID of the Layer 4 Proxy instance to which the data point belongs.
     */
    public void setProxyId(String ProxyId) {
        this.ProxyId = ProxyId;
    }

    /**
     * Get ID of the billing region to which the data point belongs. The billing region is determined by the region of the EdgeOne node that actually serves the user client. Valid values: <li>CH: Chinese mainland</li><li>AF: Africa</li><li>AS1: Asia Pacific zone 1</li><li>AS2: Asia Pacific zone 2</li><li>AS3: Asia Pacific zone 3</li><li>EU: Europe</li><li>MidEast: Middle East</li><li>NA: North America</li><li> SA: South America</li> 
     * @return RegionId ID of the billing region to which the data point belongs. The billing region is determined by the region of the EdgeOne node that actually serves the user client. Valid values: <li>CH: Chinese mainland</li><li>AF: Africa</li><li>AS1: Asia Pacific zone 1</li><li>AS2: Asia Pacific zone 2</li><li>AS3: Asia Pacific zone 3</li><li>EU: Europe</li><li>MidEast: Middle East</li><li>NA: North America</li><li> SA: South America</li>
     */
    public String getRegionId() {
        return this.RegionId;
    }

    /**
     * Set ID of the billing region to which the data point belongs. The billing region is determined by the region of the EdgeOne node that actually serves the user client. Valid values: <li>CH: Chinese mainland</li><li>AF: Africa</li><li>AS1: Asia Pacific zone 1</li><li>AS2: Asia Pacific zone 2</li><li>AS3: Asia Pacific zone 3</li><li>EU: Europe</li><li>MidEast: Middle East</li><li>NA: North America</li><li> SA: South America</li>
     * @param RegionId ID of the billing region to which the data point belongs. The billing region is determined by the region of the EdgeOne node that actually serves the user client. Valid values: <li>CH: Chinese mainland</li><li>AF: Africa</li><li>AS1: Asia Pacific zone 1</li><li>AS2: Asia Pacific zone 2</li><li>AS3: Asia Pacific zone 3</li><li>EU: Europe</li><li>MidEast: Middle East</li><li>NA: North America</li><li> SA: South America</li>
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

