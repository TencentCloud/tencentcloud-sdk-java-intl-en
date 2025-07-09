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
    * Audio/Video moderation details\*.

\* This parameter only contains the information of moderation tasks initiated by the [ReviewAudioVideo](https://intl.cloud.tencent.com/document/api/266/80283?from_cn_redirect=1) or [ReviewImage](https://intl.cloud.tencent.com/document/api/266/73217?from_cn_redirect=1) API.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MediaReviewInfo")
    @Expose
    private ReviewInfo MediaReviewInfo;

    /**
    * Thumbnail moderation details\*.

\* This parameter only contains the information of moderation tasks initiated by the [ReviewAudioVideo](https://intl.cloud.tencent.com/document/api/266/80283?from_cn_redirect=1) or [ReviewImage](https://intl.cloud.tencent.com/document/api/266/73217?from_cn_redirect=1) API.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CoverReviewInfo")
    @Expose
    private ReviewInfo CoverReviewInfo;

    /**
     * Get Audio/Video moderation details\*.

\* This parameter only contains the information of moderation tasks initiated by the [ReviewAudioVideo](https://intl.cloud.tencent.com/document/api/266/80283?from_cn_redirect=1) or [ReviewImage](https://intl.cloud.tencent.com/document/api/266/73217?from_cn_redirect=1) API.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return MediaReviewInfo Audio/Video moderation details\*.

\* This parameter only contains the information of moderation tasks initiated by the [ReviewAudioVideo](https://intl.cloud.tencent.com/document/api/266/80283?from_cn_redirect=1) or [ReviewImage](https://intl.cloud.tencent.com/document/api/266/73217?from_cn_redirect=1) API.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public ReviewInfo getMediaReviewInfo() {
        return this.MediaReviewInfo;
    }

    /**
     * Set Audio/Video moderation details\*.

\* This parameter only contains the information of moderation tasks initiated by the [ReviewAudioVideo](https://intl.cloud.tencent.com/document/api/266/80283?from_cn_redirect=1) or [ReviewImage](https://intl.cloud.tencent.com/document/api/266/73217?from_cn_redirect=1) API.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param MediaReviewInfo Audio/Video moderation details\*.

\* This parameter only contains the information of moderation tasks initiated by the [ReviewAudioVideo](https://intl.cloud.tencent.com/document/api/266/80283?from_cn_redirect=1) or [ReviewImage](https://intl.cloud.tencent.com/document/api/266/73217?from_cn_redirect=1) API.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMediaReviewInfo(ReviewInfo MediaReviewInfo) {
        this.MediaReviewInfo = MediaReviewInfo;
    }

    /**
     * Get Thumbnail moderation details\*.

\* This parameter only contains the information of moderation tasks initiated by the [ReviewAudioVideo](https://intl.cloud.tencent.com/document/api/266/80283?from_cn_redirect=1) or [ReviewImage](https://intl.cloud.tencent.com/document/api/266/73217?from_cn_redirect=1) API.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CoverReviewInfo Thumbnail moderation details\*.

\* This parameter only contains the information of moderation tasks initiated by the [ReviewAudioVideo](https://intl.cloud.tencent.com/document/api/266/80283?from_cn_redirect=1) or [ReviewImage](https://intl.cloud.tencent.com/document/api/266/73217?from_cn_redirect=1) API.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public ReviewInfo getCoverReviewInfo() {
        return this.CoverReviewInfo;
    }

    /**
     * Set Thumbnail moderation details\*.

\* This parameter only contains the information of moderation tasks initiated by the [ReviewAudioVideo](https://intl.cloud.tencent.com/document/api/266/80283?from_cn_redirect=1) or [ReviewImage](https://intl.cloud.tencent.com/document/api/266/73217?from_cn_redirect=1) API.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CoverReviewInfo Thumbnail moderation details\*.

\* This parameter only contains the information of moderation tasks initiated by the [ReviewAudioVideo](https://intl.cloud.tencent.com/document/api/266/80283?from_cn_redirect=1) or [ReviewImage](https://intl.cloud.tencent.com/document/api/266/73217?from_cn_redirect=1) API.
Note: This field may return null, indicating that no valid values can be obtained.
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

