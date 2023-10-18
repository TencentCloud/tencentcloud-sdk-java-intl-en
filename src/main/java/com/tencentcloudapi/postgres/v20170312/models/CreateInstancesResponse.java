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
package com.tencentcloudapi.postgres.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateInstancesResponse extends AbstractModel {

    /**
    * Order number list. Each instance corresponds to an order number.
    */
    @SerializedName("DealNames")
    @Expose
    private String [] DealNames;

    /**
    * Bill ID of frozen fees
    */
    @SerializedName("BillId")
    @Expose
    private String BillId;

    /**
    * ID set of instances which have been created successfully. The parameter value will be returned only when the pay-as-you-go billing mode is used.
    */
    @SerializedName("DBInstanceIdSet")
    @Expose
    private String [] DBInstanceIdSet;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Order number list. Each instance corresponds to an order number. 
     * @return DealNames Order number list. Each instance corresponds to an order number.
     */
    public String [] getDealNames() {
        return this.DealNames;
    }

    /**
     * Set Order number list. Each instance corresponds to an order number.
     * @param DealNames Order number list. Each instance corresponds to an order number.
     */
    public void setDealNames(String [] DealNames) {
        this.DealNames = DealNames;
    }

    /**
     * Get Bill ID of frozen fees 
     * @return BillId Bill ID of frozen fees
     */
    public String getBillId() {
        return this.BillId;
    }

    /**
     * Set Bill ID of frozen fees
     * @param BillId Bill ID of frozen fees
     */
    public void setBillId(String BillId) {
        this.BillId = BillId;
    }

    /**
     * Get ID set of instances which have been created successfully. The parameter value will be returned only when the pay-as-you-go billing mode is used. 
     * @return DBInstanceIdSet ID set of instances which have been created successfully. The parameter value will be returned only when the pay-as-you-go billing mode is used.
     */
    public String [] getDBInstanceIdSet() {
        return this.DBInstanceIdSet;
    }

    /**
     * Set ID set of instances which have been created successfully. The parameter value will be returned only when the pay-as-you-go billing mode is used.
     * @param DBInstanceIdSet ID set of instances which have been created successfully. The parameter value will be returned only when the pay-as-you-go billing mode is used.
     */
    public void setDBInstanceIdSet(String [] DBInstanceIdSet) {
        this.DBInstanceIdSet = DBInstanceIdSet;
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

    public CreateInstancesResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateInstancesResponse(CreateInstancesResponse source) {
        if (source.DealNames != null) {
            this.DealNames = new String[source.DealNames.length];
            for (int i = 0; i < source.DealNames.length; i++) {
                this.DealNames[i] = new String(source.DealNames[i]);
            }
        }
        if (source.BillId != null) {
            this.BillId = new String(source.BillId);
        }
        if (source.DBInstanceIdSet != null) {
            this.DBInstanceIdSet = new String[source.DBInstanceIdSet.length];
            for (int i = 0; i < source.DBInstanceIdSet.length; i++) {
                this.DBInstanceIdSet[i] = new String(source.DBInstanceIdSet[i]);
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
        this.setParamArraySimple(map, prefix + "DealNames.", this.DealNames);
        this.setParamSimple(map, prefix + "BillId", this.BillId);
        this.setParamArraySimple(map, prefix + "DBInstanceIdSet.", this.DBInstanceIdSet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

