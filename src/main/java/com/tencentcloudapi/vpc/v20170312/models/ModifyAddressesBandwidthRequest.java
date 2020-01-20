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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyAddressesBandwidthRequest extends AbstractModel{

    /**
    * The unique ID of the EIP, such as 'eip-xxxx'.
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
    * The monthly bandwidth start time
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * The monthly bandwidth end time
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
     * Get The unique ID of the EIP, such as 'eip-xxxx'. 
     * @return AddressIds The unique ID of the EIP, such as 'eip-xxxx'.
     */
    public String [] getAddressIds() {
        return this.AddressIds;
    }

    /**
     * Set The unique ID of the EIP, such as 'eip-xxxx'.
     * @param AddressIds The unique ID of the EIP, such as 'eip-xxxx'.
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
     * Get The monthly bandwidth start time 
     * @return StartTime The monthly bandwidth start time
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set The monthly bandwidth start time
     * @param StartTime The monthly bandwidth start time
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get The monthly bandwidth end time 
     * @return EndTime The monthly bandwidth end time
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set The monthly bandwidth end time
     * @param EndTime The monthly bandwidth end time
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
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

