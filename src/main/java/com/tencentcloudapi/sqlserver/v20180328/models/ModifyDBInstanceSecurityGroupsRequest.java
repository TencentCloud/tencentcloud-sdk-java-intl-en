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
package com.tencentcloudapi.sqlserver.v20180328.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyDBInstanceSecurityGroupsRequest extends AbstractModel {

    /**
    * Instance ID, in the format of mssql-c1nl9rpv or mssqlro-c1nl9rpv, which is the same as that displayed on the cloud database console page.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * List of security group IDs to be modified, which is an array of one or more security group IDs.
    */
    @SerializedName("SecurityGroupIdSet")
    @Expose
    private String [] SecurityGroupIdSet;

    /**
     * Get Instance ID, in the format of mssql-c1nl9rpv or mssqlro-c1nl9rpv, which is the same as that displayed on the cloud database console page. 
     * @return InstanceId Instance ID, in the format of mssql-c1nl9rpv or mssqlro-c1nl9rpv, which is the same as that displayed on the cloud database console page.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID, in the format of mssql-c1nl9rpv or mssqlro-c1nl9rpv, which is the same as that displayed on the cloud database console page.
     * @param InstanceId Instance ID, in the format of mssql-c1nl9rpv or mssqlro-c1nl9rpv, which is the same as that displayed on the cloud database console page.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get List of security group IDs to be modified, which is an array of one or more security group IDs. 
     * @return SecurityGroupIdSet List of security group IDs to be modified, which is an array of one or more security group IDs.
     */
    public String [] getSecurityGroupIdSet() {
        return this.SecurityGroupIdSet;
    }

    /**
     * Set List of security group IDs to be modified, which is an array of one or more security group IDs.
     * @param SecurityGroupIdSet List of security group IDs to be modified, which is an array of one or more security group IDs.
     */
    public void setSecurityGroupIdSet(String [] SecurityGroupIdSet) {
        this.SecurityGroupIdSet = SecurityGroupIdSet;
    }

    public ModifyDBInstanceSecurityGroupsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyDBInstanceSecurityGroupsRequest(ModifyDBInstanceSecurityGroupsRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.SecurityGroupIdSet != null) {
            this.SecurityGroupIdSet = new String[source.SecurityGroupIdSet.length];
            for (int i = 0; i < source.SecurityGroupIdSet.length; i++) {
                this.SecurityGroupIdSet[i] = new String(source.SecurityGroupIdSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamArraySimple(map, prefix + "SecurityGroupIdSet.", this.SecurityGroupIdSet);

    }
}

