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
package com.tencentcloudapi.dbbrain.v20191016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDBSpaceStatusResponse extends AbstractModel {

    /**
    * Disk usage growth in MB.
    */
    @SerializedName("Growth")
    @Expose
    private Long Growth;

    /**
    * Available disk space in MB.
    */
    @SerializedName("Remain")
    @Expose
    private Long Remain;

    /**
    * Total disk space in MB.
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * Estimated number of available days.
    */
    @SerializedName("AvailableDays")
    @Expose
    private Long AvailableDays;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Disk usage growth in MB. 
     * @return Growth Disk usage growth in MB.
     */
    public Long getGrowth() {
        return this.Growth;
    }

    /**
     * Set Disk usage growth in MB.
     * @param Growth Disk usage growth in MB.
     */
    public void setGrowth(Long Growth) {
        this.Growth = Growth;
    }

    /**
     * Get Available disk space in MB. 
     * @return Remain Available disk space in MB.
     */
    public Long getRemain() {
        return this.Remain;
    }

    /**
     * Set Available disk space in MB.
     * @param Remain Available disk space in MB.
     */
    public void setRemain(Long Remain) {
        this.Remain = Remain;
    }

    /**
     * Get Total disk space in MB. 
     * @return Total Total disk space in MB.
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set Total disk space in MB.
     * @param Total Total disk space in MB.
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get Estimated number of available days. 
     * @return AvailableDays Estimated number of available days.
     */
    public Long getAvailableDays() {
        return this.AvailableDays;
    }

    /**
     * Set Estimated number of available days.
     * @param AvailableDays Estimated number of available days.
     */
    public void setAvailableDays(Long AvailableDays) {
        this.AvailableDays = AvailableDays;
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

    public DescribeDBSpaceStatusResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDBSpaceStatusResponse(DescribeDBSpaceStatusResponse source) {
        if (source.Growth != null) {
            this.Growth = new Long(source.Growth);
        }
        if (source.Remain != null) {
            this.Remain = new Long(source.Remain);
        }
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
        if (source.AvailableDays != null) {
            this.AvailableDays = new Long(source.AvailableDays);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Growth", this.Growth);
        this.setParamSimple(map, prefix + "Remain", this.Remain);
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamSimple(map, prefix + "AvailableDays", this.AvailableDays);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

