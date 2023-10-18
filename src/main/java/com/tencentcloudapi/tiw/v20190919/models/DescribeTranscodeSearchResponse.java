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
package com.tencentcloudapi.tiw.v20190919.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTranscodeSearchResponse extends AbstractModel {

    /**
    * The set of queried transcoding tasks.
    */
    @SerializedName("TranscodeTaskSet")
    @Expose
    private TranscodeTaskSearchResult [] TranscodeTaskSet;

    /**
    * Number of transcoding tasks.
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get The set of queried transcoding tasks. 
     * @return TranscodeTaskSet The set of queried transcoding tasks.
     */
    public TranscodeTaskSearchResult [] getTranscodeTaskSet() {
        return this.TranscodeTaskSet;
    }

    /**
     * Set The set of queried transcoding tasks.
     * @param TranscodeTaskSet The set of queried transcoding tasks.
     */
    public void setTranscodeTaskSet(TranscodeTaskSearchResult [] TranscodeTaskSet) {
        this.TranscodeTaskSet = TranscodeTaskSet;
    }

    /**
     * Get Number of transcoding tasks. 
     * @return TotalCount Number of transcoding tasks.
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set Number of transcoding tasks.
     * @param TotalCount Number of transcoding tasks.
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
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

    public DescribeTranscodeSearchResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTranscodeSearchResponse(DescribeTranscodeSearchResponse source) {
        if (source.TranscodeTaskSet != null) {
            this.TranscodeTaskSet = new TranscodeTaskSearchResult[source.TranscodeTaskSet.length];
            for (int i = 0; i < source.TranscodeTaskSet.length; i++) {
                this.TranscodeTaskSet[i] = new TranscodeTaskSearchResult(source.TranscodeTaskSet[i]);
            }
        }
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "TranscodeTaskSet.", this.TranscodeTaskSet);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

