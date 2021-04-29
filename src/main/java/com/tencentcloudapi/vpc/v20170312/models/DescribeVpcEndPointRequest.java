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

public class DescribeVpcEndPointRequest extends AbstractModel{

    /**
    * Filter condition
<li> end-point-service-id - String - (Filter condition) Endpoint service ID.</li>
<li>end-point-name - String - (Filter condition) Endpoint instance name.</li>
<li> end-point-id - String - (Filter condition) Endpoint instance ID.</li>
<li> vpc-id - String - (Filter condition) VPC instance ID.</li>
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
    * Endpoint ID list
    */
    @SerializedName("EndPointId")
    @Expose
    private String [] EndPointId;

    /**
     * Get Filter condition
<li> end-point-service-id - String - (Filter condition) Endpoint service ID.</li>
<li>end-point-name - String - (Filter condition) Endpoint instance name.</li>
<li> end-point-id - String - (Filter condition) Endpoint instance ID.</li>
<li> vpc-id - String - (Filter condition) VPC instance ID.</li> 
     * @return Filters Filter condition
<li> end-point-service-id - String - (Filter condition) Endpoint service ID.</li>
<li>end-point-name - String - (Filter condition) Endpoint instance name.</li>
<li> end-point-id - String - (Filter condition) Endpoint instance ID.</li>
<li> vpc-id - String - (Filter condition) VPC instance ID.</li>
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter condition
<li> end-point-service-id - String - (Filter condition) Endpoint service ID.</li>
<li>end-point-name - String - (Filter condition) Endpoint instance name.</li>
<li> end-point-id - String - (Filter condition) Endpoint instance ID.</li>
<li> vpc-id - String - (Filter condition) VPC instance ID.</li>
     * @param Filters Filter condition
<li> end-point-service-id - String - (Filter condition) Endpoint service ID.</li>
<li>end-point-name - String - (Filter condition) Endpoint instance name.</li>
<li> end-point-id - String - (Filter condition) Endpoint instance ID.</li>
<li> vpc-id - String - (Filter condition) VPC instance ID.</li>
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
     * Get Endpoint ID list 
     * @return EndPointId Endpoint ID list
     */
    public String [] getEndPointId() {
        return this.EndPointId;
    }

    /**
     * Set Endpoint ID list
     * @param EndPointId Endpoint ID list
     */
    public void setEndPointId(String [] EndPointId) {
        this.EndPointId = EndPointId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArraySimple(map, prefix + "EndPointId.", this.EndPointId);

    }
}

