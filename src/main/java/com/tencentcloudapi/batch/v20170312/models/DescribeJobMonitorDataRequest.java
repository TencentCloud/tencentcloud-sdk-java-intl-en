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
package com.tencentcloudapi.batch.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeJobMonitorDataRequest extends AbstractModel {

    /**
    * Job ID; see JobId in the job list (https://www.tencentcloud.com/document/product/599/15909?from_cn_redirect=1).
    */
    @SerializedName("JobId")
    @Expose
    private String JobId;

    /**
    * Name of the job Task. See [job details](https://www.tencentcloud.com/document/product/599/15904?from_cn_redirect=1).
    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
    * Serial number of the task instance. For details, see [Task Detail](https://www.tencentcloud.com/document/product/599/15905?from_cn_redirect=1).
    */
    @SerializedName("TaskInstanceIndex")
    @Expose
    private Long TaskInstanceIndex;

    /**
    * Supported metrics; Metrics to be queried for the task currently supported.

-CpuUsage: cpu usage, unit: %
-MemUsage: Memory usage, measurement unit: %
-LanOuttraffic: Private network outbound bandwidth, measurement unit: Bytes/s
-LanIntraffic: Private network inbound bandwidth, unit: Bytes/s
-MaxDiskUsage: Highest disk utilization among all disks. Measurement unit: %
-TargetDiskUsage: Specify disk utilization, unit: %; use in conjunction with the Dimensions parameter.
    */
    @SerializedName("MetricName")
    @Expose
    private String MetricName;

    /**
    * Query start time of the task instance. If the query start time is not passed in or the incoming time is less than the instance creation time (see task detail (https://www.tencentcloud.com/document/product/599/15905?from_cn_redirect=1) for instance creation time), the query time will automatically be adjusted to the instance creation time. The passed-in time format supports only the zero time zone format.
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * Query the termination time of the task instance. If the query end time is not passed in or the passed-in time is larger than the termination time of the task instance (see [task detail](https://www.tencentcloud.com/document/product/599/15905?from_cn_redirect=1) for the termination time of the task instance), and the task instance has already ended, the query end time will be automatically adjusted to the termination time of the task instance. If the task instance has not ended, the query end time will be automatically adjusted to the current time. The input time format supports only the zero time zone format.
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Query metrics extension parameter; currently only support TargetDiskUsage.

- TargetDiskUsage
-Supported query dimensions include diskname. The dimension value is the disk mount name, such as vdb. If this parameter is not provided, the default query is disk utilization of vdb.
Sample: [{"Name":"diskname", "Value":"vdb"}]
    */
    @SerializedName("Dimensions")
    @Expose
    private Dimension [] Dimensions;

    /**
     * Get Job ID; see JobId in the job list (https://www.tencentcloud.com/document/product/599/15909?from_cn_redirect=1). 
     * @return JobId Job ID; see JobId in the job list (https://www.tencentcloud.com/document/product/599/15909?from_cn_redirect=1).
     */
    public String getJobId() {
        return this.JobId;
    }

    /**
     * Set Job ID; see JobId in the job list (https://www.tencentcloud.com/document/product/599/15909?from_cn_redirect=1).
     * @param JobId Job ID; see JobId in the job list (https://www.tencentcloud.com/document/product/599/15909?from_cn_redirect=1).
     */
    public void setJobId(String JobId) {
        this.JobId = JobId;
    }

    /**
     * Get Name of the job Task. See [job details](https://www.tencentcloud.com/document/product/599/15904?from_cn_redirect=1). 
     * @return TaskName Name of the job Task. See [job details](https://www.tencentcloud.com/document/product/599/15904?from_cn_redirect=1).
     */
    public String getTaskName() {
        return this.TaskName;
    }

    /**
     * Set Name of the job Task. See [job details](https://www.tencentcloud.com/document/product/599/15904?from_cn_redirect=1).
     * @param TaskName Name of the job Task. See [job details](https://www.tencentcloud.com/document/product/599/15904?from_cn_redirect=1).
     */
    public void setTaskName(String TaskName) {
        this.TaskName = TaskName;
    }

    /**
     * Get Serial number of the task instance. For details, see [Task Detail](https://www.tencentcloud.com/document/product/599/15905?from_cn_redirect=1). 
     * @return TaskInstanceIndex Serial number of the task instance. For details, see [Task Detail](https://www.tencentcloud.com/document/product/599/15905?from_cn_redirect=1).
     */
    public Long getTaskInstanceIndex() {
        return this.TaskInstanceIndex;
    }

    /**
     * Set Serial number of the task instance. For details, see [Task Detail](https://www.tencentcloud.com/document/product/599/15905?from_cn_redirect=1).
     * @param TaskInstanceIndex Serial number of the task instance. For details, see [Task Detail](https://www.tencentcloud.com/document/product/599/15905?from_cn_redirect=1).
     */
    public void setTaskInstanceIndex(Long TaskInstanceIndex) {
        this.TaskInstanceIndex = TaskInstanceIndex;
    }

    /**
     * Get Supported metrics; Metrics to be queried for the task currently supported.

-CpuUsage: cpu usage, unit: %
-MemUsage: Memory usage, measurement unit: %
-LanOuttraffic: Private network outbound bandwidth, measurement unit: Bytes/s
-LanIntraffic: Private network inbound bandwidth, unit: Bytes/s
-MaxDiskUsage: Highest disk utilization among all disks. Measurement unit: %
-TargetDiskUsage: Specify disk utilization, unit: %; use in conjunction with the Dimensions parameter. 
     * @return MetricName Supported metrics; Metrics to be queried for the task currently supported.

-CpuUsage: cpu usage, unit: %
-MemUsage: Memory usage, measurement unit: %
-LanOuttraffic: Private network outbound bandwidth, measurement unit: Bytes/s
-LanIntraffic: Private network inbound bandwidth, unit: Bytes/s
-MaxDiskUsage: Highest disk utilization among all disks. Measurement unit: %
-TargetDiskUsage: Specify disk utilization, unit: %; use in conjunction with the Dimensions parameter.
     */
    public String getMetricName() {
        return this.MetricName;
    }

    /**
     * Set Supported metrics; Metrics to be queried for the task currently supported.

-CpuUsage: cpu usage, unit: %
-MemUsage: Memory usage, measurement unit: %
-LanOuttraffic: Private network outbound bandwidth, measurement unit: Bytes/s
-LanIntraffic: Private network inbound bandwidth, unit: Bytes/s
-MaxDiskUsage: Highest disk utilization among all disks. Measurement unit: %
-TargetDiskUsage: Specify disk utilization, unit: %; use in conjunction with the Dimensions parameter.
     * @param MetricName Supported metrics; Metrics to be queried for the task currently supported.

-CpuUsage: cpu usage, unit: %
-MemUsage: Memory usage, measurement unit: %
-LanOuttraffic: Private network outbound bandwidth, measurement unit: Bytes/s
-LanIntraffic: Private network inbound bandwidth, unit: Bytes/s
-MaxDiskUsage: Highest disk utilization among all disks. Measurement unit: %
-TargetDiskUsage: Specify disk utilization, unit: %; use in conjunction with the Dimensions parameter.
     */
    public void setMetricName(String MetricName) {
        this.MetricName = MetricName;
    }

    /**
     * Get Query start time of the task instance. If the query start time is not passed in or the incoming time is less than the instance creation time (see task detail (https://www.tencentcloud.com/document/product/599/15905?from_cn_redirect=1) for instance creation time), the query time will automatically be adjusted to the instance creation time. The passed-in time format supports only the zero time zone format. 
     * @return StartTime Query start time of the task instance. If the query start time is not passed in or the incoming time is less than the instance creation time (see task detail (https://www.tencentcloud.com/document/product/599/15905?from_cn_redirect=1) for instance creation time), the query time will automatically be adjusted to the instance creation time. The passed-in time format supports only the zero time zone format.
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Query start time of the task instance. If the query start time is not passed in or the incoming time is less than the instance creation time (see task detail (https://www.tencentcloud.com/document/product/599/15905?from_cn_redirect=1) for instance creation time), the query time will automatically be adjusted to the instance creation time. The passed-in time format supports only the zero time zone format.
     * @param StartTime Query start time of the task instance. If the query start time is not passed in or the incoming time is less than the instance creation time (see task detail (https://www.tencentcloud.com/document/product/599/15905?from_cn_redirect=1) for instance creation time), the query time will automatically be adjusted to the instance creation time. The passed-in time format supports only the zero time zone format.
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get Query the termination time of the task instance. If the query end time is not passed in or the passed-in time is larger than the termination time of the task instance (see [task detail](https://www.tencentcloud.com/document/product/599/15905?from_cn_redirect=1) for the termination time of the task instance), and the task instance has already ended, the query end time will be automatically adjusted to the termination time of the task instance. If the task instance has not ended, the query end time will be automatically adjusted to the current time. The input time format supports only the zero time zone format. 
     * @return EndTime Query the termination time of the task instance. If the query end time is not passed in or the passed-in time is larger than the termination time of the task instance (see [task detail](https://www.tencentcloud.com/document/product/599/15905?from_cn_redirect=1) for the termination time of the task instance), and the task instance has already ended, the query end time will be automatically adjusted to the termination time of the task instance. If the task instance has not ended, the query end time will be automatically adjusted to the current time. The input time format supports only the zero time zone format.
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set Query the termination time of the task instance. If the query end time is not passed in or the passed-in time is larger than the termination time of the task instance (see [task detail](https://www.tencentcloud.com/document/product/599/15905?from_cn_redirect=1) for the termination time of the task instance), and the task instance has already ended, the query end time will be automatically adjusted to the termination time of the task instance. If the task instance has not ended, the query end time will be automatically adjusted to the current time. The input time format supports only the zero time zone format.
     * @param EndTime Query the termination time of the task instance. If the query end time is not passed in or the passed-in time is larger than the termination time of the task instance (see [task detail](https://www.tencentcloud.com/document/product/599/15905?from_cn_redirect=1) for the termination time of the task instance), and the task instance has already ended, the query end time will be automatically adjusted to the termination time of the task instance. If the task instance has not ended, the query end time will be automatically adjusted to the current time. The input time format supports only the zero time zone format.
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Query metrics extension parameter; currently only support TargetDiskUsage.

- TargetDiskUsage
-Supported query dimensions include diskname. The dimension value is the disk mount name, such as vdb. If this parameter is not provided, the default query is disk utilization of vdb.
Sample: [{"Name":"diskname", "Value":"vdb"}] 
     * @return Dimensions Query metrics extension parameter; currently only support TargetDiskUsage.

- TargetDiskUsage
-Supported query dimensions include diskname. The dimension value is the disk mount name, such as vdb. If this parameter is not provided, the default query is disk utilization of vdb.
Sample: [{"Name":"diskname", "Value":"vdb"}]
     */
    public Dimension [] getDimensions() {
        return this.Dimensions;
    }

    /**
     * Set Query metrics extension parameter; currently only support TargetDiskUsage.

- TargetDiskUsage
-Supported query dimensions include diskname. The dimension value is the disk mount name, such as vdb. If this parameter is not provided, the default query is disk utilization of vdb.
Sample: [{"Name":"diskname", "Value":"vdb"}]
     * @param Dimensions Query metrics extension parameter; currently only support TargetDiskUsage.

- TargetDiskUsage
-Supported query dimensions include diskname. The dimension value is the disk mount name, such as vdb. If this parameter is not provided, the default query is disk utilization of vdb.
Sample: [{"Name":"diskname", "Value":"vdb"}]
     */
    public void setDimensions(Dimension [] Dimensions) {
        this.Dimensions = Dimensions;
    }

    public DescribeJobMonitorDataRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeJobMonitorDataRequest(DescribeJobMonitorDataRequest source) {
        if (source.JobId != null) {
            this.JobId = new String(source.JobId);
        }
        if (source.TaskName != null) {
            this.TaskName = new String(source.TaskName);
        }
        if (source.TaskInstanceIndex != null) {
            this.TaskInstanceIndex = new Long(source.TaskInstanceIndex);
        }
        if (source.MetricName != null) {
            this.MetricName = new String(source.MetricName);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.Dimensions != null) {
            this.Dimensions = new Dimension[source.Dimensions.length];
            for (int i = 0; i < source.Dimensions.length; i++) {
                this.Dimensions[i] = new Dimension(source.Dimensions[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "JobId", this.JobId);
        this.setParamSimple(map, prefix + "TaskName", this.TaskName);
        this.setParamSimple(map, prefix + "TaskInstanceIndex", this.TaskInstanceIndex);
        this.setParamSimple(map, prefix + "MetricName", this.MetricName);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamArrayObj(map, prefix + "Dimensions.", this.Dimensions);

    }
}

