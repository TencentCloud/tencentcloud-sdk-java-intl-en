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
package com.tencentcloudapi.pts.v20210728.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AdjustJobSpeedRequest extends AbstractModel {

    /**
    * Job ID.
    */
    @SerializedName("JobId")
    @Expose
    private String JobId;

    /**
    * Target RPS. The value should be greater than the initial RPS and less than the maximum RPS.
    */
    @SerializedName("TargetRequestsPerSecond")
    @Expose
    private Long TargetRequestsPerSecond;

    /**
     * Get Job ID. 
     * @return JobId Job ID.
     */
    public String getJobId() {
        return this.JobId;
    }

    /**
     * Set Job ID.
     * @param JobId Job ID.
     */
    public void setJobId(String JobId) {
        this.JobId = JobId;
    }

    /**
     * Get Target RPS. The value should be greater than the initial RPS and less than the maximum RPS. 
     * @return TargetRequestsPerSecond Target RPS. The value should be greater than the initial RPS and less than the maximum RPS.
     */
    public Long getTargetRequestsPerSecond() {
        return this.TargetRequestsPerSecond;
    }

    /**
     * Set Target RPS. The value should be greater than the initial RPS and less than the maximum RPS.
     * @param TargetRequestsPerSecond Target RPS. The value should be greater than the initial RPS and less than the maximum RPS.
     */
    public void setTargetRequestsPerSecond(Long TargetRequestsPerSecond) {
        this.TargetRequestsPerSecond = TargetRequestsPerSecond;
    }

    public AdjustJobSpeedRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AdjustJobSpeedRequest(AdjustJobSpeedRequest source) {
        if (source.JobId != null) {
            this.JobId = new String(source.JobId);
        }
        if (source.TargetRequestsPerSecond != null) {
            this.TargetRequestsPerSecond = new Long(source.TargetRequestsPerSecond);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "JobId", this.JobId);
        this.setParamSimple(map, prefix + "TargetRequestsPerSecond", this.TargetRequestsPerSecond);

    }
}

