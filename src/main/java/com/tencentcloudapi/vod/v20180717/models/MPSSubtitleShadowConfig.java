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
    * <p>Text shadow configuration switch, 0 for off, 1 for on, default 0</p>
    */
    @SerializedName("SubtitleShadowConfigSwitch")
    @Expose
    private Long SubtitleShadowConfigSwitch;

    /**
    * <p>Shadow width, default unit pixel, underlying default value 0, no shading</p>
    */
    @SerializedName("ShadowWidth")
    @Expose
    private Float ShadowWidth;

    /**
    * <p>Shadow width unit. 0 for pixel, 1 for percentage. Default is 0 (pixel).</p>
    */
    @SerializedName("ShadowWidthUnit")
    @Expose
    private Long ShadowWidthUnit;

    /**
    * <p>Shadow color. 6-digit base-16 RGB. Black by default if left blank (when shadow has set)</p>
    */
    @SerializedName("ShadowColor")
    @Expose
    private String ShadowColor;

    /**
    * <p>Shadow transparency. The value should be a positive floating-point number in the range of (0, 1]. If this is not specified, the default value is 1, which means completely opaque (with shadow configured).</p>
    */
    @SerializedName("ShadowAlpha")
    @Expose
    private Float ShadowAlpha;

    /**
     * Get <p>Text shadow configuration switch, 0 for off, 1 for on, default 0</p> 
     * @return SubtitleShadowConfigSwitch <p>Text shadow configuration switch, 0 for off, 1 for on, default 0</p>
     */
    public Long getSubtitleShadowConfigSwitch() {
        return this.SubtitleShadowConfigSwitch;
    }

    /**
     * Set <p>Text shadow configuration switch, 0 for off, 1 for on, default 0</p>
     * @param SubtitleShadowConfigSwitch <p>Text shadow configuration switch, 0 for off, 1 for on, default 0</p>
     */
    public void setSubtitleShadowConfigSwitch(Long SubtitleShadowConfigSwitch) {
        this.SubtitleShadowConfigSwitch = SubtitleShadowConfigSwitch;
    }

    /**
     * Get <p>Shadow width, default unit pixel, underlying default value 0, no shading</p> 
     * @return ShadowWidth <p>Shadow width, default unit pixel, underlying default value 0, no shading</p>
     */
    public Float getShadowWidth() {
        return this.ShadowWidth;
    }

    /**
     * Set <p>Shadow width, default unit pixel, underlying default value 0, no shading</p>
     * @param ShadowWidth <p>Shadow width, default unit pixel, underlying default value 0, no shading</p>
     */
    public void setShadowWidth(Float ShadowWidth) {
        this.ShadowWidth = ShadowWidth;
    }

    /**
     * Get <p>Shadow width unit. 0 for pixel, 1 for percentage. Default is 0 (pixel).</p> 
     * @return ShadowWidthUnit <p>Shadow width unit. 0 for pixel, 1 for percentage. Default is 0 (pixel).</p>
     */
    public Long getShadowWidthUnit() {
        return this.ShadowWidthUnit;
    }

    /**
     * Set <p>Shadow width unit. 0 for pixel, 1 for percentage. Default is 0 (pixel).</p>
     * @param ShadowWidthUnit <p>Shadow width unit. 0 for pixel, 1 for percentage. Default is 0 (pixel).</p>
     */
    public void setShadowWidthUnit(Long ShadowWidthUnit) {
        this.ShadowWidthUnit = ShadowWidthUnit;
    }

    /**
     * Get <p>Shadow color. 6-digit base-16 RGB. Black by default if left blank (when shadow has set)</p> 
     * @return ShadowColor <p>Shadow color. 6-digit base-16 RGB. Black by default if left blank (when shadow has set)</p>
     */
    public String getShadowColor() {
        return this.ShadowColor;
    }

    /**
     * Set <p>Shadow color. 6-digit base-16 RGB. Black by default if left blank (when shadow has set)</p>
     * @param ShadowColor <p>Shadow color. 6-digit base-16 RGB. Black by default if left blank (when shadow has set)</p>
     */
    public void setShadowColor(String ShadowColor) {
        this.ShadowColor = ShadowColor;
    }

    /**
     * Get <p>Shadow transparency. The value should be a positive floating-point number in the range of (0, 1]. If this is not specified, the default value is 1, which means completely opaque (with shadow configured).</p> 
     * @return ShadowAlpha <p>Shadow transparency. The value should be a positive floating-point number in the range of (0, 1]. If this is not specified, the default value is 1, which means completely opaque (with shadow configured).</p>
     */
    public Float getShadowAlpha() {
        return this.ShadowAlpha;
    }

    /**
     * Set <p>Shadow transparency. The value should be a positive floating-point number in the range of (0, 1]. If this is not specified, the default value is 1, which means completely opaque (with shadow configured).</p>
     * @param ShadowAlpha <p>Shadow transparency. The value should be a positive floating-point number in the range of (0, 1]. If this is not specified, the default value is 1, which means completely opaque (with shadow configured).</p>
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

