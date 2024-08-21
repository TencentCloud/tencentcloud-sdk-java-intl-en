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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class JobResponseInfo extends AbstractModel {

    /**
    * Job name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("JobName")
    @Expose
    private String JobName;

    /**
    * Statistics
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("StatisticInfo")
    @Expose
    private StatisticInfo StatisticInfo;

    /**
    * Job configuration
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("JobConfiguration")
    @Expose
    private String JobConfiguration;

    /**
    * The current status of the job: 0: initializing; 1: running; 2: executed; 3: writing data; 4: queuing; -1: execution failed; -3: manually terminated. The job execution result is returned only when the job is successfully executed.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("JobStatus")
    @Expose
    private Long JobStatus;

    /**
     * Get Job name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return JobName Job name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getJobName() {
        return this.JobName;
    }

    /**
     * Set Job name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param JobName Job name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setJobName(String JobName) {
        this.JobName = JobName;
    }

    /**
     * Get Statistics
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return StatisticInfo Statistics
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public StatisticInfo getStatisticInfo() {
        return this.StatisticInfo;
    }

    /**
     * Set Statistics
Note: This field may return null, indicating that no valid values can be obtained.
     * @param StatisticInfo Statistics
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStatisticInfo(StatisticInfo StatisticInfo) {
        this.StatisticInfo = StatisticInfo;
    }

    /**
     * Get Job configuration
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return JobConfiguration Job configuration
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getJobConfiguration() {
        return this.JobConfiguration;
    }

    /**
     * Set Job configuration
Note: This field may return null, indicating that no valid values can be obtained.
     * @param JobConfiguration Job configuration
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setJobConfiguration(String JobConfiguration) {
        this.JobConfiguration = JobConfiguration;
    }

    /**
     * Get The current status of the job: 0: initializing; 1: running; 2: executed; 3: writing data; 4: queuing; -1: execution failed; -3: manually terminated. The job execution result is returned only when the job is successfully executed.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return JobStatus The current status of the job: 0: initializing; 1: running; 2: executed; 3: writing data; 4: queuing; -1: execution failed; -3: manually terminated. The job execution result is returned only when the job is successfully executed.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getJobStatus() {
        return this.JobStatus;
    }

    /**
     * Set The current status of the job: 0: initializing; 1: running; 2: executed; 3: writing data; 4: queuing; -1: execution failed; -3: manually terminated. The job execution result is returned only when the job is successfully executed.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param JobStatus The current status of the job: 0: initializing; 1: running; 2: executed; 3: writing data; 4: queuing; -1: execution failed; -3: manually terminated. The job execution result is returned only when the job is successfully executed.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setJobStatus(Long JobStatus) {
        this.JobStatus = JobStatus;
    }

    public JobResponseInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public JobResponseInfo(JobResponseInfo source) {
        if (source.JobName != null) {
            this.JobName = new String(source.JobName);
        }
        if (source.StatisticInfo != null) {
            this.StatisticInfo = new StatisticInfo(source.StatisticInfo);
        }
        if (source.JobConfiguration != null) {
            this.JobConfiguration = new String(source.JobConfiguration);
        }
        if (source.JobStatus != null) {
            this.JobStatus = new Long(source.JobStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "JobName", this.JobName);
        this.setParamObj(map, prefix + "StatisticInfo.", this.StatisticInfo);
        this.setParamSimple(map, prefix + "JobConfiguration", this.JobConfiguration);
        this.setParamSimple(map, prefix + "JobStatus", this.JobStatus);

    }
}

