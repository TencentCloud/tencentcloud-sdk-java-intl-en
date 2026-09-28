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
package com.tencentcloudapi.alb.v20251030.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTargetGroupsRequest extends AbstractModel {

    /**
    * Filter. Query backend services by specified filter criteria. Supported values:
- The value of Name is **VpcId**. Filter target groups by VPC instance. The value of **Values** is a unique VPC ID list.
-The value of `Name` is **TargetType**. Filter target groups by backend service type. The value of `Values` can be **Instance**.
-The value of `Name` is **TargetGroupName**. Filter target groups by target group name. The value of `Values` is a list of target group names.
- The value of `Name` is **Protocol**. Filter target groups by the backend service protocol of the target group. The value of `Values` is a list of backend service protocols of target groups.
-Filter by tag.
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * Number of returned entries. Default value: 20. Maximum value: 100.
    */
    @SerializedName("MaxResults")
    @Expose
    private Long MaxResults;

    /**
    * Token for the next query. Not required for the first query or when there are no more queries.
If there is a next query, the value is the NextToken value returned from the last API call.
    */
    @SerializedName("NextToken")
    @Expose
    private String NextToken;

    /**
    * Target group ID list. The ID format is `lbtg-` followed by 8 alphanumeric characters.
    */
    @SerializedName("TargetGroupIds")
    @Expose
    private String [] TargetGroupIds;

    /**
     * Get Filter. Query backend services by specified filter criteria. Supported values:
- The value of Name is **VpcId**. Filter target groups by VPC instance. The value of **Values** is a unique VPC ID list.
-The value of `Name` is **TargetType**. Filter target groups by backend service type. The value of `Values` can be **Instance**.
-The value of `Name` is **TargetGroupName**. Filter target groups by target group name. The value of `Values` is a list of target group names.
- The value of `Name` is **Protocol**. Filter target groups by the backend service protocol of the target group. The value of `Values` is a list of backend service protocols of target groups.
-Filter by tag. 
     * @return Filters Filter. Query backend services by specified filter criteria. Supported values:
- The value of Name is **VpcId**. Filter target groups by VPC instance. The value of **Values** is a unique VPC ID list.
-The value of `Name` is **TargetType**. Filter target groups by backend service type. The value of `Values` can be **Instance**.
-The value of `Name` is **TargetGroupName**. Filter target groups by target group name. The value of `Values` is a list of target group names.
- The value of `Name` is **Protocol**. Filter target groups by the backend service protocol of the target group. The value of `Values` is a list of backend service protocols of target groups.
-Filter by tag.
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter. Query backend services by specified filter criteria. Supported values:
- The value of Name is **VpcId**. Filter target groups by VPC instance. The value of **Values** is a unique VPC ID list.
-The value of `Name` is **TargetType**. Filter target groups by backend service type. The value of `Values` can be **Instance**.
-The value of `Name` is **TargetGroupName**. Filter target groups by target group name. The value of `Values` is a list of target group names.
- The value of `Name` is **Protocol**. Filter target groups by the backend service protocol of the target group. The value of `Values` is a list of backend service protocols of target groups.
-Filter by tag.
     * @param Filters Filter. Query backend services by specified filter criteria. Supported values:
- The value of Name is **VpcId**. Filter target groups by VPC instance. The value of **Values** is a unique VPC ID list.
-The value of `Name` is **TargetType**. Filter target groups by backend service type. The value of `Values` can be **Instance**.
-The value of `Name` is **TargetGroupName**. Filter target groups by target group name. The value of `Values` is a list of target group names.
- The value of `Name` is **Protocol**. Filter target groups by the backend service protocol of the target group. The value of `Values` is a list of backend service protocols of target groups.
-Filter by tag.
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get Number of returned entries. Default value: 20. Maximum value: 100. 
     * @return MaxResults Number of returned entries. Default value: 20. Maximum value: 100.
     */
    public Long getMaxResults() {
        return this.MaxResults;
    }

    /**
     * Set Number of returned entries. Default value: 20. Maximum value: 100.
     * @param MaxResults Number of returned entries. Default value: 20. Maximum value: 100.
     */
    public void setMaxResults(Long MaxResults) {
        this.MaxResults = MaxResults;
    }

    /**
     * Get Token for the next query. Not required for the first query or when there are no more queries.
If there is a next query, the value is the NextToken value returned from the last API call. 
     * @return NextToken Token for the next query. Not required for the first query or when there are no more queries.
If there is a next query, the value is the NextToken value returned from the last API call.
     */
    public String getNextToken() {
        return this.NextToken;
    }

    /**
     * Set Token for the next query. Not required for the first query or when there are no more queries.
If there is a next query, the value is the NextToken value returned from the last API call.
     * @param NextToken Token for the next query. Not required for the first query or when there are no more queries.
If there is a next query, the value is the NextToken value returned from the last API call.
     */
    public void setNextToken(String NextToken) {
        this.NextToken = NextToken;
    }

    /**
     * Get Target group ID list. The ID format is `lbtg-` followed by 8 alphanumeric characters. 
     * @return TargetGroupIds Target group ID list. The ID format is `lbtg-` followed by 8 alphanumeric characters.
     */
    public String [] getTargetGroupIds() {
        return this.TargetGroupIds;
    }

    /**
     * Set Target group ID list. The ID format is `lbtg-` followed by 8 alphanumeric characters.
     * @param TargetGroupIds Target group ID list. The ID format is `lbtg-` followed by 8 alphanumeric characters.
     */
    public void setTargetGroupIds(String [] TargetGroupIds) {
        this.TargetGroupIds = TargetGroupIds;
    }

    public DescribeTargetGroupsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTargetGroupsRequest(DescribeTargetGroupsRequest source) {
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.MaxResults != null) {
            this.MaxResults = new Long(source.MaxResults);
        }
        if (source.NextToken != null) {
            this.NextToken = new String(source.NextToken);
        }
        if (source.TargetGroupIds != null) {
            this.TargetGroupIds = new String[source.TargetGroupIds.length];
            for (int i = 0; i < source.TargetGroupIds.length; i++) {
                this.TargetGroupIds[i] = new String(source.TargetGroupIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "MaxResults", this.MaxResults);
        this.setParamSimple(map, prefix + "NextToken", this.NextToken);
        this.setParamArraySimple(map, prefix + "TargetGroupIds.", this.TargetGroupIds);

    }
}

