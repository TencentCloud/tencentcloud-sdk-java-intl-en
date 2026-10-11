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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class NodeSelectorTerm extends AbstractModel {

    /**
    * Node option expression set.
    */
    @SerializedName("MatchExpressions")
    @Expose
    private NodeSelectorRequirement [] MatchExpressions;

    /**
     * Get Node option expression set. 
     * @return MatchExpressions Node option expression set.
     */
    public NodeSelectorRequirement [] getMatchExpressions() {
        return this.MatchExpressions;
    }

    /**
     * Set Node option expression set.
     * @param MatchExpressions Node option expression set.
     */
    public void setMatchExpressions(NodeSelectorRequirement [] MatchExpressions) {
        this.MatchExpressions = MatchExpressions;
    }

    public NodeSelectorTerm() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NodeSelectorTerm(NodeSelectorTerm source) {
        if (source.MatchExpressions != null) {
            this.MatchExpressions = new NodeSelectorRequirement[source.MatchExpressions.length];
            for (int i = 0; i < source.MatchExpressions.length; i++) {
                this.MatchExpressions[i] = new NodeSelectorRequirement(source.MatchExpressions[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "MatchExpressions.", this.MatchExpressions);

    }
}

