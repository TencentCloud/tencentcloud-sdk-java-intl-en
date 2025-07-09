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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyAddressesBandwidthRequest extends AbstractModel {

    /**
    * List of EIP IDs, such as “eip-xxxx”.
    */
    @SerializedName("AddressIds")
    @Expose
    private String [] AddressIds;

    /**
    * Target bandwidth value adjustment
    */
    @SerializedName("InternetMaxBandwidthOut")
    @Expose
    private Long InternetMaxBandwidthOut;

    /**
    * (Disused) The start time of the monthly bandwidth subscription
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * (Disused) The end time of the monthly bandwidth subscription
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
     * Get List of EIP IDs, such as “eip-xxxx”. 
     * @return AddressIds List of EIP IDs, such as “eip-xxxx”.
     */
    public String [] getAddressIds() {
        return this.AddressIds;
    }

    /**
     * Set List of EIP IDs, such as “eip-xxxx”.
     * @param AddressIds List of EIP IDs, such as “eip-xxxx”.
     */
    public void setAddressIds(String [] AddressIds) {
        this.AddressIds = AddressIds;
    }

    /**
     * Get Target bandwidth value adjustment 
     * @return InternetMaxBandwidthOut Target bandwidth value adjustment
     */
    public Long getInternetMaxBandwidthOut() {
        return this.InternetMaxBandwidthOut;
    }

    /**
     * Set Target bandwidth value adjustment
     * @param InternetMaxBandwidthOut Target bandwidth value adjustment
     */
    public void setInternetMaxBandwidthOut(Long InternetMaxBandwidthOut) {
        this.InternetMaxBandwidthOut = InternetMaxBandwidthOut;
    }

    /**
     * Get (Disused) The start time of the monthly bandwidth subscription 
     * @return StartTime (Disused) The start time of the monthly bandwidth subscription
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set (Disused) The start time of the monthly bandwidth subscription
     * @param StartTime (Disused) The start time of the monthly bandwidth subscription
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get (Disused) The end time of the monthly bandwidth subscription 
     * @return EndTime (Disused) The end time of the monthly bandwidth subscription
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set (Disused) The end time of the monthly bandwidth subscription
     * @param EndTime (Disused) The end time of the monthly bandwidth subscription
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    public ModifyAddressesBandwidthRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyAddressesBandwidthRequest(ModifyAddressesBandwidthRequest source) {
        if (source.AddressIds != null) {
            this.AddressIds = new String[source.AddressIds.length];
            for (int i = 0; i < source.AddressIds.length; i++) {
                this.AddressIds[i] = new String(source.AddressIds[i]);
            }
        }
        if (source.InternetMaxBandwidthOut != null) {
            this.InternetMaxBandwidthOut = new Long(source.InternetMaxBandwidthOut);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "AddressIds.", this.AddressIds);
        this.setParamSimple(map, prefix + "InternetMaxBandwidthOut", this.InternetMaxBandwidthOut);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);

    }
}

