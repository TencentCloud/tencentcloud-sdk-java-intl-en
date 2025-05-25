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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ImageEncodeConfig extends AbstractModel {

    /**
    * Image format. Valid values: JPEG, PNG, BMP, and WebP. If it is not specified, the original image format is used. Animations are not supported.
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Format")
    @Expose
    private String Format;

    /**
    * Relative image quality. Valid range: 1 - 100. The value is based on the original image quality, and the default is the original image quality.
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Quality")
    @Expose
    private Long Quality;

    /**
     * Get Image format. Valid values: JPEG, PNG, BMP, and WebP. If it is not specified, the original image format is used. Animations are not supported.
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return Format Image format. Valid values: JPEG, PNG, BMP, and WebP. If it is not specified, the original image format is used. Animations are not supported.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getFormat() {
        return this.Format;
    }

    /**
     * Set Image format. Valid values: JPEG, PNG, BMP, and WebP. If it is not specified, the original image format is used. Animations are not supported.
Note: This field may return null, indicating that no valid value can be obtained.
     * @param Format Image format. Valid values: JPEG, PNG, BMP, and WebP. If it is not specified, the original image format is used. Animations are not supported.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setFormat(String Format) {
        this.Format = Format;
    }

    /**
     * Get Relative image quality. Valid range: 1 - 100. The value is based on the original image quality, and the default is the original image quality.
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return Quality Relative image quality. Valid range: 1 - 100. The value is based on the original image quality, and the default is the original image quality.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getQuality() {
        return this.Quality;
    }

    /**
     * Set Relative image quality. Valid range: 1 - 100. The value is based on the original image quality, and the default is the original image quality.
Note: This field may return null, indicating that no valid value can be obtained.
     * @param Quality Relative image quality. Valid range: 1 - 100. The value is based on the original image quality, and the default is the original image quality.
Note: This field may return null, indicating that no valid value can be obtained.
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

