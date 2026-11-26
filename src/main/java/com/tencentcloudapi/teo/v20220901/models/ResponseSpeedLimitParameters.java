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

public class ResponseSpeedLimitParameters extends AbstractModel {

    /**
    * Download speed limit mode. Valid values:
<li>LimitUponDownload: download speed limit for the entire process;</li>
<li>LimitAfterSpecificBytesDownloaded: Start speed limit after downloading specific bytes at full speed;</li>
<li>LimitAfterSpecificSecondsDownloaded: Start rate limiting after downloading at full speed for a specified time.</li>
    */
    @SerializedName("Mode")
    @Expose
    private String Mode;

    /**
    * Rate-limiting value. Specify the rate limit. Fill in a value with a unit or a variable. Currently supported unit: KB/s.
    */
    @SerializedName("MaxSpeed")
    @Expose
    private String MaxSpeed;

    /**
    * Speed limit start value, which can be the download size or specified duration. Fill in a value with a unit or a variable to specify the download size or duration.

-When Mode is LimitAfterSpecificBytesDownloaded, valid values of the unit are: KB;

-When Mode is LimitAfterSpecificSecondsDownloaded, valid values of the measurement unit: s.

    */
    @SerializedName("StartAt")
    @Expose
    private String StartAt;

    /**
     * Get Download speed limit mode. Valid values:
<li>LimitUponDownload: download speed limit for the entire process;</li>
<li>LimitAfterSpecificBytesDownloaded: Start speed limit after downloading specific bytes at full speed;</li>
<li>LimitAfterSpecificSecondsDownloaded: Start rate limiting after downloading at full speed for a specified time.</li> 
     * @return Mode Download speed limit mode. Valid values:
<li>LimitUponDownload: download speed limit for the entire process;</li>
<li>LimitAfterSpecificBytesDownloaded: Start speed limit after downloading specific bytes at full speed;</li>
<li>LimitAfterSpecificSecondsDownloaded: Start rate limiting after downloading at full speed for a specified time.</li>
     */
    public String getMode() {
        return this.Mode;
    }

    /**
     * Set Download speed limit mode. Valid values:
<li>LimitUponDownload: download speed limit for the entire process;</li>
<li>LimitAfterSpecificBytesDownloaded: Start speed limit after downloading specific bytes at full speed;</li>
<li>LimitAfterSpecificSecondsDownloaded: Start rate limiting after downloading at full speed for a specified time.</li>
     * @param Mode Download speed limit mode. Valid values:
<li>LimitUponDownload: download speed limit for the entire process;</li>
<li>LimitAfterSpecificBytesDownloaded: Start speed limit after downloading specific bytes at full speed;</li>
<li>LimitAfterSpecificSecondsDownloaded: Start rate limiting after downloading at full speed for a specified time.</li>
     */
    public void setMode(String Mode) {
        this.Mode = Mode;
    }

    /**
     * Get Rate-limiting value. Specify the rate limit. Fill in a value with a unit or a variable. Currently supported unit: KB/s. 
     * @return MaxSpeed Rate-limiting value. Specify the rate limit. Fill in a value with a unit or a variable. Currently supported unit: KB/s.
     */
    public String getMaxSpeed() {
        return this.MaxSpeed;
    }

    /**
     * Set Rate-limiting value. Specify the rate limit. Fill in a value with a unit or a variable. Currently supported unit: KB/s.
     * @param MaxSpeed Rate-limiting value. Specify the rate limit. Fill in a value with a unit or a variable. Currently supported unit: KB/s.
     */
    public void setMaxSpeed(String MaxSpeed) {
        this.MaxSpeed = MaxSpeed;
    }

    /**
     * Get Speed limit start value, which can be the download size or specified duration. Fill in a value with a unit or a variable to specify the download size or duration.

-When Mode is LimitAfterSpecificBytesDownloaded, valid values of the unit are: KB;

-When Mode is LimitAfterSpecificSecondsDownloaded, valid values of the measurement unit: s.
 
     * @return StartAt Speed limit start value, which can be the download size or specified duration. Fill in a value with a unit or a variable to specify the download size or duration.

-When Mode is LimitAfterSpecificBytesDownloaded, valid values of the unit are: KB;

-When Mode is LimitAfterSpecificSecondsDownloaded, valid values of the measurement unit: s.

     */
    public String getStartAt() {
        return this.StartAt;
    }

    /**
     * Set Speed limit start value, which can be the download size or specified duration. Fill in a value with a unit or a variable to specify the download size or duration.

-When Mode is LimitAfterSpecificBytesDownloaded, valid values of the unit are: KB;

-When Mode is LimitAfterSpecificSecondsDownloaded, valid values of the measurement unit: s.

     * @param StartAt Speed limit start value, which can be the download size or specified duration. Fill in a value with a unit or a variable to specify the download size or duration.

-When Mode is LimitAfterSpecificBytesDownloaded, valid values of the unit are: KB;

-When Mode is LimitAfterSpecificSecondsDownloaded, valid values of the measurement unit: s.

     */
    public void setStartAt(String StartAt) {
        this.StartAt = StartAt;
    }

    public ResponseSpeedLimitParameters() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ResponseSpeedLimitParameters(ResponseSpeedLimitParameters source) {
        if (source.Mode != null) {
            this.Mode = new String(source.Mode);
        }
        if (source.MaxSpeed != null) {
            this.MaxSpeed = new String(source.MaxSpeed);
        }
        if (source.StartAt != null) {
            this.StartAt = new String(source.StartAt);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Mode", this.Mode);
        this.setParamSimple(map, prefix + "MaxSpeed", this.MaxSpeed);
        this.setParamSimple(map, prefix + "StartAt", this.StartAt);

    }
}

