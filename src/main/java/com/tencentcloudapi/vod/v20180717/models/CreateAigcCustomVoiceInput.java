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

public class CreateAigcCustomVoiceInput extends AbstractModel {

    /**
    * 
    */
    @SerializedName("VoiceName")
    @Expose
    private String VoiceName;

    /**
    * 
    */
    @SerializedName("VoiceUrl")
    @Expose
    private String VoiceUrl;

    /**
    * 
    */
    @SerializedName("VideoId")
    @Expose
    private String VideoId;

    /**
     * Get  
     * @return VoiceName 
     */
    public String getVoiceName() {
        return this.VoiceName;
    }

    /**
     * Set 
     * @param VoiceName 
     */
    public void setVoiceName(String VoiceName) {
        this.VoiceName = VoiceName;
    }

    /**
     * Get  
     * @return VoiceUrl 
     */
    public String getVoiceUrl() {
        return this.VoiceUrl;
    }

    /**
     * Set 
     * @param VoiceUrl 
     */
    public void setVoiceUrl(String VoiceUrl) {
        this.VoiceUrl = VoiceUrl;
    }

    /**
     * Get  
     * @return VideoId 
     */
    public String getVideoId() {
        return this.VideoId;
    }

    /**
     * Set 
     * @param VideoId 
     */
    public void setVideoId(String VideoId) {
        this.VideoId = VideoId;
    }

    public CreateAigcCustomVoiceInput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateAigcCustomVoiceInput(CreateAigcCustomVoiceInput source) {
        if (source.VoiceName != null) {
            this.VoiceName = new String(source.VoiceName);
        }
        if (source.VoiceUrl != null) {
            this.VoiceUrl = new String(source.VoiceUrl);
        }
        if (source.VideoId != null) {
            this.VideoId = new String(source.VideoId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VoiceName", this.VoiceName);
        this.setParamSimple(map, prefix + "VoiceUrl", this.VoiceUrl);
        this.setParamSimple(map, prefix + "VideoId", this.VideoId);

    }
}

