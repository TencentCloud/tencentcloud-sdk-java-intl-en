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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RecordParam extends AbstractModel{

    /**
    * Recording interval.
In seconds. Default value: 1800.
Value range: 300–7200.
This parameter is not valid for HLS, and a file will be generated from push start to interruption during HLS recording.
    */
    @SerializedName("RecordInterval")
    @Expose
    private Long RecordInterval;

    /**
    * Recording storage period.
In seconds. Value range: 0–93312000.
0: permanent storage.
    */
    @SerializedName("StorageTime")
    @Expose
    private Long StorageTime;

    /**
    * Whether to enable recording in the current format. Default value: 0. 0: no, 1: yes.
    */
    @SerializedName("Enable")
    @Expose
    private Long Enable;

    /**
    * VOD subapplication ID.
    */
    @SerializedName("VodSubAppId")
    @Expose
    private Long VodSubAppId;

    /**
    * Recording filename.
Supported special placeholders include:
{StreamID}: stream ID
{StartYear}: start time - year
{StartMonth}: start time - month
{StartDay}: start time - day
{StartHour}: start time - hour
{StartMinute}: start time - minute
{StartSecond}: start time - second
{StartMillisecond}: start time - millisecond
{EndYear}: end time - year
{EndMonth}: end time - month
{EndDay}: end time - day
{EndHour}: end time - hour
{EndMinute}: end time - minute
{EndSecond}: end time - second
{EndMillisecond}: end time - millisecond

If this parameter is not set, the recording filename will be `{StreamID}_{StartYear}-{StartMonth}-{StartDay}-{StartHour}-{StartMinute}-{StartSecond}_{EndYear}-{EndMonth}-{EndDay}-{EndHour}-{EndMinute}-{EndSecond}` by default
    */
    @SerializedName("VodFileName")
    @Expose
    private String VodFileName;

    /**
     * Get Recording interval.
In seconds. Default value: 1800.
Value range: 300–7200.
This parameter is not valid for HLS, and a file will be generated from push start to interruption during HLS recording. 
     * @return RecordInterval Recording interval.
In seconds. Default value: 1800.
Value range: 300–7200.
This parameter is not valid for HLS, and a file will be generated from push start to interruption during HLS recording.
     */
    public Long getRecordInterval() {
        return this.RecordInterval;
    }

    /**
     * Set Recording interval.
In seconds. Default value: 1800.
Value range: 300–7200.
This parameter is not valid for HLS, and a file will be generated from push start to interruption during HLS recording.
     * @param RecordInterval Recording interval.
In seconds. Default value: 1800.
Value range: 300–7200.
This parameter is not valid for HLS, and a file will be generated from push start to interruption during HLS recording.
     */
    public void setRecordInterval(Long RecordInterval) {
        this.RecordInterval = RecordInterval;
    }

    /**
     * Get Recording storage period.
In seconds. Value range: 0–93312000.
0: permanent storage. 
     * @return StorageTime Recording storage period.
In seconds. Value range: 0–93312000.
0: permanent storage.
     */
    public Long getStorageTime() {
        return this.StorageTime;
    }

    /**
     * Set Recording storage period.
In seconds. Value range: 0–93312000.
0: permanent storage.
     * @param StorageTime Recording storage period.
In seconds. Value range: 0–93312000.
0: permanent storage.
     */
    public void setStorageTime(Long StorageTime) {
        this.StorageTime = StorageTime;
    }

    /**
     * Get Whether to enable recording in the current format. Default value: 0. 0: no, 1: yes. 
     * @return Enable Whether to enable recording in the current format. Default value: 0. 0: no, 1: yes.
     */
    public Long getEnable() {
        return this.Enable;
    }

    /**
     * Set Whether to enable recording in the current format. Default value: 0. 0: no, 1: yes.
     * @param Enable Whether to enable recording in the current format. Default value: 0. 0: no, 1: yes.
     */
    public void setEnable(Long Enable) {
        this.Enable = Enable;
    }

    /**
     * Get VOD subapplication ID. 
     * @return VodSubAppId VOD subapplication ID.
     */
    public Long getVodSubAppId() {
        return this.VodSubAppId;
    }

    /**
     * Set VOD subapplication ID.
     * @param VodSubAppId VOD subapplication ID.
     */
    public void setVodSubAppId(Long VodSubAppId) {
        this.VodSubAppId = VodSubAppId;
    }

    /**
     * Get Recording filename.
Supported special placeholders include:
{StreamID}: stream ID
{StartYear}: start time - year
{StartMonth}: start time - month
{StartDay}: start time - day
{StartHour}: start time - hour
{StartMinute}: start time - minute
{StartSecond}: start time - second
{StartMillisecond}: start time - millisecond
{EndYear}: end time - year
{EndMonth}: end time - month
{EndDay}: end time - day
{EndHour}: end time - hour
{EndMinute}: end time - minute
{EndSecond}: end time - second
{EndMillisecond}: end time - millisecond

If this parameter is not set, the recording filename will be `{StreamID}_{StartYear}-{StartMonth}-{StartDay}-{StartHour}-{StartMinute}-{StartSecond}_{EndYear}-{EndMonth}-{EndDay}-{EndHour}-{EndMinute}-{EndSecond}` by default 
     * @return VodFileName Recording filename.
Supported special placeholders include:
{StreamID}: stream ID
{StartYear}: start time - year
{StartMonth}: start time - month
{StartDay}: start time - day
{StartHour}: start time - hour
{StartMinute}: start time - minute
{StartSecond}: start time - second
{StartMillisecond}: start time - millisecond
{EndYear}: end time - year
{EndMonth}: end time - month
{EndDay}: end time - day
{EndHour}: end time - hour
{EndMinute}: end time - minute
{EndSecond}: end time - second
{EndMillisecond}: end time - millisecond

If this parameter is not set, the recording filename will be `{StreamID}_{StartYear}-{StartMonth}-{StartDay}-{StartHour}-{StartMinute}-{StartSecond}_{EndYear}-{EndMonth}-{EndDay}-{EndHour}-{EndMinute}-{EndSecond}` by default
     */
    public String getVodFileName() {
        return this.VodFileName;
    }

    /**
     * Set Recording filename.
Supported special placeholders include:
{StreamID}: stream ID
{StartYear}: start time - year
{StartMonth}: start time - month
{StartDay}: start time - day
{StartHour}: start time - hour
{StartMinute}: start time - minute
{StartSecond}: start time - second
{StartMillisecond}: start time - millisecond
{EndYear}: end time - year
{EndMonth}: end time - month
{EndDay}: end time - day
{EndHour}: end time - hour
{EndMinute}: end time - minute
{EndSecond}: end time - second
{EndMillisecond}: end time - millisecond

If this parameter is not set, the recording filename will be `{StreamID}_{StartYear}-{StartMonth}-{StartDay}-{StartHour}-{StartMinute}-{StartSecond}_{EndYear}-{EndMonth}-{EndDay}-{EndHour}-{EndMinute}-{EndSecond}` by default
     * @param VodFileName Recording filename.
Supported special placeholders include:
{StreamID}: stream ID
{StartYear}: start time - year
{StartMonth}: start time - month
{StartDay}: start time - day
{StartHour}: start time - hour
{StartMinute}: start time - minute
{StartSecond}: start time - second
{StartMillisecond}: start time - millisecond
{EndYear}: end time - year
{EndMonth}: end time - month
{EndDay}: end time - day
{EndHour}: end time - hour
{EndMinute}: end time - minute
{EndSecond}: end time - second
{EndMillisecond}: end time - millisecond

If this parameter is not set, the recording filename will be `{StreamID}_{StartYear}-{StartMonth}-{StartDay}-{StartHour}-{StartMinute}-{StartSecond}_{EndYear}-{EndMonth}-{EndDay}-{EndHour}-{EndMinute}-{EndSecond}` by default
     */
    public void setVodFileName(String VodFileName) {
        this.VodFileName = VodFileName;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RecordInterval", this.RecordInterval);
        this.setParamSimple(map, prefix + "StorageTime", this.StorageTime);
        this.setParamSimple(map, prefix + "Enable", this.Enable);
        this.setParamSimple(map, prefix + "VodSubAppId", this.VodSubAppId);
        this.setParamSimple(map, prefix + "VodFileName", this.VodFileName);

    }
}

