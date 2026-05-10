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
package com.tencentcloudapi.gwlb.v20240906.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateTargetGroupRequest extends AbstractModel {

    /**
    * Target group name, limited to 60 characters.
    */
    @SerializedName("TargetGroupName")
    @Expose
    private String TargetGroupName;

    /**
    * VPCID attribute of target group. If this parameter is left blank, the default VPC will be used.
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * Default port of the target group, which can be used when servers are added later. Either 'Port' or 'TargetGroupInstances.N.port' must be filled in.
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * Real server bound to a target group
    */
    @SerializedName("TargetGroupInstances")
    @Expose
    private TargetGroupInstance [] TargetGroupInstances;

    /**
    * GWLB target group protocol.
- TENCENT_GENEVE: GENEVE standard protocol

- AWS_GENEVE: GENEVE compatibility protocol (a ticket is required for allowlisting)
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * Health check settings.
    */
    @SerializedName("HealthCheck")
    @Expose
    private TargetGroupHealthCheck HealthCheck;

    /**
    * Load balancing algorithm.
- IP_HASH_3_ELASTIC: elastic hashing
    */
    @SerializedName("ScheduleAlgorithm")
    @Expose
    private String ScheduleAlgorithm;

    /**
    * Whether "All Dead, All Alive" is supported. It is supported by default.
    */
    @SerializedName("AllDeadToAlive")
    @Expose
    private Boolean AllDeadToAlive;

    /**
    * Tags
    */
    @SerializedName("Tags")
    @Expose
    private TagInfo [] Tags;

    /**
    * Traffic Distribution Mode
<ul>
<li>STATELESS: Stateless</li>
<li>STATEFUL: Stateful</li>
</ul>
    */
    @SerializedName("ForwardingMode")
    @Expose
    private String ForwardingMode;

    /**
    * <p>Switch for unbinding backend services in the rescheduling function. When enabled, unbinding backend services will trigger rescheduling.</p>
    */
    @SerializedName("RescheduleUnbindRs")
    @Expose
    private Boolean RescheduleUnbindRs;

    /**
    * <p>The time to enable rescheduling after unbinding RS, configurable from 0s to 3600s, with a default value of 0s</p>
    */
    @SerializedName("RescheduleUnbindRsStartTime")
    @Expose
    private Long RescheduleUnbindRsStartTime;

    /**
    * <p>Switch for backend service health detection exception in the rescheduling function. When enabled, abnormal health checks of backend services will trigger rescheduling.</p>
    */
    @SerializedName("RescheduleUnhealthy")
    @Expose
    private Boolean RescheduleUnhealthy;

    /**
    * <p>The waiting time to enable rescheduling after abnormal health detection of backend services, configurable from 0s to 3600s, default is 0s</p>
    */
    @SerializedName("RescheduleUnhealthyStartTime")
    @Expose
    private Long RescheduleUnhealthyStartTime;

    /**
     * Get Target group name, limited to 60 characters. 
     * @return TargetGroupName Target group name, limited to 60 characters.
     */
    public String getTargetGroupName() {
        return this.TargetGroupName;
    }

    /**
     * Set Target group name, limited to 60 characters.
     * @param TargetGroupName Target group name, limited to 60 characters.
     */
    public void setTargetGroupName(String TargetGroupName) {
        this.TargetGroupName = TargetGroupName;
    }

    /**
     * Get VPCID attribute of target group. If this parameter is left blank, the default VPC will be used. 
     * @return VpcId VPCID attribute of target group. If this parameter is left blank, the default VPC will be used.
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set VPCID attribute of target group. If this parameter is left blank, the default VPC will be used.
     * @param VpcId VPCID attribute of target group. If this parameter is left blank, the default VPC will be used.
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get Default port of the target group, which can be used when servers are added later. Either 'Port' or 'TargetGroupInstances.N.port' must be filled in. 
     * @return Port Default port of the target group, which can be used when servers are added later. Either 'Port' or 'TargetGroupInstances.N.port' must be filled in.
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set Default port of the target group, which can be used when servers are added later. Either 'Port' or 'TargetGroupInstances.N.port' must be filled in.
     * @param Port Default port of the target group, which can be used when servers are added later. Either 'Port' or 'TargetGroupInstances.N.port' must be filled in.
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get Real server bound to a target group 
     * @return TargetGroupInstances Real server bound to a target group
     */
    public TargetGroupInstance [] getTargetGroupInstances() {
        return this.TargetGroupInstances;
    }

    /**
     * Set Real server bound to a target group
     * @param TargetGroupInstances Real server bound to a target group
     */
    public void setTargetGroupInstances(TargetGroupInstance [] TargetGroupInstances) {
        this.TargetGroupInstances = TargetGroupInstances;
    }

    /**
     * Get GWLB target group protocol.
- TENCENT_GENEVE: GENEVE standard protocol

- AWS_GENEVE: GENEVE compatibility protocol (a ticket is required for allowlisting) 
     * @return Protocol GWLB target group protocol.
- TENCENT_GENEVE: GENEVE standard protocol

- AWS_GENEVE: GENEVE compatibility protocol (a ticket is required for allowlisting)
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set GWLB target group protocol.
- TENCENT_GENEVE: GENEVE standard protocol

- AWS_GENEVE: GENEVE compatibility protocol (a ticket is required for allowlisting)
     * @param Protocol GWLB target group protocol.
- TENCENT_GENEVE: GENEVE standard protocol

- AWS_GENEVE: GENEVE compatibility protocol (a ticket is required for allowlisting)
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get Health check settings. 
     * @return HealthCheck Health check settings.
     */
    public TargetGroupHealthCheck getHealthCheck() {
        return this.HealthCheck;
    }

    /**
     * Set Health check settings.
     * @param HealthCheck Health check settings.
     */
    public void setHealthCheck(TargetGroupHealthCheck HealthCheck) {
        this.HealthCheck = HealthCheck;
    }

    /**
     * Get Load balancing algorithm.
- IP_HASH_3_ELASTIC: elastic hashing 
     * @return ScheduleAlgorithm Load balancing algorithm.
- IP_HASH_3_ELASTIC: elastic hashing
     */
    public String getScheduleAlgorithm() {
        return this.ScheduleAlgorithm;
    }

    /**
     * Set Load balancing algorithm.
- IP_HASH_3_ELASTIC: elastic hashing
     * @param ScheduleAlgorithm Load balancing algorithm.
- IP_HASH_3_ELASTIC: elastic hashing
     */
    public void setScheduleAlgorithm(String ScheduleAlgorithm) {
        this.ScheduleAlgorithm = ScheduleAlgorithm;
    }

    /**
     * Get Whether "All Dead, All Alive" is supported. It is supported by default. 
     * @return AllDeadToAlive Whether "All Dead, All Alive" is supported. It is supported by default.
     */
    public Boolean getAllDeadToAlive() {
        return this.AllDeadToAlive;
    }

    /**
     * Set Whether "All Dead, All Alive" is supported. It is supported by default.
     * @param AllDeadToAlive Whether "All Dead, All Alive" is supported. It is supported by default.
     */
    public void setAllDeadToAlive(Boolean AllDeadToAlive) {
        this.AllDeadToAlive = AllDeadToAlive;
    }

    /**
     * Get Tags 
     * @return Tags Tags
     */
    public TagInfo [] getTags() {
        return this.Tags;
    }

    /**
     * Set Tags
     * @param Tags Tags
     */
    public void setTags(TagInfo [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get Traffic Distribution Mode
<ul>
<li>STATELESS: Stateless</li>
<li>STATEFUL: Stateful</li>
</ul> 
     * @return ForwardingMode Traffic Distribution Mode
<ul>
<li>STATELESS: Stateless</li>
<li>STATEFUL: Stateful</li>
</ul>
     */
    public String getForwardingMode() {
        return this.ForwardingMode;
    }

    /**
     * Set Traffic Distribution Mode
<ul>
<li>STATELESS: Stateless</li>
<li>STATEFUL: Stateful</li>
</ul>
     * @param ForwardingMode Traffic Distribution Mode
<ul>
<li>STATELESS: Stateless</li>
<li>STATEFUL: Stateful</li>
</ul>
     */
    public void setForwardingMode(String ForwardingMode) {
        this.ForwardingMode = ForwardingMode;
    }

    /**
     * Get <p>Switch for unbinding backend services in the rescheduling function. When enabled, unbinding backend services will trigger rescheduling.</p> 
     * @return RescheduleUnbindRs <p>Switch for unbinding backend services in the rescheduling function. When enabled, unbinding backend services will trigger rescheduling.</p>
     */
    public Boolean getRescheduleUnbindRs() {
        return this.RescheduleUnbindRs;
    }

    /**
     * Set <p>Switch for unbinding backend services in the rescheduling function. When enabled, unbinding backend services will trigger rescheduling.</p>
     * @param RescheduleUnbindRs <p>Switch for unbinding backend services in the rescheduling function. When enabled, unbinding backend services will trigger rescheduling.</p>
     */
    public void setRescheduleUnbindRs(Boolean RescheduleUnbindRs) {
        this.RescheduleUnbindRs = RescheduleUnbindRs;
    }

    /**
     * Get <p>The time to enable rescheduling after unbinding RS, configurable from 0s to 3600s, with a default value of 0s</p> 
     * @return RescheduleUnbindRsStartTime <p>The time to enable rescheduling after unbinding RS, configurable from 0s to 3600s, with a default value of 0s</p>
     */
    public Long getRescheduleUnbindRsStartTime() {
        return this.RescheduleUnbindRsStartTime;
    }

    /**
     * Set <p>The time to enable rescheduling after unbinding RS, configurable from 0s to 3600s, with a default value of 0s</p>
     * @param RescheduleUnbindRsStartTime <p>The time to enable rescheduling after unbinding RS, configurable from 0s to 3600s, with a default value of 0s</p>
     */
    public void setRescheduleUnbindRsStartTime(Long RescheduleUnbindRsStartTime) {
        this.RescheduleUnbindRsStartTime = RescheduleUnbindRsStartTime;
    }

    /**
     * Get <p>Switch for backend service health detection exception in the rescheduling function. When enabled, abnormal health checks of backend services will trigger rescheduling.</p> 
     * @return RescheduleUnhealthy <p>Switch for backend service health detection exception in the rescheduling function. When enabled, abnormal health checks of backend services will trigger rescheduling.</p>
     */
    public Boolean getRescheduleUnhealthy() {
        return this.RescheduleUnhealthy;
    }

    /**
     * Set <p>Switch for backend service health detection exception in the rescheduling function. When enabled, abnormal health checks of backend services will trigger rescheduling.</p>
     * @param RescheduleUnhealthy <p>Switch for backend service health detection exception in the rescheduling function. When enabled, abnormal health checks of backend services will trigger rescheduling.</p>
     */
    public void setRescheduleUnhealthy(Boolean RescheduleUnhealthy) {
        this.RescheduleUnhealthy = RescheduleUnhealthy;
    }

    /**
     * Get <p>The waiting time to enable rescheduling after abnormal health detection of backend services, configurable from 0s to 3600s, default is 0s</p> 
     * @return RescheduleUnhealthyStartTime <p>The waiting time to enable rescheduling after abnormal health detection of backend services, configurable from 0s to 3600s, default is 0s</p>
     */
    public Long getRescheduleUnhealthyStartTime() {
        return this.RescheduleUnhealthyStartTime;
    }

    /**
     * Set <p>The waiting time to enable rescheduling after abnormal health detection of backend services, configurable from 0s to 3600s, default is 0s</p>
     * @param RescheduleUnhealthyStartTime <p>The waiting time to enable rescheduling after abnormal health detection of backend services, configurable from 0s to 3600s, default is 0s</p>
     */
    public void setRescheduleUnhealthyStartTime(Long RescheduleUnhealthyStartTime) {
        this.RescheduleUnhealthyStartTime = RescheduleUnhealthyStartTime;
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
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.HealthCheck != null) {
            this.HealthCheck = new TargetGroupHealthCheck(source.HealthCheck);
        }
        if (source.ScheduleAlgorithm != null) {
            this.ScheduleAlgorithm = new String(source.ScheduleAlgorithm);
        }
        if (source.AllDeadToAlive != null) {
            this.AllDeadToAlive = new Boolean(source.AllDeadToAlive);
        }
        if (source.Tags != null) {
            this.Tags = new TagInfo[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new TagInfo(source.Tags[i]);
            }
        }
        if (source.ForwardingMode != null) {
            this.ForwardingMode = new String(source.ForwardingMode);
        }
        if (source.RescheduleUnbindRs != null) {
            this.RescheduleUnbindRs = new Boolean(source.RescheduleUnbindRs);
        }
        if (source.RescheduleUnbindRsStartTime != null) {
            this.RescheduleUnbindRsStartTime = new Long(source.RescheduleUnbindRsStartTime);
        }
        if (source.RescheduleUnhealthy != null) {
            this.RescheduleUnhealthy = new Boolean(source.RescheduleUnhealthy);
        }
        if (source.RescheduleUnhealthyStartTime != null) {
            this.RescheduleUnhealthyStartTime = new Long(source.RescheduleUnhealthyStartTime);
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
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamObj(map, prefix + "HealthCheck.", this.HealthCheck);
        this.setParamSimple(map, prefix + "ScheduleAlgorithm", this.ScheduleAlgorithm);
        this.setParamSimple(map, prefix + "AllDeadToAlive", this.AllDeadToAlive);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "ForwardingMode", this.ForwardingMode);
        this.setParamSimple(map, prefix + "RescheduleUnbindRs", this.RescheduleUnbindRs);
        this.setParamSimple(map, prefix + "RescheduleUnbindRsStartTime", this.RescheduleUnbindRsStartTime);
        this.setParamSimple(map, prefix + "RescheduleUnhealthy", this.RescheduleUnhealthy);
        this.setParamSimple(map, prefix + "RescheduleUnhealthyStartTime", this.RescheduleUnhealthyStartTime);

    }
}

