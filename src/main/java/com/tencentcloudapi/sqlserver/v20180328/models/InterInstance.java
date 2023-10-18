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
package com.tencentcloudapi.sqlserver.v20180328.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InterInstance extends AbstractModel {

    /**
    * Instance ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Instance interworking IP, which can be accessed after the instance is added to the interworking group.
    */
    @SerializedName("InterVip")
    @Expose
    private String InterVip;

    /**
    * Instance interworking port, which can be accessed after the instance is added to the interworking group.
    */
    @SerializedName("InterPort")
    @Expose
    private Long InterPort;

    /**
    * Instance interworking status. Valid values: `1` (Enabling interworking IP), `2` (Enabled interworking IP), `3` (Adding to interworking group), `4` (Added to interworking group), `5` (Reclaiming interworking IP), `6`(Reclaimed interworking IP), `7` (Removing from interworking group), `8` (Removed from interworking group).
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Instance region, such as ap-guangzhou.
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * Instance AZ name, such as ap-guangzhou-1.
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * Instance version code
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
    * Instance version
    */
    @SerializedName("VersionName")
    @Expose
    private String VersionName;

    /**
    * Instance name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Instance access IP
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
    * Instance access port
    */
    @SerializedName("Vport")
    @Expose
    private Long Vport;

    /**
     * Get Instance ID 
     * @return InstanceId Instance ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID
     * @param InstanceId Instance ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Instance interworking IP, which can be accessed after the instance is added to the interworking group. 
     * @return InterVip Instance interworking IP, which can be accessed after the instance is added to the interworking group.
     */
    public String getInterVip() {
        return this.InterVip;
    }

    /**
     * Set Instance interworking IP, which can be accessed after the instance is added to the interworking group.
     * @param InterVip Instance interworking IP, which can be accessed after the instance is added to the interworking group.
     */
    public void setInterVip(String InterVip) {
        this.InterVip = InterVip;
    }

    /**
     * Get Instance interworking port, which can be accessed after the instance is added to the interworking group. 
     * @return InterPort Instance interworking port, which can be accessed after the instance is added to the interworking group.
     */
    public Long getInterPort() {
        return this.InterPort;
    }

    /**
     * Set Instance interworking port, which can be accessed after the instance is added to the interworking group.
     * @param InterPort Instance interworking port, which can be accessed after the instance is added to the interworking group.
     */
    public void setInterPort(Long InterPort) {
        this.InterPort = InterPort;
    }

    /**
     * Get Instance interworking status. Valid values: `1` (Enabling interworking IP), `2` (Enabled interworking IP), `3` (Adding to interworking group), `4` (Added to interworking group), `5` (Reclaiming interworking IP), `6`(Reclaimed interworking IP), `7` (Removing from interworking group), `8` (Removed from interworking group). 
     * @return Status Instance interworking status. Valid values: `1` (Enabling interworking IP), `2` (Enabled interworking IP), `3` (Adding to interworking group), `4` (Added to interworking group), `5` (Reclaiming interworking IP), `6`(Reclaimed interworking IP), `7` (Removing from interworking group), `8` (Removed from interworking group).
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Instance interworking status. Valid values: `1` (Enabling interworking IP), `2` (Enabled interworking IP), `3` (Adding to interworking group), `4` (Added to interworking group), `5` (Reclaiming interworking IP), `6`(Reclaimed interworking IP), `7` (Removing from interworking group), `8` (Removed from interworking group).
     * @param Status Instance interworking status. Valid values: `1` (Enabling interworking IP), `2` (Enabled interworking IP), `3` (Adding to interworking group), `4` (Added to interworking group), `5` (Reclaiming interworking IP), `6`(Reclaimed interworking IP), `7` (Removing from interworking group), `8` (Removed from interworking group).
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Instance region, such as ap-guangzhou. 
     * @return Region Instance region, such as ap-guangzhou.
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set Instance region, such as ap-guangzhou.
     * @param Region Instance region, such as ap-guangzhou.
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get Instance AZ name, such as ap-guangzhou-1. 
     * @return Zone Instance AZ name, such as ap-guangzhou-1.
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set Instance AZ name, such as ap-guangzhou-1.
     * @param Zone Instance AZ name, such as ap-guangzhou-1.
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get Instance version code 
     * @return Version Instance version code
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set Instance version code
     * @param Version Instance version code
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    /**
     * Get Instance version 
     * @return VersionName Instance version
     */
    public String getVersionName() {
        return this.VersionName;
    }

    /**
     * Set Instance version
     * @param VersionName Instance version
     */
    public void setVersionName(String VersionName) {
        this.VersionName = VersionName;
    }

    /**
     * Get Instance name 
     * @return Name Instance name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Instance name
     * @param Name Instance name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Instance access IP 
     * @return Vip Instance access IP
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set Instance access IP
     * @param Vip Instance access IP
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    /**
     * Get Instance access port 
     * @return Vport Instance access port
     */
    public Long getVport() {
        return this.Vport;
    }

    /**
     * Set Instance access port
     * @param Vport Instance access port
     */
    public void setVport(Long Vport) {
        this.Vport = Vport;
    }

    public InterInstance() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InterInstance(InterInstance source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InterVip != null) {
            this.InterVip = new String(source.InterVip);
        }
        if (source.InterPort != null) {
            this.InterPort = new Long(source.InterPort);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.Version != null) {
            this.Version = new String(source.Version);
        }
        if (source.VersionName != null) {
            this.VersionName = new String(source.VersionName);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
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
        this.setParamSimple(map, prefix + "InterVip", this.InterVip);
        this.setParamSimple(map, prefix + "InterPort", this.InterPort);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "Version", this.Version);
        this.setParamSimple(map, prefix + "VersionName", this.VersionName);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Vip", this.Vip);
        this.setParamSimple(map, prefix + "Vport", this.Vport);

    }
}

