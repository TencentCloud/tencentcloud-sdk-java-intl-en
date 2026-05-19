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

public class AdvancedSuperResolutionConfig extends AbstractModel {

    /**
    * Capability configuration switch. Valid values:
<li>ON: enabled;</li>
<li>OFF: Disabled.</li>
Default value: ON.
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * Type, available values:
<li>standard: common super resolution</li>
<li>super: advanced super-resolution.</li>
Default value: standard.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Image output mode. The default value is percent.
<li>aspect: obtain a larger rectangle with specified width and height through super-resolution.</li>
<li>fixed: obtain images of fixed width and height through super-resolution, with forced scaling supported.</li>
<li>percent: Super-resolution multiplication rate, which can be a decimal.</li>
    */
    @SerializedName("Mode")
    @Expose
    private String Mode;

    /**
    * Super-resolution multiplication rate, can be decimal.
    */
    @SerializedName("Percent")
    @Expose
    private Float Percent;

    /**
    * Target image width must not exceed 4096.
    */
    @SerializedName("Width")
    @Expose
    private Long Width;

    /**
    * Target image height must not exceed 4096.
    */
    @SerializedName("Height")
    @Expose
    private Long Height;

    /**
    * The long edge length of the target image must not exceed 4096.
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
<li>ON: enabled;</li>
<li>OFF: Disabled.</li>
Default value: ON. 
     * @return Switch Capability configuration switch. Valid values:
<li>ON: enabled;</li>
<li>OFF: Disabled.</li>
Default value: ON.
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set Capability configuration switch. Valid values:
<li>ON: enabled;</li>
<li>OFF: Disabled.</li>
Default value: ON.
     * @param Switch Capability configuration switch. Valid values:
<li>ON: enabled;</li>
<li>OFF: Disabled.</li>
Default value: ON.
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get Type, available values:
<li>standard: common super resolution</li>
<li>super: advanced super-resolution.</li>
Default value: standard. 
     * @return Type Type, available values:
<li>standard: common super resolution</li>
<li>super: advanced super-resolution.</li>
Default value: standard.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Type, available values:
<li>standard: common super resolution</li>
<li>super: advanced super-resolution.</li>
Default value: standard.
     * @param Type Type, available values:
<li>standard: common super resolution</li>
<li>super: advanced super-resolution.</li>
Default value: standard.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Image output mode. The default value is percent.
<li>aspect: obtain a larger rectangle with specified width and height through super-resolution.</li>
<li>fixed: obtain images of fixed width and height through super-resolution, with forced scaling supported.</li>
<li>percent: Super-resolution multiplication rate, which can be a decimal.</li> 
     * @return Mode Image output mode. The default value is percent.
<li>aspect: obtain a larger rectangle with specified width and height through super-resolution.</li>
<li>fixed: obtain images of fixed width and height through super-resolution, with forced scaling supported.</li>
<li>percent: Super-resolution multiplication rate, which can be a decimal.</li>
     */
    public String getMode() {
        return this.Mode;
    }

    /**
     * Set Image output mode. The default value is percent.
<li>aspect: obtain a larger rectangle with specified width and height through super-resolution.</li>
<li>fixed: obtain images of fixed width and height through super-resolution, with forced scaling supported.</li>
<li>percent: Super-resolution multiplication rate, which can be a decimal.</li>
     * @param Mode Image output mode. The default value is percent.
<li>aspect: obtain a larger rectangle with specified width and height through super-resolution.</li>
<li>fixed: obtain images of fixed width and height through super-resolution, with forced scaling supported.</li>
<li>percent: Super-resolution multiplication rate, which can be a decimal.</li>
     */
    public void setMode(String Mode) {
        this.Mode = Mode;
    }

    /**
     * Get Super-resolution multiplication rate, can be decimal. 
     * @return Percent Super-resolution multiplication rate, can be decimal.
     */
    public Float getPercent() {
        return this.Percent;
    }

    /**
     * Set Super-resolution multiplication rate, can be decimal.
     * @param Percent Super-resolution multiplication rate, can be decimal.
     */
    public void setPercent(Float Percent) {
        this.Percent = Percent;
    }

    /**
     * Get Target image width must not exceed 4096. 
     * @return Width Target image width must not exceed 4096.
     */
    public Long getWidth() {
        return this.Width;
    }

    /**
     * Set Target image width must not exceed 4096.
     * @param Width Target image width must not exceed 4096.
     */
    public void setWidth(Long Width) {
        this.Width = Width;
    }

    /**
     * Get Target image height must not exceed 4096. 
     * @return Height Target image height must not exceed 4096.
     */
    public Long getHeight() {
        return this.Height;
    }

    /**
     * Set Target image height must not exceed 4096.
     * @param Height Target image height must not exceed 4096.
     */
    public void setHeight(Long Height) {
        this.Height = Height;
    }

    /**
     * Get The long edge length of the target image must not exceed 4096.
Note: This configuration is used when Mode equals aspect or fixed and the Width and Height fields are unconfigured. 
     * @return LongSide The long edge length of the target image must not exceed 4096.
Note: This configuration is used when Mode equals aspect or fixed and the Width and Height fields are unconfigured.
     */
    public Long getLongSide() {
        return this.LongSide;
    }

    /**
     * Set The long edge length of the target image must not exceed 4096.
Note: This configuration is used when Mode equals aspect or fixed and the Width and Height fields are unconfigured.
     * @param LongSide The long edge length of the target image must not exceed 4096.
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

