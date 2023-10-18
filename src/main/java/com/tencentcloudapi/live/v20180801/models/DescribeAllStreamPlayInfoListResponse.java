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

public class DescribeAllStreamPlayInfoListResponse extends AbstractModel {

    /**
    * The time point queried, whose format is the same as that of the corresponding request parameter.
    */
    @SerializedName("QueryTime")
    @Expose
    private String QueryTime;

    /**
    * The playback data.
    */
    @SerializedName("DataInfoList")
    @Expose
    private MonitorStreamPlayInfo [] DataInfoList;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get The time point queried, whose format is the same as that of the corresponding request parameter. 
     * @return QueryTime The time point queried, whose format is the same as that of the corresponding request parameter.
     */
    public String getQueryTime() {
        return this.QueryTime;
    }

    /**
     * Set The time point queried, whose format is the same as that of the corresponding request parameter.
     * @param QueryTime The time point queried, whose format is the same as that of the corresponding request parameter.
     */
    public void setQueryTime(String QueryTime) {
        this.QueryTime = QueryTime;
    }

    /**
     * Get The playback data. 
     * @return DataInfoList The playback data.
     */
    public MonitorStreamPlayInfo [] getDataInfoList() {
        return this.DataInfoList;
    }

    /**
     * Set The playback data.
     * @param DataInfoList The playback data.
     */
    public void setDataInfoList(MonitorStreamPlayInfo [] DataInfoList) {
        this.DataInfoList = DataInfoList;
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

    public DescribeAllStreamPlayInfoListResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAllStreamPlayInfoListResponse(DescribeAllStreamPlayInfoListResponse source) {
        if (source.QueryTime != null) {
            this.QueryTime = new String(source.QueryTime);
        }
        if (source.DataInfoList != null) {
            this.DataInfoList = new MonitorStreamPlayInfo[source.DataInfoList.length];
            for (int i = 0; i < source.DataInfoList.length; i++) {
                this.DataInfoList[i] = new MonitorStreamPlayInfo(source.DataInfoList[i]);
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
        this.setParamSimple(map, prefix + "QueryTime", this.QueryTime);
        this.setParamArrayObj(map, prefix + "DataInfoList.", this.DataInfoList);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

