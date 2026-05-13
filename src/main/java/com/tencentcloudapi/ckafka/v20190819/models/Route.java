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
package com.tencentcloudapi.ckafka.v20190819.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Route extends AbstractModel {

    /**
    * <p>Instance access method 0: PLAINTEXT (plaintext mode, no user information included, supported by older versions and community edition) 1: SASL_PLAINTEXT (plaintext mode, however, login authentication with SASL is performed at data initiation, only supported by community edition) 2: SSL (SSL encrypted communication, no user information included, supported by older versions and community edition) 3: SASL_SSL (SSL encrypted communication, login authentication with SASL is performed at data initiation, only supported by community edition)</p>
    */
    @SerializedName("AccessType")
    @Expose
    private Long AccessType;

    /**
    * <p>Route Id</p>
    */
    @SerializedName("RouteId")
    @Expose
    private Long RouteId;

    /**
    * <p>Routing network type (3: vpc routing; 7: Internal support routing; 1: Public network route)</p>
    */
    @SerializedName("VipType")
    @Expose
    private Long VipType;

    /**
    * <p>Virtual IP list</p>
    */
    @SerializedName("VipList")
    @Expose
    private VipEntity [] VipList;

    /**
    * <p>Domain name</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * <p>Domain name port</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DomainPort")
    @Expose
    private Long DomainPort;

    /**
    * <p>Timestamp</p>
    */
    @SerializedName("DeleteTimestamp")
    @Expose
    private String DeleteTimestamp;

    /**
    * <p>Subnet Id</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Subnet")
    @Expose
    private String Subnet;

    /**
    * <p>Virtual IP list (1:1 broker node)</p>
    */
    @SerializedName("BrokerVipList")
    @Expose
    private VipEntity [] BrokerVipList;

    /**
    * <p>VPC Id</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * <p>Remarks</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Note")
    @Expose
    private String Note;

    /**
    * <p>Route status. 1: Creating, 2: Successfully created, 3: Creation failed, 4: Deleting, 6: Deletion failed</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
     * Get <p>Instance access method 0: PLAINTEXT (plaintext mode, no user information included, supported by older versions and community edition) 1: SASL_PLAINTEXT (plaintext mode, however, login authentication with SASL is performed at data initiation, only supported by community edition) 2: SSL (SSL encrypted communication, no user information included, supported by older versions and community edition) 3: SASL_SSL (SSL encrypted communication, login authentication with SASL is performed at data initiation, only supported by community edition)</p> 
     * @return AccessType <p>Instance access method 0: PLAINTEXT (plaintext mode, no user information included, supported by older versions and community edition) 1: SASL_PLAINTEXT (plaintext mode, however, login authentication with SASL is performed at data initiation, only supported by community edition) 2: SSL (SSL encrypted communication, no user information included, supported by older versions and community edition) 3: SASL_SSL (SSL encrypted communication, login authentication with SASL is performed at data initiation, only supported by community edition)</p>
     */
    public Long getAccessType() {
        return this.AccessType;
    }

    /**
     * Set <p>Instance access method 0: PLAINTEXT (plaintext mode, no user information included, supported by older versions and community edition) 1: SASL_PLAINTEXT (plaintext mode, however, login authentication with SASL is performed at data initiation, only supported by community edition) 2: SSL (SSL encrypted communication, no user information included, supported by older versions and community edition) 3: SASL_SSL (SSL encrypted communication, login authentication with SASL is performed at data initiation, only supported by community edition)</p>
     * @param AccessType <p>Instance access method 0: PLAINTEXT (plaintext mode, no user information included, supported by older versions and community edition) 1: SASL_PLAINTEXT (plaintext mode, however, login authentication with SASL is performed at data initiation, only supported by community edition) 2: SSL (SSL encrypted communication, no user information included, supported by older versions and community edition) 3: SASL_SSL (SSL encrypted communication, login authentication with SASL is performed at data initiation, only supported by community edition)</p>
     */
    public void setAccessType(Long AccessType) {
        this.AccessType = AccessType;
    }

    /**
     * Get <p>Route Id</p> 
     * @return RouteId <p>Route Id</p>
     */
    public Long getRouteId() {
        return this.RouteId;
    }

    /**
     * Set <p>Route Id</p>
     * @param RouteId <p>Route Id</p>
     */
    public void setRouteId(Long RouteId) {
        this.RouteId = RouteId;
    }

    /**
     * Get <p>Routing network type (3: vpc routing; 7: Internal support routing; 1: Public network route)</p> 
     * @return VipType <p>Routing network type (3: vpc routing; 7: Internal support routing; 1: Public network route)</p>
     */
    public Long getVipType() {
        return this.VipType;
    }

    /**
     * Set <p>Routing network type (3: vpc routing; 7: Internal support routing; 1: Public network route)</p>
     * @param VipType <p>Routing network type (3: vpc routing; 7: Internal support routing; 1: Public network route)</p>
     */
    public void setVipType(Long VipType) {
        this.VipType = VipType;
    }

    /**
     * Get <p>Virtual IP list</p> 
     * @return VipList <p>Virtual IP list</p>
     */
    public VipEntity [] getVipList() {
        return this.VipList;
    }

    /**
     * Set <p>Virtual IP list</p>
     * @param VipList <p>Virtual IP list</p>
     */
    public void setVipList(VipEntity [] VipList) {
        this.VipList = VipList;
    }

    /**
     * Get <p>Domain name</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Domain <p>Domain name</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set <p>Domain name</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Domain <p>Domain name</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get <p>Domain name port</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DomainPort <p>Domain name port</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getDomainPort() {
        return this.DomainPort;
    }

    /**
     * Set <p>Domain name port</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DomainPort <p>Domain name port</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDomainPort(Long DomainPort) {
        this.DomainPort = DomainPort;
    }

    /**
     * Get <p>Timestamp</p> 
     * @return DeleteTimestamp <p>Timestamp</p>
     */
    public String getDeleteTimestamp() {
        return this.DeleteTimestamp;
    }

    /**
     * Set <p>Timestamp</p>
     * @param DeleteTimestamp <p>Timestamp</p>
     */
    public void setDeleteTimestamp(String DeleteTimestamp) {
        this.DeleteTimestamp = DeleteTimestamp;
    }

    /**
     * Get <p>Subnet Id</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Subnet <p>Subnet Id</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getSubnet() {
        return this.Subnet;
    }

    /**
     * Set <p>Subnet Id</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Subnet <p>Subnet Id</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSubnet(String Subnet) {
        this.Subnet = Subnet;
    }

    /**
     * Get <p>Virtual IP list (1:1 broker node)</p> 
     * @return BrokerVipList <p>Virtual IP list (1:1 broker node)</p>
     */
    public VipEntity [] getBrokerVipList() {
        return this.BrokerVipList;
    }

    /**
     * Set <p>Virtual IP list (1:1 broker node)</p>
     * @param BrokerVipList <p>Virtual IP list (1:1 broker node)</p>
     */
    public void setBrokerVipList(VipEntity [] BrokerVipList) {
        this.BrokerVipList = BrokerVipList;
    }

    /**
     * Get <p>VPC Id</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return VpcId <p>VPC Id</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set <p>VPC Id</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param VpcId <p>VPC Id</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get <p>Remarks</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Note <p>Remarks</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getNote() {
        return this.Note;
    }

    /**
     * Set <p>Remarks</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Note <p>Remarks</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setNote(String Note) {
        this.Note = Note;
    }

    /**
     * Get <p>Route status. 1: Creating, 2: Successfully created, 3: Creation failed, 4: Deleting, 6: Deletion failed</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Status <p>Route status. 1: Creating, 2: Successfully created, 3: Creation failed, 4: Deleting, 6: Deletion failed</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>Route status. 1: Creating, 2: Successfully created, 3: Creation failed, 4: Deleting, 6: Deletion failed</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Status <p>Route status. 1: Creating, 2: Successfully created, 3: Creation failed, 4: Deleting, 6: Deletion failed</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    public Route() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Route(Route source) {
        if (source.AccessType != null) {
            this.AccessType = new Long(source.AccessType);
        }
        if (source.RouteId != null) {
            this.RouteId = new Long(source.RouteId);
        }
        if (source.VipType != null) {
            this.VipType = new Long(source.VipType);
        }
        if (source.VipList != null) {
            this.VipList = new VipEntity[source.VipList.length];
            for (int i = 0; i < source.VipList.length; i++) {
                this.VipList[i] = new VipEntity(source.VipList[i]);
            }
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.DomainPort != null) {
            this.DomainPort = new Long(source.DomainPort);
        }
        if (source.DeleteTimestamp != null) {
            this.DeleteTimestamp = new String(source.DeleteTimestamp);
        }
        if (source.Subnet != null) {
            this.Subnet = new String(source.Subnet);
        }
        if (source.BrokerVipList != null) {
            this.BrokerVipList = new VipEntity[source.BrokerVipList.length];
            for (int i = 0; i < source.BrokerVipList.length; i++) {
                this.BrokerVipList[i] = new VipEntity(source.BrokerVipList[i]);
            }
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.Note != null) {
            this.Note = new String(source.Note);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AccessType", this.AccessType);
        this.setParamSimple(map, prefix + "RouteId", this.RouteId);
        this.setParamSimple(map, prefix + "VipType", this.VipType);
        this.setParamArrayObj(map, prefix + "VipList.", this.VipList);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "DomainPort", this.DomainPort);
        this.setParamSimple(map, prefix + "DeleteTimestamp", this.DeleteTimestamp);
        this.setParamSimple(map, prefix + "Subnet", this.Subnet);
        this.setParamArrayObj(map, prefix + "BrokerVipList.", this.BrokerVipList);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "Note", this.Note);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

