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
package com.tencentcloudapi.tem.v20210701.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TemEnvironmentStartingStatus extends AbstractModel {

    /**
    * Number of applications to start
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("ApplicationNumNeedToStart")
    @Expose
    private Long ApplicationNumNeedToStart;

    /**
    * Number of started applictions
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("StartedApplicationNum")
    @Expose
    private Long StartedApplicationNum;

    /**
    * Number of applications failed to be started
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("StartFailedApplicationNum")
    @Expose
    private Long StartFailedApplicationNum;

    /**
     * Get Number of applications to start
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return ApplicationNumNeedToStart Number of applications to start
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public Long getApplicationNumNeedToStart() {
        return this.ApplicationNumNeedToStart;
    }

    /**
     * Set Number of applications to start
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param ApplicationNumNeedToStart Number of applications to start
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setApplicationNumNeedToStart(Long ApplicationNumNeedToStart) {
        this.ApplicationNumNeedToStart = ApplicationNumNeedToStart;
    }

    /**
     * Get Number of started applictions
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return StartedApplicationNum Number of started applictions
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public Long getStartedApplicationNum() {
        return this.StartedApplicationNum;
    }

    /**
     * Set Number of started applictions
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param StartedApplicationNum Number of started applictions
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setStartedApplicationNum(Long StartedApplicationNum) {
        this.StartedApplicationNum = StartedApplicationNum;
    }

    /**
     * Get Number of applications failed to be started
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return StartFailedApplicationNum Number of applications failed to be started
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public Long getStartFailedApplicationNum() {
        return this.StartFailedApplicationNum;
    }

    /**
     * Set Number of applications failed to be started
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param StartFailedApplicationNum Number of applications failed to be started
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setStartFailedApplicationNum(Long StartFailedApplicationNum) {
        this.StartFailedApplicationNum = StartFailedApplicationNum;
    }

    public TemEnvironmentStartingStatus() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TemEnvironmentStartingStatus(TemEnvironmentStartingStatus source) {
        if (source.ApplicationNumNeedToStart != null) {
            this.ApplicationNumNeedToStart = new Long(source.ApplicationNumNeedToStart);
        }
        if (source.StartedApplicationNum != null) {
            this.StartedApplicationNum = new Long(source.StartedApplicationNum);
        }
        if (source.StartFailedApplicationNum != null) {
            this.StartFailedApplicationNum = new Long(source.StartFailedApplicationNum);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ApplicationNumNeedToStart", this.ApplicationNumNeedToStart);
        this.setParamSimple(map, prefix + "StartedApplicationNum", this.StartedApplicationNum);
        this.setParamSimple(map, prefix + "StartFailedApplicationNum", this.StartFailedApplicationNum);

    }
}

