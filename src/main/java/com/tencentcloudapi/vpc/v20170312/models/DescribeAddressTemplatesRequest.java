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

public class DescribeAddressTemplatesRequest extends AbstractModel{

    /**
    * Filter conditions.
<li>address-template-name - String - (Filter condition) IP address template name.</li>
<li>address-template-id - String - (Filter condition) IP address template instance ID, such as `ipm-mdunqeb6`.</li>
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * Offset. The default value is 0.
    */
    @SerializedName("Offset")
    @Expose
    private String Offset;

    /**
    * Number of values to be returned. The default value is 20. Maximum is 100.
    */
    @SerializedName("Limit")
    @Expose
    private String Limit;

    /**
     * Get Filter conditions.
<li>address-template-name - String - (Filter condition) IP address template name.</li>
<li>address-template-id - String - (Filter condition) IP address template instance ID, such as `ipm-mdunqeb6`.</li> 
     * @return Filters Filter conditions.
<li>address-template-name - String - (Filter condition) IP address template name.</li>
<li>address-template-id - String - (Filter condition) IP address template instance ID, such as `ipm-mdunqeb6`.</li>
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter conditions.
<li>address-template-name - String - (Filter condition) IP address template name.</li>
<li>address-template-id - String - (Filter condition) IP address template instance ID, such as `ipm-mdunqeb6`.</li>
     * @param Filters Filter conditions.
<li>address-template-name - String - (Filter condition) IP address template name.</li>
<li>address-template-id - String - (Filter condition) IP address template instance ID, such as `ipm-mdunqeb6`.</li>
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get Offset. The default value is 0. 
     * @return Offset Offset. The default value is 0.
     */
    public String getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset. The default value is 0.
     * @param Offset Offset. The default value is 0.
     */
    public void setOffset(String Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Number of values to be returned. The default value is 20. Maximum is 100. 
     * @return Limit Number of values to be returned. The default value is 20. Maximum is 100.
     */
    public String getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of values to be returned. The default value is 20. Maximum is 100.
     * @param Limit Number of values to be returned. The default value is 20. Maximum is 100.
     */
    public void setLimit(String Limit) {
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

