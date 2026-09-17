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

public class BorderFrameSetting extends AbstractModel {

    /**
    * Live streaming source layout configuration
    */
    @SerializedName("LiveSourceLayout")
    @Expose
    private SourceLayout LiveSourceLayout;

    /**
    * Background image URL, starting with http/https and ending in jpg/jpeg/png, (only required for UPLOAD_CREATIVES)
    */
    @SerializedName("BackgroundImgUrl")
    @Expose
    private String BackgroundImgUrl;

    /**
     * Get Live streaming source layout configuration 
     * @return LiveSourceLayout Live streaming source layout configuration
     */
    public SourceLayout getLiveSourceLayout() {
        return this.LiveSourceLayout;
    }

    /**
     * Set Live streaming source layout configuration
     * @param LiveSourceLayout Live streaming source layout configuration
     */
    public void setLiveSourceLayout(SourceLayout LiveSourceLayout) {
        this.LiveSourceLayout = LiveSourceLayout;
    }

    /**
     * Get Background image URL, starting with http/https and ending in jpg/jpeg/png, (only required for UPLOAD_CREATIVES) 
     * @return BackgroundImgUrl Background image URL, starting with http/https and ending in jpg/jpeg/png, (only required for UPLOAD_CREATIVES)
     */
    public String getBackgroundImgUrl() {
        return this.BackgroundImgUrl;
    }

    /**
     * Set Background image URL, starting with http/https and ending in jpg/jpeg/png, (only required for UPLOAD_CREATIVES)
     * @param BackgroundImgUrl Background image URL, starting with http/https and ending in jpg/jpeg/png, (only required for UPLOAD_CREATIVES)
     */
    public void setBackgroundImgUrl(String BackgroundImgUrl) {
        this.BackgroundImgUrl = BackgroundImgUrl;
    }

    public BorderFrameSetting() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BorderFrameSetting(BorderFrameSetting source) {
        if (source.LiveSourceLayout != null) {
            this.LiveSourceLayout = new SourceLayout(source.LiveSourceLayout);
        }
        if (source.BackgroundImgUrl != null) {
            this.BackgroundImgUrl = new String(source.BackgroundImgUrl);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "LiveSourceLayout.", this.LiveSourceLayout);
        this.setParamSimple(map, prefix + "BackgroundImgUrl", this.BackgroundImgUrl);

    }
}

