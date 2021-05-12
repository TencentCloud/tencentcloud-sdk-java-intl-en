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
package com.tencentcloudapi.gaap.v20180529.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AccessRegionDetial extends AbstractModel{

    /**
    * Region ID
    */
    @SerializedName("RegionId")
    @Expose
    private String RegionId;

    /**
    * Region name in Chinese or English
    */
    @SerializedName("RegionName")
    @Expose
    private String RegionName;

    /**
    * Value array of the available concurrence
    */
    @SerializedName("ConcurrentList")
    @Expose
    private Long [] ConcurrentList;

    /**
    * Value array of the available bandwidth
    */
    @SerializedName("BandwidthList")
    @Expose
    private Long [] BandwidthList;

    /**
     * Get Region ID 
     * @return RegionId Region ID
     */
    public String getRegionId() {
        return this.RegionId;
    }

    /**
     * Set Region ID
     * @param RegionId Region ID
     */
    public void setRegionId(String RegionId) {
        this.RegionId = RegionId;
    }

    /**
     * Get Region name in Chinese or English 
     * @return RegionName Region name in Chinese or English
     */
    public String getRegionName() {
        return this.RegionName;
    }

    /**
     * Set Region name in Chinese or English
     * @param RegionName Region name in Chinese or English
     */
    public void setRegionName(String RegionName) {
        this.RegionName = RegionName;
    }

    /**
     * Get Value array of the available concurrence 
     * @return ConcurrentList Value array of the available concurrence
     */
    public Long [] getConcurrentList() {
        return this.ConcurrentList;
    }

    /**
     * Set Value array of the available concurrence
     * @param ConcurrentList Value array of the available concurrence
     */
    public void setConcurrentList(Long [] ConcurrentList) {
        this.ConcurrentList = ConcurrentList;
    }

    /**
     * Get Value array of the available bandwidth 
     * @return BandwidthList Value array of the available bandwidth
     */
    public Long [] getBandwidthList() {
        return this.BandwidthList;
    }

    /**
     * Set Value array of the available bandwidth
     * @param BandwidthList Value array of the available bandwidth
     */
    public void setBandwidthList(Long [] BandwidthList) {
        this.BandwidthList = BandwidthList;
    }

    public AccessRegionDetial() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AccessRegionDetial(AccessRegionDetial source) {
        if (source.RegionId != null) {
            this.RegionId = new String(source.RegionId);
        }
        if (source.RegionName != null) {
            this.RegionName = new String(source.RegionName);
        }
        if (source.ConcurrentList != null) {
            this.ConcurrentList = new Long[source.ConcurrentList.length];
            for (int i = 0; i < source.ConcurrentList.length; i++) {
                this.ConcurrentList[i] = new Long(source.ConcurrentList[i]);
            }
        }
        if (source.BandwidthList != null) {
            this.BandwidthList = new Long[source.BandwidthList.length];
            for (int i = 0; i < source.BandwidthList.length; i++) {
                this.BandwidthList[i] = new Long(source.BandwidthList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RegionId", this.RegionId);
        this.setParamSimple(map, prefix + "RegionName", this.RegionName);
        this.setParamArraySimple(map, prefix + "ConcurrentList.", this.ConcurrentList);
        this.setParamArraySimple(map, prefix + "BandwidthList.", this.BandwidthList);

    }
}

