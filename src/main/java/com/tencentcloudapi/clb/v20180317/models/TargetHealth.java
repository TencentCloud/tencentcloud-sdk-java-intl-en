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
package com.tencentcloudapi.clb.v20180317.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TargetHealth extends AbstractModel{

    /**
    * Private IP of the target
    */
    @SerializedName("IP")
    @Expose
    private String IP;

    /**
    * Port bound to the target
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * Current health status. true: healthy; false: unhealthy.
    */
    @SerializedName("HealthStatus")
    @Expose
    private Boolean HealthStatus;

    /**
    * Instance ID of the target, such as ins-12345678
    */
    @SerializedName("TargetId")
    @Expose
    private String TargetId;

    /**
    * Detailed information of the current health status. Alive: healthy; Dead: exceptional; Unknown: check not started/checking/unknown status.
    */
    @SerializedName("HealthStatusDetial")
    @Expose
    private String HealthStatusDetial;

    /**
     * Get Private IP of the target 
     * @return IP Private IP of the target
     */
    public String getIP() {
        return this.IP;
    }

    /**
     * Set Private IP of the target
     * @param IP Private IP of the target
     */
    public void setIP(String IP) {
        this.IP = IP;
    }

    /**
     * Get Port bound to the target 
     * @return Port Port bound to the target
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set Port bound to the target
     * @param Port Port bound to the target
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get Current health status. true: healthy; false: unhealthy. 
     * @return HealthStatus Current health status. true: healthy; false: unhealthy.
     */
    public Boolean getHealthStatus() {
        return this.HealthStatus;
    }

    /**
     * Set Current health status. true: healthy; false: unhealthy.
     * @param HealthStatus Current health status. true: healthy; false: unhealthy.
     */
    public void setHealthStatus(Boolean HealthStatus) {
        this.HealthStatus = HealthStatus;
    }

    /**
     * Get Instance ID of the target, such as ins-12345678 
     * @return TargetId Instance ID of the target, such as ins-12345678
     */
    public String getTargetId() {
        return this.TargetId;
    }

    /**
     * Set Instance ID of the target, such as ins-12345678
     * @param TargetId Instance ID of the target, such as ins-12345678
     */
    public void setTargetId(String TargetId) {
        this.TargetId = TargetId;
    }

    /**
     * Get Detailed information of the current health status. Alive: healthy; Dead: exceptional; Unknown: check not started/checking/unknown status. 
     * @return HealthStatusDetial Detailed information of the current health status. Alive: healthy; Dead: exceptional; Unknown: check not started/checking/unknown status.
     */
    public String getHealthStatusDetial() {
        return this.HealthStatusDetial;
    }

    /**
     * Set Detailed information of the current health status. Alive: healthy; Dead: exceptional; Unknown: check not started/checking/unknown status.
     * @param HealthStatusDetial Detailed information of the current health status. Alive: healthy; Dead: exceptional; Unknown: check not started/checking/unknown status.
     */
    public void setHealthStatusDetial(String HealthStatusDetial) {
        this.HealthStatusDetial = HealthStatusDetial;
    }

    public TargetHealth() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TargetHealth(TargetHealth source) {
        if (source.IP != null) {
            this.IP = new String(source.IP);
        }
        if (source.Port != null) {
            this.Port = new Long(source.Port);
        }
        if (source.HealthStatus != null) {
            this.HealthStatus = new Boolean(source.HealthStatus);
        }
        if (source.TargetId != null) {
            this.TargetId = new String(source.TargetId);
        }
        if (source.HealthStatusDetial != null) {
            this.HealthStatusDetial = new String(source.HealthStatusDetial);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IP", this.IP);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "HealthStatus", this.HealthStatus);
        this.setParamSimple(map, prefix + "TargetId", this.TargetId);
        this.setParamSimple(map, prefix + "HealthStatusDetial", this.HealthStatusDetial);

    }
}

