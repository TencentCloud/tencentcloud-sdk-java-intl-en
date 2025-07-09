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
    * Download rate limit mode. valid values:.
<Li>LimitUponDownload: rate limit throughout the download process;</li>.
<Li>LimitAfterSpecificBytesDownloaded: rate limit after downloading specific bytes at full speed;</li>.
<Li>LimitAfterSpecificSecondsDownloaded: start speed limit after downloading at full speed for a specific duration.</li>.
    */
    @SerializedName("Mode")
    @Expose
    private String Mode;

    /**
    * Rate-Limiting value, in kb/s. enter a numerical value to specify the rate limit.
    */
    @SerializedName("MaxSpeed")
    @Expose
    private String MaxSpeed;

    /**
    * Rate-Limiting start value, which can be the download size or specified duration, in kb or s. this parameter is required when mode is set to limitafterspecificbytesdownloaded or limitafterspecificsecondsdownloaded. enter a numerical value to specify the download size or duration.
    */
    @SerializedName("StartAt")
    @Expose
    private String StartAt;

    /**
     * Get Download rate limit mode. valid values:.
<Li>LimitUponDownload: rate limit throughout the download process;</li>.
<Li>LimitAfterSpecificBytesDownloaded: rate limit after downloading specific bytes at full speed;</li>.
<Li>LimitAfterSpecificSecondsDownloaded: start speed limit after downloading at full speed for a specific duration.</li>. 
     * @return Mode Download rate limit mode. valid values:.
<Li>LimitUponDownload: rate limit throughout the download process;</li>.
<Li>LimitAfterSpecificBytesDownloaded: rate limit after downloading specific bytes at full speed;</li>.
<Li>LimitAfterSpecificSecondsDownloaded: start speed limit after downloading at full speed for a specific duration.</li>.
     */
    public String getMode() {
        return this.Mode;
    }

    /**
     * Set Download rate limit mode. valid values:.
<Li>LimitUponDownload: rate limit throughout the download process;</li>.
<Li>LimitAfterSpecificBytesDownloaded: rate limit after downloading specific bytes at full speed;</li>.
<Li>LimitAfterSpecificSecondsDownloaded: start speed limit after downloading at full speed for a specific duration.</li>.
     * @param Mode Download rate limit mode. valid values:.
<Li>LimitUponDownload: rate limit throughout the download process;</li>.
<Li>LimitAfterSpecificBytesDownloaded: rate limit after downloading specific bytes at full speed;</li>.
<Li>LimitAfterSpecificSecondsDownloaded: start speed limit after downloading at full speed for a specific duration.</li>.
     */
    public void setMode(String Mode) {
        this.Mode = Mode;
    }

    /**
     * Get Rate-Limiting value, in kb/s. enter a numerical value to specify the rate limit. 
     * @return MaxSpeed Rate-Limiting value, in kb/s. enter a numerical value to specify the rate limit.
     */
    public String getMaxSpeed() {
        return this.MaxSpeed;
    }

    /**
     * Set Rate-Limiting value, in kb/s. enter a numerical value to specify the rate limit.
     * @param MaxSpeed Rate-Limiting value, in kb/s. enter a numerical value to specify the rate limit.
     */
    public void setMaxSpeed(String MaxSpeed) {
        this.MaxSpeed = MaxSpeed;
    }

    /**
     * Get Rate-Limiting start value, which can be the download size or specified duration, in kb or s. this parameter is required when mode is set to limitafterspecificbytesdownloaded or limitafterspecificsecondsdownloaded. enter a numerical value to specify the download size or duration. 
     * @return StartAt Rate-Limiting start value, which can be the download size or specified duration, in kb or s. this parameter is required when mode is set to limitafterspecificbytesdownloaded or limitafterspecificsecondsdownloaded. enter a numerical value to specify the download size or duration.
     */
    public String getStartAt() {
        return this.StartAt;
    }

    /**
     * Set Rate-Limiting start value, which can be the download size or specified duration, in kb or s. this parameter is required when mode is set to limitafterspecificbytesdownloaded or limitafterspecificsecondsdownloaded. enter a numerical value to specify the download size or duration.
     * @param StartAt Rate-Limiting start value, which can be the download size or specified duration, in kb or s. this parameter is required when mode is set to limitafterspecificbytesdownloaded or limitafterspecificsecondsdownloaded. enter a numerical value to specify the download size or duration.
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

