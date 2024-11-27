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
package com.tencentcloudapi.cdc.v20201214.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDedicatedClusterOrdersRequest extends AbstractModel {

    /**
    * Filter by CDC id.
    */
    @SerializedName("DedicatedClusterIds")
    @Expose
    private String [] DedicatedClusterIds;

    /**
    * Filter by CDC order id.
    */
    @SerializedName("DedicatedClusterOrderIds")
    @Expose
    private String DedicatedClusterOrderIds;

    /**
    * Offset, 0 by default For further information on Offset, please refer to relevant sections in API [Overview] (https://intl.cloud.tencent.com/document/api/213/15688?from_cn_redirect=1).
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Number of returned pieces, 20 by default and can be up to 100. For further information on Limit, please refer to relevant sections in API [Overview] (https://intl.cloud.tencent.com/document/api/213/15688?from_cn_redirect=1).
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * The order status is the filter condition: PENDING INCONSTRUCTION DELIVERING DELIVERED EXPIRED CANCELLED OFFLINE
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * The order type is the filter condition: CREATE EXTEND
    */
    @SerializedName("ActionType")
    @Expose
    private String ActionType;

    /**
    * 
    */
    @SerializedName("OrderTypes")
    @Expose
    private String [] OrderTypes;

    /**
     * Get Filter by CDC id. 
     * @return DedicatedClusterIds Filter by CDC id.
     */
    public String [] getDedicatedClusterIds() {
        return this.DedicatedClusterIds;
    }

    /**
     * Set Filter by CDC id.
     * @param DedicatedClusterIds Filter by CDC id.
     */
    public void setDedicatedClusterIds(String [] DedicatedClusterIds) {
        this.DedicatedClusterIds = DedicatedClusterIds;
    }

    /**
     * Get Filter by CDC order id. 
     * @return DedicatedClusterOrderIds Filter by CDC order id.
     */
    public String getDedicatedClusterOrderIds() {
        return this.DedicatedClusterOrderIds;
    }

    /**
     * Set Filter by CDC order id.
     * @param DedicatedClusterOrderIds Filter by CDC order id.
     */
    public void setDedicatedClusterOrderIds(String DedicatedClusterOrderIds) {
        this.DedicatedClusterOrderIds = DedicatedClusterOrderIds;
    }

    /**
     * Get Offset, 0 by default For further information on Offset, please refer to relevant sections in API [Overview] (https://intl.cloud.tencent.com/document/api/213/15688?from_cn_redirect=1). 
     * @return Offset Offset, 0 by default For further information on Offset, please refer to relevant sections in API [Overview] (https://intl.cloud.tencent.com/document/api/213/15688?from_cn_redirect=1).
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset, 0 by default For further information on Offset, please refer to relevant sections in API [Overview] (https://intl.cloud.tencent.com/document/api/213/15688?from_cn_redirect=1).
     * @param Offset Offset, 0 by default For further information on Offset, please refer to relevant sections in API [Overview] (https://intl.cloud.tencent.com/document/api/213/15688?from_cn_redirect=1).
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Number of returned pieces, 20 by default and can be up to 100. For further information on Limit, please refer to relevant sections in API [Overview] (https://intl.cloud.tencent.com/document/api/213/15688?from_cn_redirect=1). 
     * @return Limit Number of returned pieces, 20 by default and can be up to 100. For further information on Limit, please refer to relevant sections in API [Overview] (https://intl.cloud.tencent.com/document/api/213/15688?from_cn_redirect=1).
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of returned pieces, 20 by default and can be up to 100. For further information on Limit, please refer to relevant sections in API [Overview] (https://intl.cloud.tencent.com/document/api/213/15688?from_cn_redirect=1).
     * @param Limit Number of returned pieces, 20 by default and can be up to 100. For further information on Limit, please refer to relevant sections in API [Overview] (https://intl.cloud.tencent.com/document/api/213/15688?from_cn_redirect=1).
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get The order status is the filter condition: PENDING INCONSTRUCTION DELIVERING DELIVERED EXPIRED CANCELLED OFFLINE 
     * @return Status The order status is the filter condition: PENDING INCONSTRUCTION DELIVERING DELIVERED EXPIRED CANCELLED OFFLINE
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set The order status is the filter condition: PENDING INCONSTRUCTION DELIVERING DELIVERED EXPIRED CANCELLED OFFLINE
     * @param Status The order status is the filter condition: PENDING INCONSTRUCTION DELIVERING DELIVERED EXPIRED CANCELLED OFFLINE
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get The order type is the filter condition: CREATE EXTEND 
     * @return ActionType The order type is the filter condition: CREATE EXTEND
     */
    public String getActionType() {
        return this.ActionType;
    }

    /**
     * Set The order type is the filter condition: CREATE EXTEND
     * @param ActionType The order type is the filter condition: CREATE EXTEND
     */
    public void setActionType(String ActionType) {
        this.ActionType = ActionType;
    }

    /**
     * Get  
     * @return OrderTypes 
     */
    public String [] getOrderTypes() {
        return this.OrderTypes;
    }

    /**
     * Set 
     * @param OrderTypes 
     */
    public void setOrderTypes(String [] OrderTypes) {
        this.OrderTypes = OrderTypes;
    }

    public DescribeDedicatedClusterOrdersRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDedicatedClusterOrdersRequest(DescribeDedicatedClusterOrdersRequest source) {
        if (source.DedicatedClusterIds != null) {
            this.DedicatedClusterIds = new String[source.DedicatedClusterIds.length];
            for (int i = 0; i < source.DedicatedClusterIds.length; i++) {
                this.DedicatedClusterIds[i] = new String(source.DedicatedClusterIds[i]);
            }
        }
        if (source.DedicatedClusterOrderIds != null) {
            this.DedicatedClusterOrderIds = new String(source.DedicatedClusterOrderIds);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.ActionType != null) {
            this.ActionType = new String(source.ActionType);
        }
        if (source.OrderTypes != null) {
            this.OrderTypes = new String[source.OrderTypes.length];
            for (int i = 0; i < source.OrderTypes.length; i++) {
                this.OrderTypes[i] = new String(source.OrderTypes[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "DedicatedClusterIds.", this.DedicatedClusterIds);
        this.setParamSimple(map, prefix + "DedicatedClusterOrderIds", this.DedicatedClusterOrderIds);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ActionType", this.ActionType);
        this.setParamArraySimple(map, prefix + "OrderTypes.", this.OrderTypes);

    }
}

