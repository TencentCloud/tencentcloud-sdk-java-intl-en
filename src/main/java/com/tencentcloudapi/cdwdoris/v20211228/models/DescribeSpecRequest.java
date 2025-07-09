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
package com.tencentcloudapi.cdwdoris.v20211228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSpecRequest extends AbstractModel {

    /**
    * Region information, such as ap-guangzhou-1.
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * Billing type. PREPAID: annual/monthly package; POSTPAID_BY_HOUR: pay-as-you-go
    */
    @SerializedName("PayMode")
    @Expose
    private String PayMode;

    /**
    * Multi-availability zone
    */
    @SerializedName("Zones")
    @Expose
    private String [] Zones;

    /**
    * Model name
    */
    @SerializedName("SpecName")
    @Expose
    private String SpecName;

    /**
     * Get Region information, such as ap-guangzhou-1. 
     * @return Zone Region information, such as ap-guangzhou-1.
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set Region information, such as ap-guangzhou-1.
     * @param Zone Region information, such as ap-guangzhou-1.
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get Billing type. PREPAID: annual/monthly package; POSTPAID_BY_HOUR: pay-as-you-go 
     * @return PayMode Billing type. PREPAID: annual/monthly package; POSTPAID_BY_HOUR: pay-as-you-go
     */
    public String getPayMode() {
        return this.PayMode;
    }

    /**
     * Set Billing type. PREPAID: annual/monthly package; POSTPAID_BY_HOUR: pay-as-you-go
     * @param PayMode Billing type. PREPAID: annual/monthly package; POSTPAID_BY_HOUR: pay-as-you-go
     */
    public void setPayMode(String PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get Multi-availability zone 
     * @return Zones Multi-availability zone
     */
    public String [] getZones() {
        return this.Zones;
    }

    /**
     * Set Multi-availability zone
     * @param Zones Multi-availability zone
     */
    public void setZones(String [] Zones) {
        this.Zones = Zones;
    }

    /**
     * Get Model name 
     * @return SpecName Model name
     */
    public String getSpecName() {
        return this.SpecName;
    }

    /**
     * Set Model name
     * @param SpecName Model name
     */
    public void setSpecName(String SpecName) {
        this.SpecName = SpecName;
    }

    public DescribeSpecRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSpecRequest(DescribeSpecRequest source) {
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.PayMode != null) {
            this.PayMode = new String(source.PayMode);
        }
        if (source.Zones != null) {
            this.Zones = new String[source.Zones.length];
            for (int i = 0; i < source.Zones.length; i++) {
                this.Zones[i] = new String(source.Zones[i]);
            }
        }
        if (source.SpecName != null) {
            this.SpecName = new String(source.SpecName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamArraySimple(map, prefix + "Zones.", this.Zones);
        this.setParamSimple(map, prefix + "SpecName", this.SpecName);

    }
}

