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
package com.tencentcloudapi.iai.v20200303.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DetectLiveFaceAccurateRequest extends AbstractModel {

    /**
    * <p>base64 data of the image.</p><ul><li>The size after base64 encoding must not exceed 5M.</li><li>For jpg format, the long side pixel must not exceed 4000. For other formats, the long side pixel must not exceed 2000.</li><li>The aspect ratio of the image should be close to 3:4. The ratio from mobile phone shooting is best.</li><li>The human face size must be greater than 100X100 pixels.</li><li>Format support: PNG, jpg, JPEG, and BMP. GIF images are not supported.</li></ul>
    */
    @SerializedName("Image")
    @Expose
    private String Image;

    /**
    * <p>The Url of the Image.</p><ul><li>The size of the corresponding Image after base64 encoding must not exceed 5M.</li><li>For jpg format, the long side pixel must not exceed 4000. For other formats, the long side pixel must not exceed 2000.</li><li>Either Url or Image must be provided. If both are provided, only use Url.</li><li>The aspect ratio of the Image should be close to 3:4, which is the best ratio for mobile phone shooting.</li><li>The human face size must be greater than 100X100 pixels.</li><li>An Image stored in Tencent Cloud via Url can guarantee higher download speed and stability. It is recommended to store images in Tencent Cloud. The speed and stability of URLs not stored in Tencent Cloud may be affected.</li><li>Supported Image formats include PNG, jpg, JPEG, and BMP. GIF images are not supported.</li></ul>
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * <p>Algorithm model version used by the face recognition service. Currently, the input parameter supports "3.0".</p>
    */
    @SerializedName("FaceModelVersion")
    @Expose
    private String FaceModelVersion;

    /**
     * Get <p>base64 data of the image.</p><ul><li>The size after base64 encoding must not exceed 5M.</li><li>For jpg format, the long side pixel must not exceed 4000. For other formats, the long side pixel must not exceed 2000.</li><li>The aspect ratio of the image should be close to 3:4. The ratio from mobile phone shooting is best.</li><li>The human face size must be greater than 100X100 pixels.</li><li>Format support: PNG, jpg, JPEG, and BMP. GIF images are not supported.</li></ul> 
     * @return Image <p>base64 data of the image.</p><ul><li>The size after base64 encoding must not exceed 5M.</li><li>For jpg format, the long side pixel must not exceed 4000. For other formats, the long side pixel must not exceed 2000.</li><li>The aspect ratio of the image should be close to 3:4. The ratio from mobile phone shooting is best.</li><li>The human face size must be greater than 100X100 pixels.</li><li>Format support: PNG, jpg, JPEG, and BMP. GIF images are not supported.</li></ul>
     */
    public String getImage() {
        return this.Image;
    }

    /**
     * Set <p>base64 data of the image.</p><ul><li>The size after base64 encoding must not exceed 5M.</li><li>For jpg format, the long side pixel must not exceed 4000. For other formats, the long side pixel must not exceed 2000.</li><li>The aspect ratio of the image should be close to 3:4. The ratio from mobile phone shooting is best.</li><li>The human face size must be greater than 100X100 pixels.</li><li>Format support: PNG, jpg, JPEG, and BMP. GIF images are not supported.</li></ul>
     * @param Image <p>base64 data of the image.</p><ul><li>The size after base64 encoding must not exceed 5M.</li><li>For jpg format, the long side pixel must not exceed 4000. For other formats, the long side pixel must not exceed 2000.</li><li>The aspect ratio of the image should be close to 3:4. The ratio from mobile phone shooting is best.</li><li>The human face size must be greater than 100X100 pixels.</li><li>Format support: PNG, jpg, JPEG, and BMP. GIF images are not supported.</li></ul>
     */
    public void setImage(String Image) {
        this.Image = Image;
    }

    /**
     * Get <p>The Url of the Image.</p><ul><li>The size of the corresponding Image after base64 encoding must not exceed 5M.</li><li>For jpg format, the long side pixel must not exceed 4000. For other formats, the long side pixel must not exceed 2000.</li><li>Either Url or Image must be provided. If both are provided, only use Url.</li><li>The aspect ratio of the Image should be close to 3:4, which is the best ratio for mobile phone shooting.</li><li>The human face size must be greater than 100X100 pixels.</li><li>An Image stored in Tencent Cloud via Url can guarantee higher download speed and stability. It is recommended to store images in Tencent Cloud. The speed and stability of URLs not stored in Tencent Cloud may be affected.</li><li>Supported Image formats include PNG, jpg, JPEG, and BMP. GIF images are not supported.</li></ul> 
     * @return Url <p>The Url of the Image.</p><ul><li>The size of the corresponding Image after base64 encoding must not exceed 5M.</li><li>For jpg format, the long side pixel must not exceed 4000. For other formats, the long side pixel must not exceed 2000.</li><li>Either Url or Image must be provided. If both are provided, only use Url.</li><li>The aspect ratio of the Image should be close to 3:4, which is the best ratio for mobile phone shooting.</li><li>The human face size must be greater than 100X100 pixels.</li><li>An Image stored in Tencent Cloud via Url can guarantee higher download speed and stability. It is recommended to store images in Tencent Cloud. The speed and stability of URLs not stored in Tencent Cloud may be affected.</li><li>Supported Image formats include PNG, jpg, JPEG, and BMP. GIF images are not supported.</li></ul>
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set <p>The Url of the Image.</p><ul><li>The size of the corresponding Image after base64 encoding must not exceed 5M.</li><li>For jpg format, the long side pixel must not exceed 4000. For other formats, the long side pixel must not exceed 2000.</li><li>Either Url or Image must be provided. If both are provided, only use Url.</li><li>The aspect ratio of the Image should be close to 3:4, which is the best ratio for mobile phone shooting.</li><li>The human face size must be greater than 100X100 pixels.</li><li>An Image stored in Tencent Cloud via Url can guarantee higher download speed and stability. It is recommended to store images in Tencent Cloud. The speed and stability of URLs not stored in Tencent Cloud may be affected.</li><li>Supported Image formats include PNG, jpg, JPEG, and BMP. GIF images are not supported.</li></ul>
     * @param Url <p>The Url of the Image.</p><ul><li>The size of the corresponding Image after base64 encoding must not exceed 5M.</li><li>For jpg format, the long side pixel must not exceed 4000. For other formats, the long side pixel must not exceed 2000.</li><li>Either Url or Image must be provided. If both are provided, only use Url.</li><li>The aspect ratio of the Image should be close to 3:4, which is the best ratio for mobile phone shooting.</li><li>The human face size must be greater than 100X100 pixels.</li><li>An Image stored in Tencent Cloud via Url can guarantee higher download speed and stability. It is recommended to store images in Tencent Cloud. The speed and stability of URLs not stored in Tencent Cloud may be affected.</li><li>Supported Image formats include PNG, jpg, JPEG, and BMP. GIF images are not supported.</li></ul>
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get <p>Algorithm model version used by the face recognition service. Currently, the input parameter supports "3.0".</p> 
     * @return FaceModelVersion <p>Algorithm model version used by the face recognition service. Currently, the input parameter supports "3.0".</p>
     */
    public String getFaceModelVersion() {
        return this.FaceModelVersion;
    }

    /**
     * Set <p>Algorithm model version used by the face recognition service. Currently, the input parameter supports "3.0".</p>
     * @param FaceModelVersion <p>Algorithm model version used by the face recognition service. Currently, the input parameter supports "3.0".</p>
     */
    public void setFaceModelVersion(String FaceModelVersion) {
        this.FaceModelVersion = FaceModelVersion;
    }

    public DetectLiveFaceAccurateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DetectLiveFaceAccurateRequest(DetectLiveFaceAccurateRequest source) {
        if (source.Image != null) {
            this.Image = new String(source.Image);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.FaceModelVersion != null) {
            this.FaceModelVersion = new String(source.FaceModelVersion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Image", this.Image);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "FaceModelVersion", this.FaceModelVersion);

    }
}

