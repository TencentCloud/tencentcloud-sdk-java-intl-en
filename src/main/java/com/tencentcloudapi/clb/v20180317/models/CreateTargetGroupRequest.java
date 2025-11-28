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

public class CreateTargetGroupRequest extends AbstractModel {

    /**
    * Target group name (up to 50 characters)
    */
    @SerializedName("TargetGroupName")
    @Expose
    private String TargetGroupName;

    /**
    * Specifies the vpc id attribute of the target group. uses the default vpc if left empty.
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * Specifies the default Port of the target group. the default Port can be used when servers are added subsequently. this parameter is not supported for full-listen target groups. for non-full-listen target groups, either Port or Port in TargetGroupInstances.N is required.

    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * Specifies the real servers bound to the target group. supports up to 50 at a time.
    */
    @SerializedName("TargetGroupInstances")
    @Expose
    private TargetGroupInstance [] TargetGroupInstances;

    /**
    * Target group type, currently supported v1 (legacy version target group) and v2 (new version target group), defaults to v1 (legacy version target group).
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Backend forwarding protocol of the target group. this field is required for the new version (v2) target group. currently supports TCP, UDP, HTTP, HTTPS, GRPC.
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * Health check.
    */
    @SerializedName("HealthCheck")
    @Expose
    private TargetGroupHealthCheck HealthCheck;

    /**
    * Scheduling algorithm. this parameter is valid only for target groups of the new version V2 when the backend forwarding protocol is HTTP, HTTPS, or GRPC. available values:.
<ur><li>WRR: weighted round-robin.</li><li>LEAST_CONN: LEAST connection.</li><li>IP_HASH: based on IP HASH.</li><li>default is WRR.</li></ur>.
    */
    @SerializedName("ScheduleAlgorithm")
    @Expose
    private String ScheduleAlgorithm;

    /**
    * Tag.
    */
    @SerializedName("Tags")
    @Expose
    private TagInfo [] Tags;

    /**
    * Specifies the default weight of the backend service. among them:.
<ul><li>Value ranges from 0 to 100.</li><li>after setting this value, when adding a backend service to the target group, if the backend service does not set Weight separately, use the default Weight here.</li><li>Weight parameter settings not supported for v1 target group type.</li></ul>.
    */
    @SerializedName("Weight")
    @Expose
    private Long Weight;

    /**
    * Full listen target group flag. valid values: true (yes), false (no). only target groups of the new version V2 event type support this parameter.
    */
    @SerializedName("FullListenSwitch")
    @Expose
    private Boolean FullListenSwitch;

    /**
    * Specifies whether to enable the persistent connection feature. this parameter applies only to HTTP and HTTPS target groups. 0: disable; 1: enable. this feature is off by default.
    */
    @SerializedName("KeepaliveEnable")
    @Expose
    private Boolean KeepaliveEnable;

    /**
    * Session hold time, unit: second. value range: 30-3600. default: 0, disabled. this parameter is supported only for target groups with HTTP/HTTPS/GRPC backend forwarding protocol in the new version V2.
    */
    @SerializedName("SessionExpireTime")
    @Expose
    private Long SessionExpireTime;

    /**
    * IP version type.
    */
    @SerializedName("IpVersion")
    @Expose
    private String IpVersion;

    /**
     * Get Target group name (up to 50 characters) 
     * @return TargetGroupName Target group name (up to 50 characters)
     */
    public String getTargetGroupName() {
        return this.TargetGroupName;
    }

    /**
     * Set Target group name (up to 50 characters)
     * @param TargetGroupName Target group name (up to 50 characters)
     */
    public void setTargetGroupName(String TargetGroupName) {
        this.TargetGroupName = TargetGroupName;
    }

    /**
     * Get Specifies the vpc id attribute of the target group. uses the default vpc if left empty. 
     * @return VpcId Specifies the vpc id attribute of the target group. uses the default vpc if left empty.
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set Specifies the vpc id attribute of the target group. uses the default vpc if left empty.
     * @param VpcId Specifies the vpc id attribute of the target group. uses the default vpc if left empty.
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get Specifies the default Port of the target group. the default Port can be used when servers are added subsequently. this parameter is not supported for full-listen target groups. for non-full-listen target groups, either Port or Port in TargetGroupInstances.N is required.
 
     * @return Port Specifies the default Port of the target group. the default Port can be used when servers are added subsequently. this parameter is not supported for full-listen target groups. for non-full-listen target groups, either Port or Port in TargetGroupInstances.N is required.

     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set Specifies the default Port of the target group. the default Port can be used when servers are added subsequently. this parameter is not supported for full-listen target groups. for non-full-listen target groups, either Port or Port in TargetGroupInstances.N is required.

     * @param Port Specifies the default Port of the target group. the default Port can be used when servers are added subsequently. this parameter is not supported for full-listen target groups. for non-full-listen target groups, either Port or Port in TargetGroupInstances.N is required.

     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get Specifies the real servers bound to the target group. supports up to 50 at a time. 
     * @return TargetGroupInstances Specifies the real servers bound to the target group. supports up to 50 at a time.
     */
    public TargetGroupInstance [] getTargetGroupInstances() {
        return this.TargetGroupInstances;
    }

    /**
     * Set Specifies the real servers bound to the target group. supports up to 50 at a time.
     * @param TargetGroupInstances Specifies the real servers bound to the target group. supports up to 50 at a time.
     */
    public void setTargetGroupInstances(TargetGroupInstance [] TargetGroupInstances) {
        this.TargetGroupInstances = TargetGroupInstances;
    }

    /**
     * Get Target group type, currently supported v1 (legacy version target group) and v2 (new version target group), defaults to v1 (legacy version target group). 
     * @return Type Target group type, currently supported v1 (legacy version target group) and v2 (new version target group), defaults to v1 (legacy version target group).
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Target group type, currently supported v1 (legacy version target group) and v2 (new version target group), defaults to v1 (legacy version target group).
     * @param Type Target group type, currently supported v1 (legacy version target group) and v2 (new version target group), defaults to v1 (legacy version target group).
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Backend forwarding protocol of the target group. this field is required for the new version (v2) target group. currently supports TCP, UDP, HTTP, HTTPS, GRPC. 
     * @return Protocol Backend forwarding protocol of the target group. this field is required for the new version (v2) target group. currently supports TCP, UDP, HTTP, HTTPS, GRPC.
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set Backend forwarding protocol of the target group. this field is required for the new version (v2) target group. currently supports TCP, UDP, HTTP, HTTPS, GRPC.
     * @param Protocol Backend forwarding protocol of the target group. this field is required for the new version (v2) target group. currently supports TCP, UDP, HTTP, HTTPS, GRPC.
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get Health check. 
     * @return HealthCheck Health check.
     */
    public TargetGroupHealthCheck getHealthCheck() {
        return this.HealthCheck;
    }

    /**
     * Set Health check.
     * @param HealthCheck Health check.
     */
    public void setHealthCheck(TargetGroupHealthCheck HealthCheck) {
        this.HealthCheck = HealthCheck;
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
     * Get Tag. 
     * @return Tags Tag.
     */
    public TagInfo [] getTags() {
        return this.Tags;
    }

    /**
     * Set Tag.
     * @param Tags Tag.
     */
    public void setTags(TagInfo [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get Specifies the default weight of the backend service. among them:.
<ul><li>Value ranges from 0 to 100.</li><li>after setting this value, when adding a backend service to the target group, if the backend service does not set Weight separately, use the default Weight here.</li><li>Weight parameter settings not supported for v1 target group type.</li></ul>. 
     * @return Weight Specifies the default weight of the backend service. among them:.
<ul><li>Value ranges from 0 to 100.</li><li>after setting this value, when adding a backend service to the target group, if the backend service does not set Weight separately, use the default Weight here.</li><li>Weight parameter settings not supported for v1 target group type.</li></ul>.
     */
    public Long getWeight() {
        return this.Weight;
    }

    /**
     * Set Specifies the default weight of the backend service. among them:.
<ul><li>Value ranges from 0 to 100.</li><li>after setting this value, when adding a backend service to the target group, if the backend service does not set Weight separately, use the default Weight here.</li><li>Weight parameter settings not supported for v1 target group type.</li></ul>.
     * @param Weight Specifies the default weight of the backend service. among them:.
<ul><li>Value ranges from 0 to 100.</li><li>after setting this value, when adding a backend service to the target group, if the backend service does not set Weight separately, use the default Weight here.</li><li>Weight parameter settings not supported for v1 target group type.</li></ul>.
     */
    public void setWeight(Long Weight) {
        this.Weight = Weight;
    }

    /**
     * Get Full listen target group flag. valid values: true (yes), false (no). only target groups of the new version V2 event type support this parameter. 
     * @return FullListenSwitch Full listen target group flag. valid values: true (yes), false (no). only target groups of the new version V2 event type support this parameter.
     */
    public Boolean getFullListenSwitch() {
        return this.FullListenSwitch;
    }

    /**
     * Set Full listen target group flag. valid values: true (yes), false (no). only target groups of the new version V2 event type support this parameter.
     * @param FullListenSwitch Full listen target group flag. valid values: true (yes), false (no). only target groups of the new version V2 event type support this parameter.
     */
    public void setFullListenSwitch(Boolean FullListenSwitch) {
        this.FullListenSwitch = FullListenSwitch;
    }

    /**
     * Get Specifies whether to enable the persistent connection feature. this parameter applies only to HTTP and HTTPS target groups. 0: disable; 1: enable. this feature is off by default. 
     * @return KeepaliveEnable Specifies whether to enable the persistent connection feature. this parameter applies only to HTTP and HTTPS target groups. 0: disable; 1: enable. this feature is off by default.
     */
    public Boolean getKeepaliveEnable() {
        return this.KeepaliveEnable;
    }

    /**
     * Set Specifies whether to enable the persistent connection feature. this parameter applies only to HTTP and HTTPS target groups. 0: disable; 1: enable. this feature is off by default.
     * @param KeepaliveEnable Specifies whether to enable the persistent connection feature. this parameter applies only to HTTP and HTTPS target groups. 0: disable; 1: enable. this feature is off by default.
     */
    public void setKeepaliveEnable(Boolean KeepaliveEnable) {
        this.KeepaliveEnable = KeepaliveEnable;
    }

    /**
     * Get Session hold time, unit: second. value range: 30-3600. default: 0, disabled. this parameter is supported only for target groups with HTTP/HTTPS/GRPC backend forwarding protocol in the new version V2. 
     * @return SessionExpireTime Session hold time, unit: second. value range: 30-3600. default: 0, disabled. this parameter is supported only for target groups with HTTP/HTTPS/GRPC backend forwarding protocol in the new version V2.
     */
    public Long getSessionExpireTime() {
        return this.SessionExpireTime;
    }

    /**
     * Set Session hold time, unit: second. value range: 30-3600. default: 0, disabled. this parameter is supported only for target groups with HTTP/HTTPS/GRPC backend forwarding protocol in the new version V2.
     * @param SessionExpireTime Session hold time, unit: second. value range: 30-3600. default: 0, disabled. this parameter is supported only for target groups with HTTP/HTTPS/GRPC backend forwarding protocol in the new version V2.
     */
    public void setSessionExpireTime(Long SessionExpireTime) {
        this.SessionExpireTime = SessionExpireTime;
    }

    /**
     * Get IP version type. 
     * @return IpVersion IP version type.
     */
    public String getIpVersion() {
        return this.IpVersion;
    }

    /**
     * Set IP version type.
     * @param IpVersion IP version type.
     */
    public void setIpVersion(String IpVersion) {
        this.IpVersion = IpVersion;
    }

    public CreateTargetGroupRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateTargetGroupRequest(CreateTargetGroupRequest source) {
        if (source.TargetGroupName != null) {
            this.TargetGroupName = new String(source.TargetGroupName);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.Port != null) {
            this.Port = new Long(source.Port);
        }
        if (source.TargetGroupInstances != null) {
            this.TargetGroupInstances = new TargetGroupInstance[source.TargetGroupInstances.length];
            for (int i = 0; i < source.TargetGroupInstances.length; i++) {
                this.TargetGroupInstances[i] = new TargetGroupInstance(source.TargetGroupInstances[i]);
            }
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.HealthCheck != null) {
            this.HealthCheck = new TargetGroupHealthCheck(source.HealthCheck);
        }
        if (source.ScheduleAlgorithm != null) {
            this.ScheduleAlgorithm = new String(source.ScheduleAlgorithm);
        }
        if (source.Tags != null) {
            this.Tags = new TagInfo[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new TagInfo(source.Tags[i]);
            }
        }
        if (source.Weight != null) {
            this.Weight = new Long(source.Weight);
        }
        if (source.FullListenSwitch != null) {
            this.FullListenSwitch = new Boolean(source.FullListenSwitch);
        }
        if (source.KeepaliveEnable != null) {
            this.KeepaliveEnable = new Boolean(source.KeepaliveEnable);
        }
        if (source.SessionExpireTime != null) {
            this.SessionExpireTime = new Long(source.SessionExpireTime);
        }
        if (source.IpVersion != null) {
            this.IpVersion = new String(source.IpVersion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TargetGroupName", this.TargetGroupName);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamArrayObj(map, prefix + "TargetGroupInstances.", this.TargetGroupInstances);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamObj(map, prefix + "HealthCheck.", this.HealthCheck);
        this.setParamSimple(map, prefix + "ScheduleAlgorithm", this.ScheduleAlgorithm);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "Weight", this.Weight);
        this.setParamSimple(map, prefix + "FullListenSwitch", this.FullListenSwitch);
        this.setParamSimple(map, prefix + "KeepaliveEnable", this.KeepaliveEnable);
        this.setParamSimple(map, prefix + "SessionExpireTime", this.SessionExpireTime);
        this.setParamSimple(map, prefix + "IpVersion", this.IpVersion);

    }
}

