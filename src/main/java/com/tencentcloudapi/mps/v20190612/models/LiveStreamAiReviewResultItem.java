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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LiveStreamAiReviewResultItem extends AbstractModel{

    /**
    * Content audit type. Valid values:
<li>ImagePorn: Porn information detection in image</li>
<li>ImageTerrorism: Terrorism information detection in image</li>
<li>ImagePolitical: Politically sensitive information detection in image</li>
<li>PornVoice: Porn information detection in speech</li>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Result of porn information detection in image, which is valid when `Type` is `ImagePorn`.
    */
    @SerializedName("ImagePornResultSet")
    @Expose
    private LiveStreamAiReviewImagePornResult [] ImagePornResultSet;

    /**
    * Result of terrorism information detection in image, which is valid when `Type` is `ImageTerrorism`.
    */
    @SerializedName("ImageTerrorismResultSet")
    @Expose
    private LiveStreamAiReviewImageTerrorismResult [] ImageTerrorismResultSet;

    /**
    * Result of politically sensitive information detection in image, which is valid when `Type` is `ImagePolitical`.
    */
    @SerializedName("ImagePoliticalResultSet")
    @Expose
    private LiveStreamAiReviewImagePoliticalResult [] ImagePoliticalResultSet;

    /**
    * Result of porn information detection in speech, which is valid when `Type` is `PornVoice`.
    */
    @SerializedName("VoicePornResultSet")
    @Expose
    private LiveStreamAiReviewVoicePornResult [] VoicePornResultSet;

    /**
     * Get Content audit type. Valid values:
<li>ImagePorn: Porn information detection in image</li>
<li>ImageTerrorism: Terrorism information detection in image</li>
<li>ImagePolitical: Politically sensitive information detection in image</li>
<li>PornVoice: Porn information detection in speech</li> 
     * @return Type Content audit type. Valid values:
<li>ImagePorn: Porn information detection in image</li>
<li>ImageTerrorism: Terrorism information detection in image</li>
<li>ImagePolitical: Politically sensitive information detection in image</li>
<li>PornVoice: Porn information detection in speech</li>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Content audit type. Valid values:
<li>ImagePorn: Porn information detection in image</li>
<li>ImageTerrorism: Terrorism information detection in image</li>
<li>ImagePolitical: Politically sensitive information detection in image</li>
<li>PornVoice: Porn information detection in speech</li>
     * @param Type Content audit type. Valid values:
<li>ImagePorn: Porn information detection in image</li>
<li>ImageTerrorism: Terrorism information detection in image</li>
<li>ImagePolitical: Politically sensitive information detection in image</li>
<li>PornVoice: Porn information detection in speech</li>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Result of porn information detection in image, which is valid when `Type` is `ImagePorn`. 
     * @return ImagePornResultSet Result of porn information detection in image, which is valid when `Type` is `ImagePorn`.
     */
    public LiveStreamAiReviewImagePornResult [] getImagePornResultSet() {
        return this.ImagePornResultSet;
    }

    /**
     * Set Result of porn information detection in image, which is valid when `Type` is `ImagePorn`.
     * @param ImagePornResultSet Result of porn information detection in image, which is valid when `Type` is `ImagePorn`.
     */
    public void setImagePornResultSet(LiveStreamAiReviewImagePornResult [] ImagePornResultSet) {
        this.ImagePornResultSet = ImagePornResultSet;
    }

    /**
     * Get Result of terrorism information detection in image, which is valid when `Type` is `ImageTerrorism`. 
     * @return ImageTerrorismResultSet Result of terrorism information detection in image, which is valid when `Type` is `ImageTerrorism`.
     */
    public LiveStreamAiReviewImageTerrorismResult [] getImageTerrorismResultSet() {
        return this.ImageTerrorismResultSet;
    }

    /**
     * Set Result of terrorism information detection in image, which is valid when `Type` is `ImageTerrorism`.
     * @param ImageTerrorismResultSet Result of terrorism information detection in image, which is valid when `Type` is `ImageTerrorism`.
     */
    public void setImageTerrorismResultSet(LiveStreamAiReviewImageTerrorismResult [] ImageTerrorismResultSet) {
        this.ImageTerrorismResultSet = ImageTerrorismResultSet;
    }

    /**
     * Get Result of politically sensitive information detection in image, which is valid when `Type` is `ImagePolitical`. 
     * @return ImagePoliticalResultSet Result of politically sensitive information detection in image, which is valid when `Type` is `ImagePolitical`.
     */
    public LiveStreamAiReviewImagePoliticalResult [] getImagePoliticalResultSet() {
        return this.ImagePoliticalResultSet;
    }

    /**
     * Set Result of politically sensitive information detection in image, which is valid when `Type` is `ImagePolitical`.
     * @param ImagePoliticalResultSet Result of politically sensitive information detection in image, which is valid when `Type` is `ImagePolitical`.
     */
    public void setImagePoliticalResultSet(LiveStreamAiReviewImagePoliticalResult [] ImagePoliticalResultSet) {
        this.ImagePoliticalResultSet = ImagePoliticalResultSet;
    }

    /**
     * Get Result of porn information detection in speech, which is valid when `Type` is `PornVoice`. 
     * @return VoicePornResultSet Result of porn information detection in speech, which is valid when `Type` is `PornVoice`.
     */
    public LiveStreamAiReviewVoicePornResult [] getVoicePornResultSet() {
        return this.VoicePornResultSet;
    }

    /**
     * Set Result of porn information detection in speech, which is valid when `Type` is `PornVoice`.
     * @param VoicePornResultSet Result of porn information detection in speech, which is valid when `Type` is `PornVoice`.
     */
    public void setVoicePornResultSet(LiveStreamAiReviewVoicePornResult [] VoicePornResultSet) {
        this.VoicePornResultSet = VoicePornResultSet;
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

