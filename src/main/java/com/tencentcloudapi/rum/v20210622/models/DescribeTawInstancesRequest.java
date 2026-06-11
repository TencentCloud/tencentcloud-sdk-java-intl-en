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
package com.tencentcloudapi.rum.v20210622.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTawInstancesRequest extends AbstractModel {

    /**
    * Billing status
    */
    @SerializedName("ChargeStatuses")
    @Expose
    private Long [] ChargeStatuses;

    /**
    * Billing type
    */
    @SerializedName("ChargeTypes")
    @Expose
    private Long [] ChargeTypes;

    /**
    * Pagination limit
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Pagination offset
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Region Id
    */
    @SerializedName("AreaIds")
    @Expose
    private Long [] AreaIds;

    /**
    * Instance status (1=creating, 2=running, 3=abnormal, 4=restarting, 5=stopping, 6=stopped, 7=being destroyed, 8=terminated). Deprecated. Please note in Filters.
    */
    @SerializedName("InstanceStatuses")
    @Expose
    private Long [] InstanceStatuses;

    /**
    * Instance Id, deprecated. Please note in Filters.
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * Filter parameters; In demo mode, pass {"Name": "IsDemo", "Values":["1"]}.
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * Deprecated. For demo mode, please note in Filters.
    */
    @SerializedName("IsDemo")
    @Expose
    private Long IsDemo;

    /**
     * Get Billing status 
     * @return ChargeStatuses Billing status
     */
    public Long [] getChargeStatuses() {
        return this.ChargeStatuses;
    }

    /**
     * Set Billing status
     * @param ChargeStatuses Billing status
     */
    public void setChargeStatuses(Long [] ChargeStatuses) {
        this.ChargeStatuses = ChargeStatuses;
    }

    /**
     * Get Billing type 
     * @return ChargeTypes Billing type
     */
    public Long [] getChargeTypes() {
        return this.ChargeTypes;
    }

    /**
     * Set Billing type
     * @param ChargeTypes Billing type
     */
    public void setChargeTypes(Long [] ChargeTypes) {
        this.ChargeTypes = ChargeTypes;
    }

    /**
     * Get Pagination limit 
     * @return Limit Pagination limit
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Pagination limit
     * @param Limit Pagination limit
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Pagination offset 
     * @return Offset Pagination offset
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Pagination offset
     * @param Offset Pagination offset
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Region Id 
     * @return AreaIds Region Id
     */
    public Long [] getAreaIds() {
        return this.AreaIds;
    }

    /**
     * Set Region Id
     * @param AreaIds Region Id
     */
    public void setAreaIds(Long [] AreaIds) {
        this.AreaIds = AreaIds;
    }

    /**
     * Get Instance status (1=creating, 2=running, 3=abnormal, 4=restarting, 5=stopping, 6=stopped, 7=being destroyed, 8=terminated). Deprecated. Please note in Filters. 
     * @return InstanceStatuses Instance status (1=creating, 2=running, 3=abnormal, 4=restarting, 5=stopping, 6=stopped, 7=being destroyed, 8=terminated). Deprecated. Please note in Filters.
     * @deprecated
     */
    @Deprecated
    public Long [] getInstanceStatuses() {
        return this.InstanceStatuses;
    }

    /**
     * Set Instance status (1=creating, 2=running, 3=abnormal, 4=restarting, 5=stopping, 6=stopped, 7=being destroyed, 8=terminated). Deprecated. Please note in Filters.
     * @param InstanceStatuses Instance status (1=creating, 2=running, 3=abnormal, 4=restarting, 5=stopping, 6=stopped, 7=being destroyed, 8=terminated). Deprecated. Please note in Filters.
     * @deprecated
     */
    @Deprecated
    public void setInstanceStatuses(Long [] InstanceStatuses) {
        this.InstanceStatuses = InstanceStatuses;
    }

    /**
     * Get Instance Id, deprecated. Please note in Filters. 
     * @return InstanceIds Instance Id, deprecated. Please note in Filters.
     * @deprecated
     */
    @Deprecated
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set Instance Id, deprecated. Please note in Filters.
     * @param InstanceIds Instance Id, deprecated. Please note in Filters.
     * @deprecated
     */
    @Deprecated
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Get Filter parameters; In demo mode, pass {"Name": "IsDemo", "Values":["1"]}. 
     * @return Filters Filter parameters; In demo mode, pass {"Name": "IsDemo", "Values":["1"]}.
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter parameters; In demo mode, pass {"Name": "IsDemo", "Values":["1"]}.
     * @param Filters Filter parameters; In demo mode, pass {"Name": "IsDemo", "Values":["1"]}.
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get Deprecated. For demo mode, please note in Filters. 
     * @return IsDemo Deprecated. For demo mode, please note in Filters.
     * @deprecated
     */
    @Deprecated
    public Long getIsDemo() {
        return this.IsDemo;
    }

    /**
     * Set Deprecated. For demo mode, please note in Filters.
     * @param IsDemo Deprecated. For demo mode, please note in Filters.
     * @deprecated
     */
    @Deprecated
    public void setIsDemo(Long IsDemo) {
        this.IsDemo = IsDemo;
    }

    public DescribeTawInstancesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTawInstancesRequest(DescribeTawInstancesRequest source) {
        if (source.ChargeStatuses != null) {
            this.ChargeStatuses = new Long[source.ChargeStatuses.length];
            for (int i = 0; i < source.ChargeStatuses.length; i++) {
                this.ChargeStatuses[i] = new Long(source.ChargeStatuses[i]);
            }
        }
        if (source.ChargeTypes != null) {
            this.ChargeTypes = new Long[source.ChargeTypes.length];
            for (int i = 0; i < source.ChargeTypes.length; i++) {
                this.ChargeTypes[i] = new Long(source.ChargeTypes[i]);
            }
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.AreaIds != null) {
            this.AreaIds = new Long[source.AreaIds.length];
            for (int i = 0; i < source.AreaIds.length; i++) {
                this.AreaIds[i] = new Long(source.AreaIds[i]);
            }
        }
        if (source.InstanceStatuses != null) {
            this.InstanceStatuses = new Long[source.InstanceStatuses.length];
            for (int i = 0; i < source.InstanceStatuses.length; i++) {
                this.InstanceStatuses[i] = new Long(source.InstanceStatuses[i]);
            }
        }
        if (source.InstanceIds != null) {
            this.InstanceIds = new String[source.InstanceIds.length];
            for (int i = 0; i < source.InstanceIds.length; i++) {
                this.InstanceIds[i] = new String(source.InstanceIds[i]);
            }
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.IsDemo != null) {
            this.IsDemo = new Long(source.IsDemo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "ChargeStatuses.", this.ChargeStatuses);
        this.setParamArraySimple(map, prefix + "ChargeTypes.", this.ChargeTypes);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamArraySimple(map, prefix + "AreaIds.", this.AreaIds);
        this.setParamArraySimple(map, prefix + "InstanceStatuses.", this.InstanceStatuses);
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "IsDemo", this.IsDemo);

    }
}

