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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CynosdbInstanceGrp extends AbstractModel{

    /**
    * appId
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * Cluster ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * Creation time
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * Deletion time
    */
    @SerializedName("DeletedTime")
    @Expose
    private String DeletedTime;

    /**
    * Instance group ID
    */
    @SerializedName("InstanceGrpId")
    @Expose
    private String InstanceGrpId;

    /**
    * Status
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Instance group type. ha: HA group; ro: RO group
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Update time
    */
    @SerializedName("UpdatedTime")
    @Expose
    private String UpdatedTime;

    /**
    * Private IP
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
    * Private port
    */
    @SerializedName("Vport")
    @Expose
    private Long Vport;

    /**
    * Public domain name
    */
    @SerializedName("WanDomain")
    @Expose
    private String WanDomain;

    /**
    * Public IP
    */
    @SerializedName("WanIP")
    @Expose
    private String WanIP;

    /**
    * Public port
    */
    @SerializedName("WanPort")
    @Expose
    private Long WanPort;

    /**
    * Public network status
    */
    @SerializedName("WanStatus")
    @Expose
    private String WanStatus;

    /**
    * Information of instances contained in instance group
    */
    @SerializedName("InstanceSet")
    @Expose
    private CynosdbInstance [] InstanceSet;

    /**
     * Get appId 
     * @return AppId appId
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set appId
     * @param AppId appId
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get Cluster ID 
     * @return ClusterId Cluster ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set Cluster ID
     * @param ClusterId Cluster ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get Creation time 
     * @return CreatedTime Creation time
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set Creation time
     * @param CreatedTime Creation time
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get Deletion time 
     * @return DeletedTime Deletion time
     */
    public String getDeletedTime() {
        return this.DeletedTime;
    }

    /**
     * Set Deletion time
     * @param DeletedTime Deletion time
     */
    public void setDeletedTime(String DeletedTime) {
        this.DeletedTime = DeletedTime;
    }

    /**
     * Get Instance group ID 
     * @return InstanceGrpId Instance group ID
     */
    public String getInstanceGrpId() {
        return this.InstanceGrpId;
    }

    /**
     * Set Instance group ID
     * @param InstanceGrpId Instance group ID
     */
    public void setInstanceGrpId(String InstanceGrpId) {
        this.InstanceGrpId = InstanceGrpId;
    }

    /**
     * Get Status 
     * @return Status Status
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Status
     * @param Status Status
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Instance group type. ha: HA group; ro: RO group 
     * @return Type Instance group type. ha: HA group; ro: RO group
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Instance group type. ha: HA group; ro: RO group
     * @param Type Instance group type. ha: HA group; ro: RO group
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Update time 
     * @return UpdatedTime Update time
     */
    public String getUpdatedTime() {
        return this.UpdatedTime;
    }

    /**
     * Set Update time
     * @param UpdatedTime Update time
     */
    public void setUpdatedTime(String UpdatedTime) {
        this.UpdatedTime = UpdatedTime;
    }

    /**
     * Get Private IP 
     * @return Vip Private IP
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set Private IP
     * @param Vip Private IP
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    /**
     * Get Private port 
     * @return Vport Private port
     */
    public Long getVport() {
        return this.Vport;
    }

    /**
     * Set Private port
     * @param Vport Private port
     */
    public void setVport(Long Vport) {
        this.Vport = Vport;
    }

    /**
     * Get Public domain name 
     * @return WanDomain Public domain name
     */
    public String getWanDomain() {
        return this.WanDomain;
    }

    /**
     * Set Public domain name
     * @param WanDomain Public domain name
     */
    public void setWanDomain(String WanDomain) {
        this.WanDomain = WanDomain;
    }

    /**
     * Get Public IP 
     * @return WanIP Public IP
     */
    public String getWanIP() {
        return this.WanIP;
    }

    /**
     * Set Public IP
     * @param WanIP Public IP
     */
    public void setWanIP(String WanIP) {
        this.WanIP = WanIP;
    }

    /**
     * Get Public port 
     * @return WanPort Public port
     */
    public Long getWanPort() {
        return this.WanPort;
    }

    /**
     * Set Public port
     * @param WanPort Public port
     */
    public void setWanPort(Long WanPort) {
        this.WanPort = WanPort;
    }

    /**
     * Get Public network status 
     * @return WanStatus Public network status
     */
    public String getWanStatus() {
        return this.WanStatus;
    }

    /**
     * Set Public network status
     * @param WanStatus Public network status
     */
    public void setWanStatus(String WanStatus) {
        this.WanStatus = WanStatus;
    }

    /**
     * Get Information of instances contained in instance group 
     * @return InstanceSet Information of instances contained in instance group
     */
    public CynosdbInstance [] getInstanceSet() {
        return this.InstanceSet;
    }

    /**
     * Set Information of instances contained in instance group
     * @param InstanceSet Information of instances contained in instance group
     */
    public void setInstanceSet(CynosdbInstance [] InstanceSet) {
        this.InstanceSet = InstanceSet;
    }

    public CynosdbInstanceGrp() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CynosdbInstanceGrp(CynosdbInstanceGrp source) {
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new String(source.CreatedTime);
        }
        if (source.DeletedTime != null) {
            this.DeletedTime = new String(source.DeletedTime);
        }
        if (source.InstanceGrpId != null) {
            this.InstanceGrpId = new String(source.InstanceGrpId);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.UpdatedTime != null) {
            this.UpdatedTime = new String(source.UpdatedTime);
        }
        if (source.Vip != null) {
            this.Vip = new String(source.Vip);
        }
        if (source.Vport != null) {
            this.Vport = new Long(source.Vport);
        }
        if (source.WanDomain != null) {
            this.WanDomain = new String(source.WanDomain);
        }
        if (source.WanIP != null) {
            this.WanIP = new String(source.WanIP);
        }
        if (source.WanPort != null) {
            this.WanPort = new Long(source.WanPort);
        }
        if (source.WanStatus != null) {
            this.WanStatus = new String(source.WanStatus);
        }
        if (source.InstanceSet != null) {
            this.InstanceSet = new CynosdbInstance[source.InstanceSet.length];
            for (int i = 0; i < source.InstanceSet.length; i++) {
                this.InstanceSet[i] = new CynosdbInstance(source.InstanceSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamSimple(map, prefix + "DeletedTime", this.DeletedTime);
        this.setParamSimple(map, prefix + "InstanceGrpId", this.InstanceGrpId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "UpdatedTime", this.UpdatedTime);
        this.setParamSimple(map, prefix + "Vip", this.Vip);
        this.setParamSimple(map, prefix + "Vport", this.Vport);
        this.setParamSimple(map, prefix + "WanDomain", this.WanDomain);
        this.setParamSimple(map, prefix + "WanIP", this.WanIP);
        this.setParamSimple(map, prefix + "WanPort", this.WanPort);
        this.setParamSimple(map, prefix + "WanStatus", this.WanStatus);
        this.setParamArrayObj(map, prefix + "InstanceSet.", this.InstanceSet);

    }
}

