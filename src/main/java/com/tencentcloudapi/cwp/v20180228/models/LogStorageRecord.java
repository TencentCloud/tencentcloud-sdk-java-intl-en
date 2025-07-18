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

public class LogStorageRecord extends AbstractModel {

    /**
    * Year and month
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Month")
    @Expose
    private String Month;

    /**
    * Used storage capacity, in bytes
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UsedSize")
    @Expose
    private Long UsedSize;

    /**
    * Total capacity, in bytes
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("InquireSize")
    @Expose
    private Long InquireSize;

    /**
     * Get Year and month
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Month Year and month
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getMonth() {
        return this.Month;
    }

    /**
     * Set Year and month
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Month Year and month
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMonth(String Month) {
        this.Month = Month;
    }

    /**
     * Get Used storage capacity, in bytes
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return UsedSize Used storage capacity, in bytes
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getUsedSize() {
        return this.UsedSize;
    }

    /**
     * Set Used storage capacity, in bytes
Note: This field may return null, indicating that no valid values can be obtained.
     * @param UsedSize Used storage capacity, in bytes
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUsedSize(Long UsedSize) {
        this.UsedSize = UsedSize;
    }

    /**
     * Get Total capacity, in bytes
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return InquireSize Total capacity, in bytes
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getInquireSize() {
        return this.InquireSize;
    }

    /**
     * Set Total capacity, in bytes
Note: This field may return null, indicating that no valid values can be obtained.
     * @param InquireSize Total capacity, in bytes
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setInquireSize(Long InquireSize) {
        this.InquireSize = InquireSize;
    }

    public LogStorageRecord() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LogStorageRecord(LogStorageRecord source) {
        if (source.Month != null) {
            this.Month = new String(source.Month);
        }
        if (source.UsedSize != null) {
            this.UsedSize = new Long(source.UsedSize);
        }
        if (source.InquireSize != null) {
            this.InquireSize = new Long(source.InquireSize);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Month", this.Month);
        this.setParamSimple(map, prefix + "UsedSize", this.UsedSize);
        this.setParamSimple(map, prefix + "InquireSize", this.InquireSize);

    }
}

