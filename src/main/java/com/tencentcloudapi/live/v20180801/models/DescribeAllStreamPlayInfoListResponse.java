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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAllStreamPlayInfoListResponse extends AbstractModel{

    /**
    * Query point in time in the returned input parameters.
    */
    @SerializedName("QueryTime")
    @Expose
    private String QueryTime;

    /**
    * Data information list.
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
     * Get Query point in time in the returned input parameters. 
     * @return QueryTime Query point in time in the returned input parameters.
     */
    public String getQueryTime() {
        return this.QueryTime;
    }

    /**
     * Set Query point in time in the returned input parameters.
     * @param QueryTime Query point in time in the returned input parameters.
     */
    public void setQueryTime(String QueryTime) {
        this.QueryTime = QueryTime;
    }

    /**
     * Get Data information list. 
     * @return DataInfoList Data information list.
     */
    public MonitorStreamPlayInfo [] getDataInfoList() {
        return this.DataInfoList;
    }

    /**
     * Set Data information list.
     * @param DataInfoList Data information list.
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

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "QueryTime", this.QueryTime);
        this.setParamArrayObj(map, prefix + "DataInfoList.", this.DataInfoList);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

