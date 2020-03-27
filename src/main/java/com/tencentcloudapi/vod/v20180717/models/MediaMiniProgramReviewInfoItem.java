/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MediaMiniProgramReviewInfoItem extends AbstractModel{

    /**
    * Template ID, which is the ID of the transcoding template corresponding to the video published on WeChat Mini Program. 0 represents the source video.
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
    * Video playback address for WeChat Mini Program audit
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * Status of video release on WeChat Mini Program
<li>Pass: succeeded.</li>
<li>Rejected: rejected.</li>
    */
    @SerializedName("ReviewResult")
    @Expose
    private String ReviewResult;

    /**
    * WeChat Mini Program audit element.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ReviewSummary")
    @Expose
    private MediaMiniProgramReviewElem [] ReviewSummary;

    /**
     * Get Template ID, which is the ID of the transcoding template corresponding to the video published on WeChat Mini Program. 0 represents the source video. 
     * @return Definition Template ID, which is the ID of the transcoding template corresponding to the video published on WeChat Mini Program. 0 represents the source video.
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set Template ID, which is the ID of the transcoding template corresponding to the video published on WeChat Mini Program. 0 represents the source video.
     * @param Definition Template ID, which is the ID of the transcoding template corresponding to the video published on WeChat Mini Program. 0 represents the source video.
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
     * Get Video playback address for WeChat Mini Program audit
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Url Video playback address for WeChat Mini Program audit
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set Video playback address for WeChat Mini Program audit
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Url Video playback address for WeChat Mini Program audit
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get Status of video release on WeChat Mini Program
<li>Pass: succeeded.</li>
<li>Rejected: rejected.</li> 
     * @return ReviewResult Status of video release on WeChat Mini Program
<li>Pass: succeeded.</li>
<li>Rejected: rejected.</li>
     */
    public String getReviewResult() {
        return this.ReviewResult;
    }

    /**
     * Set Status of video release on WeChat Mini Program
<li>Pass: succeeded.</li>
<li>Rejected: rejected.</li>
     * @param ReviewResult Status of video release on WeChat Mini Program
<li>Pass: succeeded.</li>
<li>Rejected: rejected.</li>
     */
    public void setReviewResult(String ReviewResult) {
        this.ReviewResult = ReviewResult;
    }

    /**
     * Get WeChat Mini Program audit element.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ReviewSummary WeChat Mini Program audit element.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public MediaMiniProgramReviewElem [] getReviewSummary() {
        return this.ReviewSummary;
    }

    /**
     * Set WeChat Mini Program audit element.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ReviewSummary WeChat Mini Program audit element.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setReviewSummary(MediaMiniProgramReviewElem [] ReviewSummary) {
        this.ReviewSummary = ReviewSummary;
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

