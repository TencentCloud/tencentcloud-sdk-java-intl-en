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

public class BaselineItemDetect extends AbstractModel {

    /**
    * Item ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ItemId")
    @Expose
    private Long ItemId;

    /**
    * Item Name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ItemName")
    @Expose
    private String ItemName;

    /**
    * Item Description
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ItemDesc")
    @Expose
    private String ItemDesc;

    /**
    * Fixing Method
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("FixMethod")
    @Expose
    private String FixMethod;

    /**
    * Rule
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * 0: Failed; 1: Ignored; 3: Passed; 5: Under detection
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DetectStatus")
    @Expose
    private Long DetectStatus;

    /**
    * Risk level
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Level")
    @Expose
    private Long Level;

    /**
    * Number of affected servers
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("HostCount")
    @Expose
    private Long HostCount;

    /**
    * First detection time
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("FirstTime")
    @Expose
    private String FirstTime;

    /**
    * Last Detection Time
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("LastTime")
    @Expose
    private String LastTime;

    /**
    * Detection result, JSON string
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DetectResult")
    @Expose
    private String DetectResult;

    /**
    * Rule ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RuleId")
    @Expose
    private Long RuleId;

    /**
    * Number of servers passed
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PassedHostCount")
    @Expose
    private Long PassedHostCount;

    /**
    * Number of servers failed
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("NotPassedHostCount")
    @Expose
    private Long NotPassedHostCount;

    /**
     * Get Item ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ItemId Item ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getItemId() {
        return this.ItemId;
    }

    /**
     * Set Item ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ItemId Item ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setItemId(Long ItemId) {
        this.ItemId = ItemId;
    }

    /**
     * Get Item Name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ItemName Item Name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getItemName() {
        return this.ItemName;
    }

    /**
     * Set Item Name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ItemName Item Name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setItemName(String ItemName) {
        this.ItemName = ItemName;
    }

    /**
     * Get Item Description
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ItemDesc Item Description
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getItemDesc() {
        return this.ItemDesc;
    }

    /**
     * Set Item Description
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ItemDesc Item Description
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setItemDesc(String ItemDesc) {
        this.ItemDesc = ItemDesc;
    }

    /**
     * Get Fixing Method
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return FixMethod Fixing Method
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getFixMethod() {
        return this.FixMethod;
    }

    /**
     * Set Fixing Method
Note: This field may return null, indicating that no valid values can be obtained.
     * @param FixMethod Fixing Method
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setFixMethod(String FixMethod) {
        this.FixMethod = FixMethod;
    }

    /**
     * Get Rule
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RuleName Rule
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set Rule
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RuleName Rule
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
    }

    /**
     * Get 0: Failed; 1: Ignored; 3: Passed; 5: Under detection
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DetectStatus 0: Failed; 1: Ignored; 3: Passed; 5: Under detection
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getDetectStatus() {
        return this.DetectStatus;
    }

    /**
     * Set 0: Failed; 1: Ignored; 3: Passed; 5: Under detection
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DetectStatus 0: Failed; 1: Ignored; 3: Passed; 5: Under detection
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDetectStatus(Long DetectStatus) {
        this.DetectStatus = DetectStatus;
    }

    /**
     * Get Risk level
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Level Risk level
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getLevel() {
        return this.Level;
    }

    /**
     * Set Risk level
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Level Risk level
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setLevel(Long Level) {
        this.Level = Level;
    }

    /**
     * Get Number of affected servers
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return HostCount Number of affected servers
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getHostCount() {
        return this.HostCount;
    }

    /**
     * Set Number of affected servers
Note: This field may return null, indicating that no valid values can be obtained.
     * @param HostCount Number of affected servers
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setHostCount(Long HostCount) {
        this.HostCount = HostCount;
    }

    /**
     * Get First detection time
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return FirstTime First detection time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getFirstTime() {
        return this.FirstTime;
    }

    /**
     * Set First detection time
Note: This field may return null, indicating that no valid values can be obtained.
     * @param FirstTime First detection time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setFirstTime(String FirstTime) {
        this.FirstTime = FirstTime;
    }

    /**
     * Get Last Detection Time
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return LastTime Last Detection Time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getLastTime() {
        return this.LastTime;
    }

    /**
     * Set Last Detection Time
Note: This field may return null, indicating that no valid values can be obtained.
     * @param LastTime Last Detection Time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setLastTime(String LastTime) {
        this.LastTime = LastTime;
    }

    /**
     * Get Detection result, JSON string
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DetectResult Detection result, JSON string
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDetectResult() {
        return this.DetectResult;
    }

    /**
     * Set Detection result, JSON string
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DetectResult Detection result, JSON string
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDetectResult(String DetectResult) {
        this.DetectResult = DetectResult;
    }

    /**
     * Get Rule ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RuleId Rule ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getRuleId() {
        return this.RuleId;
    }

    /**
     * Set Rule ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RuleId Rule ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRuleId(Long RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get Number of servers passed
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PassedHostCount Number of servers passed
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getPassedHostCount() {
        return this.PassedHostCount;
    }

    /**
     * Set Number of servers passed
Note: This field may return null, indicating that no valid values can be obtained.
     * @param PassedHostCount Number of servers passed
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPassedHostCount(Long PassedHostCount) {
        this.PassedHostCount = PassedHostCount;
    }

    /**
     * Get Number of servers failed
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return NotPassedHostCount Number of servers failed
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getNotPassedHostCount() {
        return this.NotPassedHostCount;
    }

    /**
     * Set Number of servers failed
Note: This field may return null, indicating that no valid values can be obtained.
     * @param NotPassedHostCount Number of servers failed
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setNotPassedHostCount(Long NotPassedHostCount) {
        this.NotPassedHostCount = NotPassedHostCount;
    }

    public BaselineItemDetect() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BaselineItemDetect(BaselineItemDetect source) {
        if (source.ItemId != null) {
            this.ItemId = new Long(source.ItemId);
        }
        if (source.ItemName != null) {
            this.ItemName = new String(source.ItemName);
        }
        if (source.ItemDesc != null) {
            this.ItemDesc = new String(source.ItemDesc);
        }
        if (source.FixMethod != null) {
            this.FixMethod = new String(source.FixMethod);
        }
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
        if (source.DetectStatus != null) {
            this.DetectStatus = new Long(source.DetectStatus);
        }
        if (source.Level != null) {
            this.Level = new Long(source.Level);
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
        if (source.DetectResult != null) {
            this.DetectResult = new String(source.DetectResult);
        }
        if (source.RuleId != null) {
            this.RuleId = new Long(source.RuleId);
        }
        if (source.PassedHostCount != null) {
            this.PassedHostCount = new Long(source.PassedHostCount);
        }
        if (source.NotPassedHostCount != null) {
            this.NotPassedHostCount = new Long(source.NotPassedHostCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ItemId", this.ItemId);
        this.setParamSimple(map, prefix + "ItemName", this.ItemName);
        this.setParamSimple(map, prefix + "ItemDesc", this.ItemDesc);
        this.setParamSimple(map, prefix + "FixMethod", this.FixMethod);
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamSimple(map, prefix + "DetectStatus", this.DetectStatus);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamSimple(map, prefix + "HostCount", this.HostCount);
        this.setParamSimple(map, prefix + "FirstTime", this.FirstTime);
        this.setParamSimple(map, prefix + "LastTime", this.LastTime);
        this.setParamSimple(map, prefix + "DetectResult", this.DetectResult);
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "PassedHostCount", this.PassedHostCount);
        this.setParamSimple(map, prefix + "NotPassedHostCount", this.NotPassedHostCount);

    }
}

