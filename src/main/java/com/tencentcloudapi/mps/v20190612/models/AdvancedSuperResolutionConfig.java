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

public class AdvancedSuperResolutionConfig extends AbstractModel {

    /**
    * Capability configuration switch. Valid values:
<li>ON: enabled.</li>
<li>OFF: disabled.</li>
Default value: ON.
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * Type. Valid values:<li>standard: standard super-resolution.</li><li>super: super advanced super-resolution.</li><li>ultra: ultra advanced super-resolution.</li>Default value: standard.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Image output mode. The default value is percent.
<li>aspect: obtain a larger rectangle with specified width and height through super-resolution.</li>
<li>fixed: obtain images of fixed width and height through super-resolution, with forced scaling supported.</li>
<li>percent: magnification factor of super-resolution, which can be a decimal.</li>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Mode")
    @Expose
    private String Mode;

    /**
    * Scale factor of super-resolution, which can be a decimal.Note: This is used when Mode is percent.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Percent")
    @Expose
    private Float Percent;

    /**
    * Width of the target image. The value cannot exceed 4096.Note: When Mode is aspect or fixed, this configuration takes priority.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Width")
    @Expose
    private Long Width;

    /**
    * Height of the target image. The value cannot exceed 4096.Note: When Mode is aspect or fixed, this configuration takes priority.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Height")
    @Expose
    private Long Height;

    /**
    * Long side length of the target image. The value cannot exceed 4096.Note: This configuration is used when Mode is aspect or fixed and the Width and Height fields are not specified.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("LongSide")
    @Expose
    private Long LongSide;

    /**
    * Short side length of the target image. The value cannot exceed 4096.Note: This configuration is used when Mode is aspect or fixed and the Width and Height fields are not specified.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ShortSide")
    @Expose
    private Long ShortSide;

    /**
     * Get Capability configuration switch. Valid values:
<li>ON: enabled.</li>
<li>OFF: disabled.</li>
Default value: ON. 
     * @return Switch Capability configuration switch. Valid values:
<li>ON: enabled.</li>
<li>OFF: disabled.</li>
Default value: ON.
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set Capability configuration switch. Valid values:
<li>ON: enabled.</li>
<li>OFF: disabled.</li>
Default value: ON.
     * @param Switch Capability configuration switch. Valid values:
<li>ON: enabled.</li>
<li>OFF: disabled.</li>
Default value: ON.
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get Type. Valid values:<li>standard: standard super-resolution.</li><li>super: super advanced super-resolution.</li><li>ultra: ultra advanced super-resolution.</li>Default value: standard.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Type Type. Valid values:<li>standard: standard super-resolution.</li><li>super: super advanced super-resolution.</li><li>ultra: ultra advanced super-resolution.</li>Default value: standard.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Type. Valid values:<li>standard: standard super-resolution.</li><li>super: super advanced super-resolution.</li><li>ultra: ultra advanced super-resolution.</li>Default value: standard.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Type Type. Valid values:<li>standard: standard super-resolution.</li><li>super: super advanced super-resolution.</li><li>ultra: ultra advanced super-resolution.</li>Default value: standard.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Image output mode. The default value is percent.
<li>aspect: obtain a larger rectangle with specified width and height through super-resolution.</li>
<li>fixed: obtain images of fixed width and height through super-resolution, with forced scaling supported.</li>
<li>percent: magnification factor of super-resolution, which can be a decimal.</li>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Mode Image output mode. The default value is percent.
<li>aspect: obtain a larger rectangle with specified width and height through super-resolution.</li>
<li>fixed: obtain images of fixed width and height through super-resolution, with forced scaling supported.</li>
<li>percent: magnification factor of super-resolution, which can be a decimal.</li>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getMode() {
        return this.Mode;
    }

    /**
     * Set Image output mode. The default value is percent.
<li>aspect: obtain a larger rectangle with specified width and height through super-resolution.</li>
<li>fixed: obtain images of fixed width and height through super-resolution, with forced scaling supported.</li>
<li>percent: magnification factor of super-resolution, which can be a decimal.</li>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Mode Image output mode. The default value is percent.
<li>aspect: obtain a larger rectangle with specified width and height through super-resolution.</li>
<li>fixed: obtain images of fixed width and height through super-resolution, with forced scaling supported.</li>
<li>percent: magnification factor of super-resolution, which can be a decimal.</li>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMode(String Mode) {
        this.Mode = Mode;
    }

    /**
     * Get Scale factor of super-resolution, which can be a decimal.Note: This is used when Mode is percent.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Percent Scale factor of super-resolution, which can be a decimal.Note: This is used when Mode is percent.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Float getPercent() {
        return this.Percent;
    }

    /**
     * Set Scale factor of super-resolution, which can be a decimal.Note: This is used when Mode is percent.Note: This field may return null, indicating that no valid values can be obtained.
     * @param Percent Scale factor of super-resolution, which can be a decimal.Note: This is used when Mode is percent.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPercent(Float Percent) {
        this.Percent = Percent;
    }

    /**
     * Get Width of the target image. The value cannot exceed 4096.Note: When Mode is aspect or fixed, this configuration takes priority.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Width Width of the target image. The value cannot exceed 4096.Note: When Mode is aspect or fixed, this configuration takes priority.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getWidth() {
        return this.Width;
    }

    /**
     * Set Width of the target image. The value cannot exceed 4096.Note: When Mode is aspect or fixed, this configuration takes priority.Note: This field may return null, indicating that no valid values can be obtained.
     * @param Width Width of the target image. The value cannot exceed 4096.Note: When Mode is aspect or fixed, this configuration takes priority.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setWidth(Long Width) {
        this.Width = Width;
    }

    /**
     * Get Height of the target image. The value cannot exceed 4096.Note: When Mode is aspect or fixed, this configuration takes priority.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Height Height of the target image. The value cannot exceed 4096.Note: When Mode is aspect or fixed, this configuration takes priority.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getHeight() {
        return this.Height;
    }

    /**
     * Set Height of the target image. The value cannot exceed 4096.Note: When Mode is aspect or fixed, this configuration takes priority.Note: This field may return null, indicating that no valid values can be obtained.
     * @param Height Height of the target image. The value cannot exceed 4096.Note: When Mode is aspect or fixed, this configuration takes priority.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setHeight(Long Height) {
        this.Height = Height;
    }

    /**
     * Get Long side length of the target image. The value cannot exceed 4096.Note: This configuration is used when Mode is aspect or fixed and the Width and Height fields are not specified.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return LongSide Long side length of the target image. The value cannot exceed 4096.Note: This configuration is used when Mode is aspect or fixed and the Width and Height fields are not specified.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getLongSide() {
        return this.LongSide;
    }

    /**
     * Set Long side length of the target image. The value cannot exceed 4096.Note: This configuration is used when Mode is aspect or fixed and the Width and Height fields are not specified.Note: This field may return null, indicating that no valid values can be obtained.
     * @param LongSide Long side length of the target image. The value cannot exceed 4096.Note: This configuration is used when Mode is aspect or fixed and the Width and Height fields are not specified.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setLongSide(Long LongSide) {
        this.LongSide = LongSide;
    }

    /**
     * Get Short side length of the target image. The value cannot exceed 4096.Note: This configuration is used when Mode is aspect or fixed and the Width and Height fields are not specified.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ShortSide Short side length of the target image. The value cannot exceed 4096.Note: This configuration is used when Mode is aspect or fixed and the Width and Height fields are not specified.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getShortSide() {
        return this.ShortSide;
    }

    /**
     * Set Short side length of the target image. The value cannot exceed 4096.Note: This configuration is used when Mode is aspect or fixed and the Width and Height fields are not specified.Note: This field may return null, indicating that no valid values can be obtained.
     * @param ShortSide Short side length of the target image. The value cannot exceed 4096.Note: This configuration is used when Mode is aspect or fixed and the Width and Height fields are not specified.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setShortSide(Long ShortSide) {
        this.ShortSide = ShortSide;
    }

    public AdvancedSuperResolutionConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AdvancedSuperResolutionConfig(AdvancedSuperResolutionConfig source) {
        if (source.Switch != null) {
            this.Switch = new String(source.Switch);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Mode != null) {
            this.Mode = new String(source.Mode);
        }
        if (source.Percent != null) {
            this.Percent = new Float(source.Percent);
        }
        if (source.Width != null) {
            this.Width = new Long(source.Width);
        }
        if (source.Height != null) {
            this.Height = new Long(source.Height);
        }
        if (source.LongSide != null) {
            this.LongSide = new Long(source.LongSide);
        }
        if (source.ShortSide != null) {
            this.ShortSide = new Long(source.ShortSide);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Mode", this.Mode);
        this.setParamSimple(map, prefix + "Percent", this.Percent);
        this.setParamSimple(map, prefix + "Width", this.Width);
        this.setParamSimple(map, prefix + "Height", this.Height);
        this.setParamSimple(map, prefix + "LongSide", this.LongSide);
        this.setParamSimple(map, prefix + "ShortSide", this.ShortSide);

    }
}

