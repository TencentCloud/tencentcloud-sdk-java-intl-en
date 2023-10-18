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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RecognizeTableAccurateOCRRequest extends AbstractModel {

    /**
    * The Base64-encoded value of an image.
The image cannot exceed 7 MB after being Base64-encoded. A resolution above 600 x 800 is recommended. PNG, JPG, JPEG, BMP, and PDF formats are supported.
Supported image pixels: 20 to 10,000
Either `ImageUrl` or `ImageBase64` of the image must be provided. If both are provided, only `ImageUrl` is used.
    */
    @SerializedName("ImageBase64")
    @Expose
    private String ImageBase64;

    /**
    * The URL of the image or PDF file.
The image or PDF file cannot exceed 7 MB after being Base64-encoded. A resolution above 600 x 800 is recommended. PNG, JPG, JPEG, BMP, and PDF formats are supported.
Supported image pixels: 20 to 10,000
We recommend that you store the image in Tencent Cloud for higher download speed and stability.
The download speed and stability of non-Tencent Cloud URLs may be low.
    */
    @SerializedName("ImageUrl")
    @Expose
    private String ImageUrl;

    /**
    * The number of the PDF page that needs to be recognized. Only one single PDF page can be recognized. This parameter is valid if the uploaded file is a PDF and the value of `IsPdf` is `true`. Default value: `1`.
    */
    @SerializedName("PdfPageNumber")
    @Expose
    private Long PdfPageNumber;

    /**
     * Get The Base64-encoded value of an image.
The image cannot exceed 7 MB after being Base64-encoded. A resolution above 600 x 800 is recommended. PNG, JPG, JPEG, BMP, and PDF formats are supported.
Supported image pixels: 20 to 10,000
Either `ImageUrl` or `ImageBase64` of the image must be provided. If both are provided, only `ImageUrl` is used. 
     * @return ImageBase64 The Base64-encoded value of an image.
The image cannot exceed 7 MB after being Base64-encoded. A resolution above 600 x 800 is recommended. PNG, JPG, JPEG, BMP, and PDF formats are supported.
Supported image pixels: 20 to 10,000
Either `ImageUrl` or `ImageBase64` of the image must be provided. If both are provided, only `ImageUrl` is used.
     */
    public String getImageBase64() {
        return this.ImageBase64;
    }

    /**
     * Set The Base64-encoded value of an image.
The image cannot exceed 7 MB after being Base64-encoded. A resolution above 600 x 800 is recommended. PNG, JPG, JPEG, BMP, and PDF formats are supported.
Supported image pixels: 20 to 10,000
Either `ImageUrl` or `ImageBase64` of the image must be provided. If both are provided, only `ImageUrl` is used.
     * @param ImageBase64 The Base64-encoded value of an image.
The image cannot exceed 7 MB after being Base64-encoded. A resolution above 600 x 800 is recommended. PNG, JPG, JPEG, BMP, and PDF formats are supported.
Supported image pixels: 20 to 10,000
Either `ImageUrl` or `ImageBase64` of the image must be provided. If both are provided, only `ImageUrl` is used.
     */
    public void setImageBase64(String ImageBase64) {
        this.ImageBase64 = ImageBase64;
    }

    /**
     * Get The URL of the image or PDF file.
The image or PDF file cannot exceed 7 MB after being Base64-encoded. A resolution above 600 x 800 is recommended. PNG, JPG, JPEG, BMP, and PDF formats are supported.
Supported image pixels: 20 to 10,000
We recommend that you store the image in Tencent Cloud for higher download speed and stability.
The download speed and stability of non-Tencent Cloud URLs may be low. 
     * @return ImageUrl The URL of the image or PDF file.
The image or PDF file cannot exceed 7 MB after being Base64-encoded. A resolution above 600 x 800 is recommended. PNG, JPG, JPEG, BMP, and PDF formats are supported.
Supported image pixels: 20 to 10,000
We recommend that you store the image in Tencent Cloud for higher download speed and stability.
The download speed and stability of non-Tencent Cloud URLs may be low.
     */
    public String getImageUrl() {
        return this.ImageUrl;
    }

    /**
     * Set The URL of the image or PDF file.
The image or PDF file cannot exceed 7 MB after being Base64-encoded. A resolution above 600 x 800 is recommended. PNG, JPG, JPEG, BMP, and PDF formats are supported.
Supported image pixels: 20 to 10,000
We recommend that you store the image in Tencent Cloud for higher download speed and stability.
The download speed and stability of non-Tencent Cloud URLs may be low.
     * @param ImageUrl The URL of the image or PDF file.
The image or PDF file cannot exceed 7 MB after being Base64-encoded. A resolution above 600 x 800 is recommended. PNG, JPG, JPEG, BMP, and PDF formats are supported.
Supported image pixels: 20 to 10,000
We recommend that you store the image in Tencent Cloud for higher download speed and stability.
The download speed and stability of non-Tencent Cloud URLs may be low.
     */
    public void setImageUrl(String ImageUrl) {
        this.ImageUrl = ImageUrl;
    }

    /**
     * Get The number of the PDF page that needs to be recognized. Only one single PDF page can be recognized. This parameter is valid if the uploaded file is a PDF and the value of `IsPdf` is `true`. Default value: `1`. 
     * @return PdfPageNumber The number of the PDF page that needs to be recognized. Only one single PDF page can be recognized. This parameter is valid if the uploaded file is a PDF and the value of `IsPdf` is `true`. Default value: `1`.
     */
    public Long getPdfPageNumber() {
        return this.PdfPageNumber;
    }

    /**
     * Set The number of the PDF page that needs to be recognized. Only one single PDF page can be recognized. This parameter is valid if the uploaded file is a PDF and the value of `IsPdf` is `true`. Default value: `1`.
     * @param PdfPageNumber The number of the PDF page that needs to be recognized. Only one single PDF page can be recognized. This parameter is valid if the uploaded file is a PDF and the value of `IsPdf` is `true`. Default value: `1`.
     */
    public void setPdfPageNumber(Long PdfPageNumber) {
        this.PdfPageNumber = PdfPageNumber;
    }

    public RecognizeTableAccurateOCRRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RecognizeTableAccurateOCRRequest(RecognizeTableAccurateOCRRequest source) {
        if (source.ImageBase64 != null) {
            this.ImageBase64 = new String(source.ImageBase64);
        }
        if (source.ImageUrl != null) {
            this.ImageUrl = new String(source.ImageUrl);
        }
        if (source.PdfPageNumber != null) {
            this.PdfPageNumber = new Long(source.PdfPageNumber);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ImageBase64", this.ImageBase64);
        this.setParamSimple(map, prefix + "ImageUrl", this.ImageUrl);
        this.setParamSimple(map, prefix + "PdfPageNumber", this.PdfPageNumber);

    }
}

