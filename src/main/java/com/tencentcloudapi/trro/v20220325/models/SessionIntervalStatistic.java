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
package com.tencentcloudapi.trro.v20220325.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SessionIntervalStatistic extends AbstractModel {

    /**
    * Number of active on-site devices.
    */
    @SerializedName("ActiveFieldDeviceNum")
    @Expose
    private Long ActiveFieldDeviceNum;

    /**
    * Number of active remote devices.
    */
    @SerializedName("ActiveRemoteDeviceNum")
    @Expose
    private Long ActiveRemoteDeviceNum;

    /**
    * Number of sessions.
    */
    @SerializedName("SessionNum")
    @Expose
    private Long SessionNum;

    /**
    * Session age, unit: minutes.
    */
    @SerializedName("TotalDuration")
    @Expose
    private Long TotalDuration;

    /**
    * Timestamp in seconds.
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * Timestamp in seconds.
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * Proportion of excellent sessions, unit: %.
    */
    @SerializedName("NotBadSessionRatio")
    @Expose
    private Long NotBadSessionRatio;

    /**
     * Get Number of active on-site devices. 
     * @return ActiveFieldDeviceNum Number of active on-site devices.
     */
    public Long getActiveFieldDeviceNum() {
        return this.ActiveFieldDeviceNum;
    }

    /**
     * Set Number of active on-site devices.
     * @param ActiveFieldDeviceNum Number of active on-site devices.
     */
    public void setActiveFieldDeviceNum(Long ActiveFieldDeviceNum) {
        this.ActiveFieldDeviceNum = ActiveFieldDeviceNum;
    }

    /**
     * Get Number of active remote devices. 
     * @return ActiveRemoteDeviceNum Number of active remote devices.
     */
    public Long getActiveRemoteDeviceNum() {
        return this.ActiveRemoteDeviceNum;
    }

    /**
     * Set Number of active remote devices.
     * @param ActiveRemoteDeviceNum Number of active remote devices.
     */
    public void setActiveRemoteDeviceNum(Long ActiveRemoteDeviceNum) {
        this.ActiveRemoteDeviceNum = ActiveRemoteDeviceNum;
    }

    /**
     * Get Number of sessions. 
     * @return SessionNum Number of sessions.
     */
    public Long getSessionNum() {
        return this.SessionNum;
    }

    /**
     * Set Number of sessions.
     * @param SessionNum Number of sessions.
     */
    public void setSessionNum(Long SessionNum) {
        this.SessionNum = SessionNum;
    }

    /**
     * Get Session age, unit: minutes. 
     * @return TotalDuration Session age, unit: minutes.
     */
    public Long getTotalDuration() {
        return this.TotalDuration;
    }

    /**
     * Set Session age, unit: minutes.
     * @param TotalDuration Session age, unit: minutes.
     */
    public void setTotalDuration(Long TotalDuration) {
        this.TotalDuration = TotalDuration;
    }

    /**
     * Get Timestamp in seconds. 
     * @return StartTime Timestamp in seconds.
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Timestamp in seconds.
     * @param StartTime Timestamp in seconds.
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get Timestamp in seconds. 
     * @return EndTime Timestamp in seconds.
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set Timestamp in seconds.
     * @param EndTime Timestamp in seconds.
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Proportion of excellent sessions, unit: %. 
     * @return NotBadSessionRatio Proportion of excellent sessions, unit: %.
     */
    public Long getNotBadSessionRatio() {
        return this.NotBadSessionRatio;
    }

    /**
     * Set Proportion of excellent sessions, unit: %.
     * @param NotBadSessionRatio Proportion of excellent sessions, unit: %.
     */
    public void setNotBadSessionRatio(Long NotBadSessionRatio) {
        this.NotBadSessionRatio = NotBadSessionRatio;
    }

    public SessionIntervalStatistic() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SessionIntervalStatistic(SessionIntervalStatistic source) {
        if (source.ActiveFieldDeviceNum != null) {
            this.ActiveFieldDeviceNum = new Long(source.ActiveFieldDeviceNum);
        }
        if (source.ActiveRemoteDeviceNum != null) {
            this.ActiveRemoteDeviceNum = new Long(source.ActiveRemoteDeviceNum);
        }
        if (source.SessionNum != null) {
            this.SessionNum = new Long(source.SessionNum);
        }
        if (source.TotalDuration != null) {
            this.TotalDuration = new Long(source.TotalDuration);
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.NotBadSessionRatio != null) {
            this.NotBadSessionRatio = new Long(source.NotBadSessionRatio);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ActiveFieldDeviceNum", this.ActiveFieldDeviceNum);
        this.setParamSimple(map, prefix + "ActiveRemoteDeviceNum", this.ActiveRemoteDeviceNum);
        this.setParamSimple(map, prefix + "SessionNum", this.SessionNum);
        this.setParamSimple(map, prefix + "TotalDuration", this.TotalDuration);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "NotBadSessionRatio", this.NotBadSessionRatio);

    }
}

