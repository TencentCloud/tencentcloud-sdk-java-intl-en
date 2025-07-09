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

public class AlgDetectSession extends AbstractModel {

    /**
    * Method to validate Cookie.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * The validation mode. Values:
<li>`detect`: Validate only</li>
<li>`update_detect` (default): Update Cookie and validate</li>
    */
    @SerializedName("DetectMode")
    @Expose
    private String DetectMode;

    /**
    * Whether to enable Cookie-based session check. The default value is `off`. Values:
<li>`off`: Disable</li>
<li>`on`: Enable</li>
    */
    @SerializedName("SessionAnalyzeSwitch")
    @Expose
    private String SessionAnalyzeSwitch;

    /**
    * The period threshold for validating the result "No Cookie/Cookie expired" in seconds. Value range: 5-3600. Default value: 10.
    */
    @SerializedName("InvalidStatTime")
    @Expose
    private Long InvalidStatTime;

    /**
    * The number of times for the result "No Cookie/Cookie expired" occurred in the specified period. Value range: 1-100000000. Default value: 300.
    */
    @SerializedName("InvalidThreshold")
    @Expose
    private Long InvalidThreshold;

    /**
    * Cookie validation results.
    */
    @SerializedName("AlgDetectResults")
    @Expose
    private AlgDetectResult [] AlgDetectResults;

    /**
    * Cookie-based session check results.
    */
    @SerializedName("SessionBehaviors")
    @Expose
    private AlgDetectResult [] SessionBehaviors;

    /**
     * Get Method to validate Cookie. 
     * @return Name Method to validate Cookie.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Method to validate Cookie.
     * @param Name Method to validate Cookie.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get The validation mode. Values:
<li>`detect`: Validate only</li>
<li>`update_detect` (default): Update Cookie and validate</li> 
     * @return DetectMode The validation mode. Values:
<li>`detect`: Validate only</li>
<li>`update_detect` (default): Update Cookie and validate</li>
     */
    public String getDetectMode() {
        return this.DetectMode;
    }

    /**
     * Set The validation mode. Values:
<li>`detect`: Validate only</li>
<li>`update_detect` (default): Update Cookie and validate</li>
     * @param DetectMode The validation mode. Values:
<li>`detect`: Validate only</li>
<li>`update_detect` (default): Update Cookie and validate</li>
     */
    public void setDetectMode(String DetectMode) {
        this.DetectMode = DetectMode;
    }

    /**
     * Get Whether to enable Cookie-based session check. The default value is `off`. Values:
<li>`off`: Disable</li>
<li>`on`: Enable</li> 
     * @return SessionAnalyzeSwitch Whether to enable Cookie-based session check. The default value is `off`. Values:
<li>`off`: Disable</li>
<li>`on`: Enable</li>
     */
    public String getSessionAnalyzeSwitch() {
        return this.SessionAnalyzeSwitch;
    }

    /**
     * Set Whether to enable Cookie-based session check. The default value is `off`. Values:
<li>`off`: Disable</li>
<li>`on`: Enable</li>
     * @param SessionAnalyzeSwitch Whether to enable Cookie-based session check. The default value is `off`. Values:
<li>`off`: Disable</li>
<li>`on`: Enable</li>
     */
    public void setSessionAnalyzeSwitch(String SessionAnalyzeSwitch) {
        this.SessionAnalyzeSwitch = SessionAnalyzeSwitch;
    }

    /**
     * Get The period threshold for validating the result "No Cookie/Cookie expired" in seconds. Value range: 5-3600. Default value: 10. 
     * @return InvalidStatTime The period threshold for validating the result "No Cookie/Cookie expired" in seconds. Value range: 5-3600. Default value: 10.
     */
    public Long getInvalidStatTime() {
        return this.InvalidStatTime;
    }

    /**
     * Set The period threshold for validating the result "No Cookie/Cookie expired" in seconds. Value range: 5-3600. Default value: 10.
     * @param InvalidStatTime The period threshold for validating the result "No Cookie/Cookie expired" in seconds. Value range: 5-3600. Default value: 10.
     */
    public void setInvalidStatTime(Long InvalidStatTime) {
        this.InvalidStatTime = InvalidStatTime;
    }

    /**
     * Get The number of times for the result "No Cookie/Cookie expired" occurred in the specified period. Value range: 1-100000000. Default value: 300. 
     * @return InvalidThreshold The number of times for the result "No Cookie/Cookie expired" occurred in the specified period. Value range: 1-100000000. Default value: 300.
     */
    public Long getInvalidThreshold() {
        return this.InvalidThreshold;
    }

    /**
     * Set The number of times for the result "No Cookie/Cookie expired" occurred in the specified period. Value range: 1-100000000. Default value: 300.
     * @param InvalidThreshold The number of times for the result "No Cookie/Cookie expired" occurred in the specified period. Value range: 1-100000000. Default value: 300.
     */
    public void setInvalidThreshold(Long InvalidThreshold) {
        this.InvalidThreshold = InvalidThreshold;
    }

    /**
     * Get Cookie validation results. 
     * @return AlgDetectResults Cookie validation results.
     */
    public AlgDetectResult [] getAlgDetectResults() {
        return this.AlgDetectResults;
    }

    /**
     * Set Cookie validation results.
     * @param AlgDetectResults Cookie validation results.
     */
    public void setAlgDetectResults(AlgDetectResult [] AlgDetectResults) {
        this.AlgDetectResults = AlgDetectResults;
    }

    /**
     * Get Cookie-based session check results. 
     * @return SessionBehaviors Cookie-based session check results.
     */
    public AlgDetectResult [] getSessionBehaviors() {
        return this.SessionBehaviors;
    }

    /**
     * Set Cookie-based session check results.
     * @param SessionBehaviors Cookie-based session check results.
     */
    public void setSessionBehaviors(AlgDetectResult [] SessionBehaviors) {
        this.SessionBehaviors = SessionBehaviors;
    }

    public AlgDetectSession() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AlgDetectSession(AlgDetectSession source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.DetectMode != null) {
            this.DetectMode = new String(source.DetectMode);
        }
        if (source.SessionAnalyzeSwitch != null) {
            this.SessionAnalyzeSwitch = new String(source.SessionAnalyzeSwitch);
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
        if (source.SessionBehaviors != null) {
            this.SessionBehaviors = new AlgDetectResult[source.SessionBehaviors.length];
            for (int i = 0; i < source.SessionBehaviors.length; i++) {
                this.SessionBehaviors[i] = new AlgDetectResult(source.SessionBehaviors[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "DetectMode", this.DetectMode);
        this.setParamSimple(map, prefix + "SessionAnalyzeSwitch", this.SessionAnalyzeSwitch);
        this.setParamSimple(map, prefix + "InvalidStatTime", this.InvalidStatTime);
        this.setParamSimple(map, prefix + "InvalidThreshold", this.InvalidThreshold);
        this.setParamArrayObj(map, prefix + "AlgDetectResults.", this.AlgDetectResults);
        this.setParamArrayObj(map, prefix + "SessionBehaviors.", this.SessionBehaviors);

    }
}

