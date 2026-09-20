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

public class FileReviewInfo extends AbstractModel {

    /**
    * Media review information\*.

\* Only show the review result info initiated by [Audio/Video Moderation (ReviewAudioVideo)](https://www.tencentcloud.com/document/api/266/80283?from_cn_redirect=1) or [Image Moderation (ReviewImage)](https://www.tencentcloud.com/document/api/266/73217?from_cn_redirect=1).
    */
    @SerializedName("MediaReviewInfo")
    @Expose
    private ReviewInfo MediaReviewInfo;

    /**
    * Media cover review info\*.

\* Only show the review result info initiated by [Audio/Video Moderation (ReviewAudioVideo)](https://www.tencentcloud.com/document/api/266/80283?from_cn_redirect=1) or [Image Moderation (ReviewImage)](https://www.tencentcloud.com/document/api/266/73217?from_cn_redirect=1).
    */
    @SerializedName("CoverReviewInfo")
    @Expose
    private ReviewInfo CoverReviewInfo;

    /**
     * Get Media review information\*.

\* Only show the review result info initiated by [Audio/Video Moderation (ReviewAudioVideo)](https://www.tencentcloud.com/document/api/266/80283?from_cn_redirect=1) or [Image Moderation (ReviewImage)](https://www.tencentcloud.com/document/api/266/73217?from_cn_redirect=1). 
     * @return MediaReviewInfo Media review information\*.

\* Only show the review result info initiated by [Audio/Video Moderation (ReviewAudioVideo)](https://www.tencentcloud.com/document/api/266/80283?from_cn_redirect=1) or [Image Moderation (ReviewImage)](https://www.tencentcloud.com/document/api/266/73217?from_cn_redirect=1).
     */
    public ReviewInfo getMediaReviewInfo() {
        return this.MediaReviewInfo;
    }

    /**
     * Set Media review information\*.

\* Only show the review result info initiated by [Audio/Video Moderation (ReviewAudioVideo)](https://www.tencentcloud.com/document/api/266/80283?from_cn_redirect=1) or [Image Moderation (ReviewImage)](https://www.tencentcloud.com/document/api/266/73217?from_cn_redirect=1).
     * @param MediaReviewInfo Media review information\*.

\* Only show the review result info initiated by [Audio/Video Moderation (ReviewAudioVideo)](https://www.tencentcloud.com/document/api/266/80283?from_cn_redirect=1) or [Image Moderation (ReviewImage)](https://www.tencentcloud.com/document/api/266/73217?from_cn_redirect=1).
     */
    public void setMediaReviewInfo(ReviewInfo MediaReviewInfo) {
        this.MediaReviewInfo = MediaReviewInfo;
    }

    /**
     * Get Media cover review info\*.

\* Only show the review result info initiated by [Audio/Video Moderation (ReviewAudioVideo)](https://www.tencentcloud.com/document/api/266/80283?from_cn_redirect=1) or [Image Moderation (ReviewImage)](https://www.tencentcloud.com/document/api/266/73217?from_cn_redirect=1). 
     * @return CoverReviewInfo Media cover review info\*.

\* Only show the review result info initiated by [Audio/Video Moderation (ReviewAudioVideo)](https://www.tencentcloud.com/document/api/266/80283?from_cn_redirect=1) or [Image Moderation (ReviewImage)](https://www.tencentcloud.com/document/api/266/73217?from_cn_redirect=1).
     */
    public ReviewInfo getCoverReviewInfo() {
        return this.CoverReviewInfo;
    }

    /**
     * Set Media cover review info\*.

\* Only show the review result info initiated by [Audio/Video Moderation (ReviewAudioVideo)](https://www.tencentcloud.com/document/api/266/80283?from_cn_redirect=1) or [Image Moderation (ReviewImage)](https://www.tencentcloud.com/document/api/266/73217?from_cn_redirect=1).
     * @param CoverReviewInfo Media cover review info\*.

\* Only show the review result info initiated by [Audio/Video Moderation (ReviewAudioVideo)](https://www.tencentcloud.com/document/api/266/80283?from_cn_redirect=1) or [Image Moderation (ReviewImage)](https://www.tencentcloud.com/document/api/266/73217?from_cn_redirect=1).
     */
    public void setCoverReviewInfo(ReviewInfo CoverReviewInfo) {
        this.CoverReviewInfo = CoverReviewInfo;
    }

    public FileReviewInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FileReviewInfo(FileReviewInfo source) {
        if (source.MediaReviewInfo != null) {
            this.MediaReviewInfo = new ReviewInfo(source.MediaReviewInfo);
        }
        if (source.CoverReviewInfo != null) {
            this.CoverReviewInfo = new ReviewInfo(source.CoverReviewInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "MediaReviewInfo.", this.MediaReviewInfo);
        this.setParamObj(map, prefix + "CoverReviewInfo.", this.CoverReviewInfo);

    }
}

