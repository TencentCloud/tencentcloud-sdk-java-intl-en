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
package com.tencentcloudapi.tem.v20210701.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeConfigDataListPage extends AbstractModel {

    /**
    * Record
    */
    @SerializedName("Records")
    @Expose
    private ConfigData [] Records;

    /**
    * Paging cursor
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("ContinueToken")
    @Expose
    private String ContinueToken;

    /**
    * Remaining number
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("RemainingCount")
    @Expose
    private Long RemainingCount;

    /**
     * Get Record 
     * @return Records Record
     */
    public ConfigData [] getRecords() {
        return this.Records;
    }

    /**
     * Set Record
     * @param Records Record
     */
    public void setRecords(ConfigData [] Records) {
        this.Records = Records;
    }

    /**
     * Get Paging cursor
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return ContinueToken Paging cursor
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public String getContinueToken() {
        return this.ContinueToken;
    }

    /**
     * Set Paging cursor
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param ContinueToken Paging cursor
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setContinueToken(String ContinueToken) {
        this.ContinueToken = ContinueToken;
    }

    /**
     * Get Remaining number
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return RemainingCount Remaining number
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public Long getRemainingCount() {
        return this.RemainingCount;
    }

    /**
     * Set Remaining number
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param RemainingCount Remaining number
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setRemainingCount(Long RemainingCount) {
        this.RemainingCount = RemainingCount;
    }

    public DescribeConfigDataListPage() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeConfigDataListPage(DescribeConfigDataListPage source) {
        if (source.Records != null) {
            this.Records = new ConfigData[source.Records.length];
            for (int i = 0; i < source.Records.length; i++) {
                this.Records[i] = new ConfigData(source.Records[i]);
            }
        }
        if (source.ContinueToken != null) {
            this.ContinueToken = new String(source.ContinueToken);
        }
        if (source.RemainingCount != null) {
            this.RemainingCount = new Long(source.RemainingCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Records.", this.Records);
        this.setParamSimple(map, prefix + "ContinueToken", this.ContinueToken);
        this.setParamSimple(map, prefix + "RemainingCount", this.RemainingCount);

    }
}

