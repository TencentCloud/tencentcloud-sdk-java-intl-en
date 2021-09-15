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
    * Max recording time per file
Default value: `1800` (seconds)
Value range: 30-7200
This parameter is invalid for HLS. Only one HLS file will be generated from push start to push end.
    */
    @SerializedName("RecordInterval")
    @Expose
    private Long RecordInterval;

    /**
    * Storage duration of the recording file
Value range: 0-129600000 seconds (0-1500 days)
`0`: permanent
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
    * Task flow
Note: this field may return `null`, indicating that no valid value is obtained.
    */
    @SerializedName("Procedure")
    @Expose
    private String Procedure;

    /**
    * Video storage class. Valid values:
`normal`: STANDARD
`cold`: STANDARD_IA
Note: this field may return `null`, indicating that no valid value is obtained.
    */
    @SerializedName("StorageMode")
    @Expose
    private String StorageMode;

    /**
    * VOD subapplication category
Note: this field may return `null`, indicating that no valid value is obtained.
    */
    @SerializedName("ClassId")
    @Expose
    private Long ClassId;

    /**
     * Get Max recording time per file
Default value: `1800` (seconds)
Value range: 30-7200
This parameter is invalid for HLS. Only one HLS file will be generated from push start to push end. 
     * @return RecordInterval Max recording time per file
Default value: `1800` (seconds)
Value range: 30-7200
This parameter is invalid for HLS. Only one HLS file will be generated from push start to push end.
     */
    public Long getRecordInterval() {
        return this.RecordInterval;
    }

    /**
     * Set Max recording time per file
Default value: `1800` (seconds)
Value range: 30-7200
This parameter is invalid for HLS. Only one HLS file will be generated from push start to push end.
     * @param RecordInterval Max recording time per file
Default value: `1800` (seconds)
Value range: 30-7200
This parameter is invalid for HLS. Only one HLS file will be generated from push start to push end.
     */
    public void setRecordInterval(Long RecordInterval) {
        this.RecordInterval = RecordInterval;
    }

    /**
     * Get Storage duration of the recording file
Value range: 0-129600000 seconds (0-1500 days)
`0`: permanent 
     * @return StorageTime Storage duration of the recording file
Value range: 0-129600000 seconds (0-1500 days)
`0`: permanent
     */
    public Long getStorageTime() {
        return this.StorageTime;
    }

    /**
     * Set Storage duration of the recording file
Value range: 0-129600000 seconds (0-1500 days)
`0`: permanent
     * @param StorageTime Storage duration of the recording file
Value range: 0-129600000 seconds (0-1500 days)
`0`: permanent
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
     * Get Task flow
Note: this field may return `null`, indicating that no valid value is obtained. 
     * @return Procedure Task flow
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public String getProcedure() {
        return this.Procedure;
    }

    /**
     * Set Task flow
Note: this field may return `null`, indicating that no valid value is obtained.
     * @param Procedure Task flow
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public void setProcedure(String Procedure) {
        this.Procedure = Procedure;
    }

    /**
     * Get Video storage class. Valid values:
`normal`: STANDARD
`cold`: STANDARD_IA
Note: this field may return `null`, indicating that no valid value is obtained. 
     * @return StorageMode Video storage class. Valid values:
`normal`: STANDARD
`cold`: STANDARD_IA
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public String getStorageMode() {
        return this.StorageMode;
    }

    /**
     * Set Video storage class. Valid values:
`normal`: STANDARD
`cold`: STANDARD_IA
Note: this field may return `null`, indicating that no valid value is obtained.
     * @param StorageMode Video storage class. Valid values:
`normal`: STANDARD
`cold`: STANDARD_IA
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public void setStorageMode(String StorageMode) {
        this.StorageMode = StorageMode;
    }

    /**
     * Get VOD subapplication category
Note: this field may return `null`, indicating that no valid value is obtained. 
     * @return ClassId VOD subapplication category
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public Long getClassId() {
        return this.ClassId;
    }

    /**
     * Set VOD subapplication category
Note: this field may return `null`, indicating that no valid value is obtained.
     * @param ClassId VOD subapplication category
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public void setClassId(Long ClassId) {
        this.ClassId = ClassId;
    }

    public RecordParam() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RecordParam(RecordParam source) {
        if (source.RecordInterval != null) {
            this.RecordInterval = new Long(source.RecordInterval);
        }
        if (source.StorageTime != null) {
            this.StorageTime = new Long(source.StorageTime);
        }
        if (source.Enable != null) {
            this.Enable = new Long(source.Enable);
        }
        if (source.VodSubAppId != null) {
            this.VodSubAppId = new Long(source.VodSubAppId);
        }
        if (source.VodFileName != null) {
            this.VodFileName = new String(source.VodFileName);
        }
        if (source.Procedure != null) {
            this.Procedure = new String(source.Procedure);
        }
        if (source.StorageMode != null) {
            this.StorageMode = new String(source.StorageMode);
        }
        if (source.ClassId != null) {
            this.ClassId = new Long(source.ClassId);
        }
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
        this.setParamSimple(map, prefix + "Procedure", this.Procedure);
        this.setParamSimple(map, prefix + "StorageMode", this.StorageMode);
        this.setParamSimple(map, prefix + "ClassId", this.ClassId);

    }
}

