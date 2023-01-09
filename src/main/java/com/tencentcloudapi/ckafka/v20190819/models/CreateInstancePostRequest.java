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
package com.tencentcloudapi.ckafka.v20190819.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateInstancePostRequest extends AbstractModel{

    /**
    * Instance name, which is a string of up to 64 characters. It can contain letters, digits, and hyphens (-) and must start with a letter.
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * Instance bandwidth
    */
    @SerializedName("BandWidth")
    @Expose
    private Long BandWidth;

    /**
    * VPC ID. If this parameter is left empty, the classic network will be used by default.
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * Subnet ID, which is required for a VPC but not for the classic network.
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * The maximum retention period for instance logs in minutes. Default value: 1,440 minutes (1 day). Max value: 12960 minutes (90 days). This parameter is optional.
    */
    @SerializedName("MsgRetentionTime")
    @Expose
    private Long MsgRetentionTime;

    /**
    * AZ
    */
    @SerializedName("ZoneId")
    @Expose
    private Long ZoneId;

    /**
    * Cluster ID, which can be selected when you create an instance.
    */
    @SerializedName("ClusterId")
    @Expose
    private Long ClusterId;

    /**
     * Get Instance name, which is a string of up to 64 characters. It can contain letters, digits, and hyphens (-) and must start with a letter. 
     * @return InstanceName Instance name, which is a string of up to 64 characters. It can contain letters, digits, and hyphens (-) and must start with a letter.
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set Instance name, which is a string of up to 64 characters. It can contain letters, digits, and hyphens (-) and must start with a letter.
     * @param InstanceName Instance name, which is a string of up to 64 characters. It can contain letters, digits, and hyphens (-) and must start with a letter.
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get Instance bandwidth 
     * @return BandWidth Instance bandwidth
     */
    public Long getBandWidth() {
        return this.BandWidth;
    }

    /**
     * Set Instance bandwidth
     * @param BandWidth Instance bandwidth
     */
    public void setBandWidth(Long BandWidth) {
        this.BandWidth = BandWidth;
    }

    /**
     * Get VPC ID. If this parameter is left empty, the classic network will be used by default. 
     * @return VpcId VPC ID. If this parameter is left empty, the classic network will be used by default.
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set VPC ID. If this parameter is left empty, the classic network will be used by default.
     * @param VpcId VPC ID. If this parameter is left empty, the classic network will be used by default.
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get Subnet ID, which is required for a VPC but not for the classic network. 
     * @return SubnetId Subnet ID, which is required for a VPC but not for the classic network.
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set Subnet ID, which is required for a VPC but not for the classic network.
     * @param SubnetId Subnet ID, which is required for a VPC but not for the classic network.
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get The maximum retention period for instance logs in minutes. Default value: 1,440 minutes (1 day). Max value: 12960 minutes (90 days). This parameter is optional. 
     * @return MsgRetentionTime The maximum retention period for instance logs in minutes. Default value: 1,440 minutes (1 day). Max value: 12960 minutes (90 days). This parameter is optional.
     */
    public Long getMsgRetentionTime() {
        return this.MsgRetentionTime;
    }

    /**
     * Set The maximum retention period for instance logs in minutes. Default value: 1,440 minutes (1 day). Max value: 12960 minutes (90 days). This parameter is optional.
     * @param MsgRetentionTime The maximum retention period for instance logs in minutes. Default value: 1,440 minutes (1 day). Max value: 12960 minutes (90 days). This parameter is optional.
     */
    public void setMsgRetentionTime(Long MsgRetentionTime) {
        this.MsgRetentionTime = MsgRetentionTime;
    }

    /**
     * Get AZ 
     * @return ZoneId AZ
     */
    public Long getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set AZ
     * @param ZoneId AZ
     */
    public void setZoneId(Long ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get Cluster ID, which can be selected when you create an instance. 
     * @return ClusterId Cluster ID, which can be selected when you create an instance.
     */
    public Long getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set Cluster ID, which can be selected when you create an instance.
     * @param ClusterId Cluster ID, which can be selected when you create an instance.
     */
    public void setClusterId(Long ClusterId) {
        this.ClusterId = ClusterId;
    }

    public CreateInstancePostRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateInstancePostRequest(CreateInstancePostRequest source) {
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.BandWidth != null) {
            this.BandWidth = new Long(source.BandWidth);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.MsgRetentionTime != null) {
            this.MsgRetentionTime = new Long(source.MsgRetentionTime);
        }
        if (source.ZoneId != null) {
            this.ZoneId = new Long(source.ZoneId);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new Long(source.ClusterId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "BandWidth", this.BandWidth);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "MsgRetentionTime", this.MsgRetentionTime);
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);

    }
}

