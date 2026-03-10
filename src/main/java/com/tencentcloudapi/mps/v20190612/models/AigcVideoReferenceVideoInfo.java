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
    * Reference video URL, which must be accessible from the public network.
This can be used as a feature reference video or a video for editing. The default type is video for editing. You can choose to keep the original sound of the video.
The ReferType parameter specifies the reference video type: feature indicates feature reference video, and base indicates video for editing.
If the reference video is a video for editing, the first and last frames cannot be defined.
    */
    @SerializedName("VideoUrl")
    @Expose
    private String VideoUrl;

    /**
    * The ReferType parameter specifies the reference video type: feature indicates feature reference video, and base indicates video for editing.
    */
    @SerializedName("ReferType")
    @Expose
    private String ReferType;

    /**
    * The KeepOriginalSound parameter specifies whether to keep the original sound of the video. Valid values: yes (keep the original sound); no (remove the original sound). This parameter also applies to feature reference videos (feature).
    */
    @SerializedName("KeepOriginalSound")
    @Expose
    private String KeepOriginalSound;

    /**
     * Get Reference video URL, which must be accessible from the public network.
This can be used as a feature reference video or a video for editing. The default type is video for editing. You can choose to keep the original sound of the video.
The ReferType parameter specifies the reference video type: feature indicates feature reference video, and base indicates video for editing.
If the reference video is a video for editing, the first and last frames cannot be defined. 
     * @return VideoUrl Reference video URL, which must be accessible from the public network.
This can be used as a feature reference video or a video for editing. The default type is video for editing. You can choose to keep the original sound of the video.
The ReferType parameter specifies the reference video type: feature indicates feature reference video, and base indicates video for editing.
If the reference video is a video for editing, the first and last frames cannot be defined.
     */
    public String getVideoUrl() {
        return this.VideoUrl;
    }

    /**
     * Set Reference video URL, which must be accessible from the public network.
This can be used as a feature reference video or a video for editing. The default type is video for editing. You can choose to keep the original sound of the video.
The ReferType parameter specifies the reference video type: feature indicates feature reference video, and base indicates video for editing.
If the reference video is a video for editing, the first and last frames cannot be defined.
     * @param VideoUrl Reference video URL, which must be accessible from the public network.
This can be used as a feature reference video or a video for editing. The default type is video for editing. You can choose to keep the original sound of the video.
The ReferType parameter specifies the reference video type: feature indicates feature reference video, and base indicates video for editing.
If the reference video is a video for editing, the first and last frames cannot be defined.
     */
    public void setVideoUrl(String VideoUrl) {
        this.VideoUrl = VideoUrl;
    }

    /**
     * Get The ReferType parameter specifies the reference video type: feature indicates feature reference video, and base indicates video for editing. 
     * @return ReferType The ReferType parameter specifies the reference video type: feature indicates feature reference video, and base indicates video for editing.
     */
    public String getReferType() {
        return this.ReferType;
    }

    /**
     * Set The ReferType parameter specifies the reference video type: feature indicates feature reference video, and base indicates video for editing.
     * @param ReferType The ReferType parameter specifies the reference video type: feature indicates feature reference video, and base indicates video for editing.
     */
    public void setReferType(String ReferType) {
        this.ReferType = ReferType;
    }

    /**
     * Get The KeepOriginalSound parameter specifies whether to keep the original sound of the video. Valid values: yes (keep the original sound); no (remove the original sound). This parameter also applies to feature reference videos (feature). 
     * @return KeepOriginalSound The KeepOriginalSound parameter specifies whether to keep the original sound of the video. Valid values: yes (keep the original sound); no (remove the original sound). This parameter also applies to feature reference videos (feature).
     */
    public String getKeepOriginalSound() {
        return this.KeepOriginalSound;
    }

    /**
     * Set The KeepOriginalSound parameter specifies whether to keep the original sound of the video. Valid values: yes (keep the original sound); no (remove the original sound). This parameter also applies to feature reference videos (feature).
     * @param KeepOriginalSound The KeepOriginalSound parameter specifies whether to keep the original sound of the video. Valid values: yes (keep the original sound); no (remove the original sound). This parameter also applies to feature reference videos (feature).
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

