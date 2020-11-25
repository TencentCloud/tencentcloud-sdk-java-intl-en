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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RedisCommonInstanceList extends AbstractModel{

    /**
    * Instance name
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * Instance ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * User ID
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * Project ID of the instance
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * Instance region
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * Instance availability zone
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * Instance network ID
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * Subnet ID
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * Instance status. Valid values: `0` (creating), `1` (running)
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Instance network IP
    */
    @SerializedName("Vips")
    @Expose
    private String [] Vips;

    /**
    * Instance network port
    */
    @SerializedName("Vport")
    @Expose
    private Long Vport;

    /**
    * Instance creation time
    */
    @SerializedName("Createtime")
    @Expose
    private String Createtime;

    /**
    * Billing mode. Valid values: `0` (pay-as-you-go), `1` (monthly subscription)
    */
    @SerializedName("PayMode")
    @Expose
    private Long PayMode;

    /**
    * Network type. Valid values: `0` (classic network), `1` (VPC)
    */
    @SerializedName("NetType")
    @Expose
    private Long NetType;

    /**
     * Get Instance name 
     * @return InstanceName Instance name
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set Instance name
     * @param InstanceName Instance name
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get Instance ID 
     * @return InstanceId Instance ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID
     * @param InstanceId Instance ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get User ID 
     * @return AppId User ID
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set User ID
     * @param AppId User ID
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get Project ID of the instance 
     * @return ProjectId Project ID of the instance
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Project ID of the instance
     * @param ProjectId Project ID of the instance
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get Instance region 
     * @return Region Instance region
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set Instance region
     * @param Region Instance region
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get Instance availability zone 
     * @return Zone Instance availability zone
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set Instance availability zone
     * @param Zone Instance availability zone
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get Instance network ID 
     * @return VpcId Instance network ID
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set Instance network ID
     * @param VpcId Instance network ID
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get Subnet ID 
     * @return SubnetId Subnet ID
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set Subnet ID
     * @param SubnetId Subnet ID
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get Instance status. Valid values: `0` (creating), `1` (running) 
     * @return Status Instance status. Valid values: `0` (creating), `1` (running)
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Instance status. Valid values: `0` (creating), `1` (running)
     * @param Status Instance status. Valid values: `0` (creating), `1` (running)
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Instance network IP 
     * @return Vips Instance network IP
     */
    public String [] getVips() {
        return this.Vips;
    }

    /**
     * Set Instance network IP
     * @param Vips Instance network IP
     */
    public void setVips(String [] Vips) {
        this.Vips = Vips;
    }

    /**
     * Get Instance network port 
     * @return Vport Instance network port
     */
    public Long getVport() {
        return this.Vport;
    }

    /**
     * Set Instance network port
     * @param Vport Instance network port
     */
    public void setVport(Long Vport) {
        this.Vport = Vport;
    }

    /**
     * Get Instance creation time 
     * @return Createtime Instance creation time
     */
    public String getCreatetime() {
        return this.Createtime;
    }

    /**
     * Set Instance creation time
     * @param Createtime Instance creation time
     */
    public void setCreatetime(String Createtime) {
        this.Createtime = Createtime;
    }

    /**
     * Get Billing mode. Valid values: `0` (pay-as-you-go), `1` (monthly subscription) 
     * @return PayMode Billing mode. Valid values: `0` (pay-as-you-go), `1` (monthly subscription)
     */
    public Long getPayMode() {
        return this.PayMode;
    }

    /**
     * Set Billing mode. Valid values: `0` (pay-as-you-go), `1` (monthly subscription)
     * @param PayMode Billing mode. Valid values: `0` (pay-as-you-go), `1` (monthly subscription)
     */
    public void setPayMode(Long PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get Network type. Valid values: `0` (classic network), `1` (VPC) 
     * @return NetType Network type. Valid values: `0` (classic network), `1` (VPC)
     */
    public Long getNetType() {
        return this.NetType;
    }

    /**
     * Set Network type. Valid values: `0` (classic network), `1` (VPC)
     * @param NetType Network type. Valid values: `0` (classic network), `1` (VPC)
     */
    public void setNetType(Long NetType) {
        this.NetType = NetType;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArraySimple(map, prefix + "Vips.", this.Vips);
        this.setParamSimple(map, prefix + "Vport", this.Vport);
        this.setParamSimple(map, prefix + "Createtime", this.Createtime);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "NetType", this.NetType);

    }
}

