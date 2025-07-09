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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class URLNotice extends AbstractModel {

    /**
    * Callback URL, which can contain up to 256 characters
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("URL")
    @Expose
    private String URL;

    /**
    * Whether verification is passed. Valid values: 0 (no), 1 (yes)
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IsValid")
    @Expose
    private Long IsValid;

    /**
    * Verification code
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ValidationCode")
    @Expose
    private String ValidationCode;

    /**
    * Start time of the notification in seconds, which is calculated from 00:00:00.
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * End time of the notification in seconds, which is calculated from 00:00:00.
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * Notification cycle. The values 1-7 indicate Monday to Sunday.
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("Weekday")
    @Expose
    private Long [] Weekday;

    /**
     * Get Callback URL, which can contain up to 256 characters
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return URL Callback URL, which can contain up to 256 characters
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getURL() {
        return this.URL;
    }

    /**
     * Set Callback URL, which can contain up to 256 characters
Note: this field may return null, indicating that no valid values can be obtained.
     * @param URL Callback URL, which can contain up to 256 characters
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setURL(String URL) {
        this.URL = URL;
    }

    /**
     * Get Whether verification is passed. Valid values: 0 (no), 1 (yes)
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return IsValid Whether verification is passed. Valid values: 0 (no), 1 (yes)
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getIsValid() {
        return this.IsValid;
    }

    /**
     * Set Whether verification is passed. Valid values: 0 (no), 1 (yes)
Note: this field may return null, indicating that no valid values can be obtained.
     * @param IsValid Whether verification is passed. Valid values: 0 (no), 1 (yes)
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setIsValid(Long IsValid) {
        this.IsValid = IsValid;
    }

    /**
     * Get Verification code
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ValidationCode Verification code
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getValidationCode() {
        return this.ValidationCode;
    }

    /**
     * Set Verification code
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ValidationCode Verification code
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setValidationCode(String ValidationCode) {
        this.ValidationCode = ValidationCode;
    }

    /**
     * Get Start time of the notification in seconds, which is calculated from 00:00:00.
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return StartTime Start time of the notification in seconds, which is calculated from 00:00:00.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Start time of the notification in seconds, which is calculated from 00:00:00.
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param StartTime Start time of the notification in seconds, which is calculated from 00:00:00.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get End time of the notification in seconds, which is calculated from 00:00:00.
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return EndTime End time of the notification in seconds, which is calculated from 00:00:00.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End time of the notification in seconds, which is calculated from 00:00:00.
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param EndTime End time of the notification in seconds, which is calculated from 00:00:00.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Notification cycle. The values 1-7 indicate Monday to Sunday.
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return Weekday Notification cycle. The values 1-7 indicate Monday to Sunday.
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public Long [] getWeekday() {
        return this.Weekday;
    }

    /**
     * Set Notification cycle. The values 1-7 indicate Monday to Sunday.
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param Weekday Notification cycle. The values 1-7 indicate Monday to Sunday.
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setWeekday(Long [] Weekday) {
        this.Weekday = Weekday;
    }

    public URLNotice() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public URLNotice(URLNotice source) {
        if (source.URL != null) {
            this.URL = new String(source.URL);
        }
        if (source.IsValid != null) {
            this.IsValid = new Long(source.IsValid);
        }
        if (source.ValidationCode != null) {
            this.ValidationCode = new String(source.ValidationCode);
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.Weekday != null) {
            this.Weekday = new Long[source.Weekday.length];
            for (int i = 0; i < source.Weekday.length; i++) {
                this.Weekday[i] = new Long(source.Weekday[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "URL", this.URL);
        this.setParamSimple(map, prefix + "IsValid", this.IsValid);
        this.setParamSimple(map, prefix + "ValidationCode", this.ValidationCode);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamArraySimple(map, prefix + "Weekday.", this.Weekday);

    }
}

