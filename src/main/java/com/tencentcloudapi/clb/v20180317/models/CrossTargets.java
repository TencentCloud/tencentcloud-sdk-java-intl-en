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

public class CrossTargets extends AbstractModel {

    /**
    * VPC ID of the CLB instance
    */
    @SerializedName("LocalVpcId")
    @Expose
    private String LocalVpcId;

    /**
    * VPC ID of the CVM or ENI instance
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * IP address of the CVM or ENI instance
    */
    @SerializedName("IP")
    @Expose
    private String IP;

    /**
    * VPC name of the CVM or ENI instance
    */
    @SerializedName("VpcName")
    @Expose
    private String VpcName;

    /**
    * ENI ID of the CVM instance
    */
    @SerializedName("EniId")
    @Expose
    private String EniId;

    /**
    * Submachine instance ID.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Submachine instance name.
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * Region of the CVM or ENI instance
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
     * Get VPC ID of the CLB instance 
     * @return LocalVpcId VPC ID of the CLB instance
     */
    public String getLocalVpcId() {
        return this.LocalVpcId;
    }

    /**
     * Set VPC ID of the CLB instance
     * @param LocalVpcId VPC ID of the CLB instance
     */
    public void setLocalVpcId(String LocalVpcId) {
        this.LocalVpcId = LocalVpcId;
    }

    /**
     * Get VPC ID of the CVM or ENI instance 
     * @return VpcId VPC ID of the CVM or ENI instance
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set VPC ID of the CVM or ENI instance
     * @param VpcId VPC ID of the CVM or ENI instance
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get IP address of the CVM or ENI instance 
     * @return IP IP address of the CVM or ENI instance
     */
    public String getIP() {
        return this.IP;
    }

    /**
     * Set IP address of the CVM or ENI instance
     * @param IP IP address of the CVM or ENI instance
     */
    public void setIP(String IP) {
        this.IP = IP;
    }

    /**
     * Get VPC name of the CVM or ENI instance 
     * @return VpcName VPC name of the CVM or ENI instance
     */
    public String getVpcName() {
        return this.VpcName;
    }

    /**
     * Set VPC name of the CVM or ENI instance
     * @param VpcName VPC name of the CVM or ENI instance
     */
    public void setVpcName(String VpcName) {
        this.VpcName = VpcName;
    }

    /**
     * Get ENI ID of the CVM instance 
     * @return EniId ENI ID of the CVM instance
     */
    public String getEniId() {
        return this.EniId;
    }

    /**
     * Set ENI ID of the CVM instance
     * @param EniId ENI ID of the CVM instance
     */
    public void setEniId(String EniId) {
        this.EniId = EniId;
    }

    /**
     * Get Submachine instance ID. 
     * @return InstanceId Submachine instance ID.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Submachine instance ID.
     * @param InstanceId Submachine instance ID.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Submachine instance name. 
     * @return InstanceName Submachine instance name.
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set Submachine instance name.
     * @param InstanceName Submachine instance name.
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get Region of the CVM or ENI instance 
     * @return Region Region of the CVM or ENI instance
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set Region of the CVM or ENI instance
     * @param Region Region of the CVM or ENI instance
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    public CrossTargets() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CrossTargets(CrossTargets source) {
        if (source.LocalVpcId != null) {
            this.LocalVpcId = new String(source.LocalVpcId);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.IP != null) {
            this.IP = new String(source.IP);
        }
        if (source.VpcName != null) {
            this.VpcName = new String(source.VpcName);
        }
        if (source.EniId != null) {
            this.EniId = new String(source.EniId);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LocalVpcId", this.LocalVpcId);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "IP", this.IP);
        this.setParamSimple(map, prefix + "VpcName", this.VpcName);
        this.setParamSimple(map, prefix + "EniId", this.EniId);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "Region", this.Region);

    }
}

