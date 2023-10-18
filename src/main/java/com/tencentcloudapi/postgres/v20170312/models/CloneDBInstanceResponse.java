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

public class CloneDBInstanceResponse extends AbstractModel {

    /**
    * Order ID.
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("DealName")
    @Expose
    private String DealName;

    /**
    * Bill ID.
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("BillId")
    @Expose
    private String BillId;

    /**
    * ID of the cloned instance, which will be returned only when the instance is pay-as-you-go.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DBInstanceId")
    @Expose
    private String DBInstanceId;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Order ID.
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return DealName Order ID.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getDealName() {
        return this.DealName;
    }

    /**
     * Set Order ID.
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param DealName Order ID.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setDealName(String DealName) {
        this.DealName = DealName;
    }

    /**
     * Get Bill ID.
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return BillId Bill ID.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getBillId() {
        return this.BillId;
    }

    /**
     * Set Bill ID.
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param BillId Bill ID.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setBillId(String BillId) {
        this.BillId = BillId;
    }

    /**
     * Get ID of the cloned instance, which will be returned only when the instance is pay-as-you-go.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DBInstanceId ID of the cloned instance, which will be returned only when the instance is pay-as-you-go.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * Set ID of the cloned instance, which will be returned only when the instance is pay-as-you-go.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DBInstanceId ID of the cloned instance, which will be returned only when the instance is pay-as-you-go.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
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

    public CloneDBInstanceResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CloneDBInstanceResponse(CloneDBInstanceResponse source) {
        if (source.DealName != null) {
            this.DealName = new String(source.DealName);
        }
        if (source.BillId != null) {
            this.BillId = new String(source.BillId);
        }
        if (source.DBInstanceId != null) {
            this.DBInstanceId = new String(source.DBInstanceId);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DealName", this.DealName);
        this.setParamSimple(map, prefix + "BillId", this.BillId);
        this.setParamSimple(map, prefix + "DBInstanceId", this.DBInstanceId);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

