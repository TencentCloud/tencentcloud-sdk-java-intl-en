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

public class AigcVideoReferenceVideoInfo extends AbstractModel {

    /**
    * <p>url of the reference video. It must be accessible from the external network.<br>It can be used as a feature reference video or a video for editing. By default, it is a video for editing. You can selectively retain the original sound of the video.<br>The ReferType parameter specifies the reference video type: feature indicates feature reference video, and base indicates video for editing.<br>When the reference video is a video for editing, you cannot define the first and last frame of the video.</p>
    */
    @SerializedName("VideoUrl")
    @Expose
    private String VideoUrl;

    /**
    * <p>The ReferType parameter specifies the reference video type: feature indicates feature reference video, and base indicates video for editing.</p>
    */
    @SerializedName("ReferType")
    @Expose
    private String ReferType;

    /**
    * <p>The KeepOriginalSound parameter specifies whether to keep the original sound of the video. Valid values: yes (keep the original sound); no (remove the original sound). This parameter also applies to feature reference videos (feature).</p>
    */
    @SerializedName("KeepOriginalSound")
    @Expose
    private String KeepOriginalSound;

    /**
     * Get <p>url of the reference video. It must be accessible from the external network.<br>It can be used as a feature reference video or a video for editing. By default, it is a video for editing. You can selectively retain the original sound of the video.<br>The ReferType parameter specifies the reference video type: feature indicates feature reference video, and base indicates video for editing.<br>When the reference video is a video for editing, you cannot define the first and last frame of the video.</p> 
     * @return VideoUrl <p>url of the reference video. It must be accessible from the external network.<br>It can be used as a feature reference video or a video for editing. By default, it is a video for editing. You can selectively retain the original sound of the video.<br>The ReferType parameter specifies the reference video type: feature indicates feature reference video, and base indicates video for editing.<br>When the reference video is a video for editing, you cannot define the first and last frame of the video.</p>
     */
    public String getVideoUrl() {
        return this.VideoUrl;
    }

    /**
     * Set <p>url of the reference video. It must be accessible from the external network.<br>It can be used as a feature reference video or a video for editing. By default, it is a video for editing. You can selectively retain the original sound of the video.<br>The ReferType parameter specifies the reference video type: feature indicates feature reference video, and base indicates video for editing.<br>When the reference video is a video for editing, you cannot define the first and last frame of the video.</p>
     * @param VideoUrl <p>url of the reference video. It must be accessible from the external network.<br>It can be used as a feature reference video or a video for editing. By default, it is a video for editing. You can selectively retain the original sound of the video.<br>The ReferType parameter specifies the reference video type: feature indicates feature reference video, and base indicates video for editing.<br>When the reference video is a video for editing, you cannot define the first and last frame of the video.</p>
     */
    public void setVideoUrl(String VideoUrl) {
        this.VideoUrl = VideoUrl;
    }

    /**
     * Get <p>The ReferType parameter specifies the reference video type: feature indicates feature reference video, and base indicates video for editing.</p> 
     * @return ReferType <p>The ReferType parameter specifies the reference video type: feature indicates feature reference video, and base indicates video for editing.</p>
     */
    public String getReferType() {
        return this.ReferType;
    }

    /**
     * Set <p>The ReferType parameter specifies the reference video type: feature indicates feature reference video, and base indicates video for editing.</p>
     * @param ReferType <p>The ReferType parameter specifies the reference video type: feature indicates feature reference video, and base indicates video for editing.</p>
     */
    public void setReferType(String ReferType) {
        this.ReferType = ReferType;
    }

    /**
     * Get <p>The KeepOriginalSound parameter specifies whether to keep the original sound of the video. Valid values: yes (keep the original sound); no (remove the original sound). This parameter also applies to feature reference videos (feature).</p> 
     * @return KeepOriginalSound <p>The KeepOriginalSound parameter specifies whether to keep the original sound of the video. Valid values: yes (keep the original sound); no (remove the original sound). This parameter also applies to feature reference videos (feature).</p>
     */
    public String getKeepOriginalSound() {
        return this.KeepOriginalSound;
    }

    /**
     * Set <p>The KeepOriginalSound parameter specifies whether to keep the original sound of the video. Valid values: yes (keep the original sound); no (remove the original sound). This parameter also applies to feature reference videos (feature).</p>
     * @param KeepOriginalSound <p>The KeepOriginalSound parameter specifies whether to keep the original sound of the video. Valid values: yes (keep the original sound); no (remove the original sound). This parameter also applies to feature reference videos (feature).</p>
     */
    public void setKeepOriginalSound(String KeepOriginalSound) {
        this.KeepOriginalSound = KeepOriginalSound;
    }

    public AigcVideoReferenceVideoInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AigcVideoReferenceVideoInfo(AigcVideoReferenceVideoInfo source) {
        if (source.VideoUrl != null) {
            this.VideoUrl = new String(source.VideoUrl);
        }
        if (source.ReferType != null) {
            this.ReferType = new String(source.ReferType);
        }
        if (source.KeepOriginalSound != null) {
            this.KeepOriginalSound = new String(source.KeepOriginalSound);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VideoUrl", this.VideoUrl);
        this.setParamSimple(map, prefix + "ReferType", this.ReferType);
        this.setParamSimple(map, prefix + "KeepOriginalSound", this.KeepOriginalSound);

    }
}

