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
    */
    @SerializedName("ItemId")
    @Expose
    private Long ItemId;

    /**
    * Item Name
    */
    @SerializedName("ItemName")
    @Expose
    private String ItemName;

    /**
    * Item Description
    */
    @SerializedName("ItemDesc")
    @Expose
    private String ItemDesc;

    /**
    * Fixing Method
    */
    @SerializedName("FixMethod")
    @Expose
    private String FixMethod;

    /**
    * Rule
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * 0: Failed; 1: Ignored; 3: Passed; 5: Under detection
    */
    @SerializedName("DetectStatus")
    @Expose
    private Long DetectStatus;

    /**
    * Risk level
    */
    @SerializedName("Level")
    @Expose
    private Long Level;

    /**
    * Number of affected servers
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
    * Last detection time
    */
    @SerializedName("LastTime")
    @Expose
    private String LastTime;

    /**
    * Detection result; JSON string.
    */
    @SerializedName("DetectResult")
    @Expose
    private String DetectResult;

    /**
    * Rule ID.
    */
    @SerializedName("RuleId")
    @Expose
    private Long RuleId;

    /**
    * Number of servers passed.
    */
    @SerializedName("PassedHostCount")
    @Expose
    private Long PassedHostCount;

    /**
    * Number of servers failed.
    */
    @SerializedName("NotPassedHostCount")
    @Expose
    private Long NotPassedHostCount;

    /**
     * Get Item ID 
     * @return ItemId Item ID
     */
    public Long getItemId() {
        return this.ItemId;
    }

    /**
     * Set Item ID
     * @param ItemId Item ID
     */
    public void setItemId(Long ItemId) {
        this.ItemId = ItemId;
    }

    /**
     * Get Item Name 
     * @return ItemName Item Name
     */
    public String getItemName() {
        return this.ItemName;
    }

    /**
     * Set Item Name
     * @param ItemName Item Name
     */
    public void setItemName(String ItemName) {
        this.ItemName = ItemName;
    }

    /**
     * Get Item Description 
     * @return ItemDesc Item Description
     */
    public String getItemDesc() {
        return this.ItemDesc;
    }

    /**
     * Set Item Description
     * @param ItemDesc Item Description
     */
    public void setItemDesc(String ItemDesc) {
        this.ItemDesc = ItemDesc;
    }

    /**
     * Get Fixing Method 
     * @return FixMethod Fixing Method
     */
    public String getFixMethod() {
        return this.FixMethod;
    }

    /**
     * Set Fixing Method
     * @param FixMethod Fixing Method
     */
    public void setFixMethod(String FixMethod) {
        this.FixMethod = FixMethod;
    }

    /**
     * Get Rule 
     * @return RuleName Rule
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set Rule
     * @param RuleName Rule
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
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
     * Get Risk level 
     * @return Level Risk level
     */
    public Long getLevel() {
        return this.Level;
    }

    /**
     * Set Risk level
     * @param Level Risk level
     */
    public void setLevel(Long Level) {
        this.Level = Level;
    }

    /**
     * Get Number of affected servers 
     * @return HostCount Number of affected servers
     */
    public Long getHostCount() {
        return this.HostCount;
    }

    /**
     * Set Number of affected servers
     * @param HostCount Number of affected servers
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
     * Get Last detection time 
     * @return LastTime Last detection time
     */
    public String getLastTime() {
        return this.LastTime;
    }

    /**
     * Set Last detection time
     * @param LastTime Last detection time
     */
    public void setLastTime(String LastTime) {
        this.LastTime = LastTime;
    }

    /**
     * Get Detection result; JSON string. 
     * @return DetectResult Detection result; JSON string.
     */
    public String getDetectResult() {
        return this.DetectResult;
    }

    /**
     * Set Detection result; JSON string.
     * @param DetectResult Detection result; JSON string.
     */
    public void setDetectResult(String DetectResult) {
        this.DetectResult = DetectResult;
    }

    /**
     * Get Rule ID. 
     * @return RuleId Rule ID.
     */
    public Long getRuleId() {
        return this.RuleId;
    }

    /**
     * Set Rule ID.
     * @param RuleId Rule ID.
     */
    public void setRuleId(Long RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get Number of servers passed. 
     * @return PassedHostCount Number of servers passed.
     */
    public Long getPassedHostCount() {
        return this.PassedHostCount;
    }

    /**
     * Set Number of servers passed.
     * @param PassedHostCount Number of servers passed.
     */
    public void setPassedHostCount(Long PassedHostCount) {
        this.PassedHostCount = PassedHostCount;
    }

    /**
     * Get Number of servers failed. 
     * @return NotPassedHostCount Number of servers failed.
     */
    public Long getNotPassedHostCount() {
        return this.NotPassedHostCount;
    }

    /**
     * Set Number of servers failed.
     * @param NotPassedHostCount Number of servers failed.
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

