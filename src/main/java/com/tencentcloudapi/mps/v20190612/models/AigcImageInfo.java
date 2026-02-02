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

public class AigcImageInfo extends AbstractModel {

    /**
    * Image URL for video generation. The URL must be accessible from the public network and must be accessible to crawlers.
    */
    @SerializedName("ImageUrl")
    @Expose
    private String ImageUrl;

    /**
    * Reference type.
Note:1. When the model uses Vidu's q2 multi-reference image generation, this can also be used to specify the subject ID.2. If the GV model is used, this serves as the reference method. Valid values are asset and style.
    */
    @SerializedName("ReferenceType")
    @Expose
    private String ReferenceType;

    /**
     * Get Image URL for video generation. The URL must be accessible from the public network and must be accessible to crawlers. 
     * @return ImageUrl Image URL for video generation. The URL must be accessible from the public network and must be accessible to crawlers.
     */
    public String getImageUrl() {
        return this.ImageUrl;
    }

    /**
     * Set Image URL for video generation. The URL must be accessible from the public network and must be accessible to crawlers.
     * @param ImageUrl Image URL for video generation. The URL must be accessible from the public network and must be accessible to crawlers.
     */
    public void setImageUrl(String ImageUrl) {
        this.ImageUrl = ImageUrl;
    }

    /**
     * Get Reference type.
Note:1. When the model uses Vidu's q2 multi-reference image generation, this can also be used to specify the subject ID.2. If the GV model is used, this serves as the reference method. Valid values are asset and style. 
     * @return ReferenceType Reference type.
Note:1. When the model uses Vidu's q2 multi-reference image generation, this can also be used to specify the subject ID.2. If the GV model is used, this serves as the reference method. Valid values are asset and style.
     */
    public String getReferenceType() {
        return this.ReferenceType;
    }

    /**
     * Set Reference type.
Note:1. When the model uses Vidu's q2 multi-reference image generation, this can also be used to specify the subject ID.2. If the GV model is used, this serves as the reference method. Valid values are asset and style.
     * @param ReferenceType Reference type.
Note:1. When the model uses Vidu's q2 multi-reference image generation, this can also be used to specify the subject ID.2. If the GV model is used, this serves as the reference method. Valid values are asset and style.
     */
    public void setReferenceType(String ReferenceType) {
        this.ReferenceType = ReferenceType;
    }

    public AigcImageInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AigcImageInfo(AigcImageInfo source) {
        if (source.ImageUrl != null) {
            this.ImageUrl = new String(source.ImageUrl);
        }
        if (source.ReferenceType != null) {
            this.ReferenceType = new String(source.ReferenceType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ImageUrl", this.ImageUrl);
        this.setParamSimple(map, prefix + "ReferenceType", this.ReferenceType);

    }
}

