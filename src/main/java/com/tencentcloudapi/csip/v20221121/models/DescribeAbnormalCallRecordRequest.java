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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAbnormalCallRecordRequest extends AbstractModel {

    /**
    * Alarm rule ID.
    */
    @SerializedName("AlarmRuleID")
    @Expose
    private Long AlarmRuleID;

    /**
    * Group Account Member ID
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
    * Access key.
    */
    @SerializedName("AccessKey")
    @Expose
    private String AccessKey;

    /**
    * Source IP of the call.
    */
    @SerializedName("SourceIP")
    @Expose
    private String SourceIP;

    /**
    * Filter.
    */
    @SerializedName("Filter")
    @Expose
    private Filter Filter;

    /**
     * Get Alarm rule ID. 
     * @return AlarmRuleID Alarm rule ID.
     */
    public Long getAlarmRuleID() {
        return this.AlarmRuleID;
    }

    /**
     * Set Alarm rule ID.
     * @param AlarmRuleID Alarm rule ID.
     */
    public void setAlarmRuleID(Long AlarmRuleID) {
        this.AlarmRuleID = AlarmRuleID;
    }

    /**
     * Get Group Account Member ID 
     * @return MemberId Group Account Member ID
     */
    public String [] getMemberId() {
        return this.MemberId;
    }

    /**
     * Set Group Account Member ID
     * @param MemberId Group Account Member ID
     */
    public void setMemberId(String [] MemberId) {
        this.MemberId = MemberId;
    }

    /**
     * Get Access key. 
     * @return AccessKey Access key.
     */
    public String getAccessKey() {
        return this.AccessKey;
    }

    /**
     * Set Access key.
     * @param AccessKey Access key.
     */
    public void setAccessKey(String AccessKey) {
        this.AccessKey = AccessKey;
    }

    /**
     * Get Source IP of the call. 
     * @return SourceIP Source IP of the call.
     */
    public String getSourceIP() {
        return this.SourceIP;
    }

    /**
     * Set Source IP of the call.
     * @param SourceIP Source IP of the call.
     */
    public void setSourceIP(String SourceIP) {
        this.SourceIP = SourceIP;
    }

    /**
     * Get Filter. 
     * @return Filter Filter.
     */
    public Filter getFilter() {
        return this.Filter;
    }

    /**
     * Set Filter.
     * @param Filter Filter.
     */
    public void setFilter(Filter Filter) {
        this.Filter = Filter;
    }

    public DescribeAbnormalCallRecordRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAbnormalCallRecordRequest(DescribeAbnormalCallRecordRequest source) {
        if (source.AlarmRuleID != null) {
            this.AlarmRuleID = new Long(source.AlarmRuleID);
        }
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
        }
        if (source.AccessKey != null) {
            this.AccessKey = new String(source.AccessKey);
        }
        if (source.SourceIP != null) {
            this.SourceIP = new String(source.SourceIP);
        }
        if (source.Filter != null) {
            this.Filter = new Filter(source.Filter);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AlarmRuleID", this.AlarmRuleID);
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);
        this.setParamSimple(map, prefix + "AccessKey", this.AccessKey);
        this.setParamSimple(map, prefix + "SourceIP", this.SourceIP);
        this.setParamObj(map, prefix + "Filter.", this.Filter);

    }
}

