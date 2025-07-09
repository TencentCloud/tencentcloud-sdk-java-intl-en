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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VersionWhiteConfig extends AbstractModel {

    /**
    * Number of days before expiration
    */
    @SerializedName("Deadline")
    @Expose
    private Long Deadline;

    /**
    * Number of authorizations
    */
    @SerializedName("LicenseNum")
    @Expose
    private Long LicenseNum;

    /**
    * Whether application can be made
    */
    @SerializedName("IsApplyFor")
    @Expose
    private Boolean IsApplyFor;

    /**
    * Type
    */
    @SerializedName("SourceType")
    @Expose
    private Long SourceType;

    /**
     * Get Number of days before expiration 
     * @return Deadline Number of days before expiration
     */
    public Long getDeadline() {
        return this.Deadline;
    }

    /**
     * Set Number of days before expiration
     * @param Deadline Number of days before expiration
     */
    public void setDeadline(Long Deadline) {
        this.Deadline = Deadline;
    }

    /**
     * Get Number of authorizations 
     * @return LicenseNum Number of authorizations
     */
    public Long getLicenseNum() {
        return this.LicenseNum;
    }

    /**
     * Set Number of authorizations
     * @param LicenseNum Number of authorizations
     */
    public void setLicenseNum(Long LicenseNum) {
        this.LicenseNum = LicenseNum;
    }

    /**
     * Get Whether application can be made 
     * @return IsApplyFor Whether application can be made
     */
    public Boolean getIsApplyFor() {
        return this.IsApplyFor;
    }

    /**
     * Set Whether application can be made
     * @param IsApplyFor Whether application can be made
     */
    public void setIsApplyFor(Boolean IsApplyFor) {
        this.IsApplyFor = IsApplyFor;
    }

    /**
     * Get Type 
     * @return SourceType Type
     */
    public Long getSourceType() {
        return this.SourceType;
    }

    /**
     * Set Type
     * @param SourceType Type
     */
    public void setSourceType(Long SourceType) {
        this.SourceType = SourceType;
    }

    public VersionWhiteConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VersionWhiteConfig(VersionWhiteConfig source) {
        if (source.Deadline != null) {
            this.Deadline = new Long(source.Deadline);
        }
        if (source.LicenseNum != null) {
            this.LicenseNum = new Long(source.LicenseNum);
        }
        if (source.IsApplyFor != null) {
            this.IsApplyFor = new Boolean(source.IsApplyFor);
        }
        if (source.SourceType != null) {
            this.SourceType = new Long(source.SourceType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Deadline", this.Deadline);
        this.setParamSimple(map, prefix + "LicenseNum", this.LicenseNum);
        this.setParamSimple(map, prefix + "IsApplyFor", this.IsApplyFor);
        this.setParamSimple(map, prefix + "SourceType", this.SourceType);

    }
}

