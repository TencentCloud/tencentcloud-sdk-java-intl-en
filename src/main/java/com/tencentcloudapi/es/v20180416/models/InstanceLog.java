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
package com.tencentcloudapi.es.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstanceLog extends AbstractModel{

    /**
    * Log time
    */
    @SerializedName("Time")
    @Expose
    private String Time;

    /**
    * Log level
    */
    @SerializedName("Level")
    @Expose
    private String Level;

    /**
    * Cluster node IP
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * Log content
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
     * Get Log time 
     * @return Time Log time
     */
    public String getTime() {
        return this.Time;
    }

    /**
     * Set Log time
     * @param Time Log time
     */
    public void setTime(String Time) {
        this.Time = Time;
    }

    /**
     * Get Log level 
     * @return Level Log level
     */
    public String getLevel() {
        return this.Level;
    }

    /**
     * Set Log level
     * @param Level Log level
     */
    public void setLevel(String Level) {
        this.Level = Level;
    }

    /**
     * Get Cluster node IP 
     * @return Ip Cluster node IP
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set Cluster node IP
     * @param Ip Cluster node IP
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * Get Log content 
     * @return Message Log content
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set Log content
     * @param Message Log content
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Time", this.Time);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamSimple(map, prefix + "Ip", this.Ip);
        this.setParamSimple(map, prefix + "Message", this.Message);

    }
}

