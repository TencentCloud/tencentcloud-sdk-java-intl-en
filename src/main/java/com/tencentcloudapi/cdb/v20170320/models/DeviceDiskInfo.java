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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeviceDiskInfo extends AbstractModel {

    /**
    * Time percentage of IO operations per second
    */
    @SerializedName("IoRatioPerSec")
    @Expose
    private Long [] IoRatioPerSec;

    /**
    * Average wait time of device I/O operations * 100 in milliseconds. For example, if the value is 201, the average wait time of I/O operations is 201/100 = 2.1 milliseconds.
    */
    @SerializedName("IoWaitTime")
    @Expose
    private Long [] IoWaitTime;

    /**
    * Average number of read operations completed by the disk per second * 100. For example, if the value is 2,002, the average number of read operations completed by the disk per second is 2,002/100=20.2.
    */
    @SerializedName("Read")
    @Expose
    private Long [] Read;

    /**
    * Average number of write operations completed by the disk per second * 100. For example, if the value is 30,001, the average number of write operations completed by the disk per second is 30,001/100=300.01.
    */
    @SerializedName("Write")
    @Expose
    private Long [] Write;

    /**
    * Disk capacity. Each value is comprised of two data, with the first data representing the used capacity and the second one representing the total disk capacity.
    */
    @SerializedName("CapacityRatio")
    @Expose
    private Long [] CapacityRatio;

    /**
     * Get Time percentage of IO operations per second 
     * @return IoRatioPerSec Time percentage of IO operations per second
     */
    public Long [] getIoRatioPerSec() {
        return this.IoRatioPerSec;
    }

    /**
     * Set Time percentage of IO operations per second
     * @param IoRatioPerSec Time percentage of IO operations per second
     */
    public void setIoRatioPerSec(Long [] IoRatioPerSec) {
        this.IoRatioPerSec = IoRatioPerSec;
    }

    /**
     * Get Average wait time of device I/O operations * 100 in milliseconds. For example, if the value is 201, the average wait time of I/O operations is 201/100 = 2.1 milliseconds. 
     * @return IoWaitTime Average wait time of device I/O operations * 100 in milliseconds. For example, if the value is 201, the average wait time of I/O operations is 201/100 = 2.1 milliseconds.
     */
    public Long [] getIoWaitTime() {
        return this.IoWaitTime;
    }

    /**
     * Set Average wait time of device I/O operations * 100 in milliseconds. For example, if the value is 201, the average wait time of I/O operations is 201/100 = 2.1 milliseconds.
     * @param IoWaitTime Average wait time of device I/O operations * 100 in milliseconds. For example, if the value is 201, the average wait time of I/O operations is 201/100 = 2.1 milliseconds.
     */
    public void setIoWaitTime(Long [] IoWaitTime) {
        this.IoWaitTime = IoWaitTime;
    }

    /**
     * Get Average number of read operations completed by the disk per second * 100. For example, if the value is 2,002, the average number of read operations completed by the disk per second is 2,002/100=20.2. 
     * @return Read Average number of read operations completed by the disk per second * 100. For example, if the value is 2,002, the average number of read operations completed by the disk per second is 2,002/100=20.2.
     */
    public Long [] getRead() {
        return this.Read;
    }

    /**
     * Set Average number of read operations completed by the disk per second * 100. For example, if the value is 2,002, the average number of read operations completed by the disk per second is 2,002/100=20.2.
     * @param Read Average number of read operations completed by the disk per second * 100. For example, if the value is 2,002, the average number of read operations completed by the disk per second is 2,002/100=20.2.
     */
    public void setRead(Long [] Read) {
        this.Read = Read;
    }

    /**
     * Get Average number of write operations completed by the disk per second * 100. For example, if the value is 30,001, the average number of write operations completed by the disk per second is 30,001/100=300.01. 
     * @return Write Average number of write operations completed by the disk per second * 100. For example, if the value is 30,001, the average number of write operations completed by the disk per second is 30,001/100=300.01.
     */
    public Long [] getWrite() {
        return this.Write;
    }

    /**
     * Set Average number of write operations completed by the disk per second * 100. For example, if the value is 30,001, the average number of write operations completed by the disk per second is 30,001/100=300.01.
     * @param Write Average number of write operations completed by the disk per second * 100. For example, if the value is 30,001, the average number of write operations completed by the disk per second is 30,001/100=300.01.
     */
    public void setWrite(Long [] Write) {
        this.Write = Write;
    }

    /**
     * Get Disk capacity. Each value is comprised of two data, with the first data representing the used capacity and the second one representing the total disk capacity. 
     * @return CapacityRatio Disk capacity. Each value is comprised of two data, with the first data representing the used capacity and the second one representing the total disk capacity.
     */
    public Long [] getCapacityRatio() {
        return this.CapacityRatio;
    }

    /**
     * Set Disk capacity. Each value is comprised of two data, with the first data representing the used capacity and the second one representing the total disk capacity.
     * @param CapacityRatio Disk capacity. Each value is comprised of two data, with the first data representing the used capacity and the second one representing the total disk capacity.
     */
    public void setCapacityRatio(Long [] CapacityRatio) {
        this.CapacityRatio = CapacityRatio;
    }

    public DeviceDiskInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeviceDiskInfo(DeviceDiskInfo source) {
        if (source.IoRatioPerSec != null) {
            this.IoRatioPerSec = new Long[source.IoRatioPerSec.length];
            for (int i = 0; i < source.IoRatioPerSec.length; i++) {
                this.IoRatioPerSec[i] = new Long(source.IoRatioPerSec[i]);
            }
        }
        if (source.IoWaitTime != null) {
            this.IoWaitTime = new Long[source.IoWaitTime.length];
            for (int i = 0; i < source.IoWaitTime.length; i++) {
                this.IoWaitTime[i] = new Long(source.IoWaitTime[i]);
            }
        }
        if (source.Read != null) {
            this.Read = new Long[source.Read.length];
            for (int i = 0; i < source.Read.length; i++) {
                this.Read[i] = new Long(source.Read[i]);
            }
        }
        if (source.Write != null) {
            this.Write = new Long[source.Write.length];
            for (int i = 0; i < source.Write.length; i++) {
                this.Write[i] = new Long(source.Write[i]);
            }
        }
        if (source.CapacityRatio != null) {
            this.CapacityRatio = new Long[source.CapacityRatio.length];
            for (int i = 0; i < source.CapacityRatio.length; i++) {
                this.CapacityRatio[i] = new Long(source.CapacityRatio[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "IoRatioPerSec.", this.IoRatioPerSec);
        this.setParamArraySimple(map, prefix + "IoWaitTime.", this.IoWaitTime);
        this.setParamArraySimple(map, prefix + "Read.", this.Read);
        this.setParamArraySimple(map, prefix + "Write.", this.Write);
        this.setParamArraySimple(map, prefix + "CapacityRatio.", this.CapacityRatio);

    }
}

