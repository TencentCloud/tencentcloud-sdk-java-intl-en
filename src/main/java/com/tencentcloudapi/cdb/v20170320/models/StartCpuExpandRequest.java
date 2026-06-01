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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class StartCpuExpandRequest extends AbstractModel {

    /**
    * Instance ID, which can be obtained through the [DescribeDBInstances](https://www.tencentcloud.com/document/product/236/15872?from_cn_redirect=1) API.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Scale-out type supports auto-scaling and custom scaling.
Description: 1. auto means automatic scaling. 2. manual means custom scaling with immediate effect. 3. timeInterval means custom scaling by time. 4. period means custom scaling by cycle.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Number of CPU cores for scale-out during customization.
Description: 1. This parameter is required when Type is set to manual, timeInterval, or period. 2. The maximum number of CPU cores to increase is the current instance's CPU core number. For example, an 8-core 16GB instance can scale out up to 8 CPU cores, with a range of 1 - 8.
    */
    @SerializedName("ExpandCpu")
    @Expose
    private Long ExpandCpu;

    /**
    * Automatic scale-out policy. This parameter is required when Type is set to auto.
    */
    @SerializedName("AutoStrategy")
    @Expose
    private AutoStrategy AutoStrategy;

    /**
    * Scaling policy by time period.
Description: When Type is timeInterval, TimeIntervalStrategy is required.
    */
    @SerializedName("TimeIntervalStrategy")
    @Expose
    private TimeIntervalStrategy TimeIntervalStrategy;

    /**
    * Scale by cycle.
Description: When Type is period, PeriodStrategy is required.
    */
    @SerializedName("PeriodStrategy")
    @Expose
    private PeriodStrategy PeriodStrategy;

    /**
     * Get Instance ID, which can be obtained through the [DescribeDBInstances](https://www.tencentcloud.com/document/product/236/15872?from_cn_redirect=1) API. 
     * @return InstanceId Instance ID, which can be obtained through the [DescribeDBInstances](https://www.tencentcloud.com/document/product/236/15872?from_cn_redirect=1) API.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID, which can be obtained through the [DescribeDBInstances](https://www.tencentcloud.com/document/product/236/15872?from_cn_redirect=1) API.
     * @param InstanceId Instance ID, which can be obtained through the [DescribeDBInstances](https://www.tencentcloud.com/document/product/236/15872?from_cn_redirect=1) API.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Scale-out type supports auto-scaling and custom scaling.
Description: 1. auto means automatic scaling. 2. manual means custom scaling with immediate effect. 3. timeInterval means custom scaling by time. 4. period means custom scaling by cycle. 
     * @return Type Scale-out type supports auto-scaling and custom scaling.
Description: 1. auto means automatic scaling. 2. manual means custom scaling with immediate effect. 3. timeInterval means custom scaling by time. 4. period means custom scaling by cycle.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Scale-out type supports auto-scaling and custom scaling.
Description: 1. auto means automatic scaling. 2. manual means custom scaling with immediate effect. 3. timeInterval means custom scaling by time. 4. period means custom scaling by cycle.
     * @param Type Scale-out type supports auto-scaling and custom scaling.
Description: 1. auto means automatic scaling. 2. manual means custom scaling with immediate effect. 3. timeInterval means custom scaling by time. 4. period means custom scaling by cycle.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Number of CPU cores for scale-out during customization.
Description: 1. This parameter is required when Type is set to manual, timeInterval, or period. 2. The maximum number of CPU cores to increase is the current instance's CPU core number. For example, an 8-core 16GB instance can scale out up to 8 CPU cores, with a range of 1 - 8. 
     * @return ExpandCpu Number of CPU cores for scale-out during customization.
Description: 1. This parameter is required when Type is set to manual, timeInterval, or period. 2. The maximum number of CPU cores to increase is the current instance's CPU core number. For example, an 8-core 16GB instance can scale out up to 8 CPU cores, with a range of 1 - 8.
     */
    public Long getExpandCpu() {
        return this.ExpandCpu;
    }

    /**
     * Set Number of CPU cores for scale-out during customization.
Description: 1. This parameter is required when Type is set to manual, timeInterval, or period. 2. The maximum number of CPU cores to increase is the current instance's CPU core number. For example, an 8-core 16GB instance can scale out up to 8 CPU cores, with a range of 1 - 8.
     * @param ExpandCpu Number of CPU cores for scale-out during customization.
Description: 1. This parameter is required when Type is set to manual, timeInterval, or period. 2. The maximum number of CPU cores to increase is the current instance's CPU core number. For example, an 8-core 16GB instance can scale out up to 8 CPU cores, with a range of 1 - 8.
     */
    public void setExpandCpu(Long ExpandCpu) {
        this.ExpandCpu = ExpandCpu;
    }

    /**
     * Get Automatic scale-out policy. This parameter is required when Type is set to auto. 
     * @return AutoStrategy Automatic scale-out policy. This parameter is required when Type is set to auto.
     */
    public AutoStrategy getAutoStrategy() {
        return this.AutoStrategy;
    }

    /**
     * Set Automatic scale-out policy. This parameter is required when Type is set to auto.
     * @param AutoStrategy Automatic scale-out policy. This parameter is required when Type is set to auto.
     */
    public void setAutoStrategy(AutoStrategy AutoStrategy) {
        this.AutoStrategy = AutoStrategy;
    }

    /**
     * Get Scaling policy by time period.
Description: When Type is timeInterval, TimeIntervalStrategy is required. 
     * @return TimeIntervalStrategy Scaling policy by time period.
Description: When Type is timeInterval, TimeIntervalStrategy is required.
     */
    public TimeIntervalStrategy getTimeIntervalStrategy() {
        return this.TimeIntervalStrategy;
    }

    /**
     * Set Scaling policy by time period.
Description: When Type is timeInterval, TimeIntervalStrategy is required.
     * @param TimeIntervalStrategy Scaling policy by time period.
Description: When Type is timeInterval, TimeIntervalStrategy is required.
     */
    public void setTimeIntervalStrategy(TimeIntervalStrategy TimeIntervalStrategy) {
        this.TimeIntervalStrategy = TimeIntervalStrategy;
    }

    /**
     * Get Scale by cycle.
Description: When Type is period, PeriodStrategy is required. 
     * @return PeriodStrategy Scale by cycle.
Description: When Type is period, PeriodStrategy is required.
     */
    public PeriodStrategy getPeriodStrategy() {
        return this.PeriodStrategy;
    }

    /**
     * Set Scale by cycle.
Description: When Type is period, PeriodStrategy is required.
     * @param PeriodStrategy Scale by cycle.
Description: When Type is period, PeriodStrategy is required.
     */
    public void setPeriodStrategy(PeriodStrategy PeriodStrategy) {
        this.PeriodStrategy = PeriodStrategy;
    }

    public StartCpuExpandRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StartCpuExpandRequest(StartCpuExpandRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.ExpandCpu != null) {
            this.ExpandCpu = new Long(source.ExpandCpu);
        }
        if (source.AutoStrategy != null) {
            this.AutoStrategy = new AutoStrategy(source.AutoStrategy);
        }
        if (source.TimeIntervalStrategy != null) {
            this.TimeIntervalStrategy = new TimeIntervalStrategy(source.TimeIntervalStrategy);
        }
        if (source.PeriodStrategy != null) {
            this.PeriodStrategy = new PeriodStrategy(source.PeriodStrategy);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "ExpandCpu", this.ExpandCpu);
        this.setParamObj(map, prefix + "AutoStrategy.", this.AutoStrategy);
        this.setParamObj(map, prefix + "TimeIntervalStrategy.", this.TimeIntervalStrategy);
        this.setParamObj(map, prefix + "PeriodStrategy.", this.PeriodStrategy);

    }
}

