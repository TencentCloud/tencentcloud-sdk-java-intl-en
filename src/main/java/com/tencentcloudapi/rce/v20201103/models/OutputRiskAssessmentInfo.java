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
package com.tencentcloudapi.rce.v20201103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OutputRiskAssessmentInfo extends AbstractModel {

    /**
    * Risk value.
Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("RiskLevel")
    @Expose
    private String RiskLevel;

    /**
    * Risk type.
Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("RiskType")
    @Expose
    private Long [] RiskType;

    /**
    * Device identification

Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("DeviceId")
    @Expose
    private String DeviceId;

    /**
    * Extended attributes.
Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("ExtraInfo")
    @Expose
    private OutputRiskAssessmentExtraInfoPair [] ExtraInfo;

    /**
    * Token generation timestamp.
Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("TokenTime")
    @Expose
    private String TokenTime;

    /**
     * Get Risk value.
Note: This field may return null, indicating that no valid value is found. 
     * @return RiskLevel Risk value.
Note: This field may return null, indicating that no valid value is found.
     */
    public String getRiskLevel() {
        return this.RiskLevel;
    }

    /**
     * Set Risk value.
Note: This field may return null, indicating that no valid value is found.
     * @param RiskLevel Risk value.
Note: This field may return null, indicating that no valid value is found.
     */
    public void setRiskLevel(String RiskLevel) {
        this.RiskLevel = RiskLevel;
    }

    /**
     * Get Risk type.
Note: This field may return null, indicating that no valid value is found. 
     * @return RiskType Risk type.
Note: This field may return null, indicating that no valid value is found.
     */
    public Long [] getRiskType() {
        return this.RiskType;
    }

    /**
     * Set Risk type.
Note: This field may return null, indicating that no valid value is found.
     * @param RiskType Risk type.
Note: This field may return null, indicating that no valid value is found.
     */
    public void setRiskType(Long [] RiskType) {
        this.RiskType = RiskType;
    }

    /**
     * Get Device identification

Note: This field may return null, indicating that no valid value is found. 
     * @return DeviceId Device identification

Note: This field may return null, indicating that no valid value is found.
     */
    public String getDeviceId() {
        return this.DeviceId;
    }

    /**
     * Set Device identification

Note: This field may return null, indicating that no valid value is found.
     * @param DeviceId Device identification

Note: This field may return null, indicating that no valid value is found.
     */
    public void setDeviceId(String DeviceId) {
        this.DeviceId = DeviceId;
    }

    /**
     * Get Extended attributes.
Note: This field may return null, indicating that no valid value is found. 
     * @return ExtraInfo Extended attributes.
Note: This field may return null, indicating that no valid value is found.
     */
    public OutputRiskAssessmentExtraInfoPair [] getExtraInfo() {
        return this.ExtraInfo;
    }

    /**
     * Set Extended attributes.
Note: This field may return null, indicating that no valid value is found.
     * @param ExtraInfo Extended attributes.
Note: This field may return null, indicating that no valid value is found.
     */
    public void setExtraInfo(OutputRiskAssessmentExtraInfoPair [] ExtraInfo) {
        this.ExtraInfo = ExtraInfo;
    }

    /**
     * Get Token generation timestamp.
Note: This field may return null, indicating that no valid value is found. 
     * @return TokenTime Token generation timestamp.
Note: This field may return null, indicating that no valid value is found.
     */
    public String getTokenTime() {
        return this.TokenTime;
    }

    /**
     * Set Token generation timestamp.
Note: This field may return null, indicating that no valid value is found.
     * @param TokenTime Token generation timestamp.
Note: This field may return null, indicating that no valid value is found.
     */
    public void setTokenTime(String TokenTime) {
        this.TokenTime = TokenTime;
    }

    public OutputRiskAssessmentInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OutputRiskAssessmentInfo(OutputRiskAssessmentInfo source) {
        if (source.RiskLevel != null) {
            this.RiskLevel = new String(source.RiskLevel);
        }
        if (source.RiskType != null) {
            this.RiskType = new Long[source.RiskType.length];
            for (int i = 0; i < source.RiskType.length; i++) {
                this.RiskType[i] = new Long(source.RiskType[i]);
            }
        }
        if (source.DeviceId != null) {
            this.DeviceId = new String(source.DeviceId);
        }
        if (source.ExtraInfo != null) {
            this.ExtraInfo = new OutputRiskAssessmentExtraInfoPair[source.ExtraInfo.length];
            for (int i = 0; i < source.ExtraInfo.length; i++) {
                this.ExtraInfo[i] = new OutputRiskAssessmentExtraInfoPair(source.ExtraInfo[i]);
            }
        }
        if (source.TokenTime != null) {
            this.TokenTime = new String(source.TokenTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RiskLevel", this.RiskLevel);
        this.setParamArraySimple(map, prefix + "RiskType.", this.RiskType);
        this.setParamSimple(map, prefix + "DeviceId", this.DeviceId);
        this.setParamArrayObj(map, prefix + "ExtraInfo.", this.ExtraInfo);
        this.setParamSimple(map, prefix + "TokenTime", this.TokenTime);

    }
}

