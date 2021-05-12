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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TranscodeTask2017 extends AbstractModel{

    /**
    * Transcoding task ID.
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * Error code
<li>0: success;</li>
<li>Other values: failure.</li>
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ErrCode")
    @Expose
    private Long ErrCode;

    /**
    * Error message.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * ID of transcoded file.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("FileId")
    @Expose
    private String FileId;

    /**
    * Name of transcoded file.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * Video duration in seconds.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Duration")
    @Expose
    private Long Duration;

    /**
    * Cover address.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CoverUrl")
    @Expose
    private String CoverUrl;

    /**
    * Playback information generated after video transcoding.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PlayInfoSet")
    @Expose
    private TranscodePlayInfo2017 [] PlayInfoSet;

    /**
     * Get Transcoding task ID. 
     * @return TaskId Transcoding task ID.
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set Transcoding task ID.
     * @param TaskId Transcoding task ID.
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get Error code
<li>0: success;</li>
<li>Other values: failure.</li>
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ErrCode Error code
<li>0: success;</li>
<li>Other values: failure.</li>
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getErrCode() {
        return this.ErrCode;
    }

    /**
     * Set Error code
<li>0: success;</li>
<li>Other values: failure.</li>
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ErrCode Error code
<li>0: success;</li>
<li>Other values: failure.</li>
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setErrCode(Long ErrCode) {
        this.ErrCode = ErrCode;
    }

    /**
     * Get Error message.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Message Error message.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set Error message.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Message Error message.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * Get ID of transcoded file.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return FileId ID of transcoded file.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getFileId() {
        return this.FileId;
    }

    /**
     * Set ID of transcoded file.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param FileId ID of transcoded file.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setFileId(String FileId) {
        this.FileId = FileId;
    }

    /**
     * Get Name of transcoded file.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return FileName Name of transcoded file.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set Name of transcoded file.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param FileName Name of transcoded file.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    /**
     * Get Video duration in seconds.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Duration Video duration in seconds.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getDuration() {
        return this.Duration;
    }

    /**
     * Set Video duration in seconds.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Duration Video duration in seconds.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setDuration(Long Duration) {
        this.Duration = Duration;
    }

    /**
     * Get Cover address.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return CoverUrl Cover address.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getCoverUrl() {
        return this.CoverUrl;
    }

    /**
     * Set Cover address.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param CoverUrl Cover address.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setCoverUrl(String CoverUrl) {
        this.CoverUrl = CoverUrl;
    }

    /**
     * Get Playback information generated after video transcoding.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return PlayInfoSet Playback information generated after video transcoding.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public TranscodePlayInfo2017 [] getPlayInfoSet() {
        return this.PlayInfoSet;
    }

    /**
     * Set Playback information generated after video transcoding.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param PlayInfoSet Playback information generated after video transcoding.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setPlayInfoSet(TranscodePlayInfo2017 [] PlayInfoSet) {
        this.PlayInfoSet = PlayInfoSet;
    }

    public TranscodeTask2017() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TranscodeTask2017(TranscodeTask2017 source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.ErrCode != null) {
            this.ErrCode = new Long(source.ErrCode);
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
        if (source.FileId != null) {
            this.FileId = new String(source.FileId);
        }
        if (source.FileName != null) {
            this.FileName = new String(source.FileName);
        }
        if (source.Duration != null) {
            this.Duration = new Long(source.Duration);
        }
        if (source.CoverUrl != null) {
            this.CoverUrl = new String(source.CoverUrl);
        }
        if (source.PlayInfoSet != null) {
            this.PlayInfoSet = new TranscodePlayInfo2017[source.PlayInfoSet.length];
            for (int i = 0; i < source.PlayInfoSet.length; i++) {
                this.PlayInfoSet[i] = new TranscodePlayInfo2017(source.PlayInfoSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "ErrCode", this.ErrCode);
        this.setParamSimple(map, prefix + "Message", this.Message);
        this.setParamSimple(map, prefix + "FileId", this.FileId);
        this.setParamSimple(map, prefix + "FileName", this.FileName);
        this.setParamSimple(map, prefix + "Duration", this.Duration);
        this.setParamSimple(map, prefix + "CoverUrl", this.CoverUrl);
        this.setParamArrayObj(map, prefix + "PlayInfoSet.", this.PlayInfoSet);

    }
}

