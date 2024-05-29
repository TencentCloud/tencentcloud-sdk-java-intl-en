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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LogFormat extends AbstractModel {

    /**
    * Predefined output format type for log delivery. Valid values:
<li>json: Use the predefined log output format JSON Lines, where fields in each log record are presented as key-value pairs;</li>
<li>csv: Use the predefined log output format csv, where fields in each log record is only presented as field values, excluding field names. </li>
    */
    @SerializedName("FormatType")
    @Expose
    private String FormatType;

    /**
    * A string added before each log delivery batch. Each log delivery batch may contain multiple log records.
    */
    @SerializedName("BatchPrefix")
    @Expose
    private String BatchPrefix;

    /**
    * A string appended after each log delivery batch.
    */
    @SerializedName("BatchSuffix")
    @Expose
    private String BatchSuffix;

    /**
    * A string added before each log record.
    */
    @SerializedName("RecordPrefix")
    @Expose
    private String RecordPrefix;

    /**
    * A string appended after each log record.
    */
    @SerializedName("RecordSuffix")
    @Expose
    private String RecordSuffix;

    /**
    * A string inserted between log records as a separator. Valid values:
<li>\n: Line break;</li>
<li>\t: Tab character;</li>
<li>,: Half-width comma. </li>
    */
    @SerializedName("RecordDelimiter")
    @Expose
    private String RecordDelimiter;

    /**
    * A string inserted between fields as a separator within a single log record. Valid values:
<li>\t: Tab character;</li>
<li>,: Half-width comma;</li>
<li>;: Half-width semicolon. </li>
    */
    @SerializedName("FieldDelimiter")
    @Expose
    private String FieldDelimiter;

    /**
     * Get Predefined output format type for log delivery. Valid values:
<li>json: Use the predefined log output format JSON Lines, where fields in each log record are presented as key-value pairs;</li>
<li>csv: Use the predefined log output format csv, where fields in each log record is only presented as field values, excluding field names. </li> 
     * @return FormatType Predefined output format type for log delivery. Valid values:
<li>json: Use the predefined log output format JSON Lines, where fields in each log record are presented as key-value pairs;</li>
<li>csv: Use the predefined log output format csv, where fields in each log record is only presented as field values, excluding field names. </li>
     */
    public String getFormatType() {
        return this.FormatType;
    }

    /**
     * Set Predefined output format type for log delivery. Valid values:
<li>json: Use the predefined log output format JSON Lines, where fields in each log record are presented as key-value pairs;</li>
<li>csv: Use the predefined log output format csv, where fields in each log record is only presented as field values, excluding field names. </li>
     * @param FormatType Predefined output format type for log delivery. Valid values:
<li>json: Use the predefined log output format JSON Lines, where fields in each log record are presented as key-value pairs;</li>
<li>csv: Use the predefined log output format csv, where fields in each log record is only presented as field values, excluding field names. </li>
     */
    public void setFormatType(String FormatType) {
        this.FormatType = FormatType;
    }

    /**
     * Get A string added before each log delivery batch. Each log delivery batch may contain multiple log records. 
     * @return BatchPrefix A string added before each log delivery batch. Each log delivery batch may contain multiple log records.
     */
    public String getBatchPrefix() {
        return this.BatchPrefix;
    }

    /**
     * Set A string added before each log delivery batch. Each log delivery batch may contain multiple log records.
     * @param BatchPrefix A string added before each log delivery batch. Each log delivery batch may contain multiple log records.
     */
    public void setBatchPrefix(String BatchPrefix) {
        this.BatchPrefix = BatchPrefix;
    }

    /**
     * Get A string appended after each log delivery batch. 
     * @return BatchSuffix A string appended after each log delivery batch.
     */
    public String getBatchSuffix() {
        return this.BatchSuffix;
    }

    /**
     * Set A string appended after each log delivery batch.
     * @param BatchSuffix A string appended after each log delivery batch.
     */
    public void setBatchSuffix(String BatchSuffix) {
        this.BatchSuffix = BatchSuffix;
    }

    /**
     * Get A string added before each log record. 
     * @return RecordPrefix A string added before each log record.
     */
    public String getRecordPrefix() {
        return this.RecordPrefix;
    }

    /**
     * Set A string added before each log record.
     * @param RecordPrefix A string added before each log record.
     */
    public void setRecordPrefix(String RecordPrefix) {
        this.RecordPrefix = RecordPrefix;
    }

    /**
     * Get A string appended after each log record. 
     * @return RecordSuffix A string appended after each log record.
     */
    public String getRecordSuffix() {
        return this.RecordSuffix;
    }

    /**
     * Set A string appended after each log record.
     * @param RecordSuffix A string appended after each log record.
     */
    public void setRecordSuffix(String RecordSuffix) {
        this.RecordSuffix = RecordSuffix;
    }

    /**
     * Get A string inserted between log records as a separator. Valid values:
<li>\n: Line break;</li>
<li>\t: Tab character;</li>
<li>,: Half-width comma. </li> 
     * @return RecordDelimiter A string inserted between log records as a separator. Valid values:
<li>\n: Line break;</li>
<li>\t: Tab character;</li>
<li>,: Half-width comma. </li>
     */
    public String getRecordDelimiter() {
        return this.RecordDelimiter;
    }

    /**
     * Set A string inserted between log records as a separator. Valid values:
<li>\n: Line break;</li>
<li>\t: Tab character;</li>
<li>,: Half-width comma. </li>
     * @param RecordDelimiter A string inserted between log records as a separator. Valid values:
<li>\n: Line break;</li>
<li>\t: Tab character;</li>
<li>,: Half-width comma. </li>
     */
    public void setRecordDelimiter(String RecordDelimiter) {
        this.RecordDelimiter = RecordDelimiter;
    }

    /**
     * Get A string inserted between fields as a separator within a single log record. Valid values:
<li>\t: Tab character;</li>
<li>,: Half-width comma;</li>
<li>;: Half-width semicolon. </li> 
     * @return FieldDelimiter A string inserted between fields as a separator within a single log record. Valid values:
<li>\t: Tab character;</li>
<li>,: Half-width comma;</li>
<li>;: Half-width semicolon. </li>
     */
    public String getFieldDelimiter() {
        return this.FieldDelimiter;
    }

    /**
     * Set A string inserted between fields as a separator within a single log record. Valid values:
<li>\t: Tab character;</li>
<li>,: Half-width comma;</li>
<li>;: Half-width semicolon. </li>
     * @param FieldDelimiter A string inserted between fields as a separator within a single log record. Valid values:
<li>\t: Tab character;</li>
<li>,: Half-width comma;</li>
<li>;: Half-width semicolon. </li>
     */
    public void setFieldDelimiter(String FieldDelimiter) {
        this.FieldDelimiter = FieldDelimiter;
    }

    public LogFormat() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LogFormat(LogFormat source) {
        if (source.FormatType != null) {
            this.FormatType = new String(source.FormatType);
        }
        if (source.BatchPrefix != null) {
            this.BatchPrefix = new String(source.BatchPrefix);
        }
        if (source.BatchSuffix != null) {
            this.BatchSuffix = new String(source.BatchSuffix);
        }
        if (source.RecordPrefix != null) {
            this.RecordPrefix = new String(source.RecordPrefix);
        }
        if (source.RecordSuffix != null) {
            this.RecordSuffix = new String(source.RecordSuffix);
        }
        if (source.RecordDelimiter != null) {
            this.RecordDelimiter = new String(source.RecordDelimiter);
        }
        if (source.FieldDelimiter != null) {
            this.FieldDelimiter = new String(source.FieldDelimiter);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FormatType", this.FormatType);
        this.setParamSimple(map, prefix + "BatchPrefix", this.BatchPrefix);
        this.setParamSimple(map, prefix + "BatchSuffix", this.BatchSuffix);
        this.setParamSimple(map, prefix + "RecordPrefix", this.RecordPrefix);
        this.setParamSimple(map, prefix + "RecordSuffix", this.RecordSuffix);
        this.setParamSimple(map, prefix + "RecordDelimiter", this.RecordDelimiter);
        this.setParamSimple(map, prefix + "FieldDelimiter", this.FieldDelimiter);

    }
}

