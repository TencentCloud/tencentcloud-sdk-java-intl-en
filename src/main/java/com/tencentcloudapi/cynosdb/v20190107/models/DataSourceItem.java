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

public class DataSourceItem extends AbstractModel {

    /**
    * Source instance ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Source cluster ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * Source database type
    */
    @SerializedName("DBType")
    @Expose
    private String DBType;

    /**
    * Source database IP
    */
    @SerializedName("IP")
    @Expose
    private String IP;

    /**
    * Source database port
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * Source instance region
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * Source instance availability zone
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * Source main account uin
    */
    @SerializedName("SrcUin")
    @Expose
    private String SrcUin;

    /**
    * Account type
    */
    @SerializedName("AccountMode")
    @Expose
    private String AccountMode;

    /**
    * sync task status
    */
    @SerializedName("ReplicationJobStatus")
    @Expose
    private String ReplicationJobStatus;

    /**
     * Get Source instance ID 
     * @return InstanceId Source instance ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Source instance ID
     * @param InstanceId Source instance ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Source cluster ID 
     * @return ClusterId Source cluster ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set Source cluster ID
     * @param ClusterId Source cluster ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get Source database type 
     * @return DBType Source database type
     */
    public String getDBType() {
        return this.DBType;
    }

    /**
     * Set Source database type
     * @param DBType Source database type
     */
    public void setDBType(String DBType) {
        this.DBType = DBType;
    }

    /**
     * Get Source database IP 
     * @return IP Source database IP
     */
    public String getIP() {
        return this.IP;
    }

    /**
     * Set Source database IP
     * @param IP Source database IP
     */
    public void setIP(String IP) {
        this.IP = IP;
    }

    /**
     * Get Source database port 
     * @return Port Source database port
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set Source database port
     * @param Port Source database port
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get Source instance region 
     * @return Region Source instance region
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set Source instance region
     * @param Region Source instance region
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get Source instance availability zone 
     * @return Zone Source instance availability zone
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set Source instance availability zone
     * @param Zone Source instance availability zone
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get Source main account uin 
     * @return SrcUin Source main account uin
     */
    public String getSrcUin() {
        return this.SrcUin;
    }

    /**
     * Set Source main account uin
     * @param SrcUin Source main account uin
     */
    public void setSrcUin(String SrcUin) {
        this.SrcUin = SrcUin;
    }

    /**
     * Get Account type 
     * @return AccountMode Account type
     */
    public String getAccountMode() {
        return this.AccountMode;
    }

    /**
     * Set Account type
     * @param AccountMode Account type
     */
    public void setAccountMode(String AccountMode) {
        this.AccountMode = AccountMode;
    }

    /**
     * Get sync task status 
     * @return ReplicationJobStatus sync task status
     */
    public String getReplicationJobStatus() {
        return this.ReplicationJobStatus;
    }

    /**
     * Set sync task status
     * @param ReplicationJobStatus sync task status
     */
    public void setReplicationJobStatus(String ReplicationJobStatus) {
        this.ReplicationJobStatus = ReplicationJobStatus;
    }

    public DataSourceItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DataSourceItem(DataSourceItem source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.DBType != null) {
            this.DBType = new String(source.DBType);
        }
        if (source.IP != null) {
            this.IP = new String(source.IP);
        }
        if (source.Port != null) {
            this.Port = new Long(source.Port);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.SrcUin != null) {
            this.SrcUin = new String(source.SrcUin);
        }
        if (source.AccountMode != null) {
            this.AccountMode = new String(source.AccountMode);
        }
        if (source.ReplicationJobStatus != null) {
            this.ReplicationJobStatus = new String(source.ReplicationJobStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "DBType", this.DBType);
        this.setParamSimple(map, prefix + "IP", this.IP);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "SrcUin", this.SrcUin);
        this.setParamSimple(map, prefix + "AccountMode", this.AccountMode);
        this.setParamSimple(map, prefix + "ReplicationJobStatus", this.ReplicationJobStatus);

    }
}

