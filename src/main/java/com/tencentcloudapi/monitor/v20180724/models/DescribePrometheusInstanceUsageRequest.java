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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribePrometheusInstanceUsageRequest extends AbstractModel {

    /**
    * Query by one or more instance IDs. Instance ID is in the format of `prom-xxxxxxxx`. Up to 100 instances can be queried in one request.
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * Start time
    */
    @SerializedName("StartCalcDate")
    @Expose
    private String StartCalcDate;

    /**
    * End time
    */
    @SerializedName("EndCalcDate")
    @Expose
    private String EndCalcDate;

    /**
     * Get Query by one or more instance IDs. Instance ID is in the format of `prom-xxxxxxxx`. Up to 100 instances can be queried in one request. 
     * @return InstanceIds Query by one or more instance IDs. Instance ID is in the format of `prom-xxxxxxxx`. Up to 100 instances can be queried in one request.
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set Query by one or more instance IDs. Instance ID is in the format of `prom-xxxxxxxx`. Up to 100 instances can be queried in one request.
     * @param InstanceIds Query by one or more instance IDs. Instance ID is in the format of `prom-xxxxxxxx`. Up to 100 instances can be queried in one request.
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Get Start time 
     * @return StartCalcDate Start time
     */
    public String getStartCalcDate() {
        return this.StartCalcDate;
    }

    /**
     * Set Start time
     * @param StartCalcDate Start time
     */
    public void setStartCalcDate(String StartCalcDate) {
        this.StartCalcDate = StartCalcDate;
    }

    /**
     * Get End time 
     * @return EndCalcDate End time
     */
    public String getEndCalcDate() {
        return this.EndCalcDate;
    }

    /**
     * Set End time
     * @param EndCalcDate End time
     */
    public void setEndCalcDate(String EndCalcDate) {
        this.EndCalcDate = EndCalcDate;
    }

    public DescribePrometheusInstanceUsageRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribePrometheusInstanceUsageRequest(DescribePrometheusInstanceUsageRequest source) {
        if (source.InstanceIds != null) {
            this.InstanceIds = new String[source.InstanceIds.length];
            for (int i = 0; i < source.InstanceIds.length; i++) {
                this.InstanceIds[i] = new String(source.InstanceIds[i]);
            }
        }
        if (source.StartCalcDate != null) {
            this.StartCalcDate = new String(source.StartCalcDate);
        }
        if (source.EndCalcDate != null) {
            this.EndCalcDate = new String(source.EndCalcDate);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);
        this.setParamSimple(map, prefix + "StartCalcDate", this.StartCalcDate);
        this.setParamSimple(map, prefix + "EndCalcDate", this.EndCalcDate);

    }
}

