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
    * <p>Target group name. Naming rule: 1-80 English letters, Chinese characters and other internationally compatible language characters, digits, connecting line "-", underscore "_" and other common characters (Unicode supplementary characters such as emoji and rare Chinese characters are forbidden).</p>
    */
    @SerializedName("TargetGroupName")
    @Expose
    private String TargetGroupName;

    /**
    * <p>The vpcId attribute of the target group. Leave it blank to use the default VPC.</p>
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * <p>Default port of target group. Default port can be used when servers are added subsequently. Full listen target group does not support this parameter. For non-full listen target group, either Port or port in TargetGroupInstances.N is required.</p>
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * <p>The target group supports up to 50 real servers bound to it.</p>
    */
    @SerializedName("TargetGroupInstances")
    @Expose
    private TargetGroupInstance [] TargetGroupInstances;

    /**
    * <p>Target Group Type, currently supported v1 (legacy version target group), v2 (new version target group), defaults to v1 (legacy version target group).</p>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>Backend forwarding protocol of the target group. This field is required for the new version target group v2. Currently supports TCP, UDP, HTTP, HTTPS, GRPC.</p>
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * <p>Health check.</p>
    */
    @SerializedName("HealthCheck")
    @Expose
    private TargetGroupHealthCheck HealthCheck;

    /**
    * <p>Scheduling algorithm. This parameter is valid only for new version V2 target groups with backend forwarding protocol (HTTP|HTTPS|GRPC). Available values:</p><li>WRR: weighted round-robin.</li><li>LEAST_CONN: least connection.</li><li>IP_HASH: based on IP hash.</li><li>Default WRR.</li>
    */
    @SerializedName("ScheduleAlgorithm")
    @Expose
    private String ScheduleAlgorithm;

    /**
    * <p>Tag.</p>
    */
    @SerializedName("Tags")
    @Expose
    private TagInfo [] Tags;

    /**
    * <p>Default weight of the backend service, where:</p><ul><li>Value ranges from 0 to 100.</li><li>After setting this value, when adding a backend service to the target group, if the backend service does not set the weight separately, use the default weight here.</li><li>Weight parameter settings not supported for v1 target group type.</li></ul>
    */
    @SerializedName("Weight")
    @Expose
    private Long Weight;

    /**
    * <p>Full listen target group flag. true: yes, false: no. Only target groups of the new version V2 support this parameter.</p>
    */
    @SerializedName("FullListenSwitch")
    @Expose
    private Boolean FullListenSwitch;

    /**
    * <p>Whether to enable long connections. This parameter is applicable only to HTTP/HTTPS target groups. 0: off; 1: on. Off by default.</p>
    */
    @SerializedName("KeepaliveEnable")
    @Expose
    private Boolean KeepaliveEnable;

    /**
    * <p>Session persistence time, unit: second. Available values: 30-3600, default 0, disabled. This parameter is supported only for target groups with HTTP/HTTPS/GRPC backend forwarding protocol in the new version V2.</p>
    */
    @SerializedName("SessionExpireTime")
    @Expose
    private Long SessionExpireTime;

    /**
    * <p>IP version type.</p>
    */
    @SerializedName("IpVersion")
    @Expose
    private String IpVersion;

    /**
    * <p>Whether SNAT (source IP replacement) is enabled, True (enabled), False (disabled). Disabled by default. Note: When SnatEnable is enabled, the client source IP will be replaced. At this point, the <code>Pass through client source IP</code> option is disabled, and vice versa.</p>
    */
    @SerializedName("SnatEnable")
    @Expose
    private Boolean SnatEnable;

    /**
     * Get <p>Target group name. Naming rule: 1-80 English letters, Chinese characters and other internationally compatible language characters, digits, connecting line "-", underscore "_" and other common characters (Unicode supplementary characters such as emoji and rare Chinese characters are forbidden).</p> 
     * @return TargetGroupName <p>Target group name. Naming rule: 1-80 English letters, Chinese characters and other internationally compatible language characters, digits, connecting line "-", underscore "_" and other common characters (Unicode supplementary characters such as emoji and rare Chinese characters are forbidden).</p>
     */
    public String getTargetGroupName() {
        return this.TargetGroupName;
    }

    /**
     * Set <p>Target group name. Naming rule: 1-80 English letters, Chinese characters and other internationally compatible language characters, digits, connecting line "-", underscore "_" and other common characters (Unicode supplementary characters such as emoji and rare Chinese characters are forbidden).</p>
     * @param TargetGroupName <p>Target group name. Naming rule: 1-80 English letters, Chinese characters and other internationally compatible language characters, digits, connecting line "-", underscore "_" and other common characters (Unicode supplementary characters such as emoji and rare Chinese characters are forbidden).</p>
     */
    public void setTargetGroupName(String TargetGroupName) {
        this.TargetGroupName = TargetGroupName;
    }

    /**
     * Get <p>The vpcId attribute of the target group. Leave it blank to use the default VPC.</p> 
     * @return VpcId <p>The vpcId attribute of the target group. Leave it blank to use the default VPC.</p>
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set <p>The vpcId attribute of the target group. Leave it blank to use the default VPC.</p>
     * @param VpcId <p>The vpcId attribute of the target group. Leave it blank to use the default VPC.</p>
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get <p>Default port of target group. Default port can be used when servers are added subsequently. Full listen target group does not support this parameter. For non-full listen target group, either Port or port in TargetGroupInstances.N is required.</p> 
     * @return Port <p>Default port of target group. Default port can be used when servers are added subsequently. Full listen target group does not support this parameter. For non-full listen target group, either Port or port in TargetGroupInstances.N is required.</p>
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set <p>Default port of target group. Default port can be used when servers are added subsequently. Full listen target group does not support this parameter. For non-full listen target group, either Port or port in TargetGroupInstances.N is required.</p>
     * @param Port <p>Default port of target group. Default port can be used when servers are added subsequently. Full listen target group does not support this parameter. For non-full listen target group, either Port or port in TargetGroupInstances.N is required.</p>
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get <p>The target group supports up to 50 real servers bound to it.</p> 
     * @return TargetGroupInstances <p>The target group supports up to 50 real servers bound to it.</p>
     */
    public TargetGroupInstance [] getTargetGroupInstances() {
        return this.TargetGroupInstances;
    }

    /**
     * Set <p>The target group supports up to 50 real servers bound to it.</p>
     * @param TargetGroupInstances <p>The target group supports up to 50 real servers bound to it.</p>
     */
    public void setTargetGroupInstances(TargetGroupInstance [] TargetGroupInstances) {
        this.TargetGroupInstances = TargetGroupInstances;
    }

    /**
     * Get <p>Target Group Type, currently supported v1 (legacy version target group), v2 (new version target group), defaults to v1 (legacy version target group).</p> 
     * @return Type <p>Target Group Type, currently supported v1 (legacy version target group), v2 (new version target group), defaults to v1 (legacy version target group).</p>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>Target Group Type, currently supported v1 (legacy version target group), v2 (new version target group), defaults to v1 (legacy version target group).</p>
     * @param Type <p>Target Group Type, currently supported v1 (legacy version target group), v2 (new version target group), defaults to v1 (legacy version target group).</p>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>Backend forwarding protocol of the target group. This field is required for the new version target group v2. Currently supports TCP, UDP, HTTP, HTTPS, GRPC.</p> 
     * @return Protocol <p>Backend forwarding protocol of the target group. This field is required for the new version target group v2. Currently supports TCP, UDP, HTTP, HTTPS, GRPC.</p>
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set <p>Backend forwarding protocol of the target group. This field is required for the new version target group v2. Currently supports TCP, UDP, HTTP, HTTPS, GRPC.</p>
     * @param Protocol <p>Backend forwarding protocol of the target group. This field is required for the new version target group v2. Currently supports TCP, UDP, HTTP, HTTPS, GRPC.</p>
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get <p>Health check.</p> 
     * @return HealthCheck <p>Health check.</p>
     */
    public TargetGroupHealthCheck getHealthCheck() {
        return this.HealthCheck;
    }

    /**
     * Set <p>Health check.</p>
     * @param HealthCheck <p>Health check.</p>
     */
    public void setHealthCheck(TargetGroupHealthCheck HealthCheck) {
        this.HealthCheck = HealthCheck;
    }

    /**
     * Get <p>Scheduling algorithm. This parameter is valid only for new version V2 target groups with backend forwarding protocol (HTTP|HTTPS|GRPC). Available values:</p><li>WRR: weighted round-robin.</li><li>LEAST_CONN: least connection.</li><li>IP_HASH: based on IP hash.</li><li>Default WRR.</li> 
     * @return ScheduleAlgorithm <p>Scheduling algorithm. This parameter is valid only for new version V2 target groups with backend forwarding protocol (HTTP|HTTPS|GRPC). Available values:</p><li>WRR: weighted round-robin.</li><li>LEAST_CONN: least connection.</li><li>IP_HASH: based on IP hash.</li><li>Default WRR.</li>
     */
    public String getScheduleAlgorithm() {
        return this.ScheduleAlgorithm;
    }

    /**
     * Set <p>Scheduling algorithm. This parameter is valid only for new version V2 target groups with backend forwarding protocol (HTTP|HTTPS|GRPC). Available values:</p><li>WRR: weighted round-robin.</li><li>LEAST_CONN: least connection.</li><li>IP_HASH: based on IP hash.</li><li>Default WRR.</li>
     * @param ScheduleAlgorithm <p>Scheduling algorithm. This parameter is valid only for new version V2 target groups with backend forwarding protocol (HTTP|HTTPS|GRPC). Available values:</p><li>WRR: weighted round-robin.</li><li>LEAST_CONN: least connection.</li><li>IP_HASH: based on IP hash.</li><li>Default WRR.</li>
     */
    public void setScheduleAlgorithm(String ScheduleAlgorithm) {
        this.ScheduleAlgorithm = ScheduleAlgorithm;
    }

    /**
     * Get <p>Tag.</p> 
     * @return Tags <p>Tag.</p>
     */
    public TagInfo [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>Tag.</p>
     * @param Tags <p>Tag.</p>
     */
    public void setTags(TagInfo [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get <p>Default weight of the backend service, where:</p><ul><li>Value ranges from 0 to 100.</li><li>After setting this value, when adding a backend service to the target group, if the backend service does not set the weight separately, use the default weight here.</li><li>Weight parameter settings not supported for v1 target group type.</li></ul> 
     * @return Weight <p>Default weight of the backend service, where:</p><ul><li>Value ranges from 0 to 100.</li><li>After setting this value, when adding a backend service to the target group, if the backend service does not set the weight separately, use the default weight here.</li><li>Weight parameter settings not supported for v1 target group type.</li></ul>
     */
    public Long getWeight() {
        return this.Weight;
    }

    /**
     * Set <p>Default weight of the backend service, where:</p><ul><li>Value ranges from 0 to 100.</li><li>After setting this value, when adding a backend service to the target group, if the backend service does not set the weight separately, use the default weight here.</li><li>Weight parameter settings not supported for v1 target group type.</li></ul>
     * @param Weight <p>Default weight of the backend service, where:</p><ul><li>Value ranges from 0 to 100.</li><li>After setting this value, when adding a backend service to the target group, if the backend service does not set the weight separately, use the default weight here.</li><li>Weight parameter settings not supported for v1 target group type.</li></ul>
     */
    public void setWeight(Long Weight) {
        this.Weight = Weight;
    }

    /**
     * Get <p>Full listen target group flag. true: yes, false: no. Only target groups of the new version V2 support this parameter.</p> 
     * @return FullListenSwitch <p>Full listen target group flag. true: yes, false: no. Only target groups of the new version V2 support this parameter.</p>
     */
    public Boolean getFullListenSwitch() {
        return this.FullListenSwitch;
    }

    /**
     * Set <p>Full listen target group flag. true: yes, false: no. Only target groups of the new version V2 support this parameter.</p>
     * @param FullListenSwitch <p>Full listen target group flag. true: yes, false: no. Only target groups of the new version V2 support this parameter.</p>
     */
    public void setFullListenSwitch(Boolean FullListenSwitch) {
        this.FullListenSwitch = FullListenSwitch;
    }

    /**
     * Get <p>Whether to enable long connections. This parameter is applicable only to HTTP/HTTPS target groups. 0: off; 1: on. Off by default.</p> 
     * @return KeepaliveEnable <p>Whether to enable long connections. This parameter is applicable only to HTTP/HTTPS target groups. 0: off; 1: on. Off by default.</p>
     */
    public Boolean getKeepaliveEnable() {
        return this.KeepaliveEnable;
    }

    /**
     * Set <p>Whether to enable long connections. This parameter is applicable only to HTTP/HTTPS target groups. 0: off; 1: on. Off by default.</p>
     * @param KeepaliveEnable <p>Whether to enable long connections. This parameter is applicable only to HTTP/HTTPS target groups. 0: off; 1: on. Off by default.</p>
     */
    public void setKeepaliveEnable(Boolean KeepaliveEnable) {
        this.KeepaliveEnable = KeepaliveEnable;
    }

    /**
     * Get <p>Session persistence time, unit: second. Available values: 30-3600, default 0, disabled. This parameter is supported only for target groups with HTTP/HTTPS/GRPC backend forwarding protocol in the new version V2.</p> 
     * @return SessionExpireTime <p>Session persistence time, unit: second. Available values: 30-3600, default 0, disabled. This parameter is supported only for target groups with HTTP/HTTPS/GRPC backend forwarding protocol in the new version V2.</p>
     */
    public Long getSessionExpireTime() {
        return this.SessionExpireTime;
    }

    /**
     * Set <p>Session persistence time, unit: second. Available values: 30-3600, default 0, disabled. This parameter is supported only for target groups with HTTP/HTTPS/GRPC backend forwarding protocol in the new version V2.</p>
     * @param SessionExpireTime <p>Session persistence time, unit: second. Available values: 30-3600, default 0, disabled. This parameter is supported only for target groups with HTTP/HTTPS/GRPC backend forwarding protocol in the new version V2.</p>
     */
    public void setSessionExpireTime(Long SessionExpireTime) {
        this.SessionExpireTime = SessionExpireTime;
    }

    /**
     * Get <p>IP version type.</p> 
     * @return IpVersion <p>IP version type.</p>
     */
    public String getIpVersion() {
        return this.IpVersion;
    }

    /**
     * Set <p>IP version type.</p>
     * @param IpVersion <p>IP version type.</p>
     */
    public void setIpVersion(String IpVersion) {
        this.IpVersion = IpVersion;
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
        if (source.SnatEnable != null) {
            this.SnatEnable = new Boolean(source.SnatEnable);
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
        this.setParamSimple(map, prefix + "SnatEnable", this.SnatEnable);

    }
}

