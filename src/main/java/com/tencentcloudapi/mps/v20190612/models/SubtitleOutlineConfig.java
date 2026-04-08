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

public class SubtitleOutlineConfig extends AbstractModel {

    /**
    * <p>Text stroke configuration switch, 0 for off, 1 for on, default 0</p>
    */
    @SerializedName("SubtitleOutlineConfigSwitch")
    @Expose
    private Long SubtitleOutlineConfigSwitch;

    /**
    * <p>Stroke width, default unit pixel, underlying default value is 0.3% of the source video height</p>
    */
    @SerializedName("OutlineWidth")
    @Expose
    private Float OutlineWidth;

    /**
    * <p>Stroke width unit, 0 pixel, 1 percentage, defaults to 0, pixel</p>
    */
    @SerializedName("OutlineWidthUnit")
    @Expose
    private Long OutlineWidthUnit;

    /**
    * <p>Border color. 6-digit base 16 RGB. Black by default if left blank.</p>
    */
    @SerializedName("OutlineColor")
    @Expose
    private String OutlineColor;

    /**
    * <p>Stroke transparency. The value should be a positive floating-point number in the range of (0, 1]. If this is not specified, the default value is 1, which means completely opaque.</p>
    */
    @SerializedName("OutlineAlpha")
    @Expose
    private Float OutlineAlpha;

    /**
     * Get <p>Text stroke configuration switch, 0 for off, 1 for on, default 0</p> 
     * @return SubtitleOutlineConfigSwitch <p>Text stroke configuration switch, 0 for off, 1 for on, default 0</p>
     */
    public Long getSubtitleOutlineConfigSwitch() {
        return this.SubtitleOutlineConfigSwitch;
    }

    /**
     * Set <p>Text stroke configuration switch, 0 for off, 1 for on, default 0</p>
     * @param SubtitleOutlineConfigSwitch <p>Text stroke configuration switch, 0 for off, 1 for on, default 0</p>
     */
    public void setSubtitleOutlineConfigSwitch(Long SubtitleOutlineConfigSwitch) {
        this.SubtitleOutlineConfigSwitch = SubtitleOutlineConfigSwitch;
    }

    /**
     * Get <p>Stroke width, default unit pixel, underlying default value is 0.3% of the source video height</p> 
     * @return OutlineWidth <p>Stroke width, default unit pixel, underlying default value is 0.3% of the source video height</p>
     */
    public Float getOutlineWidth() {
        return this.OutlineWidth;
    }

    /**
     * Set <p>Stroke width, default unit pixel, underlying default value is 0.3% of the source video height</p>
     * @param OutlineWidth <p>Stroke width, default unit pixel, underlying default value is 0.3% of the source video height</p>
     */
    public void setOutlineWidth(Float OutlineWidth) {
        this.OutlineWidth = OutlineWidth;
    }

    /**
     * Get <p>Stroke width unit, 0 pixel, 1 percentage, defaults to 0, pixel</p> 
     * @return OutlineWidthUnit <p>Stroke width unit, 0 pixel, 1 percentage, defaults to 0, pixel</p>
     */
    public Long getOutlineWidthUnit() {
        return this.OutlineWidthUnit;
    }

    /**
     * Set <p>Stroke width unit, 0 pixel, 1 percentage, defaults to 0, pixel</p>
     * @param OutlineWidthUnit <p>Stroke width unit, 0 pixel, 1 percentage, defaults to 0, pixel</p>
     */
    public void setOutlineWidthUnit(Long OutlineWidthUnit) {
        this.OutlineWidthUnit = OutlineWidthUnit;
    }

    /**
     * Get <p>Border color. 6-digit base 16 RGB. Black by default if left blank.</p> 
     * @return OutlineColor <p>Border color. 6-digit base 16 RGB. Black by default if left blank.</p>
     */
    public String getOutlineColor() {
        return this.OutlineColor;
    }

    /**
     * Set <p>Border color. 6-digit base 16 RGB. Black by default if left blank.</p>
     * @param OutlineColor <p>Border color. 6-digit base 16 RGB. Black by default if left blank.</p>
     */
    public void setOutlineColor(String OutlineColor) {
        this.OutlineColor = OutlineColor;
    }

    /**
     * Get <p>Stroke transparency. The value should be a positive floating-point number in the range of (0, 1]. If this is not specified, the default value is 1, which means completely opaque.</p> 
     * @return OutlineAlpha <p>Stroke transparency. The value should be a positive floating-point number in the range of (0, 1]. If this is not specified, the default value is 1, which means completely opaque.</p>
     */
    public Float getOutlineAlpha() {
        return this.OutlineAlpha;
    }

    /**
     * Set <p>Stroke transparency. The value should be a positive floating-point number in the range of (0, 1]. If this is not specified, the default value is 1, which means completely opaque.</p>
     * @param OutlineAlpha <p>Stroke transparency. The value should be a positive floating-point number in the range of (0, 1]. If this is not specified, the default value is 1, which means completely opaque.</p>
     */
    public void setOutlineAlpha(Float OutlineAlpha) {
        this.OutlineAlpha = OutlineAlpha;
    }

    public SubtitleOutlineConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SubtitleOutlineConfig(SubtitleOutlineConfig source) {
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

