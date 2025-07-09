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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyBlockIgnoreListRequest extends AbstractModel {

    /**
    * Type of the rule. Values: `1` (Blocklist); `2` (Allowlist)
    */
    @SerializedName("RuleType")
    @Expose
    private Long RuleType;

    /**
    * Either IP or Domain is required
    */
    @SerializedName("IOC")
    @Expose
    private IocListData [] IOC;

    /**
    * Optional values: delete, edit, and add
    */
    @SerializedName("IocAction")
    @Expose
    private String IocAction;

    /**
    * Time format: yyyy-MM-dd HH:mm:ss. Required when IocAction is edit or add
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * End time of the period in the format of yyyy-MM-dd HH:mm:ss. It must be later than both the start time and the current time. It’s required when `IocAction` is `edit` or `add`. 
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
     * Get Type of the rule. Values: `1` (Blocklist); `2` (Allowlist) 
     * @return RuleType Type of the rule. Values: `1` (Blocklist); `2` (Allowlist)
     */
    public Long getRuleType() {
        return this.RuleType;
    }

    /**
     * Set Type of the rule. Values: `1` (Blocklist); `2` (Allowlist)
     * @param RuleType Type of the rule. Values: `1` (Blocklist); `2` (Allowlist)
     */
    public void setRuleType(Long RuleType) {
        this.RuleType = RuleType;
    }

    /**
     * Get Either IP or Domain is required 
     * @return IOC Either IP or Domain is required
     */
    public IocListData [] getIOC() {
        return this.IOC;
    }

    /**
     * Set Either IP or Domain is required
     * @param IOC Either IP or Domain is required
     */
    public void setIOC(IocListData [] IOC) {
        this.IOC = IOC;
    }

    /**
     * Get Optional values: delete, edit, and add 
     * @return IocAction Optional values: delete, edit, and add
     */
    public String getIocAction() {
        return this.IocAction;
    }

    /**
     * Set Optional values: delete, edit, and add
     * @param IocAction Optional values: delete, edit, and add
     */
    public void setIocAction(String IocAction) {
        this.IocAction = IocAction;
    }

    /**
     * Get Time format: yyyy-MM-dd HH:mm:ss. Required when IocAction is edit or add 
     * @return StartTime Time format: yyyy-MM-dd HH:mm:ss. Required when IocAction is edit or add
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Time format: yyyy-MM-dd HH:mm:ss. Required when IocAction is edit or add
     * @param StartTime Time format: yyyy-MM-dd HH:mm:ss. Required when IocAction is edit or add
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get End time of the period in the format of yyyy-MM-dd HH:mm:ss. It must be later than both the start time and the current time. It’s required when `IocAction` is `edit` or `add`.  
     * @return EndTime End time of the period in the format of yyyy-MM-dd HH:mm:ss. It must be later than both the start time and the current time. It’s required when `IocAction` is `edit` or `add`. 
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End time of the period in the format of yyyy-MM-dd HH:mm:ss. It must be later than both the start time and the current time. It’s required when `IocAction` is `edit` or `add`. 
     * @param EndTime End time of the period in the format of yyyy-MM-dd HH:mm:ss. It must be later than both the start time and the current time. It’s required when `IocAction` is `edit` or `add`. 
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    public ModifyBlockIgnoreListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyBlockIgnoreListRequest(ModifyBlockIgnoreListRequest source) {
        if (source.RuleType != null) {
            this.RuleType = new Long(source.RuleType);
        }
        if (source.IOC != null) {
            this.IOC = new IocListData[source.IOC.length];
            for (int i = 0; i < source.IOC.length; i++) {
                this.IOC[i] = new IocListData(source.IOC[i]);
            }
        }
        if (source.IocAction != null) {
            this.IocAction = new String(source.IocAction);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleType", this.RuleType);
        this.setParamArrayObj(map, prefix + "IOC.", this.IOC);
        this.setParamSimple(map, prefix + "IocAction", this.IocAction);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);

    }
}

