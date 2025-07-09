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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EnableRoutesRequest extends AbstractModel {

    /**
    * Unique route table ID.
    */
    @SerializedName("RouteTableId")
    @Expose
    private String RouteTableId;

    /**
    * Routing policy ID. This parameter cannot be used simultaneously with RouteItemIds, but at least one of them should be entered. The maximum number of items processed in a single request is 100. The value of this parameter can be obtained by querying the route list ([DescribeRouteTables](https://intl.cloud.tencent.com/document/product/215/15763?from_cn_redirect=1)).
    */
    @SerializedName("RouteIds")
    @Expose
    private Long [] RouteIds;

    /**
    * Unique routing policy ID. This parameter cannot be used simultaneously with RouteIds, but at least one of them should be entered. The maximum number of items processed in a single request is 100. The value of this parameter can be obtained by querying the route list ([DescribeRouteTables](https://intl.cloud.tencent.com/document/product/215/15763?from_cn_redirect=1)).
    */
    @SerializedName("RouteItemIds")
    @Expose
    private String [] RouteItemIds;

    /**
     * Get Unique route table ID. 
     * @return RouteTableId Unique route table ID.
     */
    public String getRouteTableId() {
        return this.RouteTableId;
    }

    /**
     * Set Unique route table ID.
     * @param RouteTableId Unique route table ID.
     */
    public void setRouteTableId(String RouteTableId) {
        this.RouteTableId = RouteTableId;
    }

    /**
     * Get Routing policy ID. This parameter cannot be used simultaneously with RouteItemIds, but at least one of them should be entered. The maximum number of items processed in a single request is 100. The value of this parameter can be obtained by querying the route list ([DescribeRouteTables](https://intl.cloud.tencent.com/document/product/215/15763?from_cn_redirect=1)). 
     * @return RouteIds Routing policy ID. This parameter cannot be used simultaneously with RouteItemIds, but at least one of them should be entered. The maximum number of items processed in a single request is 100. The value of this parameter can be obtained by querying the route list ([DescribeRouteTables](https://intl.cloud.tencent.com/document/product/215/15763?from_cn_redirect=1)).
     */
    public Long [] getRouteIds() {
        return this.RouteIds;
    }

    /**
     * Set Routing policy ID. This parameter cannot be used simultaneously with RouteItemIds, but at least one of them should be entered. The maximum number of items processed in a single request is 100. The value of this parameter can be obtained by querying the route list ([DescribeRouteTables](https://intl.cloud.tencent.com/document/product/215/15763?from_cn_redirect=1)).
     * @param RouteIds Routing policy ID. This parameter cannot be used simultaneously with RouteItemIds, but at least one of them should be entered. The maximum number of items processed in a single request is 100. The value of this parameter can be obtained by querying the route list ([DescribeRouteTables](https://intl.cloud.tencent.com/document/product/215/15763?from_cn_redirect=1)).
     */
    public void setRouteIds(Long [] RouteIds) {
        this.RouteIds = RouteIds;
    }

    /**
     * Get Unique routing policy ID. This parameter cannot be used simultaneously with RouteIds, but at least one of them should be entered. The maximum number of items processed in a single request is 100. The value of this parameter can be obtained by querying the route list ([DescribeRouteTables](https://intl.cloud.tencent.com/document/product/215/15763?from_cn_redirect=1)). 
     * @return RouteItemIds Unique routing policy ID. This parameter cannot be used simultaneously with RouteIds, but at least one of them should be entered. The maximum number of items processed in a single request is 100. The value of this parameter can be obtained by querying the route list ([DescribeRouteTables](https://intl.cloud.tencent.com/document/product/215/15763?from_cn_redirect=1)).
     */
    public String [] getRouteItemIds() {
        return this.RouteItemIds;
    }

    /**
     * Set Unique routing policy ID. This parameter cannot be used simultaneously with RouteIds, but at least one of them should be entered. The maximum number of items processed in a single request is 100. The value of this parameter can be obtained by querying the route list ([DescribeRouteTables](https://intl.cloud.tencent.com/document/product/215/15763?from_cn_redirect=1)).
     * @param RouteItemIds Unique routing policy ID. This parameter cannot be used simultaneously with RouteIds, but at least one of them should be entered. The maximum number of items processed in a single request is 100. The value of this parameter can be obtained by querying the route list ([DescribeRouteTables](https://intl.cloud.tencent.com/document/product/215/15763?from_cn_redirect=1)).
     */
    public void setRouteItemIds(String [] RouteItemIds) {
        this.RouteItemIds = RouteItemIds;
    }

    public EnableRoutesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EnableRoutesRequest(EnableRoutesRequest source) {
        if (source.RouteTableId != null) {
            this.RouteTableId = new String(source.RouteTableId);
        }
        if (source.RouteIds != null) {
            this.RouteIds = new Long[source.RouteIds.length];
            for (int i = 0; i < source.RouteIds.length; i++) {
                this.RouteIds[i] = new Long(source.RouteIds[i]);
            }
        }
        if (source.RouteItemIds != null) {
            this.RouteItemIds = new String[source.RouteItemIds.length];
            for (int i = 0; i < source.RouteItemIds.length; i++) {
                this.RouteItemIds[i] = new String(source.RouteItemIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RouteTableId", this.RouteTableId);
        this.setParamArraySimple(map, prefix + "RouteIds.", this.RouteIds);
        this.setParamArraySimple(map, prefix + "RouteItemIds.", this.RouteItemIds);

    }
}

