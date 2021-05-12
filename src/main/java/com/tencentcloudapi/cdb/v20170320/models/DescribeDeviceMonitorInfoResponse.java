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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDeviceMonitorInfoResponse extends AbstractModel{

    /**
    * CPU monitoring data of the instance
    */
    @SerializedName("Cpu")
    @Expose
    private DeviceCpuInfo Cpu;

    /**
    * Memory monitoring data of the instance
    */
    @SerializedName("Mem")
    @Expose
    private DeviceMemInfo Mem;

    /**
    * Network monitoring data of the instance
    */
    @SerializedName("Net")
    @Expose
    private DeviceNetInfo Net;

    /**
    * Disk monitoring data of the instance
    */
    @SerializedName("Disk")
    @Expose
    private DeviceDiskInfo Disk;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get CPU monitoring data of the instance 
     * @return Cpu CPU monitoring data of the instance
     */
    public DeviceCpuInfo getCpu() {
        return this.Cpu;
    }

    /**
     * Set CPU monitoring data of the instance
     * @param Cpu CPU monitoring data of the instance
     */
    public void setCpu(DeviceCpuInfo Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get Memory monitoring data of the instance 
     * @return Mem Memory monitoring data of the instance
     */
    public DeviceMemInfo getMem() {
        return this.Mem;
    }

    /**
     * Set Memory monitoring data of the instance
     * @param Mem Memory monitoring data of the instance
     */
    public void setMem(DeviceMemInfo Mem) {
        this.Mem = Mem;
    }

    /**
     * Get Network monitoring data of the instance 
     * @return Net Network monitoring data of the instance
     */
    public DeviceNetInfo getNet() {
        return this.Net;
    }

    /**
     * Set Network monitoring data of the instance
     * @param Net Network monitoring data of the instance
     */
    public void setNet(DeviceNetInfo Net) {
        this.Net = Net;
    }

    /**
     * Get Disk monitoring data of the instance 
     * @return Disk Disk monitoring data of the instance
     */
    public DeviceDiskInfo getDisk() {
        return this.Disk;
    }

    /**
     * Set Disk monitoring data of the instance
     * @param Disk Disk monitoring data of the instance
     */
    public void setDisk(DeviceDiskInfo Disk) {
        this.Disk = Disk;
    }

    /**
     * Get The unique request ID, which is returned for each request. RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     * @param RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeDeviceMonitorInfoResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDeviceMonitorInfoResponse(DescribeDeviceMonitorInfoResponse source) {
        if (source.Cpu != null) {
            this.Cpu = new DeviceCpuInfo(source.Cpu);
        }
        if (source.Mem != null) {
            this.Mem = new DeviceMemInfo(source.Mem);
        }
        if (source.Net != null) {
            this.Net = new DeviceNetInfo(source.Net);
        }
        if (source.Disk != null) {
            this.Disk = new DeviceDiskInfo(source.Disk);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Cpu.", this.Cpu);
        this.setParamObj(map, prefix + "Mem.", this.Mem);
        this.setParamObj(map, prefix + "Net.", this.Net);
        this.setParamObj(map, prefix + "Disk.", this.Disk);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

