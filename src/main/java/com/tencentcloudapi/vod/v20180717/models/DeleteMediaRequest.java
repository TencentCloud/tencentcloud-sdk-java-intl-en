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

public class DeleteMediaRequest extends AbstractModel {

    /**
    * Unique identifier of the media file.
    */
    @SerializedName("FileId")
    @Expose
    private String FileId;

    /**
    * <b>VOD [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID. For customers who activate VOD services after December 25, 2023, this field must be set to the app ID when accessing resources in VOD applications (whether the default application or a newly created application).</b>
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * Specify the part to delete this time. Default value: "[]", which means to delete the media and all its video processing files.
    */
    @SerializedName("DeleteParts")
    @Expose
    private MediaDeleteItem [] DeleteParts;

    /**
     * Get Unique identifier of the media file. 
     * @return FileId Unique identifier of the media file.
     */
    public String getFileId() {
        return this.FileId;
    }

    /**
     * Set Unique identifier of the media file.
     * @param FileId Unique identifier of the media file.
     */
    public void setFileId(String FileId) {
        this.FileId = FileId;
    }

    /**
     * Get <b>VOD [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID. For customers who activate VOD services after December 25, 2023, this field must be set to the app ID when accessing resources in VOD applications (whether the default application or a newly created application).</b> 
     * @return SubAppId <b>VOD [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID. For customers who activate VOD services after December 25, 2023, this field must be set to the app ID when accessing resources in VOD applications (whether the default application or a newly created application).</b>
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set <b>VOD [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID. For customers who activate VOD services after December 25, 2023, this field must be set to the app ID when accessing resources in VOD applications (whether the default application or a newly created application).</b>
     * @param SubAppId <b>VOD [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID. For customers who activate VOD services after December 25, 2023, this field must be set to the app ID when accessing resources in VOD applications (whether the default application or a newly created application).</b>
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Get Specify the part to delete this time. Default value: "[]", which means to delete the media and all its video processing files. 
     * @return DeleteParts Specify the part to delete this time. Default value: "[]", which means to delete the media and all its video processing files.
     */
    public MediaDeleteItem [] getDeleteParts() {
        return this.DeleteParts;
    }

    /**
     * Set Specify the part to delete this time. Default value: "[]", which means to delete the media and all its video processing files.
     * @param DeleteParts Specify the part to delete this time. Default value: "[]", which means to delete the media and all its video processing files.
     */
    public void setDeleteParts(MediaDeleteItem [] DeleteParts) {
        this.DeleteParts = DeleteParts;
    }

    public DeleteMediaRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteMediaRequest(DeleteMediaRequest source) {
        if (source.FileId != null) {
            this.FileId = new String(source.FileId);
        }
        if (source.SubAppId != null) {
            this.SubAppId = new Long(source.SubAppId);
        }
        if (source.DeleteParts != null) {
            this.DeleteParts = new MediaDeleteItem[source.DeleteParts.length];
            for (int i = 0; i < source.DeleteParts.length; i++) {
                this.DeleteParts[i] = new MediaDeleteItem(source.DeleteParts[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FileId", this.FileId);
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);
        this.setParamArrayObj(map, prefix + "DeleteParts.", this.DeleteParts);

    }
}

