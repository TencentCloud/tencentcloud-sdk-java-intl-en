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
    * <p>Import the face image or facial video to be detected (currently only single face detection is supported) in base64 encoding. If your scenario involves both video and image, we recommend using video for detection. For better detection results, please note the following input data limits and suggestions:</p><ul><li><p>base64 value of the image:<br>Recommend an overall image resolution of 480x640, with the face size no less than 100x100, captured by the mobile front camera.<br>The size of the base64-encoded image data should not exceed 3M, with a maximum of 10M. Only jpg and png formats are supported.<br>Please use the standard base64 encoding method (with = padding). Refer to RFC4648 for the coding specification.</p></li><li><p>base64 value of the video:<br>The size after base64 encoding should be within 8M, with a maximum of 10M. Supported formats include mp4, avi, and flv, captured by the mobile front camera.<br>Video duration is recommended to be 2–5s, with a maximum of 20s.<br>Video resolution is recommended at 480x640 (maximum support for 720p), with a frame rate between 25fps and 30fps.<br>Please use the standard base64 encoding method (with = padding). Refer to RFC4648 for the coding specification.</p></li></ul><p>If you do not use Encryption for secure transmission, this field is a required parameter.</p>
    */
    @SerializedName("FaceInput")
    @Expose
    private String FaceInput;

    /**
    * <p>Passed in type.</p><ul><li>Value ranges from 1 to 2:<br>1: Passed in image type.<br>2: Passed in video type.<br>Other: Return error code InvalidParameter.</li></ul><p>If you do not use Encryption for encrypting transmission, this field is mandatory.</p>
    */
    @SerializedName("FaceInputType")
    @Expose
    private Long FaceInputType;

    /**
    * <p>Whether to encrypt the entire request information.</p><ul><li>Supported encryption algorithms: AES-256-CBC, SM4-GCM.</li><li>The user with encryption requirements can use this parameter. For details, please click the left-side link.</li></ul>
    */
    @SerializedName("Encryption")
    @Expose
    private Encryption Encryption;

    /**
    * <p>Encrypted ciphertext.</p><ul><li>The data format before encryption is as follows: {"FaceInput":"AAAAA","FaceInputType":1}.</li></ul>
    */
    @SerializedName("EncryptedBody")
    @Expose
    private String EncryptedBody;

    /**
     * Get <p>Import the face image or facial video to be detected (currently only single face detection is supported) in base64 encoding. If your scenario involves both video and image, we recommend using video for detection. For better detection results, please note the following input data limits and suggestions:</p><ul><li><p>base64 value of the image:<br>Recommend an overall image resolution of 480x640, with the face size no less than 100x100, captured by the mobile front camera.<br>The size of the base64-encoded image data should not exceed 3M, with a maximum of 10M. Only jpg and png formats are supported.<br>Please use the standard base64 encoding method (with = padding). Refer to RFC4648 for the coding specification.</p></li><li><p>base64 value of the video:<br>The size after base64 encoding should be within 8M, with a maximum of 10M. Supported formats include mp4, avi, and flv, captured by the mobile front camera.<br>Video duration is recommended to be 2–5s, with a maximum of 20s.<br>Video resolution is recommended at 480x640 (maximum support for 720p), with a frame rate between 25fps and 30fps.<br>Please use the standard base64 encoding method (with = padding). Refer to RFC4648 for the coding specification.</p></li></ul><p>If you do not use Encryption for secure transmission, this field is a required parameter.</p> 
     * @return FaceInput <p>Import the face image or facial video to be detected (currently only single face detection is supported) in base64 encoding. If your scenario involves both video and image, we recommend using video for detection. For better detection results, please note the following input data limits and suggestions:</p><ul><li><p>base64 value of the image:<br>Recommend an overall image resolution of 480x640, with the face size no less than 100x100, captured by the mobile front camera.<br>The size of the base64-encoded image data should not exceed 3M, with a maximum of 10M. Only jpg and png formats are supported.<br>Please use the standard base64 encoding method (with = padding). Refer to RFC4648 for the coding specification.</p></li><li><p>base64 value of the video:<br>The size after base64 encoding should be within 8M, with a maximum of 10M. Supported formats include mp4, avi, and flv, captured by the mobile front camera.<br>Video duration is recommended to be 2–5s, with a maximum of 20s.<br>Video resolution is recommended at 480x640 (maximum support for 720p), with a frame rate between 25fps and 30fps.<br>Please use the standard base64 encoding method (with = padding). Refer to RFC4648 for the coding specification.</p></li></ul><p>If you do not use Encryption for secure transmission, this field is a required parameter.</p>
     */
    public String getFaceInput() {
        return this.FaceInput;
    }

    /**
     * Set <p>Import the face image or facial video to be detected (currently only single face detection is supported) in base64 encoding. If your scenario involves both video and image, we recommend using video for detection. For better detection results, please note the following input data limits and suggestions:</p><ul><li><p>base64 value of the image:<br>Recommend an overall image resolution of 480x640, with the face size no less than 100x100, captured by the mobile front camera.<br>The size of the base64-encoded image data should not exceed 3M, with a maximum of 10M. Only jpg and png formats are supported.<br>Please use the standard base64 encoding method (with = padding). Refer to RFC4648 for the coding specification.</p></li><li><p>base64 value of the video:<br>The size after base64 encoding should be within 8M, with a maximum of 10M. Supported formats include mp4, avi, and flv, captured by the mobile front camera.<br>Video duration is recommended to be 2–5s, with a maximum of 20s.<br>Video resolution is recommended at 480x640 (maximum support for 720p), with a frame rate between 25fps and 30fps.<br>Please use the standard base64 encoding method (with = padding). Refer to RFC4648 for the coding specification.</p></li></ul><p>If you do not use Encryption for secure transmission, this field is a required parameter.</p>
     * @param FaceInput <p>Import the face image or facial video to be detected (currently only single face detection is supported) in base64 encoding. If your scenario involves both video and image, we recommend using video for detection. For better detection results, please note the following input data limits and suggestions:</p><ul><li><p>base64 value of the image:<br>Recommend an overall image resolution of 480x640, with the face size no less than 100x100, captured by the mobile front camera.<br>The size of the base64-encoded image data should not exceed 3M, with a maximum of 10M. Only jpg and png formats are supported.<br>Please use the standard base64 encoding method (with = padding). Refer to RFC4648 for the coding specification.</p></li><li><p>base64 value of the video:<br>The size after base64 encoding should be within 8M, with a maximum of 10M. Supported formats include mp4, avi, and flv, captured by the mobile front camera.<br>Video duration is recommended to be 2–5s, with a maximum of 20s.<br>Video resolution is recommended at 480x640 (maximum support for 720p), with a frame rate between 25fps and 30fps.<br>Please use the standard base64 encoding method (with = padding). Refer to RFC4648 for the coding specification.</p></li></ul><p>If you do not use Encryption for secure transmission, this field is a required parameter.</p>
     */
    public void setFaceInput(String FaceInput) {
        this.FaceInput = FaceInput;
    }

    /**
     * Get <p>Passed in type.</p><ul><li>Value ranges from 1 to 2:<br>1: Passed in image type.<br>2: Passed in video type.<br>Other: Return error code InvalidParameter.</li></ul><p>If you do not use Encryption for encrypting transmission, this field is mandatory.</p> 
     * @return FaceInputType <p>Passed in type.</p><ul><li>Value ranges from 1 to 2:<br>1: Passed in image type.<br>2: Passed in video type.<br>Other: Return error code InvalidParameter.</li></ul><p>If you do not use Encryption for encrypting transmission, this field is mandatory.</p>
     */
    public Long getFaceInputType() {
        return this.FaceInputType;
    }

    /**
     * Set <p>Passed in type.</p><ul><li>Value ranges from 1 to 2:<br>1: Passed in image type.<br>2: Passed in video type.<br>Other: Return error code InvalidParameter.</li></ul><p>If you do not use Encryption for encrypting transmission, this field is mandatory.</p>
     * @param FaceInputType <p>Passed in type.</p><ul><li>Value ranges from 1 to 2:<br>1: Passed in image type.<br>2: Passed in video type.<br>Other: Return error code InvalidParameter.</li></ul><p>If you do not use Encryption for encrypting transmission, this field is mandatory.</p>
     */
    public void setFaceInputType(Long FaceInputType) {
        this.FaceInputType = FaceInputType;
    }

    /**
     * Get <p>Whether to encrypt the entire request information.</p><ul><li>Supported encryption algorithms: AES-256-CBC, SM4-GCM.</li><li>The user with encryption requirements can use this parameter. For details, please click the left-side link.</li></ul> 
     * @return Encryption <p>Whether to encrypt the entire request information.</p><ul><li>Supported encryption algorithms: AES-256-CBC, SM4-GCM.</li><li>The user with encryption requirements can use this parameter. For details, please click the left-side link.</li></ul>
     */
    public Encryption getEncryption() {
        return this.Encryption;
    }

    /**
     * Set <p>Whether to encrypt the entire request information.</p><ul><li>Supported encryption algorithms: AES-256-CBC, SM4-GCM.</li><li>The user with encryption requirements can use this parameter. For details, please click the left-side link.</li></ul>
     * @param Encryption <p>Whether to encrypt the entire request information.</p><ul><li>Supported encryption algorithms: AES-256-CBC, SM4-GCM.</li><li>The user with encryption requirements can use this parameter. For details, please click the left-side link.</li></ul>
     */
    public void setEncryption(Encryption Encryption) {
        this.Encryption = Encryption;
    }

    /**
     * Get <p>Encrypted ciphertext.</p><ul><li>The data format before encryption is as follows: {"FaceInput":"AAAAA","FaceInputType":1}.</li></ul> 
     * @return EncryptedBody <p>Encrypted ciphertext.</p><ul><li>The data format before encryption is as follows: {"FaceInput":"AAAAA","FaceInputType":1}.</li></ul>
     */
    public String getEncryptedBody() {
        return this.EncryptedBody;
    }

    /**
     * Set <p>Encrypted ciphertext.</p><ul><li>The data format before encryption is as follows: {"FaceInput":"AAAAA","FaceInputType":1}.</li></ul>
     * @param EncryptedBody <p>Encrypted ciphertext.</p><ul><li>The data format before encryption is as follows: {"FaceInput":"AAAAA","FaceInputType":1}.</li></ul>
     */
    public void setEncryptedBody(String EncryptedBody) {
        this.EncryptedBody = EncryptedBody;
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FaceInput", this.FaceInput);
        this.setParamSimple(map, prefix + "FaceInputType", this.FaceInputType);
        this.setParamObj(map, prefix + "Encryption.", this.Encryption);
        this.setParamSimple(map, prefix + "EncryptedBody", this.EncryptedBody);

    }
}

