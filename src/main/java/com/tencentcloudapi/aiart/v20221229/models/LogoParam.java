/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
package com.tencentcloudapi.aiart.v20221229.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LogoParam extends AbstractModel {

    /**
    * Logo URL
    */
    @SerializedName("LogoUrl")
    @Expose
    private String LogoUrl;

    /**
    * Logo Base64 code. Either the Base64 code or URL must be provided. If both are provided, URL prevails.
    */
    @SerializedName("LogoImage")
    @Expose
    private String LogoImage;

    /**
    * Coordinates of the logo image in the generated image. The logo image will be stretched according to the coordinates.
    */
    @SerializedName("LogoRect")
    @Expose
    private LogoRect LogoRect;

    /**
     * Get Logo URL 
     * @return LogoUrl Logo URL
     */
    public String getLogoUrl() {
        return this.LogoUrl;
    }

    /**
     * Set Logo URL
     * @param LogoUrl Logo URL
     */
    public void setLogoUrl(String LogoUrl) {
        this.LogoUrl = LogoUrl;
    }

    /**
     * Get Logo Base64 code. Either the Base64 code or URL must be provided. If both are provided, URL prevails. 
     * @return LogoImage Logo Base64 code. Either the Base64 code or URL must be provided. If both are provided, URL prevails.
     */
    public String getLogoImage() {
        return this.LogoImage;
    }

    /**
     * Set Logo Base64 code. Either the Base64 code or URL must be provided. If both are provided, URL prevails.
     * @param LogoImage Logo Base64 code. Either the Base64 code or URL must be provided. If both are provided, URL prevails.
     */
    public void setLogoImage(String LogoImage) {
        this.LogoImage = LogoImage;
    }

    /**
     * Get Coordinates of the logo image in the generated image. The logo image will be stretched according to the coordinates. 
     * @return LogoRect Coordinates of the logo image in the generated image. The logo image will be stretched according to the coordinates.
     */
    public LogoRect getLogoRect() {
        return this.LogoRect;
    }

    /**
     * Set Coordinates of the logo image in the generated image. The logo image will be stretched according to the coordinates.
     * @param LogoRect Coordinates of the logo image in the generated image. The logo image will be stretched according to the coordinates.
     */
    public void setLogoRect(LogoRect LogoRect) {
        this.LogoRect = LogoRect;
    }

    public LogoParam() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LogoParam(LogoParam source) {
        if (source.LogoUrl != null) {
            this.LogoUrl = new String(source.LogoUrl);
        }
        if (source.LogoImage != null) {
            this.LogoImage = new String(source.LogoImage);
        }
        if (source.LogoRect != null) {
            this.LogoRect = new LogoRect(source.LogoRect);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LogoUrl", this.LogoUrl);
        this.setParamSimple(map, prefix + "LogoImage", this.LogoImage);
        this.setParamObj(map, prefix + "LogoRect.", this.LogoRect);

    }
}

