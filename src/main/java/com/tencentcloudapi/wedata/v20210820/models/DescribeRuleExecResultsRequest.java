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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRuleExecResultsRequest extends AbstractModel {

    /**
    * Rule Group Execution ID
    */
    @SerializedName("RuleGroupExecId")
    @Expose
    private Long RuleGroupExecId;

    /**
    * Project ID
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
     * Get Rule Group Execution ID 
     * @return RuleGroupExecId Rule Group Execution ID
     */
    public Long getRuleGroupExecId() {
        return this.RuleGroupExecId;
    }

    /**
     * Set Rule Group Execution ID
     * @param RuleGroupExecId Rule Group Execution ID
     */
    public void setRuleGroupExecId(Long RuleGroupExecId) {
        this.RuleGroupExecId = RuleGroupExecId;
    }

    /**
     * Get Project ID 
     * @return ProjectId Project ID
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Project ID
     * @param ProjectId Project ID
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    public DescribeRuleExecResultsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRuleExecResultsRequest(DescribeRuleExecResultsRequest source) {
        if (source.RuleGroupExecId != null) {
            this.RuleGroupExecId = new Long(source.RuleGroupExecId);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleGroupExecId", this.RuleGroupExecId);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);

    }
}

