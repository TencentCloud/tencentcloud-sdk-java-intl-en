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

public class DescribeTargetGroupTargetsRequest extends AbstractModel {

    /**
    * Target group ID. The format is `lbtg-` followed by 8 alphanumeric characters.
    */
    @SerializedName("TargetGroupId")
    @Expose
    private String TargetGroupId;

    /**
    * Filter. Query backend services by specified filter criteria. Supported values:
- The value of Name is **TargetId**. Filter backend services by resource ID. This parameter is valid only when the backend type of the target group is **Instance**. The value of Values is the resource ID of Cvm or Eni.
-The value of `Name` is **TargetIp**. Filter backend services by resource IP. This parameter is valid only when the backend type of the target group is **Ip**. The value of `Values` is the IP of the backend service.
-Filter by tag.
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * The number of return lists, with a default value of **20** and a maximum value of **100**.
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
     * Get Target group ID. The format is `lbtg-` followed by 8 alphanumeric characters. 
     * @return TargetGroupId Target group ID. The format is `lbtg-` followed by 8 alphanumeric characters.
     */
    public String getTargetGroupId() {
        return this.TargetGroupId;
    }

    /**
     * Set Target group ID. The format is `lbtg-` followed by 8 alphanumeric characters.
     * @param TargetGroupId Target group ID. The format is `lbtg-` followed by 8 alphanumeric characters.
     */
    public void setTargetGroupId(String TargetGroupId) {
        this.TargetGroupId = TargetGroupId;
    }

    /**
     * Get Filter. Query backend services by specified filter criteria. Supported values:
- The value of Name is **TargetId**. Filter backend services by resource ID. This parameter is valid only when the backend type of the target group is **Instance**. The value of Values is the resource ID of Cvm or Eni.
-The value of `Name` is **TargetIp**. Filter backend services by resource IP. This parameter is valid only when the backend type of the target group is **Ip**. The value of `Values` is the IP of the backend service.
-Filter by tag. 
     * @return Filters Filter. Query backend services by specified filter criteria. Supported values:
- The value of Name is **TargetId**. Filter backend services by resource ID. This parameter is valid only when the backend type of the target group is **Instance**. The value of Values is the resource ID of Cvm or Eni.
-The value of `Name` is **TargetIp**. Filter backend services by resource IP. This parameter is valid only when the backend type of the target group is **Ip**. The value of `Values` is the IP of the backend service.
-Filter by tag.
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter. Query backend services by specified filter criteria. Supported values:
- The value of Name is **TargetId**. Filter backend services by resource ID. This parameter is valid only when the backend type of the target group is **Instance**. The value of Values is the resource ID of Cvm or Eni.
-The value of `Name` is **TargetIp**. Filter backend services by resource IP. This parameter is valid only when the backend type of the target group is **Ip**. The value of `Values` is the IP of the backend service.
-Filter by tag.
     * @param Filters Filter. Query backend services by specified filter criteria. Supported values:
- The value of Name is **TargetId**. Filter backend services by resource ID. This parameter is valid only when the backend type of the target group is **Instance**. The value of Values is the resource ID of Cvm or Eni.
-The value of `Name` is **TargetIp**. Filter backend services by resource IP. This parameter is valid only when the backend type of the target group is **Ip**. The value of `Values` is the IP of the backend service.
-Filter by tag.
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get The number of return lists, with a default value of **20** and a maximum value of **100**. 
     * @return MaxResults The number of return lists, with a default value of **20** and a maximum value of **100**.
     */
    public Long getMaxResults() {
        return this.MaxResults;
    }

    /**
     * Set The number of return lists, with a default value of **20** and a maximum value of **100**.
     * @param MaxResults The number of return lists, with a default value of **20** and a maximum value of **100**.
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

    public DescribeTargetGroupTargetsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTargetGroupTargetsRequest(DescribeTargetGroupTargetsRequest source) {
        if (source.TargetGroupId != null) {
            this.TargetGroupId = new String(source.TargetGroupId);
        }
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TargetGroupId", this.TargetGroupId);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "MaxResults", this.MaxResults);
        this.setParamSimple(map, prefix + "NextToken", this.NextToken);

    }
}

