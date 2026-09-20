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
    * Time point screenshot template ID.
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * Screenshot type. Valid values:
<li>Time: time point screencapturing</li>
<li>Percent: screenshot by percentage</li>
    */
    @SerializedName("PositionType")
    @Expose
    private String PositionType;

    /**
    * Screenshot position:
<li>For time point screenshot, this value indicates the second of the specified video to use as the cover</li>
<li>For percentage-based screenshots, this value indicates the percentage of the video used as the cover.</li>
    */
    @SerializedName("PositionValue")
    @Expose
    private Float PositionValue;

    /**
    * Watermark list. Multiple image or text watermarks up to a maximum of 10 are supported.
    */
    @SerializedName("WatermarkSet")
    @Expose
    private WatermarkInput [] WatermarkSet;

    /**
     * Get Time point screenshot template ID. 
     * @return Definition Time point screenshot template ID.
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set Time point screenshot template ID.
     * @param Definition Time point screenshot template ID.
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

    /**
     * Get Screenshot type. Valid values:
<li>Time: time point screencapturing</li>
<li>Percent: screenshot by percentage</li> 
     * @return PositionType Screenshot type. Valid values:
<li>Time: time point screencapturing</li>
<li>Percent: screenshot by percentage</li>
     */
    public String getPositionType() {
        return this.PositionType;
    }

    /**
     * Set Screenshot type. Valid values:
<li>Time: time point screencapturing</li>
<li>Percent: screenshot by percentage</li>
     * @param PositionType Screenshot type. Valid values:
<li>Time: time point screencapturing</li>
<li>Percent: screenshot by percentage</li>
     */
    public void setPositionType(String PositionType) {
        this.PositionType = PositionType;
    }

    /**
     * Get Screenshot position:
<li>For time point screenshot, this value indicates the second of the specified video to use as the cover</li>
<li>For percentage-based screenshots, this value indicates the percentage of the video used as the cover.</li> 
     * @return PositionValue Screenshot position:
<li>For time point screenshot, this value indicates the second of the specified video to use as the cover</li>
<li>For percentage-based screenshots, this value indicates the percentage of the video used as the cover.</li>
     */
    public Float getPositionValue() {
        return this.PositionValue;
    }

    /**
     * Set Screenshot position:
<li>For time point screenshot, this value indicates the second of the specified video to use as the cover</li>
<li>For percentage-based screenshots, this value indicates the percentage of the video used as the cover.</li>
     * @param PositionValue Screenshot position:
<li>For time point screenshot, this value indicates the second of the specified video to use as the cover</li>
<li>For percentage-based screenshots, this value indicates the percentage of the video used as the cover.</li>
     */
    public void setPositionValue(Float PositionValue) {
        this.PositionValue = PositionValue;
    }

    /**
     * Get Watermark list. Multiple image or text watermarks up to a maximum of 10 are supported. 
     * @return WatermarkSet Watermark list. Multiple image or text watermarks up to a maximum of 10 are supported.
     */
    public WatermarkInput [] getWatermarkSet() {
        return this.WatermarkSet;
    }

    /**
     * Set Watermark list. Multiple image or text watermarks up to a maximum of 10 are supported.
     * @param WatermarkSet Watermark list. Multiple image or text watermarks up to a maximum of 10 are supported.
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

