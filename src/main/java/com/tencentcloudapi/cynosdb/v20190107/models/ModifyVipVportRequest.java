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

public class ModifyVipVportRequest extends AbstractModel {

    /**
    * Cluster ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * Instance group ID
    */
    @SerializedName("InstanceGrpId")
    @Expose
    private String InstanceGrpId;

    /**
    * Target IP to be modified
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
    * Target port to be modified
    */
    @SerializedName("Vport")
    @Expose
    private Long Vport;

    /**
    * Database type. Valid values: 
<li> MYSQL </li>
    */
    @SerializedName("DbType")
    @Expose
    private String DbType;

    /**
    * Valid hours of old IPs. If it is set to `0` hours, the IPs will be released immediately.
    */
    @SerializedName("OldIpReserveHours")
    @Expose
    private Long OldIpReserveHours;

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
     * Get Instance group ID 
     * @return InstanceGrpId Instance group ID
     * @deprecated
     */
    @Deprecated
    public String getInstanceGrpId() {
        return this.InstanceGrpId;
    }

    /**
     * Set Instance group ID
     * @param InstanceGrpId Instance group ID
     * @deprecated
     */
    @Deprecated
    public void setInstanceGrpId(String InstanceGrpId) {
        this.InstanceGrpId = InstanceGrpId;
    }

    /**
     * Get Target IP to be modified 
     * @return Vip Target IP to be modified
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set Target IP to be modified
     * @param Vip Target IP to be modified
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    /**
     * Get Target port to be modified 
     * @return Vport Target port to be modified
     */
    public Long getVport() {
        return this.Vport;
    }

    /**
     * Set Target port to be modified
     * @param Vport Target port to be modified
     */
    public void setVport(Long Vport) {
        this.Vport = Vport;
    }

    /**
     * Get Database type. Valid values: 
<li> MYSQL </li> 
     * @return DbType Database type. Valid values: 
<li> MYSQL </li>
     */
    public String getDbType() {
        return this.DbType;
    }

    /**
     * Set Database type. Valid values: 
<li> MYSQL </li>
     * @param DbType Database type. Valid values: 
<li> MYSQL </li>
     */
    public void setDbType(String DbType) {
        this.DbType = DbType;
    }

    /**
     * Get Valid hours of old IPs. If it is set to `0` hours, the IPs will be released immediately. 
     * @return OldIpReserveHours Valid hours of old IPs. If it is set to `0` hours, the IPs will be released immediately.
     */
    public Long getOldIpReserveHours() {
        return this.OldIpReserveHours;
    }

    /**
     * Set Valid hours of old IPs. If it is set to `0` hours, the IPs will be released immediately.
     * @param OldIpReserveHours Valid hours of old IPs. If it is set to `0` hours, the IPs will be released immediately.
     */
    public void setOldIpReserveHours(Long OldIpReserveHours) {
        this.OldIpReserveHours = OldIpReserveHours;
    }

    public ModifyVipVportRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyVipVportRequest(ModifyVipVportRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.InstanceGrpId != null) {
            this.InstanceGrpId = new String(source.InstanceGrpId);
        }
        if (source.Vip != null) {
            this.Vip = new String(source.Vip);
        }
        if (source.Vport != null) {
            this.Vport = new Long(source.Vport);
        }
        if (source.DbType != null) {
            this.DbType = new String(source.DbType);
        }
        if (source.OldIpReserveHours != null) {
            this.OldIpReserveHours = new Long(source.OldIpReserveHours);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "InstanceGrpId", this.InstanceGrpId);
        this.setParamSimple(map, prefix + "Vip", this.Vip);
        this.setParamSimple(map, prefix + "Vport", this.Vport);
        this.setParamSimple(map, prefix + "DbType", this.DbType);
        this.setParamSimple(map, prefix + "OldIpReserveHours", this.OldIpReserveHours);

    }
}

