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
    * Type, available values:
<li>standard: Common super-resolution</li>
<li>super: Advanced super-resolution.
<li>ultra: Advanced super-resolution ultra edition.</li>
Default value: standard.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Image output mode. The default value is percent.
<li>aspect: Obtain a larger rectangle with specified width and height through super-resolution.</li>
<li>fixed: obtain images of fixed width and height through super-resolution, with forced scaling supported.</li>
<li>percent: Super-resolution magnification factor, which can be a decimal.</li>
    */
    @SerializedName("Mode")
    @Expose
    private String Mode;

    /**
    * Super-resolution multiplication rate, can be a decimal.
Note: Used when Mode equals percent.
    */
    @SerializedName("Percent")
    @Expose
    private Float Percent;

    /**
    * Image width must not exceed 4096.
Note: When Mode equals aspect or fixed, preferentially use this configuration.
    */
    @SerializedName("Width")
    @Expose
    private Long Width;

    /**
    * Target image height must not exceed 4096.
Note: When Mode equals aspect or fixed, preferentially use this configuration.
    */
    @SerializedName("Height")
    @Expose
    private Long Height;

    /**
    * The long side length of the target image must not exceed 4096.
Note: This configuration is used when Mode equals aspect or fixed and the Width and Height fields are unconfigured.
    */
    @SerializedName("LongSide")
    @Expose
    private Long LongSide;

    /**
    * The short side length of the target image must not exceed 4096.
Note: This configuration is used when Mode equals aspect or fixed and the Width and Height fields are unconfigured.
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
     * Get Type, available values:
<li>standard: Common super-resolution</li>
<li>super: Advanced super-resolution.
<li>ultra: Advanced super-resolution ultra edition.</li>
Default value: standard. 
     * @return Type Type, available values:
<li>standard: Common super-resolution</li>
<li>super: Advanced super-resolution.
<li>ultra: Advanced super-resolution ultra edition.</li>
Default value: standard.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Type, available values:
<li>standard: Common super-resolution</li>
<li>super: Advanced super-resolution.
<li>ultra: Advanced super-resolution ultra edition.</li>
Default value: standard.
     * @param Type Type, available values:
<li>standard: Common super-resolution</li>
<li>super: Advanced super-resolution.
<li>ultra: Advanced super-resolution ultra edition.</li>
Default value: standard.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Image output mode. The default value is percent.
<li>aspect: Obtain a larger rectangle with specified width and height through super-resolution.</li>
<li>fixed: obtain images of fixed width and height through super-resolution, with forced scaling supported.</li>
<li>percent: Super-resolution magnification factor, which can be a decimal.</li> 
     * @return Mode Image output mode. The default value is percent.
<li>aspect: Obtain a larger rectangle with specified width and height through super-resolution.</li>
<li>fixed: obtain images of fixed width and height through super-resolution, with forced scaling supported.</li>
<li>percent: Super-resolution magnification factor, which can be a decimal.</li>
     */
    public String getMode() {
        return this.Mode;
    }

    /**
     * Set Image output mode. The default value is percent.
<li>aspect: Obtain a larger rectangle with specified width and height through super-resolution.</li>
<li>fixed: obtain images of fixed width and height through super-resolution, with forced scaling supported.</li>
<li>percent: Super-resolution magnification factor, which can be a decimal.</li>
     * @param Mode Image output mode. The default value is percent.
<li>aspect: Obtain a larger rectangle with specified width and height through super-resolution.</li>
<li>fixed: obtain images of fixed width and height through super-resolution, with forced scaling supported.</li>
<li>percent: Super-resolution magnification factor, which can be a decimal.</li>
     */
    public void setMode(String Mode) {
        this.Mode = Mode;
    }

    /**
     * Get Super-resolution multiplication rate, can be a decimal.
Note: Used when Mode equals percent. 
     * @return Percent Super-resolution multiplication rate, can be a decimal.
Note: Used when Mode equals percent.
     */
    public Float getPercent() {
        return this.Percent;
    }

    /**
     * Set Super-resolution multiplication rate, can be a decimal.
Note: Used when Mode equals percent.
     * @param Percent Super-resolution multiplication rate, can be a decimal.
Note: Used when Mode equals percent.
     */
    public void setPercent(Float Percent) {
        this.Percent = Percent;
    }

    /**
     * Get Image width must not exceed 4096.
Note: When Mode equals aspect or fixed, preferentially use this configuration. 
     * @return Width Image width must not exceed 4096.
Note: When Mode equals aspect or fixed, preferentially use this configuration.
     */
    public Long getWidth() {
        return this.Width;
    }

    /**
     * Set Image width must not exceed 4096.
Note: When Mode equals aspect or fixed, preferentially use this configuration.
     * @param Width Image width must not exceed 4096.
Note: When Mode equals aspect or fixed, preferentially use this configuration.
     */
    public void setWidth(Long Width) {
        this.Width = Width;
    }

    /**
     * Get Target image height must not exceed 4096.
Note: When Mode equals aspect or fixed, preferentially use this configuration. 
     * @return Height Target image height must not exceed 4096.
Note: When Mode equals aspect or fixed, preferentially use this configuration.
     */
    public Long getHeight() {
        return this.Height;
    }

    /**
     * Set Target image height must not exceed 4096.
Note: When Mode equals aspect or fixed, preferentially use this configuration.
     * @param Height Target image height must not exceed 4096.
Note: When Mode equals aspect or fixed, preferentially use this configuration.
     */
    public void setHeight(Long Height) {
        this.Height = Height;
    }

    /**
     * Get The long side length of the target image must not exceed 4096.
Note: This configuration is used when Mode equals aspect or fixed and the Width and Height fields are unconfigured. 
     * @return LongSide The long side length of the target image must not exceed 4096.
Note: This configuration is used when Mode equals aspect or fixed and the Width and Height fields are unconfigured.
     */
    public Long getLongSide() {
        return this.LongSide;
    }

    /**
     * Set The long side length of the target image must not exceed 4096.
Note: This configuration is used when Mode equals aspect or fixed and the Width and Height fields are unconfigured.
     * @param LongSide The long side length of the target image must not exceed 4096.
Note: This configuration is used when Mode equals aspect or fixed and the Width and Height fields are unconfigured.
     */
    public void setLongSide(Long LongSide) {
        this.LongSide = LongSide;
    }

    /**
     * Get The short side length of the target image must not exceed 4096.
Note: This configuration is used when Mode equals aspect or fixed and the Width and Height fields are unconfigured. 
     * @return ShortSide The short side length of the target image must not exceed 4096.
Note: This configuration is used when Mode equals aspect or fixed and the Width and Height fields are unconfigured.
     */
    public Long getShortSide() {
        return this.ShortSide;
    }

    /**
     * Set The short side length of the target image must not exceed 4096.
Note: This configuration is used when Mode equals aspect or fixed and the Width and Height fields are unconfigured.
     * @param ShortSide The short side length of the target image must not exceed 4096.
Note: This configuration is used when Mode equals aspect or fixed and the Width and Height fields are unconfigured.
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

