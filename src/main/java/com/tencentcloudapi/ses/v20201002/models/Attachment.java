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
package com.tencentcloudapi.ses.v20201002.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Attachment extends AbstractModel{

    /**
    * Attachment name, which cannot exceed 255 characters. Some attachment types are not supported. For details, see [Attachment Types](https://intl.cloud.tencent.com/document/product/1288/51951?from_cn_redirect=1).
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * Attachment content after base64 encoding. A single attachment cannot exceed 5 MB. Note: Tencent Cloud APIs require that a request packet should not exceed 10 MB. If you are sending multiple attachments, the total size of these attachments cannot exceed 10 MB.
    */
    @SerializedName("Content")
    @Expose
    private String Content;

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
     * Get Attachment content after base64 encoding. A single attachment cannot exceed 5 MB. Note: Tencent Cloud APIs require that a request packet should not exceed 10 MB. If you are sending multiple attachments, the total size of these attachments cannot exceed 10 MB. 
     * @return Content Attachment content after base64 encoding. A single attachment cannot exceed 5 MB. Note: Tencent Cloud APIs require that a request packet should not exceed 10 MB. If you are sending multiple attachments, the total size of these attachments cannot exceed 10 MB.
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set Attachment content after base64 encoding. A single attachment cannot exceed 5 MB. Note: Tencent Cloud APIs require that a request packet should not exceed 10 MB. If you are sending multiple attachments, the total size of these attachments cannot exceed 10 MB.
     * @param Content Attachment content after base64 encoding. A single attachment cannot exceed 5 MB. Note: Tencent Cloud APIs require that a request packet should not exceed 10 MB. If you are sending multiple attachments, the total size of these attachments cannot exceed 10 MB.
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FileName", this.FileName);
        this.setParamSimple(map, prefix + "Content", this.Content);

    }
}

