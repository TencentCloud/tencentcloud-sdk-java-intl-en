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

public class AigcImageExtraParam extends AbstractModel {

    /**
    * The aspect ratio of the generated video.Supported aspect ratios for different models:1. GEM: 1:1, 3:2, 2:3, 3:4, 4:3, 4:5, 5:4, 9:16, 16:9, and 21:9.Note: For more information about the aspect ratios of specific models, see the model website.
    */
    @SerializedName("AspectRatio")
    @Expose
    private String AspectRatio;

    /**
    * Output resolution of the image.Models that support this parameter:Valid values: 720P, 1080P, 2K, and 4K.
    */
    @SerializedName("Resolution")
    @Expose
    private String Resolution;

    /**
     * Get The aspect ratio of the generated video.Supported aspect ratios for different models:1. GEM: 1:1, 3:2, 2:3, 3:4, 4:3, 4:5, 5:4, 9:16, 16:9, and 21:9.Note: For more information about the aspect ratios of specific models, see the model website. 
     * @return AspectRatio The aspect ratio of the generated video.Supported aspect ratios for different models:1. GEM: 1:1, 3:2, 2:3, 3:4, 4:3, 4:5, 5:4, 9:16, 16:9, and 21:9.Note: For more information about the aspect ratios of specific models, see the model website.
     */
    public String getAspectRatio() {
        return this.AspectRatio;
    }

    /**
     * Set The aspect ratio of the generated video.Supported aspect ratios for different models:1. GEM: 1:1, 3:2, 2:3, 3:4, 4:3, 4:5, 5:4, 9:16, 16:9, and 21:9.Note: For more information about the aspect ratios of specific models, see the model website.
     * @param AspectRatio The aspect ratio of the generated video.Supported aspect ratios for different models:1. GEM: 1:1, 3:2, 2:3, 3:4, 4:3, 4:5, 5:4, 9:16, 16:9, and 21:9.Note: For more information about the aspect ratios of specific models, see the model website.
     */
    public void setAspectRatio(String AspectRatio) {
        this.AspectRatio = AspectRatio;
    }

    /**
     * Get Output resolution of the image.Models that support this parameter:Valid values: 720P, 1080P, 2K, and 4K. 
     * @return Resolution Output resolution of the image.Models that support this parameter:Valid values: 720P, 1080P, 2K, and 4K.
     */
    public String getResolution() {
        return this.Resolution;
    }

    /**
     * Set Output resolution of the image.Models that support this parameter:Valid values: 720P, 1080P, 2K, and 4K.
     * @param Resolution Output resolution of the image.Models that support this parameter:Valid values: 720P, 1080P, 2K, and 4K.
     */
    public void setResolution(String Resolution) {
        this.Resolution = Resolution;
    }

    public AigcImageExtraParam() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AigcImageExtraParam(AigcImageExtraParam source) {
        if (source.AspectRatio != null) {
            this.AspectRatio = new String(source.AspectRatio);
        }
        if (source.Resolution != null) {
            this.Resolution = new String(source.Resolution);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AspectRatio", this.AspectRatio);
        this.setParamSimple(map, prefix + "Resolution", this.Resolution);

    }
}

