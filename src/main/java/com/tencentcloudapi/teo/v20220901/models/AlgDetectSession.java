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
    * Operation name.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Verification method. Default value: update_detect. Valid values:
<li>detect: verify;</li>
<li>update_detect: refresh the Cookie and validate it.</li>
    */
    @SerializedName("DetectMode")
    @Expose
    private String DetectMode;

    /**
    * Switch for session rate and periodic feature verification. Default value: off. Valid values:
<li>off: Disable;</li>
<li>`on`: Enable.</li>
    */
    @SerializedName("SessionAnalyzeSwitch")
    @Expose
    private String SessionAnalyzeSwitch;

    /**
    * Statistical cycle for the check result indicating no Cookie is carried or the Cookie has expired. Unit: seconds. Default: 10. Value range: 5–3600.
    */
    @SerializedName("InvalidStatTime")
    @Expose
    private Long InvalidStatTime;

    /**
    * Trigger threshold for the check result indicating no Cookie is carried or the Cookie has expired. Unit: count. Default: 300. Value range: 1–100000000.
    */
    @SerializedName("InvalidThreshold")
    @Expose
    private Long InvalidThreshold;

    /**
    * Cookie verification result.
    */
    @SerializedName("AlgDetectResults")
    @Expose
    private AlgDetectResult [] AlgDetectResults;

    /**
    * Session rate and periodic feature verification result.
    */
    @SerializedName("SessionBehaviors")
    @Expose
    private AlgDetectResult [] SessionBehaviors;

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
     * Get Verification method. Default value: update_detect. Valid values:
<li>detect: verify;</li>
<li>update_detect: refresh the Cookie and validate it.</li> 
     * @return DetectMode Verification method. Default value: update_detect. Valid values:
<li>detect: verify;</li>
<li>update_detect: refresh the Cookie and validate it.</li>
     */
    public String getDetectMode() {
        return this.DetectMode;
    }

    /**
     * Set Verification method. Default value: update_detect. Valid values:
<li>detect: verify;</li>
<li>update_detect: refresh the Cookie and validate it.</li>
     * @param DetectMode Verification method. Default value: update_detect. Valid values:
<li>detect: verify;</li>
<li>update_detect: refresh the Cookie and validate it.</li>
     */
    public void setDetectMode(String DetectMode) {
        this.DetectMode = DetectMode;
    }

    /**
     * Get Switch for session rate and periodic feature verification. Default value: off. Valid values:
<li>off: Disable;</li>
<li>`on`: Enable.</li> 
     * @return SessionAnalyzeSwitch Switch for session rate and periodic feature verification. Default value: off. Valid values:
<li>off: Disable;</li>
<li>`on`: Enable.</li>
     */
    public String getSessionAnalyzeSwitch() {
        return this.SessionAnalyzeSwitch;
    }

    /**
     * Set Switch for session rate and periodic feature verification. Default value: off. Valid values:
<li>off: Disable;</li>
<li>`on`: Enable.</li>
     * @param SessionAnalyzeSwitch Switch for session rate and periodic feature verification. Default value: off. Valid values:
<li>off: Disable;</li>
<li>`on`: Enable.</li>
     */
    public void setSessionAnalyzeSwitch(String SessionAnalyzeSwitch) {
        this.SessionAnalyzeSwitch = SessionAnalyzeSwitch;
    }

    /**
     * Get Statistical cycle for the check result indicating no Cookie is carried or the Cookie has expired. Unit: seconds. Default: 10. Value range: 5–3600. 
     * @return InvalidStatTime Statistical cycle for the check result indicating no Cookie is carried or the Cookie has expired. Unit: seconds. Default: 10. Value range: 5–3600.
     */
    public Long getInvalidStatTime() {
        return this.InvalidStatTime;
    }

    /**
     * Set Statistical cycle for the check result indicating no Cookie is carried or the Cookie has expired. Unit: seconds. Default: 10. Value range: 5–3600.
     * @param InvalidStatTime Statistical cycle for the check result indicating no Cookie is carried or the Cookie has expired. Unit: seconds. Default: 10. Value range: 5–3600.
     */
    public void setInvalidStatTime(Long InvalidStatTime) {
        this.InvalidStatTime = InvalidStatTime;
    }

    /**
     * Get Trigger threshold for the check result indicating no Cookie is carried or the Cookie has expired. Unit: count. Default: 300. Value range: 1–100000000. 
     * @return InvalidThreshold Trigger threshold for the check result indicating no Cookie is carried or the Cookie has expired. Unit: count. Default: 300. Value range: 1–100000000.
     */
    public Long getInvalidThreshold() {
        return this.InvalidThreshold;
    }

    /**
     * Set Trigger threshold for the check result indicating no Cookie is carried or the Cookie has expired. Unit: count. Default: 300. Value range: 1–100000000.
     * @param InvalidThreshold Trigger threshold for the check result indicating no Cookie is carried or the Cookie has expired. Unit: count. Default: 300. Value range: 1–100000000.
     */
    public void setInvalidThreshold(Long InvalidThreshold) {
        this.InvalidThreshold = InvalidThreshold;
    }

    /**
     * Get Cookie verification result. 
     * @return AlgDetectResults Cookie verification result.
     */
    public AlgDetectResult [] getAlgDetectResults() {
        return this.AlgDetectResults;
    }

    /**
     * Set Cookie verification result.
     * @param AlgDetectResults Cookie verification result.
     */
    public void setAlgDetectResults(AlgDetectResult [] AlgDetectResults) {
        this.AlgDetectResults = AlgDetectResults;
    }

    /**
     * Get Session rate and periodic feature verification result. 
     * @return SessionBehaviors Session rate and periodic feature verification result.
     */
    public AlgDetectResult [] getSessionBehaviors() {
        return this.SessionBehaviors;
    }

    /**
     * Set Session rate and periodic feature verification result.
     * @param SessionBehaviors Session rate and periodic feature verification result.
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

