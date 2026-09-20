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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ClipFileInfo2017 extends AbstractModel {

    /**
    * Error code.
<li>0: success;</li>
<li>Other values: Failed.</li>
    */
    @SerializedName("ErrCode")
    @Expose
    private Long ErrCode;

    /**
    * Error description.
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * Output the file ID of the target file.
    */
    @SerializedName("FileId")
    @Expose
    private String FileId;

    /**
    * File address of the output target file.
    */
    @SerializedName("FileUrl")
    @Expose
    private String FileUrl;

    /**
    * Output file type of the target file.
    */
    @SerializedName("FileType")
    @Expose
    private String FileType;

    /**
     * Get Error code.
<li>0: success;</li>
<li>Other values: Failed.</li> 
     * @return ErrCode Error code.
<li>0: success;</li>
<li>Other values: Failed.</li>
     */
    public Long getErrCode() {
        return this.ErrCode;
    }

    /**
     * Set Error code.
<li>0: success;</li>
<li>Other values: Failed.</li>
     * @param ErrCode Error code.
<li>0: success;</li>
<li>Other values: Failed.</li>
     */
    public void setErrCode(Long ErrCode) {
        this.ErrCode = ErrCode;
    }

    /**
     * Get Error description. 
     * @return Message Error description.
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set Error description.
     * @param Message Error description.
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * Get Output the file ID of the target file. 
     * @return FileId Output the file ID of the target file.
     */
    public String getFileId() {
        return this.FileId;
    }

    /**
     * Set Output the file ID of the target file.
     * @param FileId Output the file ID of the target file.
     */
    public void setFileId(String FileId) {
        this.FileId = FileId;
    }

    /**
     * Get File address of the output target file. 
     * @return FileUrl File address of the output target file.
     */
    public String getFileUrl() {
        return this.FileUrl;
    }

    /**
     * Set File address of the output target file.
     * @param FileUrl File address of the output target file.
     */
    public void setFileUrl(String FileUrl) {
        this.FileUrl = FileUrl;
    }

    /**
     * Get Output file type of the target file. 
     * @return FileType Output file type of the target file.
     */
    public String getFileType() {
        return this.FileType;
    }

    /**
     * Set Output file type of the target file.
     * @param FileType Output file type of the target file.
     */
    public void setFileType(String FileType) {
        this.FileType = FileType;
    }

    public ClipFileInfo2017() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ClipFileInfo2017(ClipFileInfo2017 source) {
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

