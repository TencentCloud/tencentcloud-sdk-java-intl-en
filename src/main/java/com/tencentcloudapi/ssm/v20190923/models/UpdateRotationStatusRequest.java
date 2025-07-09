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
package com.tencentcloudapi.ssm.v20190923.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateRotationStatusRequest extends AbstractModel {

    /**
    * Tencent Cloud service credential name.
    */
    @SerializedName("SecretName")
    @Expose
    private String SecretName;

    /**
    * Specifies whether to enable rotation.
`true`: enables rotation.
`false`: disables rotation.
    */
    @SerializedName("EnableRotation")
    @Expose
    private Boolean EnableRotation;

    /**
    * Rotation frequency in days. Value range: 30–365.
    */
    @SerializedName("Frequency")
    @Expose
    private Long Frequency;

    /**
    * User-defined rotation start time in the format of 2006-01-02 15:04:05.
When `EnableRotation` is `true` and `RotationBeginTime` is left empty, the current time will be entered by default.
    */
    @SerializedName("RotationBeginTime")
    @Expose
    private String RotationBeginTime;

    /**
     * Get Tencent Cloud service credential name. 
     * @return SecretName Tencent Cloud service credential name.
     */
    public String getSecretName() {
        return this.SecretName;
    }

    /**
     * Set Tencent Cloud service credential name.
     * @param SecretName Tencent Cloud service credential name.
     */
    public void setSecretName(String SecretName) {
        this.SecretName = SecretName;
    }

    /**
     * Get Specifies whether to enable rotation.
`true`: enables rotation.
`false`: disables rotation. 
     * @return EnableRotation Specifies whether to enable rotation.
`true`: enables rotation.
`false`: disables rotation.
     */
    public Boolean getEnableRotation() {
        return this.EnableRotation;
    }

    /**
     * Set Specifies whether to enable rotation.
`true`: enables rotation.
`false`: disables rotation.
     * @param EnableRotation Specifies whether to enable rotation.
`true`: enables rotation.
`false`: disables rotation.
     */
    public void setEnableRotation(Boolean EnableRotation) {
        this.EnableRotation = EnableRotation;
    }

    /**
     * Get Rotation frequency in days. Value range: 30–365. 
     * @return Frequency Rotation frequency in days. Value range: 30–365.
     */
    public Long getFrequency() {
        return this.Frequency;
    }

    /**
     * Set Rotation frequency in days. Value range: 30–365.
     * @param Frequency Rotation frequency in days. Value range: 30–365.
     */
    public void setFrequency(Long Frequency) {
        this.Frequency = Frequency;
    }

    /**
     * Get User-defined rotation start time in the format of 2006-01-02 15:04:05.
When `EnableRotation` is `true` and `RotationBeginTime` is left empty, the current time will be entered by default. 
     * @return RotationBeginTime User-defined rotation start time in the format of 2006-01-02 15:04:05.
When `EnableRotation` is `true` and `RotationBeginTime` is left empty, the current time will be entered by default.
     */
    public String getRotationBeginTime() {
        return this.RotationBeginTime;
    }

    /**
     * Set User-defined rotation start time in the format of 2006-01-02 15:04:05.
When `EnableRotation` is `true` and `RotationBeginTime` is left empty, the current time will be entered by default.
     * @param RotationBeginTime User-defined rotation start time in the format of 2006-01-02 15:04:05.
When `EnableRotation` is `true` and `RotationBeginTime` is left empty, the current time will be entered by default.
     */
    public void setRotationBeginTime(String RotationBeginTime) {
        this.RotationBeginTime = RotationBeginTime;
    }

    public UpdateRotationStatusRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateRotationStatusRequest(UpdateRotationStatusRequest source) {
        if (source.SecretName != null) {
            this.SecretName = new String(source.SecretName);
        }
        if (source.EnableRotation != null) {
            this.EnableRotation = new Boolean(source.EnableRotation);
        }
        if (source.Frequency != null) {
            this.Frequency = new Long(source.Frequency);
        }
        if (source.RotationBeginTime != null) {
            this.RotationBeginTime = new String(source.RotationBeginTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SecretName", this.SecretName);
        this.setParamSimple(map, prefix + "EnableRotation", this.EnableRotation);
        this.setParamSimple(map, prefix + "Frequency", this.Frequency);
        this.setParamSimple(map, prefix + "RotationBeginTime", this.RotationBeginTime);

    }
}

