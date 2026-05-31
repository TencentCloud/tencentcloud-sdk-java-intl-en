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
package com.tencentcloudapi.mdl.v20200326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ThumbnailSettings extends AbstractModel {

    /**
    * Whether to generate thumbnails  0: disabled  1: enabled  Default value: 0
    */
    @SerializedName("ThumbnailEnabled")
    @Expose
    private Long ThumbnailEnabled;

    /**
     * Get Whether to generate thumbnails  0: disabled  1: enabled  Default value: 0 
     * @return ThumbnailEnabled Whether to generate thumbnails  0: disabled  1: enabled  Default value: 0
     */
    public Long getThumbnailEnabled() {
        return this.ThumbnailEnabled;
    }

    /**
     * Set Whether to generate thumbnails  0: disabled  1: enabled  Default value: 0
     * @param ThumbnailEnabled Whether to generate thumbnails  0: disabled  1: enabled  Default value: 0
     */
    public void setThumbnailEnabled(Long ThumbnailEnabled) {
        this.ThumbnailEnabled = ThumbnailEnabled;
    }

    public ThumbnailSettings() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ThumbnailSettings(ThumbnailSettings source) {
        if (source.ThumbnailEnabled != null) {
            this.ThumbnailEnabled = new Long(source.ThumbnailEnabled);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ThumbnailEnabled", this.ThumbnailEnabled);

    }
}

