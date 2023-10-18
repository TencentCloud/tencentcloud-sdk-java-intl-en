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
    * Default port of target group
Note: this field may return null, indicating that no valid values can be obtained.
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
    * Array of associated rules
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AssociatedRule")
    @Expose
    private AssociationItem [] AssociatedRule;

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
     * Get Default port of target group
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Port Default port of target group
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set Default port of target group
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Port Default port of target group
Note: this field may return null, indicating that no valid values can be obtained.
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
     * Get Array of associated rules
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return AssociatedRule Array of associated rules
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public AssociationItem [] getAssociatedRule() {
        return this.AssociatedRule;
    }

    /**
     * Set Array of associated rules
Note: this field may return null, indicating that no valid values can be obtained.
     * @param AssociatedRule Array of associated rules
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setAssociatedRule(AssociationItem [] AssociatedRule) {
        this.AssociatedRule = AssociatedRule;
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

    }
}

