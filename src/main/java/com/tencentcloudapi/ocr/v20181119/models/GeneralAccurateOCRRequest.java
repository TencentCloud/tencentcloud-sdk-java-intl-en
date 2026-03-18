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
    * The Base64 value of an image/PDF. the image must be no more than 10M after encoding, with a resolution of 600*800 or higher recommended. supported formats include PNG, JPG, JPEG, BMP, and PDF. either ImageUrl or ImageBase64 must be provided. if both are provided, only ImageUrl will be used.
    */
    @SerializedName("ImageBase64")
    @Expose
    private String ImageBase64;

    /**
    * URL address of image. (This field is not supported outside Chinese mainland)
The image cannot exceed 7 MB after being Base64-encoded. A resolution above 600x800 is recommended. PNG, JPG, JPEG, and BMP formats are supported.
We recommend you store the image in Tencent Cloud, as a Tencent Cloud URL can guarantee higher download speed and stability. The download speed and stability of non-Tencent Cloud URLs may be low.
    */
    @SerializedName("ImageUrl")
    @Expose
    private String ImageUrl;

    /**
    * Whether to enable original image slicing detection. once enabled, it improves recognition accuracy in scenarios where "the overall image area is large but the single character area is small" (for example: exam paper). default: disabled. note: only supported when ConfigID is configured as OCR.
    */
    @SerializedName("EnableDetectSplit")
    @Expose
    private Boolean EnableDetectSplit;

    /**
    * Whether to enable PDF recognition. Default value: `false`. If you enable this feature, both images and PDF files can be recognized.
    */
    @SerializedName("IsPdf")
    @Expose
    private Boolean IsPdf;

    /**
    * Number of a PDF page that needs to be recognized. Currently, only one single page can be recognized. This parameter takes effect only if a PDF file is uploaded and `IsPdf` is set to `true`. Default value: `1`
    */
    @SerializedName("PdfPageNumber")
    @Expose
    private Long PdfPageNumber;

    /**
    * Text detection switch, default is true. set to false to directly perform single-line text recognition, suitable for image scenarios containing only forward single-line text.
    */
    @SerializedName("EnableDetectText")
    @Expose
    private Boolean EnableDetectText;

    /**
    * Configuration ID supports: OCR - general scenario MulOCR - multilingual scenario. default value is OCR.
    */
    @SerializedName("ConfigID")
    @Expose
    private String ConfigID;

    /**
     * Get The Base64 value of an image/PDF. the image must be no more than 10M after encoding, with a resolution of 600*800 or higher recommended. supported formats include PNG, JPG, JPEG, BMP, and PDF. either ImageUrl or ImageBase64 must be provided. if both are provided, only ImageUrl will be used. 
     * @return ImageBase64 The Base64 value of an image/PDF. the image must be no more than 10M after encoding, with a resolution of 600*800 or higher recommended. supported formats include PNG, JPG, JPEG, BMP, and PDF. either ImageUrl or ImageBase64 must be provided. if both are provided, only ImageUrl will be used.
     */
    public String getImageBase64() {
        return this.ImageBase64;
    }

    /**
     * Set The Base64 value of an image/PDF. the image must be no more than 10M after encoding, with a resolution of 600*800 or higher recommended. supported formats include PNG, JPG, JPEG, BMP, and PDF. either ImageUrl or ImageBase64 must be provided. if both are provided, only ImageUrl will be used.
     * @param ImageBase64 The Base64 value of an image/PDF. the image must be no more than 10M after encoding, with a resolution of 600*800 or higher recommended. supported formats include PNG, JPG, JPEG, BMP, and PDF. either ImageUrl or ImageBase64 must be provided. if both are provided, only ImageUrl will be used.
     */
    public void setImageBase64(String ImageBase64) {
        this.ImageBase64 = ImageBase64;
    }

    /**
     * Get URL address of image. (This field is not supported outside Chinese mainland)
The image cannot exceed 7 MB after being Base64-encoded. A resolution above 600x800 is recommended. PNG, JPG, JPEG, and BMP formats are supported.
We recommend you store the image in Tencent Cloud, as a Tencent Cloud URL can guarantee higher download speed and stability. The download speed and stability of non-Tencent Cloud URLs may be low. 
     * @return ImageUrl URL address of image. (This field is not supported outside Chinese mainland)
The image cannot exceed 7 MB after being Base64-encoded. A resolution above 600x800 is recommended. PNG, JPG, JPEG, and BMP formats are supported.
We recommend you store the image in Tencent Cloud, as a Tencent Cloud URL can guarantee higher download speed and stability. The download speed and stability of non-Tencent Cloud URLs may be low.
     */
    public String getImageUrl() {
        return this.ImageUrl;
    }

    /**
     * Set URL address of image. (This field is not supported outside Chinese mainland)
The image cannot exceed 7 MB after being Base64-encoded. A resolution above 600x800 is recommended. PNG, JPG, JPEG, and BMP formats are supported.
We recommend you store the image in Tencent Cloud, as a Tencent Cloud URL can guarantee higher download speed and stability. The download speed and stability of non-Tencent Cloud URLs may be low.
     * @param ImageUrl URL address of image. (This field is not supported outside Chinese mainland)
The image cannot exceed 7 MB after being Base64-encoded. A resolution above 600x800 is recommended. PNG, JPG, JPEG, and BMP formats are supported.
We recommend you store the image in Tencent Cloud, as a Tencent Cloud URL can guarantee higher download speed and stability. The download speed and stability of non-Tencent Cloud URLs may be low.
     */
    public void setImageUrl(String ImageUrl) {
        this.ImageUrl = ImageUrl;
    }

    /**
     * Get Whether to enable original image slicing detection. once enabled, it improves recognition accuracy in scenarios where "the overall image area is large but the single character area is small" (for example: exam paper). default: disabled. note: only supported when ConfigID is configured as OCR. 
     * @return EnableDetectSplit Whether to enable original image slicing detection. once enabled, it improves recognition accuracy in scenarios where "the overall image area is large but the single character area is small" (for example: exam paper). default: disabled. note: only supported when ConfigID is configured as OCR.
     */
    public Boolean getEnableDetectSplit() {
        return this.EnableDetectSplit;
    }

    /**
     * Set Whether to enable original image slicing detection. once enabled, it improves recognition accuracy in scenarios where "the overall image area is large but the single character area is small" (for example: exam paper). default: disabled. note: only supported when ConfigID is configured as OCR.
     * @param EnableDetectSplit Whether to enable original image slicing detection. once enabled, it improves recognition accuracy in scenarios where "the overall image area is large but the single character area is small" (for example: exam paper). default: disabled. note: only supported when ConfigID is configured as OCR.
     */
    public void setEnableDetectSplit(Boolean EnableDetectSplit) {
        this.EnableDetectSplit = EnableDetectSplit;
    }

    /**
     * Get Whether to enable PDF recognition. Default value: `false`. If you enable this feature, both images and PDF files can be recognized. 
     * @return IsPdf Whether to enable PDF recognition. Default value: `false`. If you enable this feature, both images and PDF files can be recognized.
     */
    public Boolean getIsPdf() {
        return this.IsPdf;
    }

    /**
     * Set Whether to enable PDF recognition. Default value: `false`. If you enable this feature, both images and PDF files can be recognized.
     * @param IsPdf Whether to enable PDF recognition. Default value: `false`. If you enable this feature, both images and PDF files can be recognized.
     */
    public void setIsPdf(Boolean IsPdf) {
        this.IsPdf = IsPdf;
    }

    /**
     * Get Number of a PDF page that needs to be recognized. Currently, only one single page can be recognized. This parameter takes effect only if a PDF file is uploaded and `IsPdf` is set to `true`. Default value: `1` 
     * @return PdfPageNumber Number of a PDF page that needs to be recognized. Currently, only one single page can be recognized. This parameter takes effect only if a PDF file is uploaded and `IsPdf` is set to `true`. Default value: `1`
     */
    public Long getPdfPageNumber() {
        return this.PdfPageNumber;
    }

    /**
     * Set Number of a PDF page that needs to be recognized. Currently, only one single page can be recognized. This parameter takes effect only if a PDF file is uploaded and `IsPdf` is set to `true`. Default value: `1`
     * @param PdfPageNumber Number of a PDF page that needs to be recognized. Currently, only one single page can be recognized. This parameter takes effect only if a PDF file is uploaded and `IsPdf` is set to `true`. Default value: `1`
     */
    public void setPdfPageNumber(Long PdfPageNumber) {
        this.PdfPageNumber = PdfPageNumber;
    }

    /**
     * Get Text detection switch, default is true. set to false to directly perform single-line text recognition, suitable for image scenarios containing only forward single-line text. 
     * @return EnableDetectText Text detection switch, default is true. set to false to directly perform single-line text recognition, suitable for image scenarios containing only forward single-line text.
     */
    public Boolean getEnableDetectText() {
        return this.EnableDetectText;
    }

    /**
     * Set Text detection switch, default is true. set to false to directly perform single-line text recognition, suitable for image scenarios containing only forward single-line text.
     * @param EnableDetectText Text detection switch, default is true. set to false to directly perform single-line text recognition, suitable for image scenarios containing only forward single-line text.
     */
    public void setEnableDetectText(Boolean EnableDetectText) {
        this.EnableDetectText = EnableDetectText;
    }

    /**
     * Get Configuration ID supports: OCR - general scenario MulOCR - multilingual scenario. default value is OCR. 
     * @return ConfigID Configuration ID supports: OCR - general scenario MulOCR - multilingual scenario. default value is OCR.
     */
    public String getConfigID() {
        return this.ConfigID;
    }

    /**
     * Set Configuration ID supports: OCR - general scenario MulOCR - multilingual scenario. default value is OCR.
     * @param ConfigID Configuration ID supports: OCR - general scenario MulOCR - multilingual scenario. default value is OCR.
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

