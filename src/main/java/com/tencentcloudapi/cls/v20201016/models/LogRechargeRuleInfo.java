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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LogRechargeRuleInfo extends AbstractModel {

    /**
    * <p>Import type, support json_log: JSON logs, minimalist_log: single-line full-text log, fullregex_log: single-line full regular expression</p>
    */
    @SerializedName("RechargeType")
    @Expose
    private String RechargeType;

    /**
    * <p>Parse encoding format. 0: UTF-8 (default value), 1: GBK</p>
    */
    @SerializedName("EncodingFormat")
    @Expose
    private Long EncodingFormat;

    /**
    * <p>Use default time status. true: once enabled, current system time or Kafka message timestamp will be used as log timestamp; false: when turned off, time field in the log will be used as log timestamp. Default: true</p>
    */
    @SerializedName("DefaultTimeSwitch")
    @Expose
    private Boolean DefaultTimeSwitch;

    /**
    * <p>The whole log matching rule is valid only when RechargeType is fullregex_log.</p>
    */
    @SerializedName("LogRegex")
    @Expose
    private String LogRegex;

    /**
    * <p>Whether to upload logs that failed to be parsed. true for upload, false for not uploading.</p>
    */
    @SerializedName("UnMatchLogSwitch")
    @Expose
    private Boolean UnMatchLogSwitch;

    /**
    * <p>Key name of parsing-failed logs</p>
    */
    @SerializedName("UnMatchLogKey")
    @Expose
    private String UnMatchLogKey;

    /**
    * <p>Parsing failure log time source. 0: Current system time. 1: Kafka message timestamp.</p>
    */
    @SerializedName("UnMatchLogTimeSrc")
    @Expose
    private Long UnMatchLogTimeSrc;

    /**
    * <p>Default time source. 0: Current system time, 1: Kafka message timestamp</p>
    */
    @SerializedName("DefaultTimeSrc")
    @Expose
    private Long DefaultTimeSrc;

    /**
    * <p>Time field. Field name that represents time in logs.</p><ul><li>When DefaultTimeSwitch is false and the RechargeType data extraction mode is <code>json_log</code> JSON-file log or <code>fullregex_log</code> single-line full regex-file log, the TimeKey cannot be empty.</li></ul>
    */
    @SerializedName("TimeKey")
    @Expose
    private String TimeKey;

    /**
    * <p>Time extraction regular expression.</p><ul><li>When DefaultTimeSwitch is false and the RechargeType data extraction mode is <code>minimalist_log</code> single-line full text - file log, the TimeRegex cannot be empty.</li><li>Only need to input the regular expression for the field representing time in logs. If multiple fields are matched to, the first one will be used.<br> For example: If the original log is: message with time 2022-08-08 14:20:20, you can set the retrieval time regular expression to \d\d\d\d-\d\d-\d\d \d\d:\d\d:\d\d</li></ul>
    */
    @SerializedName("TimeRegex")
    @Expose
    private String TimeRegex;

    /**
    * <p>Time field format.</p><ul><li>When DefaultTimeSwitch is false, TimeFormat cannot be empty.</li></ul>
    */
    @SerializedName("TimeFormat")
    @Expose
    private String TimeFormat;

    /**
    * <p>Time field time zone.</p><ul><li><p>When DefaultTimeSwitch is false, TimeZone cannot be empty.</p></li><li><p>Time zone format rule<br>Prefix: Use GMT or UTC as the time zone benchmark<br>Offset:</p><ul><li><code>-</code> indicates a western time zone (later than the benchmark time)</li><li><code>+</code> indicates an eastern time zone (earlier than the benchmark time)</li><li>Format is ±HH:MM (hour:minute)</li></ul></li><li><p>Currently supported:<br><pre><code>&quot;GMT-12:00&quot; &quot;GMT-11:00&quot; &quot;GMT-10:00&quot; &quot;GMT-09:30&quot; &quot;GMT-09:00&quot; &quot;GMT-08:00&quot; &quot;GMT-07:00&quot; &quot;GMT-06:00&quot; &quot;GMT-05:00&quot; &quot;GMT-04:00&quot; &quot;GMT-03:30&quot; &quot;GMT-03:00&quot; &quot;GMT-02:00&quot; &quot;GMT-01:00&quot; &quot;GMT+00:00&quot;&quot;GMT+01:00&quot;&quot;GMT+02:00&quot;&quot;GMT+03:30&quot;&quot;GMT+04:00&quot;&quot;GMT+04:30&quot;&quot;GMT+05:00&quot;&quot;GMT+05:30&quot;&quot;GMT+05:45&quot;&quot;GMT+06:00&quot;&quot;GMT+06:30&quot;&quot;GMT+07:00&quot;&quot;GMT+08:00&quot;&quot;GMT+09:00&quot;&quot;GMT+09:30&quot;&quot;GMT+10:00&quot;&quot;GMT+10:30&quot;&quot;GMT+11:00&quot;&quot;GMT+11:30&quot;&quot;GMT+12:00&quot;&quot;GMT+12:45&quot;&quot;GMT+13:00&quot;&quot;GMT+14:00&quot;&quot;UTC-11:00&quot;&quot;UTC-10:00&quot;&quot;UTC-09:00&quot;&quot;UTC-08:00&quot;&quot;UTC-12:00&quot;&quot;UTC-07:00&quot;&quot;UTC-06:00&quot;&quot;UTC-05:00&quot;&quot;UTC-04:30&quot;&quot;UTC-04:00&quot;&quot;UTC-03:30&quot;&quot;UTC-03:00&quot;&quot;UTC-02:00&quot;&quot;UTC-01:00&quot;&quot;UTC+00:00&quot;&quot;UTC+01:00&quot;&quot;UTC+02:00&quot;&quot;UTC+03:00&quot;&quot;UTC+03:30&quot;&quot;UTC+04:00&quot;&quot;UTC+04:30&quot;&quot;UTC+05:00&quot;&quot;UTC+05:45&quot;&quot;UTC+06:00&quot;&quot;UTC+06:30&quot;&quot;UTC+07:00&quot;&quot;UTC+08:00&quot;&quot;UTC+09:00&quot;&quot;UTC+09:30&quot;&quot;UTC+10:00&quot;&quot;UTC+11:00&quot;&quot;UTC+12:00&quot;&quot;UTC+13:00&quot;</code></pre></p></li></ul>
    */
    @SerializedName("TimeZone")
    @Expose
    private String TimeZone;

    /**
    * <p>Metadata information, Kafka import supports kafka_topic, kafka_partition, kafka_offset, kafka_timestamp</p>
    */
    @SerializedName("Metadata")
    @Expose
    private String [] Metadata;

    /**
    * <p>log Key list, required when RechargeType is full_regex_log or delimiter_log.</p>
    */
    @SerializedName("Keys")
    @Expose
    private String [] Keys;

    /**
    * <p>json parsing mode, enable first level data parsing</p>
    */
    @SerializedName("ParseArray")
    @Expose
    private Boolean ParseArray;

    /**
    * <p>Delimiter parsing mode - Separator<br>This field is required when the parsing format is delimiter extraction.</p>
    */
    @SerializedName("Delimiter")
    @Expose
    private String Delimiter;

    /**
    * <p>JSON nest unfold configuration. This parameter is valid only when RechargeType is json_log. If it is not passed, it is disabled.</p>
    */
    @SerializedName("JsonExpand")
    @Expose
    private JsonExpandInfo JsonExpand;

    /**
     * Get <p>Import type, support json_log: JSON logs, minimalist_log: single-line full-text log, fullregex_log: single-line full regular expression</p> 
     * @return RechargeType <p>Import type, support json_log: JSON logs, minimalist_log: single-line full-text log, fullregex_log: single-line full regular expression</p>
     */
    public String getRechargeType() {
        return this.RechargeType;
    }

    /**
     * Set <p>Import type, support json_log: JSON logs, minimalist_log: single-line full-text log, fullregex_log: single-line full regular expression</p>
     * @param RechargeType <p>Import type, support json_log: JSON logs, minimalist_log: single-line full-text log, fullregex_log: single-line full regular expression</p>
     */
    public void setRechargeType(String RechargeType) {
        this.RechargeType = RechargeType;
    }

    /**
     * Get <p>Parse encoding format. 0: UTF-8 (default value), 1: GBK</p> 
     * @return EncodingFormat <p>Parse encoding format. 0: UTF-8 (default value), 1: GBK</p>
     */
    public Long getEncodingFormat() {
        return this.EncodingFormat;
    }

    /**
     * Set <p>Parse encoding format. 0: UTF-8 (default value), 1: GBK</p>
     * @param EncodingFormat <p>Parse encoding format. 0: UTF-8 (default value), 1: GBK</p>
     */
    public void setEncodingFormat(Long EncodingFormat) {
        this.EncodingFormat = EncodingFormat;
    }

    /**
     * Get <p>Use default time status. true: once enabled, current system time or Kafka message timestamp will be used as log timestamp; false: when turned off, time field in the log will be used as log timestamp. Default: true</p> 
     * @return DefaultTimeSwitch <p>Use default time status. true: once enabled, current system time or Kafka message timestamp will be used as log timestamp; false: when turned off, time field in the log will be used as log timestamp. Default: true</p>
     */
    public Boolean getDefaultTimeSwitch() {
        return this.DefaultTimeSwitch;
    }

    /**
     * Set <p>Use default time status. true: once enabled, current system time or Kafka message timestamp will be used as log timestamp; false: when turned off, time field in the log will be used as log timestamp. Default: true</p>
     * @param DefaultTimeSwitch <p>Use default time status. true: once enabled, current system time or Kafka message timestamp will be used as log timestamp; false: when turned off, time field in the log will be used as log timestamp. Default: true</p>
     */
    public void setDefaultTimeSwitch(Boolean DefaultTimeSwitch) {
        this.DefaultTimeSwitch = DefaultTimeSwitch;
    }

    /**
     * Get <p>The whole log matching rule is valid only when RechargeType is fullregex_log.</p> 
     * @return LogRegex <p>The whole log matching rule is valid only when RechargeType is fullregex_log.</p>
     */
    public String getLogRegex() {
        return this.LogRegex;
    }

    /**
     * Set <p>The whole log matching rule is valid only when RechargeType is fullregex_log.</p>
     * @param LogRegex <p>The whole log matching rule is valid only when RechargeType is fullregex_log.</p>
     */
    public void setLogRegex(String LogRegex) {
        this.LogRegex = LogRegex;
    }

    /**
     * Get <p>Whether to upload logs that failed to be parsed. true for upload, false for not uploading.</p> 
     * @return UnMatchLogSwitch <p>Whether to upload logs that failed to be parsed. true for upload, false for not uploading.</p>
     */
    public Boolean getUnMatchLogSwitch() {
        return this.UnMatchLogSwitch;
    }

    /**
     * Set <p>Whether to upload logs that failed to be parsed. true for upload, false for not uploading.</p>
     * @param UnMatchLogSwitch <p>Whether to upload logs that failed to be parsed. true for upload, false for not uploading.</p>
     */
    public void setUnMatchLogSwitch(Boolean UnMatchLogSwitch) {
        this.UnMatchLogSwitch = UnMatchLogSwitch;
    }

    /**
     * Get <p>Key name of parsing-failed logs</p> 
     * @return UnMatchLogKey <p>Key name of parsing-failed logs</p>
     */
    public String getUnMatchLogKey() {
        return this.UnMatchLogKey;
    }

    /**
     * Set <p>Key name of parsing-failed logs</p>
     * @param UnMatchLogKey <p>Key name of parsing-failed logs</p>
     */
    public void setUnMatchLogKey(String UnMatchLogKey) {
        this.UnMatchLogKey = UnMatchLogKey;
    }

    /**
     * Get <p>Parsing failure log time source. 0: Current system time. 1: Kafka message timestamp.</p> 
     * @return UnMatchLogTimeSrc <p>Parsing failure log time source. 0: Current system time. 1: Kafka message timestamp.</p>
     */
    public Long getUnMatchLogTimeSrc() {
        return this.UnMatchLogTimeSrc;
    }

    /**
     * Set <p>Parsing failure log time source. 0: Current system time. 1: Kafka message timestamp.</p>
     * @param UnMatchLogTimeSrc <p>Parsing failure log time source. 0: Current system time. 1: Kafka message timestamp.</p>
     */
    public void setUnMatchLogTimeSrc(Long UnMatchLogTimeSrc) {
        this.UnMatchLogTimeSrc = UnMatchLogTimeSrc;
    }

    /**
     * Get <p>Default time source. 0: Current system time, 1: Kafka message timestamp</p> 
     * @return DefaultTimeSrc <p>Default time source. 0: Current system time, 1: Kafka message timestamp</p>
     */
    public Long getDefaultTimeSrc() {
        return this.DefaultTimeSrc;
    }

    /**
     * Set <p>Default time source. 0: Current system time, 1: Kafka message timestamp</p>
     * @param DefaultTimeSrc <p>Default time source. 0: Current system time, 1: Kafka message timestamp</p>
     */
    public void setDefaultTimeSrc(Long DefaultTimeSrc) {
        this.DefaultTimeSrc = DefaultTimeSrc;
    }

    /**
     * Get <p>Time field. Field name that represents time in logs.</p><ul><li>When DefaultTimeSwitch is false and the RechargeType data extraction mode is <code>json_log</code> JSON-file log or <code>fullregex_log</code> single-line full regex-file log, the TimeKey cannot be empty.</li></ul> 
     * @return TimeKey <p>Time field. Field name that represents time in logs.</p><ul><li>When DefaultTimeSwitch is false and the RechargeType data extraction mode is <code>json_log</code> JSON-file log or <code>fullregex_log</code> single-line full regex-file log, the TimeKey cannot be empty.</li></ul>
     */
    public String getTimeKey() {
        return this.TimeKey;
    }

    /**
     * Set <p>Time field. Field name that represents time in logs.</p><ul><li>When DefaultTimeSwitch is false and the RechargeType data extraction mode is <code>json_log</code> JSON-file log or <code>fullregex_log</code> single-line full regex-file log, the TimeKey cannot be empty.</li></ul>
     * @param TimeKey <p>Time field. Field name that represents time in logs.</p><ul><li>When DefaultTimeSwitch is false and the RechargeType data extraction mode is <code>json_log</code> JSON-file log or <code>fullregex_log</code> single-line full regex-file log, the TimeKey cannot be empty.</li></ul>
     */
    public void setTimeKey(String TimeKey) {
        this.TimeKey = TimeKey;
    }

    /**
     * Get <p>Time extraction regular expression.</p><ul><li>When DefaultTimeSwitch is false and the RechargeType data extraction mode is <code>minimalist_log</code> single-line full text - file log, the TimeRegex cannot be empty.</li><li>Only need to input the regular expression for the field representing time in logs. If multiple fields are matched to, the first one will be used.<br> For example: If the original log is: message with time 2022-08-08 14:20:20, you can set the retrieval time regular expression to \d\d\d\d-\d\d-\d\d \d\d:\d\d:\d\d</li></ul> 
     * @return TimeRegex <p>Time extraction regular expression.</p><ul><li>When DefaultTimeSwitch is false and the RechargeType data extraction mode is <code>minimalist_log</code> single-line full text - file log, the TimeRegex cannot be empty.</li><li>Only need to input the regular expression for the field representing time in logs. If multiple fields are matched to, the first one will be used.<br> For example: If the original log is: message with time 2022-08-08 14:20:20, you can set the retrieval time regular expression to \d\d\d\d-\d\d-\d\d \d\d:\d\d:\d\d</li></ul>
     */
    public String getTimeRegex() {
        return this.TimeRegex;
    }

    /**
     * Set <p>Time extraction regular expression.</p><ul><li>When DefaultTimeSwitch is false and the RechargeType data extraction mode is <code>minimalist_log</code> single-line full text - file log, the TimeRegex cannot be empty.</li><li>Only need to input the regular expression for the field representing time in logs. If multiple fields are matched to, the first one will be used.<br> For example: If the original log is: message with time 2022-08-08 14:20:20, you can set the retrieval time regular expression to \d\d\d\d-\d\d-\d\d \d\d:\d\d:\d\d</li></ul>
     * @param TimeRegex <p>Time extraction regular expression.</p><ul><li>When DefaultTimeSwitch is false and the RechargeType data extraction mode is <code>minimalist_log</code> single-line full text - file log, the TimeRegex cannot be empty.</li><li>Only need to input the regular expression for the field representing time in logs. If multiple fields are matched to, the first one will be used.<br> For example: If the original log is: message with time 2022-08-08 14:20:20, you can set the retrieval time regular expression to \d\d\d\d-\d\d-\d\d \d\d:\d\d:\d\d</li></ul>
     */
    public void setTimeRegex(String TimeRegex) {
        this.TimeRegex = TimeRegex;
    }

    /**
     * Get <p>Time field format.</p><ul><li>When DefaultTimeSwitch is false, TimeFormat cannot be empty.</li></ul> 
     * @return TimeFormat <p>Time field format.</p><ul><li>When DefaultTimeSwitch is false, TimeFormat cannot be empty.</li></ul>
     */
    public String getTimeFormat() {
        return this.TimeFormat;
    }

    /**
     * Set <p>Time field format.</p><ul><li>When DefaultTimeSwitch is false, TimeFormat cannot be empty.</li></ul>
     * @param TimeFormat <p>Time field format.</p><ul><li>When DefaultTimeSwitch is false, TimeFormat cannot be empty.</li></ul>
     */
    public void setTimeFormat(String TimeFormat) {
        this.TimeFormat = TimeFormat;
    }

    /**
     * Get <p>Time field time zone.</p><ul><li><p>When DefaultTimeSwitch is false, TimeZone cannot be empty.</p></li><li><p>Time zone format rule<br>Prefix: Use GMT or UTC as the time zone benchmark<br>Offset:</p><ul><li><code>-</code> indicates a western time zone (later than the benchmark time)</li><li><code>+</code> indicates an eastern time zone (earlier than the benchmark time)</li><li>Format is ±HH:MM (hour:minute)</li></ul></li><li><p>Currently supported:<br><pre><code>&quot;GMT-12:00&quot; &quot;GMT-11:00&quot; &quot;GMT-10:00&quot; &quot;GMT-09:30&quot; &quot;GMT-09:00&quot; &quot;GMT-08:00&quot; &quot;GMT-07:00&quot; &quot;GMT-06:00&quot; &quot;GMT-05:00&quot; &quot;GMT-04:00&quot; &quot;GMT-03:30&quot; &quot;GMT-03:00&quot; &quot;GMT-02:00&quot; &quot;GMT-01:00&quot; &quot;GMT+00:00&quot;&quot;GMT+01:00&quot;&quot;GMT+02:00&quot;&quot;GMT+03:30&quot;&quot;GMT+04:00&quot;&quot;GMT+04:30&quot;&quot;GMT+05:00&quot;&quot;GMT+05:30&quot;&quot;GMT+05:45&quot;&quot;GMT+06:00&quot;&quot;GMT+06:30&quot;&quot;GMT+07:00&quot;&quot;GMT+08:00&quot;&quot;GMT+09:00&quot;&quot;GMT+09:30&quot;&quot;GMT+10:00&quot;&quot;GMT+10:30&quot;&quot;GMT+11:00&quot;&quot;GMT+11:30&quot;&quot;GMT+12:00&quot;&quot;GMT+12:45&quot;&quot;GMT+13:00&quot;&quot;GMT+14:00&quot;&quot;UTC-11:00&quot;&quot;UTC-10:00&quot;&quot;UTC-09:00&quot;&quot;UTC-08:00&quot;&quot;UTC-12:00&quot;&quot;UTC-07:00&quot;&quot;UTC-06:00&quot;&quot;UTC-05:00&quot;&quot;UTC-04:30&quot;&quot;UTC-04:00&quot;&quot;UTC-03:30&quot;&quot;UTC-03:00&quot;&quot;UTC-02:00&quot;&quot;UTC-01:00&quot;&quot;UTC+00:00&quot;&quot;UTC+01:00&quot;&quot;UTC+02:00&quot;&quot;UTC+03:00&quot;&quot;UTC+03:30&quot;&quot;UTC+04:00&quot;&quot;UTC+04:30&quot;&quot;UTC+05:00&quot;&quot;UTC+05:45&quot;&quot;UTC+06:00&quot;&quot;UTC+06:30&quot;&quot;UTC+07:00&quot;&quot;UTC+08:00&quot;&quot;UTC+09:00&quot;&quot;UTC+09:30&quot;&quot;UTC+10:00&quot;&quot;UTC+11:00&quot;&quot;UTC+12:00&quot;&quot;UTC+13:00&quot;</code></pre></p></li></ul> 
     * @return TimeZone <p>Time field time zone.</p><ul><li><p>When DefaultTimeSwitch is false, TimeZone cannot be empty.</p></li><li><p>Time zone format rule<br>Prefix: Use GMT or UTC as the time zone benchmark<br>Offset:</p><ul><li><code>-</code> indicates a western time zone (later than the benchmark time)</li><li><code>+</code> indicates an eastern time zone (earlier than the benchmark time)</li><li>Format is ±HH:MM (hour:minute)</li></ul></li><li><p>Currently supported:<br><pre><code>&quot;GMT-12:00&quot; &quot;GMT-11:00&quot; &quot;GMT-10:00&quot; &quot;GMT-09:30&quot; &quot;GMT-09:00&quot; &quot;GMT-08:00&quot; &quot;GMT-07:00&quot; &quot;GMT-06:00&quot; &quot;GMT-05:00&quot; &quot;GMT-04:00&quot; &quot;GMT-03:30&quot; &quot;GMT-03:00&quot; &quot;GMT-02:00&quot; &quot;GMT-01:00&quot; &quot;GMT+00:00&quot;&quot;GMT+01:00&quot;&quot;GMT+02:00&quot;&quot;GMT+03:30&quot;&quot;GMT+04:00&quot;&quot;GMT+04:30&quot;&quot;GMT+05:00&quot;&quot;GMT+05:30&quot;&quot;GMT+05:45&quot;&quot;GMT+06:00&quot;&quot;GMT+06:30&quot;&quot;GMT+07:00&quot;&quot;GMT+08:00&quot;&quot;GMT+09:00&quot;&quot;GMT+09:30&quot;&quot;GMT+10:00&quot;&quot;GMT+10:30&quot;&quot;GMT+11:00&quot;&quot;GMT+11:30&quot;&quot;GMT+12:00&quot;&quot;GMT+12:45&quot;&quot;GMT+13:00&quot;&quot;GMT+14:00&quot;&quot;UTC-11:00&quot;&quot;UTC-10:00&quot;&quot;UTC-09:00&quot;&quot;UTC-08:00&quot;&quot;UTC-12:00&quot;&quot;UTC-07:00&quot;&quot;UTC-06:00&quot;&quot;UTC-05:00&quot;&quot;UTC-04:30&quot;&quot;UTC-04:00&quot;&quot;UTC-03:30&quot;&quot;UTC-03:00&quot;&quot;UTC-02:00&quot;&quot;UTC-01:00&quot;&quot;UTC+00:00&quot;&quot;UTC+01:00&quot;&quot;UTC+02:00&quot;&quot;UTC+03:00&quot;&quot;UTC+03:30&quot;&quot;UTC+04:00&quot;&quot;UTC+04:30&quot;&quot;UTC+05:00&quot;&quot;UTC+05:45&quot;&quot;UTC+06:00&quot;&quot;UTC+06:30&quot;&quot;UTC+07:00&quot;&quot;UTC+08:00&quot;&quot;UTC+09:00&quot;&quot;UTC+09:30&quot;&quot;UTC+10:00&quot;&quot;UTC+11:00&quot;&quot;UTC+12:00&quot;&quot;UTC+13:00&quot;</code></pre></p></li></ul>
     */
    public String getTimeZone() {
        return this.TimeZone;
    }

    /**
     * Set <p>Time field time zone.</p><ul><li><p>When DefaultTimeSwitch is false, TimeZone cannot be empty.</p></li><li><p>Time zone format rule<br>Prefix: Use GMT or UTC as the time zone benchmark<br>Offset:</p><ul><li><code>-</code> indicates a western time zone (later than the benchmark time)</li><li><code>+</code> indicates an eastern time zone (earlier than the benchmark time)</li><li>Format is ±HH:MM (hour:minute)</li></ul></li><li><p>Currently supported:<br><pre><code>&quot;GMT-12:00&quot; &quot;GMT-11:00&quot; &quot;GMT-10:00&quot; &quot;GMT-09:30&quot; &quot;GMT-09:00&quot; &quot;GMT-08:00&quot; &quot;GMT-07:00&quot; &quot;GMT-06:00&quot; &quot;GMT-05:00&quot; &quot;GMT-04:00&quot; &quot;GMT-03:30&quot; &quot;GMT-03:00&quot; &quot;GMT-02:00&quot; &quot;GMT-01:00&quot; &quot;GMT+00:00&quot;&quot;GMT+01:00&quot;&quot;GMT+02:00&quot;&quot;GMT+03:30&quot;&quot;GMT+04:00&quot;&quot;GMT+04:30&quot;&quot;GMT+05:00&quot;&quot;GMT+05:30&quot;&quot;GMT+05:45&quot;&quot;GMT+06:00&quot;&quot;GMT+06:30&quot;&quot;GMT+07:00&quot;&quot;GMT+08:00&quot;&quot;GMT+09:00&quot;&quot;GMT+09:30&quot;&quot;GMT+10:00&quot;&quot;GMT+10:30&quot;&quot;GMT+11:00&quot;&quot;GMT+11:30&quot;&quot;GMT+12:00&quot;&quot;GMT+12:45&quot;&quot;GMT+13:00&quot;&quot;GMT+14:00&quot;&quot;UTC-11:00&quot;&quot;UTC-10:00&quot;&quot;UTC-09:00&quot;&quot;UTC-08:00&quot;&quot;UTC-12:00&quot;&quot;UTC-07:00&quot;&quot;UTC-06:00&quot;&quot;UTC-05:00&quot;&quot;UTC-04:30&quot;&quot;UTC-04:00&quot;&quot;UTC-03:30&quot;&quot;UTC-03:00&quot;&quot;UTC-02:00&quot;&quot;UTC-01:00&quot;&quot;UTC+00:00&quot;&quot;UTC+01:00&quot;&quot;UTC+02:00&quot;&quot;UTC+03:00&quot;&quot;UTC+03:30&quot;&quot;UTC+04:00&quot;&quot;UTC+04:30&quot;&quot;UTC+05:00&quot;&quot;UTC+05:45&quot;&quot;UTC+06:00&quot;&quot;UTC+06:30&quot;&quot;UTC+07:00&quot;&quot;UTC+08:00&quot;&quot;UTC+09:00&quot;&quot;UTC+09:30&quot;&quot;UTC+10:00&quot;&quot;UTC+11:00&quot;&quot;UTC+12:00&quot;&quot;UTC+13:00&quot;</code></pre></p></li></ul>
     * @param TimeZone <p>Time field time zone.</p><ul><li><p>When DefaultTimeSwitch is false, TimeZone cannot be empty.</p></li><li><p>Time zone format rule<br>Prefix: Use GMT or UTC as the time zone benchmark<br>Offset:</p><ul><li><code>-</code> indicates a western time zone (later than the benchmark time)</li><li><code>+</code> indicates an eastern time zone (earlier than the benchmark time)</li><li>Format is ±HH:MM (hour:minute)</li></ul></li><li><p>Currently supported:<br><pre><code>&quot;GMT-12:00&quot; &quot;GMT-11:00&quot; &quot;GMT-10:00&quot; &quot;GMT-09:30&quot; &quot;GMT-09:00&quot; &quot;GMT-08:00&quot; &quot;GMT-07:00&quot; &quot;GMT-06:00&quot; &quot;GMT-05:00&quot; &quot;GMT-04:00&quot; &quot;GMT-03:30&quot; &quot;GMT-03:00&quot; &quot;GMT-02:00&quot; &quot;GMT-01:00&quot; &quot;GMT+00:00&quot;&quot;GMT+01:00&quot;&quot;GMT+02:00&quot;&quot;GMT+03:30&quot;&quot;GMT+04:00&quot;&quot;GMT+04:30&quot;&quot;GMT+05:00&quot;&quot;GMT+05:30&quot;&quot;GMT+05:45&quot;&quot;GMT+06:00&quot;&quot;GMT+06:30&quot;&quot;GMT+07:00&quot;&quot;GMT+08:00&quot;&quot;GMT+09:00&quot;&quot;GMT+09:30&quot;&quot;GMT+10:00&quot;&quot;GMT+10:30&quot;&quot;GMT+11:00&quot;&quot;GMT+11:30&quot;&quot;GMT+12:00&quot;&quot;GMT+12:45&quot;&quot;GMT+13:00&quot;&quot;GMT+14:00&quot;&quot;UTC-11:00&quot;&quot;UTC-10:00&quot;&quot;UTC-09:00&quot;&quot;UTC-08:00&quot;&quot;UTC-12:00&quot;&quot;UTC-07:00&quot;&quot;UTC-06:00&quot;&quot;UTC-05:00&quot;&quot;UTC-04:30&quot;&quot;UTC-04:00&quot;&quot;UTC-03:30&quot;&quot;UTC-03:00&quot;&quot;UTC-02:00&quot;&quot;UTC-01:00&quot;&quot;UTC+00:00&quot;&quot;UTC+01:00&quot;&quot;UTC+02:00&quot;&quot;UTC+03:00&quot;&quot;UTC+03:30&quot;&quot;UTC+04:00&quot;&quot;UTC+04:30&quot;&quot;UTC+05:00&quot;&quot;UTC+05:45&quot;&quot;UTC+06:00&quot;&quot;UTC+06:30&quot;&quot;UTC+07:00&quot;&quot;UTC+08:00&quot;&quot;UTC+09:00&quot;&quot;UTC+09:30&quot;&quot;UTC+10:00&quot;&quot;UTC+11:00&quot;&quot;UTC+12:00&quot;&quot;UTC+13:00&quot;</code></pre></p></li></ul>
     */
    public void setTimeZone(String TimeZone) {
        this.TimeZone = TimeZone;
    }

    /**
     * Get <p>Metadata information, Kafka import supports kafka_topic, kafka_partition, kafka_offset, kafka_timestamp</p> 
     * @return Metadata <p>Metadata information, Kafka import supports kafka_topic, kafka_partition, kafka_offset, kafka_timestamp</p>
     */
    public String [] getMetadata() {
        return this.Metadata;
    }

    /**
     * Set <p>Metadata information, Kafka import supports kafka_topic, kafka_partition, kafka_offset, kafka_timestamp</p>
     * @param Metadata <p>Metadata information, Kafka import supports kafka_topic, kafka_partition, kafka_offset, kafka_timestamp</p>
     */
    public void setMetadata(String [] Metadata) {
        this.Metadata = Metadata;
    }

    /**
     * Get <p>log Key list, required when RechargeType is full_regex_log or delimiter_log.</p> 
     * @return Keys <p>log Key list, required when RechargeType is full_regex_log or delimiter_log.</p>
     */
    public String [] getKeys() {
        return this.Keys;
    }

    /**
     * Set <p>log Key list, required when RechargeType is full_regex_log or delimiter_log.</p>
     * @param Keys <p>log Key list, required when RechargeType is full_regex_log or delimiter_log.</p>
     */
    public void setKeys(String [] Keys) {
        this.Keys = Keys;
    }

    /**
     * Get <p>json parsing mode, enable first level data parsing</p> 
     * @return ParseArray <p>json parsing mode, enable first level data parsing</p>
     */
    public Boolean getParseArray() {
        return this.ParseArray;
    }

    /**
     * Set <p>json parsing mode, enable first level data parsing</p>
     * @param ParseArray <p>json parsing mode, enable first level data parsing</p>
     */
    public void setParseArray(Boolean ParseArray) {
        this.ParseArray = ParseArray;
    }

    /**
     * Get <p>Delimiter parsing mode - Separator<br>This field is required when the parsing format is delimiter extraction.</p> 
     * @return Delimiter <p>Delimiter parsing mode - Separator<br>This field is required when the parsing format is delimiter extraction.</p>
     */
    public String getDelimiter() {
        return this.Delimiter;
    }

    /**
     * Set <p>Delimiter parsing mode - Separator<br>This field is required when the parsing format is delimiter extraction.</p>
     * @param Delimiter <p>Delimiter parsing mode - Separator<br>This field is required when the parsing format is delimiter extraction.</p>
     */
    public void setDelimiter(String Delimiter) {
        this.Delimiter = Delimiter;
    }

    /**
     * Get <p>JSON nest unfold configuration. This parameter is valid only when RechargeType is json_log. If it is not passed, it is disabled.</p> 
     * @return JsonExpand <p>JSON nest unfold configuration. This parameter is valid only when RechargeType is json_log. If it is not passed, it is disabled.</p>
     */
    public JsonExpandInfo getJsonExpand() {
        return this.JsonExpand;
    }

    /**
     * Set <p>JSON nest unfold configuration. This parameter is valid only when RechargeType is json_log. If it is not passed, it is disabled.</p>
     * @param JsonExpand <p>JSON nest unfold configuration. This parameter is valid only when RechargeType is json_log. If it is not passed, it is disabled.</p>
     */
    public void setJsonExpand(JsonExpandInfo JsonExpand) {
        this.JsonExpand = JsonExpand;
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
        if (source.ParseArray != null) {
            this.ParseArray = new Boolean(source.ParseArray);
        }
        if (source.Delimiter != null) {
            this.Delimiter = new String(source.Delimiter);
        }
        if (source.JsonExpand != null) {
            this.JsonExpand = new JsonExpandInfo(source.JsonExpand);
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
        this.setParamSimple(map, prefix + "ParseArray", this.ParseArray);
        this.setParamSimple(map, prefix + "Delimiter", this.Delimiter);
        this.setParamObj(map, prefix + "JsonExpand.", this.JsonExpand);

    }
}

