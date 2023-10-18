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
package com.tencentcloudapi.mdc.v20200828.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FlowMediaVideo extends AbstractModel {

    /**
    * The frame rate.
    */
    @SerializedName("Fps")
    @Expose
    private Long Fps;

    /**
    * The bitrate (bps).
    */
    @SerializedName("Rate")
    @Expose
    private Long Rate;

    /**
    * The video PID.
    */
    @SerializedName("Pid")
    @Expose
    private Long Pid;

    /**
    * The ID of a push session.
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
     * Get The frame rate. 
     * @return Fps The frame rate.
     */
    public Long getFps() {
        return this.Fps;
    }

    /**
     * Set The frame rate.
     * @param Fps The frame rate.
     */
    public void setFps(Long Fps) {
        this.Fps = Fps;
    }

    /**
     * Get The bitrate (bps). 
     * @return Rate The bitrate (bps).
     */
    public Long getRate() {
        return this.Rate;
    }

    /**
     * Set The bitrate (bps).
     * @param Rate The bitrate (bps).
     */
    public void setRate(Long Rate) {
        this.Rate = Rate;
    }

    /**
     * Get The video PID. 
     * @return Pid The video PID.
     */
    public Long getPid() {
        return this.Pid;
    }

    /**
     * Set The video PID.
     * @param Pid The video PID.
     */
    public void setPid(Long Pid) {
        this.Pid = Pid;
    }

    /**
     * Get The ID of a push session. 
     * @return SessionId The ID of a push session.
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * Set The ID of a push session.
     * @param SessionId The ID of a push session.
     */
    public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
    }

    public FlowMediaVideo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FlowMediaVideo(FlowMediaVideo source) {
        if (source.Fps != null) {
            this.Fps = new Long(source.Fps);
        }
        if (source.Rate != null) {
            this.Rate = new Long(source.Rate);
        }
        if (source.Pid != null) {
            this.Pid = new Long(source.Pid);
        }
        if (source.SessionId != null) {
            this.SessionId = new String(source.SessionId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Fps", this.Fps);
        this.setParamSimple(map, prefix + "Rate", this.Rate);
        this.setParamSimple(map, prefix + "Pid", this.Pid);
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);

    }
}

