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
    * Import type. Valid values: `json_log` (JSON logs), `minimalist_log` (single-line full text), and fullregex_log (single-line full regex)
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
    * Use default time status. true: when enabled, current system time or Kafka message timestamp will be used as log timestamp. false: when disabled, time field in the log will be used as log timestamp. Default: true.
    */
    @SerializedName("DefaultTimeSwitch")
    @Expose
    private Boolean DefaultTimeSwitch;

    /**
    * Full log matching rule. It is valid only when RechargeType is fullregex_log.
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
    * key name of parsing-failed logs
    */
    @SerializedName("UnMatchLogKey")
    @Expose
    private String UnMatchLogKey;

    /**
    * Time source for parsing failure logs. 0: current time of the system; 1: Kafka message timestamp.
    */
    @SerializedName("UnMatchLogTimeSrc")
    @Expose
    private Long UnMatchLogTimeSrc;

    /**
    * Default time source. 0: Current system time; 1: Kafka message timestamp.
    */
    @SerializedName("DefaultTimeSrc")
    @Expose
    private Long DefaultTimeSrc;

    /**
    * Time field. Field name representing time in logs.

-When DefaultTimeSwitch is false and RechargeType data extraction mode is `json_log` JSON file log or `fullregex_log` single-line full regex file log, TimeKey cannot be empty.
    */
    @SerializedName("TimeKey")
    @Expose
    private String TimeKey;

    /**
    * Time extraction regular expression.
-When DefaultTimeSwitch is false and the data extraction mode of RechargeType is `minimalist_log` (single-line full text - file log), TimeRegex cannot be empty.
-Only need to input the regular expression representing the time field in logs. If multiple fields are matched to, the first will be used.
Example: The original log is "message with time 2022-08-08 14:20:20". You can set the retrieval time regex to \d\d\d\d-\d\d-\d\d \d\d:\d\d:\d\d.

    */
    @SerializedName("TimeRegex")
    @Expose
    private String TimeRegex;

    /**
    * Time field format.
-When DefaultTimeSwitch is false, TimeFormat cannot be empty.
    */
    @SerializedName("TimeFormat")
    @Expose
    private String TimeFormat;

    /**
    * Time field time zone.
-When DefaultTimeSwitch is false, TimeZone cannot be empty.
-Time zone format rule
Prefix: Use GMT or UTC as the time zone benchmark.
Offset:
-`-` indicates a western time zone (later than the benchmark time).
-`+` means the east time zone (earlier than the benchmark time).
-Format ±HH:MM (hr:min)

-Currently supported:
```
"GMT-12:00" 
"GMT-11:00" 
"GMT-10:00" 
"GMT-09:30" 
"GMT-09:00" 
"GMT-08:00" 
"GMT-07:00" 
"GMT-06:00" 
"GMT-05:00" 
"GMT-04:00" 
"GMT-03:30" 
"GMT-03:00" 
"GMT-02:00" 
"GMT-01:00" 
"GMT+00:00"
"GMT+01:00"
"GMT+02:00"
"GMT+03:30"
"GMT+04:00"
"GMT+04:30"
"GMT+05:00"
"GMT+05:30"
"GMT+05:45"
"GMT+06:00"
"GMT+06:30"
"GMT+07:00"
"GMT+08:00"
"GMT+09:00"
"GMT+09:30"
"GMT+10:00"
"GMT+10:30"
"GMT+11:00"
"GMT+11:30"
"GMT+12:00"
"GMT+12:45"
"GMT+13:00"
"GMT+14:00"
"UTC-11:00"
"UTC-10:00"
"UTC-09:00"
"UTC-08:00"
"UTC-12:00"
"UTC-07:00"
"UTC-06:00"
"UTC-05:00"
"UTC-04:30"
"UTC-04:00"
"UTC-03:30"
"UTC-03:00"
"UTC-02:00"
"UTC-01:00"
"UTC+00:00"
"UTC+01:00"
"UTC+02:00"
"UTC+03:00"
"UTC+03:30"
"UTC+04:00"
"UTC+04:30"
"UTC+05:00"
"UTC+05:45"
"UTC+06:00"
"UTC+06:30"
"UTC+07:00"
"UTC+08:00"
"UTC+09:00"
"UTC+09:30"
"UTC+10:00"
"UTC+11:00"
"UTC+12:00"
"UTC+13:00"
```
    */
    @SerializedName("TimeZone")
    @Expose
    private String TimeZone;

    /**
    * Metadata information. Kafka import supports kafka_topic, kafka_partition, kafka_offset, and kafka_timestamp.
    */
    @SerializedName("Metadata")
    @Expose
    private String [] Metadata;

    /**
    * log Key list. It is required when RechargeType is full_regex_log or delimiter_log.
    */
    @SerializedName("Keys")
    @Expose
    private String [] Keys;

    /**
    * JSON parsing mode. The first-level data parsing is enabled.
    */
    @SerializedName("ParseArray")
    @Expose
    private Boolean ParseArray;

    /**
    * Delimiter parsing mode - Separator
This field is required when the parsing format is delimiter extraction.
    */
    @SerializedName("Delimiter")
    @Expose
    private String Delimiter;

    /**
     * Get Import type. Valid values: `json_log` (JSON logs), `minimalist_log` (single-line full text), and fullregex_log (single-line full regex) 
     * @return RechargeType Import type. Valid values: `json_log` (JSON logs), `minimalist_log` (single-line full text), and fullregex_log (single-line full regex)
     */
    public String getRechargeType() {
        return this.RechargeType;
    }

    /**
     * Set Import type. Valid values: `json_log` (JSON logs), `minimalist_log` (single-line full text), and fullregex_log (single-line full regex)
     * @param RechargeType Import type. Valid values: `json_log` (JSON logs), `minimalist_log` (single-line full text), and fullregex_log (single-line full regex)
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
     * Get Use default time status. true: when enabled, current system time or Kafka message timestamp will be used as log timestamp. false: when disabled, time field in the log will be used as log timestamp. Default: true. 
     * @return DefaultTimeSwitch Use default time status. true: when enabled, current system time or Kafka message timestamp will be used as log timestamp. false: when disabled, time field in the log will be used as log timestamp. Default: true.
     */
    public Boolean getDefaultTimeSwitch() {
        return this.DefaultTimeSwitch;
    }

    /**
     * Set Use default time status. true: when enabled, current system time or Kafka message timestamp will be used as log timestamp. false: when disabled, time field in the log will be used as log timestamp. Default: true.
     * @param DefaultTimeSwitch Use default time status. true: when enabled, current system time or Kafka message timestamp will be used as log timestamp. false: when disabled, time field in the log will be used as log timestamp. Default: true.
     */
    public void setDefaultTimeSwitch(Boolean DefaultTimeSwitch) {
        this.DefaultTimeSwitch = DefaultTimeSwitch;
    }

    /**
     * Get Full log matching rule. It is valid only when RechargeType is fullregex_log. 
     * @return LogRegex Full log matching rule. It is valid only when RechargeType is fullregex_log.
     */
    public String getLogRegex() {
        return this.LogRegex;
    }

    /**
     * Set Full log matching rule. It is valid only when RechargeType is fullregex_log.
     * @param LogRegex Full log matching rule. It is valid only when RechargeType is fullregex_log.
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
     * Get key name of parsing-failed logs 
     * @return UnMatchLogKey key name of parsing-failed logs
     */
    public String getUnMatchLogKey() {
        return this.UnMatchLogKey;
    }

    /**
     * Set key name of parsing-failed logs
     * @param UnMatchLogKey key name of parsing-failed logs
     */
    public void setUnMatchLogKey(String UnMatchLogKey) {
        this.UnMatchLogKey = UnMatchLogKey;
    }

    /**
     * Get Time source for parsing failure logs. 0: current time of the system; 1: Kafka message timestamp. 
     * @return UnMatchLogTimeSrc Time source for parsing failure logs. 0: current time of the system; 1: Kafka message timestamp.
     */
    public Long getUnMatchLogTimeSrc() {
        return this.UnMatchLogTimeSrc;
    }

    /**
     * Set Time source for parsing failure logs. 0: current time of the system; 1: Kafka message timestamp.
     * @param UnMatchLogTimeSrc Time source for parsing failure logs. 0: current time of the system; 1: Kafka message timestamp.
     */
    public void setUnMatchLogTimeSrc(Long UnMatchLogTimeSrc) {
        this.UnMatchLogTimeSrc = UnMatchLogTimeSrc;
    }

    /**
     * Get Default time source. 0: Current system time; 1: Kafka message timestamp. 
     * @return DefaultTimeSrc Default time source. 0: Current system time; 1: Kafka message timestamp.
     */
    public Long getDefaultTimeSrc() {
        return this.DefaultTimeSrc;
    }

    /**
     * Set Default time source. 0: Current system time; 1: Kafka message timestamp.
     * @param DefaultTimeSrc Default time source. 0: Current system time; 1: Kafka message timestamp.
     */
    public void setDefaultTimeSrc(Long DefaultTimeSrc) {
        this.DefaultTimeSrc = DefaultTimeSrc;
    }

    /**
     * Get Time field. Field name representing time in logs.

-When DefaultTimeSwitch is false and RechargeType data extraction mode is `json_log` JSON file log or `fullregex_log` single-line full regex file log, TimeKey cannot be empty. 
     * @return TimeKey Time field. Field name representing time in logs.

-When DefaultTimeSwitch is false and RechargeType data extraction mode is `json_log` JSON file log or `fullregex_log` single-line full regex file log, TimeKey cannot be empty.
     */
    public String getTimeKey() {
        return this.TimeKey;
    }

    /**
     * Set Time field. Field name representing time in logs.

-When DefaultTimeSwitch is false and RechargeType data extraction mode is `json_log` JSON file log or `fullregex_log` single-line full regex file log, TimeKey cannot be empty.
     * @param TimeKey Time field. Field name representing time in logs.

-When DefaultTimeSwitch is false and RechargeType data extraction mode is `json_log` JSON file log or `fullregex_log` single-line full regex file log, TimeKey cannot be empty.
     */
    public void setTimeKey(String TimeKey) {
        this.TimeKey = TimeKey;
    }

    /**
     * Get Time extraction regular expression.
-When DefaultTimeSwitch is false and the data extraction mode of RechargeType is `minimalist_log` (single-line full text - file log), TimeRegex cannot be empty.
-Only need to input the regular expression representing the time field in logs. If multiple fields are matched to, the first will be used.
Example: The original log is "message with time 2022-08-08 14:20:20". You can set the retrieval time regex to \d\d\d\d-\d\d-\d\d \d\d:\d\d:\d\d.
 
     * @return TimeRegex Time extraction regular expression.
-When DefaultTimeSwitch is false and the data extraction mode of RechargeType is `minimalist_log` (single-line full text - file log), TimeRegex cannot be empty.
-Only need to input the regular expression representing the time field in logs. If multiple fields are matched to, the first will be used.
Example: The original log is "message with time 2022-08-08 14:20:20". You can set the retrieval time regex to \d\d\d\d-\d\d-\d\d \d\d:\d\d:\d\d.

     */
    public String getTimeRegex() {
        return this.TimeRegex;
    }

    /**
     * Set Time extraction regular expression.
-When DefaultTimeSwitch is false and the data extraction mode of RechargeType is `minimalist_log` (single-line full text - file log), TimeRegex cannot be empty.
-Only need to input the regular expression representing the time field in logs. If multiple fields are matched to, the first will be used.
Example: The original log is "message with time 2022-08-08 14:20:20". You can set the retrieval time regex to \d\d\d\d-\d\d-\d\d \d\d:\d\d:\d\d.

     * @param TimeRegex Time extraction regular expression.
-When DefaultTimeSwitch is false and the data extraction mode of RechargeType is `minimalist_log` (single-line full text - file log), TimeRegex cannot be empty.
-Only need to input the regular expression representing the time field in logs. If multiple fields are matched to, the first will be used.
Example: The original log is "message with time 2022-08-08 14:20:20". You can set the retrieval time regex to \d\d\d\d-\d\d-\d\d \d\d:\d\d:\d\d.

     */
    public void setTimeRegex(String TimeRegex) {
        this.TimeRegex = TimeRegex;
    }

    /**
     * Get Time field format.
-When DefaultTimeSwitch is false, TimeFormat cannot be empty. 
     * @return TimeFormat Time field format.
-When DefaultTimeSwitch is false, TimeFormat cannot be empty.
     */
    public String getTimeFormat() {
        return this.TimeFormat;
    }

    /**
     * Set Time field format.
-When DefaultTimeSwitch is false, TimeFormat cannot be empty.
     * @param TimeFormat Time field format.
-When DefaultTimeSwitch is false, TimeFormat cannot be empty.
     */
    public void setTimeFormat(String TimeFormat) {
        this.TimeFormat = TimeFormat;
    }

    /**
     * Get Time field time zone.
-When DefaultTimeSwitch is false, TimeZone cannot be empty.
-Time zone format rule
Prefix: Use GMT or UTC as the time zone benchmark.
Offset:
-`-` indicates a western time zone (later than the benchmark time).
-`+` means the east time zone (earlier than the benchmark time).
-Format ±HH:MM (hr:min)

-Currently supported:
```
"GMT-12:00" 
"GMT-11:00" 
"GMT-10:00" 
"GMT-09:30" 
"GMT-09:00" 
"GMT-08:00" 
"GMT-07:00" 
"GMT-06:00" 
"GMT-05:00" 
"GMT-04:00" 
"GMT-03:30" 
"GMT-03:00" 
"GMT-02:00" 
"GMT-01:00" 
"GMT+00:00"
"GMT+01:00"
"GMT+02:00"
"GMT+03:30"
"GMT+04:00"
"GMT+04:30"
"GMT+05:00"
"GMT+05:30"
"GMT+05:45"
"GMT+06:00"
"GMT+06:30"
"GMT+07:00"
"GMT+08:00"
"GMT+09:00"
"GMT+09:30"
"GMT+10:00"
"GMT+10:30"
"GMT+11:00"
"GMT+11:30"
"GMT+12:00"
"GMT+12:45"
"GMT+13:00"
"GMT+14:00"
"UTC-11:00"
"UTC-10:00"
"UTC-09:00"
"UTC-08:00"
"UTC-12:00"
"UTC-07:00"
"UTC-06:00"
"UTC-05:00"
"UTC-04:30"
"UTC-04:00"
"UTC-03:30"
"UTC-03:00"
"UTC-02:00"
"UTC-01:00"
"UTC+00:00"
"UTC+01:00"
"UTC+02:00"
"UTC+03:00"
"UTC+03:30"
"UTC+04:00"
"UTC+04:30"
"UTC+05:00"
"UTC+05:45"
"UTC+06:00"
"UTC+06:30"
"UTC+07:00"
"UTC+08:00"
"UTC+09:00"
"UTC+09:30"
"UTC+10:00"
"UTC+11:00"
"UTC+12:00"
"UTC+13:00"
``` 
     * @return TimeZone Time field time zone.
-When DefaultTimeSwitch is false, TimeZone cannot be empty.
-Time zone format rule
Prefix: Use GMT or UTC as the time zone benchmark.
Offset:
-`-` indicates a western time zone (later than the benchmark time).
-`+` means the east time zone (earlier than the benchmark time).
-Format ±HH:MM (hr:min)

-Currently supported:
```
"GMT-12:00" 
"GMT-11:00" 
"GMT-10:00" 
"GMT-09:30" 
"GMT-09:00" 
"GMT-08:00" 
"GMT-07:00" 
"GMT-06:00" 
"GMT-05:00" 
"GMT-04:00" 
"GMT-03:30" 
"GMT-03:00" 
"GMT-02:00" 
"GMT-01:00" 
"GMT+00:00"
"GMT+01:00"
"GMT+02:00"
"GMT+03:30"
"GMT+04:00"
"GMT+04:30"
"GMT+05:00"
"GMT+05:30"
"GMT+05:45"
"GMT+06:00"
"GMT+06:30"
"GMT+07:00"
"GMT+08:00"
"GMT+09:00"
"GMT+09:30"
"GMT+10:00"
"GMT+10:30"
"GMT+11:00"
"GMT+11:30"
"GMT+12:00"
"GMT+12:45"
"GMT+13:00"
"GMT+14:00"
"UTC-11:00"
"UTC-10:00"
"UTC-09:00"
"UTC-08:00"
"UTC-12:00"
"UTC-07:00"
"UTC-06:00"
"UTC-05:00"
"UTC-04:30"
"UTC-04:00"
"UTC-03:30"
"UTC-03:00"
"UTC-02:00"
"UTC-01:00"
"UTC+00:00"
"UTC+01:00"
"UTC+02:00"
"UTC+03:00"
"UTC+03:30"
"UTC+04:00"
"UTC+04:30"
"UTC+05:00"
"UTC+05:45"
"UTC+06:00"
"UTC+06:30"
"UTC+07:00"
"UTC+08:00"
"UTC+09:00"
"UTC+09:30"
"UTC+10:00"
"UTC+11:00"
"UTC+12:00"
"UTC+13:00"
```
     */
    public String getTimeZone() {
        return this.TimeZone;
    }

    /**
     * Set Time field time zone.
-When DefaultTimeSwitch is false, TimeZone cannot be empty.
-Time zone format rule
Prefix: Use GMT or UTC as the time zone benchmark.
Offset:
-`-` indicates a western time zone (later than the benchmark time).
-`+` means the east time zone (earlier than the benchmark time).
-Format ±HH:MM (hr:min)

-Currently supported:
```
"GMT-12:00" 
"GMT-11:00" 
"GMT-10:00" 
"GMT-09:30" 
"GMT-09:00" 
"GMT-08:00" 
"GMT-07:00" 
"GMT-06:00" 
"GMT-05:00" 
"GMT-04:00" 
"GMT-03:30" 
"GMT-03:00" 
"GMT-02:00" 
"GMT-01:00" 
"GMT+00:00"
"GMT+01:00"
"GMT+02:00"
"GMT+03:30"
"GMT+04:00"
"GMT+04:30"
"GMT+05:00"
"GMT+05:30"
"GMT+05:45"
"GMT+06:00"
"GMT+06:30"
"GMT+07:00"
"GMT+08:00"
"GMT+09:00"
"GMT+09:30"
"GMT+10:00"
"GMT+10:30"
"GMT+11:00"
"GMT+11:30"
"GMT+12:00"
"GMT+12:45"
"GMT+13:00"
"GMT+14:00"
"UTC-11:00"
"UTC-10:00"
"UTC-09:00"
"UTC-08:00"
"UTC-12:00"
"UTC-07:00"
"UTC-06:00"
"UTC-05:00"
"UTC-04:30"
"UTC-04:00"
"UTC-03:30"
"UTC-03:00"
"UTC-02:00"
"UTC-01:00"
"UTC+00:00"
"UTC+01:00"
"UTC+02:00"
"UTC+03:00"
"UTC+03:30"
"UTC+04:00"
"UTC+04:30"
"UTC+05:00"
"UTC+05:45"
"UTC+06:00"
"UTC+06:30"
"UTC+07:00"
"UTC+08:00"
"UTC+09:00"
"UTC+09:30"
"UTC+10:00"
"UTC+11:00"
"UTC+12:00"
"UTC+13:00"
```
     * @param TimeZone Time field time zone.
-When DefaultTimeSwitch is false, TimeZone cannot be empty.
-Time zone format rule
Prefix: Use GMT or UTC as the time zone benchmark.
Offset:
-`-` indicates a western time zone (later than the benchmark time).
-`+` means the east time zone (earlier than the benchmark time).
-Format ±HH:MM (hr:min)

-Currently supported:
```
"GMT-12:00" 
"GMT-11:00" 
"GMT-10:00" 
"GMT-09:30" 
"GMT-09:00" 
"GMT-08:00" 
"GMT-07:00" 
"GMT-06:00" 
"GMT-05:00" 
"GMT-04:00" 
"GMT-03:30" 
"GMT-03:00" 
"GMT-02:00" 
"GMT-01:00" 
"GMT+00:00"
"GMT+01:00"
"GMT+02:00"
"GMT+03:30"
"GMT+04:00"
"GMT+04:30"
"GMT+05:00"
"GMT+05:30"
"GMT+05:45"
"GMT+06:00"
"GMT+06:30"
"GMT+07:00"
"GMT+08:00"
"GMT+09:00"
"GMT+09:30"
"GMT+10:00"
"GMT+10:30"
"GMT+11:00"
"GMT+11:30"
"GMT+12:00"
"GMT+12:45"
"GMT+13:00"
"GMT+14:00"
"UTC-11:00"
"UTC-10:00"
"UTC-09:00"
"UTC-08:00"
"UTC-12:00"
"UTC-07:00"
"UTC-06:00"
"UTC-05:00"
"UTC-04:30"
"UTC-04:00"
"UTC-03:30"
"UTC-03:00"
"UTC-02:00"
"UTC-01:00"
"UTC+00:00"
"UTC+01:00"
"UTC+02:00"
"UTC+03:00"
"UTC+03:30"
"UTC+04:00"
"UTC+04:30"
"UTC+05:00"
"UTC+05:45"
"UTC+06:00"
"UTC+06:30"
"UTC+07:00"
"UTC+08:00"
"UTC+09:00"
"UTC+09:30"
"UTC+10:00"
"UTC+11:00"
"UTC+12:00"
"UTC+13:00"
```
     */
    public void setTimeZone(String TimeZone) {
        this.TimeZone = TimeZone;
    }

    /**
     * Get Metadata information. Kafka import supports kafka_topic, kafka_partition, kafka_offset, and kafka_timestamp. 
     * @return Metadata Metadata information. Kafka import supports kafka_topic, kafka_partition, kafka_offset, and kafka_timestamp.
     */
    public String [] getMetadata() {
        return this.Metadata;
    }

    /**
     * Set Metadata information. Kafka import supports kafka_topic, kafka_partition, kafka_offset, and kafka_timestamp.
     * @param Metadata Metadata information. Kafka import supports kafka_topic, kafka_partition, kafka_offset, and kafka_timestamp.
     */
    public void setMetadata(String [] Metadata) {
        this.Metadata = Metadata;
    }

    /**
     * Get log Key list. It is required when RechargeType is full_regex_log or delimiter_log. 
     * @return Keys log Key list. It is required when RechargeType is full_regex_log or delimiter_log.
     */
    public String [] getKeys() {
        return this.Keys;
    }

    /**
     * Set log Key list. It is required when RechargeType is full_regex_log or delimiter_log.
     * @param Keys log Key list. It is required when RechargeType is full_regex_log or delimiter_log.
     */
    public void setKeys(String [] Keys) {
        this.Keys = Keys;
    }

    /**
     * Get JSON parsing mode. The first-level data parsing is enabled. 
     * @return ParseArray JSON parsing mode. The first-level data parsing is enabled.
     */
    public Boolean getParseArray() {
        return this.ParseArray;
    }

    /**
     * Set JSON parsing mode. The first-level data parsing is enabled.
     * @param ParseArray JSON parsing mode. The first-level data parsing is enabled.
     */
    public void setParseArray(Boolean ParseArray) {
        this.ParseArray = ParseArray;
    }

    /**
     * Get Delimiter parsing mode - Separator
This field is required when the parsing format is delimiter extraction. 
     * @return Delimiter Delimiter parsing mode - Separator
This field is required when the parsing format is delimiter extraction.
     */
    public String getDelimiter() {
        return this.Delimiter;
    }

    /**
     * Set Delimiter parsing mode - Separator
This field is required when the parsing format is delimiter extraction.
     * @param Delimiter Delimiter parsing mode - Separator
This field is required when the parsing format is delimiter extraction.
     */
    public void setDelimiter(String Delimiter) {
        this.Delimiter = Delimiter;
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

    }
}

