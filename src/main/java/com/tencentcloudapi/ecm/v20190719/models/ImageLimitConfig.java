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
package com.tencentcloudapi.ecm.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ImageLimitConfig extends AbstractModel {

    /**
    * Supported maximum image size in GB, including custom image size for import and central cloud image size.
    */
    @SerializedName("MaxImageSize")
    @Expose
    private Long MaxImageSize;

    /**
     * Get Supported maximum image size in GB, including custom image size for import and central cloud image size. 
     * @return MaxImageSize Supported maximum image size in GB, including custom image size for import and central cloud image size.
     */
    public Long getMaxImageSize() {
        return this.MaxImageSize;
    }

    /**
     * Set Supported maximum image size in GB, including custom image size for import and central cloud image size.
     * @param MaxImageSize Supported maximum image size in GB, including custom image size for import and central cloud image size.
     */
    public void setMaxImageSize(Long MaxImageSize) {
        this.MaxImageSize = MaxImageSize;
    }

    public ImageLimitConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImageLimitConfig(ImageLimitConfig source) {
        if (source.MaxImageSize != null) {
            this.MaxImageSize = new Long(source.MaxImageSize);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MaxImageSize", this.MaxImageSize);

    }
}

