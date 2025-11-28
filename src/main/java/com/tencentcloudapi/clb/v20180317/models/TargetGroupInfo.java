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
    * Target group ID
    */
    @SerializedName("TargetGroupId")
    @Expose
    private String TargetGroupId;

    /**
    * `vpcid` of target group
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * Target group name
    */
    @SerializedName("TargetGroupName")
    @Expose
    private String TargetGroupName;

    /**
    * Specifies the default port of the target group. for a full listen target group, this field returns 0, indicating an invalid port.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * Target group creation time
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * Target group modification time
    */
    @SerializedName("UpdatedTime")
    @Expose
    private String UpdatedTime;

    /**
    * Associated rule array. This parameter cannot be obtained when the DescribeTargetGroupList API is called.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AssociatedRule")
    @Expose
    private AssociationItem [] AssociatedRule;

    /**
    * Backend forwarding protocol of the target group. only returns valid values for the new version (v2) target group.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * Scheduling algorithm. returns a valid value only when the backend forwarding protocol is HTTP, HTTPS, or GRPC. available values:.
<ur>
<Li>WRR: weighted round-robin.</li>.
<Li>LEAST_CONN: specifies the least connection.</li>.
<Li>IP_HASH: based on ip hash.</li>.
</ur>

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ScheduleAlgorithm")
    @Expose
    private String ScheduleAlgorithm;

    /**
    * Health check details.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("HealthCheck")
    @Expose
    private TargetGroupHealthCheck HealthCheck;

    /**
    * Target group type, currently supported v1 (legacy version target group) and v2 (new version target group). defaults to v1 (legacy version target group).
    */
    @SerializedName("TargetGroupType")
    @Expose
    private String TargetGroupType;

    /**
    * Number of rules associated with the target group.
    */
    @SerializedName("AssociatedRuleCount")
    @Expose
    private Long AssociatedRuleCount;

    /**
    * Specifies the number of instances in the target group.
    */
    @SerializedName("RegisteredInstancesCount")
    @Expose
    private Long RegisteredInstancesCount;

    /**
    * Tag.
    */
    @SerializedName("Tag")
    @Expose
    private TagInfo [] Tag;

    /**
    * Default weight. only target groups of v2 type return this field. when NULL is returned, it means the default weight is not set.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Weight")
    @Expose
    private Long Weight;

    /**
    * Specifies whether to listen to all target groups.
    */
    @SerializedName("FullListenSwitch")
    @Expose
    private Boolean FullListenSwitch;

    /**
    * Whether to enable persistent connections. valid only when the backend forwarding protocol is HTTP/HTTPS/GRPC and returned by the target group.
    */
    @SerializedName("KeepaliveEnable")
    @Expose
    private Boolean KeepaliveEnable;

    /**
    * Session persistence time. valid only when the backend forwarding protocol is HTTP/HTTPS/GRPC and the target group returns a valid value.
    */
    @SerializedName("SessionExpireTime")
    @Expose
    private Long SessionExpireTime;

    /**
    * IP version.
    */
    @SerializedName("IpVersion")
    @Expose
    private String IpVersion;

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
     * Get `vpcid` of target group 
     * @return VpcId `vpcid` of target group
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set `vpcid` of target group
     * @param VpcId `vpcid` of target group
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get Target group name 
     * @return TargetGroupName Target group name
     */
    public String getTargetGroupName() {
        return this.TargetGroupName;
    }

    /**
     * Set Target group name
     * @param TargetGroupName Target group name
     */
    public void setTargetGroupName(String TargetGroupName) {
        this.TargetGroupName = TargetGroupName;
    }

    /**
     * Get Specifies the default port of the target group. for a full listen target group, this field returns 0, indicating an invalid port.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Port Specifies the default port of the target group. for a full listen target group, this field returns 0, indicating an invalid port.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set Specifies the default port of the target group. for a full listen target group, this field returns 0, indicating an invalid port.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Port Specifies the default port of the target group. for a full listen target group, this field returns 0, indicating an invalid port.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get Target group creation time 
     * @return CreatedTime Target group creation time
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set Target group creation time
     * @param CreatedTime Target group creation time
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get Target group modification time 
     * @return UpdatedTime Target group modification time
     */
    public String getUpdatedTime() {
        return this.UpdatedTime;
    }

    /**
     * Set Target group modification time
     * @param UpdatedTime Target group modification time
     */
    public void setUpdatedTime(String UpdatedTime) {
        this.UpdatedTime = UpdatedTime;
    }

    /**
     * Get Associated rule array. This parameter cannot be obtained when the DescribeTargetGroupList API is called.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AssociatedRule Associated rule array. This parameter cannot be obtained when the DescribeTargetGroupList API is called.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public AssociationItem [] getAssociatedRule() {
        return this.AssociatedRule;
    }

    /**
     * Set Associated rule array. This parameter cannot be obtained when the DescribeTargetGroupList API is called.Note: This field may return null, indicating that no valid values can be obtained.
     * @param AssociatedRule Associated rule array. This parameter cannot be obtained when the DescribeTargetGroupList API is called.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAssociatedRule(AssociationItem [] AssociatedRule) {
        this.AssociatedRule = AssociatedRule;
    }

    /**
     * Get Backend forwarding protocol of the target group. only returns valid values for the new version (v2) target group.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Protocol Backend forwarding protocol of the target group. only returns valid values for the new version (v2) target group.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set Backend forwarding protocol of the target group. only returns valid values for the new version (v2) target group.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Protocol Backend forwarding protocol of the target group. only returns valid values for the new version (v2) target group.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get Scheduling algorithm. returns a valid value only when the backend forwarding protocol is HTTP, HTTPS, or GRPC. available values:.
<ur>
<Li>WRR: weighted round-robin.</li>.
<Li>LEAST_CONN: specifies the least connection.</li>.
<Li>IP_HASH: based on ip hash.</li>.
</ur>

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ScheduleAlgorithm Scheduling algorithm. returns a valid value only when the backend forwarding protocol is HTTP, HTTPS, or GRPC. available values:.
<ur>
<Li>WRR: weighted round-robin.</li>.
<Li>LEAST_CONN: specifies the least connection.</li>.
<Li>IP_HASH: based on ip hash.</li>.
</ur>

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getScheduleAlgorithm() {
        return this.ScheduleAlgorithm;
    }

    /**
     * Set Scheduling algorithm. returns a valid value only when the backend forwarding protocol is HTTP, HTTPS, or GRPC. available values:.
<ur>
<Li>WRR: weighted round-robin.</li>.
<Li>LEAST_CONN: specifies the least connection.</li>.
<Li>IP_HASH: based on ip hash.</li>.
</ur>

Note: This field may return null, indicating that no valid values can be obtained.
     * @param ScheduleAlgorithm Scheduling algorithm. returns a valid value only when the backend forwarding protocol is HTTP, HTTPS, or GRPC. available values:.
<ur>
<Li>WRR: weighted round-robin.</li>.
<Li>LEAST_CONN: specifies the least connection.</li>.
<Li>IP_HASH: based on ip hash.</li>.
</ur>

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setScheduleAlgorithm(String ScheduleAlgorithm) {
        this.ScheduleAlgorithm = ScheduleAlgorithm;
    }

    /**
     * Get Health check details.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return HealthCheck Health check details.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public TargetGroupHealthCheck getHealthCheck() {
        return this.HealthCheck;
    }

    /**
     * Set Health check details.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param HealthCheck Health check details.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setHealthCheck(TargetGroupHealthCheck HealthCheck) {
        this.HealthCheck = HealthCheck;
    }

    /**
     * Get Target group type, currently supported v1 (legacy version target group) and v2 (new version target group). defaults to v1 (legacy version target group). 
     * @return TargetGroupType Target group type, currently supported v1 (legacy version target group) and v2 (new version target group). defaults to v1 (legacy version target group).
     */
    public String getTargetGroupType() {
        return this.TargetGroupType;
    }

    /**
     * Set Target group type, currently supported v1 (legacy version target group) and v2 (new version target group). defaults to v1 (legacy version target group).
     * @param TargetGroupType Target group type, currently supported v1 (legacy version target group) and v2 (new version target group). defaults to v1 (legacy version target group).
     */
    public void setTargetGroupType(String TargetGroupType) {
        this.TargetGroupType = TargetGroupType;
    }

    /**
     * Get Number of rules associated with the target group. 
     * @return AssociatedRuleCount Number of rules associated with the target group.
     */
    public Long getAssociatedRuleCount() {
        return this.AssociatedRuleCount;
    }

    /**
     * Set Number of rules associated with the target group.
     * @param AssociatedRuleCount Number of rules associated with the target group.
     */
    public void setAssociatedRuleCount(Long AssociatedRuleCount) {
        this.AssociatedRuleCount = AssociatedRuleCount;
    }

    /**
     * Get Specifies the number of instances in the target group. 
     * @return RegisteredInstancesCount Specifies the number of instances in the target group.
     */
    public Long getRegisteredInstancesCount() {
        return this.RegisteredInstancesCount;
    }

    /**
     * Set Specifies the number of instances in the target group.
     * @param RegisteredInstancesCount Specifies the number of instances in the target group.
     */
    public void setRegisteredInstancesCount(Long RegisteredInstancesCount) {
        this.RegisteredInstancesCount = RegisteredInstancesCount;
    }

    /**
     * Get Tag. 
     * @return Tag Tag.
     */
    public TagInfo [] getTag() {
        return this.Tag;
    }

    /**
     * Set Tag.
     * @param Tag Tag.
     */
    public void setTag(TagInfo [] Tag) {
        this.Tag = Tag;
    }

    /**
     * Get Default weight. only target groups of v2 type return this field. when NULL is returned, it means the default weight is not set.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Weight Default weight. only target groups of v2 type return this field. when NULL is returned, it means the default weight is not set.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getWeight() {
        return this.Weight;
    }

    /**
     * Set Default weight. only target groups of v2 type return this field. when NULL is returned, it means the default weight is not set.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Weight Default weight. only target groups of v2 type return this field. when NULL is returned, it means the default weight is not set.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setWeight(Long Weight) {
        this.Weight = Weight;
    }

    /**
     * Get Specifies whether to listen to all target groups. 
     * @return FullListenSwitch Specifies whether to listen to all target groups.
     */
    public Boolean getFullListenSwitch() {
        return this.FullListenSwitch;
    }

    /**
     * Set Specifies whether to listen to all target groups.
     * @param FullListenSwitch Specifies whether to listen to all target groups.
     */
    public void setFullListenSwitch(Boolean FullListenSwitch) {
        this.FullListenSwitch = FullListenSwitch;
    }

    /**
     * Get Whether to enable persistent connections. valid only when the backend forwarding protocol is HTTP/HTTPS/GRPC and returned by the target group. 
     * @return KeepaliveEnable Whether to enable persistent connections. valid only when the backend forwarding protocol is HTTP/HTTPS/GRPC and returned by the target group.
     */
    public Boolean getKeepaliveEnable() {
        return this.KeepaliveEnable;
    }

    /**
     * Set Whether to enable persistent connections. valid only when the backend forwarding protocol is HTTP/HTTPS/GRPC and returned by the target group.
     * @param KeepaliveEnable Whether to enable persistent connections. valid only when the backend forwarding protocol is HTTP/HTTPS/GRPC and returned by the target group.
     */
    public void setKeepaliveEnable(Boolean KeepaliveEnable) {
        this.KeepaliveEnable = KeepaliveEnable;
    }

    /**
     * Get Session persistence time. valid only when the backend forwarding protocol is HTTP/HTTPS/GRPC and the target group returns a valid value. 
     * @return SessionExpireTime Session persistence time. valid only when the backend forwarding protocol is HTTP/HTTPS/GRPC and the target group returns a valid value.
     */
    public Long getSessionExpireTime() {
        return this.SessionExpireTime;
    }

    /**
     * Set Session persistence time. valid only when the backend forwarding protocol is HTTP/HTTPS/GRPC and the target group returns a valid value.
     * @param SessionExpireTime Session persistence time. valid only when the backend forwarding protocol is HTTP/HTTPS/GRPC and the target group returns a valid value.
     */
    public void setSessionExpireTime(Long SessionExpireTime) {
        this.SessionExpireTime = SessionExpireTime;
    }

    /**
     * Get IP version. 
     * @return IpVersion IP version.
     */
    public String getIpVersion() {
        return this.IpVersion;
    }

    /**
     * Set IP version.
     * @param IpVersion IP version.
     */
    public void setIpVersion(String IpVersion) {
        this.IpVersion = IpVersion;
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

    }
}

