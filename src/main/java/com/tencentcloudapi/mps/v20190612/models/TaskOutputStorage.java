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
    * Valid when Type is COS. This item is required and indicates the Media Processing Service COS output location.
    */
    @SerializedName("CosOutputStorage")
    @Expose
    private CosOutputStorage CosOutputStorage;

    /**
    * Valid when Type is AWS-S3. This item is required and indicates the AWS S3 output location for media processing.
    */
    @SerializedName("S3OutputStorage")
    @Expose
    private S3OutputStorage S3OutputStorage;

    /**
    * Valid at that time when Type is VOD. This item is required and represents the Media Processing Service (MPS) video-on-demand (VOD) pro edition output location.
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
     * Get Valid when Type is COS. This item is required and indicates the Media Processing Service COS output location. 
     * @return CosOutputStorage Valid when Type is COS. This item is required and indicates the Media Processing Service COS output location.
     */
    public CosOutputStorage getCosOutputStorage() {
        return this.CosOutputStorage;
    }

    /**
     * Set Valid when Type is COS. This item is required and indicates the Media Processing Service COS output location.
     * @param CosOutputStorage Valid when Type is COS. This item is required and indicates the Media Processing Service COS output location.
     */
    public void setCosOutputStorage(CosOutputStorage CosOutputStorage) {
        this.CosOutputStorage = CosOutputStorage;
    }

    /**
     * Get Valid when Type is AWS-S3. This item is required and indicates the AWS S3 output location for media processing. 
     * @return S3OutputStorage Valid when Type is AWS-S3. This item is required and indicates the AWS S3 output location for media processing.
     */
    public S3OutputStorage getS3OutputStorage() {
        return this.S3OutputStorage;
    }

    /**
     * Set Valid when Type is AWS-S3. This item is required and indicates the AWS S3 output location for media processing.
     * @param S3OutputStorage Valid when Type is AWS-S3. This item is required and indicates the AWS S3 output location for media processing.
     */
    public void setS3OutputStorage(S3OutputStorage S3OutputStorage) {
        this.S3OutputStorage = S3OutputStorage;
    }

    /**
     * Get Valid at that time when Type is VOD. This item is required and represents the Media Processing Service (MPS) video-on-demand (VOD) pro edition output location. 
     * @return VODOutputStorage Valid at that time when Type is VOD. This item is required and represents the Media Processing Service (MPS) video-on-demand (VOD) pro edition output location.
     */
    public VODOutputStorage getVODOutputStorage() {
        return this.VODOutputStorage;
    }

    /**
     * Set Valid at that time when Type is VOD. This item is required and represents the Media Processing Service (MPS) video-on-demand (VOD) pro edition output location.
     * @param VODOutputStorage Valid at that time when Type is VOD. This item is required and represents the Media Processing Service (MPS) video-on-demand (VOD) pro edition output location.
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

