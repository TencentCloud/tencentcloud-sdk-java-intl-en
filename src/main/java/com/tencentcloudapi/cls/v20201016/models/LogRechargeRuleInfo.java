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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LogRechargeRuleInfo extends AbstractModel {

    /**
    * Import type. Valid values: `json_log` (JSON logs), `minimalist_log` (single-line full text), and fullregex_log u200d(single-line full regex)
    */
    @SerializedName("RechargeType")
    @Expose
    private String RechargeType;

    /**
    * Encoding format. Valid values: 0 (default, UTF-8) and 1 GBK).
    */
    @SerializedName("EncodingFormat")
    @Expose
    private Long EncodingFormat;

    /**
    * Whether to use the default time. Valid values: `true` (default) and `false`.
    */
    @SerializedName("DefaultTimeSwitch")
    @Expose
    private Boolean DefaultTimeSwitch;

    /**
    * Full log matching rule, which is valid only if `RechargeType` is `fullregex_log`.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("LogRegex")
    @Expose
    private String LogRegex;

    /**
    * Whether to upload the logs that failed to be parsed. Valid values: `true` and `false`.
    */
    @SerializedName("UnMatchLogSwitch")
    @Expose
    private Boolean UnMatchLogSwitch;

    /**
    * Key of the log that failed to be parsed
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UnMatchLogKey")
    @Expose
    private String UnMatchLogKey;

    /**
    * Time source of the log that failed to be parsed. Valid values: 0 (current system time) and 1 (Kafka message timestamp).
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UnMatchLogTimeSrc")
    @Expose
    private Long UnMatchLogTimeSrc;

    /**
    * Default time source. Valid values: 0 (current system time) and 1 (Kafka message timestamp).
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DefaultTimeSrc")
    @Expose
    private Long DefaultTimeSrc;

    /**
    * Time field
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TimeKey")
    @Expose
    private String TimeKey;

    /**
    * Time regular expression
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TimeRegex")
    @Expose
    private String TimeRegex;

    /**
    * Time field format
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TimeFormat")
    @Expose
    private String TimeFormat;

    /**
    * Time zone
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TimeZone")
    @Expose
    private String TimeZone;

    /**
    * Metadata information. Kafka supports import of kafka_topic, kafka_partition, kafka_offset, and kafka_timestamp.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Metadata")
    @Expose
    private String [] Metadata;

    /**
    * List of log keys, which is required when `RechargeType` is set to `full_regex_log`
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Keys")
    @Expose
    private String [] Keys;

    /**
     * Get Import type. Valid values: `json_log` (JSON logs), `minimalist_log` (single-line full text), and fullregex_log u200d(single-line full regex) 
     * @return RechargeType Import type. Valid values: `json_log` (JSON logs), `minimalist_log` (single-line full text), and fullregex_log u200d(single-line full regex)
     */
    public String getRechargeType() {
        return this.RechargeType;
    }

    /**
     * Set Import type. Valid values: `json_log` (JSON logs), `minimalist_log` (single-line full text), and fullregex_log u200d(single-line full regex)
     * @param RechargeType Import type. Valid values: `json_log` (JSON logs), `minimalist_log` (single-line full text), and fullregex_log u200d(single-line full regex)
     */
    public void setRechargeType(String RechargeType) {
        this.RechargeType = RechargeType;
    }

    /**
     * Get Encoding format. Valid values: 0 (default, UTF-8) and 1 GBK). 
     * @return EncodingFormat Encoding format. Valid values: 0 (default, UTF-8) and 1 GBK).
     */
    public Long getEncodingFormat() {
        return this.EncodingFormat;
    }

    /**
     * Set Encoding format. Valid values: 0 (default, UTF-8) and 1 GBK).
     * @param EncodingFormat Encoding format. Valid values: 0 (default, UTF-8) and 1 GBK).
     */
    public void setEncodingFormat(Long EncodingFormat) {
        this.EncodingFormat = EncodingFormat;
    }

    /**
     * Get Whether to use the default time. Valid values: `true` (default) and `false`. 
     * @return DefaultTimeSwitch Whether to use the default time. Valid values: `true` (default) and `false`.
     */
    public Boolean getDefaultTimeSwitch() {
        return this.DefaultTimeSwitch;
    }

    /**
     * Set Whether to use the default time. Valid values: `true` (default) and `false`.
     * @param DefaultTimeSwitch Whether to use the default time. Valid values: `true` (default) and `false`.
     */
    public void setDefaultTimeSwitch(Boolean DefaultTimeSwitch) {
        this.DefaultTimeSwitch = DefaultTimeSwitch;
    }

    /**
     * Get Full log matching rule, which is valid only if `RechargeType` is `fullregex_log`.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return LogRegex Full log matching rule, which is valid only if `RechargeType` is `fullregex_log`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getLogRegex() {
        return this.LogRegex;
    }

    /**
     * Set Full log matching rule, which is valid only if `RechargeType` is `fullregex_log`.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param LogRegex Full log matching rule, which is valid only if `RechargeType` is `fullregex_log`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setLogRegex(String LogRegex) {
        this.LogRegex = LogRegex;
    }

    /**
     * Get Whether to upload the logs that failed to be parsed. Valid values: `true` and `false`. 
     * @return UnMatchLogSwitch Whether to upload the logs that failed to be parsed. Valid values: `true` and `false`.
     */
    public Boolean getUnMatchLogSwitch() {
        return this.UnMatchLogSwitch;
    }

    /**
     * Set Whether to upload the logs that failed to be parsed. Valid values: `true` and `false`.
     * @param UnMatchLogSwitch Whether to upload the logs that failed to be parsed. Valid values: `true` and `false`.
     */
    public void setUnMatchLogSwitch(Boolean UnMatchLogSwitch) {
        this.UnMatchLogSwitch = UnMatchLogSwitch;
    }

    /**
     * Get Key of the log that failed to be parsed
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return UnMatchLogKey Key of the log that failed to be parsed
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getUnMatchLogKey() {
        return this.UnMatchLogKey;
    }

    /**
     * Set Key of the log that failed to be parsed
Note: This field may return null, indicating that no valid values can be obtained.
     * @param UnMatchLogKey Key of the log that failed to be parsed
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUnMatchLogKey(String UnMatchLogKey) {
        this.UnMatchLogKey = UnMatchLogKey;
    }

    /**
     * Get Time source of the log that failed to be parsed. Valid values: 0 (current system time) and 1 (Kafka message timestamp).
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return UnMatchLogTimeSrc Time source of the log that failed to be parsed. Valid values: 0 (current system time) and 1 (Kafka message timestamp).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getUnMatchLogTimeSrc() {
        return this.UnMatchLogTimeSrc;
    }

    /**
     * Set Time source of the log that failed to be parsed. Valid values: 0 (current system time) and 1 (Kafka message timestamp).
Note: This field may return null, indicating that no valid values can be obtained.
     * @param UnMatchLogTimeSrc Time source of the log that failed to be parsed. Valid values: 0 (current system time) and 1 (Kafka message timestamp).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUnMatchLogTimeSrc(Long UnMatchLogTimeSrc) {
        this.UnMatchLogTimeSrc = UnMatchLogTimeSrc;
    }

    /**
     * Get Default time source. Valid values: 0 (current system time) and 1 (Kafka message timestamp).
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DefaultTimeSrc Default time source. Valid values: 0 (current system time) and 1 (Kafka message timestamp).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getDefaultTimeSrc() {
        return this.DefaultTimeSrc;
    }

    /**
     * Set Default time source. Valid values: 0 (current system time) and 1 (Kafka message timestamp).
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DefaultTimeSrc Default time source. Valid values: 0 (current system time) and 1 (Kafka message timestamp).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDefaultTimeSrc(Long DefaultTimeSrc) {
        this.DefaultTimeSrc = DefaultTimeSrc;
    }

    /**
     * Get Time field
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TimeKey Time field
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTimeKey() {
        return this.TimeKey;
    }

    /**
     * Set Time field
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TimeKey Time field
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTimeKey(String TimeKey) {
        this.TimeKey = TimeKey;
    }

    /**
     * Get Time regular expression
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TimeRegex Time regular expression
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTimeRegex() {
        return this.TimeRegex;
    }

    /**
     * Set Time regular expression
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TimeRegex Time regular expression
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTimeRegex(String TimeRegex) {
        this.TimeRegex = TimeRegex;
    }

    /**
     * Get Time field format
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TimeFormat Time field format
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTimeFormat() {
        return this.TimeFormat;
    }

    /**
     * Set Time field format
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TimeFormat Time field format
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTimeFormat(String TimeFormat) {
        this.TimeFormat = TimeFormat;
    }

    /**
     * Get Time zone
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TimeZone Time zone
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTimeZone() {
        return this.TimeZone;
    }

    /**
     * Set Time zone
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TimeZone Time zone
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTimeZone(String TimeZone) {
        this.TimeZone = TimeZone;
    }

    /**
     * Get Metadata information. Kafka supports import of kafka_topic, kafka_partition, kafka_offset, and kafka_timestamp.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Metadata Metadata information. Kafka supports import of kafka_topic, kafka_partition, kafka_offset, and kafka_timestamp.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getMetadata() {
        return this.Metadata;
    }

    /**
     * Set Metadata information. Kafka supports import of kafka_topic, kafka_partition, kafka_offset, and kafka_timestamp.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Metadata Metadata information. Kafka supports import of kafka_topic, kafka_partition, kafka_offset, and kafka_timestamp.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMetadata(String [] Metadata) {
        this.Metadata = Metadata;
    }

    /**
     * Get List of log keys, which is required when `RechargeType` is set to `full_regex_log`
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Keys List of log keys, which is required when `RechargeType` is set to `full_regex_log`
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getKeys() {
        return this.Keys;
    }

    /**
     * Set List of log keys, which is required when `RechargeType` is set to `full_regex_log`
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Keys List of log keys, which is required when `RechargeType` is set to `full_regex_log`
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setKeys(String [] Keys) {
        this.Keys = Keys;
    }

    public LogRechargeRuleInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LogRechargeRuleInfo(LogRechargeRuleInfo source) {
        if (source.RechargeType != null) {
            this.RechargeType = new String(source.RechargeType);
        }
        if (source.EncodingFormat != null) {
            this.EncodingFormat = new Long(source.EncodingFormat);
        }
        if (source.DefaultTimeSwitch != null) {
            this.DefaultTimeSwitch = new Boolean(source.DefaultTimeSwitch);
        }
        if (source.LogRegex != null) {
            this.LogRegex = new String(source.LogRegex);
        }
        if (source.UnMatchLogSwitch != null) {
            this.UnMatchLogSwitch = new Boolean(source.UnMatchLogSwitch);
        }
        if (source.UnMatchLogKey != null) {
            this.UnMatchLogKey = new String(source.UnMatchLogKey);
        }
        if (source.UnMatchLogTimeSrc != null) {
            this.UnMatchLogTimeSrc = new Long(source.UnMatchLogTimeSrc);
        }
        if (source.DefaultTimeSrc != null) {
            this.DefaultTimeSrc = new Long(source.DefaultTimeSrc);
        }
        if (source.TimeKey != null) {
            this.TimeKey = new String(source.TimeKey);
        }
        if (source.TimeRegex != null) {
            this.TimeRegex = new String(source.TimeRegex);
        }
        if (source.TimeFormat != null) {
            this.TimeFormat = new String(source.TimeFormat);
        }
        if (source.TimeZone != null) {
            this.TimeZone = new String(source.TimeZone);
        }
        if (source.Metadata != null) {
            this.Metadata = new String[source.Metadata.length];
            for (int i = 0; i < source.Metadata.length; i++) {
                this.Metadata[i] = new String(source.Metadata[i]);
            }
        }
        if (source.Keys != null) {
            this.Keys = new String[source.Keys.length];
            for (int i = 0; i < source.Keys.length; i++) {
                this.Keys[i] = new String(source.Keys[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RechargeType", this.RechargeType);
        this.setParamSimple(map, prefix + "EncodingFormat", this.EncodingFormat);
        this.setParamSimple(map, prefix + "DefaultTimeSwitch", this.DefaultTimeSwitch);
        this.setParamSimple(map, prefix + "LogRegex", this.LogRegex);
        this.setParamSimple(map, prefix + "UnMatchLogSwitch", this.UnMatchLogSwitch);
        this.setParamSimple(map, prefix + "UnMatchLogKey", this.UnMatchLogKey);
        this.setParamSimple(map, prefix + "UnMatchLogTimeSrc", this.UnMatchLogTimeSrc);
        this.setParamSimple(map, prefix + "DefaultTimeSrc", this.DefaultTimeSrc);
        this.setParamSimple(map, prefix + "TimeKey", this.TimeKey);
        this.setParamSimple(map, prefix + "TimeRegex", this.TimeRegex);
        this.setParamSimple(map, prefix + "TimeFormat", this.TimeFormat);
        this.setParamSimple(map, prefix + "TimeZone", this.TimeZone);
        this.setParamArraySimple(map, prefix + "Metadata.", this.Metadata);
        this.setParamArraySimple(map, prefix + "Keys.", this.Keys);

    }
}

