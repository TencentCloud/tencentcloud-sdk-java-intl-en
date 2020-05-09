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
package com.tencentcloudapi.cmq.v20190304.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTopicDetailResponse extends AbstractModel{

    /**
    * TotalCount
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * TopicSet
    */
    @SerializedName("TopicSet")
    @Expose
    private TopicSet [] TopicSet;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get TotalCount 
     * @return TotalCount TotalCount
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set TotalCount
     * @param TotalCount TotalCount
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get TopicSet 
     * @return TopicSet TopicSet
     */
    public TopicSet [] getTopicSet() {
        return this.TopicSet;
    }

    /**
     * Set TopicSet
     * @param TopicSet TopicSet
     */
    public void setTopicSet(TopicSet [] TopicSet) {
        this.TopicSet = TopicSet;
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

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "TopicSet.", this.TopicSet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

