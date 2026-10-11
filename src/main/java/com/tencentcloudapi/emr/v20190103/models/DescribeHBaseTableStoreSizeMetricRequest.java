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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeHBaseTableStoreSizeMetricRequest extends AbstractModel {

    /**
    * Cluster ID.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * HBase table name.
    */
    @SerializedName("TableName")
    @Expose
    private String TableName;

    /**
    * HBase RegionServer service.
    */
    @SerializedName("RegionServer")
    @Expose
    private String RegionServer;

    /**
    * Specifies the data monitoring granularity to be obtained.
    */
    @SerializedName("Downsample")
    @Expose
    private String Downsample;

    /**
    * Specifies the start timestamp of the monitoring data to be queried.
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * Specifies the end timestamp of the monitoring data to be queried.
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
     * Get Cluster ID. 
     * @return InstanceId Cluster ID.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Cluster ID.
     * @param InstanceId Cluster ID.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get HBase table name. 
     * @return TableName HBase table name.
     */
    public String getTableName() {
        return this.TableName;
    }

    /**
     * Set HBase table name.
     * @param TableName HBase table name.
     */
    public void setTableName(String TableName) {
        this.TableName = TableName;
    }

    /**
     * Get HBase RegionServer service. 
     * @return RegionServer HBase RegionServer service.
     */
    public String getRegionServer() {
        return this.RegionServer;
    }

    /**
     * Set HBase RegionServer service.
     * @param RegionServer HBase RegionServer service.
     */
    public void setRegionServer(String RegionServer) {
        this.RegionServer = RegionServer;
    }

    /**
     * Get Specifies the data monitoring granularity to be obtained. 
     * @return Downsample Specifies the data monitoring granularity to be obtained.
     */
    public String getDownsample() {
        return this.Downsample;
    }

    /**
     * Set Specifies the data monitoring granularity to be obtained.
     * @param Downsample Specifies the data monitoring granularity to be obtained.
     */
    public void setDownsample(String Downsample) {
        this.Downsample = Downsample;
    }

    /**
     * Get Specifies the start timestamp of the monitoring data to be queried. 
     * @return StartTime Specifies the start timestamp of the monitoring data to be queried.
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Specifies the start timestamp of the monitoring data to be queried.
     * @param StartTime Specifies the start timestamp of the monitoring data to be queried.
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get Specifies the end timestamp of the monitoring data to be queried. 
     * @return EndTime Specifies the end timestamp of the monitoring data to be queried.
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set Specifies the end timestamp of the monitoring data to be queried.
     * @param EndTime Specifies the end timestamp of the monitoring data to be queried.
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    public DescribeHBaseTableStoreSizeMetricRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeHBaseTableStoreSizeMetricRequest(DescribeHBaseTableStoreSizeMetricRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.TableName != null) {
            this.TableName = new String(source.TableName);
        }
        if (source.RegionServer != null) {
            this.RegionServer = new String(source.RegionServer);
        }
        if (source.Downsample != null) {
            this.Downsample = new String(source.Downsample);
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "TableName", this.TableName);
        this.setParamSimple(map, prefix + "RegionServer", this.RegionServer);
        this.setParamSimple(map, prefix + "Downsample", this.Downsample);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);

    }
}

