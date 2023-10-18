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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AlgDetectJS extends AbstractModel {

    /**
    * Method to validate client behavior.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Proof-of-work strength. Values:
<li>`low` (default): Low</li>
<li>`middle`: Medium</li>
<li>`high`: High</li>
    */
    @SerializedName("WorkLevel")
    @Expose
    private String WorkLevel;

    /**
    * Implement a delay before executing JS in milliseconds. Value range: 0-1000. Default value: 500.
    */
    @SerializedName("ExecuteMode")
    @Expose
    private Long ExecuteMode;

    /**
    * The period threshold for validating the result "Client JS disabled" in seconds. Value range: 5-3600. Default value: 10.
    */
    @SerializedName("InvalidStatTime")
    @Expose
    private Long InvalidStatTime;

    /**
    * The number of times for the result "Client JS disabled" occurred in the specified period. Value range: 1-100000000. Default value: 30.
    */
    @SerializedName("InvalidThreshold")
    @Expose
    private Long InvalidThreshold;

    /**
    * Client behavior validation results.
    */
    @SerializedName("AlgDetectResults")
    @Expose
    private AlgDetectResult [] AlgDetectResults;

    /**
     * Get Method to validate client behavior. 
     * @return Name Method to validate client behavior.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Method to validate client behavior.
     * @param Name Method to validate client behavior.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Proof-of-work strength. Values:
<li>`low` (default): Low</li>
<li>`middle`: Medium</li>
<li>`high`: High</li> 
     * @return WorkLevel Proof-of-work strength. Values:
<li>`low` (default): Low</li>
<li>`middle`: Medium</li>
<li>`high`: High</li>
     */
    public String getWorkLevel() {
        return this.WorkLevel;
    }

    /**
     * Set Proof-of-work strength. Values:
<li>`low` (default): Low</li>
<li>`middle`: Medium</li>
<li>`high`: High</li>
     * @param WorkLevel Proof-of-work strength. Values:
<li>`low` (default): Low</li>
<li>`middle`: Medium</li>
<li>`high`: High</li>
     */
    public void setWorkLevel(String WorkLevel) {
        this.WorkLevel = WorkLevel;
    }

    /**
     * Get Implement a delay before executing JS in milliseconds. Value range: 0-1000. Default value: 500. 
     * @return ExecuteMode Implement a delay before executing JS in milliseconds. Value range: 0-1000. Default value: 500.
     */
    public Long getExecuteMode() {
        return this.ExecuteMode;
    }

    /**
     * Set Implement a delay before executing JS in milliseconds. Value range: 0-1000. Default value: 500.
     * @param ExecuteMode Implement a delay before executing JS in milliseconds. Value range: 0-1000. Default value: 500.
     */
    public void setExecuteMode(Long ExecuteMode) {
        this.ExecuteMode = ExecuteMode;
    }

    /**
     * Get The period threshold for validating the result "Client JS disabled" in seconds. Value range: 5-3600. Default value: 10. 
     * @return InvalidStatTime The period threshold for validating the result "Client JS disabled" in seconds. Value range: 5-3600. Default value: 10.
     */
    public Long getInvalidStatTime() {
        return this.InvalidStatTime;
    }

    /**
     * Set The period threshold for validating the result "Client JS disabled" in seconds. Value range: 5-3600. Default value: 10.
     * @param InvalidStatTime The period threshold for validating the result "Client JS disabled" in seconds. Value range: 5-3600. Default value: 10.
     */
    public void setInvalidStatTime(Long InvalidStatTime) {
        this.InvalidStatTime = InvalidStatTime;
    }

    /**
     * Get The number of times for the result "Client JS disabled" occurred in the specified period. Value range: 1-100000000. Default value: 30. 
     * @return InvalidThreshold The number of times for the result "Client JS disabled" occurred in the specified period. Value range: 1-100000000. Default value: 30.
     */
    public Long getInvalidThreshold() {
        return this.InvalidThreshold;
    }

    /**
     * Set The number of times for the result "Client JS disabled" occurred in the specified period. Value range: 1-100000000. Default value: 30.
     * @param InvalidThreshold The number of times for the result "Client JS disabled" occurred in the specified period. Value range: 1-100000000. Default value: 30.
     */
    public void setInvalidThreshold(Long InvalidThreshold) {
        this.InvalidThreshold = InvalidThreshold;
    }

    /**
     * Get Client behavior validation results. 
     * @return AlgDetectResults Client behavior validation results.
     */
    public AlgDetectResult [] getAlgDetectResults() {
        return this.AlgDetectResults;
    }

    /**
     * Set Client behavior validation results.
     * @param AlgDetectResults Client behavior validation results.
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

