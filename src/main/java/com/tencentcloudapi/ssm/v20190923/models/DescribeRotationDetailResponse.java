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
package com.tencentcloudapi.ssm.v20190923.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRotationDetailResponse extends AbstractModel{

    /**
    * Whether to enable rotation. `true`: enabled; `false`: disabled.
    */
    @SerializedName("EnableRotation")
    @Expose
    private Boolean EnableRotation;

    /**
    * Rotation frequency in days. Default value: 1 day.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Frequency")
    @Expose
    private Long Frequency;

    /**
    * Last rotation time, which is an explicitly visible time string in the format of 2006-01-02 15:04:05.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("LatestRotateTime")
    @Expose
    private String LatestRotateTime;

    /**
    * Next rotation start time, which is an explicitly visible time string in the format of 2006-01-02 15:04:05.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("NextRotateBeginTime")
    @Expose
    private String NextRotateBeginTime;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Whether to enable rotation. `true`: enabled; `false`: disabled. 
     * @return EnableRotation Whether to enable rotation. `true`: enabled; `false`: disabled.
     */
    public Boolean getEnableRotation() {
        return this.EnableRotation;
    }

    /**
     * Set Whether to enable rotation. `true`: enabled; `false`: disabled.
     * @param EnableRotation Whether to enable rotation. `true`: enabled; `false`: disabled.
     */
    public void setEnableRotation(Boolean EnableRotation) {
        this.EnableRotation = EnableRotation;
    }

    /**
     * Get Rotation frequency in days. Default value: 1 day.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Frequency Rotation frequency in days. Default value: 1 day.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getFrequency() {
        return this.Frequency;
    }

    /**
     * Set Rotation frequency in days. Default value: 1 day.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Frequency Rotation frequency in days. Default value: 1 day.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setFrequency(Long Frequency) {
        this.Frequency = Frequency;
    }

    /**
     * Get Last rotation time, which is an explicitly visible time string in the format of 2006-01-02 15:04:05.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return LatestRotateTime Last rotation time, which is an explicitly visible time string in the format of 2006-01-02 15:04:05.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getLatestRotateTime() {
        return this.LatestRotateTime;
    }

    /**
     * Set Last rotation time, which is an explicitly visible time string in the format of 2006-01-02 15:04:05.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param LatestRotateTime Last rotation time, which is an explicitly visible time string in the format of 2006-01-02 15:04:05.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setLatestRotateTime(String LatestRotateTime) {
        this.LatestRotateTime = LatestRotateTime;
    }

    /**
     * Get Next rotation start time, which is an explicitly visible time string in the format of 2006-01-02 15:04:05.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return NextRotateBeginTime Next rotation start time, which is an explicitly visible time string in the format of 2006-01-02 15:04:05.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getNextRotateBeginTime() {
        return this.NextRotateBeginTime;
    }

    /**
     * Set Next rotation start time, which is an explicitly visible time string in the format of 2006-01-02 15:04:05.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param NextRotateBeginTime Next rotation start time, which is an explicitly visible time string in the format of 2006-01-02 15:04:05.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setNextRotateBeginTime(String NextRotateBeginTime) {
        this.NextRotateBeginTime = NextRotateBeginTime;
    }

    /**
     * Get The unique request ID, which is returned for each request. RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     * @param RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeRotationDetailResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRotationDetailResponse(DescribeRotationDetailResponse source) {
        if (source.EnableRotation != null) {
            this.EnableRotation = new Boolean(source.EnableRotation);
        }
        if (source.Frequency != null) {
            this.Frequency = new Long(source.Frequency);
        }
        if (source.LatestRotateTime != null) {
            this.LatestRotateTime = new String(source.LatestRotateTime);
        }
        if (source.NextRotateBeginTime != null) {
            this.NextRotateBeginTime = new String(source.NextRotateBeginTime);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EnableRotation", this.EnableRotation);
        this.setParamSimple(map, prefix + "Frequency", this.Frequency);
        this.setParamSimple(map, prefix + "LatestRotateTime", this.LatestRotateTime);
        this.setParamSimple(map, prefix + "NextRotateBeginTime", this.NextRotateBeginTime);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

