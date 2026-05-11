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
    * <p>Timbre name.</p>
    */
    @SerializedName("VoiceName")
    @Expose
    private String VoiceName;

    /**
    * <p>Access link for the voice type data file.</p>
    */
    @SerializedName("VoiceUrl")
    @Expose
    private String VoiceUrl;

    /**
    * <p>History works ID. Audio material can be provided by referring to historic works.</p>
    */
    @SerializedName("VideoId")
    @Expose
    private String VideoId;

    /**
     * Get <p>Timbre name.</p> 
     * @return VoiceName <p>Timbre name.</p>
     */
    public String getVoiceName() {
        return this.VoiceName;
    }

    /**
     * Set <p>Timbre name.</p>
     * @param VoiceName <p>Timbre name.</p>
     */
    public void setVoiceName(String VoiceName) {
        this.VoiceName = VoiceName;
    }

    /**
     * Get <p>Access link for the voice type data file.</p> 
     * @return VoiceUrl <p>Access link for the voice type data file.</p>
     */
    public String getVoiceUrl() {
        return this.VoiceUrl;
    }

    /**
     * Set <p>Access link for the voice type data file.</p>
     * @param VoiceUrl <p>Access link for the voice type data file.</p>
     */
    public void setVoiceUrl(String VoiceUrl) {
        this.VoiceUrl = VoiceUrl;
    }

    /**
     * Get <p>History works ID. Audio material can be provided by referring to historic works.</p> 
     * @return VideoId <p>History works ID. Audio material can be provided by referring to historic works.</p>
     */
    public String getVideoId() {
        return this.VideoId;
    }

    /**
     * Set <p>History works ID. Audio material can be provided by referring to historic works.</p>
     * @param VideoId <p>History works ID. Audio material can be provided by referring to historic works.</p>
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

