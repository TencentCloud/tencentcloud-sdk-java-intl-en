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
package com.tencentcloudapi.sqlserver.v20180328.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDBsRequest extends AbstractModel {

    /**
    * Instance ID
    */
    @SerializedName("InstanceIdSet")
    @Expose
    private String [] InstanceIdSet;

    /**
    * Number of results per page. Value range: 1-100. Default value: 20
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Page number. Default value: 0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Database name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Sorting rule. Valid values: `desc` (descending order), `asc` (ascending order). Default value: `desc`.
    */
    @SerializedName("OrderByType")
    @Expose
    private String OrderByType;

    /**
    * TDE status. Valid values: `enable` (enabled), `disable` (disabled).
    */
    @SerializedName("Encryption")
    @Expose
    private String Encryption;

    /**
     * Get Instance ID 
     * @return InstanceIdSet Instance ID
     */
    public String [] getInstanceIdSet() {
        return this.InstanceIdSet;
    }

    /**
     * Set Instance ID
     * @param InstanceIdSet Instance ID
     */
    public void setInstanceIdSet(String [] InstanceIdSet) {
        this.InstanceIdSet = InstanceIdSet;
    }

    /**
     * Get Number of results per page. Value range: 1-100. Default value: 20 
     * @return Limit Number of results per page. Value range: 1-100. Default value: 20
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of results per page. Value range: 1-100. Default value: 20
     * @param Limit Number of results per page. Value range: 1-100. Default value: 20
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Page number. Default value: 0 
     * @return Offset Page number. Default value: 0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Page number. Default value: 0
     * @param Offset Page number. Default value: 0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Database name 
     * @return Name Database name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Database name
     * @param Name Database name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Sorting rule. Valid values: `desc` (descending order), `asc` (ascending order). Default value: `desc`. 
     * @return OrderByType Sorting rule. Valid values: `desc` (descending order), `asc` (ascending order). Default value: `desc`.
     */
    public String getOrderByType() {
        return this.OrderByType;
    }

    /**
     * Set Sorting rule. Valid values: `desc` (descending order), `asc` (ascending order). Default value: `desc`.
     * @param OrderByType Sorting rule. Valid values: `desc` (descending order), `asc` (ascending order). Default value: `desc`.
     */
    public void setOrderByType(String OrderByType) {
        this.OrderByType = OrderByType;
    }

    /**
     * Get TDE status. Valid values: `enable` (enabled), `disable` (disabled). 
     * @return Encryption TDE status. Valid values: `enable` (enabled), `disable` (disabled).
     */
    public String getEncryption() {
        return this.Encryption;
    }

    /**
     * Set TDE status. Valid values: `enable` (enabled), `disable` (disabled).
     * @param Encryption TDE status. Valid values: `enable` (enabled), `disable` (disabled).
     */
    public void setEncryption(String Encryption) {
        this.Encryption = Encryption;
    }

    public DescribeDBsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDBsRequest(DescribeDBsRequest source) {
        if (source.InstanceIdSet != null) {
            this.InstanceIdSet = new String[source.InstanceIdSet.length];
            for (int i = 0; i < source.InstanceIdSet.length; i++) {
                this.InstanceIdSet[i] = new String(source.InstanceIdSet[i]);
            }
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.OrderByType != null) {
            this.OrderByType = new String(source.OrderByType);
        }
        if (source.Encryption != null) {
            this.Encryption = new String(source.Encryption);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "InstanceIdSet.", this.InstanceIdSet);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "OrderByType", this.OrderByType);
        this.setParamSimple(map, prefix + "Encryption", this.Encryption);

    }
}

