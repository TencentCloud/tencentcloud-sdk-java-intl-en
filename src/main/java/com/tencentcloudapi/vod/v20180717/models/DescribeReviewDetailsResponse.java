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

public class DescribeReviewDetailsResponse extends AbstractModel{

    /**
    * Times of initiating intelligent content recognition tasks.
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * Duration of intelligent recognition content.
    */
    @SerializedName("TotalDuration")
    @Expose
    private Long TotalDuration;

    /**
    * Data of intelligent recognition content duration. One piece of data is collected every day.
    */
    @SerializedName("Data")
    @Expose
    private StatDataItem [] Data;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Times of initiating intelligent content recognition tasks. 
     * @return TotalCount Times of initiating intelligent content recognition tasks.
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set Times of initiating intelligent content recognition tasks.
     * @param TotalCount Times of initiating intelligent content recognition tasks.
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get Duration of intelligent recognition content. 
     * @return TotalDuration Duration of intelligent recognition content.
     */
    public Long getTotalDuration() {
        return this.TotalDuration;
    }

    /**
     * Set Duration of intelligent recognition content.
     * @param TotalDuration Duration of intelligent recognition content.
     */
    public void setTotalDuration(Long TotalDuration) {
        this.TotalDuration = TotalDuration;
    }

    /**
     * Get Data of intelligent recognition content duration. One piece of data is collected every day. 
     * @return Data Data of intelligent recognition content duration. One piece of data is collected every day.
     */
    public StatDataItem [] getData() {
        return this.Data;
    }

    /**
     * Set Data of intelligent recognition content duration. One piece of data is collected every day.
     * @param Data Data of intelligent recognition content duration. One piece of data is collected every day.
     */
    public void setData(StatDataItem [] Data) {
        this.Data = Data;
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
        this.setParamSimple(map, prefix + "TotalDuration", this.TotalDuration);
        this.setParamArrayObj(map, prefix + "Data.", this.Data);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

