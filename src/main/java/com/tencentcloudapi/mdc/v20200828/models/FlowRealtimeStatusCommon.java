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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FlowRealtimeStatusCommon extends AbstractModel{

    /**
    * The connection status. Valid values: Connected, Waiting, Idle.
    */
    @SerializedName("State")
    @Expose
    private String State;

    /**
    * The connection mode. Valid values: Listener, Caller.
    */
    @SerializedName("Mode")
    @Expose
    private String Mode;

    /**
    * The connected time.
    */
    @SerializedName("ConnectedTime")
    @Expose
    private Long ConnectedTime;

    /**
    * The real-time bitrate (bps).
    */
    @SerializedName("Bitrate")
    @Expose
    private Long Bitrate;

    /**
    * The number of retries.
    */
    @SerializedName("Reconnections")
    @Expose
    private Long Reconnections;

    /**
     * Get The connection status. Valid values: Connected, Waiting, Idle. 
     * @return State The connection status. Valid values: Connected, Waiting, Idle.
     */
    public String getState() {
        return this.State;
    }

    /**
     * Set The connection status. Valid values: Connected, Waiting, Idle.
     * @param State The connection status. Valid values: Connected, Waiting, Idle.
     */
    public void setState(String State) {
        this.State = State;
    }

    /**
     * Get The connection mode. Valid values: Listener, Caller. 
     * @return Mode The connection mode. Valid values: Listener, Caller.
     */
    public String getMode() {
        return this.Mode;
    }

    /**
     * Set The connection mode. Valid values: Listener, Caller.
     * @param Mode The connection mode. Valid values: Listener, Caller.
     */
    public void setMode(String Mode) {
        this.Mode = Mode;
    }

    /**
     * Get The connected time. 
     * @return ConnectedTime The connected time.
     */
    public Long getConnectedTime() {
        return this.ConnectedTime;
    }

    /**
     * Set The connected time.
     * @param ConnectedTime The connected time.
     */
    public void setConnectedTime(Long ConnectedTime) {
        this.ConnectedTime = ConnectedTime;
    }

    /**
     * Get The real-time bitrate (bps). 
     * @return Bitrate The real-time bitrate (bps).
     */
    public Long getBitrate() {
        return this.Bitrate;
    }

    /**
     * Set The real-time bitrate (bps).
     * @param Bitrate The real-time bitrate (bps).
     */
    public void setBitrate(Long Bitrate) {
        this.Bitrate = Bitrate;
    }

    /**
     * Get The number of retries. 
     * @return Reconnections The number of retries.
     */
    public Long getReconnections() {
        return this.Reconnections;
    }

    /**
     * Set The number of retries.
     * @param Reconnections The number of retries.
     */
    public void setReconnections(Long Reconnections) {
        this.Reconnections = Reconnections;
    }

    public FlowRealtimeStatusCommon() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FlowRealtimeStatusCommon(FlowRealtimeStatusCommon source) {
        if (source.State != null) {
            this.State = new String(source.State);
        }
        if (source.Mode != null) {
            this.Mode = new String(source.Mode);
        }
        if (source.ConnectedTime != null) {
            this.ConnectedTime = new Long(source.ConnectedTime);
        }
        if (source.Bitrate != null) {
            this.Bitrate = new Long(source.Bitrate);
        }
        if (source.Reconnections != null) {
            this.Reconnections = new Long(source.Reconnections);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamSimple(map, prefix + "Mode", this.Mode);
        this.setParamSimple(map, prefix + "ConnectedTime", this.ConnectedTime);
        this.setParamSimple(map, prefix + "Bitrate", this.Bitrate);
        this.setParamSimple(map, prefix + "Reconnections", this.Reconnections);

    }
}

