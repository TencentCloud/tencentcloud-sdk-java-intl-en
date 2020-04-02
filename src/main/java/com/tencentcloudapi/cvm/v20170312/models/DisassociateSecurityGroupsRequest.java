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
package com.tencentcloudapi.cvm.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DisassociateSecurityGroupsRequest extends AbstractModel{

    /**
    * ID of the security group to be disassociated, such as `sg-efil73jd`. Only one security group can be disassociated.
    */
    @SerializedName("SecurityGroupIds")
    @Expose
    private String [] SecurityGroupIds;

    /**
    * ID(s) of the instance(s) to be disassociated，such as `ins-lesecurk`. You can specify multiple instances.
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
     * Get ID of the security group to be disassociated, such as `sg-efil73jd`. Only one security group can be disassociated. 
     * @return SecurityGroupIds ID of the security group to be disassociated, such as `sg-efil73jd`. Only one security group can be disassociated.
     */
    public String [] getSecurityGroupIds() {
        return this.SecurityGroupIds;
    }

    /**
     * Set ID of the security group to be disassociated, such as `sg-efil73jd`. Only one security group can be disassociated.
     * @param SecurityGroupIds ID of the security group to be disassociated, such as `sg-efil73jd`. Only one security group can be disassociated.
     */
    public void setSecurityGroupIds(String [] SecurityGroupIds) {
        this.SecurityGroupIds = SecurityGroupIds;
    }

    /**
     * Get ID(s) of the instance(s) to be disassociated，such as `ins-lesecurk`. You can specify multiple instances. 
     * @return InstanceIds ID(s) of the instance(s) to be disassociated，such as `ins-lesecurk`. You can specify multiple instances.
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set ID(s) of the instance(s) to be disassociated，such as `ins-lesecurk`. You can specify multiple instances.
     * @param InstanceIds ID(s) of the instance(s) to be disassociated，such as `ins-lesecurk`. You can specify multiple instances.
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "SecurityGroupIds.", this.SecurityGroupIds);
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);

    }
}

