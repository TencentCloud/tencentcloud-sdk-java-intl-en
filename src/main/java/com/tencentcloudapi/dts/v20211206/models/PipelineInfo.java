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
package com.tencentcloudapi.dts.v20211206.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PipelineInfo extends AbstractModel {

    /**
    * Aggregation operators: $addFields, $match, $project, $replaceRoot, $redact, $replaceWith, $set, $unset. $replaceWith, $set, $unset are available options for subscription instances that are version 4.2 or higher.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AggOp")
    @Expose
    private String AggOp;

    /**
    * Aggregation expression must be in json format.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AggCmd")
    @Expose
    private String AggCmd;

    /**
     * Get Aggregation operators: $addFields, $match, $project, $replaceRoot, $redact, $replaceWith, $set, $unset. $replaceWith, $set, $unset are available options for subscription instances that are version 4.2 or higher.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AggOp Aggregation operators: $addFields, $match, $project, $replaceRoot, $redact, $replaceWith, $set, $unset. $replaceWith, $set, $unset are available options for subscription instances that are version 4.2 or higher.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getAggOp() {
        return this.AggOp;
    }

    /**
     * Set Aggregation operators: $addFields, $match, $project, $replaceRoot, $redact, $replaceWith, $set, $unset. $replaceWith, $set, $unset are available options for subscription instances that are version 4.2 or higher.Note: This field may return null, indicating that no valid values can be obtained.
     * @param AggOp Aggregation operators: $addFields, $match, $project, $replaceRoot, $redact, $replaceWith, $set, $unset. $replaceWith, $set, $unset are available options for subscription instances that are version 4.2 or higher.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAggOp(String AggOp) {
        this.AggOp = AggOp;
    }

    /**
     * Get Aggregation expression must be in json format.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AggCmd Aggregation expression must be in json format.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getAggCmd() {
        return this.AggCmd;
    }

    /**
     * Set Aggregation expression must be in json format.Note: This field may return null, indicating that no valid values can be obtained.
     * @param AggCmd Aggregation expression must be in json format.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAggCmd(String AggCmd) {
        this.AggCmd = AggCmd;
    }

    public PipelineInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PipelineInfo(PipelineInfo source) {
        if (source.AggOp != null) {
            this.AggOp = new String(source.AggOp);
        }
        if (source.AggCmd != null) {
            this.AggCmd = new String(source.AggCmd);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AggOp", this.AggOp);
        this.setParamSimple(map, prefix + "AggCmd", this.AggCmd);

    }
}

