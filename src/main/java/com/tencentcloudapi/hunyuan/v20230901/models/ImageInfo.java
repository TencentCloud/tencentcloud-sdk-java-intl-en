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
package com.tencentcloudapi.hunyuan.v20230901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ImageInfo extends AbstractModel {

    /**
    * Image Url.
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * Image Base64.
    */
    @SerializedName("Base64")
    @Expose
    private String Base64;

    /**
     * Get Image Url. 
     * @return Url Image Url.
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set Image Url.
     * @param Url Image Url.
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get Image Base64. 
     * @return Base64 Image Base64.
     */
    public String getBase64() {
        return this.Base64;
    }

    /**
     * Set Image Base64.
     * @param Base64 Image Base64.
     */
    public void setBase64(String Base64) {
        this.Base64 = Base64;
    }

    public ImageInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImageInfo(ImageInfo source) {
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.Base64 != null) {
            this.Base64 = new String(source.Base64);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "Base64", this.Base64);

    }
}

