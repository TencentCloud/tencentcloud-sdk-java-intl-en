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
    * <p>key name for the time field. TimeKey and TimeFormat must appear in pairs</p>
    */
    @SerializedName("TimeKey")
    @Expose
    private String TimeKey;

    /**
    * <p>Time field format. Refer to the strftime function in C language for time format description output parameter</p><ul><li>See <a href="https://www.tencentcloud.com/document/product/614/38614?from_cn_redirect=1">configure time format</a> document</li></ul>
    */
    @SerializedName("TimeFormat")
    @Expose
    private String TimeFormat;

    /**
    * <p>Delimiter for log type. Only valid when LogType is delimiter_log</p>
    */
    @SerializedName("Delimiter")
    @Expose
    private String Delimiter;

    /**
    * <p>The whole log matching rule is only valid when LogType is fullregex_log</p>
    */
    @SerializedName("LogRegex")
    @Expose
    private String LogRegex;

    /**
    * <p>First-line matching rule. Valid only when LogType is multiline_log or fullregex_log.</p>
    */
    @SerializedName("BeginRegex")
    @Expose
    private String BeginRegex;

    /**
    * <p>The key name of each field. An empty key means to discard the field. Valid only when LogType is delimiter_log. For json_log, use the key in the json itself. Limited to 100.</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Keys")
    @Expose
    private String [] Keys;

    /**
    * <p>Log filtering rule list (legacy version), keys to be filtered, and corresponding regex.<br> Note: For LogListener 2.9.3 and above versions, it is recommended to use log filtering rules configuration.</p>
    */
    @SerializedName("FilterKeyRegex")
    @Expose
    private KeyRegexInfo [] FilterKeyRegex;

    /**
    * <p>Whether to upload logs that failed to be parsed, true for upload, false for not uploading</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UnMatchUpLoadSwitch")
    @Expose
    private Boolean UnMatchUpLoadSwitch;

    /**
    * <p>key of the failure log, required when UnMatchUpLoadSwitch is true</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UnMatchLogKey")
    @Expose
    private String UnMatchLogKey;

    /**
    * <p>Backtracking data volume in incremental collection mode. Default: -1 (full collection). Other non-negative numbers indicate incremental collection (backward collection of ${Backtracking} Byte logs from the newest position). Supports up to 1073741824 (1G).<br>Note:</p><ul><li>COS import does not support this field.</li></ul>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Backtracking")
    @Expose
    private Long Backtracking;

    /**
    * <p>Whether it is Gbk encoding. 0: No; 1: Yes.<br>Note</p><ul><li>Currently, a value of 0 indicates UTF-8 encoding.</li><li>COS import does not support this field.</li></ul>
    */
    @SerializedName("IsGBK")
    @Expose
    private Long IsGBK;

    /**
    * <p>Whether it is standard json. 0: No; 1: Yes.</p><ul><li>Standard json means the collector uses industry-standard open-source parsers for json parsing. Non-standard json means the collector uses CLS self-developed json parsers. There is no essential difference between the two parsers. We recommend customers use standard json for parsing.</li></ul>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("JsonStandard")
    @Expose
    private Long JsonStandard;

    /**
    * <p>syslog transport protocol, valid values: tcp, udp, this parameter is valid only when LogType is service_syslog, not required for other types.<br>Note:</p><ul><li>This field applies to: create collection rule configuration, modify collection rule configuration.</li><li>COS import does not support this field.</li></ul>
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * <p>syslog system log collection specifies the address and port listened to by the collector, format: [ip]:[port]. This parameter is valid only when LogType is service_syslog. No need to specify for other types.<br>Note:</p><ul><li>This field applies to: create collection rule configuration, modify collection rule configuration.</li><li>COS import does not support this field.</li></ul>
    */
    @SerializedName("Address")
    @Expose
    private String Address;

    /**
    * <p>rfc3164: Specify system log collection using RFC3164 protocol parsing.<br>rfc5424: Specify system log collection using RFC5424 protocol parsing.<br>auto: Automatically match either RFC3164 or RFC5424 protocol.<br>This parameter is valid only when LogType is service_syslog. Not required for other types.<br>Note:</p><ul><li>This field is applicable to: create collection rule configuration, modify collection rule configuration.</li><li>COS import does not support this field.</li></ul>
    */
    @SerializedName("ParseProtocol")
    @Expose
    private String ParseProtocol;

    /**
    * <p>Metadata type. 0: Not use metadata information; 1: Use machine group metadata; 2: Using custom metadata; 3: Use collection configuration path.<br>Note:</p><ul><li>COS import does not support this field.</li></ul>
    */
    @SerializedName("MetadataType")
    @Expose
    private Long MetadataType;

    /**
    * <p>Collection configuration path regular expression.</p><p><pre><code>Use "()" to identify the regular expression corresponding to the target field in the path. During parsing, "()" is considered as a capture group and reported together with logs in the form of __TAG__.{i}:{target field name}, where i is the serial number of the capture group. If you do not want to use the serial number as the key name, you can define a custom key name through the named capturing group "(?&lt;{key name}&gt;{regular expression})" and report it together with logs in the form of __TAG__.{key name}:{target field name}. Supports up to 5 capture groups.</code></pre></p><p>Note:</p><ul><li>Required when MetadataType is 3.</li><li>This field is not supported in COS import.</li></ul>
    */
    @SerializedName("PathRegex")
    @Expose
    private String PathRegex;

    /**
    * <p>User-defined metadata information.<br>Note:</p><ul><li>Required when MetadataType is 2.</li><li>This field is not supported for COS import.</li></ul>
    */
    @SerializedName("MetaTags")
    @Expose
    private MetaTagInfo [] MetaTags;

    /**
    * <p>The Windows Event Log Collection rule is valid only when LogType is windows_event_log. No need to specify for other types.</p>
    */
    @SerializedName("EventLogRules")
    @Expose
    private EventLog [] EventLogRules;

    /**
    * <p>Log filtering rule list (new version).<br>Note:</p><ul><li>LogListener versions below 2.9.3 do not support this. Please use FilterKeyRegex to configure log filter rules.</li><li>Self-built k8s collection configuration (CreateConfigExtra, ModifyConfigExtra) does not support this field.</li></ul>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AdvanceFilterRules")
    @Expose
    private AdvanceFilterRuleInfo [] AdvanceFilterRules;

    /**
    * <p>Key name of raw logs. All raw logs are uploaded with the Key name you specified, and the original log content as Value. If left empty, raw log upload is disabled.</p><ul><li>COS import does not support this field.</li></ul>
    */
    @SerializedName("RawLogKey")
    @Expose
    private String RawLogKey;

    /**
     * Get <p>key name for the time field. TimeKey and TimeFormat must appear in pairs</p> 
     * @return TimeKey <p>key name for the time field. TimeKey and TimeFormat must appear in pairs</p>
     */
    public String getTimeKey() {
        return this.TimeKey;
    }

    /**
     * Set <p>key name for the time field. TimeKey and TimeFormat must appear in pairs</p>
     * @param TimeKey <p>key name for the time field. TimeKey and TimeFormat must appear in pairs</p>
     */
    public void setTimeKey(String TimeKey) {
        this.TimeKey = TimeKey;
    }

    /**
     * Get <p>Time field format. Refer to the strftime function in C language for time format description output parameter</p><ul><li>See <a href="https://www.tencentcloud.com/document/product/614/38614?from_cn_redirect=1">configure time format</a> document</li></ul> 
     * @return TimeFormat <p>Time field format. Refer to the strftime function in C language for time format description output parameter</p><ul><li>See <a href="https://www.tencentcloud.com/document/product/614/38614?from_cn_redirect=1">configure time format</a> document</li></ul>
     */
    public String getTimeFormat() {
        return this.TimeFormat;
    }

    /**
     * Set <p>Time field format. Refer to the strftime function in C language for time format description output parameter</p><ul><li>See <a href="https://www.tencentcloud.com/document/product/614/38614?from_cn_redirect=1">configure time format</a> document</li></ul>
     * @param TimeFormat <p>Time field format. Refer to the strftime function in C language for time format description output parameter</p><ul><li>See <a href="https://www.tencentcloud.com/document/product/614/38614?from_cn_redirect=1">configure time format</a> document</li></ul>
     */
    public void setTimeFormat(String TimeFormat) {
        this.TimeFormat = TimeFormat;
    }

    /**
     * Get <p>Delimiter for log type. Only valid when LogType is delimiter_log</p> 
     * @return Delimiter <p>Delimiter for log type. Only valid when LogType is delimiter_log</p>
     */
    public String getDelimiter() {
        return this.Delimiter;
    }

    /**
     * Set <p>Delimiter for log type. Only valid when LogType is delimiter_log</p>
     * @param Delimiter <p>Delimiter for log type. Only valid when LogType is delimiter_log</p>
     */
    public void setDelimiter(String Delimiter) {
        this.Delimiter = Delimiter;
    }

    /**
     * Get <p>The whole log matching rule is only valid when LogType is fullregex_log</p> 
     * @return LogRegex <p>The whole log matching rule is only valid when LogType is fullregex_log</p>
     */
    public String getLogRegex() {
        return this.LogRegex;
    }

    /**
     * Set <p>The whole log matching rule is only valid when LogType is fullregex_log</p>
     * @param LogRegex <p>The whole log matching rule is only valid when LogType is fullregex_log</p>
     */
    public void setLogRegex(String LogRegex) {
        this.LogRegex = LogRegex;
    }

    /**
     * Get <p>First-line matching rule. Valid only when LogType is multiline_log or fullregex_log.</p> 
     * @return BeginRegex <p>First-line matching rule. Valid only when LogType is multiline_log or fullregex_log.</p>
     */
    public String getBeginRegex() {
        return this.BeginRegex;
    }

    /**
     * Set <p>First-line matching rule. Valid only when LogType is multiline_log or fullregex_log.</p>
     * @param BeginRegex <p>First-line matching rule. Valid only when LogType is multiline_log or fullregex_log.</p>
     */
    public void setBeginRegex(String BeginRegex) {
        this.BeginRegex = BeginRegex;
    }

    /**
     * Get <p>The key name of each field. An empty key means to discard the field. Valid only when LogType is delimiter_log. For json_log, use the key in the json itself. Limited to 100.</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Keys <p>The key name of each field. An empty key means to discard the field. Valid only when LogType is delimiter_log. For json_log, use the key in the json itself. Limited to 100.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getKeys() {
        return this.Keys;
    }

    /**
     * Set <p>The key name of each field. An empty key means to discard the field. Valid only when LogType is delimiter_log. For json_log, use the key in the json itself. Limited to 100.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Keys <p>The key name of each field. An empty key means to discard the field. Valid only when LogType is delimiter_log. For json_log, use the key in the json itself. Limited to 100.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setKeys(String [] Keys) {
        this.Keys = Keys;
    }

    /**
     * Get <p>Log filtering rule list (legacy version), keys to be filtered, and corresponding regex.<br> Note: For LogListener 2.9.3 and above versions, it is recommended to use log filtering rules configuration.</p> 
     * @return FilterKeyRegex <p>Log filtering rule list (legacy version), keys to be filtered, and corresponding regex.<br> Note: For LogListener 2.9.3 and above versions, it is recommended to use log filtering rules configuration.</p>
     */
    public KeyRegexInfo [] getFilterKeyRegex() {
        return this.FilterKeyRegex;
    }

    /**
     * Set <p>Log filtering rule list (legacy version), keys to be filtered, and corresponding regex.<br> Note: For LogListener 2.9.3 and above versions, it is recommended to use log filtering rules configuration.</p>
     * @param FilterKeyRegex <p>Log filtering rule list (legacy version), keys to be filtered, and corresponding regex.<br> Note: For LogListener 2.9.3 and above versions, it is recommended to use log filtering rules configuration.</p>
     */
    public void setFilterKeyRegex(KeyRegexInfo [] FilterKeyRegex) {
        this.FilterKeyRegex = FilterKeyRegex;
    }

    /**
     * Get <p>Whether to upload logs that failed to be parsed, true for upload, false for not uploading</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return UnMatchUpLoadSwitch <p>Whether to upload logs that failed to be parsed, true for upload, false for not uploading</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getUnMatchUpLoadSwitch() {
        return this.UnMatchUpLoadSwitch;
    }

    /**
     * Set <p>Whether to upload logs that failed to be parsed, true for upload, false for not uploading</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param UnMatchUpLoadSwitch <p>Whether to upload logs that failed to be parsed, true for upload, false for not uploading</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUnMatchUpLoadSwitch(Boolean UnMatchUpLoadSwitch) {
        this.UnMatchUpLoadSwitch = UnMatchUpLoadSwitch;
    }

    /**
     * Get <p>key of the failure log, required when UnMatchUpLoadSwitch is true</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return UnMatchLogKey <p>key of the failure log, required when UnMatchUpLoadSwitch is true</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getUnMatchLogKey() {
        return this.UnMatchLogKey;
    }

    /**
     * Set <p>key of the failure log, required when UnMatchUpLoadSwitch is true</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param UnMatchLogKey <p>key of the failure log, required when UnMatchUpLoadSwitch is true</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUnMatchLogKey(String UnMatchLogKey) {
        this.UnMatchLogKey = UnMatchLogKey;
    }

    /**
     * Get <p>Backtracking data volume in incremental collection mode. Default: -1 (full collection). Other non-negative numbers indicate incremental collection (backward collection of ${Backtracking} Byte logs from the newest position). Supports up to 1073741824 (1G).<br>Note:</p><ul><li>COS import does not support this field.</li></ul>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Backtracking <p>Backtracking data volume in incremental collection mode. Default: -1 (full collection). Other non-negative numbers indicate incremental collection (backward collection of ${Backtracking} Byte logs from the newest position). Supports up to 1073741824 (1G).<br>Note:</p><ul><li>COS import does not support this field.</li></ul>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getBacktracking() {
        return this.Backtracking;
    }

    /**
     * Set <p>Backtracking data volume in incremental collection mode. Default: -1 (full collection). Other non-negative numbers indicate incremental collection (backward collection of ${Backtracking} Byte logs from the newest position). Supports up to 1073741824 (1G).<br>Note:</p><ul><li>COS import does not support this field.</li></ul>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Backtracking <p>Backtracking data volume in incremental collection mode. Default: -1 (full collection). Other non-negative numbers indicate incremental collection (backward collection of ${Backtracking} Byte logs from the newest position). Supports up to 1073741824 (1G).<br>Note:</p><ul><li>COS import does not support this field.</li></ul>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setBacktracking(Long Backtracking) {
        this.Backtracking = Backtracking;
    }

    /**
     * Get <p>Whether it is Gbk encoding. 0: No; 1: Yes.<br>Note</p><ul><li>Currently, a value of 0 indicates UTF-8 encoding.</li><li>COS import does not support this field.</li></ul> 
     * @return IsGBK <p>Whether it is Gbk encoding. 0: No; 1: Yes.<br>Note</p><ul><li>Currently, a value of 0 indicates UTF-8 encoding.</li><li>COS import does not support this field.</li></ul>
     */
    public Long getIsGBK() {
        return this.IsGBK;
    }

    /**
     * Set <p>Whether it is Gbk encoding. 0: No; 1: Yes.<br>Note</p><ul><li>Currently, a value of 0 indicates UTF-8 encoding.</li><li>COS import does not support this field.</li></ul>
     * @param IsGBK <p>Whether it is Gbk encoding. 0: No; 1: Yes.<br>Note</p><ul><li>Currently, a value of 0 indicates UTF-8 encoding.</li><li>COS import does not support this field.</li></ul>
     */
    public void setIsGBK(Long IsGBK) {
        this.IsGBK = IsGBK;
    }

    /**
     * Get <p>Whether it is standard json. 0: No; 1: Yes.</p><ul><li>Standard json means the collector uses industry-standard open-source parsers for json parsing. Non-standard json means the collector uses CLS self-developed json parsers. There is no essential difference between the two parsers. We recommend customers use standard json for parsing.</li></ul>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return JsonStandard <p>Whether it is standard json. 0: No; 1: Yes.</p><ul><li>Standard json means the collector uses industry-standard open-source parsers for json parsing. Non-standard json means the collector uses CLS self-developed json parsers. There is no essential difference between the two parsers. We recommend customers use standard json for parsing.</li></ul>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getJsonStandard() {
        return this.JsonStandard;
    }

    /**
     * Set <p>Whether it is standard json. 0: No; 1: Yes.</p><ul><li>Standard json means the collector uses industry-standard open-source parsers for json parsing. Non-standard json means the collector uses CLS self-developed json parsers. There is no essential difference between the two parsers. We recommend customers use standard json for parsing.</li></ul>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param JsonStandard <p>Whether it is standard json. 0: No; 1: Yes.</p><ul><li>Standard json means the collector uses industry-standard open-source parsers for json parsing. Non-standard json means the collector uses CLS self-developed json parsers. There is no essential difference between the two parsers. We recommend customers use standard json for parsing.</li></ul>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setJsonStandard(Long JsonStandard) {
        this.JsonStandard = JsonStandard;
    }

    /**
     * Get <p>syslog transport protocol, valid values: tcp, udp, this parameter is valid only when LogType is service_syslog, not required for other types.<br>Note:</p><ul><li>This field applies to: create collection rule configuration, modify collection rule configuration.</li><li>COS import does not support this field.</li></ul> 
     * @return Protocol <p>syslog transport protocol, valid values: tcp, udp, this parameter is valid only when LogType is service_syslog, not required for other types.<br>Note:</p><ul><li>This field applies to: create collection rule configuration, modify collection rule configuration.</li><li>COS import does not support this field.</li></ul>
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set <p>syslog transport protocol, valid values: tcp, udp, this parameter is valid only when LogType is service_syslog, not required for other types.<br>Note:</p><ul><li>This field applies to: create collection rule configuration, modify collection rule configuration.</li><li>COS import does not support this field.</li></ul>
     * @param Protocol <p>syslog transport protocol, valid values: tcp, udp, this parameter is valid only when LogType is service_syslog, not required for other types.<br>Note:</p><ul><li>This field applies to: create collection rule configuration, modify collection rule configuration.</li><li>COS import does not support this field.</li></ul>
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get <p>syslog system log collection specifies the address and port listened to by the collector, format: [ip]:[port]. This parameter is valid only when LogType is service_syslog. No need to specify for other types.<br>Note:</p><ul><li>This field applies to: create collection rule configuration, modify collection rule configuration.</li><li>COS import does not support this field.</li></ul> 
     * @return Address <p>syslog system log collection specifies the address and port listened to by the collector, format: [ip]:[port]. This parameter is valid only when LogType is service_syslog. No need to specify for other types.<br>Note:</p><ul><li>This field applies to: create collection rule configuration, modify collection rule configuration.</li><li>COS import does not support this field.</li></ul>
     */
    public String getAddress() {
        return this.Address;
    }

    /**
     * Set <p>syslog system log collection specifies the address and port listened to by the collector, format: [ip]:[port]. This parameter is valid only when LogType is service_syslog. No need to specify for other types.<br>Note:</p><ul><li>This field applies to: create collection rule configuration, modify collection rule configuration.</li><li>COS import does not support this field.</li></ul>
     * @param Address <p>syslog system log collection specifies the address and port listened to by the collector, format: [ip]:[port]. This parameter is valid only when LogType is service_syslog. No need to specify for other types.<br>Note:</p><ul><li>This field applies to: create collection rule configuration, modify collection rule configuration.</li><li>COS import does not support this field.</li></ul>
     */
    public void setAddress(String Address) {
        this.Address = Address;
    }

    /**
     * Get <p>rfc3164: Specify system log collection using RFC3164 protocol parsing.<br>rfc5424: Specify system log collection using RFC5424 protocol parsing.<br>auto: Automatically match either RFC3164 or RFC5424 protocol.<br>This parameter is valid only when LogType is service_syslog. Not required for other types.<br>Note:</p><ul><li>This field is applicable to: create collection rule configuration, modify collection rule configuration.</li><li>COS import does not support this field.</li></ul> 
     * @return ParseProtocol <p>rfc3164: Specify system log collection using RFC3164 protocol parsing.<br>rfc5424: Specify system log collection using RFC5424 protocol parsing.<br>auto: Automatically match either RFC3164 or RFC5424 protocol.<br>This parameter is valid only when LogType is service_syslog. Not required for other types.<br>Note:</p><ul><li>This field is applicable to: create collection rule configuration, modify collection rule configuration.</li><li>COS import does not support this field.</li></ul>
     */
    public String getParseProtocol() {
        return this.ParseProtocol;
    }

    /**
     * Set <p>rfc3164: Specify system log collection using RFC3164 protocol parsing.<br>rfc5424: Specify system log collection using RFC5424 protocol parsing.<br>auto: Automatically match either RFC3164 or RFC5424 protocol.<br>This parameter is valid only when LogType is service_syslog. Not required for other types.<br>Note:</p><ul><li>This field is applicable to: create collection rule configuration, modify collection rule configuration.</li><li>COS import does not support this field.</li></ul>
     * @param ParseProtocol <p>rfc3164: Specify system log collection using RFC3164 protocol parsing.<br>rfc5424: Specify system log collection using RFC5424 protocol parsing.<br>auto: Automatically match either RFC3164 or RFC5424 protocol.<br>This parameter is valid only when LogType is service_syslog. Not required for other types.<br>Note:</p><ul><li>This field is applicable to: create collection rule configuration, modify collection rule configuration.</li><li>COS import does not support this field.</li></ul>
     */
    public void setParseProtocol(String ParseProtocol) {
        this.ParseProtocol = ParseProtocol;
    }

    /**
     * Get <p>Metadata type. 0: Not use metadata information; 1: Use machine group metadata; 2: Using custom metadata; 3: Use collection configuration path.<br>Note:</p><ul><li>COS import does not support this field.</li></ul> 
     * @return MetadataType <p>Metadata type. 0: Not use metadata information; 1: Use machine group metadata; 2: Using custom metadata; 3: Use collection configuration path.<br>Note:</p><ul><li>COS import does not support this field.</li></ul>
     */
    public Long getMetadataType() {
        return this.MetadataType;
    }

    /**
     * Set <p>Metadata type. 0: Not use metadata information; 1: Use machine group metadata; 2: Using custom metadata; 3: Use collection configuration path.<br>Note:</p><ul><li>COS import does not support this field.</li></ul>
     * @param MetadataType <p>Metadata type. 0: Not use metadata information; 1: Use machine group metadata; 2: Using custom metadata; 3: Use collection configuration path.<br>Note:</p><ul><li>COS import does not support this field.</li></ul>
     */
    public void setMetadataType(Long MetadataType) {
        this.MetadataType = MetadataType;
    }

    /**
     * Get <p>Collection configuration path regular expression.</p><p><pre><code>Use "()" to identify the regular expression corresponding to the target field in the path. During parsing, "()" is considered as a capture group and reported together with logs in the form of __TAG__.{i}:{target field name}, where i is the serial number of the capture group. If you do not want to use the serial number as the key name, you can define a custom key name through the named capturing group "(?&lt;{key name}&gt;{regular expression})" and report it together with logs in the form of __TAG__.{key name}:{target field name}. Supports up to 5 capture groups.</code></pre></p><p>Note:</p><ul><li>Required when MetadataType is 3.</li><li>This field is not supported in COS import.</li></ul> 
     * @return PathRegex <p>Collection configuration path regular expression.</p><p><pre><code>Use "()" to identify the regular expression corresponding to the target field in the path. During parsing, "()" is considered as a capture group and reported together with logs in the form of __TAG__.{i}:{target field name}, where i is the serial number of the capture group. If you do not want to use the serial number as the key name, you can define a custom key name through the named capturing group "(?&lt;{key name}&gt;{regular expression})" and report it together with logs in the form of __TAG__.{key name}:{target field name}. Supports up to 5 capture groups.</code></pre></p><p>Note:</p><ul><li>Required when MetadataType is 3.</li><li>This field is not supported in COS import.</li></ul>
     */
    public String getPathRegex() {
        return this.PathRegex;
    }

    /**
     * Set <p>Collection configuration path regular expression.</p><p><pre><code>Use "()" to identify the regular expression corresponding to the target field in the path. During parsing, "()" is considered as a capture group and reported together with logs in the form of __TAG__.{i}:{target field name}, where i is the serial number of the capture group. If you do not want to use the serial number as the key name, you can define a custom key name through the named capturing group "(?&lt;{key name}&gt;{regular expression})" and report it together with logs in the form of __TAG__.{key name}:{target field name}. Supports up to 5 capture groups.</code></pre></p><p>Note:</p><ul><li>Required when MetadataType is 3.</li><li>This field is not supported in COS import.</li></ul>
     * @param PathRegex <p>Collection configuration path regular expression.</p><p><pre><code>Use "()" to identify the regular expression corresponding to the target field in the path. During parsing, "()" is considered as a capture group and reported together with logs in the form of __TAG__.{i}:{target field name}, where i is the serial number of the capture group. If you do not want to use the serial number as the key name, you can define a custom key name through the named capturing group "(?&lt;{key name}&gt;{regular expression})" and report it together with logs in the form of __TAG__.{key name}:{target field name}. Supports up to 5 capture groups.</code></pre></p><p>Note:</p><ul><li>Required when MetadataType is 3.</li><li>This field is not supported in COS import.</li></ul>
     */
    public void setPathRegex(String PathRegex) {
        this.PathRegex = PathRegex;
    }

    /**
     * Get <p>User-defined metadata information.<br>Note:</p><ul><li>Required when MetadataType is 2.</li><li>This field is not supported for COS import.</li></ul> 
     * @return MetaTags <p>User-defined metadata information.<br>Note:</p><ul><li>Required when MetadataType is 2.</li><li>This field is not supported for COS import.</li></ul>
     */
    public MetaTagInfo [] getMetaTags() {
        return this.MetaTags;
    }

    /**
     * Set <p>User-defined metadata information.<br>Note:</p><ul><li>Required when MetadataType is 2.</li><li>This field is not supported for COS import.</li></ul>
     * @param MetaTags <p>User-defined metadata information.<br>Note:</p><ul><li>Required when MetadataType is 2.</li><li>This field is not supported for COS import.</li></ul>
     */
    public void setMetaTags(MetaTagInfo [] MetaTags) {
        this.MetaTags = MetaTags;
    }

    /**
     * Get <p>The Windows Event Log Collection rule is valid only when LogType is windows_event_log. No need to specify for other types.</p> 
     * @return EventLogRules <p>The Windows Event Log Collection rule is valid only when LogType is windows_event_log. No need to specify for other types.</p>
     */
    public EventLog [] getEventLogRules() {
        return this.EventLogRules;
    }

    /**
     * Set <p>The Windows Event Log Collection rule is valid only when LogType is windows_event_log. No need to specify for other types.</p>
     * @param EventLogRules <p>The Windows Event Log Collection rule is valid only when LogType is windows_event_log. No need to specify for other types.</p>
     */
    public void setEventLogRules(EventLog [] EventLogRules) {
        this.EventLogRules = EventLogRules;
    }

    /**
     * Get <p>Log filtering rule list (new version).<br>Note:</p><ul><li>LogListener versions below 2.9.3 do not support this. Please use FilterKeyRegex to configure log filter rules.</li><li>Self-built k8s collection configuration (CreateConfigExtra, ModifyConfigExtra) does not support this field.</li></ul>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AdvanceFilterRules <p>Log filtering rule list (new version).<br>Note:</p><ul><li>LogListener versions below 2.9.3 do not support this. Please use FilterKeyRegex to configure log filter rules.</li><li>Self-built k8s collection configuration (CreateConfigExtra, ModifyConfigExtra) does not support this field.</li></ul>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public AdvanceFilterRuleInfo [] getAdvanceFilterRules() {
        return this.AdvanceFilterRules;
    }

    /**
     * Set <p>Log filtering rule list (new version).<br>Note:</p><ul><li>LogListener versions below 2.9.3 do not support this. Please use FilterKeyRegex to configure log filter rules.</li><li>Self-built k8s collection configuration (CreateConfigExtra, ModifyConfigExtra) does not support this field.</li></ul>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AdvanceFilterRules <p>Log filtering rule list (new version).<br>Note:</p><ul><li>LogListener versions below 2.9.3 do not support this. Please use FilterKeyRegex to configure log filter rules.</li><li>Self-built k8s collection configuration (CreateConfigExtra, ModifyConfigExtra) does not support this field.</li></ul>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAdvanceFilterRules(AdvanceFilterRuleInfo [] AdvanceFilterRules) {
        this.AdvanceFilterRules = AdvanceFilterRules;
    }

    /**
     * Get <p>Key name of raw logs. All raw logs are uploaded with the Key name you specified, and the original log content as Value. If left empty, raw log upload is disabled.</p><ul><li>COS import does not support this field.</li></ul> 
     * @return RawLogKey <p>Key name of raw logs. All raw logs are uploaded with the Key name you specified, and the original log content as Value. If left empty, raw log upload is disabled.</p><ul><li>COS import does not support this field.</li></ul>
     */
    public String getRawLogKey() {
        return this.RawLogKey;
    }

    /**
     * Set <p>Key name of raw logs. All raw logs are uploaded with the Key name you specified, and the original log content as Value. If left empty, raw log upload is disabled.</p><ul><li>COS import does not support this field.</li></ul>
     * @param RawLogKey <p>Key name of raw logs. All raw logs are uploaded with the Key name you specified, and the original log content as Value. If left empty, raw log upload is disabled.</p><ul><li>COS import does not support this field.</li></ul>
     */
    public void setRawLogKey(String RawLogKey) {
        this.RawLogKey = RawLogKey;
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
        if (source.AdvanceFilterRules != null) {
            this.AdvanceFilterRules = new AdvanceFilterRuleInfo[source.AdvanceFilterRules.length];
            for (int i = 0; i < source.AdvanceFilterRules.length; i++) {
                this.AdvanceFilterRules[i] = new AdvanceFilterRuleInfo(source.AdvanceFilterRules[i]);
            }
        }
        if (source.RawLogKey != null) {
            this.RawLogKey = new String(source.RawLogKey);
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
        this.setParamArrayObj(map, prefix + "AdvanceFilterRules.", this.AdvanceFilterRules);
        this.setParamSimple(map, prefix + "RawLogKey", this.RawLogKey);

    }
}

