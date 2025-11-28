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
package com.tencentcloudapi.clb.v20180317.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TargetHealth extends AbstractModel {

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
    * Describes the detailed information of the current health status. for example: Alive, Dead, Unknown, Close. Alive status is healthy, Dead state is abnormal, Unknown status includes not started, checking, Unknown status, Close means health check disabled or listener status stop.
    */
    @SerializedName("HealthStatusDetail")
    @Expose
    private String HealthStatusDetail;

    /**
    * (**This parameter will be disused soon. Please use `HealthStatusDetail` instead.**) Details of the current health status. Values: `Alive` (healthy), `Dead` (abnormal), `Unknown` (Health check not started/checking/unknown status)
    */
    @SerializedName("HealthStatusDetial")
    @Expose
    private String HealthStatusDetial;

    /**
    * Target group unique ID.
    */
    @SerializedName("TargetGroupId")
    @Expose
    private String TargetGroupId;

    /**
    * Specifies the weight of the Target.
    */
    @SerializedName("Weight")
    @Expose
    private Long Weight;

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
     * Get Describes the detailed information of the current health status. for example: Alive, Dead, Unknown, Close. Alive status is healthy, Dead state is abnormal, Unknown status includes not started, checking, Unknown status, Close means health check disabled or listener status stop. 
     * @return HealthStatusDetail Describes the detailed information of the current health status. for example: Alive, Dead, Unknown, Close. Alive status is healthy, Dead state is abnormal, Unknown status includes not started, checking, Unknown status, Close means health check disabled or listener status stop.
     */
    public String getHealthStatusDetail() {
        return this.HealthStatusDetail;
    }

    /**
     * Set Describes the detailed information of the current health status. for example: Alive, Dead, Unknown, Close. Alive status is healthy, Dead state is abnormal, Unknown status includes not started, checking, Unknown status, Close means health check disabled or listener status stop.
     * @param HealthStatusDetail Describes the detailed information of the current health status. for example: Alive, Dead, Unknown, Close. Alive status is healthy, Dead state is abnormal, Unknown status includes not started, checking, Unknown status, Close means health check disabled or listener status stop.
     */
    public void setHealthStatusDetail(String HealthStatusDetail) {
        this.HealthStatusDetail = HealthStatusDetail;
    }

    /**
     * Get (**This parameter will be disused soon. Please use `HealthStatusDetail` instead.**) Details of the current health status. Values: `Alive` (healthy), `Dead` (abnormal), `Unknown` (Health check not started/checking/unknown status) 
     * @return HealthStatusDetial (**This parameter will be disused soon. Please use `HealthStatusDetail` instead.**) Details of the current health status. Values: `Alive` (healthy), `Dead` (abnormal), `Unknown` (Health check not started/checking/unknown status)
     * @deprecated
     */
    @Deprecated
    public String getHealthStatusDetial() {
        return this.HealthStatusDetial;
    }

    /**
     * Set (**This parameter will be disused soon. Please use `HealthStatusDetail` instead.**) Details of the current health status. Values: `Alive` (healthy), `Dead` (abnormal), `Unknown` (Health check not started/checking/unknown status)
     * @param HealthStatusDetial (**This parameter will be disused soon. Please use `HealthStatusDetail` instead.**) Details of the current health status. Values: `Alive` (healthy), `Dead` (abnormal), `Unknown` (Health check not started/checking/unknown status)
     * @deprecated
     */
    @Deprecated
    public void setHealthStatusDetial(String HealthStatusDetial) {
        this.HealthStatusDetial = HealthStatusDetial;
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
     * Get Specifies the weight of the Target. 
     * @return Weight Specifies the weight of the Target.
     */
    public Long getWeight() {
        return this.Weight;
    }

    /**
     * Set Specifies the weight of the Target.
     * @param Weight Specifies the weight of the Target.
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
        if (source.HealthStatusDetial != null) {
            this.HealthStatusDetial = new String(source.HealthStatusDetial);
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
        this.setParamSimple(map, prefix + "HealthStatusDetial", this.HealthStatusDetial);
        this.setParamSimple(map, prefix + "TargetGroupId", this.TargetGroupId);
        this.setParamSimple(map, prefix + "Weight", this.Weight);

    }
}

