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

public class DisassociateSecurityGroupsRequest extends AbstractModel {

    /**
    * Array of instance group IDs, starting with the prefix cynosdbmysql-grp- or cluster ID.
Description: To get the instance group ID of a cluster, perform [query cluster instance group](https://www.tencentcloud.com/document/product/1003/103934?from_cn_redirect=1).
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * Security group ID list to modify. An array of one or more security group IDs.
    */
    @SerializedName("SecurityGroupIds")
    @Expose
    private String [] SecurityGroupIds;

    /**
    * Availability zone.
Description: Please enter the primary AZ of the cluster location correctly. If you enter a non-primary AZ of the cluster location, the call may display success but the actual execution will fail.
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
     * Get Array of instance group IDs, starting with the prefix cynosdbmysql-grp- or cluster ID.
Description: To get the instance group ID of a cluster, perform [query cluster instance group](https://www.tencentcloud.com/document/product/1003/103934?from_cn_redirect=1). 
     * @return InstanceIds Array of instance group IDs, starting with the prefix cynosdbmysql-grp- or cluster ID.
Description: To get the instance group ID of a cluster, perform [query cluster instance group](https://www.tencentcloud.com/document/product/1003/103934?from_cn_redirect=1).
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set Array of instance group IDs, starting with the prefix cynosdbmysql-grp- or cluster ID.
Description: To get the instance group ID of a cluster, perform [query cluster instance group](https://www.tencentcloud.com/document/product/1003/103934?from_cn_redirect=1).
     * @param InstanceIds Array of instance group IDs, starting with the prefix cynosdbmysql-grp- or cluster ID.
Description: To get the instance group ID of a cluster, perform [query cluster instance group](https://www.tencentcloud.com/document/product/1003/103934?from_cn_redirect=1).
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Get Security group ID list to modify. An array of one or more security group IDs. 
     * @return SecurityGroupIds Security group ID list to modify. An array of one or more security group IDs.
     */
    public String [] getSecurityGroupIds() {
        return this.SecurityGroupIds;
    }

    /**
     * Set Security group ID list to modify. An array of one or more security group IDs.
     * @param SecurityGroupIds Security group ID list to modify. An array of one or more security group IDs.
     */
    public void setSecurityGroupIds(String [] SecurityGroupIds) {
        this.SecurityGroupIds = SecurityGroupIds;
    }

    /**
     * Get Availability zone.
Description: Please enter the primary AZ of the cluster location correctly. If you enter a non-primary AZ of the cluster location, the call may display success but the actual execution will fail. 
     * @return Zone Availability zone.
Description: Please enter the primary AZ of the cluster location correctly. If you enter a non-primary AZ of the cluster location, the call may display success but the actual execution will fail.
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set Availability zone.
Description: Please enter the primary AZ of the cluster location correctly. If you enter a non-primary AZ of the cluster location, the call may display success but the actual execution will fail.
     * @param Zone Availability zone.
Description: Please enter the primary AZ of the cluster location correctly. If you enter a non-primary AZ of the cluster location, the call may display success but the actual execution will fail.
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    public DisassociateSecurityGroupsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DisassociateSecurityGroupsRequest(DisassociateSecurityGroupsRequest source) {
        if (source.InstanceIds != null) {
            this.InstanceIds = new String[source.InstanceIds.length];
            for (int i = 0; i < source.InstanceIds.length; i++) {
                this.InstanceIds[i] = new String(source.InstanceIds[i]);
            }
        }
        if (source.SecurityGroupIds != null) {
            this.SecurityGroupIds = new String[source.SecurityGroupIds.length];
            for (int i = 0; i < source.SecurityGroupIds.length; i++) {
                this.SecurityGroupIds[i] = new String(source.SecurityGroupIds[i]);
            }
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);
        this.setParamArraySimple(map, prefix + "SecurityGroupIds.", this.SecurityGroupIds);
        this.setParamSimple(map, prefix + "Zone", this.Zone);

    }
}

