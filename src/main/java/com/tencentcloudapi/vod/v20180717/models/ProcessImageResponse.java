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

public class ProcessImageResponse extends AbstractModel{

    /**
    * The image recognition result.
    */
    @SerializedName("ContentReviewResultSet")
    @Expose
    private ContentReviewResult [] ContentReviewResultSet;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get The image recognition result. 
     * @return ContentReviewResultSet The image recognition result.
     */
    public ContentReviewResult [] getContentReviewResultSet() {
        return this.ContentReviewResultSet;
    }

    /**
     * Set The image recognition result.
     * @param ContentReviewResultSet The image recognition result.
     */
    public void setContentReviewResultSet(ContentReviewResult [] ContentReviewResultSet) {
        this.ContentReviewResultSet = ContentReviewResultSet;
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

    public ProcessImageResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ProcessImageResponse(ProcessImageResponse source) {
        if (source.ContentReviewResultSet != null) {
            this.ContentReviewResultSet = new ContentReviewResult[source.ContentReviewResultSet.length];
            for (int i = 0; i < source.ContentReviewResultSet.length; i++) {
                this.ContentReviewResultSet[i] = new ContentReviewResult(source.ContentReviewResultSet[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "ContentReviewResultSet.", this.ContentReviewResultSet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}
