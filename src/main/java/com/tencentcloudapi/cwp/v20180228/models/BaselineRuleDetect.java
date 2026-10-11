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

public class BaselineRuleDetect extends AbstractModel {

    /**
    * Rule ID
    */
    @SerializedName("RuleId")
    @Expose
    private Long RuleId;

    /**
    * Rule name
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * Rule description
    */
    @SerializedName("RuleDesc")
    @Expose
    private String RuleDesc;

    /**
    * Number of associated items.
    */
    @SerializedName("ItemCount")
    @Expose
    private Long ItemCount;

    /**
    * Associated hosts
    */
    @SerializedName("HostCount")
    @Expose
    private Long HostCount;

    /**
    * First detection time
    */
    @SerializedName("FirstTime")
    @Expose
    private String FirstTime;

    /**
    * string
    */
    @SerializedName("LastTime")
    @Expose
    private String LastTime;

    /**
    * 0: Failed; 1: Ignored; 3: Passed; 5: Under detection
    */
    @SerializedName("DetectStatus")
    @Expose
    private Long DetectStatus;

    /**
    * Item ID collection.
    */
    @SerializedName("ItemIds")
    @Expose
    private Long [] ItemIds;

    /**
     * Get Rule ID 
     * @return RuleId Rule ID
     */
    public Long getRuleId() {
        return this.RuleId;
    }

    /**
     * Set Rule ID
     * @param RuleId Rule ID
     */
    public void setRuleId(Long RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get Rule name 
     * @return RuleName Rule name
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set Rule name
     * @param RuleName Rule name
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
    }

    /**
     * Get Rule description 
     * @return RuleDesc Rule description
     */
    public String getRuleDesc() {
        return this.RuleDesc;
    }

    /**
     * Set Rule description
     * @param RuleDesc Rule description
     */
    public void setRuleDesc(String RuleDesc) {
        this.RuleDesc = RuleDesc;
    }

    /**
     * Get Number of associated items. 
     * @return ItemCount Number of associated items.
     */
    public Long getItemCount() {
        return this.ItemCount;
    }

    /**
     * Set Number of associated items.
     * @param ItemCount Number of associated items.
     */
    public void setItemCount(Long ItemCount) {
        this.ItemCount = ItemCount;
    }

    /**
     * Get Associated hosts 
     * @return HostCount Associated hosts
     */
    public Long getHostCount() {
        return this.HostCount;
    }

    /**
     * Set Associated hosts
     * @param HostCount Associated hosts
     */
    public void setHostCount(Long HostCount) {
        this.HostCount = HostCount;
    }

    /**
     * Get First detection time 
     * @return FirstTime First detection time
     */
    public String getFirstTime() {
        return this.FirstTime;
    }

    /**
     * Set First detection time
     * @param FirstTime First detection time
     */
    public void setFirstTime(String FirstTime) {
        this.FirstTime = FirstTime;
    }

    /**
     * Get string 
     * @return LastTime string
     */
    public String getLastTime() {
        return this.LastTime;
    }

    /**
     * Set string
     * @param LastTime string
     */
    public void setLastTime(String LastTime) {
        this.LastTime = LastTime;
    }

    /**
     * Get 0: Failed; 1: Ignored; 3: Passed; 5: Under detection 
     * @return DetectStatus 0: Failed; 1: Ignored; 3: Passed; 5: Under detection
     */
    public Long getDetectStatus() {
        return this.DetectStatus;
    }

    /**
     * Set 0: Failed; 1: Ignored; 3: Passed; 5: Under detection
     * @param DetectStatus 0: Failed; 1: Ignored; 3: Passed; 5: Under detection
     */
    public void setDetectStatus(Long DetectStatus) {
        this.DetectStatus = DetectStatus;
    }

    /**
     * Get Item ID collection. 
     * @return ItemIds Item ID collection.
     */
    public Long [] getItemIds() {
        return this.ItemIds;
    }

    /**
     * Set Item ID collection.
     * @param ItemIds Item ID collection.
     */
    public void setItemIds(Long [] ItemIds) {
        this.ItemIds = ItemIds;
    }

    public BaselineRuleDetect() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BaselineRuleDetect(BaselineRuleDetect source) {
        if (source.RuleId != null) {
            this.RuleId = new Long(source.RuleId);
        }
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
        if (source.RuleDesc != null) {
            this.RuleDesc = new String(source.RuleDesc);
        }
        if (source.ItemCount != null) {
            this.ItemCount = new Long(source.ItemCount);
        }
        if (source.HostCount != null) {
            this.HostCount = new Long(source.HostCount);
        }
        if (source.FirstTime != null) {
            this.FirstTime = new String(source.FirstTime);
        }
        if (source.LastTime != null) {
            this.LastTime = new String(source.LastTime);
        }
        if (source.DetectStatus != null) {
            this.DetectStatus = new Long(source.DetectStatus);
        }
        if (source.ItemIds != null) {
            this.ItemIds = new Long[source.ItemIds.length];
            for (int i = 0; i < source.ItemIds.length; i++) {
                this.ItemIds[i] = new Long(source.ItemIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamSimple(map, prefix + "RuleDesc", this.RuleDesc);
        this.setParamSimple(map, prefix + "ItemCount", this.ItemCount);
        this.setParamSimple(map, prefix + "HostCount", this.HostCount);
        this.setParamSimple(map, prefix + "FirstTime", this.FirstTime);
        this.setParamSimple(map, prefix + "LastTime", this.LastTime);
        this.setParamSimple(map, prefix + "DetectStatus", this.DetectStatus);
        this.setParamArraySimple(map, prefix + "ItemIds.", this.ItemIds);

    }
}

