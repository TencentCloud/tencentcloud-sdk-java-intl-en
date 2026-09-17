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

public class CoverBySnapshotTaskInput extends AbstractModel {

    /**
    * 
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * 
    */
    @SerializedName("PositionType")
    @Expose
    private String PositionType;

    /**
    * 
    */
    @SerializedName("PositionValue")
    @Expose
    private Float PositionValue;

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
     * @return PositionType 
     */
    public String getPositionType() {
        return this.PositionType;
    }

    /**
     * Set 
     * @param PositionType 
     */
    public void setPositionType(String PositionType) {
        this.PositionType = PositionType;
    }

    /**
     * Get  
     * @return PositionValue 
     */
    public Float getPositionValue() {
        return this.PositionValue;
    }

    /**
     * Set 
     * @param PositionValue 
     */
    public void setPositionValue(Float PositionValue) {
        this.PositionValue = PositionValue;
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

    public CoverBySnapshotTaskInput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CoverBySnapshotTaskInput(CoverBySnapshotTaskInput source) {
        if (source.Definition != null) {
            this.Definition = new Long(source.Definition);
        }
        if (source.PositionType != null) {
            this.PositionType = new String(source.PositionType);
        }
        if (source.PositionValue != null) {
            this.PositionValue = new Float(source.PositionValue);
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
        this.setParamSimple(map, prefix + "PositionType", this.PositionType);
        this.setParamSimple(map, prefix + "PositionValue", this.PositionValue);
        this.setParamArrayObj(map, prefix + "WatermarkSet.", this.WatermarkSet);

    }
}

