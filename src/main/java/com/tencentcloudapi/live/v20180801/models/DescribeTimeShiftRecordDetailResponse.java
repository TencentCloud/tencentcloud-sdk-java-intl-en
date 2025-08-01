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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTimeShiftRecordDetailResponse extends AbstractModel {

    /**
    * The number of sessions recorded.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RecordList")
    @Expose
    private TimeShiftRecord [] RecordList;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get The number of sessions recorded.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RecordList The number of sessions recorded.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public TimeShiftRecord [] getRecordList() {
        return this.RecordList;
    }

    /**
     * Set The number of sessions recorded.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RecordList The number of sessions recorded.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRecordList(TimeShiftRecord [] RecordList) {
        this.RecordList = RecordList;
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

    public DescribeTimeShiftRecordDetailResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTimeShiftRecordDetailResponse(DescribeTimeShiftRecordDetailResponse source) {
        if (source.RecordList != null) {
            this.RecordList = new TimeShiftRecord[source.RecordList.length];
            for (int i = 0; i < source.RecordList.length; i++) {
                this.RecordList[i] = new TimeShiftRecord(source.RecordList[i]);
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
        this.setParamArrayObj(map, prefix + "RecordList.", this.RecordList);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

