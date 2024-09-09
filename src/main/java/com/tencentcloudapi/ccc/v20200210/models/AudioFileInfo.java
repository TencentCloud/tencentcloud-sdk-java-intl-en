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
package com.tencentcloudapi.ccc.v20200210.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AudioFileInfo extends AbstractModel {

    /**
    * File ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("FileId")
    @Expose
    private Long FileId;

    /**
    * File alias
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CustomFileName")
    @Expose
    private String CustomFileName;

    /**
    * Filename
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AudioFileName")
    @Expose
    private String AudioFileName;

    /**
    * Review status, 0-Not reviewed, 1-Approved, 2-Rejected
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
     * Get File ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return FileId File ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getFileId() {
        return this.FileId;
    }

    /**
     * Set File ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param FileId File ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setFileId(Long FileId) {
        this.FileId = FileId;
    }

    /**
     * Get File alias
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CustomFileName File alias
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCustomFileName() {
        return this.CustomFileName;
    }

    /**
     * Set File alias
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CustomFileName File alias
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCustomFileName(String CustomFileName) {
        this.CustomFileName = CustomFileName;
    }

    /**
     * Get Filename
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AudioFileName Filename
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getAudioFileName() {
        return this.AudioFileName;
    }

    /**
     * Set Filename
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AudioFileName Filename
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAudioFileName(String AudioFileName) {
        this.AudioFileName = AudioFileName;
    }

    /**
     * Get Review status, 0-Not reviewed, 1-Approved, 2-Rejected
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Status Review status, 0-Not reviewed, 1-Approved, 2-Rejected
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Review status, 0-Not reviewed, 1-Approved, 2-Rejected
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Status Review status, 0-Not reviewed, 1-Approved, 2-Rejected
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    public AudioFileInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AudioFileInfo(AudioFileInfo source) {
        if (source.FileId != null) {
            this.FileId = new Long(source.FileId);
        }
        if (source.CustomFileName != null) {
            this.CustomFileName = new String(source.CustomFileName);
        }
        if (source.AudioFileName != null) {
            this.AudioFileName = new String(source.AudioFileName);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FileId", this.FileId);
        this.setParamSimple(map, prefix + "CustomFileName", this.CustomFileName);
        this.setParamSimple(map, prefix + "AudioFileName", this.AudioFileName);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

