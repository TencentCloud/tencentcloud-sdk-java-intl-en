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

public class DDoSBlockData extends AbstractModel {

    /**
    * Start time in unix timestamp.
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * Termination time in unix timestamp. 0 means the ban is still in effect.
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * Block the affected area.
    */
    @SerializedName("BlockArea")
    @Expose
    private String BlockArea;

    /**
     * Get Start time in unix timestamp. 
     * @return StartTime Start time in unix timestamp.
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Start time in unix timestamp.
     * @param StartTime Start time in unix timestamp.
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get Termination time in unix timestamp. 0 means the ban is still in effect. 
     * @return EndTime Termination time in unix timestamp. 0 means the ban is still in effect.
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set Termination time in unix timestamp. 0 means the ban is still in effect.
     * @param EndTime Termination time in unix timestamp. 0 means the ban is still in effect.
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Block the affected area. 
     * @return BlockArea Block the affected area.
     */
    public String getBlockArea() {
        return this.BlockArea;
    }

    /**
     * Set Block the affected area.
     * @param BlockArea Block the affected area.
     */
    public void setBlockArea(String BlockArea) {
        this.BlockArea = BlockArea;
    }

    public DDoSBlockData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DDoSBlockData(DDoSBlockData source) {
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.BlockArea != null) {
            this.BlockArea = new String(source.BlockArea);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "BlockArea", this.BlockArea);

    }
}

