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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ConcatFileInfo2017 extends AbstractModel {

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
    * ID of source file for video splicing.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("FileId")
    @Expose
    private String FileId;

    /**
    * Address of source file for video splicing.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("FileUrl")
    @Expose
    private String FileUrl;

    /**
    * Format of source file for video splicing.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("FileType")
    @Expose
    private String FileType;

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
     * Get ID of source file for video splicing.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return FileId ID of source file for video splicing.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getFileId() {
        return this.FileId;
    }

    /**
     * Set ID of source file for video splicing.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param FileId ID of source file for video splicing.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setFileId(String FileId) {
        this.FileId = FileId;
    }

    /**
     * Get Address of source file for video splicing.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return FileUrl Address of source file for video splicing.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getFileUrl() {
        return this.FileUrl;
    }

    /**
     * Set Address of source file for video splicing.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param FileUrl Address of source file for video splicing.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setFileUrl(String FileUrl) {
        this.FileUrl = FileUrl;
    }

    /**
     * Get Format of source file for video splicing.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return FileType Format of source file for video splicing.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getFileType() {
        return this.FileType;
    }

    /**
     * Set Format of source file for video splicing.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param FileType Format of source file for video splicing.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setFileType(String FileType) {
        this.FileType = FileType;
    }

    public ConcatFileInfo2017() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ConcatFileInfo2017(ConcatFileInfo2017 source) {
        if (source.ErrCode != null) {
            this.ErrCode = new Long(source.ErrCode);
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
        if (source.FileId != null) {
            this.FileId = new String(source.FileId);
        }
        if (source.FileUrl != null) {
            this.FileUrl = new String(source.FileUrl);
        }
        if (source.FileType != null) {
            this.FileType = new String(source.FileType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ErrCode", this.ErrCode);
        this.setParamSimple(map, prefix + "Message", this.Message);
        this.setParamSimple(map, prefix + "FileId", this.FileId);
        this.setParamSimple(map, prefix + "FileUrl", this.FileUrl);
        this.setParamSimple(map, prefix + "FileType", this.FileType);

    }
}

