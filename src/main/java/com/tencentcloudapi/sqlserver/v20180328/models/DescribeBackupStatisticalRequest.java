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

public class DescribeBackupStatisticalRequest extends AbstractModel {

    /**
    * The number of returned entries per page in pagination mode. Value range: 1-100. The default value is 100.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Page number in pagination mode. The default value is 0.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * One or more instance IDs. The instance ID is in the format of mssql-si2823jyl.
    */
    @SerializedName("InstanceIdSet")
    @Expose
    private String [] InstanceIdSet;

    /**
    * Instance name list. Fuzzy query is supported.
    */
    @SerializedName("InstanceNameSet")
    @Expose
    private String [] InstanceNameSet;

    /**
    * Sorting field. The default value is default, which indicates sorting by backup space in descending order. default - sort by backup space; data - sort by data backup; log - sort by log backup; auto - sort by automatic backup; manual - sort by manual backup.
    */
    @SerializedName("OrderBy")
    @Expose
    private String OrderBy;

    /**
    * The default value is desc. [desc - descending order; asc - ascending order].
    */
    @SerializedName("OrderByType")
    @Expose
    private String OrderByType;

    /**
     * Get The number of returned entries per page in pagination mode. Value range: 1-100. The default value is 100. 
     * @return Limit The number of returned entries per page in pagination mode. Value range: 1-100. The default value is 100.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set The number of returned entries per page in pagination mode. Value range: 1-100. The default value is 100.
     * @param Limit The number of returned entries per page in pagination mode. Value range: 1-100. The default value is 100.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Page number in pagination mode. The default value is 0. 
     * @return Offset Page number in pagination mode. The default value is 0.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Page number in pagination mode. The default value is 0.
     * @param Offset Page number in pagination mode. The default value is 0.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get One or more instance IDs. The instance ID is in the format of mssql-si2823jyl. 
     * @return InstanceIdSet One or more instance IDs. The instance ID is in the format of mssql-si2823jyl.
     */
    public String [] getInstanceIdSet() {
        return this.InstanceIdSet;
    }

    /**
     * Set One or more instance IDs. The instance ID is in the format of mssql-si2823jyl.
     * @param InstanceIdSet One or more instance IDs. The instance ID is in the format of mssql-si2823jyl.
     */
    public void setInstanceIdSet(String [] InstanceIdSet) {
        this.InstanceIdSet = InstanceIdSet;
    }

    /**
     * Get Instance name list. Fuzzy query is supported. 
     * @return InstanceNameSet Instance name list. Fuzzy query is supported.
     */
    public String [] getInstanceNameSet() {
        return this.InstanceNameSet;
    }

    /**
     * Set Instance name list. Fuzzy query is supported.
     * @param InstanceNameSet Instance name list. Fuzzy query is supported.
     */
    public void setInstanceNameSet(String [] InstanceNameSet) {
        this.InstanceNameSet = InstanceNameSet;
    }

    /**
     * Get Sorting field. The default value is default, which indicates sorting by backup space in descending order. default - sort by backup space; data - sort by data backup; log - sort by log backup; auto - sort by automatic backup; manual - sort by manual backup. 
     * @return OrderBy Sorting field. The default value is default, which indicates sorting by backup space in descending order. default - sort by backup space; data - sort by data backup; log - sort by log backup; auto - sort by automatic backup; manual - sort by manual backup.
     */
    public String getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set Sorting field. The default value is default, which indicates sorting by backup space in descending order. default - sort by backup space; data - sort by data backup; log - sort by log backup; auto - sort by automatic backup; manual - sort by manual backup.
     * @param OrderBy Sorting field. The default value is default, which indicates sorting by backup space in descending order. default - sort by backup space; data - sort by data backup; log - sort by log backup; auto - sort by automatic backup; manual - sort by manual backup.
     */
    public void setOrderBy(String OrderBy) {
        this.OrderBy = OrderBy;
    }

    /**
     * Get The default value is desc. [desc - descending order; asc - ascending order]. 
     * @return OrderByType The default value is desc. [desc - descending order; asc - ascending order].
     */
    public String getOrderByType() {
        return this.OrderByType;
    }

    /**
     * Set The default value is desc. [desc - descending order; asc - ascending order].
     * @param OrderByType The default value is desc. [desc - descending order; asc - ascending order].
     */
    public void setOrderByType(String OrderByType) {
        this.OrderByType = OrderByType;
    }

    public DescribeBackupStatisticalRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBackupStatisticalRequest(DescribeBackupStatisticalRequest source) {
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.InstanceIdSet != null) {
            this.InstanceIdSet = new String[source.InstanceIdSet.length];
            for (int i = 0; i < source.InstanceIdSet.length; i++) {
                this.InstanceIdSet[i] = new String(source.InstanceIdSet[i]);
            }
        }
        if (source.InstanceNameSet != null) {
            this.InstanceNameSet = new String[source.InstanceNameSet.length];
            for (int i = 0; i < source.InstanceNameSet.length; i++) {
                this.InstanceNameSet[i] = new String(source.InstanceNameSet[i]);
            }
        }
        if (source.OrderBy != null) {
            this.OrderBy = new String(source.OrderBy);
        }
        if (source.OrderByType != null) {
            this.OrderByType = new String(source.OrderByType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamArraySimple(map, prefix + "InstanceIdSet.", this.InstanceIdSet);
        this.setParamArraySimple(map, prefix + "InstanceNameSet.", this.InstanceNameSet);
        this.setParamSimple(map, prefix + "OrderBy", this.OrderBy);
        this.setParamSimple(map, prefix + "OrderByType", this.OrderByType);

    }
}

