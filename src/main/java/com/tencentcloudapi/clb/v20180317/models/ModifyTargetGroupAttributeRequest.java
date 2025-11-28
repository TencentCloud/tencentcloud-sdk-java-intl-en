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

public class ModifyTargetGroupAttributeRequest extends AbstractModel {

    /**
    * Target group ID
    */
    @SerializedName("TargetGroupId")
    @Expose
    private String TargetGroupId;

    /**
    * New name of target group
    */
    @SerializedName("TargetGroupName")
    @Expose
    private String TargetGroupName;

    /**
    * The new default port of the target group. this parameter is not supported for full listen target groups.
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * Scheduling algorithm. this parameter is valid only for target groups of the new version V2 when the backend forwarding protocol is HTTP, HTTPS, or GRPC. available values:.
<ur><li>WRR: weighted round-robin.</li><li>LEAST_CONN: LEAST connection.</li><li>IP_HASH: based on IP HASH.</li><li>default is WRR.</li></ur>.
    */
    @SerializedName("ScheduleAlgorithm")
    @Expose
    private String ScheduleAlgorithm;

    /**
    * Health check details.
    */
    @SerializedName("HealthCheck")
    @Expose
    private TargetGroupHealthCheck HealthCheck;

    /**
    * Default Weight for backend service. among them: <ul><li>value ranges from 0 to 100.</li><li>after setting this value, when adding a backend service to the target group, if the backend service does not set Weight separately, use the default Weight here.</li><li>Weight parameter settings not supported for v1 target group type.</li></ul>.
    */
    @SerializedName("Weight")
    @Expose
    private Long Weight;

    /**
    * Specifies whether to enable the persistent connection feature. this parameter applies only to HTTP and HTTPS target groups. true: disable; false: enable. this feature is off by default.
    */
    @SerializedName("KeepaliveEnable")
    @Expose
    private Boolean KeepaliveEnable;

    /**
    * Specifies the session persistence time in seconds. value range: 30-3600. default: 0 (disabled). this parameter is unsupported for TCP/UDP target groups.
    */
    @SerializedName("SessionExpireTime")
    @Expose
    private Long SessionExpireTime;

    /**
     * Get Target group ID 
     * @return TargetGroupId Target group ID
     */
    public String getTargetGroupId() {
        return this.TargetGroupId;
    }

    /**
     * Set Target group ID
     * @param TargetGroupId Target group ID
     */
    public void setTargetGroupId(String TargetGroupId) {
        this.TargetGroupId = TargetGroupId;
    }

    /**
     * Get New name of target group 
     * @return TargetGroupName New name of target group
     */
    public String getTargetGroupName() {
        return this.TargetGroupName;
    }

    /**
     * Set New name of target group
     * @param TargetGroupName New name of target group
     */
    public void setTargetGroupName(String TargetGroupName) {
        this.TargetGroupName = TargetGroupName;
    }

    /**
     * Get The new default port of the target group. this parameter is not supported for full listen target groups. 
     * @return Port The new default port of the target group. this parameter is not supported for full listen target groups.
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set The new default port of the target group. this parameter is not supported for full listen target groups.
     * @param Port The new default port of the target group. this parameter is not supported for full listen target groups.
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get Scheduling algorithm. this parameter is valid only for target groups of the new version V2 when the backend forwarding protocol is HTTP, HTTPS, or GRPC. available values:.
<ur><li>WRR: weighted round-robin.</li><li>LEAST_CONN: LEAST connection.</li><li>IP_HASH: based on IP HASH.</li><li>default is WRR.</li></ur>. 
     * @return ScheduleAlgorithm Scheduling algorithm. this parameter is valid only for target groups of the new version V2 when the backend forwarding protocol is HTTP, HTTPS, or GRPC. available values:.
<ur><li>WRR: weighted round-robin.</li><li>LEAST_CONN: LEAST connection.</li><li>IP_HASH: based on IP HASH.</li><li>default is WRR.</li></ur>.
     */
    public String getScheduleAlgorithm() {
        return this.ScheduleAlgorithm;
    }

    /**
     * Set Scheduling algorithm. this parameter is valid only for target groups of the new version V2 when the backend forwarding protocol is HTTP, HTTPS, or GRPC. available values:.
<ur><li>WRR: weighted round-robin.</li><li>LEAST_CONN: LEAST connection.</li><li>IP_HASH: based on IP HASH.</li><li>default is WRR.</li></ur>.
     * @param ScheduleAlgorithm Scheduling algorithm. this parameter is valid only for target groups of the new version V2 when the backend forwarding protocol is HTTP, HTTPS, or GRPC. available values:.
<ur><li>WRR: weighted round-robin.</li><li>LEAST_CONN: LEAST connection.</li><li>IP_HASH: based on IP HASH.</li><li>default is WRR.</li></ur>.
     */
    public void setScheduleAlgorithm(String ScheduleAlgorithm) {
        this.ScheduleAlgorithm = ScheduleAlgorithm;
    }

    /**
     * Get Health check details. 
     * @return HealthCheck Health check details.
     */
    public TargetGroupHealthCheck getHealthCheck() {
        return this.HealthCheck;
    }

    /**
     * Set Health check details.
     * @param HealthCheck Health check details.
     */
    public void setHealthCheck(TargetGroupHealthCheck HealthCheck) {
        this.HealthCheck = HealthCheck;
    }

    /**
     * Get Default Weight for backend service. among them: <ul><li>value ranges from 0 to 100.</li><li>after setting this value, when adding a backend service to the target group, if the backend service does not set Weight separately, use the default Weight here.</li><li>Weight parameter settings not supported for v1 target group type.</li></ul>. 
     * @return Weight Default Weight for backend service. among them: <ul><li>value ranges from 0 to 100.</li><li>after setting this value, when adding a backend service to the target group, if the backend service does not set Weight separately, use the default Weight here.</li><li>Weight parameter settings not supported for v1 target group type.</li></ul>.
     */
    public Long getWeight() {
        return this.Weight;
    }

    /**
     * Set Default Weight for backend service. among them: <ul><li>value ranges from 0 to 100.</li><li>after setting this value, when adding a backend service to the target group, if the backend service does not set Weight separately, use the default Weight here.</li><li>Weight parameter settings not supported for v1 target group type.</li></ul>.
     * @param Weight Default Weight for backend service. among them: <ul><li>value ranges from 0 to 100.</li><li>after setting this value, when adding a backend service to the target group, if the backend service does not set Weight separately, use the default Weight here.</li><li>Weight parameter settings not supported for v1 target group type.</li></ul>.
     */
    public void setWeight(Long Weight) {
        this.Weight = Weight;
    }

    /**
     * Get Specifies whether to enable the persistent connection feature. this parameter applies only to HTTP and HTTPS target groups. true: disable; false: enable. this feature is off by default. 
     * @return KeepaliveEnable Specifies whether to enable the persistent connection feature. this parameter applies only to HTTP and HTTPS target groups. true: disable; false: enable. this feature is off by default.
     */
    public Boolean getKeepaliveEnable() {
        return this.KeepaliveEnable;
    }

    /**
     * Set Specifies whether to enable the persistent connection feature. this parameter applies only to HTTP and HTTPS target groups. true: disable; false: enable. this feature is off by default.
     * @param KeepaliveEnable Specifies whether to enable the persistent connection feature. this parameter applies only to HTTP and HTTPS target groups. true: disable; false: enable. this feature is off by default.
     */
    public void setKeepaliveEnable(Boolean KeepaliveEnable) {
        this.KeepaliveEnable = KeepaliveEnable;
    }

    /**
     * Get Specifies the session persistence time in seconds. value range: 30-3600. default: 0 (disabled). this parameter is unsupported for TCP/UDP target groups. 
     * @return SessionExpireTime Specifies the session persistence time in seconds. value range: 30-3600. default: 0 (disabled). this parameter is unsupported for TCP/UDP target groups.
     */
    public Long getSessionExpireTime() {
        return this.SessionExpireTime;
    }

    /**
     * Set Specifies the session persistence time in seconds. value range: 30-3600. default: 0 (disabled). this parameter is unsupported for TCP/UDP target groups.
     * @param SessionExpireTime Specifies the session persistence time in seconds. value range: 30-3600. default: 0 (disabled). this parameter is unsupported for TCP/UDP target groups.
     */
    public void setSessionExpireTime(Long SessionExpireTime) {
        this.SessionExpireTime = SessionExpireTime;
    }

    public ModifyTargetGroupAttributeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyTargetGroupAttributeRequest(ModifyTargetGroupAttributeRequest source) {
        if (source.TargetGroupId != null) {
            this.TargetGroupId = new String(source.TargetGroupId);
        }
        if (source.TargetGroupName != null) {
            this.TargetGroupName = new String(source.TargetGroupName);
        }
        if (source.Port != null) {
            this.Port = new Long(source.Port);
        }
        if (source.ScheduleAlgorithm != null) {
            this.ScheduleAlgorithm = new String(source.ScheduleAlgorithm);
        }
        if (source.HealthCheck != null) {
            this.HealthCheck = new TargetGroupHealthCheck(source.HealthCheck);
        }
        if (source.Weight != null) {
            this.Weight = new Long(source.Weight);
        }
        if (source.KeepaliveEnable != null) {
            this.KeepaliveEnable = new Boolean(source.KeepaliveEnable);
        }
        if (source.SessionExpireTime != null) {
            this.SessionExpireTime = new Long(source.SessionExpireTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TargetGroupId", this.TargetGroupId);
        this.setParamSimple(map, prefix + "TargetGroupName", this.TargetGroupName);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "ScheduleAlgorithm", this.ScheduleAlgorithm);
        this.setParamObj(map, prefix + "HealthCheck.", this.HealthCheck);
        this.setParamSimple(map, prefix + "Weight", this.Weight);
        this.setParamSimple(map, prefix + "KeepaliveEnable", this.KeepaliveEnable);
        this.setParamSimple(map, prefix + "SessionExpireTime", this.SessionExpireTime);

    }
}

