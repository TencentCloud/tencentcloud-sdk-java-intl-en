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

public class MediaMiniProgramReviewInfoItem extends AbstractModel {

    /**
    * Template ID. The transcoding template ID corresponding to the video released by the mini program. 0 indicates the original video.
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * Video metadata.
    */
    @SerializedName("MetaData")
    @Expose
    private MediaMetaData MetaData;

    /**
    * Video playback address for Mini Program Audio and Video review.
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * Publishing status of the mini program video:
<li>Pass: Succeeded.</li>
<li>Rejected: failed.</li>
    */
    @SerializedName("ReviewResult")
    @Expose
    private String ReviewResult;

    /**
    * Mini Program Audio and Video moderation element.
    */
    @SerializedName("ReviewSummary")
    @Expose
    private MediaMiniProgramReviewElem [] ReviewSummary;

    /**
     * Get Template ID. The transcoding template ID corresponding to the video released by the mini program. 0 indicates the original video. 
     * @return Definition Template ID. The transcoding template ID corresponding to the video released by the mini program. 0 indicates the original video.
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set Template ID. The transcoding template ID corresponding to the video released by the mini program. 0 indicates the original video.
     * @param Definition Template ID. The transcoding template ID corresponding to the video released by the mini program. 0 indicates the original video.
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

    /**
     * Get Video metadata. 
     * @return MetaData Video metadata.
     */
    public MediaMetaData getMetaData() {
        return this.MetaData;
    }

    /**
     * Set Video metadata.
     * @param MetaData Video metadata.
     */
    public void setMetaData(MediaMetaData MetaData) {
        this.MetaData = MetaData;
    }

    /**
     * Get Video playback address for Mini Program Audio and Video review. 
     * @return Url Video playback address for Mini Program Audio and Video review.
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set Video playback address for Mini Program Audio and Video review.
     * @param Url Video playback address for Mini Program Audio and Video review.
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get Publishing status of the mini program video:
<li>Pass: Succeeded.</li>
<li>Rejected: failed.</li> 
     * @return ReviewResult Publishing status of the mini program video:
<li>Pass: Succeeded.</li>
<li>Rejected: failed.</li>
     */
    public String getReviewResult() {
        return this.ReviewResult;
    }

    /**
     * Set Publishing status of the mini program video:
<li>Pass: Succeeded.</li>
<li>Rejected: failed.</li>
     * @param ReviewResult Publishing status of the mini program video:
<li>Pass: Succeeded.</li>
<li>Rejected: failed.</li>
     */
    public void setReviewResult(String ReviewResult) {
        this.ReviewResult = ReviewResult;
    }

    /**
     * Get Mini Program Audio and Video moderation element. 
     * @return ReviewSummary Mini Program Audio and Video moderation element.
     */
    public MediaMiniProgramReviewElem [] getReviewSummary() {
        return this.ReviewSummary;
    }

    /**
     * Set Mini Program Audio and Video moderation element.
     * @param ReviewSummary Mini Program Audio and Video moderation element.
     */
    public void setReviewSummary(MediaMiniProgramReviewElem [] ReviewSummary) {
        this.ReviewSummary = ReviewSummary;
    }

    public MediaMiniProgramReviewInfoItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MediaMiniProgramReviewInfoItem(MediaMiniProgramReviewInfoItem source) {
        if (source.Definition != null) {
            this.Definition = new Long(source.Definition);
        }
        if (source.MetaData != null) {
            this.MetaData = new MediaMetaData(source.MetaData);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.ReviewResult != null) {
            this.ReviewResult = new String(source.ReviewResult);
        }
        if (source.ReviewSummary != null) {
            this.ReviewSummary = new MediaMiniProgramReviewElem[source.ReviewSummary.length];
            for (int i = 0; i < source.ReviewSummary.length; i++) {
                this.ReviewSummary[i] = new MediaMiniProgramReviewElem(source.ReviewSummary[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Definition", this.Definition);
        this.setParamObj(map, prefix + "MetaData.", this.MetaData);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "ReviewResult", this.ReviewResult);
        this.setParamArrayObj(map, prefix + "ReviewSummary.", this.ReviewSummary);

    }
}

