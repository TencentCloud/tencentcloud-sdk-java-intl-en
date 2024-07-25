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
package com.tencentcloudapi.omics.v20221128.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RunOption extends AbstractModel {

    /**
    * Operation failure mode. Valid values:
- ContinueWhilePossible
- NoNewCalls
    */
    @SerializedName("FailureMode")
    @Expose
    private String FailureMode;

    /**
    * Whether to use the Call-Caching feature.
    */
    @SerializedName("UseCallCache")
    @Expose
    private Boolean UseCallCache;

    /**
    * Whether to use the error suspension feature.
    */
    @SerializedName("UseErrorOnHold")
    @Expose
    private Boolean UseErrorOnHold;

    /**
    * Output archive COS path
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("FinalWorkflowOutputsDir")
    @Expose
    private String FinalWorkflowOutputsDir;

    /**
    * Whether to use the relative directory archive output.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UseRelativeOutputPaths")
    @Expose
    private Boolean UseRelativeOutputPaths;

    /**
     * Get Operation failure mode. Valid values:
- ContinueWhilePossible
- NoNewCalls 
     * @return FailureMode Operation failure mode. Valid values:
- ContinueWhilePossible
- NoNewCalls
     */
    public String getFailureMode() {
        return this.FailureMode;
    }

    /**
     * Set Operation failure mode. Valid values:
- ContinueWhilePossible
- NoNewCalls
     * @param FailureMode Operation failure mode. Valid values:
- ContinueWhilePossible
- NoNewCalls
     */
    public void setFailureMode(String FailureMode) {
        this.FailureMode = FailureMode;
    }

    /**
     * Get Whether to use the Call-Caching feature. 
     * @return UseCallCache Whether to use the Call-Caching feature.
     */
    public Boolean getUseCallCache() {
        return this.UseCallCache;
    }

    /**
     * Set Whether to use the Call-Caching feature.
     * @param UseCallCache Whether to use the Call-Caching feature.
     */
    public void setUseCallCache(Boolean UseCallCache) {
        this.UseCallCache = UseCallCache;
    }

    /**
     * Get Whether to use the error suspension feature. 
     * @return UseErrorOnHold Whether to use the error suspension feature.
     */
    public Boolean getUseErrorOnHold() {
        return this.UseErrorOnHold;
    }

    /**
     * Set Whether to use the error suspension feature.
     * @param UseErrorOnHold Whether to use the error suspension feature.
     */
    public void setUseErrorOnHold(Boolean UseErrorOnHold) {
        this.UseErrorOnHold = UseErrorOnHold;
    }

    /**
     * Get Output archive COS path
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return FinalWorkflowOutputsDir Output archive COS path
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getFinalWorkflowOutputsDir() {
        return this.FinalWorkflowOutputsDir;
    }

    /**
     * Set Output archive COS path
Note: This field may return null, indicating that no valid values can be obtained.
     * @param FinalWorkflowOutputsDir Output archive COS path
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setFinalWorkflowOutputsDir(String FinalWorkflowOutputsDir) {
        this.FinalWorkflowOutputsDir = FinalWorkflowOutputsDir;
    }

    /**
     * Get Whether to use the relative directory archive output.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return UseRelativeOutputPaths Whether to use the relative directory archive output.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getUseRelativeOutputPaths() {
        return this.UseRelativeOutputPaths;
    }

    /**
     * Set Whether to use the relative directory archive output.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param UseRelativeOutputPaths Whether to use the relative directory archive output.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUseRelativeOutputPaths(Boolean UseRelativeOutputPaths) {
        this.UseRelativeOutputPaths = UseRelativeOutputPaths;
    }

    public RunOption() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RunOption(RunOption source) {
        if (source.FailureMode != null) {
            this.FailureMode = new String(source.FailureMode);
        }
        if (source.UseCallCache != null) {
            this.UseCallCache = new Boolean(source.UseCallCache);
        }
        if (source.UseErrorOnHold != null) {
            this.UseErrorOnHold = new Boolean(source.UseErrorOnHold);
        }
        if (source.FinalWorkflowOutputsDir != null) {
            this.FinalWorkflowOutputsDir = new String(source.FinalWorkflowOutputsDir);
        }
        if (source.UseRelativeOutputPaths != null) {
            this.UseRelativeOutputPaths = new Boolean(source.UseRelativeOutputPaths);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FailureMode", this.FailureMode);
        this.setParamSimple(map, prefix + "UseCallCache", this.UseCallCache);
        this.setParamSimple(map, prefix + "UseErrorOnHold", this.UseErrorOnHold);
        this.setParamSimple(map, prefix + "FinalWorkflowOutputsDir", this.FinalWorkflowOutputsDir);
        this.setParamSimple(map, prefix + "UseRelativeOutputPaths", this.UseRelativeOutputPaths);

    }
}

