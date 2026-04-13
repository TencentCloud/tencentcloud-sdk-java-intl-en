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
package com.tencentcloudapi.postgres.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyReadOnlyDBInstanceWeightRequest extends AbstractModel {

    /**
    * Instance ID. obtain through the api [DescribeDBInstances](https://www.tencentcloud.com/document/product/409/16773?lang=en).
    */
    @SerializedName("DBInstanceId")
    @Expose
    private String DBInstanceId;

    /**
    * ReadOnlyGroupId. specifies the read-only group ID, which can be obtained through the api [DescribeReadOnlyGroups](https://www.tencentcloud.com/document/product/409/39725?lang=en).
    */
    @SerializedName("ReadOnlyGroupId")
    @Expose
    private String ReadOnlyGroupId;

    /**
    * Specifies the traffic weight of the read-only instance in the read-only group. valid values: 1-50.
    */
    @SerializedName("Weight")
    @Expose
    private Long Weight;

    /**
     * Get Instance ID. obtain through the api [DescribeDBInstances](https://www.tencentcloud.com/document/product/409/16773?lang=en). 
     * @return DBInstanceId Instance ID. obtain through the api [DescribeDBInstances](https://www.tencentcloud.com/document/product/409/16773?lang=en).
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * Set Instance ID. obtain through the api [DescribeDBInstances](https://www.tencentcloud.com/document/product/409/16773?lang=en).
     * @param DBInstanceId Instance ID. obtain through the api [DescribeDBInstances](https://www.tencentcloud.com/document/product/409/16773?lang=en).
     */
    public void setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
    }

    /**
     * Get ReadOnlyGroupId. specifies the read-only group ID, which can be obtained through the api [DescribeReadOnlyGroups](https://www.tencentcloud.com/document/product/409/39725?lang=en). 
     * @return ReadOnlyGroupId ReadOnlyGroupId. specifies the read-only group ID, which can be obtained through the api [DescribeReadOnlyGroups](https://www.tencentcloud.com/document/product/409/39725?lang=en).
     */
    public String getReadOnlyGroupId() {
        return this.ReadOnlyGroupId;
    }

    /**
     * Set ReadOnlyGroupId. specifies the read-only group ID, which can be obtained through the api [DescribeReadOnlyGroups](https://www.tencentcloud.com/document/product/409/39725?lang=en).
     * @param ReadOnlyGroupId ReadOnlyGroupId. specifies the read-only group ID, which can be obtained through the api [DescribeReadOnlyGroups](https://www.tencentcloud.com/document/product/409/39725?lang=en).
     */
    public void setReadOnlyGroupId(String ReadOnlyGroupId) {
        this.ReadOnlyGroupId = ReadOnlyGroupId;
    }

    /**
     * Get Specifies the traffic weight of the read-only instance in the read-only group. valid values: 1-50. 
     * @return Weight Specifies the traffic weight of the read-only instance in the read-only group. valid values: 1-50.
     */
    public Long getWeight() {
        return this.Weight;
    }

    /**
     * Set Specifies the traffic weight of the read-only instance in the read-only group. valid values: 1-50.
     * @param Weight Specifies the traffic weight of the read-only instance in the read-only group. valid values: 1-50.
     */
    public void setWeight(Long Weight) {
        this.Weight = Weight;
    }

    public ModifyReadOnlyDBInstanceWeightRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyReadOnlyDBInstanceWeightRequest(ModifyReadOnlyDBInstanceWeightRequest source) {
        if (source.DBInstanceId != null) {
            this.DBInstanceId = new String(source.DBInstanceId);
        }
        if (source.ReadOnlyGroupId != null) {
            this.ReadOnlyGroupId = new String(source.ReadOnlyGroupId);
        }
        if (source.Weight != null) {
            this.Weight = new Long(source.Weight);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DBInstanceId", this.DBInstanceId);
        this.setParamSimple(map, prefix + "ReadOnlyGroupId", this.ReadOnlyGroupId);
        this.setParamSimple(map, prefix + "Weight", this.Weight);

    }
}

