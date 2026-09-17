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
    * 
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * 
    */
    @SerializedName("MetaData")
    @Expose
    private MediaMetaData MetaData;

    /**
    * 
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * 
    */
    @SerializedName("ReviewResult")
    @Expose
    private String ReviewResult;

    /**
    * 
    */
    @SerializedName("ReviewSummary")
    @Expose
    private MediaMiniProgramReviewElem [] ReviewSummary;

    /**
     * Get  
     * @return Definition 
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set 
     * @param Definition 
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

    /**
     * Get  
     * @return MetaData 
     */
    public MediaMetaData getMetaData() {
        return this.MetaData;
    }

    /**
     * Set 
     * @param MetaData 
     */
    public void setMetaData(MediaMetaData MetaData) {
        this.MetaData = MetaData;
    }

    /**
     * Get  
     * @return Url 
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set 
     * @param Url 
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get  
     * @return ReviewResult 
     */
    public String getReviewResult() {
        return this.ReviewResult;
    }

    /**
     * Set 
     * @param ReviewResult 
     */
    public void setReviewResult(String ReviewResult) {
        this.ReviewResult = ReviewResult;
    }

    /**
     * Get  
     * @return ReviewSummary 
     */
    public MediaMiniProgramReviewElem [] getReviewSummary() {
        return this.ReviewSummary;
    }

    /**
     * Set 
     * @param ReviewSummary 
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

