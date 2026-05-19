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

public class ImageEncodeConfig extends AbstractModel {

    /**
    * Image format. Valid values: JPEG, PNG, BMP, and WebP. Defaults to the original image format. Animation is not supported.
    */
    @SerializedName("Format")
    @Expose
    private String Format;

    /**
    * Relative image quality. Value ranges from 1 to 100. The numeric value is based on the original image quality and defaults to the original image quality.
    */
    @SerializedName("Quality")
    @Expose
    private Long Quality;

    /**
     * Get Image format. Valid values: JPEG, PNG, BMP, and WebP. Defaults to the original image format. Animation is not supported. 
     * @return Format Image format. Valid values: JPEG, PNG, BMP, and WebP. Defaults to the original image format. Animation is not supported.
     */
    public String getFormat() {
        return this.Format;
    }

    /**
     * Set Image format. Valid values: JPEG, PNG, BMP, and WebP. Defaults to the original image format. Animation is not supported.
     * @param Format Image format. Valid values: JPEG, PNG, BMP, and WebP. Defaults to the original image format. Animation is not supported.
     */
    public void setFormat(String Format) {
        this.Format = Format;
    }

    /**
     * Get Relative image quality. Value ranges from 1 to 100. The numeric value is based on the original image quality and defaults to the original image quality. 
     * @return Quality Relative image quality. Value ranges from 1 to 100. The numeric value is based on the original image quality and defaults to the original image quality.
     */
    public Long getQuality() {
        return this.Quality;
    }

    /**
     * Set Relative image quality. Value ranges from 1 to 100. The numeric value is based on the original image quality and defaults to the original image quality.
     * @param Quality Relative image quality. Value ranges from 1 to 100. The numeric value is based on the original image quality and defaults to the original image quality.
     */
    public void setQuality(Long Quality) {
        this.Quality = Quality;
    }

    public ImageEncodeConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImageEncodeConfig(ImageEncodeConfig source) {
        if (source.Format != null) {
            this.Format = new String(source.Format);
        }
        if (source.Quality != null) {
            this.Quality = new Long(source.Quality);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Format", this.Format);
        this.setParamSimple(map, prefix + "Quality", this.Quality);

    }
}

