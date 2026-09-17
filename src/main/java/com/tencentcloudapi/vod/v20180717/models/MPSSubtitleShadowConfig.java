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

public class MPSSubtitleShadowConfig extends AbstractModel {

    /**
    * 
    */
    @SerializedName("SubtitleShadowConfigSwitch")
    @Expose
    private Long SubtitleShadowConfigSwitch;

    /**
    * 
    */
    @SerializedName("ShadowWidth")
    @Expose
    private Float ShadowWidth;

    /**
    * 
    */
    @SerializedName("ShadowWidthUnit")
    @Expose
    private Long ShadowWidthUnit;

    /**
    * 
    */
    @SerializedName("ShadowColor")
    @Expose
    private String ShadowColor;

    /**
    * 
    */
    @SerializedName("ShadowAlpha")
    @Expose
    private Float ShadowAlpha;

    /**
     * Get  
     * @return SubtitleShadowConfigSwitch 
     */
    public Long getSubtitleShadowConfigSwitch() {
        return this.SubtitleShadowConfigSwitch;
    }

    /**
     * Set 
     * @param SubtitleShadowConfigSwitch 
     */
    public void setSubtitleShadowConfigSwitch(Long SubtitleShadowConfigSwitch) {
        this.SubtitleShadowConfigSwitch = SubtitleShadowConfigSwitch;
    }

    /**
     * Get  
     * @return ShadowWidth 
     */
    public Float getShadowWidth() {
        return this.ShadowWidth;
    }

    /**
     * Set 
     * @param ShadowWidth 
     */
    public void setShadowWidth(Float ShadowWidth) {
        this.ShadowWidth = ShadowWidth;
    }

    /**
     * Get  
     * @return ShadowWidthUnit 
     */
    public Long getShadowWidthUnit() {
        return this.ShadowWidthUnit;
    }

    /**
     * Set 
     * @param ShadowWidthUnit 
     */
    public void setShadowWidthUnit(Long ShadowWidthUnit) {
        this.ShadowWidthUnit = ShadowWidthUnit;
    }

    /**
     * Get  
     * @return ShadowColor 
     */
    public String getShadowColor() {
        return this.ShadowColor;
    }

    /**
     * Set 
     * @param ShadowColor 
     */
    public void setShadowColor(String ShadowColor) {
        this.ShadowColor = ShadowColor;
    }

    /**
     * Get  
     * @return ShadowAlpha 
     */
    public Float getShadowAlpha() {
        return this.ShadowAlpha;
    }

    /**
     * Set 
     * @param ShadowAlpha 
     */
    public void setShadowAlpha(Float ShadowAlpha) {
        this.ShadowAlpha = ShadowAlpha;
    }

    public MPSSubtitleShadowConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MPSSubtitleShadowConfig(MPSSubtitleShadowConfig source) {
        if (source.SubtitleShadowConfigSwitch != null) {
            this.SubtitleShadowConfigSwitch = new Long(source.SubtitleShadowConfigSwitch);
        }
        if (source.ShadowWidth != null) {
            this.ShadowWidth = new Float(source.ShadowWidth);
        }
        if (source.ShadowWidthUnit != null) {
            this.ShadowWidthUnit = new Long(source.ShadowWidthUnit);
        }
        if (source.ShadowColor != null) {
            this.ShadowColor = new String(source.ShadowColor);
        }
        if (source.ShadowAlpha != null) {
            this.ShadowAlpha = new Float(source.ShadowAlpha);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SubtitleShadowConfigSwitch", this.SubtitleShadowConfigSwitch);
        this.setParamSimple(map, prefix + "ShadowWidth", this.ShadowWidth);
        this.setParamSimple(map, prefix + "ShadowWidthUnit", this.ShadowWidthUnit);
        this.setParamSimple(map, prefix + "ShadowColor", this.ShadowColor);
        this.setParamSimple(map, prefix + "ShadowAlpha", this.ShadowAlpha);

    }
}

