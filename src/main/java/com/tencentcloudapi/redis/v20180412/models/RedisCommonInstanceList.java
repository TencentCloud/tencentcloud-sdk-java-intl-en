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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RedisCommonInstanceList extends AbstractModel {

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
    * User APPID, which is the unique application ID that matches an account. Some Tencent Cloud products use this APPID.
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
    * Instance AZ
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * Instance VPC ID
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * VPC subnet ID
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * Instance status information
- `1`: Task running.
- `2`: Instance running.
- `-2`: Instance isolated.
- `-3`: Instance being eliminated.
- `-4`: Instance eliminated.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Private network IP address of an instance
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
    * Billing type
- `0`: Pay-as-you-go.
- `1`: Monthly subscription.
    */
    @SerializedName("PayMode")
    @Expose
    private Long PayMode;

    /**
    * Network Type
- `0`: Classic network.
- `1`: VPC.
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
     * Get User APPID, which is the unique application ID that matches an account. Some Tencent Cloud products use this APPID. 
     * @return AppId User APPID, which is the unique application ID that matches an account. Some Tencent Cloud products use this APPID.
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set User APPID, which is the unique application ID that matches an account. Some Tencent Cloud products use this APPID.
     * @param AppId User APPID, which is the unique application ID that matches an account. Some Tencent Cloud products use this APPID.
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
     * Get Instance AZ 
     * @return Zone Instance AZ
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set Instance AZ
     * @param Zone Instance AZ
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get Instance VPC ID 
     * @return VpcId Instance VPC ID
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set Instance VPC ID
     * @param VpcId Instance VPC ID
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get VPC subnet ID 
     * @return SubnetId VPC subnet ID
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set VPC subnet ID
     * @param SubnetId VPC subnet ID
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get Instance status information
- `1`: Task running.
- `2`: Instance running.
- `-2`: Instance isolated.
- `-3`: Instance being eliminated.
- `-4`: Instance eliminated. 
     * @return Status Instance status information
- `1`: Task running.
- `2`: Instance running.
- `-2`: Instance isolated.
- `-3`: Instance being eliminated.
- `-4`: Instance eliminated.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Instance status information
- `1`: Task running.
- `2`: Instance running.
- `-2`: Instance isolated.
- `-3`: Instance being eliminated.
- `-4`: Instance eliminated.
     * @param Status Instance status information
- `1`: Task running.
- `2`: Instance running.
- `-2`: Instance isolated.
- `-3`: Instance being eliminated.
- `-4`: Instance eliminated.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Private network IP address of an instance 
     * @return Vips Private network IP address of an instance
     */
    public String [] getVips() {
        return this.Vips;
    }

    /**
     * Set Private network IP address of an instance
     * @param Vips Private network IP address of an instance
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
     * Get Billing type
- `0`: Pay-as-you-go.
- `1`: Monthly subscription. 
     * @return PayMode Billing type
- `0`: Pay-as-you-go.
- `1`: Monthly subscription.
     */
    public Long getPayMode() {
        return this.PayMode;
    }

    /**
     * Set Billing type
- `0`: Pay-as-you-go.
- `1`: Monthly subscription.
     * @param PayMode Billing type
- `0`: Pay-as-you-go.
- `1`: Monthly subscription.
     */
    public void setPayMode(Long PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get Network Type
- `0`: Classic network.
- `1`: VPC. 
     * @return NetType Network Type
- `0`: Classic network.
- `1`: VPC.
     */
    public Long getNetType() {
        return this.NetType;
    }

    /**
     * Set Network Type
- `0`: Classic network.
- `1`: VPC.
     * @param NetType Network Type
- `0`: Classic network.
- `1`: VPC.
     */
    public void setNetType(Long NetType) {
        this.NetType = NetType;
    }

    public RedisCommonInstanceList() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RedisCommonInstanceList(RedisCommonInstanceList source) {
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Vips != null) {
            this.Vips = new String[source.Vips.length];
            for (int i = 0; i < source.Vips.length; i++) {
                this.Vips[i] = new String(source.Vips[i]);
            }
        }
        if (source.Vport != null) {
            this.Vport = new Long(source.Vport);
        }
        if (source.Createtime != null) {
            this.Createtime = new String(source.Createtime);
        }
        if (source.PayMode != null) {
            this.PayMode = new Long(source.PayMode);
        }
        if (source.NetType != null) {
            this.NetType = new Long(source.NetType);
        }
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

