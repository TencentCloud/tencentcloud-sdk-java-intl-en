/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
package com.tencentcloudapi.dts.v20211206.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DetailCheckItem extends AbstractModel{

    /**
    * Check item name, such as source database permission check.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CheckItemName")
    @Expose
    private String CheckItemName;

    /**
    * Check item details
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Check item result. Valid values: `pass` (pass); `failed` (failure); `warning` (pass with warning).
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CheckResult")
    @Expose
    private String CheckResult;

    /**
    * The cause of the check item failure
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("FailureReason")
    @Expose
    private String FailureReason;

    /**
    * Solution
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Solution")
    @Expose
    private String Solution;

    /**
    * Execution error log
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ErrorLog")
    @Expose
    private String [] ErrorLog;

    /**
    * URL of the detailed help document
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("HelpDoc")
    @Expose
    private String [] HelpDoc;

    /**
    * Prompt text for ignoring a risk
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SkipInfo")
    @Expose
    private String SkipInfo;

    /**
     * Get Check item name, such as source database permission check.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CheckItemName Check item name, such as source database permission check.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCheckItemName() {
        return this.CheckItemName;
    }

    /**
     * Set Check item name, such as source database permission check.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CheckItemName Check item name, such as source database permission check.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCheckItemName(String CheckItemName) {
        this.CheckItemName = CheckItemName;
    }

    /**
     * Get Check item details
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Description Check item details
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Check item details
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Description Check item details
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Check item result. Valid values: `pass` (pass); `failed` (failure); `warning` (pass with warning).
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CheckResult Check item result. Valid values: `pass` (pass); `failed` (failure); `warning` (pass with warning).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCheckResult() {
        return this.CheckResult;
    }

    /**
     * Set Check item result. Valid values: `pass` (pass); `failed` (failure); `warning` (pass with warning).
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CheckResult Check item result. Valid values: `pass` (pass); `failed` (failure); `warning` (pass with warning).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCheckResult(String CheckResult) {
        this.CheckResult = CheckResult;
    }

    /**
     * Get The cause of the check item failure
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return FailureReason The cause of the check item failure
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getFailureReason() {
        return this.FailureReason;
    }

    /**
     * Set The cause of the check item failure
Note: This field may return null, indicating that no valid values can be obtained.
     * @param FailureReason The cause of the check item failure
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setFailureReason(String FailureReason) {
        this.FailureReason = FailureReason;
    }

    /**
     * Get Solution
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Solution Solution
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getSolution() {
        return this.Solution;
    }

    /**
     * Set Solution
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Solution Solution
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSolution(String Solution) {
        this.Solution = Solution;
    }

    /**
     * Get Execution error log
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ErrorLog Execution error log
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getErrorLog() {
        return this.ErrorLog;
    }

    /**
     * Set Execution error log
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ErrorLog Execution error log
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setErrorLog(String [] ErrorLog) {
        this.ErrorLog = ErrorLog;
    }

    /**
     * Get URL of the detailed help document
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return HelpDoc URL of the detailed help document
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getHelpDoc() {
        return this.HelpDoc;
    }

    /**
     * Set URL of the detailed help document
Note: This field may return null, indicating that no valid values can be obtained.
     * @param HelpDoc URL of the detailed help document
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setHelpDoc(String [] HelpDoc) {
        this.HelpDoc = HelpDoc;
    }

    /**
     * Get Prompt text for ignoring a risk
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SkipInfo Prompt text for ignoring a risk
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getSkipInfo() {
        return this.SkipInfo;
    }

    /**
     * Set Prompt text for ignoring a risk
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SkipInfo Prompt text for ignoring a risk
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSkipInfo(String SkipInfo) {
        this.SkipInfo = SkipInfo;
    }

    public DetailCheckItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DetailCheckItem(DetailCheckItem source) {
        if (source.CheckItemName != null) {
            this.CheckItemName = new String(source.CheckItemName);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.CheckResult != null) {
            this.CheckResult = new String(source.CheckResult);
        }
        if (source.FailureReason != null) {
            this.FailureReason = new String(source.FailureReason);
        }
        if (source.Solution != null) {
            this.Solution = new String(source.Solution);
        }
        if (source.ErrorLog != null) {
            this.ErrorLog = new String[source.ErrorLog.length];
            for (int i = 0; i < source.ErrorLog.length; i++) {
                this.ErrorLog[i] = new String(source.ErrorLog[i]);
            }
        }
        if (source.HelpDoc != null) {
            this.HelpDoc = new String[source.HelpDoc.length];
            for (int i = 0; i < source.HelpDoc.length; i++) {
                this.HelpDoc[i] = new String(source.HelpDoc[i]);
            }
        }
        if (source.SkipInfo != null) {
            this.SkipInfo = new String(source.SkipInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CheckItemName", this.CheckItemName);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "CheckResult", this.CheckResult);
        this.setParamSimple(map, prefix + "FailureReason", this.FailureReason);
        this.setParamSimple(map, prefix + "Solution", this.Solution);
        this.setParamArraySimple(map, prefix + "ErrorLog.", this.ErrorLog);
        this.setParamArraySimple(map, prefix + "HelpDoc.", this.HelpDoc);
        this.setParamSimple(map, prefix + "SkipInfo", this.SkipInfo);

    }
}

