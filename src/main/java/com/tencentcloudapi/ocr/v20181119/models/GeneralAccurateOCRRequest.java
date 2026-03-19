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
package com.tencentcloudapi.ocr.v20181119.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GeneralAccurateOCRRequest extends AbstractModel {

    /**
    * <p>The Base64 value of the image/PDF. The image size after Base64 encoding must be no more than 10M, with a resolution of 600*800 or higher recommended. PNG, JPG, JPEG, BMP, and PDF formats are supported. Either ImageUrl or ImageBase64 of the image must be provided. If both are provided, only ImageUrl will be used.</p>
    */
    @SerializedName("ImageBase64")
    @Expose
    private String ImageBase64;

    /**
    * URL address of image. 
The image cannot exceed 10 MB after being Base64-encoded. A resolution above 600x800 is recommended. PNG, JPG, JPEG, and BMP formats are supported.
We recommend you store the image in Tencent Cloud, as a Tencent Cloud URL can guarantee higher download speed and stability. The download speed and stability of non-Tencent Cloud URLs may be low.
    */
    @SerializedName("ImageUrl")
    @Expose
    private String ImageUrl;

    /**
    * <p>Whether to enable original image slicing detection. Once enabled, it improves recognition accuracy in scenarios where "the overall image area is large but the single character occupies a small proportion" (for example: exam paper). Default: disabled. Note: Only supported when ConfigID is configured as OCR.</p>
    */
    @SerializedName("EnableDetectSplit")
    @Expose
    private Boolean EnableDetectSplit;

    /**
    * <p>Whether PDF recognition is enabled. The default value is false. Once enabled, it can simultaneously support image and PDF recognition.</p>
    */
    @SerializedName("IsPdf")
    @Expose
    private Boolean IsPdf;

    /**
    * <p>The corresponding page number of the PDF page to be recognized. Only single page recognition is supported. Valid at that time when the upload file is a PDF and the IsPdf parameter value is true. The default value is 1.</p>
    */
    @SerializedName("PdfPageNumber")
    @Expose
    private Long PdfPageNumber;

    /**
    * <p>Text Detection Switch, true by default. Set to false to directly perform single-line recognition, suitable for image scenarios containing only forward single-line text.</p>
    */
    @SerializedName("EnableDetectText")
    @Expose
    private Boolean EnableDetectText;

    /**
    * <p>Configuration ID support: OCR -- common scenarios MulOCR -- multilingual scenario. Default value: OCR.</p>
    */
    @SerializedName("ConfigID")
    @Expose
    private String ConfigID;

    /**
     * Get <p>The Base64 value of the image/PDF. The image size after Base64 encoding must be no more than 10M, with a resolution of 600*800 or higher recommended. PNG, JPG, JPEG, BMP, and PDF formats are supported. Either ImageUrl or ImageBase64 of the image must be provided. If both are provided, only ImageUrl will be used.</p> 
     * @return ImageBase64 <p>The Base64 value of the image/PDF. The image size after Base64 encoding must be no more than 10M, with a resolution of 600*800 or higher recommended. PNG, JPG, JPEG, BMP, and PDF formats are supported. Either ImageUrl or ImageBase64 of the image must be provided. If both are provided, only ImageUrl will be used.</p>
     */
    public String getImageBase64() {
        return this.ImageBase64;
    }

    /**
     * Set <p>The Base64 value of the image/PDF. The image size after Base64 encoding must be no more than 10M, with a resolution of 600*800 or higher recommended. PNG, JPG, JPEG, BMP, and PDF formats are supported. Either ImageUrl or ImageBase64 of the image must be provided. If both are provided, only ImageUrl will be used.</p>
     * @param ImageBase64 <p>The Base64 value of the image/PDF. The image size after Base64 encoding must be no more than 10M, with a resolution of 600*800 or higher recommended. PNG, JPG, JPEG, BMP, and PDF formats are supported. Either ImageUrl or ImageBase64 of the image must be provided. If both are provided, only ImageUrl will be used.</p>
     */
    public void setImageBase64(String ImageBase64) {
        this.ImageBase64 = ImageBase64;
    }

    /**
     * Get URL address of image. 
The image cannot exceed 10 MB after being Base64-encoded. A resolution above 600x800 is recommended. PNG, JPG, JPEG, and BMP formats are supported.
We recommend you store the image in Tencent Cloud, as a Tencent Cloud URL can guarantee higher download speed and stability. The download speed and stability of non-Tencent Cloud URLs may be low. 
     * @return ImageUrl URL address of image. 
The image cannot exceed 10 MB after being Base64-encoded. A resolution above 600x800 is recommended. PNG, JPG, JPEG, and BMP formats are supported.
We recommend you store the image in Tencent Cloud, as a Tencent Cloud URL can guarantee higher download speed and stability. The download speed and stability of non-Tencent Cloud URLs may be low.
     */
    public String getImageUrl() {
        return this.ImageUrl;
    }

    /**
     * Set URL address of image. 
The image cannot exceed 10 MB after being Base64-encoded. A resolution above 600x800 is recommended. PNG, JPG, JPEG, and BMP formats are supported.
We recommend you store the image in Tencent Cloud, as a Tencent Cloud URL can guarantee higher download speed and stability. The download speed and stability of non-Tencent Cloud URLs may be low.
     * @param ImageUrl URL address of image. 
The image cannot exceed 10 MB after being Base64-encoded. A resolution above 600x800 is recommended. PNG, JPG, JPEG, and BMP formats are supported.
We recommend you store the image in Tencent Cloud, as a Tencent Cloud URL can guarantee higher download speed and stability. The download speed and stability of non-Tencent Cloud URLs may be low.
     */
    public void setImageUrl(String ImageUrl) {
        this.ImageUrl = ImageUrl;
    }

    /**
     * Get <p>Whether to enable original image slicing detection. Once enabled, it improves recognition accuracy in scenarios where "the overall image area is large but the single character occupies a small proportion" (for example: exam paper). Default: disabled. Note: Only supported when ConfigID is configured as OCR.</p> 
     * @return EnableDetectSplit <p>Whether to enable original image slicing detection. Once enabled, it improves recognition accuracy in scenarios where "the overall image area is large but the single character occupies a small proportion" (for example: exam paper). Default: disabled. Note: Only supported when ConfigID is configured as OCR.</p>
     */
    public Boolean getEnableDetectSplit() {
        return this.EnableDetectSplit;
    }

    /**
     * Set <p>Whether to enable original image slicing detection. Once enabled, it improves recognition accuracy in scenarios where "the overall image area is large but the single character occupies a small proportion" (for example: exam paper). Default: disabled. Note: Only supported when ConfigID is configured as OCR.</p>
     * @param EnableDetectSplit <p>Whether to enable original image slicing detection. Once enabled, it improves recognition accuracy in scenarios where "the overall image area is large but the single character occupies a small proportion" (for example: exam paper). Default: disabled. Note: Only supported when ConfigID is configured as OCR.</p>
     */
    public void setEnableDetectSplit(Boolean EnableDetectSplit) {
        this.EnableDetectSplit = EnableDetectSplit;
    }

    /**
     * Get <p>Whether PDF recognition is enabled. The default value is false. Once enabled, it can simultaneously support image and PDF recognition.</p> 
     * @return IsPdf <p>Whether PDF recognition is enabled. The default value is false. Once enabled, it can simultaneously support image and PDF recognition.</p>
     */
    public Boolean getIsPdf() {
        return this.IsPdf;
    }

    /**
     * Set <p>Whether PDF recognition is enabled. The default value is false. Once enabled, it can simultaneously support image and PDF recognition.</p>
     * @param IsPdf <p>Whether PDF recognition is enabled. The default value is false. Once enabled, it can simultaneously support image and PDF recognition.</p>
     */
    public void setIsPdf(Boolean IsPdf) {
        this.IsPdf = IsPdf;
    }

    /**
     * Get <p>The corresponding page number of the PDF page to be recognized. Only single page recognition is supported. Valid at that time when the upload file is a PDF and the IsPdf parameter value is true. The default value is 1.</p> 
     * @return PdfPageNumber <p>The corresponding page number of the PDF page to be recognized. Only single page recognition is supported. Valid at that time when the upload file is a PDF and the IsPdf parameter value is true. The default value is 1.</p>
     */
    public Long getPdfPageNumber() {
        return this.PdfPageNumber;
    }

    /**
     * Set <p>The corresponding page number of the PDF page to be recognized. Only single page recognition is supported. Valid at that time when the upload file is a PDF and the IsPdf parameter value is true. The default value is 1.</p>
     * @param PdfPageNumber <p>The corresponding page number of the PDF page to be recognized. Only single page recognition is supported. Valid at that time when the upload file is a PDF and the IsPdf parameter value is true. The default value is 1.</p>
     */
    public void setPdfPageNumber(Long PdfPageNumber) {
        this.PdfPageNumber = PdfPageNumber;
    }

    /**
     * Get <p>Text Detection Switch, true by default. Set to false to directly perform single-line recognition, suitable for image scenarios containing only forward single-line text.</p> 
     * @return EnableDetectText <p>Text Detection Switch, true by default. Set to false to directly perform single-line recognition, suitable for image scenarios containing only forward single-line text.</p>
     */
    public Boolean getEnableDetectText() {
        return this.EnableDetectText;
    }

    /**
     * Set <p>Text Detection Switch, true by default. Set to false to directly perform single-line recognition, suitable for image scenarios containing only forward single-line text.</p>
     * @param EnableDetectText <p>Text Detection Switch, true by default. Set to false to directly perform single-line recognition, suitable for image scenarios containing only forward single-line text.</p>
     */
    public void setEnableDetectText(Boolean EnableDetectText) {
        this.EnableDetectText = EnableDetectText;
    }

    /**
     * Get <p>Configuration ID support: OCR -- common scenarios MulOCR -- multilingual scenario. Default value: OCR.</p> 
     * @return ConfigID <p>Configuration ID support: OCR -- common scenarios MulOCR -- multilingual scenario. Default value: OCR.</p>
     */
    public String getConfigID() {
        return this.ConfigID;
    }

    /**
     * Set <p>Configuration ID support: OCR -- common scenarios MulOCR -- multilingual scenario. Default value: OCR.</p>
     * @param ConfigID <p>Configuration ID support: OCR -- common scenarios MulOCR -- multilingual scenario. Default value: OCR.</p>
     */
    public void setConfigID(String ConfigID) {
        this.ConfigID = ConfigID;
    }

    public GeneralAccurateOCRRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GeneralAccurateOCRRequest(GeneralAccurateOCRRequest source) {
        if (source.ImageBase64 != null) {
            this.ImageBase64 = new String(source.ImageBase64);
        }
        if (source.ImageUrl != null) {
            this.ImageUrl = new String(source.ImageUrl);
        }
        if (source.EnableDetectSplit != null) {
            this.EnableDetectSplit = new Boolean(source.EnableDetectSplit);
        }
        if (source.IsPdf != null) {
            this.IsPdf = new Boolean(source.IsPdf);
        }
        if (source.PdfPageNumber != null) {
            this.PdfPageNumber = new Long(source.PdfPageNumber);
        }
        if (source.EnableDetectText != null) {
            this.EnableDetectText = new Boolean(source.EnableDetectText);
        }
        if (source.ConfigID != null) {
            this.ConfigID = new String(source.ConfigID);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ImageBase64", this.ImageBase64);
        this.setParamSimple(map, prefix + "ImageUrl", this.ImageUrl);
        this.setParamSimple(map, prefix + "EnableDetectSplit", this.EnableDetectSplit);
        this.setParamSimple(map, prefix + "IsPdf", this.IsPdf);
        this.setParamSimple(map, prefix + "PdfPageNumber", this.PdfPageNumber);
        this.setParamSimple(map, prefix + "EnableDetectText", this.EnableDetectText);
        this.setParamSimple(map, prefix + "ConfigID", this.ConfigID);

    }
}

