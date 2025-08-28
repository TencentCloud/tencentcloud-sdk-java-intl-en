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

public class DescribeCrossBackupStatisticalRequest extends AbstractModel {

    /**
    * Pagination number.

    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Pagination size.

    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Instance ID list.

    */
    @SerializedName("InstanceIdSet")
    @Expose
    private String [] InstanceIdSet;

    /**
    * Instance name list.
    */
    @SerializedName("InstanceNameSet")
    @Expose
    private String [] InstanceNameSet;

    /**
    * Cross-region backup status. enable: enabled; disable: disabled.
    */
    @SerializedName("CrossBackupStatus")
    @Expose
    private String CrossBackupStatus;

    /**
    * Target region for cross-region backups.
    */
    @SerializedName("CrossRegion")
    @Expose
    private String CrossRegion;

    /**
    * Sorting field. The default value is default, which indicates sorting by backup space in descending order. data - sort by data backup; log - sort by log backup.
    */
    @SerializedName("OrderBy")
    @Expose
    private String OrderBy;

    /**
    * Collation rule (desc - descending order; asc - ascending order). The default value is desc.
    */
    @SerializedName("OrderByType")
    @Expose
    private String OrderByType;

    /**
     * Get Pagination number.
 
     * @return Offset Pagination number.

     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Pagination number.

     * @param Offset Pagination number.

     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Pagination size.
 
     * @return Limit Pagination size.

     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Pagination size.

     * @param Limit Pagination size.

     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Instance ID list.
 
     * @return InstanceIdSet Instance ID list.

     */
    public String [] getInstanceIdSet() {
        return this.InstanceIdSet;
    }

    /**
     * Set Instance ID list.

     * @param InstanceIdSet Instance ID list.

     */
    public void setInstanceIdSet(String [] InstanceIdSet) {
        this.InstanceIdSet = InstanceIdSet;
    }

    /**
     * Get Instance name list. 
     * @return InstanceNameSet Instance name list.
     */
    public String [] getInstanceNameSet() {
        return this.InstanceNameSet;
    }

    /**
     * Set Instance name list.
     * @param InstanceNameSet Instance name list.
     */
    public void setInstanceNameSet(String [] InstanceNameSet) {
        this.InstanceNameSet = InstanceNameSet;
    }

    /**
     * Get Cross-region backup status. enable: enabled; disable: disabled. 
     * @return CrossBackupStatus Cross-region backup status. enable: enabled; disable: disabled.
     */
    public String getCrossBackupStatus() {
        return this.CrossBackupStatus;
    }

    /**
     * Set Cross-region backup status. enable: enabled; disable: disabled.
     * @param CrossBackupStatus Cross-region backup status. enable: enabled; disable: disabled.
     */
    public void setCrossBackupStatus(String CrossBackupStatus) {
        this.CrossBackupStatus = CrossBackupStatus;
    }

    /**
     * Get Target region for cross-region backups. 
     * @return CrossRegion Target region for cross-region backups.
     */
    public String getCrossRegion() {
        return this.CrossRegion;
    }

    /**
     * Set Target region for cross-region backups.
     * @param CrossRegion Target region for cross-region backups.
     */
    public void setCrossRegion(String CrossRegion) {
        this.CrossRegion = CrossRegion;
    }

    /**
     * Get Sorting field. The default value is default, which indicates sorting by backup space in descending order. data - sort by data backup; log - sort by log backup. 
     * @return OrderBy Sorting field. The default value is default, which indicates sorting by backup space in descending order. data - sort by data backup; log - sort by log backup.
     */
    public String getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set Sorting field. The default value is default, which indicates sorting by backup space in descending order. data - sort by data backup; log - sort by log backup.
     * @param OrderBy Sorting field. The default value is default, which indicates sorting by backup space in descending order. data - sort by data backup; log - sort by log backup.
     */
    public void setOrderBy(String OrderBy) {
        this.OrderBy = OrderBy;
    }

    /**
     * Get Collation rule (desc - descending order; asc - ascending order). The default value is desc. 
     * @return OrderByType Collation rule (desc - descending order; asc - ascending order). The default value is desc.
     */
    public String getOrderByType() {
        return this.OrderByType;
    }

    /**
     * Set Collation rule (desc - descending order; asc - ascending order). The default value is desc.
     * @param OrderByType Collation rule (desc - descending order; asc - ascending order). The default value is desc.
     */
    public void setOrderByType(String OrderByType) {
        this.OrderByType = OrderByType;
    }

    public DescribeCrossBackupStatisticalRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCrossBackupStatisticalRequest(DescribeCrossBackupStatisticalRequest source) {
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
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
        if (source.CrossBackupStatus != null) {
            this.CrossBackupStatus = new String(source.CrossBackupStatus);
        }
        if (source.CrossRegion != null) {
            this.CrossRegion = new String(source.CrossRegion);
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
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArraySimple(map, prefix + "InstanceIdSet.", this.InstanceIdSet);
        this.setParamArraySimple(map, prefix + "InstanceNameSet.", this.InstanceNameSet);
        this.setParamSimple(map, prefix + "CrossBackupStatus", this.CrossBackupStatus);
        this.setParamSimple(map, prefix + "CrossRegion", this.CrossRegion);
        this.setParamSimple(map, prefix + "OrderBy", this.OrderBy);
        this.setParamSimple(map, prefix + "OrderByType", this.OrderByType);

    }
}

