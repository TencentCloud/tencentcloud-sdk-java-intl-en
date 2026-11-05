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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BackgroundImage extends AbstractModel {

    /**
    * Brightness level
    */
    @SerializedName("Brightness")
    @Expose
    private Long Brightness;

    /**
    * Landscape image (pc)
    */
    @SerializedName("LandscapeImageUrl")
    @Expose
    private String LandscapeImageUrl;

    /**
    * Original image
    */
    @SerializedName("OriginalImageUrl")
    @Expose
    private String OriginalImageUrl;

    /**
    * Long image (mobile phone)
    */
    @SerializedName("PortraitImageUrl")
    @Expose
    private String PortraitImageUrl;

    /**
    * Theme color
    */
    @SerializedName("ThemeColor")
    @Expose
    private String ThemeColor;

    /**
     * Get Brightness level 
     * @return Brightness Brightness level
     */
    public Long getBrightness() {
        return this.Brightness;
    }

    /**
     * Set Brightness level
     * @param Brightness Brightness level
     */
    public void setBrightness(Long Brightness) {
        this.Brightness = Brightness;
    }

    /**
     * Get Landscape image (pc) 
     * @return LandscapeImageUrl Landscape image (pc)
     */
    public String getLandscapeImageUrl() {
        return this.LandscapeImageUrl;
    }

    /**
     * Set Landscape image (pc)
     * @param LandscapeImageUrl Landscape image (pc)
     */
    public void setLandscapeImageUrl(String LandscapeImageUrl) {
        this.LandscapeImageUrl = LandscapeImageUrl;
    }

    /**
     * Get Original image 
     * @return OriginalImageUrl Original image
     */
    public String getOriginalImageUrl() {
        return this.OriginalImageUrl;
    }

    /**
     * Set Original image
     * @param OriginalImageUrl Original image
     */
    public void setOriginalImageUrl(String OriginalImageUrl) {
        this.OriginalImageUrl = OriginalImageUrl;
    }

    /**
     * Get Long image (mobile phone) 
     * @return PortraitImageUrl Long image (mobile phone)
     */
    public String getPortraitImageUrl() {
        return this.PortraitImageUrl;
    }

    /**
     * Set Long image (mobile phone)
     * @param PortraitImageUrl Long image (mobile phone)
     */
    public void setPortraitImageUrl(String PortraitImageUrl) {
        this.PortraitImageUrl = PortraitImageUrl;
    }

    /**
     * Get Theme color 
     * @return ThemeColor Theme color
     */
    public String getThemeColor() {
        return this.ThemeColor;
    }

    /**
     * Set Theme color
     * @param ThemeColor Theme color
     */
    public void setThemeColor(String ThemeColor) {
        this.ThemeColor = ThemeColor;
    }

    public BackgroundImage() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BackgroundImage(BackgroundImage source) {
        if (source.Brightness != null) {
            this.Brightness = new Long(source.Brightness);
        }
        if (source.LandscapeImageUrl != null) {
            this.LandscapeImageUrl = new String(source.LandscapeImageUrl);
        }
        if (source.OriginalImageUrl != null) {
            this.OriginalImageUrl = new String(source.OriginalImageUrl);
        }
        if (source.PortraitImageUrl != null) {
            this.PortraitImageUrl = new String(source.PortraitImageUrl);
        }
        if (source.ThemeColor != null) {
            this.ThemeColor = new String(source.ThemeColor);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Brightness", this.Brightness);
        this.setParamSimple(map, prefix + "LandscapeImageUrl", this.LandscapeImageUrl);
        this.setParamSimple(map, prefix + "OriginalImageUrl", this.OriginalImageUrl);
        this.setParamSimple(map, prefix + "PortraitImageUrl", this.PortraitImageUrl);
        this.setParamSimple(map, prefix + "ThemeColor", this.ThemeColor);

    }
}

