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
package com.tencentcloudapi.ocr.v20181119.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GeneralBasicOCRRequest extends AbstractModel{

    /**
    * Base64-encoded value of image.
The image cannot exceed 7 MB in size after being Base64-encoded. A resolution above 600x800 is recommended. PNG, JPG, JPEG, and BMP formats are supported.
Either `ImageUrl` or `ImageBase64` of the image must be provided; if both are provided, only `ImageUrl` will be used.
    */
    @SerializedName("ImageBase64")
    @Expose
    private String ImageBase64;

    /**
    * URL address of image.
The image cannot exceed 7 MB in size after being Base64-encoded. A resolution above 600x800 is recommended. PNG, JPG, JPEG, and BMP formats are supported.
You are recommended to store the image in Tencent Cloud, as a Tencent Cloud URL can guarantee higher download speed and stability. The download speed and stability of non-Tencent Cloud URLs may be low.
    */
    @SerializedName("ImageUrl")
    @Expose
    private String ImageUrl;

    /**
    * Reserved field.
    */
    @SerializedName("Scene")
    @Expose
    private String Scene;

    /**
    * Language to be recognized.
The language can be automatically recognized or manually specified. Chinese-English mix (`zh`) is selected by default. Mixed characters in English and each supported language can be recognized together.
Valid values:
zh\auto\jap\kor\nspa\fre\ger\por\nvie\may\rus\ita\nhol\swe\fin\dan\nnor\hun\tha\lat
Value meanings:
Chinese-English mix, automatic recognition, Japanese, Korean,
Spanish, French, German, Portuguese,
Vietnamese, Malay, Russian, Italian,
Dutch, Swedish, Finnish, Danish,
Norwegian, Hungarian, Thai, Latin.
    */
    @SerializedName("LanguageType")
    @Expose
    private String LanguageType;

    /**
     * Get Base64-encoded value of image.
The image cannot exceed 7 MB in size after being Base64-encoded. A resolution above 600x800 is recommended. PNG, JPG, JPEG, and BMP formats are supported.
Either `ImageUrl` or `ImageBase64` of the image must be provided; if both are provided, only `ImageUrl` will be used. 
     * @return ImageBase64 Base64-encoded value of image.
The image cannot exceed 7 MB in size after being Base64-encoded. A resolution above 600x800 is recommended. PNG, JPG, JPEG, and BMP formats are supported.
Either `ImageUrl` or `ImageBase64` of the image must be provided; if both are provided, only `ImageUrl` will be used.
     */
    public String getImageBase64() {
        return this.ImageBase64;
    }

    /**
     * Set Base64-encoded value of image.
The image cannot exceed 7 MB in size after being Base64-encoded. A resolution above 600x800 is recommended. PNG, JPG, JPEG, and BMP formats are supported.
Either `ImageUrl` or `ImageBase64` of the image must be provided; if both are provided, only `ImageUrl` will be used.
     * @param ImageBase64 Base64-encoded value of image.
The image cannot exceed 7 MB in size after being Base64-encoded. A resolution above 600x800 is recommended. PNG, JPG, JPEG, and BMP formats are supported.
Either `ImageUrl` or `ImageBase64` of the image must be provided; if both are provided, only `ImageUrl` will be used.
     */
    public void setImageBase64(String ImageBase64) {
        this.ImageBase64 = ImageBase64;
    }

    /**
     * Get URL address of image.
The image cannot exceed 7 MB in size after being Base64-encoded. A resolution above 600x800 is recommended. PNG, JPG, JPEG, and BMP formats are supported.
You are recommended to store the image in Tencent Cloud, as a Tencent Cloud URL can guarantee higher download speed and stability. The download speed and stability of non-Tencent Cloud URLs may be low. 
     * @return ImageUrl URL address of image.
The image cannot exceed 7 MB in size after being Base64-encoded. A resolution above 600x800 is recommended. PNG, JPG, JPEG, and BMP formats are supported.
You are recommended to store the image in Tencent Cloud, as a Tencent Cloud URL can guarantee higher download speed and stability. The download speed and stability of non-Tencent Cloud URLs may be low.
     */
    public String getImageUrl() {
        return this.ImageUrl;
    }

    /**
     * Set URL address of image.
The image cannot exceed 7 MB in size after being Base64-encoded. A resolution above 600x800 is recommended. PNG, JPG, JPEG, and BMP formats are supported.
You are recommended to store the image in Tencent Cloud, as a Tencent Cloud URL can guarantee higher download speed and stability. The download speed and stability of non-Tencent Cloud URLs may be low.
     * @param ImageUrl URL address of image.
The image cannot exceed 7 MB in size after being Base64-encoded. A resolution above 600x800 is recommended. PNG, JPG, JPEG, and BMP formats are supported.
You are recommended to store the image in Tencent Cloud, as a Tencent Cloud URL can guarantee higher download speed and stability. The download speed and stability of non-Tencent Cloud URLs may be low.
     */
    public void setImageUrl(String ImageUrl) {
        this.ImageUrl = ImageUrl;
    }

    /**
     * Get Reserved field. 
     * @return Scene Reserved field.
     */
    public String getScene() {
        return this.Scene;
    }

    /**
     * Set Reserved field.
     * @param Scene Reserved field.
     */
    public void setScene(String Scene) {
        this.Scene = Scene;
    }

    /**
     * Get Language to be recognized.
The language can be automatically recognized or manually specified. Chinese-English mix (`zh`) is selected by default. Mixed characters in English and each supported language can be recognized together.
Valid values:
zh\auto\jap\kor\nspa\fre\ger\por\nvie\may\rus\ita\nhol\swe\fin\dan\nnor\hun\tha\lat
Value meanings:
Chinese-English mix, automatic recognition, Japanese, Korean,
Spanish, French, German, Portuguese,
Vietnamese, Malay, Russian, Italian,
Dutch, Swedish, Finnish, Danish,
Norwegian, Hungarian, Thai, Latin. 
     * @return LanguageType Language to be recognized.
The language can be automatically recognized or manually specified. Chinese-English mix (`zh`) is selected by default. Mixed characters in English and each supported language can be recognized together.
Valid values:
zh\auto\jap\kor\nspa\fre\ger\por\nvie\may\rus\ita\nhol\swe\fin\dan\nnor\hun\tha\lat
Value meanings:
Chinese-English mix, automatic recognition, Japanese, Korean,
Spanish, French, German, Portuguese,
Vietnamese, Malay, Russian, Italian,
Dutch, Swedish, Finnish, Danish,
Norwegian, Hungarian, Thai, Latin.
     */
    public String getLanguageType() {
        return this.LanguageType;
    }

    /**
     * Set Language to be recognized.
The language can be automatically recognized or manually specified. Chinese-English mix (`zh`) is selected by default. Mixed characters in English and each supported language can be recognized together.
Valid values:
zh\auto\jap\kor\nspa\fre\ger\por\nvie\may\rus\ita\nhol\swe\fin\dan\nnor\hun\tha\lat
Value meanings:
Chinese-English mix, automatic recognition, Japanese, Korean,
Spanish, French, German, Portuguese,
Vietnamese, Malay, Russian, Italian,
Dutch, Swedish, Finnish, Danish,
Norwegian, Hungarian, Thai, Latin.
     * @param LanguageType Language to be recognized.
The language can be automatically recognized or manually specified. Chinese-English mix (`zh`) is selected by default. Mixed characters in English and each supported language can be recognized together.
Valid values:
zh\auto\jap\kor\nspa\fre\ger\por\nvie\may\rus\ita\nhol\swe\fin\dan\nnor\hun\tha\lat
Value meanings:
Chinese-English mix, automatic recognition, Japanese, Korean,
Spanish, French, German, Portuguese,
Vietnamese, Malay, Russian, Italian,
Dutch, Swedish, Finnish, Danish,
Norwegian, Hungarian, Thai, Latin.
     */
    public void setLanguageType(String LanguageType) {
        this.LanguageType = LanguageType;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ImageBase64", this.ImageBase64);
        this.setParamSimple(map, prefix + "ImageUrl", this.ImageUrl);
        this.setParamSimple(map, prefix + "Scene", this.Scene);
        this.setParamSimple(map, prefix + "LanguageType", this.LanguageType);

    }
}

