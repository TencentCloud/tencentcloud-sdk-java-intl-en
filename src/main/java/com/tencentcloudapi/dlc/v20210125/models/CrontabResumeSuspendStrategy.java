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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CrontabResumeSuspendStrategy extends AbstractModel {

    /**
    * Scheduled starting time, such as 8: 00 a.m. on Monday and Wednesday
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ResumeTime")
    @Expose
    private String ResumeTime;

    /**
    * Scheduled suspension time, such as 8: 00 p.m. on Monday and Wednesday
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SuspendTime")
    @Expose
    private String SuspendTime;

    /**
    * The suspension setting. Valid values: `0` (suspension after task end, default) and `1` (force suspension).
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SuspendStrategy")
    @Expose
    private Long SuspendStrategy;

    /**
     * Get Scheduled starting time, such as 8: 00 a.m. on Monday and Wednesday
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ResumeTime Scheduled starting time, such as 8: 00 a.m. on Monday and Wednesday
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getResumeTime() {
        return this.ResumeTime;
    }

    /**
     * Set Scheduled starting time, such as 8: 00 a.m. on Monday and Wednesday
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ResumeTime Scheduled starting time, such as 8: 00 a.m. on Monday and Wednesday
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setResumeTime(String ResumeTime) {
        this.ResumeTime = ResumeTime;
    }

    /**
     * Get Scheduled suspension time, such as 8: 00 p.m. on Monday and Wednesday
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SuspendTime Scheduled suspension time, such as 8: 00 p.m. on Monday and Wednesday
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getSuspendTime() {
        return this.SuspendTime;
    }

    /**
     * Set Scheduled suspension time, such as 8: 00 p.m. on Monday and Wednesday
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SuspendTime Scheduled suspension time, such as 8: 00 p.m. on Monday and Wednesday
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSuspendTime(String SuspendTime) {
        this.SuspendTime = SuspendTime;
    }

    /**
     * Get The suspension setting. Valid values: `0` (suspension after task end, default) and `1` (force suspension).
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SuspendStrategy The suspension setting. Valid values: `0` (suspension after task end, default) and `1` (force suspension).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getSuspendStrategy() {
        return this.SuspendStrategy;
    }

    /**
     * Set The suspension setting. Valid values: `0` (suspension after task end, default) and `1` (force suspension).
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SuspendStrategy The suspension setting. Valid values: `0` (suspension after task end, default) and `1` (force suspension).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSuspendStrategy(Long SuspendStrategy) {
        this.SuspendStrategy = SuspendStrategy;
    }

    public CrontabResumeSuspendStrategy() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CrontabResumeSuspendStrategy(CrontabResumeSuspendStrategy source) {
        if (source.ResumeTime != null) {
            this.ResumeTime = new String(source.ResumeTime);
        }
        if (source.SuspendTime != null) {
            this.SuspendTime = new String(source.SuspendTime);
        }
        if (source.SuspendStrategy != null) {
            this.SuspendStrategy = new Long(source.SuspendStrategy);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResumeTime", this.ResumeTime);
        this.setParamSimple(map, prefix + "SuspendTime", this.SuspendTime);
        this.setParamSimple(map, prefix + "SuspendStrategy", this.SuspendStrategy);

    }
}

