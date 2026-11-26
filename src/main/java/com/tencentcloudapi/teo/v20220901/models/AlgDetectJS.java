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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AlgDetectJS extends AbstractModel {

    /**
    * Operation name.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Proof of Work (proof_Of-Work) verification strength. Default value: low. Valid values:
<li>low: low;</li>
<li>middle: Medium;</li>
<li>high: high.</li>
    */
    @SerializedName("WorkLevel")
    @Expose
    private String WorkLevel;

    /**
    * Execution mode. The time when js delay execution is triggered. Unit: ms. Default value: 500. Value range: 0–1000.
    */
    @SerializedName("ExecuteMode")
    @Expose
    private Long ExecuteMode;

    /**
    * Statistical cycle for clients that do not have JS enabled (test not completed). Unit: seconds. Default: 10. Value range: 5–3600.
    */
    @SerializedName("InvalidStatTime")
    @Expose
    private Long InvalidStatTime;

    /**
    * Client JS not enabled (test not completed) trigger threshold. Count. Default: 300. Value: 1–100000000.
    */
    @SerializedName("InvalidThreshold")
    @Expose
    private Long InvalidThreshold;

    /**
    * Bot proactive feature recognition client behavior validation result.
    */
    @SerializedName("AlgDetectResults")
    @Expose
    private AlgDetectResult [] AlgDetectResults;

    /**
     * Get Operation name. 
     * @return Name Operation name.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Operation name.
     * @param Name Operation name.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Proof of Work (proof_Of-Work) verification strength. Default value: low. Valid values:
<li>low: low;</li>
<li>middle: Medium;</li>
<li>high: high.</li> 
     * @return WorkLevel Proof of Work (proof_Of-Work) verification strength. Default value: low. Valid values:
<li>low: low;</li>
<li>middle: Medium;</li>
<li>high: high.</li>
     */
    public String getWorkLevel() {
        return this.WorkLevel;
    }

    /**
     * Set Proof of Work (proof_Of-Work) verification strength. Default value: low. Valid values:
<li>low: low;</li>
<li>middle: Medium;</li>
<li>high: high.</li>
     * @param WorkLevel Proof of Work (proof_Of-Work) verification strength. Default value: low. Valid values:
<li>low: low;</li>
<li>middle: Medium;</li>
<li>high: high.</li>
     */
    public void setWorkLevel(String WorkLevel) {
        this.WorkLevel = WorkLevel;
    }

    /**
     * Get Execution mode. The time when js delay execution is triggered. Unit: ms. Default value: 500. Value range: 0–1000. 
     * @return ExecuteMode Execution mode. The time when js delay execution is triggered. Unit: ms. Default value: 500. Value range: 0–1000.
     */
    public Long getExecuteMode() {
        return this.ExecuteMode;
    }

    /**
     * Set Execution mode. The time when js delay execution is triggered. Unit: ms. Default value: 500. Value range: 0–1000.
     * @param ExecuteMode Execution mode. The time when js delay execution is triggered. Unit: ms. Default value: 500. Value range: 0–1000.
     */
    public void setExecuteMode(Long ExecuteMode) {
        this.ExecuteMode = ExecuteMode;
    }

    /**
     * Get Statistical cycle for clients that do not have JS enabled (test not completed). Unit: seconds. Default: 10. Value range: 5–3600. 
     * @return InvalidStatTime Statistical cycle for clients that do not have JS enabled (test not completed). Unit: seconds. Default: 10. Value range: 5–3600.
     */
    public Long getInvalidStatTime() {
        return this.InvalidStatTime;
    }

    /**
     * Set Statistical cycle for clients that do not have JS enabled (test not completed). Unit: seconds. Default: 10. Value range: 5–3600.
     * @param InvalidStatTime Statistical cycle for clients that do not have JS enabled (test not completed). Unit: seconds. Default: 10. Value range: 5–3600.
     */
    public void setInvalidStatTime(Long InvalidStatTime) {
        this.InvalidStatTime = InvalidStatTime;
    }

    /**
     * Get Client JS not enabled (test not completed) trigger threshold. Count. Default: 300. Value: 1–100000000. 
     * @return InvalidThreshold Client JS not enabled (test not completed) trigger threshold. Count. Default: 300. Value: 1–100000000.
     */
    public Long getInvalidThreshold() {
        return this.InvalidThreshold;
    }

    /**
     * Set Client JS not enabled (test not completed) trigger threshold. Count. Default: 300. Value: 1–100000000.
     * @param InvalidThreshold Client JS not enabled (test not completed) trigger threshold. Count. Default: 300. Value: 1–100000000.
     */
    public void setInvalidThreshold(Long InvalidThreshold) {
        this.InvalidThreshold = InvalidThreshold;
    }

    /**
     * Get Bot proactive feature recognition client behavior validation result. 
     * @return AlgDetectResults Bot proactive feature recognition client behavior validation result.
     */
    public AlgDetectResult [] getAlgDetectResults() {
        return this.AlgDetectResults;
    }

    /**
     * Set Bot proactive feature recognition client behavior validation result.
     * @param AlgDetectResults Bot proactive feature recognition client behavior validation result.
     */
    public void setAlgDetectResults(AlgDetectResult [] AlgDetectResults) {
        this.AlgDetectResults = AlgDetectResults;
    }

    public AlgDetectJS() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AlgDetectJS(AlgDetectJS source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.WorkLevel != null) {
            this.WorkLevel = new String(source.WorkLevel);
        }
        if (source.ExecuteMode != null) {
            this.ExecuteMode = new Long(source.ExecuteMode);
        }
        if (source.InvalidStatTime != null) {
            this.InvalidStatTime = new Long(source.InvalidStatTime);
        }
        if (source.InvalidThreshold != null) {
            this.InvalidThreshold = new Long(source.InvalidThreshold);
        }
        if (source.AlgDetectResults != null) {
            this.AlgDetectResults = new AlgDetectResult[source.AlgDetectResults.length];
            for (int i = 0; i < source.AlgDetectResults.length; i++) {
                this.AlgDetectResults[i] = new AlgDetectResult(source.AlgDetectResults[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "WorkLevel", this.WorkLevel);
        this.setParamSimple(map, prefix + "ExecuteMode", this.ExecuteMode);
        this.setParamSimple(map, prefix + "InvalidStatTime", this.InvalidStatTime);
        this.setParamSimple(map, prefix + "InvalidThreshold", this.InvalidThreshold);
        this.setParamArrayObj(map, prefix + "AlgDetectResults.", this.AlgDetectResults);

    }
}

