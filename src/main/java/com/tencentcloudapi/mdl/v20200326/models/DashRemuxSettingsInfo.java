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
package com.tencentcloudapi.mdl.v20200326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DashRemuxSettingsInfo extends AbstractModel {

    /**
    * Segment duration in ms. Value range: [1000,30000]. Default value: 4000. The value can only be a multiple of 1,000.
    */
    @SerializedName("SegmentDuration")
    @Expose
    private Long SegmentDuration;

    /**
    * Number of segments. Value range: [1,30]. Default value: 5.
    */
    @SerializedName("SegmentNumber")
    @Expose
    private Long SegmentNumber;

    /**
    * Whether to enable multi-period. Valid values: CLOSE/OPEN. Default value: CLOSE.
    */
    @SerializedName("PeriodTriggers")
    @Expose
    private String PeriodTriggers;

    /**
    * The HLS package type when the H.265 codec is used. Valid values: `hvc1`, `hev1` (default).
    */
    @SerializedName("H265PackageType")
    @Expose
    private String H265PackageType;

    /**
     * Get Segment duration in ms. Value range: [1000,30000]. Default value: 4000. The value can only be a multiple of 1,000. 
     * @return SegmentDuration Segment duration in ms. Value range: [1000,30000]. Default value: 4000. The value can only be a multiple of 1,000.
     */
    public Long getSegmentDuration() {
        return this.SegmentDuration;
    }

    /**
     * Set Segment duration in ms. Value range: [1000,30000]. Default value: 4000. The value can only be a multiple of 1,000.
     * @param SegmentDuration Segment duration in ms. Value range: [1000,30000]. Default value: 4000. The value can only be a multiple of 1,000.
     */
    public void setSegmentDuration(Long SegmentDuration) {
        this.SegmentDuration = SegmentDuration;
    }

    /**
     * Get Number of segments. Value range: [1,30]. Default value: 5. 
     * @return SegmentNumber Number of segments. Value range: [1,30]. Default value: 5.
     */
    public Long getSegmentNumber() {
        return this.SegmentNumber;
    }

    /**
     * Set Number of segments. Value range: [1,30]. Default value: 5.
     * @param SegmentNumber Number of segments. Value range: [1,30]. Default value: 5.
     */
    public void setSegmentNumber(Long SegmentNumber) {
        this.SegmentNumber = SegmentNumber;
    }

    /**
     * Get Whether to enable multi-period. Valid values: CLOSE/OPEN. Default value: CLOSE. 
     * @return PeriodTriggers Whether to enable multi-period. Valid values: CLOSE/OPEN. Default value: CLOSE.
     */
    public String getPeriodTriggers() {
        return this.PeriodTriggers;
    }

    /**
     * Set Whether to enable multi-period. Valid values: CLOSE/OPEN. Default value: CLOSE.
     * @param PeriodTriggers Whether to enable multi-period. Valid values: CLOSE/OPEN. Default value: CLOSE.
     */
    public void setPeriodTriggers(String PeriodTriggers) {
        this.PeriodTriggers = PeriodTriggers;
    }

    /**
     * Get The HLS package type when the H.265 codec is used. Valid values: `hvc1`, `hev1` (default). 
     * @return H265PackageType The HLS package type when the H.265 codec is used. Valid values: `hvc1`, `hev1` (default).
     */
    public String getH265PackageType() {
        return this.H265PackageType;
    }

    /**
     * Set The HLS package type when the H.265 codec is used. Valid values: `hvc1`, `hev1` (default).
     * @param H265PackageType The HLS package type when the H.265 codec is used. Valid values: `hvc1`, `hev1` (default).
     */
    public void setH265PackageType(String H265PackageType) {
        this.H265PackageType = H265PackageType;
    }

    public DashRemuxSettingsInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DashRemuxSettingsInfo(DashRemuxSettingsInfo source) {
        if (source.SegmentDuration != null) {
            this.SegmentDuration = new Long(source.SegmentDuration);
        }
        if (source.SegmentNumber != null) {
            this.SegmentNumber = new Long(source.SegmentNumber);
        }
        if (source.PeriodTriggers != null) {
            this.PeriodTriggers = new String(source.PeriodTriggers);
        }
        if (source.H265PackageType != null) {
            this.H265PackageType = new String(source.H265PackageType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SegmentDuration", this.SegmentDuration);
        this.setParamSimple(map, prefix + "SegmentNumber", this.SegmentNumber);
        this.setParamSimple(map, prefix + "PeriodTriggers", this.PeriodTriggers);
        this.setParamSimple(map, prefix + "H265PackageType", this.H265PackageType);

    }
}

