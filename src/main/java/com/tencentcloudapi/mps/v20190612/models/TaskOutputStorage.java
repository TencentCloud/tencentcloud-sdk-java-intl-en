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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TaskOutputStorage extends AbstractModel {

    /**
    * Specifies the type of storage location for the media processing service output object. valid values:.
<Li>COS: cos storage.</li>.
<Li>AWS-S3: aws storage, suitable for aws tasks only and requires the same region.</li>.
<Li>VOD: video-on-demand (vod) pro edition</li>.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * The location to save the output object in COS. This parameter is valid and required when `Type` is COS.
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("CosOutputStorage")
    @Expose
    private CosOutputStorage CosOutputStorage;

    /**
    * The AWS S3 bucket to save the output file. This parameter is required if `Type` is `AWS-S3`.
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("S3OutputStorage")
    @Expose
    private S3OutputStorage S3OutputStorage;

    /**
    * The VOD Pro application and bucket to save the output file. This parameter is required if `Type` is `VOD`.
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("VODOutputStorage")
    @Expose
    private VODOutputStorage VODOutputStorage;

    /**
     * Get Specifies the type of storage location for the media processing service output object. valid values:.
<Li>COS: cos storage.</li>.
<Li>AWS-S3: aws storage, suitable for aws tasks only and requires the same region.</li>.
<Li>VOD: video-on-demand (vod) pro edition</li>. 
     * @return Type Specifies the type of storage location for the media processing service output object. valid values:.
<Li>COS: cos storage.</li>.
<Li>AWS-S3: aws storage, suitable for aws tasks only and requires the same region.</li>.
<Li>VOD: video-on-demand (vod) pro edition</li>.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Specifies the type of storage location for the media processing service output object. valid values:.
<Li>COS: cos storage.</li>.
<Li>AWS-S3: aws storage, suitable for aws tasks only and requires the same region.</li>.
<Li>VOD: video-on-demand (vod) pro edition</li>.
     * @param Type Specifies the type of storage location for the media processing service output object. valid values:.
<Li>COS: cos storage.</li>.
<Li>AWS-S3: aws storage, suitable for aws tasks only and requires the same region.</li>.
<Li>VOD: video-on-demand (vod) pro edition</li>.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get The location to save the output object in COS. This parameter is valid and required when `Type` is COS.
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return CosOutputStorage The location to save the output object in COS. This parameter is valid and required when `Type` is COS.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public CosOutputStorage getCosOutputStorage() {
        return this.CosOutputStorage;
    }

    /**
     * Set The location to save the output object in COS. This parameter is valid and required when `Type` is COS.
Note: This field may return null, indicating that no valid value can be obtained.
     * @param CosOutputStorage The location to save the output object in COS. This parameter is valid and required when `Type` is COS.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setCosOutputStorage(CosOutputStorage CosOutputStorage) {
        this.CosOutputStorage = CosOutputStorage;
    }

    /**
     * Get The AWS S3 bucket to save the output file. This parameter is required if `Type` is `AWS-S3`.
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return S3OutputStorage The AWS S3 bucket to save the output file. This parameter is required if `Type` is `AWS-S3`.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public S3OutputStorage getS3OutputStorage() {
        return this.S3OutputStorage;
    }

    /**
     * Set The AWS S3 bucket to save the output file. This parameter is required if `Type` is `AWS-S3`.
Note: This field may return null, indicating that no valid value can be obtained.
     * @param S3OutputStorage The AWS S3 bucket to save the output file. This parameter is required if `Type` is `AWS-S3`.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setS3OutputStorage(S3OutputStorage S3OutputStorage) {
        this.S3OutputStorage = S3OutputStorage;
    }

    /**
     * Get The VOD Pro application and bucket to save the output file. This parameter is required if `Type` is `VOD`.
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return VODOutputStorage The VOD Pro application and bucket to save the output file. This parameter is required if `Type` is `VOD`.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public VODOutputStorage getVODOutputStorage() {
        return this.VODOutputStorage;
    }

    /**
     * Set The VOD Pro application and bucket to save the output file. This parameter is required if `Type` is `VOD`.
Note: This field may return null, indicating that no valid value can be obtained.
     * @param VODOutputStorage The VOD Pro application and bucket to save the output file. This parameter is required if `Type` is `VOD`.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setVODOutputStorage(VODOutputStorage VODOutputStorage) {
        this.VODOutputStorage = VODOutputStorage;
    }

    public TaskOutputStorage() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TaskOutputStorage(TaskOutputStorage source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.CosOutputStorage != null) {
            this.CosOutputStorage = new CosOutputStorage(source.CosOutputStorage);
        }
        if (source.S3OutputStorage != null) {
            this.S3OutputStorage = new S3OutputStorage(source.S3OutputStorage);
        }
        if (source.VODOutputStorage != null) {
            this.VODOutputStorage = new VODOutputStorage(source.VODOutputStorage);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamObj(map, prefix + "CosOutputStorage.", this.CosOutputStorage);
        this.setParamObj(map, prefix + "S3OutputStorage.", this.S3OutputStorage);
        this.setParamObj(map, prefix + "VODOutputStorage.", this.VODOutputStorage);

    }
}

