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
package com.tencentcloudapi.alb.v20251030.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TargetGroupOutput extends AbstractModel {

    /**
    * Creation time.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Health check configuration.
    */
    @SerializedName("HealthCheckConfig")
    @Expose
    private HealthCheckConfig HealthCheckConfig;

    /**
    * Whether to enable long connections.
    */
    @SerializedName("KeepaliveEnabled")
    @Expose
    private Boolean KeepaliveEnabled;

    /**
    * Backend service protocol type. Value:
- **HTTP** (default): support binding HTTP and HTTPS listeners
- **HTTPS**: support binding HTTPS listeners
- **GRPC**: support binding HTTPS listeners
- **GRPCS**: support binding HTTPS listeners
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * Number of load balancers associated with the target group.
    */
    @SerializedName("RelatedLoadBalancersCount")
    @Expose
    private Long RelatedLoadBalancersCount;

    /**
    * Scheduling algorithm.
    */
    @SerializedName("SchedulerAlgorithm")
    @Expose
    private String SchedulerAlgorithm;

    /**
    * Session persistence configuration.
    */
    @SerializedName("StickySessionConfig")
    @Expose
    private StickySessionConfig StickySessionConfig;

    /**
    * Tag.
    */
    @SerializedName("Tags")
    @Expose
    private TagInfo [] Tags;

    /**
    * Target group ID in the format of lbtg- followed by 8 alphanumeric characters.
    */
    @SerializedName("TargetGroupId")
    @Expose
    private String TargetGroupId;

    /**
    * Target group name. Defaults to the target group ID. It contains 1–255 characters, consisting of digits, upper- and lower-case letters, Chinese characters, half-width periods (.), underscores (_), and dashes (-).
    */
    @SerializedName("TargetGroupName")
    @Expose
    private String TargetGroupName;

    /**
    * Status of the target group. Valid values:
- **Provisioning**: Under creation.
- **ProvisionFailed**: Creation failed.
- **Active**: Running.
- **Configuring**: configuration changing.
    */
    @SerializedName("TargetGroupStatus")
    @Expose
    private String TargetGroupStatus;

    /**
    * Target group type. Valid values:
- **Instance**: Cvm server type or Eni type
    */
    @SerializedName("TargetType")
    @Expose
    private String TargetType;

    /**
    * Virtual Private Cloud (VPC) ID.
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
     * Get Creation time. 
     * @return CreateTime Creation time.
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time.
     * @param CreateTime Creation time.
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Health check configuration. 
     * @return HealthCheckConfig Health check configuration.
     */
    public HealthCheckConfig getHealthCheckConfig() {
        return this.HealthCheckConfig;
    }

    /**
     * Set Health check configuration.
     * @param HealthCheckConfig Health check configuration.
     */
    public void setHealthCheckConfig(HealthCheckConfig HealthCheckConfig) {
        this.HealthCheckConfig = HealthCheckConfig;
    }

    /**
     * Get Whether to enable long connections. 
     * @return KeepaliveEnabled Whether to enable long connections.
     */
    public Boolean getKeepaliveEnabled() {
        return this.KeepaliveEnabled;
    }

    /**
     * Set Whether to enable long connections.
     * @param KeepaliveEnabled Whether to enable long connections.
     */
    public void setKeepaliveEnabled(Boolean KeepaliveEnabled) {
        this.KeepaliveEnabled = KeepaliveEnabled;
    }

    /**
     * Get Backend service protocol type. Value:
- **HTTP** (default): support binding HTTP and HTTPS listeners
- **HTTPS**: support binding HTTPS listeners
- **GRPC**: support binding HTTPS listeners
- **GRPCS**: support binding HTTPS listeners 
     * @return Protocol Backend service protocol type. Value:
- **HTTP** (default): support binding HTTP and HTTPS listeners
- **HTTPS**: support binding HTTPS listeners
- **GRPC**: support binding HTTPS listeners
- **GRPCS**: support binding HTTPS listeners
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set Backend service protocol type. Value:
- **HTTP** (default): support binding HTTP and HTTPS listeners
- **HTTPS**: support binding HTTPS listeners
- **GRPC**: support binding HTTPS listeners
- **GRPCS**: support binding HTTPS listeners
     * @param Protocol Backend service protocol type. Value:
- **HTTP** (default): support binding HTTP and HTTPS listeners
- **HTTPS**: support binding HTTPS listeners
- **GRPC**: support binding HTTPS listeners
- **GRPCS**: support binding HTTPS listeners
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get Number of load balancers associated with the target group. 
     * @return RelatedLoadBalancersCount Number of load balancers associated with the target group.
     */
    public Long getRelatedLoadBalancersCount() {
        return this.RelatedLoadBalancersCount;
    }

    /**
     * Set Number of load balancers associated with the target group.
     * @param RelatedLoadBalancersCount Number of load balancers associated with the target group.
     */
    public void setRelatedLoadBalancersCount(Long RelatedLoadBalancersCount) {
        this.RelatedLoadBalancersCount = RelatedLoadBalancersCount;
    }

    /**
     * Get Scheduling algorithm. 
     * @return SchedulerAlgorithm Scheduling algorithm.
     */
    public String getSchedulerAlgorithm() {
        return this.SchedulerAlgorithm;
    }

    /**
     * Set Scheduling algorithm.
     * @param SchedulerAlgorithm Scheduling algorithm.
     */
    public void setSchedulerAlgorithm(String SchedulerAlgorithm) {
        this.SchedulerAlgorithm = SchedulerAlgorithm;
    }

    /**
     * Get Session persistence configuration. 
     * @return StickySessionConfig Session persistence configuration.
     */
    public StickySessionConfig getStickySessionConfig() {
        return this.StickySessionConfig;
    }

    /**
     * Set Session persistence configuration.
     * @param StickySessionConfig Session persistence configuration.
     */
    public void setStickySessionConfig(StickySessionConfig StickySessionConfig) {
        this.StickySessionConfig = StickySessionConfig;
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
     * Get Target group ID in the format of lbtg- followed by 8 alphanumeric characters. 
     * @return TargetGroupId Target group ID in the format of lbtg- followed by 8 alphanumeric characters.
     */
    public String getTargetGroupId() {
        return this.TargetGroupId;
    }

    /**
     * Set Target group ID in the format of lbtg- followed by 8 alphanumeric characters.
     * @param TargetGroupId Target group ID in the format of lbtg- followed by 8 alphanumeric characters.
     */
    public void setTargetGroupId(String TargetGroupId) {
        this.TargetGroupId = TargetGroupId;
    }

    /**
     * Get Target group name. Defaults to the target group ID. It contains 1–255 characters, consisting of digits, upper- and lower-case letters, Chinese characters, half-width periods (.), underscores (_), and dashes (-). 
     * @return TargetGroupName Target group name. Defaults to the target group ID. It contains 1–255 characters, consisting of digits, upper- and lower-case letters, Chinese characters, half-width periods (.), underscores (_), and dashes (-).
     */
    public String getTargetGroupName() {
        return this.TargetGroupName;
    }

    /**
     * Set Target group name. Defaults to the target group ID. It contains 1–255 characters, consisting of digits, upper- and lower-case letters, Chinese characters, half-width periods (.), underscores (_), and dashes (-).
     * @param TargetGroupName Target group name. Defaults to the target group ID. It contains 1–255 characters, consisting of digits, upper- and lower-case letters, Chinese characters, half-width periods (.), underscores (_), and dashes (-).
     */
    public void setTargetGroupName(String TargetGroupName) {
        this.TargetGroupName = TargetGroupName;
    }

    /**
     * Get Status of the target group. Valid values:
- **Provisioning**: Under creation.
- **ProvisionFailed**: Creation failed.
- **Active**: Running.
- **Configuring**: configuration changing. 
     * @return TargetGroupStatus Status of the target group. Valid values:
- **Provisioning**: Under creation.
- **ProvisionFailed**: Creation failed.
- **Active**: Running.
- **Configuring**: configuration changing.
     */
    public String getTargetGroupStatus() {
        return this.TargetGroupStatus;
    }

    /**
     * Set Status of the target group. Valid values:
- **Provisioning**: Under creation.
- **ProvisionFailed**: Creation failed.
- **Active**: Running.
- **Configuring**: configuration changing.
     * @param TargetGroupStatus Status of the target group. Valid values:
- **Provisioning**: Under creation.
- **ProvisionFailed**: Creation failed.
- **Active**: Running.
- **Configuring**: configuration changing.
     */
    public void setTargetGroupStatus(String TargetGroupStatus) {
        this.TargetGroupStatus = TargetGroupStatus;
    }

    /**
     * Get Target group type. Valid values:
- **Instance**: Cvm server type or Eni type 
     * @return TargetType Target group type. Valid values:
- **Instance**: Cvm server type or Eni type
     */
    public String getTargetType() {
        return this.TargetType;
    }

    /**
     * Set Target group type. Valid values:
- **Instance**: Cvm server type or Eni type
     * @param TargetType Target group type. Valid values:
- **Instance**: Cvm server type or Eni type
     */
    public void setTargetType(String TargetType) {
        this.TargetType = TargetType;
    }

    /**
     * Get Virtual Private Cloud (VPC) ID. 
     * @return VpcId Virtual Private Cloud (VPC) ID.
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set Virtual Private Cloud (VPC) ID.
     * @param VpcId Virtual Private Cloud (VPC) ID.
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    public TargetGroupOutput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TargetGroupOutput(TargetGroupOutput source) {
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.HealthCheckConfig != null) {
            this.HealthCheckConfig = new HealthCheckConfig(source.HealthCheckConfig);
        }
        if (source.KeepaliveEnabled != null) {
            this.KeepaliveEnabled = new Boolean(source.KeepaliveEnabled);
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.RelatedLoadBalancersCount != null) {
            this.RelatedLoadBalancersCount = new Long(source.RelatedLoadBalancersCount);
        }
        if (source.SchedulerAlgorithm != null) {
            this.SchedulerAlgorithm = new String(source.SchedulerAlgorithm);
        }
        if (source.StickySessionConfig != null) {
            this.StickySessionConfig = new StickySessionConfig(source.StickySessionConfig);
        }
        if (source.Tags != null) {
            this.Tags = new TagInfo[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new TagInfo(source.Tags[i]);
            }
        }
        if (source.TargetGroupId != null) {
            this.TargetGroupId = new String(source.TargetGroupId);
        }
        if (source.TargetGroupName != null) {
            this.TargetGroupName = new String(source.TargetGroupName);
        }
        if (source.TargetGroupStatus != null) {
            this.TargetGroupStatus = new String(source.TargetGroupStatus);
        }
        if (source.TargetType != null) {
            this.TargetType = new String(source.TargetType);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamObj(map, prefix + "HealthCheckConfig.", this.HealthCheckConfig);
        this.setParamSimple(map, prefix + "KeepaliveEnabled", this.KeepaliveEnabled);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "RelatedLoadBalancersCount", this.RelatedLoadBalancersCount);
        this.setParamSimple(map, prefix + "SchedulerAlgorithm", this.SchedulerAlgorithm);
        this.setParamObj(map, prefix + "StickySessionConfig.", this.StickySessionConfig);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "TargetGroupId", this.TargetGroupId);
        this.setParamSimple(map, prefix + "TargetGroupName", this.TargetGroupName);
        this.setParamSimple(map, prefix + "TargetGroupStatus", this.TargetGroupStatus);
        this.setParamSimple(map, prefix + "TargetType", this.TargetType);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);

    }
}

