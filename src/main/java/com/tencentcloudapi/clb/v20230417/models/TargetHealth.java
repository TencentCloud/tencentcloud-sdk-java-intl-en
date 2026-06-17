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
package com.tencentcloudapi.clb.v20230417.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TargetHealth extends AbstractModel {

    /**
    * Private network IP of target
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
    * Detailed information of the current health status. For example: Alive, Dead, Unknown, Close. Alive status is healthy, Dead state is abnormal, Unknown status includes not started, checking, unknown status, Close means health check disabled or listener status stop.
    */
    @SerializedName("HealthStatus")
    @Expose
    private Boolean HealthStatus;

    /**
    * Target instance ID, such as ins-12345678
    */
    @SerializedName("TargetId")
    @Expose
    private String TargetId;

    /**
    * Detailed information about the current health status. Alive: Healthy; Dead: Exceptional; Unknown: Check not started/Checking/Unknown status.
    */
    @SerializedName("HealthStatusDetail")
    @Expose
    private String HealthStatusDetail;

    /**
    * Target group unique ID.
    */
    @SerializedName("TargetGroupId")
    @Expose
    private String TargetGroupId;

    /**
    * Weight of the Target
    */
    @SerializedName("Weight")
    @Expose
    private Long Weight;

    /**
     * Get Private network IP of target 
     * @return IP Private network IP of target
     */
    public String getIP() {
        return this.IP;
    }

    /**
     * Set Private network IP of target
     * @param IP Private network IP of target
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
     * Get Detailed information of the current health status. For example: Alive, Dead, Unknown, Close. Alive status is healthy, Dead state is abnormal, Unknown status includes not started, checking, unknown status, Close means health check disabled or listener status stop. 
     * @return HealthStatus Detailed information of the current health status. For example: Alive, Dead, Unknown, Close. Alive status is healthy, Dead state is abnormal, Unknown status includes not started, checking, unknown status, Close means health check disabled or listener status stop.
     */
    public Boolean getHealthStatus() {
        return this.HealthStatus;
    }

    /**
     * Set Detailed information of the current health status. For example: Alive, Dead, Unknown, Close. Alive status is healthy, Dead state is abnormal, Unknown status includes not started, checking, unknown status, Close means health check disabled or listener status stop.
     * @param HealthStatus Detailed information of the current health status. For example: Alive, Dead, Unknown, Close. Alive status is healthy, Dead state is abnormal, Unknown status includes not started, checking, unknown status, Close means health check disabled or listener status stop.
     */
    public void setHealthStatus(Boolean HealthStatus) {
        this.HealthStatus = HealthStatus;
    }

    /**
     * Get Target instance ID, such as ins-12345678 
     * @return TargetId Target instance ID, such as ins-12345678
     */
    public String getTargetId() {
        return this.TargetId;
    }

    /**
     * Set Target instance ID, such as ins-12345678
     * @param TargetId Target instance ID, such as ins-12345678
     */
    public void setTargetId(String TargetId) {
        this.TargetId = TargetId;
    }

    /**
     * Get Detailed information about the current health status. Alive: Healthy; Dead: Exceptional; Unknown: Check not started/Checking/Unknown status. 
     * @return HealthStatusDetail Detailed information about the current health status. Alive: Healthy; Dead: Exceptional; Unknown: Check not started/Checking/Unknown status.
     */
    public String getHealthStatusDetail() {
        return this.HealthStatusDetail;
    }

    /**
     * Set Detailed information about the current health status. Alive: Healthy; Dead: Exceptional; Unknown: Check not started/Checking/Unknown status.
     * @param HealthStatusDetail Detailed information about the current health status. Alive: Healthy; Dead: Exceptional; Unknown: Check not started/Checking/Unknown status.
     */
    public void setHealthStatusDetail(String HealthStatusDetail) {
        this.HealthStatusDetail = HealthStatusDetail;
    }

    /**
     * Get Target group unique ID. 
     * @return TargetGroupId Target group unique ID.
     */
    public String getTargetGroupId() {
        return this.TargetGroupId;
    }

    /**
     * Set Target group unique ID.
     * @param TargetGroupId Target group unique ID.
     */
    public void setTargetGroupId(String TargetGroupId) {
        this.TargetGroupId = TargetGroupId;
    }

    /**
     * Get Weight of the Target 
     * @return Weight Weight of the Target
     */
    public Long getWeight() {
        return this.Weight;
    }

    /**
     * Set Weight of the Target
     * @param Weight Weight of the Target
     */
    public void setWeight(Long Weight) {
        this.Weight = Weight;
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
        if (source.HealthStatusDetail != null) {
            this.HealthStatusDetail = new String(source.HealthStatusDetail);
        }
        if (source.TargetGroupId != null) {
            this.TargetGroupId = new String(source.TargetGroupId);
        }
        if (source.Weight != null) {
            this.Weight = new Long(source.Weight);
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
        this.setParamSimple(map, prefix + "HealthStatusDetail", this.HealthStatusDetail);
        this.setParamSimple(map, prefix + "TargetGroupId", this.TargetGroupId);
        this.setParamSimple(map, prefix + "Weight", this.Weight);

    }
}

