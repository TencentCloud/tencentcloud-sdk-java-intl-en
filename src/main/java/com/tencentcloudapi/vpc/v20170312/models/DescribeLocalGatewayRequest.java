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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeLocalGatewayRequest extends AbstractModel{

    /**
    * Query criteria:
vpc-id: filter by VPC ID; local-gateway-name: filter by local gateway name (fuzzy search is supported); local-gateway-id: filter by local gateway instance ID; cdc-id: filter by CDC instance ID.
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * The offset. Default value: 0. For more information on `Offset`, see the relevant sections in API [Introduction](https://intl.cloud.tencent.com/document/api/213/11646?from_cn_redirect=1).
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * The number of returned results. Default value: 20. Maximum value: 100. For more information on `Limit`, see the relevant sections in API [Introduction](https://intl.cloud.tencent.com/document/api/213/11646?from_cn_redirect=1).
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get Query criteria:
vpc-id: filter by VPC ID; local-gateway-name: filter by local gateway name (fuzzy search is supported); local-gateway-id: filter by local gateway instance ID; cdc-id: filter by CDC instance ID. 
     * @return Filters Query criteria:
vpc-id: filter by VPC ID; local-gateway-name: filter by local gateway name (fuzzy search is supported); local-gateway-id: filter by local gateway instance ID; cdc-id: filter by CDC instance ID.
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Query criteria:
vpc-id: filter by VPC ID; local-gateway-name: filter by local gateway name (fuzzy search is supported); local-gateway-id: filter by local gateway instance ID; cdc-id: filter by CDC instance ID.
     * @param Filters Query criteria:
vpc-id: filter by VPC ID; local-gateway-name: filter by local gateway name (fuzzy search is supported); local-gateway-id: filter by local gateway instance ID; cdc-id: filter by CDC instance ID.
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get The offset. Default value: 0. For more information on `Offset`, see the relevant sections in API [Introduction](https://intl.cloud.tencent.com/document/api/213/11646?from_cn_redirect=1). 
     * @return Offset The offset. Default value: 0. For more information on `Offset`, see the relevant sections in API [Introduction](https://intl.cloud.tencent.com/document/api/213/11646?from_cn_redirect=1).
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set The offset. Default value: 0. For more information on `Offset`, see the relevant sections in API [Introduction](https://intl.cloud.tencent.com/document/api/213/11646?from_cn_redirect=1).
     * @param Offset The offset. Default value: 0. For more information on `Offset`, see the relevant sections in API [Introduction](https://intl.cloud.tencent.com/document/api/213/11646?from_cn_redirect=1).
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get The number of returned results. Default value: 20. Maximum value: 100. For more information on `Limit`, see the relevant sections in API [Introduction](https://intl.cloud.tencent.com/document/api/213/11646?from_cn_redirect=1). 
     * @return Limit The number of returned results. Default value: 20. Maximum value: 100. For more information on `Limit`, see the relevant sections in API [Introduction](https://intl.cloud.tencent.com/document/api/213/11646?from_cn_redirect=1).
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set The number of returned results. Default value: 20. Maximum value: 100. For more information on `Limit`, see the relevant sections in API [Introduction](https://intl.cloud.tencent.com/document/api/213/11646?from_cn_redirect=1).
     * @param Limit The number of returned results. Default value: 20. Maximum value: 100. For more information on `Limit`, see the relevant sections in API [Introduction](https://intl.cloud.tencent.com/document/api/213/11646?from_cn_redirect=1).
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

