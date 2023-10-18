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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ReviewImageResponse extends AbstractModel {

    /**
    * The image moderation result. <font color=red>Note: This parameter is no longer used. Please use `MediaReviewResult` instead.</font>
    */
    @SerializedName("ReviewResultSet")
    @Expose
    private ContentReviewResult [] ReviewResultSet;

    /**
    * The image moderation result.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MediaReviewResult")
    @Expose
    private ReviewImageResult MediaReviewResult;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get The image moderation result. <font color=red>Note: This parameter is no longer used. Please use `MediaReviewResult` instead.</font> 
     * @return ReviewResultSet The image moderation result. <font color=red>Note: This parameter is no longer used. Please use `MediaReviewResult` instead.</font>
     */
    public ContentReviewResult [] getReviewResultSet() {
        return this.ReviewResultSet;
    }

    /**
     * Set The image moderation result. <font color=red>Note: This parameter is no longer used. Please use `MediaReviewResult` instead.</font>
     * @param ReviewResultSet The image moderation result. <font color=red>Note: This parameter is no longer used. Please use `MediaReviewResult` instead.</font>
     */
    public void setReviewResultSet(ContentReviewResult [] ReviewResultSet) {
        this.ReviewResultSet = ReviewResultSet;
    }

    /**
     * Get The image moderation result.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return MediaReviewResult The image moderation result.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public ReviewImageResult getMediaReviewResult() {
        return this.MediaReviewResult;
    }

    /**
     * Set The image moderation result.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param MediaReviewResult The image moderation result.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMediaReviewResult(ReviewImageResult MediaReviewResult) {
        this.MediaReviewResult = MediaReviewResult;
    }

    /**
     * Get The unique request ID, which is returned for each request. RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     * @param RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public ReviewImageResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ReviewImageResponse(ReviewImageResponse source) {
        if (source.ReviewResultSet != null) {
            this.ReviewResultSet = new ContentReviewResult[source.ReviewResultSet.length];
            for (int i = 0; i < source.ReviewResultSet.length; i++) {
                this.ReviewResultSet[i] = new ContentReviewResult(source.ReviewResultSet[i]);
            }
        }
        if (source.MediaReviewResult != null) {
            this.MediaReviewResult = new ReviewImageResult(source.MediaReviewResult);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "ReviewResultSet.", this.ReviewResultSet);
        this.setParamObj(map, prefix + "MediaReviewResult.", this.MediaReviewResult);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

