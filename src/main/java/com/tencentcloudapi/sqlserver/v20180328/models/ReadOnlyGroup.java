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

public class ReadOnlyGroup extends AbstractModel {

    /**
    * 
    */
    @SerializedName("ReadOnlyGroupId")
    @Expose
    private String ReadOnlyGroupId;

    /**
    * 
    */
    @SerializedName("ReadOnlyGroupName")
    @Expose
    private String ReadOnlyGroupName;

    /**
    * 
    */
    @SerializedName("RegionId")
    @Expose
    private String RegionId;

    /**
    * 
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * 
    */
    @SerializedName("IsOfflineDelay")
    @Expose
    private Long IsOfflineDelay;

    /**
    * 
    */
    @SerializedName("ReadOnlyMaxDelayTime")
    @Expose
    private Long ReadOnlyMaxDelayTime;

    /**
    * 
    */
    @SerializedName("MinReadOnlyInGroup")
    @Expose
    private Long MinReadOnlyInGroup;

    /**
    * 
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
    * 
    */
    @SerializedName("Vport")
    @Expose
    private Long Vport;

    /**
    * 
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * 
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 
    */
    @SerializedName("MasterInstanceId")
    @Expose
    private String MasterInstanceId;

    /**
    * 
    */
    @SerializedName("ReadOnlyInstanceSet")
    @Expose
    private ReadOnlyInstance [] ReadOnlyInstanceSet;

    /**
    * RO group's public network address domain name
    */
    @SerializedName("DnsPodDomain")
    @Expose
    private String DnsPodDomain;

    /**
    * RO group's public network address port
    */
    @SerializedName("TgwWanVPort")
    @Expose
    private Long TgwWanVPort;

    /**
     * Get  
     * @return ReadOnlyGroupId 
     */
    public String getReadOnlyGroupId() {
        return this.ReadOnlyGroupId;
    }

    /**
     * Set 
     * @param ReadOnlyGroupId 
     */
    public void setReadOnlyGroupId(String ReadOnlyGroupId) {
        this.ReadOnlyGroupId = ReadOnlyGroupId;
    }

    /**
     * Get  
     * @return ReadOnlyGroupName 
     */
    public String getReadOnlyGroupName() {
        return this.ReadOnlyGroupName;
    }

    /**
     * Set 
     * @param ReadOnlyGroupName 
     */
    public void setReadOnlyGroupName(String ReadOnlyGroupName) {
        this.ReadOnlyGroupName = ReadOnlyGroupName;
    }

    /**
     * Get  
     * @return RegionId 
     */
    public String getRegionId() {
        return this.RegionId;
    }

    /**
     * Set 
     * @param RegionId 
     */
    public void setRegionId(String RegionId) {
        this.RegionId = RegionId;
    }

    /**
     * Get  
     * @return ZoneId 
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set 
     * @param ZoneId 
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get  
     * @return IsOfflineDelay 
     */
    public Long getIsOfflineDelay() {
        return this.IsOfflineDelay;
    }

    /**
     * Set 
     * @param IsOfflineDelay 
     */
    public void setIsOfflineDelay(Long IsOfflineDelay) {
        this.IsOfflineDelay = IsOfflineDelay;
    }

    /**
     * Get  
     * @return ReadOnlyMaxDelayTime 
     */
    public Long getReadOnlyMaxDelayTime() {
        return this.ReadOnlyMaxDelayTime;
    }

    /**
     * Set 
     * @param ReadOnlyMaxDelayTime 
     */
    public void setReadOnlyMaxDelayTime(Long ReadOnlyMaxDelayTime) {
        this.ReadOnlyMaxDelayTime = ReadOnlyMaxDelayTime;
    }

    /**
     * Get  
     * @return MinReadOnlyInGroup 
     */
    public Long getMinReadOnlyInGroup() {
        return this.MinReadOnlyInGroup;
    }

    /**
     * Set 
     * @param MinReadOnlyInGroup 
     */
    public void setMinReadOnlyInGroup(Long MinReadOnlyInGroup) {
        this.MinReadOnlyInGroup = MinReadOnlyInGroup;
    }

    /**
     * Get  
     * @return Vip 
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set 
     * @param Vip 
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    /**
     * Get  
     * @return Vport 
     */
    public Long getVport() {
        return this.Vport;
    }

    /**
     * Set 
     * @param Vport 
     */
    public void setVport(Long Vport) {
        this.Vport = Vport;
    }

    /**
     * Get  
     * @return VpcId 
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set 
     * @param VpcId 
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get  
     * @return SubnetId 
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set 
     * @param SubnetId 
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get  
     * @return Status 
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 
     * @param Status 
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get  
     * @return MasterInstanceId 
     */
    public String getMasterInstanceId() {
        return this.MasterInstanceId;
    }

    /**
     * Set 
     * @param MasterInstanceId 
     */
    public void setMasterInstanceId(String MasterInstanceId) {
        this.MasterInstanceId = MasterInstanceId;
    }

    /**
     * Get  
     * @return ReadOnlyInstanceSet 
     */
    public ReadOnlyInstance [] getReadOnlyInstanceSet() {
        return this.ReadOnlyInstanceSet;
    }

    /**
     * Set 
     * @param ReadOnlyInstanceSet 
     */
    public void setReadOnlyInstanceSet(ReadOnlyInstance [] ReadOnlyInstanceSet) {
        this.ReadOnlyInstanceSet = ReadOnlyInstanceSet;
    }

    /**
     * Get RO group's public network address domain name 
     * @return DnsPodDomain RO group's public network address domain name
     */
    public String getDnsPodDomain() {
        return this.DnsPodDomain;
    }

    /**
     * Set RO group's public network address domain name
     * @param DnsPodDomain RO group's public network address domain name
     */
    public void setDnsPodDomain(String DnsPodDomain) {
        this.DnsPodDomain = DnsPodDomain;
    }

    /**
     * Get RO group's public network address port 
     * @return TgwWanVPort RO group's public network address port
     */
    public Long getTgwWanVPort() {
        return this.TgwWanVPort;
    }

    /**
     * Set RO group's public network address port
     * @param TgwWanVPort RO group's public network address port
     */
    public void setTgwWanVPort(Long TgwWanVPort) {
        this.TgwWanVPort = TgwWanVPort;
    }

    public ReadOnlyGroup() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ReadOnlyGroup(ReadOnlyGroup source) {
        if (source.ReadOnlyGroupId != null) {
            this.ReadOnlyGroupId = new String(source.ReadOnlyGroupId);
        }
        if (source.ReadOnlyGroupName != null) {
            this.ReadOnlyGroupName = new String(source.ReadOnlyGroupName);
        }
        if (source.RegionId != null) {
            this.RegionId = new String(source.RegionId);
        }
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.IsOfflineDelay != null) {
            this.IsOfflineDelay = new Long(source.IsOfflineDelay);
        }
        if (source.ReadOnlyMaxDelayTime != null) {
            this.ReadOnlyMaxDelayTime = new Long(source.ReadOnlyMaxDelayTime);
        }
        if (source.MinReadOnlyInGroup != null) {
            this.MinReadOnlyInGroup = new Long(source.MinReadOnlyInGroup);
        }
        if (source.Vip != null) {
            this.Vip = new String(source.Vip);
        }
        if (source.Vport != null) {
            this.Vport = new Long(source.Vport);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.MasterInstanceId != null) {
            this.MasterInstanceId = new String(source.MasterInstanceId);
        }
        if (source.ReadOnlyInstanceSet != null) {
            this.ReadOnlyInstanceSet = new ReadOnlyInstance[source.ReadOnlyInstanceSet.length];
            for (int i = 0; i < source.ReadOnlyInstanceSet.length; i++) {
                this.ReadOnlyInstanceSet[i] = new ReadOnlyInstance(source.ReadOnlyInstanceSet[i]);
            }
        }
        if (source.DnsPodDomain != null) {
            this.DnsPodDomain = new String(source.DnsPodDomain);
        }
        if (source.TgwWanVPort != null) {
            this.TgwWanVPort = new Long(source.TgwWanVPort);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ReadOnlyGroupId", this.ReadOnlyGroupId);
        this.setParamSimple(map, prefix + "ReadOnlyGroupName", this.ReadOnlyGroupName);
        this.setParamSimple(map, prefix + "RegionId", this.RegionId);
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "IsOfflineDelay", this.IsOfflineDelay);
        this.setParamSimple(map, prefix + "ReadOnlyMaxDelayTime", this.ReadOnlyMaxDelayTime);
        this.setParamSimple(map, prefix + "MinReadOnlyInGroup", this.MinReadOnlyInGroup);
        this.setParamSimple(map, prefix + "Vip", this.Vip);
        this.setParamSimple(map, prefix + "Vport", this.Vport);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "MasterInstanceId", this.MasterInstanceId);
        this.setParamArrayObj(map, prefix + "ReadOnlyInstanceSet.", this.ReadOnlyInstanceSet);
        this.setParamSimple(map, prefix + "DnsPodDomain", this.DnsPodDomain);
        this.setParamSimple(map, prefix + "TgwWanVPort", this.TgwWanVPort);

    }
}

