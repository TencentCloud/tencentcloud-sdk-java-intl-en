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

public class DeviceDiskInfo extends AbstractModel{

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
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "IoRatioPerSec.", this.IoRatioPerSec);
        this.setParamArraySimple(map, prefix + "IoWaitTime.", this.IoWaitTime);
        this.setParamArraySimple(map, prefix + "Read.", this.Read);
        this.setParamArraySimple(map, prefix + "Write.", this.Write);

    }
}

