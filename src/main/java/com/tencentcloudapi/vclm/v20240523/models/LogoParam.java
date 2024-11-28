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
package com.tencentcloudapi.vclm.v20240523.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LogoParam extends AbstractModel {

    /**
    * Watermark URL

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("LogoUrl")
    @Expose
    private String LogoUrl;

    /**
    * Watermark Base64 code is supported. Either the Base64 code or URL must be provided. If both are provided, the URL prevails.

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("LogoImage")
    @Expose
    private String LogoImage;

    /**
    * The coordinates of the watermark image in the generated image. The mark image will be expanded according to the coordinates.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("LogoRect")
    @Expose
    private LogoRect LogoRect;

    /**
     * Get Watermark URL

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return LogoUrl Watermark URL

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getLogoUrl() {
        return this.LogoUrl;
    }

    /**
     * Set Watermark URL

Note: This field may return null, indicating that no valid values can be obtained.
     * @param LogoUrl Watermark URL

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setLogoUrl(String LogoUrl) {
        this.LogoUrl = LogoUrl;
    }

    /**
     * Get Watermark Base64 code is supported. Either the Base64 code or URL must be provided. If both are provided, the URL prevails.

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return LogoImage Watermark Base64 code is supported. Either the Base64 code or URL must be provided. If both are provided, the URL prevails.

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getLogoImage() {
        return this.LogoImage;
    }

    /**
     * Set Watermark Base64 code is supported. Either the Base64 code or URL must be provided. If both are provided, the URL prevails.

Note: This field may return null, indicating that no valid values can be obtained.
     * @param LogoImage Watermark Base64 code is supported. Either the Base64 code or URL must be provided. If both are provided, the URL prevails.

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setLogoImage(String LogoImage) {
        this.LogoImage = LogoImage;
    }

    /**
     * Get The coordinates of the watermark image in the generated image. The mark image will be expanded according to the coordinates.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return LogoRect The coordinates of the watermark image in the generated image. The mark image will be expanded according to the coordinates.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public LogoRect getLogoRect() {
        return this.LogoRect;
    }

    /**
     * Set The coordinates of the watermark image in the generated image. The mark image will be expanded according to the coordinates.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param LogoRect The coordinates of the watermark image in the generated image. The mark image will be expanded according to the coordinates.
Note: This field may return null, indicating that no valid values can be obtained.
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

