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
package com.tencentcloudapi.trtc.v20190722.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class McuRecordParams extends AbstractModel {

    /**
    * Relay Recording Mode
0/blank: Not currently supported, behavior undefined.
1: Disable recording.
2: Start recording (uses console's auto-recording template parameters. Reference: [Link to Documentation]).
3: Start recording (uses API-specified parameters).
Example: 2
    */
    @SerializedName("UniRecord")
    @Expose
    private Long UniRecord;

    /**
    * Recording Task Key
Identifies a recording task. This parameter allows merging multiple relay tasks into one recording file. If unspecified, only records the current relay task.
[Format: Up to 128 bytes; only letters (a-z, A-Z), numbers (0-9), underscores (_), and hyphens (-).]
Example: test_record_key_a
    */
    @SerializedName("RecordKey")
    @Expose
    private String RecordKey;

    /**
    * [Valid only when UniRecord=3]
Recording Resume Wait Time
Corresponds to template parameter "Resume Wait Duration." Unit: seconds.
Range: 5-86400 (24 hours). Default: 30. Recording stops if idle longer than this value.
Example: 30
    */
    @SerializedName("RecordWaitTime")
    @Expose
    private Long RecordWaitTime;

    /**
    * [Valid only when UniRecord=3]
Recording Output Formats
Corresponds to template parameter "File Format." Supported values: hls, mp4, aac. Default: mp4.
Note: mp4 and aac formats are mutually exclusive.
Example (MP4 only): ["mp4"]
Example (MP4 + HLS): ["mp4","hls"]
    */
    @SerializedName("RecordFormat")
    @Expose
    private String [] RecordFormat;

    /**
    * [Valid only when UniRecord=3]
Single File Duration
Corresponds to template parameter "Max File Duration." Unit: minutes.
Range: 1-1440 (24 hours). Default: 1440. Applies only to mp4/aac. Actual duration is capped at 2GB file size.
Example: 1440
    */
    @SerializedName("MaxMediaFileDuration")
    @Expose
    private Long MaxMediaFileDuration;

    /**
    * [Valid only when UniRecord=3]
Recording Media Type
Corresponds to template parameter "Recording Format."
0: Audio+Video, 1: Audio only, 2: Video only. Output is the intersection of this setting and relay content.
Example: 0
    */
    @SerializedName("StreamType")
    @Expose
    private Long StreamType;

    /**
    * Recording Filename Prefix
Filename prefix (<=64 bytes). Applies only to VOD storage.
*Format: Letters (a-z, A-Z), numbers (0-9), underscores (_), hyphens (-).*
Example: mcu_record_prefix
    */
    @SerializedName("UserDefineRecordPrefix")
    @Expose
    private String UserDefineRecordPrefix;

    /**
    * [Valid only when UniRecord=3]
Recording Storage Parameters
Corresponds to console parameter "Storage Location." Supports Tencent VOD or COS (exclusively).
Example: {"McuCloudVod":{"McuTencentVod":{"ExpireTime":86400}}}
    */
    @SerializedName("McuStorageParams")
    @Expose
    private McuStorageParams McuStorageParams;

    /**
     * Get Relay Recording Mode
0/blank: Not currently supported, behavior undefined.
1: Disable recording.
2: Start recording (uses console's auto-recording template parameters. Reference: [Link to Documentation]).
3: Start recording (uses API-specified parameters).
Example: 2 
     * @return UniRecord Relay Recording Mode
0/blank: Not currently supported, behavior undefined.
1: Disable recording.
2: Start recording (uses console's auto-recording template parameters. Reference: [Link to Documentation]).
3: Start recording (uses API-specified parameters).
Example: 2
     */
    public Long getUniRecord() {
        return this.UniRecord;
    }

    /**
     * Set Relay Recording Mode
0/blank: Not currently supported, behavior undefined.
1: Disable recording.
2: Start recording (uses console's auto-recording template parameters. Reference: [Link to Documentation]).
3: Start recording (uses API-specified parameters).
Example: 2
     * @param UniRecord Relay Recording Mode
0/blank: Not currently supported, behavior undefined.
1: Disable recording.
2: Start recording (uses console's auto-recording template parameters. Reference: [Link to Documentation]).
3: Start recording (uses API-specified parameters).
Example: 2
     */
    public void setUniRecord(Long UniRecord) {
        this.UniRecord = UniRecord;
    }

    /**
     * Get Recording Task Key
Identifies a recording task. This parameter allows merging multiple relay tasks into one recording file. If unspecified, only records the current relay task.
[Format: Up to 128 bytes; only letters (a-z, A-Z), numbers (0-9), underscores (_), and hyphens (-).]
Example: test_record_key_a 
     * @return RecordKey Recording Task Key
Identifies a recording task. This parameter allows merging multiple relay tasks into one recording file. If unspecified, only records the current relay task.
[Format: Up to 128 bytes; only letters (a-z, A-Z), numbers (0-9), underscores (_), and hyphens (-).]
Example: test_record_key_a
     */
    public String getRecordKey() {
        return this.RecordKey;
    }

    /**
     * Set Recording Task Key
Identifies a recording task. This parameter allows merging multiple relay tasks into one recording file. If unspecified, only records the current relay task.
[Format: Up to 128 bytes; only letters (a-z, A-Z), numbers (0-9), underscores (_), and hyphens (-).]
Example: test_record_key_a
     * @param RecordKey Recording Task Key
Identifies a recording task. This parameter allows merging multiple relay tasks into one recording file. If unspecified, only records the current relay task.
[Format: Up to 128 bytes; only letters (a-z, A-Z), numbers (0-9), underscores (_), and hyphens (-).]
Example: test_record_key_a
     */
    public void setRecordKey(String RecordKey) {
        this.RecordKey = RecordKey;
    }

    /**
     * Get [Valid only when UniRecord=3]
Recording Resume Wait Time
Corresponds to template parameter "Resume Wait Duration." Unit: seconds.
Range: 5-86400 (24 hours). Default: 30. Recording stops if idle longer than this value.
Example: 30 
     * @return RecordWaitTime [Valid only when UniRecord=3]
Recording Resume Wait Time
Corresponds to template parameter "Resume Wait Duration." Unit: seconds.
Range: 5-86400 (24 hours). Default: 30. Recording stops if idle longer than this value.
Example: 30
     */
    public Long getRecordWaitTime() {
        return this.RecordWaitTime;
    }

    /**
     * Set [Valid only when UniRecord=3]
Recording Resume Wait Time
Corresponds to template parameter "Resume Wait Duration." Unit: seconds.
Range: 5-86400 (24 hours). Default: 30. Recording stops if idle longer than this value.
Example: 30
     * @param RecordWaitTime [Valid only when UniRecord=3]
Recording Resume Wait Time
Corresponds to template parameter "Resume Wait Duration." Unit: seconds.
Range: 5-86400 (24 hours). Default: 30. Recording stops if idle longer than this value.
Example: 30
     */
    public void setRecordWaitTime(Long RecordWaitTime) {
        this.RecordWaitTime = RecordWaitTime;
    }

    /**
     * Get [Valid only when UniRecord=3]
Recording Output Formats
Corresponds to template parameter "File Format." Supported values: hls, mp4, aac. Default: mp4.
Note: mp4 and aac formats are mutually exclusive.
Example (MP4 only): ["mp4"]
Example (MP4 + HLS): ["mp4","hls"] 
     * @return RecordFormat [Valid only when UniRecord=3]
Recording Output Formats
Corresponds to template parameter "File Format." Supported values: hls, mp4, aac. Default: mp4.
Note: mp4 and aac formats are mutually exclusive.
Example (MP4 only): ["mp4"]
Example (MP4 + HLS): ["mp4","hls"]
     */
    public String [] getRecordFormat() {
        return this.RecordFormat;
    }

    /**
     * Set [Valid only when UniRecord=3]
Recording Output Formats
Corresponds to template parameter "File Format." Supported values: hls, mp4, aac. Default: mp4.
Note: mp4 and aac formats are mutually exclusive.
Example (MP4 only): ["mp4"]
Example (MP4 + HLS): ["mp4","hls"]
     * @param RecordFormat [Valid only when UniRecord=3]
Recording Output Formats
Corresponds to template parameter "File Format." Supported values: hls, mp4, aac. Default: mp4.
Note: mp4 and aac formats are mutually exclusive.
Example (MP4 only): ["mp4"]
Example (MP4 + HLS): ["mp4","hls"]
     */
    public void setRecordFormat(String [] RecordFormat) {
        this.RecordFormat = RecordFormat;
    }

    /**
     * Get [Valid only when UniRecord=3]
Single File Duration
Corresponds to template parameter "Max File Duration." Unit: minutes.
Range: 1-1440 (24 hours). Default: 1440. Applies only to mp4/aac. Actual duration is capped at 2GB file size.
Example: 1440 
     * @return MaxMediaFileDuration [Valid only when UniRecord=3]
Single File Duration
Corresponds to template parameter "Max File Duration." Unit: minutes.
Range: 1-1440 (24 hours). Default: 1440. Applies only to mp4/aac. Actual duration is capped at 2GB file size.
Example: 1440
     */
    public Long getMaxMediaFileDuration() {
        return this.MaxMediaFileDuration;
    }

    /**
     * Set [Valid only when UniRecord=3]
Single File Duration
Corresponds to template parameter "Max File Duration." Unit: minutes.
Range: 1-1440 (24 hours). Default: 1440. Applies only to mp4/aac. Actual duration is capped at 2GB file size.
Example: 1440
     * @param MaxMediaFileDuration [Valid only when UniRecord=3]
Single File Duration
Corresponds to template parameter "Max File Duration." Unit: minutes.
Range: 1-1440 (24 hours). Default: 1440. Applies only to mp4/aac. Actual duration is capped at 2GB file size.
Example: 1440
     */
    public void setMaxMediaFileDuration(Long MaxMediaFileDuration) {
        this.MaxMediaFileDuration = MaxMediaFileDuration;
    }

    /**
     * Get [Valid only when UniRecord=3]
Recording Media Type
Corresponds to template parameter "Recording Format."
0: Audio+Video, 1: Audio only, 2: Video only. Output is the intersection of this setting and relay content.
Example: 0 
     * @return StreamType [Valid only when UniRecord=3]
Recording Media Type
Corresponds to template parameter "Recording Format."
0: Audio+Video, 1: Audio only, 2: Video only. Output is the intersection of this setting and relay content.
Example: 0
     */
    public Long getStreamType() {
        return this.StreamType;
    }

    /**
     * Set [Valid only when UniRecord=3]
Recording Media Type
Corresponds to template parameter "Recording Format."
0: Audio+Video, 1: Audio only, 2: Video only. Output is the intersection of this setting and relay content.
Example: 0
     * @param StreamType [Valid only when UniRecord=3]
Recording Media Type
Corresponds to template parameter "Recording Format."
0: Audio+Video, 1: Audio only, 2: Video only. Output is the intersection of this setting and relay content.
Example: 0
     */
    public void setStreamType(Long StreamType) {
        this.StreamType = StreamType;
    }

    /**
     * Get Recording Filename Prefix
Filename prefix (<=64 bytes). Applies only to VOD storage.
*Format: Letters (a-z, A-Z), numbers (0-9), underscores (_), hyphens (-).*
Example: mcu_record_prefix 
     * @return UserDefineRecordPrefix Recording Filename Prefix
Filename prefix (<=64 bytes). Applies only to VOD storage.
*Format: Letters (a-z, A-Z), numbers (0-9), underscores (_), hyphens (-).*
Example: mcu_record_prefix
     */
    public String getUserDefineRecordPrefix() {
        return this.UserDefineRecordPrefix;
    }

    /**
     * Set Recording Filename Prefix
Filename prefix (<=64 bytes). Applies only to VOD storage.
*Format: Letters (a-z, A-Z), numbers (0-9), underscores (_), hyphens (-).*
Example: mcu_record_prefix
     * @param UserDefineRecordPrefix Recording Filename Prefix
Filename prefix (<=64 bytes). Applies only to VOD storage.
*Format: Letters (a-z, A-Z), numbers (0-9), underscores (_), hyphens (-).*
Example: mcu_record_prefix
     */
    public void setUserDefineRecordPrefix(String UserDefineRecordPrefix) {
        this.UserDefineRecordPrefix = UserDefineRecordPrefix;
    }

    /**
     * Get [Valid only when UniRecord=3]
Recording Storage Parameters
Corresponds to console parameter "Storage Location." Supports Tencent VOD or COS (exclusively).
Example: {"McuCloudVod":{"McuTencentVod":{"ExpireTime":86400}}} 
     * @return McuStorageParams [Valid only when UniRecord=3]
Recording Storage Parameters
Corresponds to console parameter "Storage Location." Supports Tencent VOD or COS (exclusively).
Example: {"McuCloudVod":{"McuTencentVod":{"ExpireTime":86400}}}
     */
    public McuStorageParams getMcuStorageParams() {
        return this.McuStorageParams;
    }

    /**
     * Set [Valid only when UniRecord=3]
Recording Storage Parameters
Corresponds to console parameter "Storage Location." Supports Tencent VOD or COS (exclusively).
Example: {"McuCloudVod":{"McuTencentVod":{"ExpireTime":86400}}}
     * @param McuStorageParams [Valid only when UniRecord=3]
Recording Storage Parameters
Corresponds to console parameter "Storage Location." Supports Tencent VOD or COS (exclusively).
Example: {"McuCloudVod":{"McuTencentVod":{"ExpireTime":86400}}}
     */
    public void setMcuStorageParams(McuStorageParams McuStorageParams) {
        this.McuStorageParams = McuStorageParams;
    }

    public McuRecordParams() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public McuRecordParams(McuRecordParams source) {
        if (source.UniRecord != null) {
            this.UniRecord = new Long(source.UniRecord);
        }
        if (source.RecordKey != null) {
            this.RecordKey = new String(source.RecordKey);
        }
        if (source.RecordWaitTime != null) {
            this.RecordWaitTime = new Long(source.RecordWaitTime);
        }
        if (source.RecordFormat != null) {
            this.RecordFormat = new String[source.RecordFormat.length];
            for (int i = 0; i < source.RecordFormat.length; i++) {
                this.RecordFormat[i] = new String(source.RecordFormat[i]);
            }
        }
        if (source.MaxMediaFileDuration != null) {
            this.MaxMediaFileDuration = new Long(source.MaxMediaFileDuration);
        }
        if (source.StreamType != null) {
            this.StreamType = new Long(source.StreamType);
        }
        if (source.UserDefineRecordPrefix != null) {
            this.UserDefineRecordPrefix = new String(source.UserDefineRecordPrefix);
        }
        if (source.McuStorageParams != null) {
            this.McuStorageParams = new McuStorageParams(source.McuStorageParams);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UniRecord", this.UniRecord);
        this.setParamSimple(map, prefix + "RecordKey", this.RecordKey);
        this.setParamSimple(map, prefix + "RecordWaitTime", this.RecordWaitTime);
        this.setParamArraySimple(map, prefix + "RecordFormat.", this.RecordFormat);
        this.setParamSimple(map, prefix + "MaxMediaFileDuration", this.MaxMediaFileDuration);
        this.setParamSimple(map, prefix + "StreamType", this.StreamType);
        this.setParamSimple(map, prefix + "UserDefineRecordPrefix", this.UserDefineRecordPrefix);
        this.setParamObj(map, prefix + "McuStorageParams.", this.McuStorageParams);

    }
}

