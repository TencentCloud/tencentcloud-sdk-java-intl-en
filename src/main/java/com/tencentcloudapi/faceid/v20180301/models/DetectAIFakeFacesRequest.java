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
package com.tencentcloudapi.faceid.v20180301.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DetectAIFakeFacesRequest extends AbstractModel {

    /**
    * Enter the image or video with a face to be detected, in base64 encoding. Base64 value of the image: The overall image resolution is recommended to be 480x640, and the face size is 100X100 or larger; The image data size after Base64 encoding does not exceed 3M, and only supports jpg and png formats. Please use standard Base64 encoding (use = for padding). Refer to RFC4648 for encoding specifications. Base64 value of the video: The size after Base64 encoding does not exceed 8M, and supports mp4, avi, and flv formats. Please use standard Base64 encoding (use = for padding). Refer to RFC4648 for encoding specifications. The maximum supported video length is 20s, and the recommended length is 2 to 5s. The recommended video resolution is 480x640, and the frame rate is between 25fps and 30fps.
    */
    @SerializedName("FaceInput")
    @Expose
    private String FaceInput;

    /**
    * The type of input is 1- The input type is a picture 2- The input type is a video Others - Return error code InvalidParameter
    */
    @SerializedName("FaceInputType")
    @Expose
    private Long FaceInputType;

    /**
    * Whether the request information needs to be fully encrypted; Supported encryption algorithms: AES-256-CBC, SM4-GCM; Users with encryption requirements can use this parameter, for details, please click the link on the left.
    */
    @SerializedName("Encryption")
    @Expose
    private Encryption Encryption;

    /**
    * Encrypted ciphertext; The data format before encryption is as follows:{"FaceInput":"AAAAA","FaceInputType":1}
    */
    @SerializedName("EncryptedBody")
    @Expose
    private String EncryptedBody;

    /**
     * Get Enter the image or video with a face to be detected, in base64 encoding. Base64 value of the image: The overall image resolution is recommended to be 480x640, and the face size is 100X100 or larger; The image data size after Base64 encoding does not exceed 3M, and only supports jpg and png formats. Please use standard Base64 encoding (use = for padding). Refer to RFC4648 for encoding specifications. Base64 value of the video: The size after Base64 encoding does not exceed 8M, and supports mp4, avi, and flv formats. Please use standard Base64 encoding (use = for padding). Refer to RFC4648 for encoding specifications. The maximum supported video length is 20s, and the recommended length is 2 to 5s. The recommended video resolution is 480x640, and the frame rate is between 25fps and 30fps. 
     * @return FaceInput Enter the image or video with a face to be detected, in base64 encoding. Base64 value of the image: The overall image resolution is recommended to be 480x640, and the face size is 100X100 or larger; The image data size after Base64 encoding does not exceed 3M, and only supports jpg and png formats. Please use standard Base64 encoding (use = for padding). Refer to RFC4648 for encoding specifications. Base64 value of the video: The size after Base64 encoding does not exceed 8M, and supports mp4, avi, and flv formats. Please use standard Base64 encoding (use = for padding). Refer to RFC4648 for encoding specifications. The maximum supported video length is 20s, and the recommended length is 2 to 5s. The recommended video resolution is 480x640, and the frame rate is between 25fps and 30fps.
     */
    public String getFaceInput() {
        return this.FaceInput;
    }

    /**
     * Set Enter the image or video with a face to be detected, in base64 encoding. Base64 value of the image: The overall image resolution is recommended to be 480x640, and the face size is 100X100 or larger; The image data size after Base64 encoding does not exceed 3M, and only supports jpg and png formats. Please use standard Base64 encoding (use = for padding). Refer to RFC4648 for encoding specifications. Base64 value of the video: The size after Base64 encoding does not exceed 8M, and supports mp4, avi, and flv formats. Please use standard Base64 encoding (use = for padding). Refer to RFC4648 for encoding specifications. The maximum supported video length is 20s, and the recommended length is 2 to 5s. The recommended video resolution is 480x640, and the frame rate is between 25fps and 30fps.
     * @param FaceInput Enter the image or video with a face to be detected, in base64 encoding. Base64 value of the image: The overall image resolution is recommended to be 480x640, and the face size is 100X100 or larger; The image data size after Base64 encoding does not exceed 3M, and only supports jpg and png formats. Please use standard Base64 encoding (use = for padding). Refer to RFC4648 for encoding specifications. Base64 value of the video: The size after Base64 encoding does not exceed 8M, and supports mp4, avi, and flv formats. Please use standard Base64 encoding (use = for padding). Refer to RFC4648 for encoding specifications. The maximum supported video length is 20s, and the recommended length is 2 to 5s. The recommended video resolution is 480x640, and the frame rate is between 25fps and 30fps.
     */
    public void setFaceInput(String FaceInput) {
        this.FaceInput = FaceInput;
    }

    /**
     * Get The type of input is 1- The input type is a picture 2- The input type is a video Others - Return error code InvalidParameter 
     * @return FaceInputType The type of input is 1- The input type is a picture 2- The input type is a video Others - Return error code InvalidParameter
     */
    public Long getFaceInputType() {
        return this.FaceInputType;
    }

    /**
     * Set The type of input is 1- The input type is a picture 2- The input type is a video Others - Return error code InvalidParameter
     * @param FaceInputType The type of input is 1- The input type is a picture 2- The input type is a video Others - Return error code InvalidParameter
     */
    public void setFaceInputType(Long FaceInputType) {
        this.FaceInputType = FaceInputType;
    }

    /**
     * Get Whether the request information needs to be fully encrypted; Supported encryption algorithms: AES-256-CBC, SM4-GCM; Users with encryption requirements can use this parameter, for details, please click the link on the left. 
     * @return Encryption Whether the request information needs to be fully encrypted; Supported encryption algorithms: AES-256-CBC, SM4-GCM; Users with encryption requirements can use this parameter, for details, please click the link on the left.
     */
    public Encryption getEncryption() {
        return this.Encryption;
    }

    /**
     * Set Whether the request information needs to be fully encrypted; Supported encryption algorithms: AES-256-CBC, SM4-GCM; Users with encryption requirements can use this parameter, for details, please click the link on the left.
     * @param Encryption Whether the request information needs to be fully encrypted; Supported encryption algorithms: AES-256-CBC, SM4-GCM; Users with encryption requirements can use this parameter, for details, please click the link on the left.
     */
    public void setEncryption(Encryption Encryption) {
        this.Encryption = Encryption;
    }

    /**
     * Get Encrypted ciphertext; The data format before encryption is as follows:{"FaceInput":"AAAAA","FaceInputType":1} 
     * @return EncryptedBody Encrypted ciphertext; The data format before encryption is as follows:{"FaceInput":"AAAAA","FaceInputType":1}
     */
    public String getEncryptedBody() {
        return this.EncryptedBody;
    }

    /**
     * Set Encrypted ciphertext; The data format before encryption is as follows:{"FaceInput":"AAAAA","FaceInputType":1}
     * @param EncryptedBody Encrypted ciphertext; The data format before encryption is as follows:{"FaceInput":"AAAAA","FaceInputType":1}
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

