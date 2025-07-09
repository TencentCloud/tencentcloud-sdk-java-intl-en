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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LogContent extends AbstractModel {

    /**
    * Log Timestamp, in milliseconds
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Time")
    @Expose
    private Long Time;

    /**
    * Log Package ID
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("PkgId")
    @Expose
    private String PkgId;

    /**
    * Log content
    */
    @SerializedName("Log")
    @Expose
    private String Log;

    /**
     * Get Log Timestamp, in milliseconds
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return Time Log Timestamp, in milliseconds
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getTime() {
        return this.Time;
    }

    /**
     * Set Log Timestamp, in milliseconds
Note: This field may return null, indicating that no valid value can be obtained.
     * @param Time Log Timestamp, in milliseconds
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setTime(Long Time) {
        this.Time = Time;
    }

    /**
     * Get Log Package ID
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return PkgId Log Package ID
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getPkgId() {
        return this.PkgId;
    }

    /**
     * Set Log Package ID
Note: This field may return null, indicating that no valid value can be obtained.
     * @param PkgId Log Package ID
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setPkgId(String PkgId) {
        this.PkgId = PkgId;
    }

    /**
     * Get Log content 
     * @return Log Log content
     */
    public String getLog() {
        return this.Log;
    }

    /**
     * Set Log content
     * @param Log Log content
     */
    public void setLog(String Log) {
        this.Log = Log;
    }

    public LogContent() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LogContent(LogContent source) {
        if (source.Time != null) {
            this.Time = new Long(source.Time);
        }
        if (source.PkgId != null) {
            this.PkgId = new String(source.PkgId);
        }
        if (source.Log != null) {
            this.Log = new String(source.Log);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Time", this.Time);
        this.setParamSimple(map, prefix + "PkgId", this.PkgId);
        this.setParamSimple(map, prefix + "Log", this.Log);

    }
}

