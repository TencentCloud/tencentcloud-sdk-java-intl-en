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

public class DescribeSecurityPoliciesRequest extends AbstractModel {

    /**
    * Filter condition list for filtering security policies that meet the specified conditions. Multiple filter conditions are in an "AND" relationship with each other.

**Supported filter conditions:**
- **SecurityPolicyNames**: Filter by security policy name. Fuzzy matching is supported.
- **tag:tag-key**: Filter by tag key-value pair. Replace tag-key with the actual tag key. For example, `tag:env` means filtering by the tag key `env`.

**Description:** Each filter condition supports a maximum of 10 values.

    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * Maximum number of results returned for a single request. For pagination queries, use together with NextToken.

**Value range:** from 1 to 100.

**Default value:** 20.

    */
    @SerializedName("MaxResults")
    @Expose
    private Long MaxResults;

    /**
    * Token for the paging query start. Used to obtain the result data on the next page.

**Instructions:**
-No need to set this parameter for the initial query.
- If the last query returned NextToken, it means there is more data. Input this value to retrieve the next page.
-If the last query did not return NextToken or returned empty, it means the current page is the last page.

    */
    @SerializedName("NextToken")
    @Expose
    private String NextToken;

    /**
    * Security policy ID list. The ID format is `tls-` followed by 8 alphanumeric characters.
    */
    @SerializedName("SecurityPolicyIds")
    @Expose
    private String [] SecurityPolicyIds;

    /**
     * Get Filter condition list for filtering security policies that meet the specified conditions. Multiple filter conditions are in an "AND" relationship with each other.

**Supported filter conditions:**
- **SecurityPolicyNames**: Filter by security policy name. Fuzzy matching is supported.
- **tag:tag-key**: Filter by tag key-value pair. Replace tag-key with the actual tag key. For example, `tag:env` means filtering by the tag key `env`.

**Description:** Each filter condition supports a maximum of 10 values.
 
     * @return Filters Filter condition list for filtering security policies that meet the specified conditions. Multiple filter conditions are in an "AND" relationship with each other.

**Supported filter conditions:**
- **SecurityPolicyNames**: Filter by security policy name. Fuzzy matching is supported.
- **tag:tag-key**: Filter by tag key-value pair. Replace tag-key with the actual tag key. For example, `tag:env` means filtering by the tag key `env`.

**Description:** Each filter condition supports a maximum of 10 values.

     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter condition list for filtering security policies that meet the specified conditions. Multiple filter conditions are in an "AND" relationship with each other.

**Supported filter conditions:**
- **SecurityPolicyNames**: Filter by security policy name. Fuzzy matching is supported.
- **tag:tag-key**: Filter by tag key-value pair. Replace tag-key with the actual tag key. For example, `tag:env` means filtering by the tag key `env`.

**Description:** Each filter condition supports a maximum of 10 values.

     * @param Filters Filter condition list for filtering security policies that meet the specified conditions. Multiple filter conditions are in an "AND" relationship with each other.

**Supported filter conditions:**
- **SecurityPolicyNames**: Filter by security policy name. Fuzzy matching is supported.
- **tag:tag-key**: Filter by tag key-value pair. Replace tag-key with the actual tag key. For example, `tag:env` means filtering by the tag key `env`.

**Description:** Each filter condition supports a maximum of 10 values.

     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get Maximum number of results returned for a single request. For pagination queries, use together with NextToken.

**Value range:** from 1 to 100.

**Default value:** 20.
 
     * @return MaxResults Maximum number of results returned for a single request. For pagination queries, use together with NextToken.

**Value range:** from 1 to 100.

**Default value:** 20.

     */
    public Long getMaxResults() {
        return this.MaxResults;
    }

    /**
     * Set Maximum number of results returned for a single request. For pagination queries, use together with NextToken.

**Value range:** from 1 to 100.

**Default value:** 20.

     * @param MaxResults Maximum number of results returned for a single request. For pagination queries, use together with NextToken.

**Value range:** from 1 to 100.

**Default value:** 20.

     */
    public void setMaxResults(Long MaxResults) {
        this.MaxResults = MaxResults;
    }

    /**
     * Get Token for the paging query start. Used to obtain the result data on the next page.

**Instructions:**
-No need to set this parameter for the initial query.
- If the last query returned NextToken, it means there is more data. Input this value to retrieve the next page.
-If the last query did not return NextToken or returned empty, it means the current page is the last page.
 
     * @return NextToken Token for the paging query start. Used to obtain the result data on the next page.

**Instructions:**
-No need to set this parameter for the initial query.
- If the last query returned NextToken, it means there is more data. Input this value to retrieve the next page.
-If the last query did not return NextToken or returned empty, it means the current page is the last page.

     */
    public String getNextToken() {
        return this.NextToken;
    }

    /**
     * Set Token for the paging query start. Used to obtain the result data on the next page.

**Instructions:**
-No need to set this parameter for the initial query.
- If the last query returned NextToken, it means there is more data. Input this value to retrieve the next page.
-If the last query did not return NextToken or returned empty, it means the current page is the last page.

     * @param NextToken Token for the paging query start. Used to obtain the result data on the next page.

**Instructions:**
-No need to set this parameter for the initial query.
- If the last query returned NextToken, it means there is more data. Input this value to retrieve the next page.
-If the last query did not return NextToken or returned empty, it means the current page is the last page.

     */
    public void setNextToken(String NextToken) {
        this.NextToken = NextToken;
    }

    /**
     * Get Security policy ID list. The ID format is `tls-` followed by 8 alphanumeric characters. 
     * @return SecurityPolicyIds Security policy ID list. The ID format is `tls-` followed by 8 alphanumeric characters.
     */
    public String [] getSecurityPolicyIds() {
        return this.SecurityPolicyIds;
    }

    /**
     * Set Security policy ID list. The ID format is `tls-` followed by 8 alphanumeric characters.
     * @param SecurityPolicyIds Security policy ID list. The ID format is `tls-` followed by 8 alphanumeric characters.
     */
    public void setSecurityPolicyIds(String [] SecurityPolicyIds) {
        this.SecurityPolicyIds = SecurityPolicyIds;
    }

    public DescribeSecurityPoliciesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSecurityPoliciesRequest(DescribeSecurityPoliciesRequest source) {
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
        if (source.SecurityPolicyIds != null) {
            this.SecurityPolicyIds = new String[source.SecurityPolicyIds.length];
            for (int i = 0; i < source.SecurityPolicyIds.length; i++) {
                this.SecurityPolicyIds[i] = new String(source.SecurityPolicyIds[i]);
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
        this.setParamArraySimple(map, prefix + "SecurityPolicyIds.", this.SecurityPolicyIds);

    }
}

