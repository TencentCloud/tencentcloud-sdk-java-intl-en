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
package com.tencentcloudapi.dayu.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDDoSAttackSourceResponse extends AbstractModel {

    /**
    * Total number of attack sources
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * Attack source list
    */
    @SerializedName("AttackSourceList")
    @Expose
    private DDoSAttackSourceRecord [] AttackSourceList;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Total number of attack sources 
     * @return Total Total number of attack sources
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set Total number of attack sources
     * @param Total Total number of attack sources
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get Attack source list 
     * @return AttackSourceList Attack source list
     */
    public DDoSAttackSourceRecord [] getAttackSourceList() {
        return this.AttackSourceList;
    }

    /**
     * Set Attack source list
     * @param AttackSourceList Attack source list
     */
    public void setAttackSourceList(DDoSAttackSourceRecord [] AttackSourceList) {
        this.AttackSourceList = AttackSourceList;
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

    public DescribeDDoSAttackSourceResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDDoSAttackSourceResponse(DescribeDDoSAttackSourceResponse source) {
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
        if (source.AttackSourceList != null) {
            this.AttackSourceList = new DDoSAttackSourceRecord[source.AttackSourceList.length];
            for (int i = 0; i < source.AttackSourceList.length; i++) {
                this.AttackSourceList[i] = new DDoSAttackSourceRecord(source.AttackSourceList[i]);
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
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamArrayObj(map, prefix + "AttackSourceList.", this.AttackSourceList);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

