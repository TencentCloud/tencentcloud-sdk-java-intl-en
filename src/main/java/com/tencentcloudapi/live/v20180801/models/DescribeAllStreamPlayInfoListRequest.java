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

public class DescribeAllStreamPlayInfoListRequest extends AbstractModel{

    /**
    * Query time accurate down to the minute in the format of `yyyy-mm-dd HH:MM:SS`. Data for the last month can be queried. The data has a delay of about 5 minutes; therefore, if you want to query real-time data, we recommend you pass in a point in time 5 minutes ago.
    */
    @SerializedName("QueryTime")
    @Expose
    private String QueryTime;

    /**
     * Get Query time accurate down to the minute in the format of `yyyy-mm-dd HH:MM:SS`. Data for the last month can be queried. The data has a delay of about 5 minutes; therefore, if you want to query real-time data, we recommend you pass in a point in time 5 minutes ago. 
     * @return QueryTime Query time accurate down to the minute in the format of `yyyy-mm-dd HH:MM:SS`. Data for the last month can be queried. The data has a delay of about 5 minutes; therefore, if you want to query real-time data, we recommend you pass in a point in time 5 minutes ago.
     */
    public String getQueryTime() {
        return this.QueryTime;
    }

    /**
     * Set Query time accurate down to the minute in the format of `yyyy-mm-dd HH:MM:SS`. Data for the last month can be queried. The data has a delay of about 5 minutes; therefore, if you want to query real-time data, we recommend you pass in a point in time 5 minutes ago.
     * @param QueryTime Query time accurate down to the minute in the format of `yyyy-mm-dd HH:MM:SS`. Data for the last month can be queried. The data has a delay of about 5 minutes; therefore, if you want to query real-time data, we recommend you pass in a point in time 5 minutes ago.
     */
    public void setQueryTime(String QueryTime) {
        this.QueryTime = QueryTime;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "QueryTime", this.QueryTime);

    }
}

