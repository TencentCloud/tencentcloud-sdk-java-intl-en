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
package com.tencentcloudapi.cfs.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FileSystemClient extends AbstractModel{

    /**
    * IP address of the file system
    */
    @SerializedName("CfsVip")
    @Expose
    private String CfsVip;

    /**
    * Client IP
    */
    @SerializedName("ClientIp")
    @Expose
    private String ClientIp;

    /**
    * File system VPCID
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * Name of the availability zone, e.g. ap-beijing-1. For more information, see regions and availability zones in the Overview document
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * AZ name
    */
    @SerializedName("ZoneName")
    @Expose
    private String ZoneName;

    /**
    * Path in which the file system is mounted to the client
    */
    @SerializedName("MountDirectory")
    @Expose
    private String MountDirectory;

    /**
     * Get IP address of the file system 
     * @return CfsVip IP address of the file system
     */
    public String getCfsVip() {
        return this.CfsVip;
    }

    /**
     * Set IP address of the file system
     * @param CfsVip IP address of the file system
     */
    public void setCfsVip(String CfsVip) {
        this.CfsVip = CfsVip;
    }

    /**
     * Get Client IP 
     * @return ClientIp Client IP
     */
    public String getClientIp() {
        return this.ClientIp;
    }

    /**
     * Set Client IP
     * @param ClientIp Client IP
     */
    public void setClientIp(String ClientIp) {
        this.ClientIp = ClientIp;
    }

    /**
     * Get File system VPCID 
     * @return VpcId File system VPCID
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set File system VPCID
     * @param VpcId File system VPCID
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get Name of the availability zone, e.g. ap-beijing-1. For more information, see regions and availability zones in the Overview document 
     * @return Zone Name of the availability zone, e.g. ap-beijing-1. For more information, see regions and availability zones in the Overview document
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set Name of the availability zone, e.g. ap-beijing-1. For more information, see regions and availability zones in the Overview document
     * @param Zone Name of the availability zone, e.g. ap-beijing-1. For more information, see regions and availability zones in the Overview document
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get AZ name 
     * @return ZoneName AZ name
     */
    public String getZoneName() {
        return this.ZoneName;
    }

    /**
     * Set AZ name
     * @param ZoneName AZ name
     */
    public void setZoneName(String ZoneName) {
        this.ZoneName = ZoneName;
    }

    /**
     * Get Path in which the file system is mounted to the client 
     * @return MountDirectory Path in which the file system is mounted to the client
     */
    public String getMountDirectory() {
        return this.MountDirectory;
    }

    /**
     * Set Path in which the file system is mounted to the client
     * @param MountDirectory Path in which the file system is mounted to the client
     */
    public void setMountDirectory(String MountDirectory) {
        this.MountDirectory = MountDirectory;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CfsVip", this.CfsVip);
        this.setParamSimple(map, prefix + "ClientIp", this.ClientIp);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "ZoneName", this.ZoneName);
        this.setParamSimple(map, prefix + "MountDirectory", this.MountDirectory);

    }
}

