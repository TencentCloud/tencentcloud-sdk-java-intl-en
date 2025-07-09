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
package com.tencentcloudapi.apigateway.v20180808.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TargetServicesReq extends AbstractModel {

    /**
    * VM IP
    */
    @SerializedName("VmIp")
    @Expose
    private String VmIp;

    /**
    * VPC ID
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * VM Port
    */
    @SerializedName("VmPort")
    @Expose
    private Long VmPort;

    /**
    * IP of the host where the CVM instance resides
    */
    @SerializedName("HostIp")
    @Expose
    private String HostIp;

    /**
    * Docker IP
    */
    @SerializedName("DockerIp")
    @Expose
    private String DockerIp;

    /**
     * Get VM IP 
     * @return VmIp VM IP
     */
    public String getVmIp() {
        return this.VmIp;
    }

    /**
     * Set VM IP
     * @param VmIp VM IP
     */
    public void setVmIp(String VmIp) {
        this.VmIp = VmIp;
    }

    /**
     * Get VPC ID 
     * @return VpcId VPC ID
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set VPC ID
     * @param VpcId VPC ID
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get VM Port 
     * @return VmPort VM Port
     */
    public Long getVmPort() {
        return this.VmPort;
    }

    /**
     * Set VM Port
     * @param VmPort VM Port
     */
    public void setVmPort(Long VmPort) {
        this.VmPort = VmPort;
    }

    /**
     * Get IP of the host where the CVM instance resides 
     * @return HostIp IP of the host where the CVM instance resides
     */
    public String getHostIp() {
        return this.HostIp;
    }

    /**
     * Set IP of the host where the CVM instance resides
     * @param HostIp IP of the host where the CVM instance resides
     */
    public void setHostIp(String HostIp) {
        this.HostIp = HostIp;
    }

    /**
     * Get Docker IP 
     * @return DockerIp Docker IP
     */
    public String getDockerIp() {
        return this.DockerIp;
    }

    /**
     * Set Docker IP
     * @param DockerIp Docker IP
     */
    public void setDockerIp(String DockerIp) {
        this.DockerIp = DockerIp;
    }

    public TargetServicesReq() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TargetServicesReq(TargetServicesReq source) {
        if (source.VmIp != null) {
            this.VmIp = new String(source.VmIp);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.VmPort != null) {
            this.VmPort = new Long(source.VmPort);
        }
        if (source.HostIp != null) {
            this.HostIp = new String(source.HostIp);
        }
        if (source.DockerIp != null) {
            this.DockerIp = new String(source.DockerIp);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VmIp", this.VmIp);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "VmPort", this.VmPort);
        this.setParamSimple(map, prefix + "HostIp", this.HostIp);
        this.setParamSimple(map, prefix + "DockerIp", this.DockerIp);

    }
}

