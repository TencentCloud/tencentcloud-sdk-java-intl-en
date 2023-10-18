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
package com.tencentcloudapi.tiw.v20190919.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTIWRoomDailyUsageResponse extends AbstractModel {

    /**
    * Usage of the specified product per room during the specified query period.
    */
    @SerializedName("Usages")
    @Expose
    private RoomUsageDataItem [] Usages;

    /**
    * Number of usage data entries.
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Usage of the specified product per room during the specified query period. 
     * @return Usages Usage of the specified product per room during the specified query period.
     */
    public RoomUsageDataItem [] getUsages() {
        return this.Usages;
    }

    /**
     * Set Usage of the specified product per room during the specified query period.
     * @param Usages Usage of the specified product per room during the specified query period.
     */
    public void setUsages(RoomUsageDataItem [] Usages) {
        this.Usages = Usages;
    }

    /**
     * Get Number of usage data entries. 
     * @return Total Number of usage data entries.
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set Number of usage data entries.
     * @param Total Number of usage data entries.
     */
    public void setTotal(Long Total) {
        this.Total = Total;
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

    public DescribeTIWRoomDailyUsageResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTIWRoomDailyUsageResponse(DescribeTIWRoomDailyUsageResponse source) {
        if (source.Usages != null) {
            this.Usages = new RoomUsageDataItem[source.Usages.length];
            for (int i = 0; i < source.Usages.length; i++) {
                this.Usages[i] = new RoomUsageDataItem(source.Usages[i]);
            }
        }
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Usages.", this.Usages);
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

