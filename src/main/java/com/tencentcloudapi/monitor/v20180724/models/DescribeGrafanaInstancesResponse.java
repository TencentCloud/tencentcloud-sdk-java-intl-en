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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeGrafanaInstancesResponse extends AbstractModel{

    /**
    * This parameter has been disused. Use `Instances` instead.
    */
    @SerializedName("InstanceSet")
    @Expose
    private GrafanaInstanceInfo [] InstanceSet;

    /**
    * Number of eligible instances
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * List of instances
    */
    @SerializedName("Instances")
    @Expose
    private GrafanaInstanceInfo [] Instances;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get This parameter has been disused. Use `Instances` instead. 
     * @return InstanceSet This parameter has been disused. Use `Instances` instead.
     */
    public GrafanaInstanceInfo [] getInstanceSet() {
        return this.InstanceSet;
    }

    /**
     * Set This parameter has been disused. Use `Instances` instead.
     * @param InstanceSet This parameter has been disused. Use `Instances` instead.
     */
    public void setInstanceSet(GrafanaInstanceInfo [] InstanceSet) {
        this.InstanceSet = InstanceSet;
    }

    /**
     * Get Number of eligible instances 
     * @return TotalCount Number of eligible instances
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set Number of eligible instances
     * @param TotalCount Number of eligible instances
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get List of instances 
     * @return Instances List of instances
     */
    public GrafanaInstanceInfo [] getInstances() {
        return this.Instances;
    }

    /**
     * Set List of instances
     * @param Instances List of instances
     */
    public void setInstances(GrafanaInstanceInfo [] Instances) {
        this.Instances = Instances;
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

    public DescribeGrafanaInstancesResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeGrafanaInstancesResponse(DescribeGrafanaInstancesResponse source) {
        if (source.InstanceSet != null) {
            this.InstanceSet = new GrafanaInstanceInfo[source.InstanceSet.length];
            for (int i = 0; i < source.InstanceSet.length; i++) {
                this.InstanceSet[i] = new GrafanaInstanceInfo(source.InstanceSet[i]);
            }
        }
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.Instances != null) {
            this.Instances = new GrafanaInstanceInfo[source.Instances.length];
            for (int i = 0; i < source.Instances.length; i++) {
                this.Instances[i] = new GrafanaInstanceInfo(source.Instances[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "InstanceSet.", this.InstanceSet);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "Instances.", this.Instances);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

