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

public class MPSSubtitleOutlineConfig extends AbstractModel {

    /**
    * 
    */
    @SerializedName("SubtitleOutlineConfigSwitch")
    @Expose
    private Long SubtitleOutlineConfigSwitch;

    /**
    * 
    */
    @SerializedName("OutlineWidth")
    @Expose
    private Float OutlineWidth;

    /**
    * 
    */
    @SerializedName("OutlineWidthUnit")
    @Expose
    private Long OutlineWidthUnit;

    /**
    * 
    */
    @SerializedName("OutlineColor")
    @Expose
    private String OutlineColor;

    /**
    * 
    */
    @SerializedName("OutlineAlpha")
    @Expose
    private Float OutlineAlpha;

    /**
     * Get  
     * @return SubtitleOutlineConfigSwitch 
     */
    public Long getSubtitleOutlineConfigSwitch() {
        return this.SubtitleOutlineConfigSwitch;
    }

    /**
     * Set 
     * @param SubtitleOutlineConfigSwitch 
     */
    public void setSubtitleOutlineConfigSwitch(Long SubtitleOutlineConfigSwitch) {
        this.SubtitleOutlineConfigSwitch = SubtitleOutlineConfigSwitch;
    }

    /**
     * Get  
     * @return OutlineWidth 
     */
    public Float getOutlineWidth() {
        return this.OutlineWidth;
    }

    /**
     * Set 
     * @param OutlineWidth 
     */
    public void setOutlineWidth(Float OutlineWidth) {
        this.OutlineWidth = OutlineWidth;
    }

    /**
     * Get  
     * @return OutlineWidthUnit 
     */
    public Long getOutlineWidthUnit() {
        return this.OutlineWidthUnit;
    }

    /**
     * Set 
     * @param OutlineWidthUnit 
     */
    public void setOutlineWidthUnit(Long OutlineWidthUnit) {
        this.OutlineWidthUnit = OutlineWidthUnit;
    }

    /**
     * Get  
     * @return OutlineColor 
     */
    public String getOutlineColor() {
        return this.OutlineColor;
    }

    /**
     * Set 
     * @param OutlineColor 
     */
    public void setOutlineColor(String OutlineColor) {
        this.OutlineColor = OutlineColor;
    }

    /**
     * Get  
     * @return OutlineAlpha 
     */
    public Float getOutlineAlpha() {
        return this.OutlineAlpha;
    }

    /**
     * Set 
     * @param OutlineAlpha 
     */
    public void setOutlineAlpha(Float OutlineAlpha) {
        this.OutlineAlpha = OutlineAlpha;
    }

    public MPSSubtitleOutlineConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MPSSubtitleOutlineConfig(MPSSubtitleOutlineConfig source) {
        if (source.SubtitleOutlineConfigSwitch != null) {
            this.SubtitleOutlineConfigSwitch = new Long(source.SubtitleOutlineConfigSwitch);
        }
        if (source.OutlineWidth != null) {
            this.OutlineWidth = new Float(source.OutlineWidth);
        }
        if (source.OutlineWidthUnit != null) {
            this.OutlineWidthUnit = new Long(source.OutlineWidthUnit);
        }
        if (source.OutlineColor != null) {
            this.OutlineColor = new String(source.OutlineColor);
        }
        if (source.OutlineAlpha != null) {
            this.OutlineAlpha = new Float(source.OutlineAlpha);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SubtitleOutlineConfigSwitch", this.SubtitleOutlineConfigSwitch);
        this.setParamSimple(map, prefix + "OutlineWidth", this.OutlineWidth);
        this.setParamSimple(map, prefix + "OutlineWidthUnit", this.OutlineWidthUnit);
        this.setParamSimple(map, prefix + "OutlineColor", this.OutlineColor);
        this.setParamSimple(map, prefix + "OutlineAlpha", this.OutlineAlpha);

    }
}

