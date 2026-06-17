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

public class TargetGroupInfo extends AbstractModel {

    /**
    * <p>Target group ID</p>
    */
    @SerializedName("TargetGroupId")
    @Expose
    private String TargetGroupId;

    /**
    * <p>VPC ID of the target group</p>
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * <p>Target group name</p>
    */
    @SerializedName("TargetGroupName")
    @Expose
    private String TargetGroupName;

    /**
    * <p>Default port of target group. This field returns 0 for full listen target group, indicating an invalid port.</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * <p>Creation time of target group</p>
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * <p>Target group modification time</p>
    */
    @SerializedName("UpdatedTime")
    @Expose
    private String UpdatedTime;

    /**
    * <p>Associated rule array. This parameter cannot be obtained in the DescribeTargetGroupList API call.</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AssociatedRule")
    @Expose
    private AssociationItem [] AssociatedRule;

    /**
    * <p>Backend forwarding protocol of the target group. Only the new version target group v2 returns a valid value.</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * <p>Scheduling algorithm. This parameter returns valid values only for target groups with backend forwarding protocol (HTTP, HTTPS, GRPC). Available values:</p><ur></p><li>WRR: weighted round-robin.</li><li>LEAST_CONN: LEAST connection.</li><li>IP_HASH: based on IP HASH.</li></ur>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ScheduleAlgorithm")
    @Expose
    private String ScheduleAlgorithm;

    /**
    * <p>Health check details.</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("HealthCheck")
    @Expose
    private TargetGroupHealthCheck HealthCheck;

    /**
    * <p>Target Group Type, currently supported v1 (legacy version target group), v2 (new version target group). Defaults to v1 (legacy version target group).</p>
    */
    @SerializedName("TargetGroupType")
    @Expose
    private String TargetGroupType;

    /**
    * <p>Number of rules associated with the target group.</p>
    */
    @SerializedName("AssociatedRuleCount")
    @Expose
    private Long AssociatedRuleCount;

    /**
    * <p>Number of instances in the target group.</p>
    */
    @SerializedName("RegisteredInstancesCount")
    @Expose
    private Long RegisteredInstancesCount;

    /**
    * <p>Tag.</p>
    */
    @SerializedName("Tag")
    @Expose
    private TagInfo [] Tag;

    /**
    * <p>Default weight. Only target groups of v2 type return this field. When NULL is returned, it means the default weight is not set.</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Weight")
    @Expose
    private Long Weight;

    /**
    * <p>Whether to listen to the target group.</p>
    */
    @SerializedName("FullListenSwitch")
    @Expose
    private Boolean FullListenSwitch;

    /**
    * <p>Whether to enable long connections. Only target groups with HTTP/HTTPS/GRPC as the backend forwarding protocol return a valid value.</p>
    */
    @SerializedName("KeepaliveEnable")
    @Expose
    private Boolean KeepaliveEnable;

    /**
    * <p>Session hold time. Only target groups with backend forwarding protocol set to HTTP/HTTPS/GRPC return a valid value.</p>
    */
    @SerializedName("SessionExpireTime")
    @Expose
    private Long SessionExpireTime;

    /**
    * <p>IP version.</p>
    */
    @SerializedName("IpVersion")
    @Expose
    private String IpVersion;

    /**
    * <p>Whether to enable SNAT</p>
    */
    @SerializedName("SnatEnable")
    @Expose
    private Boolean SnatEnable;

    /**
     * Get <p>Target group ID</p> 
     * @return TargetGroupId <p>Target group ID</p>
     */
    public String getTargetGroupId() {
        return this.TargetGroupId;
    }

    /**
     * Set <p>Target group ID</p>
     * @param TargetGroupId <p>Target group ID</p>
     */
    public void setTargetGroupId(String TargetGroupId) {
        this.TargetGroupId = TargetGroupId;
    }

    /**
     * Get <p>VPC ID of the target group</p> 
     * @return VpcId <p>VPC ID of the target group</p>
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set <p>VPC ID of the target group</p>
     * @param VpcId <p>VPC ID of the target group</p>
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get <p>Target group name</p> 
     * @return TargetGroupName <p>Target group name</p>
     */
    public String getTargetGroupName() {
        return this.TargetGroupName;
    }

    /**
     * Set <p>Target group name</p>
     * @param TargetGroupName <p>Target group name</p>
     */
    public void setTargetGroupName(String TargetGroupName) {
        this.TargetGroupName = TargetGroupName;
    }

    /**
     * Get <p>Default port of target group. This field returns 0 for full listen target group, indicating an invalid port.</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Port <p>Default port of target group. This field returns 0 for full listen target group, indicating an invalid port.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set <p>Default port of target group. This field returns 0 for full listen target group, indicating an invalid port.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Port <p>Default port of target group. This field returns 0 for full listen target group, indicating an invalid port.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get <p>Creation time of target group</p> 
     * @return CreatedTime <p>Creation time of target group</p>
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set <p>Creation time of target group</p>
     * @param CreatedTime <p>Creation time of target group</p>
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get <p>Target group modification time</p> 
     * @return UpdatedTime <p>Target group modification time</p>
     */
    public String getUpdatedTime() {
        return this.UpdatedTime;
    }

    /**
     * Set <p>Target group modification time</p>
     * @param UpdatedTime <p>Target group modification time</p>
     */
    public void setUpdatedTime(String UpdatedTime) {
        this.UpdatedTime = UpdatedTime;
    }

    /**
     * Get <p>Associated rule array. This parameter cannot be obtained in the DescribeTargetGroupList API call.</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AssociatedRule <p>Associated rule array. This parameter cannot be obtained in the DescribeTargetGroupList API call.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public AssociationItem [] getAssociatedRule() {
        return this.AssociatedRule;
    }

    /**
     * Set <p>Associated rule array. This parameter cannot be obtained in the DescribeTargetGroupList API call.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AssociatedRule <p>Associated rule array. This parameter cannot be obtained in the DescribeTargetGroupList API call.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAssociatedRule(AssociationItem [] AssociatedRule) {
        this.AssociatedRule = AssociatedRule;
    }

    /**
     * Get <p>Backend forwarding protocol of the target group. Only the new version target group v2 returns a valid value.</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Protocol <p>Backend forwarding protocol of the target group. Only the new version target group v2 returns a valid value.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set <p>Backend forwarding protocol of the target group. Only the new version target group v2 returns a valid value.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Protocol <p>Backend forwarding protocol of the target group. Only the new version target group v2 returns a valid value.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get <p>Scheduling algorithm. This parameter returns valid values only for target groups with backend forwarding protocol (HTTP, HTTPS, GRPC). Available values:</p><ur></p><li>WRR: weighted round-robin.</li><li>LEAST_CONN: LEAST connection.</li><li>IP_HASH: based on IP HASH.</li></ur>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ScheduleAlgorithm <p>Scheduling algorithm. This parameter returns valid values only for target groups with backend forwarding protocol (HTTP, HTTPS, GRPC). Available values:</p><ur></p><li>WRR: weighted round-robin.</li><li>LEAST_CONN: LEAST connection.</li><li>IP_HASH: based on IP HASH.</li></ur>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getScheduleAlgorithm() {
        return this.ScheduleAlgorithm;
    }

    /**
     * Set <p>Scheduling algorithm. This parameter returns valid values only for target groups with backend forwarding protocol (HTTP, HTTPS, GRPC). Available values:</p><ur></p><li>WRR: weighted round-robin.</li><li>LEAST_CONN: LEAST connection.</li><li>IP_HASH: based on IP HASH.</li></ur>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ScheduleAlgorithm <p>Scheduling algorithm. This parameter returns valid values only for target groups with backend forwarding protocol (HTTP, HTTPS, GRPC). Available values:</p><ur></p><li>WRR: weighted round-robin.</li><li>LEAST_CONN: LEAST connection.</li><li>IP_HASH: based on IP HASH.</li></ur>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setScheduleAlgorithm(String ScheduleAlgorithm) {
        this.ScheduleAlgorithm = ScheduleAlgorithm;
    }

    /**
     * Get <p>Health check details.</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return HealthCheck <p>Health check details.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public TargetGroupHealthCheck getHealthCheck() {
        return this.HealthCheck;
    }

    /**
     * Set <p>Health check details.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param HealthCheck <p>Health check details.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setHealthCheck(TargetGroupHealthCheck HealthCheck) {
        this.HealthCheck = HealthCheck;
    }

    /**
     * Get <p>Target Group Type, currently supported v1 (legacy version target group), v2 (new version target group). Defaults to v1 (legacy version target group).</p> 
     * @return TargetGroupType <p>Target Group Type, currently supported v1 (legacy version target group), v2 (new version target group). Defaults to v1 (legacy version target group).</p>
     */
    public String getTargetGroupType() {
        return this.TargetGroupType;
    }

    /**
     * Set <p>Target Group Type, currently supported v1 (legacy version target group), v2 (new version target group). Defaults to v1 (legacy version target group).</p>
     * @param TargetGroupType <p>Target Group Type, currently supported v1 (legacy version target group), v2 (new version target group). Defaults to v1 (legacy version target group).</p>
     */
    public void setTargetGroupType(String TargetGroupType) {
        this.TargetGroupType = TargetGroupType;
    }

    /**
     * Get <p>Number of rules associated with the target group.</p> 
     * @return AssociatedRuleCount <p>Number of rules associated with the target group.</p>
     */
    public Long getAssociatedRuleCount() {
        return this.AssociatedRuleCount;
    }

    /**
     * Set <p>Number of rules associated with the target group.</p>
     * @param AssociatedRuleCount <p>Number of rules associated with the target group.</p>
     */
    public void setAssociatedRuleCount(Long AssociatedRuleCount) {
        this.AssociatedRuleCount = AssociatedRuleCount;
    }

    /**
     * Get <p>Number of instances in the target group.</p> 
     * @return RegisteredInstancesCount <p>Number of instances in the target group.</p>
     */
    public Long getRegisteredInstancesCount() {
        return this.RegisteredInstancesCount;
    }

    /**
     * Set <p>Number of instances in the target group.</p>
     * @param RegisteredInstancesCount <p>Number of instances in the target group.</p>
     */
    public void setRegisteredInstancesCount(Long RegisteredInstancesCount) {
        this.RegisteredInstancesCount = RegisteredInstancesCount;
    }

    /**
     * Get <p>Tag.</p> 
     * @return Tag <p>Tag.</p>
     */
    public TagInfo [] getTag() {
        return this.Tag;
    }

    /**
     * Set <p>Tag.</p>
     * @param Tag <p>Tag.</p>
     */
    public void setTag(TagInfo [] Tag) {
        this.Tag = Tag;
    }

    /**
     * Get <p>Default weight. Only target groups of v2 type return this field. When NULL is returned, it means the default weight is not set.</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Weight <p>Default weight. Only target groups of v2 type return this field. When NULL is returned, it means the default weight is not set.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getWeight() {
        return this.Weight;
    }

    /**
     * Set <p>Default weight. Only target groups of v2 type return this field. When NULL is returned, it means the default weight is not set.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Weight <p>Default weight. Only target groups of v2 type return this field. When NULL is returned, it means the default weight is not set.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setWeight(Long Weight) {
        this.Weight = Weight;
    }

    /**
     * Get <p>Whether to listen to the target group.</p> 
     * @return FullListenSwitch <p>Whether to listen to the target group.</p>
     */
    public Boolean getFullListenSwitch() {
        return this.FullListenSwitch;
    }

    /**
     * Set <p>Whether to listen to the target group.</p>
     * @param FullListenSwitch <p>Whether to listen to the target group.</p>
     */
    public void setFullListenSwitch(Boolean FullListenSwitch) {
        this.FullListenSwitch = FullListenSwitch;
    }

    /**
     * Get <p>Whether to enable long connections. Only target groups with HTTP/HTTPS/GRPC as the backend forwarding protocol return a valid value.</p> 
     * @return KeepaliveEnable <p>Whether to enable long connections. Only target groups with HTTP/HTTPS/GRPC as the backend forwarding protocol return a valid value.</p>
     */
    public Boolean getKeepaliveEnable() {
        return this.KeepaliveEnable;
    }

    /**
     * Set <p>Whether to enable long connections. Only target groups with HTTP/HTTPS/GRPC as the backend forwarding protocol return a valid value.</p>
     * @param KeepaliveEnable <p>Whether to enable long connections. Only target groups with HTTP/HTTPS/GRPC as the backend forwarding protocol return a valid value.</p>
     */
    public void setKeepaliveEnable(Boolean KeepaliveEnable) {
        this.KeepaliveEnable = KeepaliveEnable;
    }

    /**
     * Get <p>Session hold time. Only target groups with backend forwarding protocol set to HTTP/HTTPS/GRPC return a valid value.</p> 
     * @return SessionExpireTime <p>Session hold time. Only target groups with backend forwarding protocol set to HTTP/HTTPS/GRPC return a valid value.</p>
     */
    public Long getSessionExpireTime() {
        return this.SessionExpireTime;
    }

    /**
     * Set <p>Session hold time. Only target groups with backend forwarding protocol set to HTTP/HTTPS/GRPC return a valid value.</p>
     * @param SessionExpireTime <p>Session hold time. Only target groups with backend forwarding protocol set to HTTP/HTTPS/GRPC return a valid value.</p>
     */
    public void setSessionExpireTime(Long SessionExpireTime) {
        this.SessionExpireTime = SessionExpireTime;
    }

    /**
     * Get <p>IP version.</p> 
     * @return IpVersion <p>IP version.</p>
     */
    public String getIpVersion() {
        return this.IpVersion;
    }

    /**
     * Set <p>IP version.</p>
     * @param IpVersion <p>IP version.</p>
     */
    public void setIpVersion(String IpVersion) {
        this.IpVersion = IpVersion;
    }

    /**
     * Get <p>Whether to enable SNAT</p> 
     * @return SnatEnable <p>Whether to enable SNAT</p>
     */
    public Boolean getSnatEnable() {
        return this.SnatEnable;
    }

    /**
     * Set <p>Whether to enable SNAT</p>
     * @param SnatEnable <p>Whether to enable SNAT</p>
     */
    public void setSnatEnable(Boolean SnatEnable) {
        this.SnatEnable = SnatEnable;
    }

    public TargetGroupInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TargetGroupInfo(TargetGroupInfo source) {
        if (source.TargetGroupId != null) {
            this.TargetGroupId = new String(source.TargetGroupId);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.TargetGroupName != null) {
            this.TargetGroupName = new String(source.TargetGroupName);
        }
        if (source.Port != null) {
            this.Port = new Long(source.Port);
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new String(source.CreatedTime);
        }
        if (source.UpdatedTime != null) {
            this.UpdatedTime = new String(source.UpdatedTime);
        }
        if (source.AssociatedRule != null) {
            this.AssociatedRule = new AssociationItem[source.AssociatedRule.length];
            for (int i = 0; i < source.AssociatedRule.length; i++) {
                this.AssociatedRule[i] = new AssociationItem(source.AssociatedRule[i]);
            }
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.ScheduleAlgorithm != null) {
            this.ScheduleAlgorithm = new String(source.ScheduleAlgorithm);
        }
        if (source.HealthCheck != null) {
            this.HealthCheck = new TargetGroupHealthCheck(source.HealthCheck);
        }
        if (source.TargetGroupType != null) {
            this.TargetGroupType = new String(source.TargetGroupType);
        }
        if (source.AssociatedRuleCount != null) {
            this.AssociatedRuleCount = new Long(source.AssociatedRuleCount);
        }
        if (source.RegisteredInstancesCount != null) {
            this.RegisteredInstancesCount = new Long(source.RegisteredInstancesCount);
        }
        if (source.Tag != null) {
            this.Tag = new TagInfo[source.Tag.length];
            for (int i = 0; i < source.Tag.length; i++) {
                this.Tag[i] = new TagInfo(source.Tag[i]);
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
        this.setParamSimple(map, prefix + "TargetGroupId", this.TargetGroupId);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "TargetGroupName", this.TargetGroupName);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamSimple(map, prefix + "UpdatedTime", this.UpdatedTime);
        this.setParamArrayObj(map, prefix + "AssociatedRule.", this.AssociatedRule);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "ScheduleAlgorithm", this.ScheduleAlgorithm);
        this.setParamObj(map, prefix + "HealthCheck.", this.HealthCheck);
        this.setParamSimple(map, prefix + "TargetGroupType", this.TargetGroupType);
        this.setParamSimple(map, prefix + "AssociatedRuleCount", this.AssociatedRuleCount);
        this.setParamSimple(map, prefix + "RegisteredInstancesCount", this.RegisteredInstancesCount);
        this.setParamArrayObj(map, prefix + "Tag.", this.Tag);
        this.setParamSimple(map, prefix + "Weight", this.Weight);
        this.setParamSimple(map, prefix + "FullListenSwitch", this.FullListenSwitch);
        this.setParamSimple(map, prefix + "KeepaliveEnable", this.KeepaliveEnable);
        this.setParamSimple(map, prefix + "SessionExpireTime", this.SessionExpireTime);
        this.setParamSimple(map, prefix + "IpVersion", this.IpVersion);
        this.setParamSimple(map, prefix + "SnatEnable", this.SnatEnable);

    }
}

