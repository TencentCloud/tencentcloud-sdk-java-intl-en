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
package com.tencentcloudapi.smh.v20210712.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeOfficialInstancesRequest extends AbstractModel {

    /**
    * Specifies whether to query the super admin account bound to the instance. default value is false.
    */
    @SerializedName("SuperAdminAccount")
    @Expose
    private Boolean SuperAdminAccount;

    /**
    * Specifies one or more instance ids for querying, with a maximum of 100 per request.
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * Page number, int, used in conjunction with PageSize. default value is 1.
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * Number of items per page, integer, used in conjunction with PageNumber. default value is 20. maximum value is 100.
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * Specifies the column to sort.
    */
    @SerializedName("OrderBy")
    @Expose
    private String OrderBy;

    /**
    * Sorting method.
    */
    @SerializedName("OrderByType")
    @Expose
    private String OrderByType;

    /**
    * Specifies the filter type for renewal management.
    */
    @SerializedName("AutoRenew")
    @Expose
    private Long AutoRenew;

    /**
    * Specifies whether the super admin account is bound to a mobile number.
    */
    @SerializedName("BindPhone")
    @Expose
    private Boolean BindPhone;

    /**
     * Get Specifies whether to query the super admin account bound to the instance. default value is false. 
     * @return SuperAdminAccount Specifies whether to query the super admin account bound to the instance. default value is false.
     */
    public Boolean getSuperAdminAccount() {
        return this.SuperAdminAccount;
    }

    /**
     * Set Specifies whether to query the super admin account bound to the instance. default value is false.
     * @param SuperAdminAccount Specifies whether to query the super admin account bound to the instance. default value is false.
     */
    public void setSuperAdminAccount(Boolean SuperAdminAccount) {
        this.SuperAdminAccount = SuperAdminAccount;
    }

    /**
     * Get Specifies one or more instance ids for querying, with a maximum of 100 per request. 
     * @return InstanceIds Specifies one or more instance ids for querying, with a maximum of 100 per request.
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set Specifies one or more instance ids for querying, with a maximum of 100 per request.
     * @param InstanceIds Specifies one or more instance ids for querying, with a maximum of 100 per request.
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Get Page number, int, used in conjunction with PageSize. default value is 1. 
     * @return PageNumber Page number, int, used in conjunction with PageSize. default value is 1.
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set Page number, int, used in conjunction with PageSize. default value is 1.
     * @param PageNumber Page number, int, used in conjunction with PageSize. default value is 1.
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get Number of items per page, integer, used in conjunction with PageNumber. default value is 20. maximum value is 100. 
     * @return PageSize Number of items per page, integer, used in conjunction with PageNumber. default value is 20. maximum value is 100.
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set Number of items per page, integer, used in conjunction with PageNumber. default value is 20. maximum value is 100.
     * @param PageSize Number of items per page, integer, used in conjunction with PageNumber. default value is 20. maximum value is 100.
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get Specifies the column to sort. 
     * @return OrderBy Specifies the column to sort.
     */
    public String getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set Specifies the column to sort.
     * @param OrderBy Specifies the column to sort.
     */
    public void setOrderBy(String OrderBy) {
        this.OrderBy = OrderBy;
    }

    /**
     * Get Sorting method. 
     * @return OrderByType Sorting method.
     */
    public String getOrderByType() {
        return this.OrderByType;
    }

    /**
     * Set Sorting method.
     * @param OrderByType Sorting method.
     */
    public void setOrderByType(String OrderByType) {
        this.OrderByType = OrderByType;
    }

    /**
     * Get Specifies the filter type for renewal management. 
     * @return AutoRenew Specifies the filter type for renewal management.
     */
    public Long getAutoRenew() {
        return this.AutoRenew;
    }

    /**
     * Set Specifies the filter type for renewal management.
     * @param AutoRenew Specifies the filter type for renewal management.
     */
    public void setAutoRenew(Long AutoRenew) {
        this.AutoRenew = AutoRenew;
    }

    /**
     * Get Specifies whether the super admin account is bound to a mobile number. 
     * @return BindPhone Specifies whether the super admin account is bound to a mobile number.
     */
    public Boolean getBindPhone() {
        return this.BindPhone;
    }

    /**
     * Set Specifies whether the super admin account is bound to a mobile number.
     * @param BindPhone Specifies whether the super admin account is bound to a mobile number.
     */
    public void setBindPhone(Boolean BindPhone) {
        this.BindPhone = BindPhone;
    }

    public DescribeOfficialInstancesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeOfficialInstancesRequest(DescribeOfficialInstancesRequest source) {
        if (source.SuperAdminAccount != null) {
            this.SuperAdminAccount = new Boolean(source.SuperAdminAccount);
        }
        if (source.InstanceIds != null) {
            this.InstanceIds = new String[source.InstanceIds.length];
            for (int i = 0; i < source.InstanceIds.length; i++) {
                this.InstanceIds[i] = new String(source.InstanceIds[i]);
            }
        }
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.OrderBy != null) {
            this.OrderBy = new String(source.OrderBy);
        }
        if (source.OrderByType != null) {
            this.OrderByType = new String(source.OrderByType);
        }
        if (source.AutoRenew != null) {
            this.AutoRenew = new Long(source.AutoRenew);
        }
        if (source.BindPhone != null) {
            this.BindPhone = new Boolean(source.BindPhone);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SuperAdminAccount", this.SuperAdminAccount);
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "OrderBy", this.OrderBy);
        this.setParamSimple(map, prefix + "OrderByType", this.OrderByType);
        this.setParamSimple(map, prefix + "AutoRenew", this.AutoRenew);
        this.setParamSimple(map, prefix + "BindPhone", this.BindPhone);

    }
}

