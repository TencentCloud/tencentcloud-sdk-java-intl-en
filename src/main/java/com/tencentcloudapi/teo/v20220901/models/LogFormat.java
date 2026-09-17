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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LogFormat extends AbstractModel {

    /**
    * <p>Log output format. Valid values:</p><ul><li>json: Use the predefined log output format JSON Lines, where each log entry is presented as key-value pairs;</li><li>csv: Use the predefined log output format CSV, where each log entry presents only field values, not field names.</li><li>template: Use a user-customized output template. Each log entry supports custom layout and concatenation based on the custom template, in conjunction with the RecordTemplate field.</li></ul>
    */
    @SerializedName("FormatType")
    @Expose
    private String FormatType;

    /**
    * <p>A string added before each log delivery batch. Each log delivery batch may contain multiple log records.</p>
    */
    @SerializedName("BatchPrefix")
    @Expose
    private String BatchPrefix;

    /**
    * <p>A string appended after each log delivery batch.</p>
    */
    @SerializedName("BatchSuffix")
    @Expose
    private String BatchSuffix;

    /**
    * <p>Log prefix, a string added before each log record.</p>
    */
    @SerializedName("RecordPrefix")
    @Expose
    private String RecordPrefix;

    /**
    * <p>Single-line log suffix, a string appended after each log record.</p>
    */
    @SerializedName("RecordSuffix")
    @Expose
    private String RecordSuffix;

    /**
    * <p>Log separator, a string inserted between log records as a separator. Valid values:</p><ul><li>\n: line break;</li><li>\t: tab character;</li><li>,: half-width comma.</li></ul>
    */
    @SerializedName("RecordDelimiter")
    @Expose
    private String RecordDelimiter;

    /**
    * <p>Log template, output template for a single log, length limited to 4KB, takes effect only when FormatType = template. Supports custom layout and concatenation of configured push fields according to the template.</p>
    */
    @SerializedName("RecordTemplate")
    @Expose
    private String RecordTemplate;

    /**
    * <p>Field separator, a string inserted between fields within a single log record as a separator. It takes effect only when FormatType = csv. Valid values:</p><ul><li>\t: tab character;</li><li>,: half-width comma;</li><li>;: half-width semicolon.</li></ul>
    */
    @SerializedName("FieldDelimiter")
    @Expose
    private String FieldDelimiter;

    /**
     * Get <p>Log output format. Valid values:</p><ul><li>json: Use the predefined log output format JSON Lines, where each log entry is presented as key-value pairs;</li><li>csv: Use the predefined log output format CSV, where each log entry presents only field values, not field names.</li><li>template: Use a user-customized output template. Each log entry supports custom layout and concatenation based on the custom template, in conjunction with the RecordTemplate field.</li></ul> 
     * @return FormatType <p>Log output format. Valid values:</p><ul><li>json: Use the predefined log output format JSON Lines, where each log entry is presented as key-value pairs;</li><li>csv: Use the predefined log output format CSV, where each log entry presents only field values, not field names.</li><li>template: Use a user-customized output template. Each log entry supports custom layout and concatenation based on the custom template, in conjunction with the RecordTemplate field.</li></ul>
     */
    public String getFormatType() {
        return this.FormatType;
    }

    /**
     * Set <p>Log output format. Valid values:</p><ul><li>json: Use the predefined log output format JSON Lines, where each log entry is presented as key-value pairs;</li><li>csv: Use the predefined log output format CSV, where each log entry presents only field values, not field names.</li><li>template: Use a user-customized output template. Each log entry supports custom layout and concatenation based on the custom template, in conjunction with the RecordTemplate field.</li></ul>
     * @param FormatType <p>Log output format. Valid values:</p><ul><li>json: Use the predefined log output format JSON Lines, where each log entry is presented as key-value pairs;</li><li>csv: Use the predefined log output format CSV, where each log entry presents only field values, not field names.</li><li>template: Use a user-customized output template. Each log entry supports custom layout and concatenation based on the custom template, in conjunction with the RecordTemplate field.</li></ul>
     */
    public void setFormatType(String FormatType) {
        this.FormatType = FormatType;
    }

    /**
     * Get <p>A string added before each log delivery batch. Each log delivery batch may contain multiple log records.</p> 
     * @return BatchPrefix <p>A string added before each log delivery batch. Each log delivery batch may contain multiple log records.</p>
     */
    public String getBatchPrefix() {
        return this.BatchPrefix;
    }

    /**
     * Set <p>A string added before each log delivery batch. Each log delivery batch may contain multiple log records.</p>
     * @param BatchPrefix <p>A string added before each log delivery batch. Each log delivery batch may contain multiple log records.</p>
     */
    public void setBatchPrefix(String BatchPrefix) {
        this.BatchPrefix = BatchPrefix;
    }

    /**
     * Get <p>A string appended after each log delivery batch.</p> 
     * @return BatchSuffix <p>A string appended after each log delivery batch.</p>
     */
    public String getBatchSuffix() {
        return this.BatchSuffix;
    }

    /**
     * Set <p>A string appended after each log delivery batch.</p>
     * @param BatchSuffix <p>A string appended after each log delivery batch.</p>
     */
    public void setBatchSuffix(String BatchSuffix) {
        this.BatchSuffix = BatchSuffix;
    }

    /**
     * Get <p>Log prefix, a string added before each log record.</p> 
     * @return RecordPrefix <p>Log prefix, a string added before each log record.</p>
     */
    public String getRecordPrefix() {
        return this.RecordPrefix;
    }

    /**
     * Set <p>Log prefix, a string added before each log record.</p>
     * @param RecordPrefix <p>Log prefix, a string added before each log record.</p>
     */
    public void setRecordPrefix(String RecordPrefix) {
        this.RecordPrefix = RecordPrefix;
    }

    /**
     * Get <p>Single-line log suffix, a string appended after each log record.</p> 
     * @return RecordSuffix <p>Single-line log suffix, a string appended after each log record.</p>
     */
    public String getRecordSuffix() {
        return this.RecordSuffix;
    }

    /**
     * Set <p>Single-line log suffix, a string appended after each log record.</p>
     * @param RecordSuffix <p>Single-line log suffix, a string appended after each log record.</p>
     */
    public void setRecordSuffix(String RecordSuffix) {
        this.RecordSuffix = RecordSuffix;
    }

    /**
     * Get <p>Log separator, a string inserted between log records as a separator. Valid values:</p><ul><li>\n: line break;</li><li>\t: tab character;</li><li>,: half-width comma.</li></ul> 
     * @return RecordDelimiter <p>Log separator, a string inserted between log records as a separator. Valid values:</p><ul><li>\n: line break;</li><li>\t: tab character;</li><li>,: half-width comma.</li></ul>
     */
    public String getRecordDelimiter() {
        return this.RecordDelimiter;
    }

    /**
     * Set <p>Log separator, a string inserted between log records as a separator. Valid values:</p><ul><li>\n: line break;</li><li>\t: tab character;</li><li>,: half-width comma.</li></ul>
     * @param RecordDelimiter <p>Log separator, a string inserted between log records as a separator. Valid values:</p><ul><li>\n: line break;</li><li>\t: tab character;</li><li>,: half-width comma.</li></ul>
     */
    public void setRecordDelimiter(String RecordDelimiter) {
        this.RecordDelimiter = RecordDelimiter;
    }

    /**
     * Get <p>Log template, output template for a single log, length limited to 4KB, takes effect only when FormatType = template. Supports custom layout and concatenation of configured push fields according to the template.</p> 
     * @return RecordTemplate <p>Log template, output template for a single log, length limited to 4KB, takes effect only when FormatType = template. Supports custom layout and concatenation of configured push fields according to the template.</p>
     */
    public String getRecordTemplate() {
        return this.RecordTemplate;
    }

    /**
     * Set <p>Log template, output template for a single log, length limited to 4KB, takes effect only when FormatType = template. Supports custom layout and concatenation of configured push fields according to the template.</p>
     * @param RecordTemplate <p>Log template, output template for a single log, length limited to 4KB, takes effect only when FormatType = template. Supports custom layout and concatenation of configured push fields according to the template.</p>
     */
    public void setRecordTemplate(String RecordTemplate) {
        this.RecordTemplate = RecordTemplate;
    }

    /**
     * Get <p>Field separator, a string inserted between fields within a single log record as a separator. It takes effect only when FormatType = csv. Valid values:</p><ul><li>\t: tab character;</li><li>,: half-width comma;</li><li>;: half-width semicolon.</li></ul> 
     * @return FieldDelimiter <p>Field separator, a string inserted between fields within a single log record as a separator. It takes effect only when FormatType = csv. Valid values:</p><ul><li>\t: tab character;</li><li>,: half-width comma;</li><li>;: half-width semicolon.</li></ul>
     */
    public String getFieldDelimiter() {
        return this.FieldDelimiter;
    }

    /**
     * Set <p>Field separator, a string inserted between fields within a single log record as a separator. It takes effect only when FormatType = csv. Valid values:</p><ul><li>\t: tab character;</li><li>,: half-width comma;</li><li>;: half-width semicolon.</li></ul>
     * @param FieldDelimiter <p>Field separator, a string inserted between fields within a single log record as a separator. It takes effect only when FormatType = csv. Valid values:</p><ul><li>\t: tab character;</li><li>,: half-width comma;</li><li>;: half-width semicolon.</li></ul>
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
        if (source.RecordTemplate != null) {
            this.RecordTemplate = new String(source.RecordTemplate);
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
        this.setParamSimple(map, prefix + "RecordTemplate", this.RecordTemplate);
        this.setParamSimple(map, prefix + "FieldDelimiter", this.FieldDelimiter);

    }
}

