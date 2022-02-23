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
package com.tencentcloudapi.rum.v20210622.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTawInstancesRequest extends AbstractModel{

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
    * Region ID
    */
    @SerializedName("AreaIds")
    @Expose
    private Long [] AreaIds;

    /**
    * Instance status (1: creating; 2: running; 3: exceptional; 4: restarting; 5: stopping; 6: stopped; 7: terminating; 8: terminated)
    */
    @SerializedName("InstanceStatuses")
    @Expose
    private Long [] InstanceStatuses;

    /**
    * Instance ID
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * Filter parameter
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

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
     * Get Region ID 
     * @return AreaIds Region ID
     */
    public Long [] getAreaIds() {
        return this.AreaIds;
    }

    /**
     * Set Region ID
     * @param AreaIds Region ID
     */
    public void setAreaIds(Long [] AreaIds) {
        this.AreaIds = AreaIds;
    }

    /**
     * Get Instance status (1: creating; 2: running; 3: exceptional; 4: restarting; 5: stopping; 6: stopped; 7: terminating; 8: terminated) 
     * @return InstanceStatuses Instance status (1: creating; 2: running; 3: exceptional; 4: restarting; 5: stopping; 6: stopped; 7: terminating; 8: terminated)
     */
    public Long [] getInstanceStatuses() {
        return this.InstanceStatuses;
    }

    /**
     * Set Instance status (1: creating; 2: running; 3: exceptional; 4: restarting; 5: stopping; 6: stopped; 7: terminating; 8: terminated)
     * @param InstanceStatuses Instance status (1: creating; 2: running; 3: exceptional; 4: restarting; 5: stopping; 6: stopped; 7: terminating; 8: terminated)
     */
    public void setInstanceStatuses(Long [] InstanceStatuses) {
        this.InstanceStatuses = InstanceStatuses;
    }

    /**
     * Get Instance ID 
     * @return InstanceIds Instance ID
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set Instance ID
     * @param InstanceIds Instance ID
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Get Filter parameter 
     * @return Filters Filter parameter
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter parameter
     * @param Filters Filter parameter
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
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

    }
}

