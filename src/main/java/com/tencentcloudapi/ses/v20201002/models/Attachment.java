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
package com.tencentcloudapi.ses.v20201002.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Attachment extends AbstractModel {

    /**
    * Attachment name, which cannot exceed 255 characters. Some attachment types are not supported. For details, see [Attachment Types](https://intl.cloud.tencent.com/document/product/1288/51951?from_cn_redirect=1).
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * The Base64-encoded attachment content supports a maximum of 4M. note: tencent cloud API supports up to 8M request packets. the attachment content is expected to expand by 1.5 times after Base64 encoding. you should control the total size of all attachments within 4M. the API will return an error if the overall request exceeds 8M.
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * Attachment URL. do not use the open function.
    */
    @SerializedName("FileURL")
    @Expose
    private String FileURL;

    /**
     * Get Attachment name, which cannot exceed 255 characters. Some attachment types are not supported. For details, see [Attachment Types](https://intl.cloud.tencent.com/document/product/1288/51951?from_cn_redirect=1). 
     * @return FileName Attachment name, which cannot exceed 255 characters. Some attachment types are not supported. For details, see [Attachment Types](https://intl.cloud.tencent.com/document/product/1288/51951?from_cn_redirect=1).
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set Attachment name, which cannot exceed 255 characters. Some attachment types are not supported. For details, see [Attachment Types](https://intl.cloud.tencent.com/document/product/1288/51951?from_cn_redirect=1).
     * @param FileName Attachment name, which cannot exceed 255 characters. Some attachment types are not supported. For details, see [Attachment Types](https://intl.cloud.tencent.com/document/product/1288/51951?from_cn_redirect=1).
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    /**
     * Get The Base64-encoded attachment content supports a maximum of 4M. note: tencent cloud API supports up to 8M request packets. the attachment content is expected to expand by 1.5 times after Base64 encoding. you should control the total size of all attachments within 4M. the API will return an error if the overall request exceeds 8M. 
     * @return Content The Base64-encoded attachment content supports a maximum of 4M. note: tencent cloud API supports up to 8M request packets. the attachment content is expected to expand by 1.5 times after Base64 encoding. you should control the total size of all attachments within 4M. the API will return an error if the overall request exceeds 8M.
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set The Base64-encoded attachment content supports a maximum of 4M. note: tencent cloud API supports up to 8M request packets. the attachment content is expected to expand by 1.5 times after Base64 encoding. you should control the total size of all attachments within 4M. the API will return an error if the overall request exceeds 8M.
     * @param Content The Base64-encoded attachment content supports a maximum of 4M. note: tencent cloud API supports up to 8M request packets. the attachment content is expected to expand by 1.5 times after Base64 encoding. you should control the total size of all attachments within 4M. the API will return an error if the overall request exceeds 8M.
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Get Attachment URL. do not use the open function. 
     * @return FileURL Attachment URL. do not use the open function.
     */
    public String getFileURL() {
        return this.FileURL;
    }

    /**
     * Set Attachment URL. do not use the open function.
     * @param FileURL Attachment URL. do not use the open function.
     */
    public void setFileURL(String FileURL) {
        this.FileURL = FileURL;
    }

    public Attachment() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Attachment(Attachment source) {
        if (source.FileName != null) {
            this.FileName = new String(source.FileName);
        }
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
        if (source.FileURL != null) {
            this.FileURL = new String(source.FileURL);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FileName", this.FileName);
        this.setParamSimple(map, prefix + "Content", this.Content);
        this.setParamSimple(map, prefix + "FileURL", this.FileURL);

    }
}

