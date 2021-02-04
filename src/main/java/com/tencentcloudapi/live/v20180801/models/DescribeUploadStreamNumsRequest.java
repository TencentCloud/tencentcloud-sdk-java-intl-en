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

public class DescribeUploadStreamNumsRequest extends AbstractModel{

    /**
    * Start time point in the format of yyyy-mm-dd HH:MM:SS.
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * End time point in the format of yyyy-mm-dd HH:MM:SS. The difference between the start time and end time cannot be greater than 31 days. Data in the last 31 days can be queried.
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * LVB domain names. If this parameter is left empty, data of all domain names will be queried.
    */
    @SerializedName("Domains")
    @Expose
    private String [] Domains;

    /**
    * Time granularity of the data. Valid values:
5: 5-minute granularity (the query period is up to 1 day)
1440: 1-day granularity (the query period is up to 1 month)
Default value: 5
    */
    @SerializedName("Granularity")
    @Expose
    private Long Granularity;

    /**
     * Get Start time point in the format of yyyy-mm-dd HH:MM:SS. 
     * @return StartTime Start time point in the format of yyyy-mm-dd HH:MM:SS.
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Start time point in the format of yyyy-mm-dd HH:MM:SS.
     * @param StartTime Start time point in the format of yyyy-mm-dd HH:MM:SS.
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get End time point in the format of yyyy-mm-dd HH:MM:SS. The difference between the start time and end time cannot be greater than 31 days. Data in the last 31 days can be queried. 
     * @return EndTime End time point in the format of yyyy-mm-dd HH:MM:SS. The difference between the start time and end time cannot be greater than 31 days. Data in the last 31 days can be queried.
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End time point in the format of yyyy-mm-dd HH:MM:SS. The difference between the start time and end time cannot be greater than 31 days. Data in the last 31 days can be queried.
     * @param EndTime End time point in the format of yyyy-mm-dd HH:MM:SS. The difference between the start time and end time cannot be greater than 31 days. Data in the last 31 days can be queried.
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get LVB domain names. If this parameter is left empty, data of all domain names will be queried. 
     * @return Domains LVB domain names. If this parameter is left empty, data of all domain names will be queried.
     */
    public String [] getDomains() {
        return this.Domains;
    }

    /**
     * Set LVB domain names. If this parameter is left empty, data of all domain names will be queried.
     * @param Domains LVB domain names. If this parameter is left empty, data of all domain names will be queried.
     */
    public void setDomains(String [] Domains) {
        this.Domains = Domains;
    }

    /**
     * Get Time granularity of the data. Valid values:
5: 5-minute granularity (the query period is up to 1 day)
1440: 1-day granularity (the query period is up to 1 month)
Default value: 5 
     * @return Granularity Time granularity of the data. Valid values:
5: 5-minute granularity (the query period is up to 1 day)
1440: 1-day granularity (the query period is up to 1 month)
Default value: 5
     */
    public Long getGranularity() {
        return this.Granularity;
    }

    /**
     * Set Time granularity of the data. Valid values:
5: 5-minute granularity (the query period is up to 1 day)
1440: 1-day granularity (the query period is up to 1 month)
Default value: 5
     * @param Granularity Time granularity of the data. Valid values:
5: 5-minute granularity (the query period is up to 1 day)
1440: 1-day granularity (the query period is up to 1 month)
Default value: 5
     */
    public void setGranularity(Long Granularity) {
        this.Granularity = Granularity;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamArraySimple(map, prefix + "Domains.", this.Domains);
        this.setParamSimple(map, prefix + "Granularity", this.Granularity);

    }
}

