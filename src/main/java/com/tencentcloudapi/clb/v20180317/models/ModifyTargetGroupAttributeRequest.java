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
    * <p>Target group ID.</p>
    */
    @SerializedName("TargetGroupId")
    @Expose
    private String TargetGroupId;

    /**
    * <p>New name of target group. Naming rule: 1-80 English letters, Chinese characters and other internationally compatible language characters, digits, connecting line "-", underscore "_" and other common characters (Unicode supplementary characters such as emoji and rare Chinese characters are forbidden).</p>
    */
    @SerializedName("TargetGroupName")
    @Expose
    private String TargetGroupName;

    /**
    * <p>New default port of target group. Full listen target group does not support this parameter.</p>
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * <p>Scheduling algorithm. This parameter is valid only for new version V2 target groups with backend forwarding protocol (HTTP|HTTPS|GRPC). Available values:<br>&lt;ur&gt;<li>WRR: weighted round-robin.</li><li>LEAST_CONN: least connection.</li><li>IP_HASH: based on IP hash.</li><li>Default WRR.</li>&lt;ur&gt;</p>
    */
    @SerializedName("ScheduleAlgorithm")
    @Expose
    private String ScheduleAlgorithm;

    /**
    * <p>Health check details.</p>
    */
    @SerializedName("HealthCheck")
    @Expose
    private TargetGroupHealthCheck HealthCheck;

    /**
    * <p>Default weight of the backend service. Among them: <ul><li>Value ranges from 0 to 100.</li><li>After setting this value, when adding a backend service to the target group, if the backend service does not set weight individually, use the default weight here.</li><li>Weight parameter settings not supported for Target Group Type v1.</li></ul></p>
    */
    @SerializedName("Weight")
    @Expose
    private Long Weight;

    /**
    * <p>Whether to enable long connections. This parameter is applicable only to HTTP/HTTPS target groups. true: off; false: on. Off by default.</p>
    */
    @SerializedName("KeepaliveEnable")
    @Expose
    private Boolean KeepaliveEnable;

    /**
    * <p>Session persistence time, unit: second. Available values: 30-3600, default 0, disabled. This parameter is not supported for TCP/UDP target group.</p>
    */
    @SerializedName("SessionExpireTime")
    @Expose
    private Long SessionExpireTime;

    /**
    * <p>Whether SNAT (source IP replacement) is enabled, True (enabled), False (disabled). Disabled by default. Note: When SnatEnable is enabled, the client source IP will be replaced. At this point, the <code>Pass through client source IP</code> option is disabled, and vice versa.</p>
    */
    @SerializedName("SnatEnable")
    @Expose
    private Boolean SnatEnable;

    /**
     * Get <p>Target group ID.</p> 
     * @return TargetGroupId <p>Target group ID.</p>
     */
    public String getTargetGroupId() {
        return this.TargetGroupId;
    }

    /**
     * Set <p>Target group ID.</p>
     * @param TargetGroupId <p>Target group ID.</p>
     */
    public void setTargetGroupId(String TargetGroupId) {
        this.TargetGroupId = TargetGroupId;
    }

    /**
     * Get <p>New name of target group. Naming rule: 1-80 English letters, Chinese characters and other internationally compatible language characters, digits, connecting line "-", underscore "_" and other common characters (Unicode supplementary characters such as emoji and rare Chinese characters are forbidden).</p> 
     * @return TargetGroupName <p>New name of target group. Naming rule: 1-80 English letters, Chinese characters and other internationally compatible language characters, digits, connecting line "-", underscore "_" and other common characters (Unicode supplementary characters such as emoji and rare Chinese characters are forbidden).</p>
     */
    public String getTargetGroupName() {
        return this.TargetGroupName;
    }

    /**
     * Set <p>New name of target group. Naming rule: 1-80 English letters, Chinese characters and other internationally compatible language characters, digits, connecting line "-", underscore "_" and other common characters (Unicode supplementary characters such as emoji and rare Chinese characters are forbidden).</p>
     * @param TargetGroupName <p>New name of target group. Naming rule: 1-80 English letters, Chinese characters and other internationally compatible language characters, digits, connecting line "-", underscore "_" and other common characters (Unicode supplementary characters such as emoji and rare Chinese characters are forbidden).</p>
     */
    public void setTargetGroupName(String TargetGroupName) {
        this.TargetGroupName = TargetGroupName;
    }

    /**
     * Get <p>New default port of target group. Full listen target group does not support this parameter.</p> 
     * @return Port <p>New default port of target group. Full listen target group does not support this parameter.</p>
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set <p>New default port of target group. Full listen target group does not support this parameter.</p>
     * @param Port <p>New default port of target group. Full listen target group does not support this parameter.</p>
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get <p>Scheduling algorithm. This parameter is valid only for new version V2 target groups with backend forwarding protocol (HTTP|HTTPS|GRPC). Available values:<br>&lt;ur&gt;<li>WRR: weighted round-robin.</li><li>LEAST_CONN: least connection.</li><li>IP_HASH: based on IP hash.</li><li>Default WRR.</li>&lt;ur&gt;</p> 
     * @return ScheduleAlgorithm <p>Scheduling algorithm. This parameter is valid only for new version V2 target groups with backend forwarding protocol (HTTP|HTTPS|GRPC). Available values:<br>&lt;ur&gt;<li>WRR: weighted round-robin.</li><li>LEAST_CONN: least connection.</li><li>IP_HASH: based on IP hash.</li><li>Default WRR.</li>&lt;ur&gt;</p>
     */
    public String getScheduleAlgorithm() {
        return this.ScheduleAlgorithm;
    }

    /**
     * Set <p>Scheduling algorithm. This parameter is valid only for new version V2 target groups with backend forwarding protocol (HTTP|HTTPS|GRPC). Available values:<br>&lt;ur&gt;<li>WRR: weighted round-robin.</li><li>LEAST_CONN: least connection.</li><li>IP_HASH: based on IP hash.</li><li>Default WRR.</li>&lt;ur&gt;</p>
     * @param ScheduleAlgorithm <p>Scheduling algorithm. This parameter is valid only for new version V2 target groups with backend forwarding protocol (HTTP|HTTPS|GRPC). Available values:<br>&lt;ur&gt;<li>WRR: weighted round-robin.</li><li>LEAST_CONN: least connection.</li><li>IP_HASH: based on IP hash.</li><li>Default WRR.</li>&lt;ur&gt;</p>
     */
    public void setScheduleAlgorithm(String ScheduleAlgorithm) {
        this.ScheduleAlgorithm = ScheduleAlgorithm;
    }

    /**
     * Get <p>Health check details.</p> 
     * @return HealthCheck <p>Health check details.</p>
     */
    public TargetGroupHealthCheck getHealthCheck() {
        return this.HealthCheck;
    }

    /**
     * Set <p>Health check details.</p>
     * @param HealthCheck <p>Health check details.</p>
     */
    public void setHealthCheck(TargetGroupHealthCheck HealthCheck) {
        this.HealthCheck = HealthCheck;
    }

    /**
     * Get <p>Default weight of the backend service. Among them: <ul><li>Value ranges from 0 to 100.</li><li>After setting this value, when adding a backend service to the target group, if the backend service does not set weight individually, use the default weight here.</li><li>Weight parameter settings not supported for Target Group Type v1.</li></ul></p> 
     * @return Weight <p>Default weight of the backend service. Among them: <ul><li>Value ranges from 0 to 100.</li><li>After setting this value, when adding a backend service to the target group, if the backend service does not set weight individually, use the default weight here.</li><li>Weight parameter settings not supported for Target Group Type v1.</li></ul></p>
     */
    public Long getWeight() {
        return this.Weight;
    }

    /**
     * Set <p>Default weight of the backend service. Among them: <ul><li>Value ranges from 0 to 100.</li><li>After setting this value, when adding a backend service to the target group, if the backend service does not set weight individually, use the default weight here.</li><li>Weight parameter settings not supported for Target Group Type v1.</li></ul></p>
     * @param Weight <p>Default weight of the backend service. Among them: <ul><li>Value ranges from 0 to 100.</li><li>After setting this value, when adding a backend service to the target group, if the backend service does not set weight individually, use the default weight here.</li><li>Weight parameter settings not supported for Target Group Type v1.</li></ul></p>
     */
    public void setWeight(Long Weight) {
        this.Weight = Weight;
    }

    /**
     * Get <p>Whether to enable long connections. This parameter is applicable only to HTTP/HTTPS target groups. true: off; false: on. Off by default.</p> 
     * @return KeepaliveEnable <p>Whether to enable long connections. This parameter is applicable only to HTTP/HTTPS target groups. true: off; false: on. Off by default.</p>
     */
    public Boolean getKeepaliveEnable() {
        return this.KeepaliveEnable;
    }

    /**
     * Set <p>Whether to enable long connections. This parameter is applicable only to HTTP/HTTPS target groups. true: off; false: on. Off by default.</p>
     * @param KeepaliveEnable <p>Whether to enable long connections. This parameter is applicable only to HTTP/HTTPS target groups. true: off; false: on. Off by default.</p>
     */
    public void setKeepaliveEnable(Boolean KeepaliveEnable) {
        this.KeepaliveEnable = KeepaliveEnable;
    }

    /**
     * Get <p>Session persistence time, unit: second. Available values: 30-3600, default 0, disabled. This parameter is not supported for TCP/UDP target group.</p> 
     * @return SessionExpireTime <p>Session persistence time, unit: second. Available values: 30-3600, default 0, disabled. This parameter is not supported for TCP/UDP target group.</p>
     */
    public Long getSessionExpireTime() {
        return this.SessionExpireTime;
    }

    /**
     * Set <p>Session persistence time, unit: second. Available values: 30-3600, default 0, disabled. This parameter is not supported for TCP/UDP target group.</p>
     * @param SessionExpireTime <p>Session persistence time, unit: second. Available values: 30-3600, default 0, disabled. This parameter is not supported for TCP/UDP target group.</p>
     */
    public void setSessionExpireTime(Long SessionExpireTime) {
        this.SessionExpireTime = SessionExpireTime;
    }

    /**
     * Get <p>Whether SNAT (source IP replacement) is enabled, True (enabled), False (disabled). Disabled by default. Note: When SnatEnable is enabled, the client source IP will be replaced. At this point, the <code>Pass through client source IP</code> option is disabled, and vice versa.</p> 
     * @return SnatEnable <p>Whether SNAT (source IP replacement) is enabled, True (enabled), False (disabled). Disabled by default. Note: When SnatEnable is enabled, the client source IP will be replaced. At this point, the <code>Pass through client source IP</code> option is disabled, and vice versa.</p>
     */
    public Boolean getSnatEnable() {
        return this.SnatEnable;
    }

    /**
     * Set <p>Whether SNAT (source IP replacement) is enabled, True (enabled), False (disabled). Disabled by default. Note: When SnatEnable is enabled, the client source IP will be replaced. At this point, the <code>Pass through client source IP</code> option is disabled, and vice versa.</p>
     * @param SnatEnable <p>Whether SNAT (source IP replacement) is enabled, True (enabled), False (disabled). Disabled by default. Note: When SnatEnable is enabled, the client source IP will be replaced. At this point, the <code>Pass through client source IP</code> option is disabled, and vice versa.</p>
     */
    public void setSnatEnable(Boolean SnatEnable) {
        this.SnatEnable = SnatEnable;
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
        if (source.SnatEnable != null) {
            this.SnatEnable = new Boolean(source.SnatEnable);
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
        this.setParamSimple(map, prefix + "SnatEnable", this.SnatEnable);

    }
}

