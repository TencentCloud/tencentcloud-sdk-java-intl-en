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
package com.tencentcloudapi.tem.v20210701.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LogConfigExtractRule extends AbstractModel{

    /**
    * First line regex
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("BeginningRegex")
    @Expose
    private String BeginningRegex;

    /**
    * Withdrawl result
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("Keys")
    @Expose
    private String [] Keys;

    /**
    * Filter keys
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("FilterKeys")
    @Expose
    private String [] FilterKeys;

    /**
    * Filter values
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("FilterRegex")
    @Expose
    private String [] FilterRegex;

    /**
    * Log regex
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("LogRegex")
    @Expose
    private String LogRegex;

    /**
    * Time field
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("TimeKey")
    @Expose
    private String TimeKey;

    /**
    * Time Format
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("TimeFormat")
    @Expose
    private String TimeFormat;

    /**
    * - Enable the upload of the log that failed to parse
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("UnMatchUpload")
    @Expose
    private String UnMatchUpload;

    /**
    * Key of log failed to be parsed
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("UnMatchedKey")
    @Expose
    private String UnMatchedKey;

    /**
    * tracking
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Backtracking")
    @Expose
    private String Backtracking;

    /**
    * Separator
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Delimiter")
    @Expose
    private String Delimiter;

    /**
     * Get First line regex
Note: This field may return `null`, indicating that no valid value was found. 
     * @return BeginningRegex First line regex
Note: This field may return `null`, indicating that no valid value was found.
     */
    public String getBeginningRegex() {
        return this.BeginningRegex;
    }

    /**
     * Set First line regex
Note: This field may return `null`, indicating that no valid value was found.
     * @param BeginningRegex First line regex
Note: This field may return `null`, indicating that no valid value was found.
     */
    public void setBeginningRegex(String BeginningRegex) {
        this.BeginningRegex = BeginningRegex;
    }

    /**
     * Get Withdrawl result
Note: This field may return `null`, indicating that no valid value was found. 
     * @return Keys Withdrawl result
Note: This field may return `null`, indicating that no valid value was found.
     */
    public String [] getKeys() {
        return this.Keys;
    }

    /**
     * Set Withdrawl result
Note: This field may return `null`, indicating that no valid value was found.
     * @param Keys Withdrawl result
Note: This field may return `null`, indicating that no valid value was found.
     */
    public void setKeys(String [] Keys) {
        this.Keys = Keys;
    }

    /**
     * Get Filter keys
Note: This field may return `null`, indicating that no valid value was found. 
     * @return FilterKeys Filter keys
Note: This field may return `null`, indicating that no valid value was found.
     */
    public String [] getFilterKeys() {
        return this.FilterKeys;
    }

    /**
     * Set Filter keys
Note: This field may return `null`, indicating that no valid value was found.
     * @param FilterKeys Filter keys
Note: This field may return `null`, indicating that no valid value was found.
     */
    public void setFilterKeys(String [] FilterKeys) {
        this.FilterKeys = FilterKeys;
    }

    /**
     * Get Filter values
Note: This field may return `null`, indicating that no valid value was found. 
     * @return FilterRegex Filter values
Note: This field may return `null`, indicating that no valid value was found.
     */
    public String [] getFilterRegex() {
        return this.FilterRegex;
    }

    /**
     * Set Filter values
Note: This field may return `null`, indicating that no valid value was found.
     * @param FilterRegex Filter values
Note: This field may return `null`, indicating that no valid value was found.
     */
    public void setFilterRegex(String [] FilterRegex) {
        this.FilterRegex = FilterRegex;
    }

    /**
     * Get Log regex
Note: This field may return `null`, indicating that no valid value was found. 
     * @return LogRegex Log regex
Note: This field may return `null`, indicating that no valid value was found.
     */
    public String getLogRegex() {
        return this.LogRegex;
    }

    /**
     * Set Log regex
Note: This field may return `null`, indicating that no valid value was found.
     * @param LogRegex Log regex
Note: This field may return `null`, indicating that no valid value was found.
     */
    public void setLogRegex(String LogRegex) {
        this.LogRegex = LogRegex;
    }

    /**
     * Get Time field
Note: This field may return `null`, indicating that no valid value was found. 
     * @return TimeKey Time field
Note: This field may return `null`, indicating that no valid value was found.
     */
    public String getTimeKey() {
        return this.TimeKey;
    }

    /**
     * Set Time field
Note: This field may return `null`, indicating that no valid value was found.
     * @param TimeKey Time field
Note: This field may return `null`, indicating that no valid value was found.
     */
    public void setTimeKey(String TimeKey) {
        this.TimeKey = TimeKey;
    }

    /**
     * Get Time Format
Note: This field may return `null`, indicating that no valid value was found. 
     * @return TimeFormat Time Format
Note: This field may return `null`, indicating that no valid value was found.
     */
    public String getTimeFormat() {
        return this.TimeFormat;
    }

    /**
     * Set Time Format
Note: This field may return `null`, indicating that no valid value was found.
     * @param TimeFormat Time Format
Note: This field may return `null`, indicating that no valid value was found.
     */
    public void setTimeFormat(String TimeFormat) {
        this.TimeFormat = TimeFormat;
    }

    /**
     * Get - Enable the upload of the log that failed to parse
Note: This field may return `null`, indicating that no valid value was found. 
     * @return UnMatchUpload - Enable the upload of the log that failed to parse
Note: This field may return `null`, indicating that no valid value was found.
     */
    public String getUnMatchUpload() {
        return this.UnMatchUpload;
    }

    /**
     * Set - Enable the upload of the log that failed to parse
Note: This field may return `null`, indicating that no valid value was found.
     * @param UnMatchUpload - Enable the upload of the log that failed to parse
Note: This field may return `null`, indicating that no valid value was found.
     */
    public void setUnMatchUpload(String UnMatchUpload) {
        this.UnMatchUpload = UnMatchUpload;
    }

    /**
     * Get Key of log failed to be parsed
Note: This field may return `null`, indicating that no valid value was found. 
     * @return UnMatchedKey Key of log failed to be parsed
Note: This field may return `null`, indicating that no valid value was found.
     */
    public String getUnMatchedKey() {
        return this.UnMatchedKey;
    }

    /**
     * Set Key of log failed to be parsed
Note: This field may return `null`, indicating that no valid value was found.
     * @param UnMatchedKey Key of log failed to be parsed
Note: This field may return `null`, indicating that no valid value was found.
     */
    public void setUnMatchedKey(String UnMatchedKey) {
        this.UnMatchedKey = UnMatchedKey;
    }

    /**
     * Get tracking
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Backtracking tracking
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getBacktracking() {
        return this.Backtracking;
    }

    /**
     * Set tracking
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Backtracking tracking
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setBacktracking(String Backtracking) {
        this.Backtracking = Backtracking;
    }

    /**
     * Get Separator
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Delimiter Separator
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDelimiter() {
        return this.Delimiter;
    }

    /**
     * Set Separator
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Delimiter Separator
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDelimiter(String Delimiter) {
        this.Delimiter = Delimiter;
    }

    public LogConfigExtractRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LogConfigExtractRule(LogConfigExtractRule source) {
        if (source.BeginningRegex != null) {
            this.BeginningRegex = new String(source.BeginningRegex);
        }
        if (source.Keys != null) {
            this.Keys = new String[source.Keys.length];
            for (int i = 0; i < source.Keys.length; i++) {
                this.Keys[i] = new String(source.Keys[i]);
            }
        }
        if (source.FilterKeys != null) {
            this.FilterKeys = new String[source.FilterKeys.length];
            for (int i = 0; i < source.FilterKeys.length; i++) {
                this.FilterKeys[i] = new String(source.FilterKeys[i]);
            }
        }
        if (source.FilterRegex != null) {
            this.FilterRegex = new String[source.FilterRegex.length];
            for (int i = 0; i < source.FilterRegex.length; i++) {
                this.FilterRegex[i] = new String(source.FilterRegex[i]);
            }
        }
        if (source.LogRegex != null) {
            this.LogRegex = new String(source.LogRegex);
        }
        if (source.TimeKey != null) {
            this.TimeKey = new String(source.TimeKey);
        }
        if (source.TimeFormat != null) {
            this.TimeFormat = new String(source.TimeFormat);
        }
        if (source.UnMatchUpload != null) {
            this.UnMatchUpload = new String(source.UnMatchUpload);
        }
        if (source.UnMatchedKey != null) {
            this.UnMatchedKey = new String(source.UnMatchedKey);
        }
        if (source.Backtracking != null) {
            this.Backtracking = new String(source.Backtracking);
        }
        if (source.Delimiter != null) {
            this.Delimiter = new String(source.Delimiter);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BeginningRegex", this.BeginningRegex);
        this.setParamArraySimple(map, prefix + "Keys.", this.Keys);
        this.setParamArraySimple(map, prefix + "FilterKeys.", this.FilterKeys);
        this.setParamArraySimple(map, prefix + "FilterRegex.", this.FilterRegex);
        this.setParamSimple(map, prefix + "LogRegex", this.LogRegex);
        this.setParamSimple(map, prefix + "TimeKey", this.TimeKey);
        this.setParamSimple(map, prefix + "TimeFormat", this.TimeFormat);
        this.setParamSimple(map, prefix + "UnMatchUpload", this.UnMatchUpload);
        this.setParamSimple(map, prefix + "UnMatchedKey", this.UnMatchedKey);
        this.setParamSimple(map, prefix + "Backtracking", this.Backtracking);
        this.setParamSimple(map, prefix + "Delimiter", this.Delimiter);

    }
}

