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
package com.tencentcloudapi.tdmq.v20200217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VpcBindRecord extends AbstractModel {

    /**
    * Tenant VPC ID
    */
    @SerializedName("UniqueVpcId")
    @Expose
    private String UniqueVpcId;

    /**
    * Tenant VPC subnet ID
    */
    @SerializedName("UniqueSubnetId")
    @Expose
    private String UniqueSubnetId;

    /**
    * Route ID
    */
    @SerializedName("RouterId")
    @Expose
    private String RouterId;

    /**
    * VPC ID
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * VPC port
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * Remarks (up to 128 characters)
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
     * Get Tenant VPC ID 
     * @return UniqueVpcId Tenant VPC ID
     */
    public String getUniqueVpcId() {
        return this.UniqueVpcId;
    }

    /**
     * Set Tenant VPC ID
     * @param UniqueVpcId Tenant VPC ID
     */
    public void setUniqueVpcId(String UniqueVpcId) {
        this.UniqueVpcId = UniqueVpcId;
    }

    /**
     * Get Tenant VPC subnet ID 
     * @return UniqueSubnetId Tenant VPC subnet ID
     */
    public String getUniqueSubnetId() {
        return this.UniqueSubnetId;
    }

    /**
     * Set Tenant VPC subnet ID
     * @param UniqueSubnetId Tenant VPC subnet ID
     */
    public void setUniqueSubnetId(String UniqueSubnetId) {
        this.UniqueSubnetId = UniqueSubnetId;
    }

    /**
     * Get Route ID 
     * @return RouterId Route ID
     */
    public String getRouterId() {
        return this.RouterId;
    }

    /**
     * Set Route ID
     * @param RouterId Route ID
     */
    public void setRouterId(String RouterId) {
        this.RouterId = RouterId;
    }

    /**
     * Get VPC ID 
     * @return Ip VPC ID
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set VPC ID
     * @param Ip VPC ID
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * Get VPC port 
     * @return Port VPC port
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set VPC port
     * @param Port VPC port
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get Remarks (up to 128 characters)
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Remark Remarks (up to 128 characters)
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set Remarks (up to 128 characters)
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Remark Remarks (up to 128 characters)
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    public VpcBindRecord() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VpcBindRecord(VpcBindRecord source) {
        if (source.UniqueVpcId != null) {
            this.UniqueVpcId = new String(source.UniqueVpcId);
        }
        if (source.UniqueSubnetId != null) {
            this.UniqueSubnetId = new String(source.UniqueSubnetId);
        }
        if (source.RouterId != null) {
            this.RouterId = new String(source.RouterId);
        }
        if (source.Ip != null) {
            this.Ip = new String(source.Ip);
        }
        if (source.Port != null) {
            this.Port = new Long(source.Port);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UniqueVpcId", this.UniqueVpcId);
        this.setParamSimple(map, prefix + "UniqueSubnetId", this.UniqueSubnetId);
        this.setParamSimple(map, prefix + "RouterId", this.RouterId);
        this.setParamSimple(map, prefix + "Ip", this.Ip);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "Remark", this.Remark);

    }
}

