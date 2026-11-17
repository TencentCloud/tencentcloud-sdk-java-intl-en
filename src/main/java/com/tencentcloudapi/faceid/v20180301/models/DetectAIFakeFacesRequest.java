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
package com.tencentcloudapi.faceid.v20180301.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DetectAIFakeFacesRequest extends AbstractModel {

    /**
    * <p>Pass in the face image or face video to be detected (currently only single-face detection is supported), encoded in Base64. If both video and image are available in your scenario, we recommend using video for detection. For better detection results, note the following restrictions and recommendations for input data:</p><ul><li><p>Base64 value of the image:<br>Recommended overall image resolution is 480x640, with the face size above 100X100, captured by the front camera of a mobile phone.<br>The Base64-encoded image data is recommended to be no more than 3 MB, and must not exceed 10 MB. Only jpg and png formats are supported.<br>Use the standard Base64 encoding method (with = padding). For encoding specifications, refer to RFC4648.</p></li><li><p>Base64 value of the video:<br>The Base64-encoded size is recommended to be within 8 MB, and must not exceed 10 MB. mp4, avi, flv, and mov formats are supported, captured by the front camera of a mobile phone.<br>Recommended video duration is 2 to 5 seconds, and must not exceed 20 seconds.<br>Recommended video resolution is 480x640 (up to 720p supported), with a frame rate between 25 fps and 30 fps.<br>Use the standard Base64 encoding method (with = padding). For encoding specifications, refer to RFC4648.</p></li></ul><p>If you do not use Encryption for encrypted transmission, this field is required.</p>
    */
    @SerializedName("FaceInput")
    @Expose
    private String FaceInput;

    /**
    * <p>Type of the input.</p><ul><li>Valid values:<br>1: image type.<br>2: video type.<br>Others: the error code InvalidParameter is returned.</li></ul><p>If you do not use Encryption for encrypted transmission, this field is required.</p>
    */
    @SerializedName("FaceInputType")
    @Expose
    private Long FaceInputType;

    /**
    * <p>Whether to encrypt the entire request body.</p><ul><li>Supported encryption algorithms: AES-256-CBC and SM4-GCM.</li><li>Users with encryption requirements can use this parameter. For details, click the link on the left.</li></ul>
    */
    @SerializedName("Encryption")
    @Expose
    private Encryption Encryption;

    /**
    * <p>Encrypted ciphertext.</p><ul><li>The data format before encryption is as follows: {&quot;FaceInput&quot;:&quot;AAAAA&quot;,&quot;FaceInputType&quot;:1}.</li></ul>
    */
    @SerializedName("EncryptedBody")
    @Expose
    private String EncryptedBody;

    /**
    * <p>Carries the risk control context of this request at one time, that is, "who, where, and from which IP the request is initiated".</p>
    */
    @SerializedName("ExtraRiskInfo")
    @Expose
    private ExtraRiskInfo ExtraRiskInfo;

    /**
     * Get <p>Pass in the face image or face video to be detected (currently only single-face detection is supported), encoded in Base64. If both video and image are available in your scenario, we recommend using video for detection. For better detection results, note the following restrictions and recommendations for input data:</p><ul><li><p>Base64 value of the image:<br>Recommended overall image resolution is 480x640, with the face size above 100X100, captured by the front camera of a mobile phone.<br>The Base64-encoded image data is recommended to be no more than 3 MB, and must not exceed 10 MB. Only jpg and png formats are supported.<br>Use the standard Base64 encoding method (with = padding). For encoding specifications, refer to RFC4648.</p></li><li><p>Base64 value of the video:<br>The Base64-encoded size is recommended to be within 8 MB, and must not exceed 10 MB. mp4, avi, flv, and mov formats are supported, captured by the front camera of a mobile phone.<br>Recommended video duration is 2 to 5 seconds, and must not exceed 20 seconds.<br>Recommended video resolution is 480x640 (up to 720p supported), with a frame rate between 25 fps and 30 fps.<br>Use the standard Base64 encoding method (with = padding). For encoding specifications, refer to RFC4648.</p></li></ul><p>If you do not use Encryption for encrypted transmission, this field is required.</p> 
     * @return FaceInput <p>Pass in the face image or face video to be detected (currently only single-face detection is supported), encoded in Base64. If both video and image are available in your scenario, we recommend using video for detection. For better detection results, note the following restrictions and recommendations for input data:</p><ul><li><p>Base64 value of the image:<br>Recommended overall image resolution is 480x640, with the face size above 100X100, captured by the front camera of a mobile phone.<br>The Base64-encoded image data is recommended to be no more than 3 MB, and must not exceed 10 MB. Only jpg and png formats are supported.<br>Use the standard Base64 encoding method (with = padding). For encoding specifications, refer to RFC4648.</p></li><li><p>Base64 value of the video:<br>The Base64-encoded size is recommended to be within 8 MB, and must not exceed 10 MB. mp4, avi, flv, and mov formats are supported, captured by the front camera of a mobile phone.<br>Recommended video duration is 2 to 5 seconds, and must not exceed 20 seconds.<br>Recommended video resolution is 480x640 (up to 720p supported), with a frame rate between 25 fps and 30 fps.<br>Use the standard Base64 encoding method (with = padding). For encoding specifications, refer to RFC4648.</p></li></ul><p>If you do not use Encryption for encrypted transmission, this field is required.</p>
     */
    public String getFaceInput() {
        return this.FaceInput;
    }

    /**
     * Set <p>Pass in the face image or face video to be detected (currently only single-face detection is supported), encoded in Base64. If both video and image are available in your scenario, we recommend using video for detection. For better detection results, note the following restrictions and recommendations for input data:</p><ul><li><p>Base64 value of the image:<br>Recommended overall image resolution is 480x640, with the face size above 100X100, captured by the front camera of a mobile phone.<br>The Base64-encoded image data is recommended to be no more than 3 MB, and must not exceed 10 MB. Only jpg and png formats are supported.<br>Use the standard Base64 encoding method (with = padding). For encoding specifications, refer to RFC4648.</p></li><li><p>Base64 value of the video:<br>The Base64-encoded size is recommended to be within 8 MB, and must not exceed 10 MB. mp4, avi, flv, and mov formats are supported, captured by the front camera of a mobile phone.<br>Recommended video duration is 2 to 5 seconds, and must not exceed 20 seconds.<br>Recommended video resolution is 480x640 (up to 720p supported), with a frame rate between 25 fps and 30 fps.<br>Use the standard Base64 encoding method (with = padding). For encoding specifications, refer to RFC4648.</p></li></ul><p>If you do not use Encryption for encrypted transmission, this field is required.</p>
     * @param FaceInput <p>Pass in the face image or face video to be detected (currently only single-face detection is supported), encoded in Base64. If both video and image are available in your scenario, we recommend using video for detection. For better detection results, note the following restrictions and recommendations for input data:</p><ul><li><p>Base64 value of the image:<br>Recommended overall image resolution is 480x640, with the face size above 100X100, captured by the front camera of a mobile phone.<br>The Base64-encoded image data is recommended to be no more than 3 MB, and must not exceed 10 MB. Only jpg and png formats are supported.<br>Use the standard Base64 encoding method (with = padding). For encoding specifications, refer to RFC4648.</p></li><li><p>Base64 value of the video:<br>The Base64-encoded size is recommended to be within 8 MB, and must not exceed 10 MB. mp4, avi, flv, and mov formats are supported, captured by the front camera of a mobile phone.<br>Recommended video duration is 2 to 5 seconds, and must not exceed 20 seconds.<br>Recommended video resolution is 480x640 (up to 720p supported), with a frame rate between 25 fps and 30 fps.<br>Use the standard Base64 encoding method (with = padding). For encoding specifications, refer to RFC4648.</p></li></ul><p>If you do not use Encryption for encrypted transmission, this field is required.</p>
     */
    public void setFaceInput(String FaceInput) {
        this.FaceInput = FaceInput;
    }

    /**
     * Get <p>Type of the input.</p><ul><li>Valid values:<br>1: image type.<br>2: video type.<br>Others: the error code InvalidParameter is returned.</li></ul><p>If you do not use Encryption for encrypted transmission, this field is required.</p> 
     * @return FaceInputType <p>Type of the input.</p><ul><li>Valid values:<br>1: image type.<br>2: video type.<br>Others: the error code InvalidParameter is returned.</li></ul><p>If you do not use Encryption for encrypted transmission, this field is required.</p>
     */
    public Long getFaceInputType() {
        return this.FaceInputType;
    }

    /**
     * Set <p>Type of the input.</p><ul><li>Valid values:<br>1: image type.<br>2: video type.<br>Others: the error code InvalidParameter is returned.</li></ul><p>If you do not use Encryption for encrypted transmission, this field is required.</p>
     * @param FaceInputType <p>Type of the input.</p><ul><li>Valid values:<br>1: image type.<br>2: video type.<br>Others: the error code InvalidParameter is returned.</li></ul><p>If you do not use Encryption for encrypted transmission, this field is required.</p>
     */
    public void setFaceInputType(Long FaceInputType) {
        this.FaceInputType = FaceInputType;
    }

    /**
     * Get <p>Whether to encrypt the entire request body.</p><ul><li>Supported encryption algorithms: AES-256-CBC and SM4-GCM.</li><li>Users with encryption requirements can use this parameter. For details, click the link on the left.</li></ul> 
     * @return Encryption <p>Whether to encrypt the entire request body.</p><ul><li>Supported encryption algorithms: AES-256-CBC and SM4-GCM.</li><li>Users with encryption requirements can use this parameter. For details, click the link on the left.</li></ul>
     */
    public Encryption getEncryption() {
        return this.Encryption;
    }

    /**
     * Set <p>Whether to encrypt the entire request body.</p><ul><li>Supported encryption algorithms: AES-256-CBC and SM4-GCM.</li><li>Users with encryption requirements can use this parameter. For details, click the link on the left.</li></ul>
     * @param Encryption <p>Whether to encrypt the entire request body.</p><ul><li>Supported encryption algorithms: AES-256-CBC and SM4-GCM.</li><li>Users with encryption requirements can use this parameter. For details, click the link on the left.</li></ul>
     */
    public void setEncryption(Encryption Encryption) {
        this.Encryption = Encryption;
    }

    /**
     * Get <p>Encrypted ciphertext.</p><ul><li>The data format before encryption is as follows: {&quot;FaceInput&quot;:&quot;AAAAA&quot;,&quot;FaceInputType&quot;:1}.</li></ul> 
     * @return EncryptedBody <p>Encrypted ciphertext.</p><ul><li>The data format before encryption is as follows: {&quot;FaceInput&quot;:&quot;AAAAA&quot;,&quot;FaceInputType&quot;:1}.</li></ul>
     */
    public String getEncryptedBody() {
        return this.EncryptedBody;
    }

    /**
     * Set <p>Encrypted ciphertext.</p><ul><li>The data format before encryption is as follows: {&quot;FaceInput&quot;:&quot;AAAAA&quot;,&quot;FaceInputType&quot;:1}.</li></ul>
     * @param EncryptedBody <p>Encrypted ciphertext.</p><ul><li>The data format before encryption is as follows: {&quot;FaceInput&quot;:&quot;AAAAA&quot;,&quot;FaceInputType&quot;:1}.</li></ul>
     */
    public void setEncryptedBody(String EncryptedBody) {
        this.EncryptedBody = EncryptedBody;
    }

    /**
     * Get <p>Carries the risk control context of this request at one time, that is, "who, where, and from which IP the request is initiated".</p> 
     * @return ExtraRiskInfo <p>Carries the risk control context of this request at one time, that is, "who, where, and from which IP the request is initiated".</p>
     */
    public ExtraRiskInfo getExtraRiskInfo() {
        return this.ExtraRiskInfo;
    }

    /**
     * Set <p>Carries the risk control context of this request at one time, that is, "who, where, and from which IP the request is initiated".</p>
     * @param ExtraRiskInfo <p>Carries the risk control context of this request at one time, that is, "who, where, and from which IP the request is initiated".</p>
     */
    public void setExtraRiskInfo(ExtraRiskInfo ExtraRiskInfo) {
        this.ExtraRiskInfo = ExtraRiskInfo;
    }

    public DetectAIFakeFacesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DetectAIFakeFacesRequest(DetectAIFakeFacesRequest source) {
        if (source.FaceInput != null) {
            this.FaceInput = new String(source.FaceInput);
        }
        if (source.FaceInputType != null) {
            this.FaceInputType = new Long(source.FaceInputType);
        }
        if (source.Encryption != null) {
            this.Encryption = new Encryption(source.Encryption);
        }
        if (source.EncryptedBody != null) {
            this.EncryptedBody = new String(source.EncryptedBody);
        }
        if (source.ExtraRiskInfo != null) {
            this.ExtraRiskInfo = new ExtraRiskInfo(source.ExtraRiskInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FaceInput", this.FaceInput);
        this.setParamSimple(map, prefix + "FaceInputType", this.FaceInputType);
        this.setParamObj(map, prefix + "Encryption.", this.Encryption);
        this.setParamSimple(map, prefix + "EncryptedBody", this.EncryptedBody);
        this.setParamObj(map, prefix + "ExtraRiskInfo.", this.ExtraRiskInfo);

    }
}

