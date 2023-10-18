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
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeIpVisitRequest extends AbstractModel {

    /**
    * Query start time, such as 2018-09-04 10:40:10; the returned result is later than or equal to the specified time.
According to the specified time granularity, forward rounding is applied; for example, if the query start time is 2018-09-04 10:40:10 and the query time granularity is 5 minutes, the time for the first returned entry will be 2018-09-04 10:40:00.
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * Query end time, such as 2018-09-04 10:40:10; the returned result is earlier than or equal to the specified time.
According to the specified time granularity, forward rounding is applied; for example, if the query start time is 2018-09-04 10:40:10 and the query time granularity is 5 minutes, the time for the last returned entry will be 2018-09-04 10:40:00.
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Specifies the list of domain names to be queried; up to 30 domain names can be queried at a time.
    */
    @SerializedName("Domains")
    @Expose
    private String [] Domains;

    /**
    * Specifies the project ID to be queried, which can be viewed [here](https://console.cloud.tencent.com/project)
Please note that if domain names are specified, this parameter will be ignored.
    */
    @SerializedName("Project")
    @Expose
    private Long Project;

    /**
    * Sampling interval in minutes. The available options vary for different query period. See below: 
5min: 5 minutes. If the query period is within 24 hours, `5min` will be used by default.
day: 1 day. If the query period is longer than 24 hours, `day` will be used by default.
    */
    @SerializedName("Interval")
    @Expose
    private String Interval;

    /**
     * Get Query start time, such as 2018-09-04 10:40:10; the returned result is later than or equal to the specified time.
According to the specified time granularity, forward rounding is applied; for example, if the query start time is 2018-09-04 10:40:10 and the query time granularity is 5 minutes, the time for the first returned entry will be 2018-09-04 10:40:00. 
     * @return StartTime Query start time, such as 2018-09-04 10:40:10; the returned result is later than or equal to the specified time.
According to the specified time granularity, forward rounding is applied; for example, if the query start time is 2018-09-04 10:40:10 and the query time granularity is 5 minutes, the time for the first returned entry will be 2018-09-04 10:40:00.
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Query start time, such as 2018-09-04 10:40:10; the returned result is later than or equal to the specified time.
According to the specified time granularity, forward rounding is applied; for example, if the query start time is 2018-09-04 10:40:10 and the query time granularity is 5 minutes, the time for the first returned entry will be 2018-09-04 10:40:00.
     * @param StartTime Query start time, such as 2018-09-04 10:40:10; the returned result is later than or equal to the specified time.
According to the specified time granularity, forward rounding is applied; for example, if the query start time is 2018-09-04 10:40:10 and the query time granularity is 5 minutes, the time for the first returned entry will be 2018-09-04 10:40:00.
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get Query end time, such as 2018-09-04 10:40:10; the returned result is earlier than or equal to the specified time.
According to the specified time granularity, forward rounding is applied; for example, if the query start time is 2018-09-04 10:40:10 and the query time granularity is 5 minutes, the time for the last returned entry will be 2018-09-04 10:40:00. 
     * @return EndTime Query end time, such as 2018-09-04 10:40:10; the returned result is earlier than or equal to the specified time.
According to the specified time granularity, forward rounding is applied; for example, if the query start time is 2018-09-04 10:40:10 and the query time granularity is 5 minutes, the time for the last returned entry will be 2018-09-04 10:40:00.
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set Query end time, such as 2018-09-04 10:40:10; the returned result is earlier than or equal to the specified time.
According to the specified time granularity, forward rounding is applied; for example, if the query start time is 2018-09-04 10:40:10 and the query time granularity is 5 minutes, the time for the last returned entry will be 2018-09-04 10:40:00.
     * @param EndTime Query end time, such as 2018-09-04 10:40:10; the returned result is earlier than or equal to the specified time.
According to the specified time granularity, forward rounding is applied; for example, if the query start time is 2018-09-04 10:40:10 and the query time granularity is 5 minutes, the time for the last returned entry will be 2018-09-04 10:40:00.
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Specifies the list of domain names to be queried; up to 30 domain names can be queried at a time. 
     * @return Domains Specifies the list of domain names to be queried; up to 30 domain names can be queried at a time.
     */
    public String [] getDomains() {
        return this.Domains;
    }

    /**
     * Set Specifies the list of domain names to be queried; up to 30 domain names can be queried at a time.
     * @param Domains Specifies the list of domain names to be queried; up to 30 domain names can be queried at a time.
     */
    public void setDomains(String [] Domains) {
        this.Domains = Domains;
    }

    /**
     * Get Specifies the project ID to be queried, which can be viewed [here](https://console.cloud.tencent.com/project)
Please note that if domain names are specified, this parameter will be ignored. 
     * @return Project Specifies the project ID to be queried, which can be viewed [here](https://console.cloud.tencent.com/project)
Please note that if domain names are specified, this parameter will be ignored.
     */
    public Long getProject() {
        return this.Project;
    }

    /**
     * Set Specifies the project ID to be queried, which can be viewed [here](https://console.cloud.tencent.com/project)
Please note that if domain names are specified, this parameter will be ignored.
     * @param Project Specifies the project ID to be queried, which can be viewed [here](https://console.cloud.tencent.com/project)
Please note that if domain names are specified, this parameter will be ignored.
     */
    public void setProject(Long Project) {
        this.Project = Project;
    }

    /**
     * Get Sampling interval in minutes. The available options vary for different query period. See below: 
5min: 5 minutes. If the query period is within 24 hours, `5min` will be used by default.
day: 1 day. If the query period is longer than 24 hours, `day` will be used by default. 
     * @return Interval Sampling interval in minutes. The available options vary for different query period. See below: 
5min: 5 minutes. If the query period is within 24 hours, `5min` will be used by default.
day: 1 day. If the query period is longer than 24 hours, `day` will be used by default.
     */
    public String getInterval() {
        return this.Interval;
    }

    /**
     * Set Sampling interval in minutes. The available options vary for different query period. See below: 
5min: 5 minutes. If the query period is within 24 hours, `5min` will be used by default.
day: 1 day. If the query period is longer than 24 hours, `day` will be used by default.
     * @param Interval Sampling interval in minutes. The available options vary for different query period. See below: 
5min: 5 minutes. If the query period is within 24 hours, `5min` will be used by default.
day: 1 day. If the query period is longer than 24 hours, `day` will be used by default.
     */
    public void setInterval(String Interval) {
        this.Interval = Interval;
    }

    public DescribeIpVisitRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeIpVisitRequest(DescribeIpVisitRequest source) {
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.Domains != null) {
            this.Domains = new String[source.Domains.length];
            for (int i = 0; i < source.Domains.length; i++) {
                this.Domains[i] = new String(source.Domains[i]);
            }
        }
        if (source.Project != null) {
            this.Project = new Long(source.Project);
        }
        if (source.Interval != null) {
            this.Interval = new String(source.Interval);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamArraySimple(map, prefix + "Domains.", this.Domains);
        this.setParamSimple(map, prefix + "Project", this.Project);
        this.setParamSimple(map, prefix + "Interval", this.Interval);

    }
}

