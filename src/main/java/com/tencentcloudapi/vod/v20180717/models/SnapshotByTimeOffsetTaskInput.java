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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SnapshotByTimeOffsetTaskInput extends AbstractModel {

    /**
    * 
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * 
    */
    @SerializedName("ExtTimeOffsetSet")
    @Expose
    private String [] ExtTimeOffsetSet;

    /**
    * 
    */
    @SerializedName("TimeOffsetSet")
    @Expose
    private Float [] TimeOffsetSet;

    /**
    * 
    */
    @SerializedName("WatermarkSet")
    @Expose
    private WatermarkInput [] WatermarkSet;

    /**
     * Get  
     * @return Definition 
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set 
     * @param Definition 
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

    /**
     * Get  
     * @return ExtTimeOffsetSet 
     */
    public String [] getExtTimeOffsetSet() {
        return this.ExtTimeOffsetSet;
    }

    /**
     * Set 
     * @param ExtTimeOffsetSet 
     */
    public void setExtTimeOffsetSet(String [] ExtTimeOffsetSet) {
        this.ExtTimeOffsetSet = ExtTimeOffsetSet;
    }

    /**
     * Get  
     * @return TimeOffsetSet 
     */
    public Float [] getTimeOffsetSet() {
        return this.TimeOffsetSet;
    }

    /**
     * Set 
     * @param TimeOffsetSet 
     */
    public void setTimeOffsetSet(Float [] TimeOffsetSet) {
        this.TimeOffsetSet = TimeOffsetSet;
    }

    /**
     * Get  
     * @return WatermarkSet 
     */
    public WatermarkInput [] getWatermarkSet() {
        return this.WatermarkSet;
    }

    /**
     * Set 
     * @param WatermarkSet 
     */
    public void setWatermarkSet(WatermarkInput [] WatermarkSet) {
        this.WatermarkSet = WatermarkSet;
    }

    public SnapshotByTimeOffsetTaskInput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SnapshotByTimeOffsetTaskInput(SnapshotByTimeOffsetTaskInput source) {
        if (source.Definition != null) {
            this.Definition = new Long(source.Definition);
        }
        if (source.ExtTimeOffsetSet != null) {
            this.ExtTimeOffsetSet = new String[source.ExtTimeOffsetSet.length];
            for (int i = 0; i < source.ExtTimeOffsetSet.length; i++) {
                this.ExtTimeOffsetSet[i] = new String(source.ExtTimeOffsetSet[i]);
            }
        }
        if (source.TimeOffsetSet != null) {
            this.TimeOffsetSet = new Float[source.TimeOffsetSet.length];
            for (int i = 0; i < source.TimeOffsetSet.length; i++) {
                this.TimeOffsetSet[i] = new Float(source.TimeOffsetSet[i]);
            }
        }
        if (source.WatermarkSet != null) {
            this.WatermarkSet = new WatermarkInput[source.WatermarkSet.length];
            for (int i = 0; i < source.WatermarkSet.length; i++) {
                this.WatermarkSet[i] = new WatermarkInput(source.WatermarkSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Definition", this.Definition);
        this.setParamArraySimple(map, prefix + "ExtTimeOffsetSet.", this.ExtTimeOffsetSet);
        this.setParamArraySimple(map, prefix + "TimeOffsetSet.", this.TimeOffsetSet);
        this.setParamArrayObj(map, prefix + "WatermarkSet.", this.WatermarkSet);

    }
}

