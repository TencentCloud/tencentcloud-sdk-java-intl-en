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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AddServerlessRoInstancesRequest extends AbstractModel {

    /**
    * <p>Cluster Id</p>
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * <p>Minimum specification of the ro instance</p>
    */
    @SerializedName("MinCpu")
    @Expose
    private Float MinCpu;

    /**
    * <p>Maximum specification of ro instance</p>
    */
    @SerializedName("MaxCpu")
    @Expose
    private Float MaxCpu;

    /**
    * <p>ro instance name</p>
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * <p>VPC network ID</p>
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * <p>Subnet ID. If VpcId is set up, SubnetId is required.</p>
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * <p>Port used when adding new RO groups, value range [0,65535)</p>
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * <p>Security group ID. You can specify security groups when creating a read-only instance.</p>
    */
    @SerializedName("SecurityGroupIds")
    @Expose
    private String [] SecurityGroupIds;

    /**
    * <p>Whether to automatically pause</p><p>Enumeration value:</p><ul><li>yes: Yes</li><li>no: No</li></ul>
    */
    @SerializedName("AutoPause")
    @Expose
    private String AutoPause;

    /**
    * <p>Auto-pause time</p><p>Unit: s</p>
    */
    @SerializedName("AutoPauseDelay")
    @Expose
    private Long AutoPauseDelay;

    /**
    * <p>Instance parameter</p>
    */
    @SerializedName("InstanceParams")
    @Expose
    private ModifyParamItem [] InstanceParams;

    /**
    * <p>Parameter template</p>
    */
    @SerializedName("ParamTemplateId")
    @Expose
    private Long ParamTemplateId;

    /**
    * <p>Number of newly-added read-only instances</p>
    */
    @SerializedName("RoCount")
    @Expose
    private Long RoCount;

    /**
     * Get <p>Cluster Id</p> 
     * @return ClusterId <p>Cluster Id</p>
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set <p>Cluster Id</p>
     * @param ClusterId <p>Cluster Id</p>
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get <p>Minimum specification of the ro instance</p> 
     * @return MinCpu <p>Minimum specification of the ro instance</p>
     */
    public Float getMinCpu() {
        return this.MinCpu;
    }

    /**
     * Set <p>Minimum specification of the ro instance</p>
     * @param MinCpu <p>Minimum specification of the ro instance</p>
     */
    public void setMinCpu(Float MinCpu) {
        this.MinCpu = MinCpu;
    }

    /**
     * Get <p>Maximum specification of ro instance</p> 
     * @return MaxCpu <p>Maximum specification of ro instance</p>
     */
    public Float getMaxCpu() {
        return this.MaxCpu;
    }

    /**
     * Set <p>Maximum specification of ro instance</p>
     * @param MaxCpu <p>Maximum specification of ro instance</p>
     */
    public void setMaxCpu(Float MaxCpu) {
        this.MaxCpu = MaxCpu;
    }

    /**
     * Get <p>ro instance name</p> 
     * @return InstanceName <p>ro instance name</p>
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set <p>ro instance name</p>
     * @param InstanceName <p>ro instance name</p>
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get <p>VPC network ID</p> 
     * @return VpcId <p>VPC network ID</p>
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set <p>VPC network ID</p>
     * @param VpcId <p>VPC network ID</p>
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get <p>Subnet ID. If VpcId is set up, SubnetId is required.</p> 
     * @return SubnetId <p>Subnet ID. If VpcId is set up, SubnetId is required.</p>
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set <p>Subnet ID. If VpcId is set up, SubnetId is required.</p>
     * @param SubnetId <p>Subnet ID. If VpcId is set up, SubnetId is required.</p>
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get <p>Port used when adding new RO groups, value range [0,65535)</p> 
     * @return Port <p>Port used when adding new RO groups, value range [0,65535)</p>
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set <p>Port used when adding new RO groups, value range [0,65535)</p>
     * @param Port <p>Port used when adding new RO groups, value range [0,65535)</p>
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get <p>Security group ID. You can specify security groups when creating a read-only instance.</p> 
     * @return SecurityGroupIds <p>Security group ID. You can specify security groups when creating a read-only instance.</p>
     */
    public String [] getSecurityGroupIds() {
        return this.SecurityGroupIds;
    }

    /**
     * Set <p>Security group ID. You can specify security groups when creating a read-only instance.</p>
     * @param SecurityGroupIds <p>Security group ID. You can specify security groups when creating a read-only instance.</p>
     */
    public void setSecurityGroupIds(String [] SecurityGroupIds) {
        this.SecurityGroupIds = SecurityGroupIds;
    }

    /**
     * Get <p>Whether to automatically pause</p><p>Enumeration value:</p><ul><li>yes: Yes</li><li>no: No</li></ul> 
     * @return AutoPause <p>Whether to automatically pause</p><p>Enumeration value:</p><ul><li>yes: Yes</li><li>no: No</li></ul>
     */
    public String getAutoPause() {
        return this.AutoPause;
    }

    /**
     * Set <p>Whether to automatically pause</p><p>Enumeration value:</p><ul><li>yes: Yes</li><li>no: No</li></ul>
     * @param AutoPause <p>Whether to automatically pause</p><p>Enumeration value:</p><ul><li>yes: Yes</li><li>no: No</li></ul>
     */
    public void setAutoPause(String AutoPause) {
        this.AutoPause = AutoPause;
    }

    /**
     * Get <p>Auto-pause time</p><p>Unit: s</p> 
     * @return AutoPauseDelay <p>Auto-pause time</p><p>Unit: s</p>
     */
    public Long getAutoPauseDelay() {
        return this.AutoPauseDelay;
    }

    /**
     * Set <p>Auto-pause time</p><p>Unit: s</p>
     * @param AutoPauseDelay <p>Auto-pause time</p><p>Unit: s</p>
     */
    public void setAutoPauseDelay(Long AutoPauseDelay) {
        this.AutoPauseDelay = AutoPauseDelay;
    }

    /**
     * Get <p>Instance parameter</p> 
     * @return InstanceParams <p>Instance parameter</p>
     */
    public ModifyParamItem [] getInstanceParams() {
        return this.InstanceParams;
    }

    /**
     * Set <p>Instance parameter</p>
     * @param InstanceParams <p>Instance parameter</p>
     */
    public void setInstanceParams(ModifyParamItem [] InstanceParams) {
        this.InstanceParams = InstanceParams;
    }

    /**
     * Get <p>Parameter template</p> 
     * @return ParamTemplateId <p>Parameter template</p>
     */
    public Long getParamTemplateId() {
        return this.ParamTemplateId;
    }

    /**
     * Set <p>Parameter template</p>
     * @param ParamTemplateId <p>Parameter template</p>
     */
    public void setParamTemplateId(Long ParamTemplateId) {
        this.ParamTemplateId = ParamTemplateId;
    }

    /**
     * Get <p>Number of newly-added read-only instances</p> 
     * @return RoCount <p>Number of newly-added read-only instances</p>
     */
    public Long getRoCount() {
        return this.RoCount;
    }

    /**
     * Set <p>Number of newly-added read-only instances</p>
     * @param RoCount <p>Number of newly-added read-only instances</p>
     */
    public void setRoCount(Long RoCount) {
        this.RoCount = RoCount;
    }

    public AddServerlessRoInstancesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AddServerlessRoInstancesRequest(AddServerlessRoInstancesRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.MinCpu != null) {
            this.MinCpu = new Float(source.MinCpu);
        }
        if (source.MaxCpu != null) {
            this.MaxCpu = new Float(source.MaxCpu);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.Port != null) {
            this.Port = new Long(source.Port);
        }
        if (source.SecurityGroupIds != null) {
            this.SecurityGroupIds = new String[source.SecurityGroupIds.length];
            for (int i = 0; i < source.SecurityGroupIds.length; i++) {
                this.SecurityGroupIds[i] = new String(source.SecurityGroupIds[i]);
            }
        }
        if (source.AutoPause != null) {
            this.AutoPause = new String(source.AutoPause);
        }
        if (source.AutoPauseDelay != null) {
            this.AutoPauseDelay = new Long(source.AutoPauseDelay);
        }
        if (source.InstanceParams != null) {
            this.InstanceParams = new ModifyParamItem[source.InstanceParams.length];
            for (int i = 0; i < source.InstanceParams.length; i++) {
                this.InstanceParams[i] = new ModifyParamItem(source.InstanceParams[i]);
            }
        }
        if (source.ParamTemplateId != null) {
            this.ParamTemplateId = new Long(source.ParamTemplateId);
        }
        if (source.RoCount != null) {
            this.RoCount = new Long(source.RoCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "MinCpu", this.MinCpu);
        this.setParamSimple(map, prefix + "MaxCpu", this.MaxCpu);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamArraySimple(map, prefix + "SecurityGroupIds.", this.SecurityGroupIds);
        this.setParamSimple(map, prefix + "AutoPause", this.AutoPause);
        this.setParamSimple(map, prefix + "AutoPauseDelay", this.AutoPauseDelay);
        this.setParamArrayObj(map, prefix + "InstanceParams.", this.InstanceParams);
        this.setParamSimple(map, prefix + "ParamTemplateId", this.ParamTemplateId);
        this.setParamSimple(map, prefix + "RoCount", this.RoCount);

    }
}

