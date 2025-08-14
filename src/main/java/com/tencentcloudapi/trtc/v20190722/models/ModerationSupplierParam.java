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
package com.tencentcloudapi.trtc.v20190722.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModerationSupplierParam extends AbstractModel {

    /**
    * Moderation supplier account ID. For Tencent Tianyu, the value is not null; for NETEASE Yidun, the value is null.
    */
    @SerializedName("AppID")
    @Expose
    private String AppID;

    /**
    * Moderation supplier key ID.
    */
    @SerializedName("SecretId")
    @Expose
    private String SecretId;

    /**
    * Moderation supplier key.
    */
    @SerializedName("SecretKey")
    @Expose
    private String SecretKey;

    /**
    * Audio scenario. Policy ID or businessId.
    */
    @SerializedName("AudioBizType")
    @Expose
    private String AudioBizType;

    /**
    * Image scenario. Policy ID or businessId.
    */
    @SerializedName("ImageBizType")
    @Expose
    private String ImageBizType;

    /**
     * Get Moderation supplier account ID. For Tencent Tianyu, the value is not null; for NETEASE Yidun, the value is null. 
     * @return AppID Moderation supplier account ID. For Tencent Tianyu, the value is not null; for NETEASE Yidun, the value is null.
     */
    public String getAppID() {
        return this.AppID;
    }

    /**
     * Set Moderation supplier account ID. For Tencent Tianyu, the value is not null; for NETEASE Yidun, the value is null.
     * @param AppID Moderation supplier account ID. For Tencent Tianyu, the value is not null; for NETEASE Yidun, the value is null.
     */
    public void setAppID(String AppID) {
        this.AppID = AppID;
    }

    /**
     * Get Moderation supplier key ID. 
     * @return SecretId Moderation supplier key ID.
     */
    public String getSecretId() {
        return this.SecretId;
    }

    /**
     * Set Moderation supplier key ID.
     * @param SecretId Moderation supplier key ID.
     */
    public void setSecretId(String SecretId) {
        this.SecretId = SecretId;
    }

    /**
     * Get Moderation supplier key. 
     * @return SecretKey Moderation supplier key.
     */
    public String getSecretKey() {
        return this.SecretKey;
    }

    /**
     * Set Moderation supplier key.
     * @param SecretKey Moderation supplier key.
     */
    public void setSecretKey(String SecretKey) {
        this.SecretKey = SecretKey;
    }

    /**
     * Get Audio scenario. Policy ID or businessId. 
     * @return AudioBizType Audio scenario. Policy ID or businessId.
     */
    public String getAudioBizType() {
        return this.AudioBizType;
    }

    /**
     * Set Audio scenario. Policy ID or businessId.
     * @param AudioBizType Audio scenario. Policy ID or businessId.
     */
    public void setAudioBizType(String AudioBizType) {
        this.AudioBizType = AudioBizType;
    }

    /**
     * Get Image scenario. Policy ID or businessId. 
     * @return ImageBizType Image scenario. Policy ID or businessId.
     */
    public String getImageBizType() {
        return this.ImageBizType;
    }

    /**
     * Set Image scenario. Policy ID or businessId.
     * @param ImageBizType Image scenario. Policy ID or businessId.
     */
    public void setImageBizType(String ImageBizType) {
        this.ImageBizType = ImageBizType;
    }

    public ModerationSupplierParam() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModerationSupplierParam(ModerationSupplierParam source) {
        if (source.AppID != null) {
            this.AppID = new String(source.AppID);
        }
        if (source.SecretId != null) {
            this.SecretId = new String(source.SecretId);
        }
        if (source.SecretKey != null) {
            this.SecretKey = new String(source.SecretKey);
        }
        if (source.AudioBizType != null) {
            this.AudioBizType = new String(source.AudioBizType);
        }
        if (source.ImageBizType != null) {
            this.ImageBizType = new String(source.ImageBizType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppID", this.AppID);
        this.setParamSimple(map, prefix + "SecretId", this.SecretId);
        this.setParamSimple(map, prefix + "SecretKey", this.SecretKey);
        this.setParamSimple(map, prefix + "AudioBizType", this.AudioBizType);
        this.setParamSimple(map, prefix + "ImageBizType", this.ImageBizType);

    }
}

