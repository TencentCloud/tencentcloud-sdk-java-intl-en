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
    * Instance connection method
0: PLAINTEXT (plaintext method, which does not carry user information and is supported for legacy versions and Community Edition)
1: SASL_PLAINTEXT (plaintext method, which authenticates the login through SASL before data start and is supported only for Community Edition)
2: SSL (SSL-encrypted communication, which does not carry user information and is supported for legacy versions and Community Edition)
3: SASL_SSL (SSL-encrypted communication, which authenticates the login through SASL before data start and is supported only for Community Edition)
    */
    @SerializedName("AccessType")
    @Expose
    private Long AccessType;

    /**
    * Route ID
    */
    @SerializedName("RouteId")
    @Expose
    private Long RouteId;

    /**
    * Specifies the network type of the route (3: vpc routing; 7: internal support route; 1: public network route).
    */
    @SerializedName("VipType")
    @Expose
    private Long VipType;

    /**
    * Virtual IP list
    */
    @SerializedName("VipList")
    @Expose
    private VipEntity [] VipList;

    /**
    * Domain name
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * Domain name port
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DomainPort")
    @Expose
    private Long DomainPort;

    /**
    * Timestamp.
    */
    @SerializedName("DeleteTimestamp")
    @Expose
    private String DeleteTimestamp;

    /**
    * Specifies the subnet Id.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Subnet")
    @Expose
    private String Subnet;

    /**
    * Virtual IP list (1:1 broker node).
    */
    @SerializedName("BrokerVipList")
    @Expose
    private VipEntity [] BrokerVipList;

    /**
    * VPC Id. specifies the Id of the vpc.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * Remarks
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Note")
    @Expose
    private String Note;

    /**
    * Route status. 1: creating, 2: creation succeeded, 3: creation failed, 4: deleting, 6: deletion failed.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
     * Get Instance connection method
0: PLAINTEXT (plaintext method, which does not carry user information and is supported for legacy versions and Community Edition)
1: SASL_PLAINTEXT (plaintext method, which authenticates the login through SASL before data start and is supported only for Community Edition)
2: SSL (SSL-encrypted communication, which does not carry user information and is supported for legacy versions and Community Edition)
3: SASL_SSL (SSL-encrypted communication, which authenticates the login through SASL before data start and is supported only for Community Edition) 
     * @return AccessType Instance connection method
0: PLAINTEXT (plaintext method, which does not carry user information and is supported for legacy versions and Community Edition)
1: SASL_PLAINTEXT (plaintext method, which authenticates the login through SASL before data start and is supported only for Community Edition)
2: SSL (SSL-encrypted communication, which does not carry user information and is supported for legacy versions and Community Edition)
3: SASL_SSL (SSL-encrypted communication, which authenticates the login through SASL before data start and is supported only for Community Edition)
     */
    public Long getAccessType() {
        return this.AccessType;
    }

    /**
     * Set Instance connection method
0: PLAINTEXT (plaintext method, which does not carry user information and is supported for legacy versions and Community Edition)
1: SASL_PLAINTEXT (plaintext method, which authenticates the login through SASL before data start and is supported only for Community Edition)
2: SSL (SSL-encrypted communication, which does not carry user information and is supported for legacy versions and Community Edition)
3: SASL_SSL (SSL-encrypted communication, which authenticates the login through SASL before data start and is supported only for Community Edition)
     * @param AccessType Instance connection method
0: PLAINTEXT (plaintext method, which does not carry user information and is supported for legacy versions and Community Edition)
1: SASL_PLAINTEXT (plaintext method, which authenticates the login through SASL before data start and is supported only for Community Edition)
2: SSL (SSL-encrypted communication, which does not carry user information and is supported for legacy versions and Community Edition)
3: SASL_SSL (SSL-encrypted communication, which authenticates the login through SASL before data start and is supported only for Community Edition)
     */
    public void setAccessType(Long AccessType) {
        this.AccessType = AccessType;
    }

    /**
     * Get Route ID 
     * @return RouteId Route ID
     */
    public Long getRouteId() {
        return this.RouteId;
    }

    /**
     * Set Route ID
     * @param RouteId Route ID
     */
    public void setRouteId(Long RouteId) {
        this.RouteId = RouteId;
    }

    /**
     * Get Specifies the network type of the route (3: vpc routing; 7: internal support route; 1: public network route). 
     * @return VipType Specifies the network type of the route (3: vpc routing; 7: internal support route; 1: public network route).
     */
    public Long getVipType() {
        return this.VipType;
    }

    /**
     * Set Specifies the network type of the route (3: vpc routing; 7: internal support route; 1: public network route).
     * @param VipType Specifies the network type of the route (3: vpc routing; 7: internal support route; 1: public network route).
     */
    public void setVipType(Long VipType) {
        this.VipType = VipType;
    }

    /**
     * Get Virtual IP list 
     * @return VipList Virtual IP list
     */
    public VipEntity [] getVipList() {
        return this.VipList;
    }

    /**
     * Set Virtual IP list
     * @param VipList Virtual IP list
     */
    public void setVipList(VipEntity [] VipList) {
        this.VipList = VipList;
    }

    /**
     * Get Domain name
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Domain Domain name
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set Domain name
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Domain Domain name
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get Domain name port
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return DomainPort Domain name port
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getDomainPort() {
        return this.DomainPort;
    }

    /**
     * Set Domain name port
Note: this field may return null, indicating that no valid values can be obtained.
     * @param DomainPort Domain name port
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setDomainPort(Long DomainPort) {
        this.DomainPort = DomainPort;
    }

    /**
     * Get Timestamp. 
     * @return DeleteTimestamp Timestamp.
     */
    public String getDeleteTimestamp() {
        return this.DeleteTimestamp;
    }

    /**
     * Set Timestamp.
     * @param DeleteTimestamp Timestamp.
     */
    public void setDeleteTimestamp(String DeleteTimestamp) {
        this.DeleteTimestamp = DeleteTimestamp;
    }

    /**
     * Get Specifies the subnet Id.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Subnet Specifies the subnet Id.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getSubnet() {
        return this.Subnet;
    }

    /**
     * Set Specifies the subnet Id.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Subnet Specifies the subnet Id.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSubnet(String Subnet) {
        this.Subnet = Subnet;
    }

    /**
     * Get Virtual IP list (1:1 broker node). 
     * @return BrokerVipList Virtual IP list (1:1 broker node).
     */
    public VipEntity [] getBrokerVipList() {
        return this.BrokerVipList;
    }

    /**
     * Set Virtual IP list (1:1 broker node).
     * @param BrokerVipList Virtual IP list (1:1 broker node).
     */
    public void setBrokerVipList(VipEntity [] BrokerVipList) {
        this.BrokerVipList = BrokerVipList;
    }

    /**
     * Get VPC Id. specifies the Id of the vpc.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return VpcId VPC Id. specifies the Id of the vpc.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set VPC Id. specifies the Id of the vpc.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param VpcId VPC Id. specifies the Id of the vpc.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get Remarks
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Note Remarks
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getNote() {
        return this.Note;
    }

    /**
     * Set Remarks
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Note Remarks
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setNote(String Note) {
        this.Note = Note;
    }

    /**
     * Get Route status. 1: creating, 2: creation succeeded, 3: creation failed, 4: deleting, 6: deletion failed.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Status Route status. 1: creating, 2: creation succeeded, 3: creation failed, 4: deleting, 6: deletion failed.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Route status. 1: creating, 2: creation succeeded, 3: creation failed, 4: deleting, 6: deletion failed.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Status Route status. 1: creating, 2: creation succeeded, 3: creation failed, 4: deleting, 6: deletion failed.
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

