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

public class ModifyDBInstanceSecurityGroupsRequest extends AbstractModel {

    /**
    * <p>Network Group id (cynosdbmysql-grp- prefix at the beginning) or Cluster id (such as cynosdbmysql-xxxxxxxx prefix). When configuring security group with instance IP address triplet (UniqVpcId, Vip, Vport), this field must be set to Cluster id (such as cynosdbmysql-xxxxxxxx prefix).</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>List of security group IDs to modify, an array of one or more security group IDs.<br>Note: This input will perform a full replacement of the existing collection, not an incremental update. The modification requires the expected full collection.</p>
    */
    @SerializedName("SecurityGroupIds")
    @Expose
    private String [] SecurityGroupIds;

    /**
    * <p>AZ.</p>
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * <p>ID of the VPC network for instance ownership. (UniqVpcId, Vip, and Vport must be specified simultaneously to uniquely identify the network instance)</p>
    */
    @SerializedName("UniqVpcId")
    @Expose
    private String UniqVpcId;

    /**
    * <p>Instance IP address, instance IP address triplet (UniqVpcId, Vip, and Vport). These three parameters must be specified simultaneously for unique identification of network instances.</p>
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
    * <p>Instance port, instance IP address triplet (UniqVpcId, Vip, and Vport). These three parameters must be specified simultaneously for unique identification of network instances.</p>
    */
    @SerializedName("Vport")
    @Expose
    private Long Vport;

    /**
     * Get <p>Network Group id (cynosdbmysql-grp- prefix at the beginning) or Cluster id (such as cynosdbmysql-xxxxxxxx prefix). When configuring security group with instance IP address triplet (UniqVpcId, Vip, Vport), this field must be set to Cluster id (such as cynosdbmysql-xxxxxxxx prefix).</p> 
     * @return InstanceId <p>Network Group id (cynosdbmysql-grp- prefix at the beginning) or Cluster id (such as cynosdbmysql-xxxxxxxx prefix). When configuring security group with instance IP address triplet (UniqVpcId, Vip, Vport), this field must be set to Cluster id (such as cynosdbmysql-xxxxxxxx prefix).</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>Network Group id (cynosdbmysql-grp- prefix at the beginning) or Cluster id (such as cynosdbmysql-xxxxxxxx prefix). When configuring security group with instance IP address triplet (UniqVpcId, Vip, Vport), this field must be set to Cluster id (such as cynosdbmysql-xxxxxxxx prefix).</p>
     * @param InstanceId <p>Network Group id (cynosdbmysql-grp- prefix at the beginning) or Cluster id (such as cynosdbmysql-xxxxxxxx prefix). When configuring security group with instance IP address triplet (UniqVpcId, Vip, Vport), this field must be set to Cluster id (such as cynosdbmysql-xxxxxxxx prefix).</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>List of security group IDs to modify, an array of one or more security group IDs.<br>Note: This input will perform a full replacement of the existing collection, not an incremental update. The modification requires the expected full collection.</p> 
     * @return SecurityGroupIds <p>List of security group IDs to modify, an array of one or more security group IDs.<br>Note: This input will perform a full replacement of the existing collection, not an incremental update. The modification requires the expected full collection.</p>
     */
    public String [] getSecurityGroupIds() {
        return this.SecurityGroupIds;
    }

    /**
     * Set <p>List of security group IDs to modify, an array of one or more security group IDs.<br>Note: This input will perform a full replacement of the existing collection, not an incremental update. The modification requires the expected full collection.</p>
     * @param SecurityGroupIds <p>List of security group IDs to modify, an array of one or more security group IDs.<br>Note: This input will perform a full replacement of the existing collection, not an incremental update. The modification requires the expected full collection.</p>
     */
    public void setSecurityGroupIds(String [] SecurityGroupIds) {
        this.SecurityGroupIds = SecurityGroupIds;
    }

    /**
     * Get <p>AZ.</p> 
     * @return Zone <p>AZ.</p>
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set <p>AZ.</p>
     * @param Zone <p>AZ.</p>
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get <p>ID of the VPC network for instance ownership. (UniqVpcId, Vip, and Vport must be specified simultaneously to uniquely identify the network instance)</p> 
     * @return UniqVpcId <p>ID of the VPC network for instance ownership. (UniqVpcId, Vip, and Vport must be specified simultaneously to uniquely identify the network instance)</p>
     */
    public String getUniqVpcId() {
        return this.UniqVpcId;
    }

    /**
     * Set <p>ID of the VPC network for instance ownership. (UniqVpcId, Vip, and Vport must be specified simultaneously to uniquely identify the network instance)</p>
     * @param UniqVpcId <p>ID of the VPC network for instance ownership. (UniqVpcId, Vip, and Vport must be specified simultaneously to uniquely identify the network instance)</p>
     */
    public void setUniqVpcId(String UniqVpcId) {
        this.UniqVpcId = UniqVpcId;
    }

    /**
     * Get <p>Instance IP address, instance IP address triplet (UniqVpcId, Vip, and Vport). These three parameters must be specified simultaneously for unique identification of network instances.</p> 
     * @return Vip <p>Instance IP address, instance IP address triplet (UniqVpcId, Vip, and Vport). These three parameters must be specified simultaneously for unique identification of network instances.</p>
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set <p>Instance IP address, instance IP address triplet (UniqVpcId, Vip, and Vport). These three parameters must be specified simultaneously for unique identification of network instances.</p>
     * @param Vip <p>Instance IP address, instance IP address triplet (UniqVpcId, Vip, and Vport). These three parameters must be specified simultaneously for unique identification of network instances.</p>
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    /**
     * Get <p>Instance port, instance IP address triplet (UniqVpcId, Vip, and Vport). These three parameters must be specified simultaneously for unique identification of network instances.</p> 
     * @return Vport <p>Instance port, instance IP address triplet (UniqVpcId, Vip, and Vport). These three parameters must be specified simultaneously for unique identification of network instances.</p>
     */
    public Long getVport() {
        return this.Vport;
    }

    /**
     * Set <p>Instance port, instance IP address triplet (UniqVpcId, Vip, and Vport). These three parameters must be specified simultaneously for unique identification of network instances.</p>
     * @param Vport <p>Instance port, instance IP address triplet (UniqVpcId, Vip, and Vport). These three parameters must be specified simultaneously for unique identification of network instances.</p>
     */
    public void setVport(Long Vport) {
        this.Vport = Vport;
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
        if (source.SecurityGroupIds != null) {
            this.SecurityGroupIds = new String[source.SecurityGroupIds.length];
            for (int i = 0; i < source.SecurityGroupIds.length; i++) {
                this.SecurityGroupIds[i] = new String(source.SecurityGroupIds[i]);
            }
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.UniqVpcId != null) {
            this.UniqVpcId = new String(source.UniqVpcId);
        }
        if (source.Vip != null) {
            this.Vip = new String(source.Vip);
        }
        if (source.Vport != null) {
            this.Vport = new Long(source.Vport);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamArraySimple(map, prefix + "SecurityGroupIds.", this.SecurityGroupIds);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "UniqVpcId", this.UniqVpcId);
        this.setParamSimple(map, prefix + "Vip", this.Vip);
        this.setParamSimple(map, prefix + "Vport", this.Vport);

    }
}

