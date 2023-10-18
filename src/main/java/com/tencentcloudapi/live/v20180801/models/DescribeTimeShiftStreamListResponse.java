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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTimeShiftStreamListResponse extends AbstractModel {

    /**
    * The total number of records in the specified time period.
    */
    @SerializedName("TotalSize")
    @Expose
    private Long TotalSize;

    /**
    * The information of the streams.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("StreamList")
    @Expose
    private TimeShiftStreamInfo [] StreamList;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get The total number of records in the specified time period. 
     * @return TotalSize The total number of records in the specified time period.
     */
    public Long getTotalSize() {
        return this.TotalSize;
    }

    /**
     * Set The total number of records in the specified time period.
     * @param TotalSize The total number of records in the specified time period.
     */
    public void setTotalSize(Long TotalSize) {
        this.TotalSize = TotalSize;
    }

    /**
     * Get The information of the streams.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return StreamList The information of the streams.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public TimeShiftStreamInfo [] getStreamList() {
        return this.StreamList;
    }

    /**
     * Set The information of the streams.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param StreamList The information of the streams.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStreamList(TimeShiftStreamInfo [] StreamList) {
        this.StreamList = StreamList;
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

    public DescribeTimeShiftStreamListResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTimeShiftStreamListResponse(DescribeTimeShiftStreamListResponse source) {
        if (source.TotalSize != null) {
            this.TotalSize = new Long(source.TotalSize);
        }
        if (source.StreamList != null) {
            this.StreamList = new TimeShiftStreamInfo[source.StreamList.length];
            for (int i = 0; i < source.StreamList.length; i++) {
                this.StreamList[i] = new TimeShiftStreamInfo(source.StreamList[i]);
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
        this.setParamSimple(map, prefix + "TotalSize", this.TotalSize);
        this.setParamArrayObj(map, prefix + "StreamList.", this.StreamList);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

