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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSecurityGroupsRequest extends AbstractModel {

    /**
    * Security group ID, such as `sg-33ocnj9n`. Each request can contain up to 100 instances at a time. `SecurityGroupIds` and `Filters` cannot be specified at the same time.
    */
    @SerializedName("SecurityGroupIds")
    @Expose
    private String [] SecurityGroupIds;

    /**
    * Filter conditions. `SecurityGroupIds` and `Filters` cannot be specified at the same time.
<li>security-group-id - String - (Filter condition) The security group ID.</li>
<li>project-id - Integer - (Filter condition) The project ID.</li>
<li>security-group-name - String - (Filter condition) The security group name.</li>
<li>tag-key - String - Required: no - (Filter condition) Filters by tag key. For more information, see Example 2.</li>
<li> `tag:tag-key` - String - Required: no - (Filter condition) Filters by tag key pair. For this parameter, `tag-key` will be replaced with a specific tag key. For more information, see Example 3.</li>
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * Offset. Default value: 0.
    */
    @SerializedName("Offset")
    @Expose
    private String Offset;

    /**
    * Number of returned results. Default value: 20. Maximum value: 100.
    */
    @SerializedName("Limit")
    @Expose
    private String Limit;

    /**
    * Sorting field. Values: `CreatedTime`, `UpdateTime` Note: This field does not have default value.
    */
    @SerializedName("OrderField")
    @Expose
    private String OrderField;

    /**
    * Sorting method Order methods. Ascending: `ASC`, Descending: `DESC`. Default: `ASC`
    */
    @SerializedName("OrderDirection")
    @Expose
    private String OrderDirection;

    /**
     * Get Security group ID, such as `sg-33ocnj9n`. Each request can contain up to 100 instances at a time. `SecurityGroupIds` and `Filters` cannot be specified at the same time. 
     * @return SecurityGroupIds Security group ID, such as `sg-33ocnj9n`. Each request can contain up to 100 instances at a time. `SecurityGroupIds` and `Filters` cannot be specified at the same time.
     */
    public String [] getSecurityGroupIds() {
        return this.SecurityGroupIds;
    }

    /**
     * Set Security group ID, such as `sg-33ocnj9n`. Each request can contain up to 100 instances at a time. `SecurityGroupIds` and `Filters` cannot be specified at the same time.
     * @param SecurityGroupIds Security group ID, such as `sg-33ocnj9n`. Each request can contain up to 100 instances at a time. `SecurityGroupIds` and `Filters` cannot be specified at the same time.
     */
    public void setSecurityGroupIds(String [] SecurityGroupIds) {
        this.SecurityGroupIds = SecurityGroupIds;
    }

    /**
     * Get Filter conditions. `SecurityGroupIds` and `Filters` cannot be specified at the same time.
<li>security-group-id - String - (Filter condition) The security group ID.</li>
<li>project-id - Integer - (Filter condition) The project ID.</li>
<li>security-group-name - String - (Filter condition) The security group name.</li>
<li>tag-key - String - Required: no - (Filter condition) Filters by tag key. For more information, see Example 2.</li>
<li> `tag:tag-key` - String - Required: no - (Filter condition) Filters by tag key pair. For this parameter, `tag-key` will be replaced with a specific tag key. For more information, see Example 3.</li> 
     * @return Filters Filter conditions. `SecurityGroupIds` and `Filters` cannot be specified at the same time.
<li>security-group-id - String - (Filter condition) The security group ID.</li>
<li>project-id - Integer - (Filter condition) The project ID.</li>
<li>security-group-name - String - (Filter condition) The security group name.</li>
<li>tag-key - String - Required: no - (Filter condition) Filters by tag key. For more information, see Example 2.</li>
<li> `tag:tag-key` - String - Required: no - (Filter condition) Filters by tag key pair. For this parameter, `tag-key` will be replaced with a specific tag key. For more information, see Example 3.</li>
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter conditions. `SecurityGroupIds` and `Filters` cannot be specified at the same time.
<li>security-group-id - String - (Filter condition) The security group ID.</li>
<li>project-id - Integer - (Filter condition) The project ID.</li>
<li>security-group-name - String - (Filter condition) The security group name.</li>
<li>tag-key - String - Required: no - (Filter condition) Filters by tag key. For more information, see Example 2.</li>
<li> `tag:tag-key` - String - Required: no - (Filter condition) Filters by tag key pair. For this parameter, `tag-key` will be replaced with a specific tag key. For more information, see Example 3.</li>
     * @param Filters Filter conditions. `SecurityGroupIds` and `Filters` cannot be specified at the same time.
<li>security-group-id - String - (Filter condition) The security group ID.</li>
<li>project-id - Integer - (Filter condition) The project ID.</li>
<li>security-group-name - String - (Filter condition) The security group name.</li>
<li>tag-key - String - Required: no - (Filter condition) Filters by tag key. For more information, see Example 2.</li>
<li> `tag:tag-key` - String - Required: no - (Filter condition) Filters by tag key pair. For this parameter, `tag-key` will be replaced with a specific tag key. For more information, see Example 3.</li>
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get Offset. Default value: 0. 
     * @return Offset Offset. Default value: 0.
     */
    public String getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset. Default value: 0.
     * @param Offset Offset. Default value: 0.
     */
    public void setOffset(String Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Number of returned results. Default value: 20. Maximum value: 100. 
     * @return Limit Number of returned results. Default value: 20. Maximum value: 100.
     */
    public String getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of returned results. Default value: 20. Maximum value: 100.
     * @param Limit Number of returned results. Default value: 20. Maximum value: 100.
     */
    public void setLimit(String Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Sorting field. Values: `CreatedTime`, `UpdateTime` Note: This field does not have default value. 
     * @return OrderField Sorting field. Values: `CreatedTime`, `UpdateTime` Note: This field does not have default value.
     */
    public String getOrderField() {
        return this.OrderField;
    }

    /**
     * Set Sorting field. Values: `CreatedTime`, `UpdateTime` Note: This field does not have default value.
     * @param OrderField Sorting field. Values: `CreatedTime`, `UpdateTime` Note: This field does not have default value.
     */
    public void setOrderField(String OrderField) {
        this.OrderField = OrderField;
    }

    /**
     * Get Sorting method Order methods. Ascending: `ASC`, Descending: `DESC`. Default: `ASC` 
     * @return OrderDirection Sorting method Order methods. Ascending: `ASC`, Descending: `DESC`. Default: `ASC`
     */
    public String getOrderDirection() {
        return this.OrderDirection;
    }

    /**
     * Set Sorting method Order methods. Ascending: `ASC`, Descending: `DESC`. Default: `ASC`
     * @param OrderDirection Sorting method Order methods. Ascending: `ASC`, Descending: `DESC`. Default: `ASC`
     */
    public void setOrderDirection(String OrderDirection) {
        this.OrderDirection = OrderDirection;
    }

    public DescribeSecurityGroupsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSecurityGroupsRequest(DescribeSecurityGroupsRequest source) {
        if (source.SecurityGroupIds != null) {
            this.SecurityGroupIds = new String[source.SecurityGroupIds.length];
            for (int i = 0; i < source.SecurityGroupIds.length; i++) {
                this.SecurityGroupIds[i] = new String(source.SecurityGroupIds[i]);
            }
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.Offset != null) {
            this.Offset = new String(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new String(source.Limit);
        }
        if (source.OrderField != null) {
            this.OrderField = new String(source.OrderField);
        }
        if (source.OrderDirection != null) {
            this.OrderDirection = new String(source.OrderDirection);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "SecurityGroupIds.", this.SecurityGroupIds);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "OrderField", this.OrderField);
        this.setParamSimple(map, prefix + "OrderDirection", this.OrderDirection);

    }
}

