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
package com.tencentcloudapi.lke.v20231130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeStorageCredentialRequest extends AbstractModel {

    /**
    * Application ID. The parameter still needs to be filled in. Different combinations of parameters will result in different permissions. For details, see https://cloud.tencent.com/document/product/1759/116238.
    */
    @SerializedName("BotBizId")
    @Expose
    private String BotBizId;

    /**
    * File type, normal file name type suffixes, such as xlsx, pdf, docx, png, etc.
    */
    @SerializedName("FileType")
    @Expose
    private String FileType;

    /**
    * This parameter is used to select a scenario when uploading a file or an image. When uploading an image in a chat, "Ispublic" is "true." When uploading a file (including files in the document library, images, etc. and files in a chat), "Ispublic" is "false."

    */
    @SerializedName("IsPublic")
    @Expose
    private Boolean IsPublic;

    /**
    * Storage type: offline - offline file; realtime - real-time file. If empty, it defaults to offline.
    */
    @SerializedName("TypeKey")
    @Expose
    private String TypeKey;

    /**
     * Get Application ID. The parameter still needs to be filled in. Different combinations of parameters will result in different permissions. For details, see https://cloud.tencent.com/document/product/1759/116238. 
     * @return BotBizId Application ID. The parameter still needs to be filled in. Different combinations of parameters will result in different permissions. For details, see https://cloud.tencent.com/document/product/1759/116238.
     */
    public String getBotBizId() {
        return this.BotBizId;
    }

    /**
     * Set Application ID. The parameter still needs to be filled in. Different combinations of parameters will result in different permissions. For details, see https://cloud.tencent.com/document/product/1759/116238.
     * @param BotBizId Application ID. The parameter still needs to be filled in. Different combinations of parameters will result in different permissions. For details, see https://cloud.tencent.com/document/product/1759/116238.
     */
    public void setBotBizId(String BotBizId) {
        this.BotBizId = BotBizId;
    }

    /**
     * Get File type, normal file name type suffixes, such as xlsx, pdf, docx, png, etc. 
     * @return FileType File type, normal file name type suffixes, such as xlsx, pdf, docx, png, etc.
     */
    public String getFileType() {
        return this.FileType;
    }

    /**
     * Set File type, normal file name type suffixes, such as xlsx, pdf, docx, png, etc.
     * @param FileType File type, normal file name type suffixes, such as xlsx, pdf, docx, png, etc.
     */
    public void setFileType(String FileType) {
        this.FileType = FileType;
    }

    /**
     * Get This parameter is used to select a scenario when uploading a file or an image. When uploading an image in a chat, "Ispublic" is "true." When uploading a file (including files in the document library, images, etc. and files in a chat), "Ispublic" is "false."
 
     * @return IsPublic This parameter is used to select a scenario when uploading a file or an image. When uploading an image in a chat, "Ispublic" is "true." When uploading a file (including files in the document library, images, etc. and files in a chat), "Ispublic" is "false."

     */
    public Boolean getIsPublic() {
        return this.IsPublic;
    }

    /**
     * Set This parameter is used to select a scenario when uploading a file or an image. When uploading an image in a chat, "Ispublic" is "true." When uploading a file (including files in the document library, images, etc. and files in a chat), "Ispublic" is "false."

     * @param IsPublic This parameter is used to select a scenario when uploading a file or an image. When uploading an image in a chat, "Ispublic" is "true." When uploading a file (including files in the document library, images, etc. and files in a chat), "Ispublic" is "false."

     */
    public void setIsPublic(Boolean IsPublic) {
        this.IsPublic = IsPublic;
    }

    /**
     * Get Storage type: offline - offline file; realtime - real-time file. If empty, it defaults to offline. 
     * @return TypeKey Storage type: offline - offline file; realtime - real-time file. If empty, it defaults to offline.
     */
    public String getTypeKey() {
        return this.TypeKey;
    }

    /**
     * Set Storage type: offline - offline file; realtime - real-time file. If empty, it defaults to offline.
     * @param TypeKey Storage type: offline - offline file; realtime - real-time file. If empty, it defaults to offline.
     */
    public void setTypeKey(String TypeKey) {
        this.TypeKey = TypeKey;
    }

    public DescribeStorageCredentialRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeStorageCredentialRequest(DescribeStorageCredentialRequest source) {
        if (source.BotBizId != null) {
            this.BotBizId = new String(source.BotBizId);
        }
        if (source.FileType != null) {
            this.FileType = new String(source.FileType);
        }
        if (source.IsPublic != null) {
            this.IsPublic = new Boolean(source.IsPublic);
        }
        if (source.TypeKey != null) {
            this.TypeKey = new String(source.TypeKey);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BotBizId", this.BotBizId);
        this.setParamSimple(map, prefix + "FileType", this.FileType);
        this.setParamSimple(map, prefix + "IsPublic", this.IsPublic);
        this.setParamSimple(map, prefix + "TypeKey", this.TypeKey);

    }
}

