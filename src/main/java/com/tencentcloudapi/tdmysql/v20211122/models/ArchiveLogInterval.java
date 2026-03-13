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
package com.tencentcloudapi.tdmysql.v20211122.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ArchiveLogInterval extends AbstractModel {

    /**
    * End time.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Major version.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MajorVersion")
    @Expose
    private String MajorVersion;

    /**
    * Minor version.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MinorVersion")
    @Expose
    private String MinorVersion;

    /**
    * Start time.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
     * Get End time.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return EndTime End time.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End time.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param EndTime End time.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Major version.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return MajorVersion Major version.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getMajorVersion() {
        return this.MajorVersion;
    }

    /**
     * Set Major version.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param MajorVersion Major version.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMajorVersion(String MajorVersion) {
        this.MajorVersion = MajorVersion;
    }

    /**
     * Get Minor version.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return MinorVersion Minor version.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getMinorVersion() {
        return this.MinorVersion;
    }

    /**
     * Set Minor version.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param MinorVersion Minor version.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMinorVersion(String MinorVersion) {
        this.MinorVersion = MinorVersion;
    }

    /**
     * Get Start time.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return StartTime Start time.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Start time.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param StartTime Start time.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    public ArchiveLogInterval() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ArchiveLogInterval(ArchiveLogInterval source) {
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.MajorVersion != null) {
            this.MajorVersion = new String(source.MajorVersion);
        }
        if (source.MinorVersion != null) {
            this.MinorVersion = new String(source.MinorVersion);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "MajorVersion", this.MajorVersion);
        this.setParamSimple(map, prefix + "MinorVersion", this.MinorVersion);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);

    }
}

