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
package com.tencentcloudapi.dbbrain.v20210527.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDiagDBInstancesResponse extends AbstractModel{

    /**
    * Total number of instances.
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * Status of all instance inspection. 0: all instance inspection enabled, 1: all instance inspection disabled.
    */
    @SerializedName("DbScanStatus")
    @Expose
    private Long DbScanStatus;

    /**
    * Instance information.
    */
    @SerializedName("Items")
    @Expose
    private InstanceInfo [] Items;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Total number of instances. 
     * @return TotalCount Total number of instances.
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set Total number of instances.
     * @param TotalCount Total number of instances.
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get Status of all instance inspection. 0: all instance inspection enabled, 1: all instance inspection disabled. 
     * @return DbScanStatus Status of all instance inspection. 0: all instance inspection enabled, 1: all instance inspection disabled.
     */
    public Long getDbScanStatus() {
        return this.DbScanStatus;
    }

    /**
     * Set Status of all instance inspection. 0: all instance inspection enabled, 1: all instance inspection disabled.
     * @param DbScanStatus Status of all instance inspection. 0: all instance inspection enabled, 1: all instance inspection disabled.
     */
    public void setDbScanStatus(Long DbScanStatus) {
        this.DbScanStatus = DbScanStatus;
    }

    /**
     * Get Instance information. 
     * @return Items Instance information.
     */
    public InstanceInfo [] getItems() {
        return this.Items;
    }

    /**
     * Set Instance information.
     * @param Items Instance information.
     */
    public void setItems(InstanceInfo [] Items) {
        this.Items = Items;
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

    public DescribeDiagDBInstancesResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDiagDBInstancesResponse(DescribeDiagDBInstancesResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.DbScanStatus != null) {
            this.DbScanStatus = new Long(source.DbScanStatus);
        }
        if (source.Items != null) {
            this.Items = new InstanceInfo[source.Items.length];
            for (int i = 0; i < source.Items.length; i++) {
                this.Items[i] = new InstanceInfo(source.Items[i]);
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
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "DbScanStatus", this.DbScanStatus);
        this.setParamArrayObj(map, prefix + "Items.", this.Items);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

