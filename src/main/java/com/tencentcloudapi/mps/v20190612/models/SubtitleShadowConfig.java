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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SubtitleShadowConfig extends AbstractModel {

    /**
    * Text shadow configuration switch, 0 for off, 1 for on, default 0
    */
    @SerializedName("SubtitleShadowConfigSwitch")
    @Expose
    private Long SubtitleShadowConfigSwitch;

    /**
    * Shadow width, default unit pixel, underlying default value 0, no shading

    */
    @SerializedName("ShadowWidth")
    @Expose
    private Float ShadowWidth;

    /**
    * Shadow width unit. 0 for pixel, 1 for percentage. Default is 0 (pixel).

    */
    @SerializedName("ShadowWidthUnit")
    @Expose
    private Long ShadowWidthUnit;

    /**
    * Shadow color. 6-digit base 16 RGB. Black by default if left blank (has set shadow in the current situation).

    */
    @SerializedName("ShadowColor")
    @Expose
    private String ShadowColor;

    /**
    * Shadow transparency. The value should be a positive floating-point number in the range of (0, 1]. If this is not specified, the default value is 1, which means completely opaque (with shadow configured).

    */
    @SerializedName("ShadowAlpha")
    @Expose
    private Float ShadowAlpha;

    /**
     * Get Text shadow configuration switch, 0 for off, 1 for on, default 0 
     * @return SubtitleShadowConfigSwitch Text shadow configuration switch, 0 for off, 1 for on, default 0
     */
    public Long getSubtitleShadowConfigSwitch() {
        return this.SubtitleShadowConfigSwitch;
    }

    /**
     * Set Text shadow configuration switch, 0 for off, 1 for on, default 0
     * @param SubtitleShadowConfigSwitch Text shadow configuration switch, 0 for off, 1 for on, default 0
     */
    public void setSubtitleShadowConfigSwitch(Long SubtitleShadowConfigSwitch) {
        this.SubtitleShadowConfigSwitch = SubtitleShadowConfigSwitch;
    }

    /**
     * Get Shadow width, default unit pixel, underlying default value 0, no shading
 
     * @return ShadowWidth Shadow width, default unit pixel, underlying default value 0, no shading

     */
    public Float getShadowWidth() {
        return this.ShadowWidth;
    }

    /**
     * Set Shadow width, default unit pixel, underlying default value 0, no shading

     * @param ShadowWidth Shadow width, default unit pixel, underlying default value 0, no shading

     */
    public void setShadowWidth(Float ShadowWidth) {
        this.ShadowWidth = ShadowWidth;
    }

    /**
     * Get Shadow width unit. 0 for pixel, 1 for percentage. Default is 0 (pixel).
 
     * @return ShadowWidthUnit Shadow width unit. 0 for pixel, 1 for percentage. Default is 0 (pixel).

     */
    public Long getShadowWidthUnit() {
        return this.ShadowWidthUnit;
    }

    /**
     * Set Shadow width unit. 0 for pixel, 1 for percentage. Default is 0 (pixel).

     * @param ShadowWidthUnit Shadow width unit. 0 for pixel, 1 for percentage. Default is 0 (pixel).

     */
    public void setShadowWidthUnit(Long ShadowWidthUnit) {
        this.ShadowWidthUnit = ShadowWidthUnit;
    }

    /**
     * Get Shadow color. 6-digit base 16 RGB. Black by default if left blank (has set shadow in the current situation).
 
     * @return ShadowColor Shadow color. 6-digit base 16 RGB. Black by default if left blank (has set shadow in the current situation).

     */
    public String getShadowColor() {
        return this.ShadowColor;
    }

    /**
     * Set Shadow color. 6-digit base 16 RGB. Black by default if left blank (has set shadow in the current situation).

     * @param ShadowColor Shadow color. 6-digit base 16 RGB. Black by default if left blank (has set shadow in the current situation).

     */
    public void setShadowColor(String ShadowColor) {
        this.ShadowColor = ShadowColor;
    }

    /**
     * Get Shadow transparency. The value should be a positive floating-point number in the range of (0, 1]. If this is not specified, the default value is 1, which means completely opaque (with shadow configured).
 
     * @return ShadowAlpha Shadow transparency. The value should be a positive floating-point number in the range of (0, 1]. If this is not specified, the default value is 1, which means completely opaque (with shadow configured).

     */
    public Float getShadowAlpha() {
        return this.ShadowAlpha;
    }

    /**
     * Set Shadow transparency. The value should be a positive floating-point number in the range of (0, 1]. If this is not specified, the default value is 1, which means completely opaque (with shadow configured).

     * @param ShadowAlpha Shadow transparency. The value should be a positive floating-point number in the range of (0, 1]. If this is not specified, the default value is 1, which means completely opaque (with shadow configured).

     */
    public void setShadowAlpha(Float ShadowAlpha) {
        this.ShadowAlpha = ShadowAlpha;
    }

    public SubtitleShadowConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SubtitleShadowConfig(SubtitleShadowConfig source) {
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

