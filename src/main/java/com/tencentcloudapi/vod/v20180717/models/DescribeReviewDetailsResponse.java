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
    * Number of initiated content audits.
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * Total content audit duration.
    */
    @SerializedName("TotalDuration")
    @Expose
    private Long TotalDuration;

    /**
    * Data of content audit duration, which is collected once per day.
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
     * Get Number of initiated content audits. 
     * @return TotalCount Number of initiated content audits.
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set Number of initiated content audits.
     * @param TotalCount Number of initiated content audits.
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get Total content audit duration. 
     * @return TotalDuration Total content audit duration.
     */
    public Long getTotalDuration() {
        return this.TotalDuration;
    }

    /**
     * Set Total content audit duration.
     * @param TotalDuration Total content audit duration.
     */
    public void setTotalDuration(Long TotalDuration) {
        this.TotalDuration = TotalDuration;
    }

    /**
     * Get Data of content audit duration, which is collected once per day. 
     * @return Data Data of content audit duration, which is collected once per day.
     */
    public StatDataItem [] getData() {
        return this.Data;
    }

    /**
     * Set Data of content audit duration, which is collected once per day.
     * @param Data Data of content audit duration, which is collected once per day.
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

