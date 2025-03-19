/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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

public class TargetGroupInfo extends AbstractModel {

    /**
    * Target group ID
    */
    @SerializedName("TargetGroupId")
    @Expose
    private String TargetGroupId;

    /**
    * VPCID of target group
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
    * Default port of a target group

Note: This field may return null, indicating that no valid value can be obtained.
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
    * Associated rule array. This parameter cannot be obtained when the DescribeTargetGroupList API is called.Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("AssociatedRule")
    @Expose
    private AssociationItem [] AssociatedRule;

    /**
    * Backend protocol type.Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * Scheduling algorithm.
ip_hash_3: elastic hashing
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("ScheduleAlgorithm")
    @Expose
    private String ScheduleAlgorithm;

    /**
    * Health check details.Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("HealthCheck")
    @Expose
    private TargetGroupHealthCheck HealthCheck;

    /**
    * Whether "All Dead, All Alive" is supported.Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("AllDeadToAlive")
    @Expose
    private Boolean AllDeadToAlive;

    /**
    * Number of rules associated with the target group.Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("AssociatedRuleCount")
    @Expose
    private Long AssociatedRuleCount;

    /**
    * Number of instances in the target group.Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("RegisteredInstancesCount")
    @Expose
    private Long RegisteredInstancesCount;

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
     * Get VPCID of target group 
     * @return VpcId VPCID of target group
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set VPCID of target group
     * @param VpcId VPCID of target group
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
     * Get Default port of a target group

Note: This field may return null, indicating that no valid value can be obtained. 
     * @return Port Default port of a target group

Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set Default port of a target group

Note: This field may return null, indicating that no valid value can be obtained.
     * @param Port Default port of a target group

Note: This field may return null, indicating that no valid value can be obtained.
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
     * Get Associated rule array. This parameter cannot be obtained when the DescribeTargetGroupList API is called.Note: This field may return null, indicating that no valid value can be obtained. 
     * @return AssociatedRule Associated rule array. This parameter cannot be obtained when the DescribeTargetGroupList API is called.Note: This field may return null, indicating that no valid value can be obtained.
     */
    public AssociationItem [] getAssociatedRule() {
        return this.AssociatedRule;
    }

    /**
     * Set Associated rule array. This parameter cannot be obtained when the DescribeTargetGroupList API is called.Note: This field may return null, indicating that no valid value can be obtained.
     * @param AssociatedRule Associated rule array. This parameter cannot be obtained when the DescribeTargetGroupList API is called.Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setAssociatedRule(AssociationItem [] AssociatedRule) {
        this.AssociatedRule = AssociatedRule;
    }

    /**
     * Get Backend protocol type.Note: This field may return null, indicating that no valid value can be obtained. 
     * @return Protocol Backend protocol type.Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set Backend protocol type.Note: This field may return null, indicating that no valid value can be obtained.
     * @param Protocol Backend protocol type.Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get Scheduling algorithm.
ip_hash_3: elastic hashing
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return ScheduleAlgorithm Scheduling algorithm.
ip_hash_3: elastic hashing
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getScheduleAlgorithm() {
        return this.ScheduleAlgorithm;
    }

    /**
     * Set Scheduling algorithm.
ip_hash_3: elastic hashing
Note: This field may return null, indicating that no valid value can be obtained.
     * @param ScheduleAlgorithm Scheduling algorithm.
ip_hash_3: elastic hashing
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setScheduleAlgorithm(String ScheduleAlgorithm) {
        this.ScheduleAlgorithm = ScheduleAlgorithm;
    }

    /**
     * Get Health check details.Note: This field may return null, indicating that no valid value can be obtained. 
     * @return HealthCheck Health check details.Note: This field may return null, indicating that no valid value can be obtained.
     */
    public TargetGroupHealthCheck getHealthCheck() {
        return this.HealthCheck;
    }

    /**
     * Set Health check details.Note: This field may return null, indicating that no valid value can be obtained.
     * @param HealthCheck Health check details.Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setHealthCheck(TargetGroupHealthCheck HealthCheck) {
        this.HealthCheck = HealthCheck;
    }

    /**
     * Get Whether "All Dead, All Alive" is supported.Note: This field may return null, indicating that no valid value can be obtained. 
     * @return AllDeadToAlive Whether "All Dead, All Alive" is supported.Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Boolean getAllDeadToAlive() {
        return this.AllDeadToAlive;
    }

    /**
     * Set Whether "All Dead, All Alive" is supported.Note: This field may return null, indicating that no valid value can be obtained.
     * @param AllDeadToAlive Whether "All Dead, All Alive" is supported.Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setAllDeadToAlive(Boolean AllDeadToAlive) {
        this.AllDeadToAlive = AllDeadToAlive;
    }

    /**
     * Get Number of rules associated with the target group.Note: This field may return null, indicating that no valid value can be obtained. 
     * @return AssociatedRuleCount Number of rules associated with the target group.Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getAssociatedRuleCount() {
        return this.AssociatedRuleCount;
    }

    /**
     * Set Number of rules associated with the target group.Note: This field may return null, indicating that no valid value can be obtained.
     * @param AssociatedRuleCount Number of rules associated with the target group.Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setAssociatedRuleCount(Long AssociatedRuleCount) {
        this.AssociatedRuleCount = AssociatedRuleCount;
    }

    /**
     * Get Number of instances in the target group.Note: This field may return null, indicating that no valid value can be obtained. 
     * @return RegisteredInstancesCount Number of instances in the target group.Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getRegisteredInstancesCount() {
        return this.RegisteredInstancesCount;
    }

    /**
     * Set Number of instances in the target group.Note: This field may return null, indicating that no valid value can be obtained.
     * @param RegisteredInstancesCount Number of instances in the target group.Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setRegisteredInstancesCount(Long RegisteredInstancesCount) {
        this.RegisteredInstancesCount = RegisteredInstancesCount;
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
        if (source.AllDeadToAlive != null) {
            this.AllDeadToAlive = new Boolean(source.AllDeadToAlive);
        }
        if (source.AssociatedRuleCount != null) {
            this.AssociatedRuleCount = new Long(source.AssociatedRuleCount);
        }
        if (source.RegisteredInstancesCount != null) {
            this.RegisteredInstancesCount = new Long(source.RegisteredInstancesCount);
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
        this.setParamSimple(map, prefix + "AllDeadToAlive", this.AllDeadToAlive);
        this.setParamSimple(map, prefix + "AssociatedRuleCount", this.AssociatedRuleCount);
        this.setParamSimple(map, prefix + "RegisteredInstancesCount", this.RegisteredInstancesCount);

    }
}

