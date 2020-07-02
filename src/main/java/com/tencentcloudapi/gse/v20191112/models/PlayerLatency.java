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
package com.tencentcloudapi.gse.v20191112.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PlayerLatency extends AbstractModel{

    /**
    * Player ID
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PlayerId")
    @Expose
    private String PlayerId;

    /**
    * Name of region corresponding to latency
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RegionIdentifier")
    @Expose
    private String RegionIdentifier;

    /**
    * Latency in milliseconds
    */
    @SerializedName("LatencyInMilliseconds")
    @Expose
    private Long LatencyInMilliseconds;

    /**
     * Get Player ID
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return PlayerId Player ID
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getPlayerId() {
        return this.PlayerId;
    }

    /**
     * Set Player ID
Note: this field may return null, indicating that no valid values can be obtained.
     * @param PlayerId Player ID
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setPlayerId(String PlayerId) {
        this.PlayerId = PlayerId;
    }

    /**
     * Get Name of region corresponding to latency
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return RegionIdentifier Name of region corresponding to latency
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getRegionIdentifier() {
        return this.RegionIdentifier;
    }

    /**
     * Set Name of region corresponding to latency
Note: this field may return null, indicating that no valid values can be obtained.
     * @param RegionIdentifier Name of region corresponding to latency
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setRegionIdentifier(String RegionIdentifier) {
        this.RegionIdentifier = RegionIdentifier;
    }

    /**
     * Get Latency in milliseconds 
     * @return LatencyInMilliseconds Latency in milliseconds
     */
    public Long getLatencyInMilliseconds() {
        return this.LatencyInMilliseconds;
    }

    /**
     * Set Latency in milliseconds
     * @param LatencyInMilliseconds Latency in milliseconds
     */
    public void setLatencyInMilliseconds(Long LatencyInMilliseconds) {
        this.LatencyInMilliseconds = LatencyInMilliseconds;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PlayerId", this.PlayerId);
        this.setParamSimple(map, prefix + "RegionIdentifier", this.RegionIdentifier);
        this.setParamSimple(map, prefix + "LatencyInMilliseconds", this.LatencyInMilliseconds);

    }
}

