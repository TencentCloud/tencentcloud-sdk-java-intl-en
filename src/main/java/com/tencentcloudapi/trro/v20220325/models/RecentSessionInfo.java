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

public class RecentSessionInfo extends AbstractModel {

    /**
    * Session id.
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
    * Remote device id.
    */
    @SerializedName("RemoteDeviceId")
    @Expose
    private String RemoteDeviceId;

    /**
    * On-Site device id.
    */
    @SerializedName("FieldDeviceId")
    @Expose
    private String FieldDeviceId;

    /**
    * Target resolution.
    */
    @SerializedName("Resolution")
    @Expose
    private String Resolution;

    /**
    * Session start time.
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * Last updated time.
    */
    @SerializedName("LatestUpdateTime")
    @Expose
    private Long LatestUpdateTime;

    /**
     * Get Session id. 
     * @return SessionId Session id.
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * Set Session id.
     * @param SessionId Session id.
     */
    public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
    }

    /**
     * Get Remote device id. 
     * @return RemoteDeviceId Remote device id.
     */
    public String getRemoteDeviceId() {
        return this.RemoteDeviceId;
    }

    /**
     * Set Remote device id.
     * @param RemoteDeviceId Remote device id.
     */
    public void setRemoteDeviceId(String RemoteDeviceId) {
        this.RemoteDeviceId = RemoteDeviceId;
    }

    /**
     * Get On-Site device id. 
     * @return FieldDeviceId On-Site device id.
     */
    public String getFieldDeviceId() {
        return this.FieldDeviceId;
    }

    /**
     * Set On-Site device id.
     * @param FieldDeviceId On-Site device id.
     */
    public void setFieldDeviceId(String FieldDeviceId) {
        this.FieldDeviceId = FieldDeviceId;
    }

    /**
     * Get Target resolution. 
     * @return Resolution Target resolution.
     */
    public String getResolution() {
        return this.Resolution;
    }

    /**
     * Set Target resolution.
     * @param Resolution Target resolution.
     */
    public void setResolution(String Resolution) {
        this.Resolution = Resolution;
    }

    /**
     * Get Session start time. 
     * @return StartTime Session start time.
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Session start time.
     * @param StartTime Session start time.
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get Last updated time. 
     * @return LatestUpdateTime Last updated time.
     */
    public Long getLatestUpdateTime() {
        return this.LatestUpdateTime;
    }

    /**
     * Set Last updated time.
     * @param LatestUpdateTime Last updated time.
     */
    public void setLatestUpdateTime(Long LatestUpdateTime) {
        this.LatestUpdateTime = LatestUpdateTime;
    }

    public RecentSessionInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RecentSessionInfo(RecentSessionInfo source) {
        if (source.SessionId != null) {
            this.SessionId = new String(source.SessionId);
        }
        if (source.RemoteDeviceId != null) {
            this.RemoteDeviceId = new String(source.RemoteDeviceId);
        }
        if (source.FieldDeviceId != null) {
            this.FieldDeviceId = new String(source.FieldDeviceId);
        }
        if (source.Resolution != null) {
            this.Resolution = new String(source.Resolution);
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.LatestUpdateTime != null) {
            this.LatestUpdateTime = new Long(source.LatestUpdateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);
        this.setParamSimple(map, prefix + "RemoteDeviceId", this.RemoteDeviceId);
        this.setParamSimple(map, prefix + "FieldDeviceId", this.FieldDeviceId);
        this.setParamSimple(map, prefix + "Resolution", this.Resolution);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "LatestUpdateTime", this.LatestUpdateTime);

    }
}

