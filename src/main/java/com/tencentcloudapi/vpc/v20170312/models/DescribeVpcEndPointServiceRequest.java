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

public class DescribeVpcEndPointServiceRequest extends AbstractModel{

    /**
    * Filters. `EndPointServiceIds` and `Filters` cannot be both passed in. 
<li>`service-id` - String - Unique endpoint service ID. </li>
<li>`service-name` - String - Endpoint service instance name. </li>
<li>`service-instance-id` - String - Unique backend service ID in the format of `lb-xxx`. </li>
<li>`service-type` - String - Backend PaaS service type. It can be `CLB`, `CDB` or `CRS`. It defaults to `CLB` if not specified. </li>
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * Offset. Default value: 0.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Number of results per page; default value: 20; maximum value: 100.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Endpoint service ID `EndPointServiceIds` and `Filters` cannot be both passed in. 
    */
    @SerializedName("EndPointServiceIds")
    @Expose
    private String [] EndPointServiceIds;

    /**
    * 
    */
    @SerializedName("IsListAuthorizedEndPointService")
    @Expose
    private Boolean IsListAuthorizedEndPointService;

    /**
     * Get Filters. `EndPointServiceIds` and `Filters` cannot be both passed in. 
<li>`service-id` - String - Unique endpoint service ID. </li>
<li>`service-name` - String - Endpoint service instance name. </li>
<li>`service-instance-id` - String - Unique backend service ID in the format of `lb-xxx`. </li>
<li>`service-type` - String - Backend PaaS service type. It can be `CLB`, `CDB` or `CRS`. It defaults to `CLB` if not specified. </li> 
     * @return Filters Filters. `EndPointServiceIds` and `Filters` cannot be both passed in. 
<li>`service-id` - String - Unique endpoint service ID. </li>
<li>`service-name` - String - Endpoint service instance name. </li>
<li>`service-instance-id` - String - Unique backend service ID in the format of `lb-xxx`. </li>
<li>`service-type` - String - Backend PaaS service type. It can be `CLB`, `CDB` or `CRS`. It defaults to `CLB` if not specified. </li>
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filters. `EndPointServiceIds` and `Filters` cannot be both passed in. 
<li>`service-id` - String - Unique endpoint service ID. </li>
<li>`service-name` - String - Endpoint service instance name. </li>
<li>`service-instance-id` - String - Unique backend service ID in the format of `lb-xxx`. </li>
<li>`service-type` - String - Backend PaaS service type. It can be `CLB`, `CDB` or `CRS`. It defaults to `CLB` if not specified. </li>
     * @param Filters Filters. `EndPointServiceIds` and `Filters` cannot be both passed in. 
<li>`service-id` - String - Unique endpoint service ID. </li>
<li>`service-name` - String - Endpoint service instance name. </li>
<li>`service-instance-id` - String - Unique backend service ID in the format of `lb-xxx`. </li>
<li>`service-type` - String - Backend PaaS service type. It can be `CLB`, `CDB` or `CRS`. It defaults to `CLB` if not specified. </li>
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get Offset. Default value: 0. 
     * @return Offset Offset. Default value: 0.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset. Default value: 0.
     * @param Offset Offset. Default value: 0.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Number of results per page; default value: 20; maximum value: 100. 
     * @return Limit Number of results per page; default value: 20; maximum value: 100.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of results per page; default value: 20; maximum value: 100.
     * @param Limit Number of results per page; default value: 20; maximum value: 100.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Endpoint service ID `EndPointServiceIds` and `Filters` cannot be both passed in.  
     * @return EndPointServiceIds Endpoint service ID `EndPointServiceIds` and `Filters` cannot be both passed in. 
     */
    public String [] getEndPointServiceIds() {
        return this.EndPointServiceIds;
    }

    /**
     * Set Endpoint service ID `EndPointServiceIds` and `Filters` cannot be both passed in. 
     * @param EndPointServiceIds Endpoint service ID `EndPointServiceIds` and `Filters` cannot be both passed in. 
     */
    public void setEndPointServiceIds(String [] EndPointServiceIds) {
        this.EndPointServiceIds = EndPointServiceIds;
    }

    /**
     * Get  
     * @return IsListAuthorizedEndPointService 
     */
    public Boolean getIsListAuthorizedEndPointService() {
        return this.IsListAuthorizedEndPointService;
    }

    /**
     * Set 
     * @param IsListAuthorizedEndPointService 
     */
    public void setIsListAuthorizedEndPointService(Boolean IsListAuthorizedEndPointService) {
        this.IsListAuthorizedEndPointService = IsListAuthorizedEndPointService;
    }

    public DescribeVpcEndPointServiceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeVpcEndPointServiceRequest(DescribeVpcEndPointServiceRequest source) {
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.EndPointServiceIds != null) {
            this.EndPointServiceIds = new String[source.EndPointServiceIds.length];
            for (int i = 0; i < source.EndPointServiceIds.length; i++) {
                this.EndPointServiceIds[i] = new String(source.EndPointServiceIds[i]);
            }
        }
        if (source.IsListAuthorizedEndPointService != null) {
            this.IsListAuthorizedEndPointService = new Boolean(source.IsListAuthorizedEndPointService);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArraySimple(map, prefix + "EndPointServiceIds.", this.EndPointServiceIds);
        this.setParamSimple(map, prefix + "IsListAuthorizedEndPointService", this.IsListAuthorizedEndPointService);

    }
}

