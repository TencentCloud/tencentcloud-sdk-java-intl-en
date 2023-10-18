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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AssociatedInstanceInfo extends AbstractModel {

    /**
    * Instance ID
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Instance name
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * Instance type. 3: CVM instance; 4: CLB instance; 5: ENI instance; 6: Cloud database
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * VPC ID
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * VPC name
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("VpcName")
    @Expose
    private String VpcName;

    /**
    * Public IP
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("PublicIp")
    @Expose
    private String PublicIp;

    /**
    * Private IP
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * The number of associated security groups
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("SecurityGroupCount")
    @Expose
    private Long SecurityGroupCount;

    /**
     * Get Instance ID
Note: This field may return `null`, indicating that no valid value was found. 
     * @return InstanceId Instance ID
Note: This field may return `null`, indicating that no valid value was found.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID
Note: This field may return `null`, indicating that no valid value was found.
     * @param InstanceId Instance ID
Note: This field may return `null`, indicating that no valid value was found.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Instance name
Note: This field may return `null`, indicating that no valid value was found. 
     * @return InstanceName Instance name
Note: This field may return `null`, indicating that no valid value was found.
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set Instance name
Note: This field may return `null`, indicating that no valid value was found.
     * @param InstanceName Instance name
Note: This field may return `null`, indicating that no valid value was found.
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get Instance type. 3: CVM instance; 4: CLB instance; 5: ENI instance; 6: Cloud database
Note: This field may return `null`, indicating that no valid value was found. 
     * @return Type Instance type. 3: CVM instance; 4: CLB instance; 5: ENI instance; 6: Cloud database
Note: This field may return `null`, indicating that no valid value was found.
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set Instance type. 3: CVM instance; 4: CLB instance; 5: ENI instance; 6: Cloud database
Note: This field may return `null`, indicating that no valid value was found.
     * @param Type Instance type. 3: CVM instance; 4: CLB instance; 5: ENI instance; 6: Cloud database
Note: This field may return `null`, indicating that no valid value was found.
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get VPC ID
Note: This field may return `null`, indicating that no valid value was found. 
     * @return VpcId VPC ID
Note: This field may return `null`, indicating that no valid value was found.
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set VPC ID
Note: This field may return `null`, indicating that no valid value was found.
     * @param VpcId VPC ID
Note: This field may return `null`, indicating that no valid value was found.
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get VPC name
Note: This field may return `null`, indicating that no valid value was found. 
     * @return VpcName VPC name
Note: This field may return `null`, indicating that no valid value was found.
     */
    public String getVpcName() {
        return this.VpcName;
    }

    /**
     * Set VPC name
Note: This field may return `null`, indicating that no valid value was found.
     * @param VpcName VPC name
Note: This field may return `null`, indicating that no valid value was found.
     */
    public void setVpcName(String VpcName) {
        this.VpcName = VpcName;
    }

    /**
     * Get Public IP
Note: This field may return `null`, indicating that no valid value was found. 
     * @return PublicIp Public IP
Note: This field may return `null`, indicating that no valid value was found.
     */
    public String getPublicIp() {
        return this.PublicIp;
    }

    /**
     * Set Public IP
Note: This field may return `null`, indicating that no valid value was found.
     * @param PublicIp Public IP
Note: This field may return `null`, indicating that no valid value was found.
     */
    public void setPublicIp(String PublicIp) {
        this.PublicIp = PublicIp;
    }

    /**
     * Get Private IP
Note: This field may return `null`, indicating that no valid value was found. 
     * @return Ip Private IP
Note: This field may return `null`, indicating that no valid value was found.
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set Private IP
Note: This field may return `null`, indicating that no valid value was found.
     * @param Ip Private IP
Note: This field may return `null`, indicating that no valid value was found.
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * Get The number of associated security groups
Note: This field may return `null`, indicating that no valid value was found. 
     * @return SecurityGroupCount The number of associated security groups
Note: This field may return `null`, indicating that no valid value was found.
     */
    public Long getSecurityGroupCount() {
        return this.SecurityGroupCount;
    }

    /**
     * Set The number of associated security groups
Note: This field may return `null`, indicating that no valid value was found.
     * @param SecurityGroupCount The number of associated security groups
Note: This field may return `null`, indicating that no valid value was found.
     */
    public void setSecurityGroupCount(Long SecurityGroupCount) {
        this.SecurityGroupCount = SecurityGroupCount;
    }

    public AssociatedInstanceInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AssociatedInstanceInfo(AssociatedInstanceInfo source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.VpcName != null) {
            this.VpcName = new String(source.VpcName);
        }
        if (source.PublicIp != null) {
            this.PublicIp = new String(source.PublicIp);
        }
        if (source.Ip != null) {
            this.Ip = new String(source.Ip);
        }
        if (source.SecurityGroupCount != null) {
            this.SecurityGroupCount = new Long(source.SecurityGroupCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "VpcName", this.VpcName);
        this.setParamSimple(map, prefix + "PublicIp", this.PublicIp);
        this.setParamSimple(map, prefix + "Ip", this.Ip);
        this.setParamSimple(map, prefix + "SecurityGroupCount", this.SecurityGroupCount);

    }
}

