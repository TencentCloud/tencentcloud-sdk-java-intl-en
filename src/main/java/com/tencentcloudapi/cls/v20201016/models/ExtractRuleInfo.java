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

public class ExtractRuleInfo extends AbstractModel {

    /**
    * Key name for the time field. TikeKey and TimeFormat must appear in pairsNote: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TimeKey")
    @Expose
    private String TimeKey;

    /**
    * Time field format. For more information, please see the output parameters of the time format description of the `strftime` function in C language
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("TimeFormat")
    @Expose
    private String TimeFormat;

    /**
    * Delimiter for log type. Valid only when LogType is delimiter_logNote: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Delimiter")
    @Expose
    private String Delimiter;

    /**
    * Full log matching rule. Valid only if LogType is fullregex_logNote: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("LogRegex")
    @Expose
    private String LogRegex;

    /**
    * Line beginning matching rule, valid only if LogType is multiline_log or fullregex_logNote: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("BeginRegex")
    @Expose
    private String BeginRegex;

    /**
    * Key name of each extracted field. An empty key indicates discarding the field. Valid only if LogType is delimiter_log. json_log logs use the key of JSON itself. Limited to 100.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Keys")
    @Expose
    private String [] Keys;

    /**
    * Log filter rule list (previous version), keys to be filtered in the log and their corresponding regex.Note: For LogListener version 2.9.3 and later, it is recommended to use the AdvanceFilterRules configuration for log filtering.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("FilterKeyRegex")
    @Expose
    private KeyRegexInfo [] FilterKeyRegex;

    /**
    * Whether to upload the logs that failed to be parsed. Valid values: `true`: yes; `false`: no
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("UnMatchUpLoadSwitch")
    @Expose
    private Boolean UnMatchUpLoadSwitch;

    /**
    * Unmatched log key
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("UnMatchLogKey")
    @Expose
    private String UnMatchLogKey;

    /**
    * Backtracking data volume under incremental collection pattern, default -1 indicates full collection; other non-negative numbers indicate incremental collection (collect logs backward from the latest position by ${Backtracking} bytes) with a maximum support of 1073741824 (1G).Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Backtracking")
    @Expose
    private Long Backtracking;

    /**
    * Whether to be encoded in GBK format. Valid values: `0` (No) and `1` (Yes).
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IsGBK")
    @Expose
    private Long IsGBK;

    /**
    * Whether to be formatted as JSON (standard). Valid values: `0` (No) and `1` (Yes).
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("JsonStandard")
    @Expose
    private Long JsonStandard;

    /**
    * Syslog protocol. Valid values: `tcp`, `udp`.
This field can be used when you create or modify collection rule configurations.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * Listening address and port specified by the syslog collection. Format: [ip]:[port]. Example: 127.0.0.1:9000.
This field can be used when you create or modify collection rule configurations.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Address")
    @Expose
    private String Address;

    /**
    * `rfc3164`: Resolve logs by using the RFC 3164 protocol during the syslog collection.
`rfc5424`: Resolve logs by using the RFC 5424 protocol during the syslog collection.
`auto`: Automatically match either the RFC 3164 or RFC 5424 protocol.
This field can be used when you create or modify collection rule configurations.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ParseProtocol")
    @Expose
    private String ParseProtocol;

    /**
    * Metadata type. Valid values:
0: Do not use metadata.
1: Use machine group metadata.
2: Use user-defined metadata.
3: Use the collection path to extract metadata.
    */
    @SerializedName("MetadataType")
    @Expose
    private Long MetadataType;

    /**
    * Regular expression of the collection configuration path, which is required when `MetadataType` is set to `3`
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PathRegex")
    @Expose
    private String PathRegex;

    /**
    * User-defined metadata, which is required when `MetadataType` is set to `2`.
    */
    @SerializedName("MetaTags")
    @Expose
    private MetaTagInfo [] MetaTags;

    /**
    * Windows event log collection
    */
    @SerializedName("EventLogRules")
    @Expose
    private EventLog [] EventLogRules;

    /**
     * Get Key name for the time field. TikeKey and TimeFormat must appear in pairsNote: This field may return null, indicating that no valid values can be obtained. 
     * @return TimeKey Key name for the time field. TikeKey and TimeFormat must appear in pairsNote: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTimeKey() {
        return this.TimeKey;
    }

    /**
     * Set Key name for the time field. TikeKey and TimeFormat must appear in pairsNote: This field may return null, indicating that no valid values can be obtained.
     * @param TimeKey Key name for the time field. TikeKey and TimeFormat must appear in pairsNote: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTimeKey(String TimeKey) {
        this.TimeKey = TimeKey;
    }

    /**
     * Get Time field format. For more information, please see the output parameters of the time format description of the `strftime` function in C language
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return TimeFormat Time field format. For more information, please see the output parameters of the time format description of the `strftime` function in C language
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getTimeFormat() {
        return this.TimeFormat;
    }

    /**
     * Set Time field format. For more information, please see the output parameters of the time format description of the `strftime` function in C language
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param TimeFormat Time field format. For more information, please see the output parameters of the time format description of the `strftime` function in C language
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setTimeFormat(String TimeFormat) {
        this.TimeFormat = TimeFormat;
    }

    /**
     * Get Delimiter for log type. Valid only when LogType is delimiter_logNote: This field may return null, indicating that no valid values can be obtained. 
     * @return Delimiter Delimiter for log type. Valid only when LogType is delimiter_logNote: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDelimiter() {
        return this.Delimiter;
    }

    /**
     * Set Delimiter for log type. Valid only when LogType is delimiter_logNote: This field may return null, indicating that no valid values can be obtained.
     * @param Delimiter Delimiter for log type. Valid only when LogType is delimiter_logNote: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDelimiter(String Delimiter) {
        this.Delimiter = Delimiter;
    }

    /**
     * Get Full log matching rule. Valid only if LogType is fullregex_logNote: This field may return null, indicating that no valid values can be obtained. 
     * @return LogRegex Full log matching rule. Valid only if LogType is fullregex_logNote: This field may return null, indicating that no valid values can be obtained.
     */
    public String getLogRegex() {
        return this.LogRegex;
    }

    /**
     * Set Full log matching rule. Valid only if LogType is fullregex_logNote: This field may return null, indicating that no valid values can be obtained.
     * @param LogRegex Full log matching rule. Valid only if LogType is fullregex_logNote: This field may return null, indicating that no valid values can be obtained.
     */
    public void setLogRegex(String LogRegex) {
        this.LogRegex = LogRegex;
    }

    /**
     * Get Line beginning matching rule, valid only if LogType is multiline_log or fullregex_logNote: This field may return null, indicating that no valid values can be obtained. 
     * @return BeginRegex Line beginning matching rule, valid only if LogType is multiline_log or fullregex_logNote: This field may return null, indicating that no valid values can be obtained.
     */
    public String getBeginRegex() {
        return this.BeginRegex;
    }

    /**
     * Set Line beginning matching rule, valid only if LogType is multiline_log or fullregex_logNote: This field may return null, indicating that no valid values can be obtained.
     * @param BeginRegex Line beginning matching rule, valid only if LogType is multiline_log or fullregex_logNote: This field may return null, indicating that no valid values can be obtained.
     */
    public void setBeginRegex(String BeginRegex) {
        this.BeginRegex = BeginRegex;
    }

    /**
     * Get Key name of each extracted field. An empty key indicates discarding the field. Valid only if LogType is delimiter_log. json_log logs use the key of JSON itself. Limited to 100.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Keys Key name of each extracted field. An empty key indicates discarding the field. Valid only if LogType is delimiter_log. json_log logs use the key of JSON itself. Limited to 100.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getKeys() {
        return this.Keys;
    }

    /**
     * Set Key name of each extracted field. An empty key indicates discarding the field. Valid only if LogType is delimiter_log. json_log logs use the key of JSON itself. Limited to 100.Note: This field may return null, indicating that no valid values can be obtained.
     * @param Keys Key name of each extracted field. An empty key indicates discarding the field. Valid only if LogType is delimiter_log. json_log logs use the key of JSON itself. Limited to 100.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setKeys(String [] Keys) {
        this.Keys = Keys;
    }

    /**
     * Get Log filter rule list (previous version), keys to be filtered in the log and their corresponding regex.Note: For LogListener version 2.9.3 and later, it is recommended to use the AdvanceFilterRules configuration for log filtering.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return FilterKeyRegex Log filter rule list (previous version), keys to be filtered in the log and their corresponding regex.Note: For LogListener version 2.9.3 and later, it is recommended to use the AdvanceFilterRules configuration for log filtering.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public KeyRegexInfo [] getFilterKeyRegex() {
        return this.FilterKeyRegex;
    }

    /**
     * Set Log filter rule list (previous version), keys to be filtered in the log and their corresponding regex.Note: For LogListener version 2.9.3 and later, it is recommended to use the AdvanceFilterRules configuration for log filtering.Note: This field may return null, indicating that no valid values can be obtained.
     * @param FilterKeyRegex Log filter rule list (previous version), keys to be filtered in the log and their corresponding regex.Note: For LogListener version 2.9.3 and later, it is recommended to use the AdvanceFilterRules configuration for log filtering.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setFilterKeyRegex(KeyRegexInfo [] FilterKeyRegex) {
        this.FilterKeyRegex = FilterKeyRegex;
    }

    /**
     * Get Whether to upload the logs that failed to be parsed. Valid values: `true`: yes; `false`: no
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return UnMatchUpLoadSwitch Whether to upload the logs that failed to be parsed. Valid values: `true`: yes; `false`: no
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public Boolean getUnMatchUpLoadSwitch() {
        return this.UnMatchUpLoadSwitch;
    }

    /**
     * Set Whether to upload the logs that failed to be parsed. Valid values: `true`: yes; `false`: no
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param UnMatchUpLoadSwitch Whether to upload the logs that failed to be parsed. Valid values: `true`: yes; `false`: no
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setUnMatchUpLoadSwitch(Boolean UnMatchUpLoadSwitch) {
        this.UnMatchUpLoadSwitch = UnMatchUpLoadSwitch;
    }

    /**
     * Get Unmatched log key
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return UnMatchLogKey Unmatched log key
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getUnMatchLogKey() {
        return this.UnMatchLogKey;
    }

    /**
     * Set Unmatched log key
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param UnMatchLogKey Unmatched log key
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setUnMatchLogKey(String UnMatchLogKey) {
        this.UnMatchLogKey = UnMatchLogKey;
    }

    /**
     * Get Backtracking data volume under incremental collection pattern, default -1 indicates full collection; other non-negative numbers indicate incremental collection (collect logs backward from the latest position by ${Backtracking} bytes) with a maximum support of 1073741824 (1G).Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Backtracking Backtracking data volume under incremental collection pattern, default -1 indicates full collection; other non-negative numbers indicate incremental collection (collect logs backward from the latest position by ${Backtracking} bytes) with a maximum support of 1073741824 (1G).Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getBacktracking() {
        return this.Backtracking;
    }

    /**
     * Set Backtracking data volume under incremental collection pattern, default -1 indicates full collection; other non-negative numbers indicate incremental collection (collect logs backward from the latest position by ${Backtracking} bytes) with a maximum support of 1073741824 (1G).Note: This field may return null, indicating that no valid values can be obtained.
     * @param Backtracking Backtracking data volume under incremental collection pattern, default -1 indicates full collection; other non-negative numbers indicate incremental collection (collect logs backward from the latest position by ${Backtracking} bytes) with a maximum support of 1073741824 (1G).Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setBacktracking(Long Backtracking) {
        this.Backtracking = Backtracking;
    }

    /**
     * Get Whether to be encoded in GBK format. Valid values: `0` (No) and `1` (Yes).
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IsGBK Whether to be encoded in GBK format. Valid values: `0` (No) and `1` (Yes).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getIsGBK() {
        return this.IsGBK;
    }

    /**
     * Set Whether to be encoded in GBK format. Valid values: `0` (No) and `1` (Yes).
Note: This field may return null, indicating that no valid values can be obtained.
     * @param IsGBK Whether to be encoded in GBK format. Valid values: `0` (No) and `1` (Yes).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIsGBK(Long IsGBK) {
        this.IsGBK = IsGBK;
    }

    /**
     * Get Whether to be formatted as JSON (standard). Valid values: `0` (No) and `1` (Yes).
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return JsonStandard Whether to be formatted as JSON (standard). Valid values: `0` (No) and `1` (Yes).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getJsonStandard() {
        return this.JsonStandard;
    }

    /**
     * Set Whether to be formatted as JSON (standard). Valid values: `0` (No) and `1` (Yes).
Note: This field may return null, indicating that no valid values can be obtained.
     * @param JsonStandard Whether to be formatted as JSON (standard). Valid values: `0` (No) and `1` (Yes).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setJsonStandard(Long JsonStandard) {
        this.JsonStandard = JsonStandard;
    }

    /**
     * Get Syslog protocol. Valid values: `tcp`, `udp`.
This field can be used when you create or modify collection rule configurations.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Protocol Syslog protocol. Valid values: `tcp`, `udp`.
This field can be used when you create or modify collection rule configurations.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set Syslog protocol. Valid values: `tcp`, `udp`.
This field can be used when you create or modify collection rule configurations.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Protocol Syslog protocol. Valid values: `tcp`, `udp`.
This field can be used when you create or modify collection rule configurations.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get Listening address and port specified by the syslog collection. Format: [ip]:[port]. Example: 127.0.0.1:9000.
This field can be used when you create or modify collection rule configurations.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Address Listening address and port specified by the syslog collection. Format: [ip]:[port]. Example: 127.0.0.1:9000.
This field can be used when you create or modify collection rule configurations.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getAddress() {
        return this.Address;
    }

    /**
     * Set Listening address and port specified by the syslog collection. Format: [ip]:[port]. Example: 127.0.0.1:9000.
This field can be used when you create or modify collection rule configurations.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Address Listening address and port specified by the syslog collection. Format: [ip]:[port]. Example: 127.0.0.1:9000.
This field can be used when you create or modify collection rule configurations.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAddress(String Address) {
        this.Address = Address;
    }

    /**
     * Get `rfc3164`: Resolve logs by using the RFC 3164 protocol during the syslog collection.
`rfc5424`: Resolve logs by using the RFC 5424 protocol during the syslog collection.
`auto`: Automatically match either the RFC 3164 or RFC 5424 protocol.
This field can be used when you create or modify collection rule configurations.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ParseProtocol `rfc3164`: Resolve logs by using the RFC 3164 protocol during the syslog collection.
`rfc5424`: Resolve logs by using the RFC 5424 protocol during the syslog collection.
`auto`: Automatically match either the RFC 3164 or RFC 5424 protocol.
This field can be used when you create or modify collection rule configurations.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getParseProtocol() {
        return this.ParseProtocol;
    }

    /**
     * Set `rfc3164`: Resolve logs by using the RFC 3164 protocol during the syslog collection.
`rfc5424`: Resolve logs by using the RFC 5424 protocol during the syslog collection.
`auto`: Automatically match either the RFC 3164 or RFC 5424 protocol.
This field can be used when you create or modify collection rule configurations.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ParseProtocol `rfc3164`: Resolve logs by using the RFC 3164 protocol during the syslog collection.
`rfc5424`: Resolve logs by using the RFC 5424 protocol during the syslog collection.
`auto`: Automatically match either the RFC 3164 or RFC 5424 protocol.
This field can be used when you create or modify collection rule configurations.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setParseProtocol(String ParseProtocol) {
        this.ParseProtocol = ParseProtocol;
    }

    /**
     * Get Metadata type. Valid values:
0: Do not use metadata.
1: Use machine group metadata.
2: Use user-defined metadata.
3: Use the collection path to extract metadata. 
     * @return MetadataType Metadata type. Valid values:
0: Do not use metadata.
1: Use machine group metadata.
2: Use user-defined metadata.
3: Use the collection path to extract metadata.
     */
    public Long getMetadataType() {
        return this.MetadataType;
    }

    /**
     * Set Metadata type. Valid values:
0: Do not use metadata.
1: Use machine group metadata.
2: Use user-defined metadata.
3: Use the collection path to extract metadata.
     * @param MetadataType Metadata type. Valid values:
0: Do not use metadata.
1: Use machine group metadata.
2: Use user-defined metadata.
3: Use the collection path to extract metadata.
     */
    public void setMetadataType(Long MetadataType) {
        this.MetadataType = MetadataType;
    }

    /**
     * Get Regular expression of the collection configuration path, which is required when `MetadataType` is set to `3`
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PathRegex Regular expression of the collection configuration path, which is required when `MetadataType` is set to `3`
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getPathRegex() {
        return this.PathRegex;
    }

    /**
     * Set Regular expression of the collection configuration path, which is required when `MetadataType` is set to `3`
Note: This field may return null, indicating that no valid values can be obtained.
     * @param PathRegex Regular expression of the collection configuration path, which is required when `MetadataType` is set to `3`
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPathRegex(String PathRegex) {
        this.PathRegex = PathRegex;
    }

    /**
     * Get User-defined metadata, which is required when `MetadataType` is set to `2`. 
     * @return MetaTags User-defined metadata, which is required when `MetadataType` is set to `2`.
     */
    public MetaTagInfo [] getMetaTags() {
        return this.MetaTags;
    }

    /**
     * Set User-defined metadata, which is required when `MetadataType` is set to `2`.
     * @param MetaTags User-defined metadata, which is required when `MetadataType` is set to `2`.
     */
    public void setMetaTags(MetaTagInfo [] MetaTags) {
        this.MetaTags = MetaTags;
    }

    /**
     * Get Windows event log collection 
     * @return EventLogRules Windows event log collection
     */
    public EventLog [] getEventLogRules() {
        return this.EventLogRules;
    }

    /**
     * Set Windows event log collection
     * @param EventLogRules Windows event log collection
     */
    public void setEventLogRules(EventLog [] EventLogRules) {
        this.EventLogRules = EventLogRules;
    }

    public ExtractRuleInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExtractRuleInfo(ExtractRuleInfo source) {
        if (source.TimeKey != null) {
            this.TimeKey = new String(source.TimeKey);
        }
        if (source.TimeFormat != null) {
            this.TimeFormat = new String(source.TimeFormat);
        }
        if (source.Delimiter != null) {
            this.Delimiter = new String(source.Delimiter);
        }
        if (source.LogRegex != null) {
            this.LogRegex = new String(source.LogRegex);
        }
        if (source.BeginRegex != null) {
            this.BeginRegex = new String(source.BeginRegex);
        }
        if (source.Keys != null) {
            this.Keys = new String[source.Keys.length];
            for (int i = 0; i < source.Keys.length; i++) {
                this.Keys[i] = new String(source.Keys[i]);
            }
        }
        if (source.FilterKeyRegex != null) {
            this.FilterKeyRegex = new KeyRegexInfo[source.FilterKeyRegex.length];
            for (int i = 0; i < source.FilterKeyRegex.length; i++) {
                this.FilterKeyRegex[i] = new KeyRegexInfo(source.FilterKeyRegex[i]);
            }
        }
        if (source.UnMatchUpLoadSwitch != null) {
            this.UnMatchUpLoadSwitch = new Boolean(source.UnMatchUpLoadSwitch);
        }
        if (source.UnMatchLogKey != null) {
            this.UnMatchLogKey = new String(source.UnMatchLogKey);
        }
        if (source.Backtracking != null) {
            this.Backtracking = new Long(source.Backtracking);
        }
        if (source.IsGBK != null) {
            this.IsGBK = new Long(source.IsGBK);
        }
        if (source.JsonStandard != null) {
            this.JsonStandard = new Long(source.JsonStandard);
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.Address != null) {
            this.Address = new String(source.Address);
        }
        if (source.ParseProtocol != null) {
            this.ParseProtocol = new String(source.ParseProtocol);
        }
        if (source.MetadataType != null) {
            this.MetadataType = new Long(source.MetadataType);
        }
        if (source.PathRegex != null) {
            this.PathRegex = new String(source.PathRegex);
        }
        if (source.MetaTags != null) {
            this.MetaTags = new MetaTagInfo[source.MetaTags.length];
            for (int i = 0; i < source.MetaTags.length; i++) {
                this.MetaTags[i] = new MetaTagInfo(source.MetaTags[i]);
            }
        }
        if (source.EventLogRules != null) {
            this.EventLogRules = new EventLog[source.EventLogRules.length];
            for (int i = 0; i < source.EventLogRules.length; i++) {
                this.EventLogRules[i] = new EventLog(source.EventLogRules[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TimeKey", this.TimeKey);
        this.setParamSimple(map, prefix + "TimeFormat", this.TimeFormat);
        this.setParamSimple(map, prefix + "Delimiter", this.Delimiter);
        this.setParamSimple(map, prefix + "LogRegex", this.LogRegex);
        this.setParamSimple(map, prefix + "BeginRegex", this.BeginRegex);
        this.setParamArraySimple(map, prefix + "Keys.", this.Keys);
        this.setParamArrayObj(map, prefix + "FilterKeyRegex.", this.FilterKeyRegex);
        this.setParamSimple(map, prefix + "UnMatchUpLoadSwitch", this.UnMatchUpLoadSwitch);
        this.setParamSimple(map, prefix + "UnMatchLogKey", this.UnMatchLogKey);
        this.setParamSimple(map, prefix + "Backtracking", this.Backtracking);
        this.setParamSimple(map, prefix + "IsGBK", this.IsGBK);
        this.setParamSimple(map, prefix + "JsonStandard", this.JsonStandard);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "Address", this.Address);
        this.setParamSimple(map, prefix + "ParseProtocol", this.ParseProtocol);
        this.setParamSimple(map, prefix + "MetadataType", this.MetadataType);
        this.setParamSimple(map, prefix + "PathRegex", this.PathRegex);
        this.setParamArrayObj(map, prefix + "MetaTags.", this.MetaTags);
        this.setParamArrayObj(map, prefix + "EventLogRules.", this.EventLogRules);

    }
}

