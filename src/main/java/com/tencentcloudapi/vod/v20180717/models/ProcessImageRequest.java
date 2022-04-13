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

public class ProcessImageRequest extends AbstractModel{

    /**
    * The unique ID of the media file. For this API to work, the file must be an image.
    */
    @SerializedName("FileId")
    @Expose
    private String FileId;

    /**
    * Operation. `ContentReview` is the only valid value currently.
    */
    @SerializedName("Operation")
    @Expose
    private String Operation;

    /**
    * Image recognition parameters. This parameter is valid if `Operation` is `ContentReview`.
    */
    @SerializedName("ContentReviewInput")
    @Expose
    private ImageContentReviewInput ContentReviewInput;

    /**
    * The VOD [subapplication](https://intl.cloud.tencent.com/document/product/266/14574?from_cn_redirect=1) ID. If you need to access a resource in a subapplication, set this parameter to the subapplication ID; otherwise, leave it empty.
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
     * Get The unique ID of the media file. For this API to work, the file must be an image. 
     * @return FileId The unique ID of the media file. For this API to work, the file must be an image.
     */
    public String getFileId() {
        return this.FileId;
    }

    /**
     * Set The unique ID of the media file. For this API to work, the file must be an image.
     * @param FileId The unique ID of the media file. For this API to work, the file must be an image.
     */
    public void setFileId(String FileId) {
        this.FileId = FileId;
    }

    /**
     * Get Operation. `ContentReview` is the only valid value currently. 
     * @return Operation Operation. `ContentReview` is the only valid value currently.
     */
    public String getOperation() {
        return this.Operation;
    }

    /**
     * Set Operation. `ContentReview` is the only valid value currently.
     * @param Operation Operation. `ContentReview` is the only valid value currently.
     */
    public void setOperation(String Operation) {
        this.Operation = Operation;
    }

    /**
     * Get Image recognition parameters. This parameter is valid if `Operation` is `ContentReview`. 
     * @return ContentReviewInput Image recognition parameters. This parameter is valid if `Operation` is `ContentReview`.
     */
    public ImageContentReviewInput getContentReviewInput() {
        return this.ContentReviewInput;
    }

    /**
     * Set Image recognition parameters. This parameter is valid if `Operation` is `ContentReview`.
     * @param ContentReviewInput Image recognition parameters. This parameter is valid if `Operation` is `ContentReview`.
     */
    public void setContentReviewInput(ImageContentReviewInput ContentReviewInput) {
        this.ContentReviewInput = ContentReviewInput;
    }

    /**
     * Get The VOD [subapplication](https://intl.cloud.tencent.com/document/product/266/14574?from_cn_redirect=1) ID. If you need to access a resource in a subapplication, set this parameter to the subapplication ID; otherwise, leave it empty. 
     * @return SubAppId The VOD [subapplication](https://intl.cloud.tencent.com/document/product/266/14574?from_cn_redirect=1) ID. If you need to access a resource in a subapplication, set this parameter to the subapplication ID; otherwise, leave it empty.
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set The VOD [subapplication](https://intl.cloud.tencent.com/document/product/266/14574?from_cn_redirect=1) ID. If you need to access a resource in a subapplication, set this parameter to the subapplication ID; otherwise, leave it empty.
     * @param SubAppId The VOD [subapplication](https://intl.cloud.tencent.com/document/product/266/14574?from_cn_redirect=1) ID. If you need to access a resource in a subapplication, set this parameter to the subapplication ID; otherwise, leave it empty.
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    public ProcessImageRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ProcessImageRequest(ProcessImageRequest source) {
        if (source.FileId != null) {
            this.FileId = new String(source.FileId);
        }
        if (source.Operation != null) {
            this.Operation = new String(source.Operation);
        }
        if (source.ContentReviewInput != null) {
            this.ContentReviewInput = new ImageContentReviewInput(source.ContentReviewInput);
        }
        if (source.SubAppId != null) {
            this.SubAppId = new Long(source.SubAppId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FileId", this.FileId);
        this.setParamSimple(map, prefix + "Operation", this.Operation);
        this.setParamObj(map, prefix + "ContentReviewInput.", this.ContentReviewInput);
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);

    }
}

