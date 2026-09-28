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

public class DescribeHealthCheckTemplatesRequest extends AbstractModel {

    /**
    * <p>Filter. Query health check templates by specifying filter criteria. Supported:</p><ul><li>Name is <strong>HealthCheckTemplateName</strong>. Filter health check templates by name. <strong>Values</strong> is a template name list.</li><li>Name is <strong>HealthCheckProtocol</strong>. Filter health check templates by health check protocol. <strong>Values</strong> is a protocol list.</li><li>Filter by tag.</li></ul>
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * <p>Health check template ID list. The ID format is hct- followed by alphanumeric characters.</p>
    */
    @SerializedName("HealthCheckTemplateIds")
    @Expose
    private String [] HealthCheckTemplateIds;

    /**
    * <p>The number of returned lists. Default value: 20. Maximum value: 100.</p>
    */
    @SerializedName("MaxResults")
    @Expose
    private String MaxResults;

    /**
    * <p>Token for the next query. Not required for the first query or when there is no next query.<br>If there is a next query, the value is the NextToken returned from the last API call.</p>
    */
    @SerializedName("NextToken")
    @Expose
    private String NextToken;

    /**
     * Get <p>Filter. Query health check templates by specifying filter criteria. Supported:</p><ul><li>Name is <strong>HealthCheckTemplateName</strong>. Filter health check templates by name. <strong>Values</strong> is a template name list.</li><li>Name is <strong>HealthCheckProtocol</strong>. Filter health check templates by health check protocol. <strong>Values</strong> is a protocol list.</li><li>Filter by tag.</li></ul> 
     * @return Filters <p>Filter. Query health check templates by specifying filter criteria. Supported:</p><ul><li>Name is <strong>HealthCheckTemplateName</strong>. Filter health check templates by name. <strong>Values</strong> is a template name list.</li><li>Name is <strong>HealthCheckProtocol</strong>. Filter health check templates by health check protocol. <strong>Values</strong> is a protocol list.</li><li>Filter by tag.</li></ul>
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <p>Filter. Query health check templates by specifying filter criteria. Supported:</p><ul><li>Name is <strong>HealthCheckTemplateName</strong>. Filter health check templates by name. <strong>Values</strong> is a template name list.</li><li>Name is <strong>HealthCheckProtocol</strong>. Filter health check templates by health check protocol. <strong>Values</strong> is a protocol list.</li><li>Filter by tag.</li></ul>
     * @param Filters <p>Filter. Query health check templates by specifying filter criteria. Supported:</p><ul><li>Name is <strong>HealthCheckTemplateName</strong>. Filter health check templates by name. <strong>Values</strong> is a template name list.</li><li>Name is <strong>HealthCheckProtocol</strong>. Filter health check templates by health check protocol. <strong>Values</strong> is a protocol list.</li><li>Filter by tag.</li></ul>
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get <p>Health check template ID list. The ID format is hct- followed by alphanumeric characters.</p> 
     * @return HealthCheckTemplateIds <p>Health check template ID list. The ID format is hct- followed by alphanumeric characters.</p>
     */
    public String [] getHealthCheckTemplateIds() {
        return this.HealthCheckTemplateIds;
    }

    /**
     * Set <p>Health check template ID list. The ID format is hct- followed by alphanumeric characters.</p>
     * @param HealthCheckTemplateIds <p>Health check template ID list. The ID format is hct- followed by alphanumeric characters.</p>
     */
    public void setHealthCheckTemplateIds(String [] HealthCheckTemplateIds) {
        this.HealthCheckTemplateIds = HealthCheckTemplateIds;
    }

    /**
     * Get <p>The number of returned lists. Default value: 20. Maximum value: 100.</p> 
     * @return MaxResults <p>The number of returned lists. Default value: 20. Maximum value: 100.</p>
     */
    public String getMaxResults() {
        return this.MaxResults;
    }

    /**
     * Set <p>The number of returned lists. Default value: 20. Maximum value: 100.</p>
     * @param MaxResults <p>The number of returned lists. Default value: 20. Maximum value: 100.</p>
     */
    public void setMaxResults(String MaxResults) {
        this.MaxResults = MaxResults;
    }

    /**
     * Get <p>Token for the next query. Not required for the first query or when there is no next query.<br>If there is a next query, the value is the NextToken returned from the last API call.</p> 
     * @return NextToken <p>Token for the next query. Not required for the first query or when there is no next query.<br>If there is a next query, the value is the NextToken returned from the last API call.</p>
     */
    public String getNextToken() {
        return this.NextToken;
    }

    /**
     * Set <p>Token for the next query. Not required for the first query or when there is no next query.<br>If there is a next query, the value is the NextToken returned from the last API call.</p>
     * @param NextToken <p>Token for the next query. Not required for the first query or when there is no next query.<br>If there is a next query, the value is the NextToken returned from the last API call.</p>
     */
    public void setNextToken(String NextToken) {
        this.NextToken = NextToken;
    }

    public DescribeHealthCheckTemplatesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeHealthCheckTemplatesRequest(DescribeHealthCheckTemplatesRequest source) {
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.HealthCheckTemplateIds != null) {
            this.HealthCheckTemplateIds = new String[source.HealthCheckTemplateIds.length];
            for (int i = 0; i < source.HealthCheckTemplateIds.length; i++) {
                this.HealthCheckTemplateIds[i] = new String(source.HealthCheckTemplateIds[i]);
            }
        }
        if (source.MaxResults != null) {
            this.MaxResults = new String(source.MaxResults);
        }
        if (source.NextToken != null) {
            this.NextToken = new String(source.NextToken);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamArraySimple(map, prefix + "HealthCheckTemplateIds.", this.HealthCheckTemplateIds);
        this.setParamSimple(map, prefix + "MaxResults", this.MaxResults);
        this.setParamSimple(map, prefix + "NextToken", this.NextToken);

    }
}

