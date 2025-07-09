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
package com.tencentcloudapi.ecm.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SecurityGroupLimitSet extends AbstractModel {

    /**
    * Total number of security groups that can be created
    */
    @SerializedName("SecurityGroupLimit")
    @Expose
    private Long SecurityGroupLimit;

    /**
    * Maximum number of rules under the security group
    */
    @SerializedName("SecurityGroupPolicyLimit")
    @Expose
    private Long SecurityGroupPolicyLimit;

    /**
    * Number of nested security group rules under the security group
    */
    @SerializedName("ReferedSecurityGroupLimit")
    @Expose
    private Long ReferedSecurityGroupLimit;

    /**
    * Number of instances associated with the security group
    */
    @SerializedName("SecurityGroupInstanceLimit")
    @Expose
    private Long SecurityGroupInstanceLimit;

    /**
    * Number of security groups associated with the instance
    */
    @SerializedName("InstanceSecurityGroupLimit")
    @Expose
    private Long InstanceSecurityGroupLimit;

    /**
    * Number of modules associated with the security group
    */
    @SerializedName("SecurityGroupModuleLimit")
    @Expose
    private Long SecurityGroupModuleLimit;

    /**
    * Number of security groups associated with the module
    */
    @SerializedName("ModuleSecurityGroupLimit")
    @Expose
    private Long ModuleSecurityGroupLimit;

    /**
     * Get Total number of security groups that can be created 
     * @return SecurityGroupLimit Total number of security groups that can be created
     */
    public Long getSecurityGroupLimit() {
        return this.SecurityGroupLimit;
    }

    /**
     * Set Total number of security groups that can be created
     * @param SecurityGroupLimit Total number of security groups that can be created
     */
    public void setSecurityGroupLimit(Long SecurityGroupLimit) {
        this.SecurityGroupLimit = SecurityGroupLimit;
    }

    /**
     * Get Maximum number of rules under the security group 
     * @return SecurityGroupPolicyLimit Maximum number of rules under the security group
     */
    public Long getSecurityGroupPolicyLimit() {
        return this.SecurityGroupPolicyLimit;
    }

    /**
     * Set Maximum number of rules under the security group
     * @param SecurityGroupPolicyLimit Maximum number of rules under the security group
     */
    public void setSecurityGroupPolicyLimit(Long SecurityGroupPolicyLimit) {
        this.SecurityGroupPolicyLimit = SecurityGroupPolicyLimit;
    }

    /**
     * Get Number of nested security group rules under the security group 
     * @return ReferedSecurityGroupLimit Number of nested security group rules under the security group
     */
    public Long getReferedSecurityGroupLimit() {
        return this.ReferedSecurityGroupLimit;
    }

    /**
     * Set Number of nested security group rules under the security group
     * @param ReferedSecurityGroupLimit Number of nested security group rules under the security group
     */
    public void setReferedSecurityGroupLimit(Long ReferedSecurityGroupLimit) {
        this.ReferedSecurityGroupLimit = ReferedSecurityGroupLimit;
    }

    /**
     * Get Number of instances associated with the security group 
     * @return SecurityGroupInstanceLimit Number of instances associated with the security group
     */
    public Long getSecurityGroupInstanceLimit() {
        return this.SecurityGroupInstanceLimit;
    }

    /**
     * Set Number of instances associated with the security group
     * @param SecurityGroupInstanceLimit Number of instances associated with the security group
     */
    public void setSecurityGroupInstanceLimit(Long SecurityGroupInstanceLimit) {
        this.SecurityGroupInstanceLimit = SecurityGroupInstanceLimit;
    }

    /**
     * Get Number of security groups associated with the instance 
     * @return InstanceSecurityGroupLimit Number of security groups associated with the instance
     */
    public Long getInstanceSecurityGroupLimit() {
        return this.InstanceSecurityGroupLimit;
    }

    /**
     * Set Number of security groups associated with the instance
     * @param InstanceSecurityGroupLimit Number of security groups associated with the instance
     */
    public void setInstanceSecurityGroupLimit(Long InstanceSecurityGroupLimit) {
        this.InstanceSecurityGroupLimit = InstanceSecurityGroupLimit;
    }

    /**
     * Get Number of modules associated with the security group 
     * @return SecurityGroupModuleLimit Number of modules associated with the security group
     */
    public Long getSecurityGroupModuleLimit() {
        return this.SecurityGroupModuleLimit;
    }

    /**
     * Set Number of modules associated with the security group
     * @param SecurityGroupModuleLimit Number of modules associated with the security group
     */
    public void setSecurityGroupModuleLimit(Long SecurityGroupModuleLimit) {
        this.SecurityGroupModuleLimit = SecurityGroupModuleLimit;
    }

    /**
     * Get Number of security groups associated with the module 
     * @return ModuleSecurityGroupLimit Number of security groups associated with the module
     */
    public Long getModuleSecurityGroupLimit() {
        return this.ModuleSecurityGroupLimit;
    }

    /**
     * Set Number of security groups associated with the module
     * @param ModuleSecurityGroupLimit Number of security groups associated with the module
     */
    public void setModuleSecurityGroupLimit(Long ModuleSecurityGroupLimit) {
        this.ModuleSecurityGroupLimit = ModuleSecurityGroupLimit;
    }

    public SecurityGroupLimitSet() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SecurityGroupLimitSet(SecurityGroupLimitSet source) {
        if (source.SecurityGroupLimit != null) {
            this.SecurityGroupLimit = new Long(source.SecurityGroupLimit);
        }
        if (source.SecurityGroupPolicyLimit != null) {
            this.SecurityGroupPolicyLimit = new Long(source.SecurityGroupPolicyLimit);
        }
        if (source.ReferedSecurityGroupLimit != null) {
            this.ReferedSecurityGroupLimit = new Long(source.ReferedSecurityGroupLimit);
        }
        if (source.SecurityGroupInstanceLimit != null) {
            this.SecurityGroupInstanceLimit = new Long(source.SecurityGroupInstanceLimit);
        }
        if (source.InstanceSecurityGroupLimit != null) {
            this.InstanceSecurityGroupLimit = new Long(source.InstanceSecurityGroupLimit);
        }
        if (source.SecurityGroupModuleLimit != null) {
            this.SecurityGroupModuleLimit = new Long(source.SecurityGroupModuleLimit);
        }
        if (source.ModuleSecurityGroupLimit != null) {
            this.ModuleSecurityGroupLimit = new Long(source.ModuleSecurityGroupLimit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SecurityGroupLimit", this.SecurityGroupLimit);
        this.setParamSimple(map, prefix + "SecurityGroupPolicyLimit", this.SecurityGroupPolicyLimit);
        this.setParamSimple(map, prefix + "ReferedSecurityGroupLimit", this.ReferedSecurityGroupLimit);
        this.setParamSimple(map, prefix + "SecurityGroupInstanceLimit", this.SecurityGroupInstanceLimit);
        this.setParamSimple(map, prefix + "InstanceSecurityGroupLimit", this.InstanceSecurityGroupLimit);
        this.setParamSimple(map, prefix + "SecurityGroupModuleLimit", this.SecurityGroupModuleLimit);
        this.setParamSimple(map, prefix + "ModuleSecurityGroupLimit", this.ModuleSecurityGroupLimit);

    }
}

