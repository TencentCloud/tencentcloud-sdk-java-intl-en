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
package com.tencentcloudapi.es.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class KibanaView extends AbstractModel {

    /**
    * Kibana node IP
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * Node disk size
    */
    @SerializedName("DiskSize")
    @Expose
    private Long DiskSize;

    /**
    * Disk usage
    */
    @SerializedName("DiskUsage")
    @Expose
    private Float DiskUsage;

    /**
    * Node memory size
    */
    @SerializedName("MemSize")
    @Expose
    private Long MemSize;

    /**
    * Memory usage
    */
    @SerializedName("MemUsage")
    @Expose
    private Float MemUsage;

    /**
    * Number of node CPUs
    */
    @SerializedName("CpuNum")
    @Expose
    private Long CpuNum;

    /**
    * CPU usage
    */
    @SerializedName("CpuUsage")
    @Expose
    private Float CpuUsage;

    /**
    * Availability zone
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
     * Get Kibana node IP 
     * @return Ip Kibana node IP
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set Kibana node IP
     * @param Ip Kibana node IP
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * Get Node disk size 
     * @return DiskSize Node disk size
     */
    public Long getDiskSize() {
        return this.DiskSize;
    }

    /**
     * Set Node disk size
     * @param DiskSize Node disk size
     */
    public void setDiskSize(Long DiskSize) {
        this.DiskSize = DiskSize;
    }

    /**
     * Get Disk usage 
     * @return DiskUsage Disk usage
     */
    public Float getDiskUsage() {
        return this.DiskUsage;
    }

    /**
     * Set Disk usage
     * @param DiskUsage Disk usage
     */
    public void setDiskUsage(Float DiskUsage) {
        this.DiskUsage = DiskUsage;
    }

    /**
     * Get Node memory size 
     * @return MemSize Node memory size
     */
    public Long getMemSize() {
        return this.MemSize;
    }

    /**
     * Set Node memory size
     * @param MemSize Node memory size
     */
    public void setMemSize(Long MemSize) {
        this.MemSize = MemSize;
    }

    /**
     * Get Memory usage 
     * @return MemUsage Memory usage
     */
    public Float getMemUsage() {
        return this.MemUsage;
    }

    /**
     * Set Memory usage
     * @param MemUsage Memory usage
     */
    public void setMemUsage(Float MemUsage) {
        this.MemUsage = MemUsage;
    }

    /**
     * Get Number of node CPUs 
     * @return CpuNum Number of node CPUs
     */
    public Long getCpuNum() {
        return this.CpuNum;
    }

    /**
     * Set Number of node CPUs
     * @param CpuNum Number of node CPUs
     */
    public void setCpuNum(Long CpuNum) {
        this.CpuNum = CpuNum;
    }

    /**
     * Get CPU usage 
     * @return CpuUsage CPU usage
     */
    public Float getCpuUsage() {
        return this.CpuUsage;
    }

    /**
     * Set CPU usage
     * @param CpuUsage CPU usage
     */
    public void setCpuUsage(Float CpuUsage) {
        this.CpuUsage = CpuUsage;
    }

    /**
     * Get Availability zone 
     * @return Zone Availability zone
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set Availability zone
     * @param Zone Availability zone
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    public KibanaView() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public KibanaView(KibanaView source) {
        if (source.Ip != null) {
            this.Ip = new String(source.Ip);
        }
        if (source.DiskSize != null) {
            this.DiskSize = new Long(source.DiskSize);
        }
        if (source.DiskUsage != null) {
            this.DiskUsage = new Float(source.DiskUsage);
        }
        if (source.MemSize != null) {
            this.MemSize = new Long(source.MemSize);
        }
        if (source.MemUsage != null) {
            this.MemUsage = new Float(source.MemUsage);
        }
        if (source.CpuNum != null) {
            this.CpuNum = new Long(source.CpuNum);
        }
        if (source.CpuUsage != null) {
            this.CpuUsage = new Float(source.CpuUsage);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Ip", this.Ip);
        this.setParamSimple(map, prefix + "DiskSize", this.DiskSize);
        this.setParamSimple(map, prefix + "DiskUsage", this.DiskUsage);
        this.setParamSimple(map, prefix + "MemSize", this.MemSize);
        this.setParamSimple(map, prefix + "MemUsage", this.MemUsage);
        this.setParamSimple(map, prefix + "CpuNum", this.CpuNum);
        this.setParamSimple(map, prefix + "CpuUsage", this.CpuUsage);
        this.setParamSimple(map, prefix + "Zone", this.Zone);

    }
}

