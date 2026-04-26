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
    * Retweet recording mode. 
0/Leave blank: not currently supported; behavior is undefined.
1: disable recording.
2: enable recording (via console automatic recording template parameters, see: [redirection document](https://www.tencentcloud.comom/document/product/647/111748?from_cn_redirect=1#.E5.BD.95.E5.88.B6.E6.8E.A7.E5.88.B6.E6.96.B9.E6.A1.88));.
3: enable recording (use API to specify parameter).
    */
    @SerializedName("UniRecord")
    @Expose
    private Long UniRecord;

    /**
    * Recording task key, identifies a recording task. you can record multiple relay tasks into a file by specifying this parameter. if this parameter is not specified, only the current relay task is recorded.
Limit length to 128 bytes, only allow a combination of uppercase and lowercase letters (a-zA-Z), digits (0-9), underscores (_), and hyphens (-).
    */
    @SerializedName("RecordKey")
    @Expose
    private String RecordKey;

    /**
    * [Valid only when UniRecord=3.].
Resume recording waiting time, corresponding to the "wait time for resumption" in the recording template, unit: seconds. the value must be greater than or equal to 5 and less than or equal to 86400 (24 hours), with a default value of 30. when resumption is enabled, the recording task ends automatically if idle for a duration exceeding RecordWaitTime.
    */
    @SerializedName("RecordWaitTime")
    @Expose
    private Long RecordWaitTime;

    /**
    * [Valid only when UniRecord=3.].
The list of output file formats for recording corresponds to the "file format" in the recording template. it supports three formats: "hls", "mp4", and "aac". the default value is "mp4". among them, "mp4" and "aac" formats cannot be specified simultaneously.
Record only the mp4 format, example value: ["mp4"]. record both mp4 and HLS formats simultaneously, example value: ["mp4","HLS"].
    */
    @SerializedName("RecordFormat")
    @Expose
    private String [] RecordFormat;

    /**
    * [Valid only when UniRecord=3.].
Single file recording duration, corresponding to the "max recording time per file" in the recording template, unit: minutes. the value must be greater than or equal to 1 and less than or equal to 1440 (24 hours), with a default value of 1440. it only takes effect for "mp4" or "aac" format. the actual single file recording duration is also limited by the file size not exceeding 2G. if it exceeds 2G, the file will be forcibly split.
    */
    @SerializedName("MaxMediaFileDuration")
    @Expose
    private Long MaxMediaFileDuration;

    /**
    * [Valid only when UniRecord=3.].
The audio and video type of the recording corresponds to the "recording format" in the recording template. valid values: 0 (audio and video), 1 (pure audio), 2 (video only). the final recording file content is the intersection of the specified type and the relayed content.
    */
    @SerializedName("StreamType")
    @Expose
    private Long StreamType;

    /**
    * Recording file name prefix, no more than 64 characters. this parameter is valid only when store is vod.
Limit length to 64 bytes, only allow a combination of uppercase and lowercase letters (a-zA-Z), digits (0-9), underscores (_), and hyphens (-).
    */
    @SerializedName("UserDefineRecordPrefix")
    @Expose
    private String UserDefineRecordPrefix;

    /**
    * [Valid only when UniRecord=3.].
Recording files storage parameters, corresponding console "storage location" and related parameters. currently supports VOD and COS storage methods. only one can be filled.
    */
    @SerializedName("McuStorageParams")
    @Expose
    private McuStorageParams McuStorageParams;

    /**
     * Get Retweet recording mode. 
0/Leave blank: not currently supported; behavior is undefined.
1: disable recording.
2: enable recording (via console automatic recording template parameters, see: [redirection document](https://www.tencentcloud.comom/document/product/647/111748?from_cn_redirect=1#.E5.BD.95.E5.88.B6.E6.8E.A7.E5.88.B6.E6.96.B9.E6.A1.88));.
3: enable recording (use API to specify parameter). 
     * @return UniRecord Retweet recording mode. 
0/Leave blank: not currently supported; behavior is undefined.
1: disable recording.
2: enable recording (via console automatic recording template parameters, see: [redirection document](https://www.tencentcloud.comom/document/product/647/111748?from_cn_redirect=1#.E5.BD.95.E5.88.B6.E6.8E.A7.E5.88.B6.E6.96.B9.E6.A1.88));.
3: enable recording (use API to specify parameter).
     */
    public Long getUniRecord() {
        return this.UniRecord;
    }

    /**
     * Set Retweet recording mode. 
0/Leave blank: not currently supported; behavior is undefined.
1: disable recording.
2: enable recording (via console automatic recording template parameters, see: [redirection document](https://www.tencentcloud.comom/document/product/647/111748?from_cn_redirect=1#.E5.BD.95.E5.88.B6.E6.8E.A7.E5.88.B6.E6.96.B9.E6.A1.88));.
3: enable recording (use API to specify parameter).
     * @param UniRecord Retweet recording mode. 
0/Leave blank: not currently supported; behavior is undefined.
1: disable recording.
2: enable recording (via console automatic recording template parameters, see: [redirection document](https://www.tencentcloud.comom/document/product/647/111748?from_cn_redirect=1#.E5.BD.95.E5.88.B6.E6.8E.A7.E5.88.B6.E6.96.B9.E6.A1.88));.
3: enable recording (use API to specify parameter).
     */
    public void setUniRecord(Long UniRecord) {
        this.UniRecord = UniRecord;
    }

    /**
     * Get Recording task key, identifies a recording task. you can record multiple relay tasks into a file by specifying this parameter. if this parameter is not specified, only the current relay task is recorded.
Limit length to 128 bytes, only allow a combination of uppercase and lowercase letters (a-zA-Z), digits (0-9), underscores (_), and hyphens (-). 
     * @return RecordKey Recording task key, identifies a recording task. you can record multiple relay tasks into a file by specifying this parameter. if this parameter is not specified, only the current relay task is recorded.
Limit length to 128 bytes, only allow a combination of uppercase and lowercase letters (a-zA-Z), digits (0-9), underscores (_), and hyphens (-).
     */
    public String getRecordKey() {
        return this.RecordKey;
    }

    /**
     * Set Recording task key, identifies a recording task. you can record multiple relay tasks into a file by specifying this parameter. if this parameter is not specified, only the current relay task is recorded.
Limit length to 128 bytes, only allow a combination of uppercase and lowercase letters (a-zA-Z), digits (0-9), underscores (_), and hyphens (-).
     * @param RecordKey Recording task key, identifies a recording task. you can record multiple relay tasks into a file by specifying this parameter. if this parameter is not specified, only the current relay task is recorded.
Limit length to 128 bytes, only allow a combination of uppercase and lowercase letters (a-zA-Z), digits (0-9), underscores (_), and hyphens (-).
     */
    public void setRecordKey(String RecordKey) {
        this.RecordKey = RecordKey;
    }

    /**
     * Get [Valid only when UniRecord=3.].
Resume recording waiting time, corresponding to the "wait time for resumption" in the recording template, unit: seconds. the value must be greater than or equal to 5 and less than or equal to 86400 (24 hours), with a default value of 30. when resumption is enabled, the recording task ends automatically if idle for a duration exceeding RecordWaitTime. 
     * @return RecordWaitTime [Valid only when UniRecord=3.].
Resume recording waiting time, corresponding to the "wait time for resumption" in the recording template, unit: seconds. the value must be greater than or equal to 5 and less than or equal to 86400 (24 hours), with a default value of 30. when resumption is enabled, the recording task ends automatically if idle for a duration exceeding RecordWaitTime.
     */
    public Long getRecordWaitTime() {
        return this.RecordWaitTime;
    }

    /**
     * Set [Valid only when UniRecord=3.].
Resume recording waiting time, corresponding to the "wait time for resumption" in the recording template, unit: seconds. the value must be greater than or equal to 5 and less than or equal to 86400 (24 hours), with a default value of 30. when resumption is enabled, the recording task ends automatically if idle for a duration exceeding RecordWaitTime.
     * @param RecordWaitTime [Valid only when UniRecord=3.].
Resume recording waiting time, corresponding to the "wait time for resumption" in the recording template, unit: seconds. the value must be greater than or equal to 5 and less than or equal to 86400 (24 hours), with a default value of 30. when resumption is enabled, the recording task ends automatically if idle for a duration exceeding RecordWaitTime.
     */
    public void setRecordWaitTime(Long RecordWaitTime) {
        this.RecordWaitTime = RecordWaitTime;
    }

    /**
     * Get [Valid only when UniRecord=3.].
The list of output file formats for recording corresponds to the "file format" in the recording template. it supports three formats: "hls", "mp4", and "aac". the default value is "mp4". among them, "mp4" and "aac" formats cannot be specified simultaneously.
Record only the mp4 format, example value: ["mp4"]. record both mp4 and HLS formats simultaneously, example value: ["mp4","HLS"]. 
     * @return RecordFormat [Valid only when UniRecord=3.].
The list of output file formats for recording corresponds to the "file format" in the recording template. it supports three formats: "hls", "mp4", and "aac". the default value is "mp4". among them, "mp4" and "aac" formats cannot be specified simultaneously.
Record only the mp4 format, example value: ["mp4"]. record both mp4 and HLS formats simultaneously, example value: ["mp4","HLS"].
     */
    public String [] getRecordFormat() {
        return this.RecordFormat;
    }

    /**
     * Set [Valid only when UniRecord=3.].
The list of output file formats for recording corresponds to the "file format" in the recording template. it supports three formats: "hls", "mp4", and "aac". the default value is "mp4". among them, "mp4" and "aac" formats cannot be specified simultaneously.
Record only the mp4 format, example value: ["mp4"]. record both mp4 and HLS formats simultaneously, example value: ["mp4","HLS"].
     * @param RecordFormat [Valid only when UniRecord=3.].
The list of output file formats for recording corresponds to the "file format" in the recording template. it supports three formats: "hls", "mp4", and "aac". the default value is "mp4". among them, "mp4" and "aac" formats cannot be specified simultaneously.
Record only the mp4 format, example value: ["mp4"]. record both mp4 and HLS formats simultaneously, example value: ["mp4","HLS"].
     */
    public void setRecordFormat(String [] RecordFormat) {
        this.RecordFormat = RecordFormat;
    }

    /**
     * Get [Valid only when UniRecord=3.].
Single file recording duration, corresponding to the "max recording time per file" in the recording template, unit: minutes. the value must be greater than or equal to 1 and less than or equal to 1440 (24 hours), with a default value of 1440. it only takes effect for "mp4" or "aac" format. the actual single file recording duration is also limited by the file size not exceeding 2G. if it exceeds 2G, the file will be forcibly split. 
     * @return MaxMediaFileDuration [Valid only when UniRecord=3.].
Single file recording duration, corresponding to the "max recording time per file" in the recording template, unit: minutes. the value must be greater than or equal to 1 and less than or equal to 1440 (24 hours), with a default value of 1440. it only takes effect for "mp4" or "aac" format. the actual single file recording duration is also limited by the file size not exceeding 2G. if it exceeds 2G, the file will be forcibly split.
     */
    public Long getMaxMediaFileDuration() {
        return this.MaxMediaFileDuration;
    }

    /**
     * Set [Valid only when UniRecord=3.].
Single file recording duration, corresponding to the "max recording time per file" in the recording template, unit: minutes. the value must be greater than or equal to 1 and less than or equal to 1440 (24 hours), with a default value of 1440. it only takes effect for "mp4" or "aac" format. the actual single file recording duration is also limited by the file size not exceeding 2G. if it exceeds 2G, the file will be forcibly split.
     * @param MaxMediaFileDuration [Valid only when UniRecord=3.].
Single file recording duration, corresponding to the "max recording time per file" in the recording template, unit: minutes. the value must be greater than or equal to 1 and less than or equal to 1440 (24 hours), with a default value of 1440. it only takes effect for "mp4" or "aac" format. the actual single file recording duration is also limited by the file size not exceeding 2G. if it exceeds 2G, the file will be forcibly split.
     */
    public void setMaxMediaFileDuration(Long MaxMediaFileDuration) {
        this.MaxMediaFileDuration = MaxMediaFileDuration;
    }

    /**
     * Get [Valid only when UniRecord=3.].
The audio and video type of the recording corresponds to the "recording format" in the recording template. valid values: 0 (audio and video), 1 (pure audio), 2 (video only). the final recording file content is the intersection of the specified type and the relayed content. 
     * @return StreamType [Valid only when UniRecord=3.].
The audio and video type of the recording corresponds to the "recording format" in the recording template. valid values: 0 (audio and video), 1 (pure audio), 2 (video only). the final recording file content is the intersection of the specified type and the relayed content.
     */
    public Long getStreamType() {
        return this.StreamType;
    }

    /**
     * Set [Valid only when UniRecord=3.].
The audio and video type of the recording corresponds to the "recording format" in the recording template. valid values: 0 (audio and video), 1 (pure audio), 2 (video only). the final recording file content is the intersection of the specified type and the relayed content.
     * @param StreamType [Valid only when UniRecord=3.].
The audio and video type of the recording corresponds to the "recording format" in the recording template. valid values: 0 (audio and video), 1 (pure audio), 2 (video only). the final recording file content is the intersection of the specified type and the relayed content.
     */
    public void setStreamType(Long StreamType) {
        this.StreamType = StreamType;
    }

    /**
     * Get Recording file name prefix, no more than 64 characters. this parameter is valid only when store is vod.
Limit length to 64 bytes, only allow a combination of uppercase and lowercase letters (a-zA-Z), digits (0-9), underscores (_), and hyphens (-). 
     * @return UserDefineRecordPrefix Recording file name prefix, no more than 64 characters. this parameter is valid only when store is vod.
Limit length to 64 bytes, only allow a combination of uppercase and lowercase letters (a-zA-Z), digits (0-9), underscores (_), and hyphens (-).
     */
    public String getUserDefineRecordPrefix() {
        return this.UserDefineRecordPrefix;
    }

    /**
     * Set Recording file name prefix, no more than 64 characters. this parameter is valid only when store is vod.
Limit length to 64 bytes, only allow a combination of uppercase and lowercase letters (a-zA-Z), digits (0-9), underscores (_), and hyphens (-).
     * @param UserDefineRecordPrefix Recording file name prefix, no more than 64 characters. this parameter is valid only when store is vod.
Limit length to 64 bytes, only allow a combination of uppercase and lowercase letters (a-zA-Z), digits (0-9), underscores (_), and hyphens (-).
     */
    public void setUserDefineRecordPrefix(String UserDefineRecordPrefix) {
        this.UserDefineRecordPrefix = UserDefineRecordPrefix;
    }

    /**
     * Get [Valid only when UniRecord=3.].
Recording files storage parameters, corresponding console "storage location" and related parameters. currently supports VOD and COS storage methods. only one can be filled. 
     * @return McuStorageParams [Valid only when UniRecord=3.].
Recording files storage parameters, corresponding console "storage location" and related parameters. currently supports VOD and COS storage methods. only one can be filled.
     */
    public McuStorageParams getMcuStorageParams() {
        return this.McuStorageParams;
    }

    /**
     * Set [Valid only when UniRecord=3.].
Recording files storage parameters, corresponding console "storage location" and related parameters. currently supports VOD and COS storage methods. only one can be filled.
     * @param McuStorageParams [Valid only when UniRecord=3.].
Recording files storage parameters, corresponding console "storage location" and related parameters. currently supports VOD and COS storage methods. only one can be filled.
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

