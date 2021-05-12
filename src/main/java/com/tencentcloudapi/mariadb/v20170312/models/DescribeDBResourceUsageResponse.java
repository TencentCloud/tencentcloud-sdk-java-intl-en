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
package com.tencentcloudapi.mariadb.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDBResourceUsageResponse extends AbstractModel{

    /**
    * Available capacity of binlog disk in GB
    */
    @SerializedName("BinlogDiskAvailable")
    @Expose
    private MonitorData BinlogDiskAvailable;

    /**
    * Available disk capacity in GB
    */
    @SerializedName("DataDiskAvailable")
    @Expose
    private MonitorData DataDiskAvailable;

    /**
    * CPU utilization
    */
    @SerializedName("CpuUsageRate")
    @Expose
    private MonitorData CpuUsageRate;

    /**
    * Available memory size in GB
    */
    @SerializedName("MemAvailable")
    @Expose
    private MonitorData MemAvailable;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Available capacity of binlog disk in GB 
     * @return BinlogDiskAvailable Available capacity of binlog disk in GB
     */
    public MonitorData getBinlogDiskAvailable() {
        return this.BinlogDiskAvailable;
    }

    /**
     * Set Available capacity of binlog disk in GB
     * @param BinlogDiskAvailable Available capacity of binlog disk in GB
     */
    public void setBinlogDiskAvailable(MonitorData BinlogDiskAvailable) {
        this.BinlogDiskAvailable = BinlogDiskAvailable;
    }

    /**
     * Get Available disk capacity in GB 
     * @return DataDiskAvailable Available disk capacity in GB
     */
    public MonitorData getDataDiskAvailable() {
        return this.DataDiskAvailable;
    }

    /**
     * Set Available disk capacity in GB
     * @param DataDiskAvailable Available disk capacity in GB
     */
    public void setDataDiskAvailable(MonitorData DataDiskAvailable) {
        this.DataDiskAvailable = DataDiskAvailable;
    }

    /**
     * Get CPU utilization 
     * @return CpuUsageRate CPU utilization
     */
    public MonitorData getCpuUsageRate() {
        return this.CpuUsageRate;
    }

    /**
     * Set CPU utilization
     * @param CpuUsageRate CPU utilization
     */
    public void setCpuUsageRate(MonitorData CpuUsageRate) {
        this.CpuUsageRate = CpuUsageRate;
    }

    /**
     * Get Available memory size in GB 
     * @return MemAvailable Available memory size in GB
     */
    public MonitorData getMemAvailable() {
        return this.MemAvailable;
    }

    /**
     * Set Available memory size in GB
     * @param MemAvailable Available memory size in GB
     */
    public void setMemAvailable(MonitorData MemAvailable) {
        this.MemAvailable = MemAvailable;
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

    public DescribeDBResourceUsageResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDBResourceUsageResponse(DescribeDBResourceUsageResponse source) {
        if (source.BinlogDiskAvailable != null) {
            this.BinlogDiskAvailable = new MonitorData(source.BinlogDiskAvailable);
        }
        if (source.DataDiskAvailable != null) {
            this.DataDiskAvailable = new MonitorData(source.DataDiskAvailable);
        }
        if (source.CpuUsageRate != null) {
            this.CpuUsageRate = new MonitorData(source.CpuUsageRate);
        }
        if (source.MemAvailable != null) {
            this.MemAvailable = new MonitorData(source.MemAvailable);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "BinlogDiskAvailable.", this.BinlogDiskAvailable);
        this.setParamObj(map, prefix + "DataDiskAvailable.", this.DataDiskAvailable);
        this.setParamObj(map, prefix + "CpuUsageRate.", this.CpuUsageRate);
        this.setParamObj(map, prefix + "MemAvailable.", this.MemAvailable);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

