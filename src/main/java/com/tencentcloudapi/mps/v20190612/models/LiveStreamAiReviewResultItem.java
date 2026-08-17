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

public class LiveStreamAiReviewResultItem extends AbstractModel {

    /**
    * Review result type. Valid values:
<li>ImagePorn: image porn detection.</li>
<li>ImageTerrorism: image terrorism.</li>
<li>ImagePolitical: image political sensitivity.</li>
<li>VoicePorn: sound rule violation.</li>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Image porn detection result, valid when Type is ImagePorn.
    */
    @SerializedName("ImagePornResultSet")
    @Expose
    private LiveStreamAiReviewImagePornResult [] ImagePornResultSet;

    /**
    * Result of image terrorism detection, valid when Type is ImageTerrorism.
    */
    @SerializedName("ImageTerrorismResultSet")
    @Expose
    private LiveStreamAiReviewImageTerrorismResult [] ImageTerrorismResultSet;

    /**
    * The result of image sensitivity, valid when Type is ImagePolitical.
    */
    @SerializedName("ImagePoliticalResultSet")
    @Expose
    private LiveStreamAiReviewImagePoliticalResult [] ImagePoliticalResultSet;

    /**
    * Result of sound rule violation, valid when Type is VoicePorn.
    */
    @SerializedName("VoicePornResultSet")
    @Expose
    private LiveStreamAiReviewVoicePornResult [] VoicePornResultSet;

    /**
     * Get Review result type. Valid values:
<li>ImagePorn: image porn detection.</li>
<li>ImageTerrorism: image terrorism.</li>
<li>ImagePolitical: image political sensitivity.</li>
<li>VoicePorn: sound rule violation.</li> 
     * @return Type Review result type. Valid values:
<li>ImagePorn: image porn detection.</li>
<li>ImageTerrorism: image terrorism.</li>
<li>ImagePolitical: image political sensitivity.</li>
<li>VoicePorn: sound rule violation.</li>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Review result type. Valid values:
<li>ImagePorn: image porn detection.</li>
<li>ImageTerrorism: image terrorism.</li>
<li>ImagePolitical: image political sensitivity.</li>
<li>VoicePorn: sound rule violation.</li>
     * @param Type Review result type. Valid values:
<li>ImagePorn: image porn detection.</li>
<li>ImageTerrorism: image terrorism.</li>
<li>ImagePolitical: image political sensitivity.</li>
<li>VoicePorn: sound rule violation.</li>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Image porn detection result, valid when Type is ImagePorn. 
     * @return ImagePornResultSet Image porn detection result, valid when Type is ImagePorn.
     */
    public LiveStreamAiReviewImagePornResult [] getImagePornResultSet() {
        return this.ImagePornResultSet;
    }

    /**
     * Set Image porn detection result, valid when Type is ImagePorn.
     * @param ImagePornResultSet Image porn detection result, valid when Type is ImagePorn.
     */
    public void setImagePornResultSet(LiveStreamAiReviewImagePornResult [] ImagePornResultSet) {
        this.ImagePornResultSet = ImagePornResultSet;
    }

    /**
     * Get Result of image terrorism detection, valid when Type is ImageTerrorism. 
     * @return ImageTerrorismResultSet Result of image terrorism detection, valid when Type is ImageTerrorism.
     */
    public LiveStreamAiReviewImageTerrorismResult [] getImageTerrorismResultSet() {
        return this.ImageTerrorismResultSet;
    }

    /**
     * Set Result of image terrorism detection, valid when Type is ImageTerrorism.
     * @param ImageTerrorismResultSet Result of image terrorism detection, valid when Type is ImageTerrorism.
     */
    public void setImageTerrorismResultSet(LiveStreamAiReviewImageTerrorismResult [] ImageTerrorismResultSet) {
        this.ImageTerrorismResultSet = ImageTerrorismResultSet;
    }

    /**
     * Get The result of image sensitivity, valid when Type is ImagePolitical. 
     * @return ImagePoliticalResultSet The result of image sensitivity, valid when Type is ImagePolitical.
     */
    public LiveStreamAiReviewImagePoliticalResult [] getImagePoliticalResultSet() {
        return this.ImagePoliticalResultSet;
    }

    /**
     * Set The result of image sensitivity, valid when Type is ImagePolitical.
     * @param ImagePoliticalResultSet The result of image sensitivity, valid when Type is ImagePolitical.
     */
    public void setImagePoliticalResultSet(LiveStreamAiReviewImagePoliticalResult [] ImagePoliticalResultSet) {
        this.ImagePoliticalResultSet = ImagePoliticalResultSet;
    }

    /**
     * Get Result of sound rule violation, valid when Type is VoicePorn. 
     * @return VoicePornResultSet Result of sound rule violation, valid when Type is VoicePorn.
     */
    public LiveStreamAiReviewVoicePornResult [] getVoicePornResultSet() {
        return this.VoicePornResultSet;
    }

    /**
     * Set Result of sound rule violation, valid when Type is VoicePorn.
     * @param VoicePornResultSet Result of sound rule violation, valid when Type is VoicePorn.
     */
    public void setVoicePornResultSet(LiveStreamAiReviewVoicePornResult [] VoicePornResultSet) {
        this.VoicePornResultSet = VoicePornResultSet;
    }

    public LiveStreamAiReviewResultItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LiveStreamAiReviewResultItem(LiveStreamAiReviewResultItem source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.ImagePornResultSet != null) {
            this.ImagePornResultSet = new LiveStreamAiReviewImagePornResult[source.ImagePornResultSet.length];
            for (int i = 0; i < source.ImagePornResultSet.length; i++) {
                this.ImagePornResultSet[i] = new LiveStreamAiReviewImagePornResult(source.ImagePornResultSet[i]);
            }
        }
        if (source.ImageTerrorismResultSet != null) {
            this.ImageTerrorismResultSet = new LiveStreamAiReviewImageTerrorismResult[source.ImageTerrorismResultSet.length];
            for (int i = 0; i < source.ImageTerrorismResultSet.length; i++) {
                this.ImageTerrorismResultSet[i] = new LiveStreamAiReviewImageTerrorismResult(source.ImageTerrorismResultSet[i]);
            }
        }
        if (source.ImagePoliticalResultSet != null) {
            this.ImagePoliticalResultSet = new LiveStreamAiReviewImagePoliticalResult[source.ImagePoliticalResultSet.length];
            for (int i = 0; i < source.ImagePoliticalResultSet.length; i++) {
                this.ImagePoliticalResultSet[i] = new LiveStreamAiReviewImagePoliticalResult(source.ImagePoliticalResultSet[i]);
            }
        }
        if (source.VoicePornResultSet != null) {
            this.VoicePornResultSet = new LiveStreamAiReviewVoicePornResult[source.VoicePornResultSet.length];
            for (int i = 0; i < source.VoicePornResultSet.length; i++) {
                this.VoicePornResultSet[i] = new LiveStreamAiReviewVoicePornResult(source.VoicePornResultSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamArrayObj(map, prefix + "ImagePornResultSet.", this.ImagePornResultSet);
        this.setParamArrayObj(map, prefix + "ImageTerrorismResultSet.", this.ImageTerrorismResultSet);
        this.setParamArrayObj(map, prefix + "ImagePoliticalResultSet.", this.ImagePoliticalResultSet);
        this.setParamArrayObj(map, prefix + "VoicePornResultSet.", this.VoicePornResultSet);

    }
}

