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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VPRRatingStage extends AbstractModel {

    /**
    * Stage name (for example: threat activity level, exploitability, vulnerability severity)
    */
    @SerializedName("Stage")
    @Expose
    private String Stage;

    /**
    * Rating result of this stage
    */
    @SerializedName("Result")
    @Expose
    private String Result;

    /**
     * Get Stage name (for example: threat activity level, exploitability, vulnerability severity) 
     * @return Stage Stage name (for example: threat activity level, exploitability, vulnerability severity)
     */
    public String getStage() {
        return this.Stage;
    }

    /**
     * Set Stage name (for example: threat activity level, exploitability, vulnerability severity)
     * @param Stage Stage name (for example: threat activity level, exploitability, vulnerability severity)
     */
    public void setStage(String Stage) {
        this.Stage = Stage;
    }

    /**
     * Get Rating result of this stage 
     * @return Result Rating result of this stage
     */
    public String getResult() {
        return this.Result;
    }

    /**
     * Set Rating result of this stage
     * @param Result Rating result of this stage
     */
    public void setResult(String Result) {
        this.Result = Result;
    }

    public VPRRatingStage() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VPRRatingStage(VPRRatingStage source) {
        if (source.Stage != null) {
            this.Stage = new String(source.Stage);
        }
        if (source.Result != null) {
            this.Result = new String(source.Result);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Stage", this.Stage);
        this.setParamSimple(map, prefix + "Result", this.Result);

    }
}

