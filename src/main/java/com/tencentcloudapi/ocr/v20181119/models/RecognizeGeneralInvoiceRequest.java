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

public class RecognizeGeneralInvoiceRequest extends AbstractModel {

    /**
    * The Base64-encoded value of the image.
Supported image formats: PNG, JPG, JPEG, and PDF. GIF is currently not supported.
Supported image size: The downloaded image after Base64 encoding can be up to 7 MB. The download time of the image cannot exceed 3s.
Supported image pixels: 20 to 10,000
Either `ImageUrl` or `ImageBase64` of the image must be provided. If both are provided, only `ImageUrl` is used.
    */
    @SerializedName("ImageBase64")
    @Expose
    private String ImageBase64;

    /**
    * The URL of the image.
Supported image formats: PNG, JPG, JPEG, and PDF. GIF is currently not supported.
Supported image size: The downloaded image after Base64 encoding can be up to 7 MB. The download time of the image cannot exceed 3s.
Supported image pixels: 20 to 10,000
We recommend that you store the image in Tencent Cloud for higher download speed and stability.
The download speed and stability of non-Tencent Cloud URLs may be low.
    */
    @SerializedName("ImageUrl")
    @Expose
    private String ImageUrl;

    /**
    * The list of the types of invoices to be recognized. If this parameter is left empty, all types of invoices are recognized.
0: Taxi receipt
1: Quota invoice
2: Train ticket
3: VAT invoice
5: Itinerary/Receipt of e-ticket for air transport
8: General machine-printed invoice
9: Bus ticket
10: Ship ticket
11: VAT invoice (roll)
12: Car sales inovice
13: Toll receipt
15: Non-tax revenue invoice
16: Fully digitalized electronic invoice
-1: Other

By default, this parameter is left empty, which means to recognize all types of invoices.
When a single type is passed in, the image is recognized based on this type.
You can only specify a singe type or all types, but not some types.
    */
    @SerializedName("Types")
    @Expose
    private Long [] Types;

    /**
    * Whether to enable recognition of other invoices. If you enable this feature, other invoices can be recognized. Default value: `true`.	
    */
    @SerializedName("EnableOther")
    @Expose
    private Boolean EnableOther;

    /**
    * Whether to enable PDF recognition. If you enable this feature, both images and PDF files can be recognized. Default value: `true`.
    */
    @SerializedName("EnablePdf")
    @Expose
    private Boolean EnablePdf;

    /**
    * The number of the PDF page that needs to be recognized. Only one single PDF page can be recognized. This parameter is valid if the uploaded file is a PDF and the value of `EnablePdf` is `true`. Default value: 1.
    */
    @SerializedName("PdfPageNumber")
    @Expose
    private Long PdfPageNumber;

    /**
    * Whether to enable multi-page PDF recognition. If you enable this feature, multiple pages of a PDF file can be recognized, and the recognition results of a maximum of the first 30 pages can be returned. After you enable this feature, input parameters `EnablePdf` and `PdfPageNumber` are invalid. Default value: `false`.
    */
    @SerializedName("EnableMultiplePage")
    @Expose
    private Boolean EnableMultiplePage;

    /**
    * Whether to return the Base64-encoded value of the cropped image. Default value: `false`.
    */
    @SerializedName("EnableCutImage")
    @Expose
    private Boolean EnableCutImage;

    /**
     * Get The Base64-encoded value of the image.
Supported image formats: PNG, JPG, JPEG, and PDF. GIF is currently not supported.
Supported image size: The downloaded image after Base64 encoding can be up to 7 MB. The download time of the image cannot exceed 3s.
Supported image pixels: 20 to 10,000
Either `ImageUrl` or `ImageBase64` of the image must be provided. If both are provided, only `ImageUrl` is used. 
     * @return ImageBase64 The Base64-encoded value of the image.
Supported image formats: PNG, JPG, JPEG, and PDF. GIF is currently not supported.
Supported image size: The downloaded image after Base64 encoding can be up to 7 MB. The download time of the image cannot exceed 3s.
Supported image pixels: 20 to 10,000
Either `ImageUrl` or `ImageBase64` of the image must be provided. If both are provided, only `ImageUrl` is used.
     */
    public String getImageBase64() {
        return this.ImageBase64;
    }

    /**
     * Set The Base64-encoded value of the image.
Supported image formats: PNG, JPG, JPEG, and PDF. GIF is currently not supported.
Supported image size: The downloaded image after Base64 encoding can be up to 7 MB. The download time of the image cannot exceed 3s.
Supported image pixels: 20 to 10,000
Either `ImageUrl` or `ImageBase64` of the image must be provided. If both are provided, only `ImageUrl` is used.
     * @param ImageBase64 The Base64-encoded value of the image.
Supported image formats: PNG, JPG, JPEG, and PDF. GIF is currently not supported.
Supported image size: The downloaded image after Base64 encoding can be up to 7 MB. The download time of the image cannot exceed 3s.
Supported image pixels: 20 to 10,000
Either `ImageUrl` or `ImageBase64` of the image must be provided. If both are provided, only `ImageUrl` is used.
     */
    public void setImageBase64(String ImageBase64) {
        this.ImageBase64 = ImageBase64;
    }

    /**
     * Get The URL of the image.
Supported image formats: PNG, JPG, JPEG, and PDF. GIF is currently not supported.
Supported image size: The downloaded image after Base64 encoding can be up to 7 MB. The download time of the image cannot exceed 3s.
Supported image pixels: 20 to 10,000
We recommend that you store the image in Tencent Cloud for higher download speed and stability.
The download speed and stability of non-Tencent Cloud URLs may be low. 
     * @return ImageUrl The URL of the image.
Supported image formats: PNG, JPG, JPEG, and PDF. GIF is currently not supported.
Supported image size: The downloaded image after Base64 encoding can be up to 7 MB. The download time of the image cannot exceed 3s.
Supported image pixels: 20 to 10,000
We recommend that you store the image in Tencent Cloud for higher download speed and stability.
The download speed and stability of non-Tencent Cloud URLs may be low.
     */
    public String getImageUrl() {
        return this.ImageUrl;
    }

    /**
     * Set The URL of the image.
Supported image formats: PNG, JPG, JPEG, and PDF. GIF is currently not supported.
Supported image size: The downloaded image after Base64 encoding can be up to 7 MB. The download time of the image cannot exceed 3s.
Supported image pixels: 20 to 10,000
We recommend that you store the image in Tencent Cloud for higher download speed and stability.
The download speed and stability of non-Tencent Cloud URLs may be low.
     * @param ImageUrl The URL of the image.
Supported image formats: PNG, JPG, JPEG, and PDF. GIF is currently not supported.
Supported image size: The downloaded image after Base64 encoding can be up to 7 MB. The download time of the image cannot exceed 3s.
Supported image pixels: 20 to 10,000
We recommend that you store the image in Tencent Cloud for higher download speed and stability.
The download speed and stability of non-Tencent Cloud URLs may be low.
     */
    public void setImageUrl(String ImageUrl) {
        this.ImageUrl = ImageUrl;
    }

    /**
     * Get The list of the types of invoices to be recognized. If this parameter is left empty, all types of invoices are recognized.
0: Taxi receipt
1: Quota invoice
2: Train ticket
3: VAT invoice
5: Itinerary/Receipt of e-ticket for air transport
8: General machine-printed invoice
9: Bus ticket
10: Ship ticket
11: VAT invoice (roll)
12: Car sales inovice
13: Toll receipt
15: Non-tax revenue invoice
16: Fully digitalized electronic invoice
-1: Other

By default, this parameter is left empty, which means to recognize all types of invoices.
When a single type is passed in, the image is recognized based on this type.
You can only specify a singe type or all types, but not some types. 
     * @return Types The list of the types of invoices to be recognized. If this parameter is left empty, all types of invoices are recognized.
0: Taxi receipt
1: Quota invoice
2: Train ticket
3: VAT invoice
5: Itinerary/Receipt of e-ticket for air transport
8: General machine-printed invoice
9: Bus ticket
10: Ship ticket
11: VAT invoice (roll)
12: Car sales inovice
13: Toll receipt
15: Non-tax revenue invoice
16: Fully digitalized electronic invoice
-1: Other

By default, this parameter is left empty, which means to recognize all types of invoices.
When a single type is passed in, the image is recognized based on this type.
You can only specify a singe type or all types, but not some types.
     */
    public Long [] getTypes() {
        return this.Types;
    }

    /**
     * Set The list of the types of invoices to be recognized. If this parameter is left empty, all types of invoices are recognized.
0: Taxi receipt
1: Quota invoice
2: Train ticket
3: VAT invoice
5: Itinerary/Receipt of e-ticket for air transport
8: General machine-printed invoice
9: Bus ticket
10: Ship ticket
11: VAT invoice (roll)
12: Car sales inovice
13: Toll receipt
15: Non-tax revenue invoice
16: Fully digitalized electronic invoice
-1: Other

By default, this parameter is left empty, which means to recognize all types of invoices.
When a single type is passed in, the image is recognized based on this type.
You can only specify a singe type or all types, but not some types.
     * @param Types The list of the types of invoices to be recognized. If this parameter is left empty, all types of invoices are recognized.
0: Taxi receipt
1: Quota invoice
2: Train ticket
3: VAT invoice
5: Itinerary/Receipt of e-ticket for air transport
8: General machine-printed invoice
9: Bus ticket
10: Ship ticket
11: VAT invoice (roll)
12: Car sales inovice
13: Toll receipt
15: Non-tax revenue invoice
16: Fully digitalized electronic invoice
-1: Other

By default, this parameter is left empty, which means to recognize all types of invoices.
When a single type is passed in, the image is recognized based on this type.
You can only specify a singe type or all types, but not some types.
     */
    public void setTypes(Long [] Types) {
        this.Types = Types;
    }

    /**
     * Get Whether to enable recognition of other invoices. If you enable this feature, other invoices can be recognized. Default value: `true`.	 
     * @return EnableOther Whether to enable recognition of other invoices. If you enable this feature, other invoices can be recognized. Default value: `true`.	
     */
    public Boolean getEnableOther() {
        return this.EnableOther;
    }

    /**
     * Set Whether to enable recognition of other invoices. If you enable this feature, other invoices can be recognized. Default value: `true`.	
     * @param EnableOther Whether to enable recognition of other invoices. If you enable this feature, other invoices can be recognized. Default value: `true`.	
     */
    public void setEnableOther(Boolean EnableOther) {
        this.EnableOther = EnableOther;
    }

    /**
     * Get Whether to enable PDF recognition. If you enable this feature, both images and PDF files can be recognized. Default value: `true`. 
     * @return EnablePdf Whether to enable PDF recognition. If you enable this feature, both images and PDF files can be recognized. Default value: `true`.
     */
    public Boolean getEnablePdf() {
        return this.EnablePdf;
    }

    /**
     * Set Whether to enable PDF recognition. If you enable this feature, both images and PDF files can be recognized. Default value: `true`.
     * @param EnablePdf Whether to enable PDF recognition. If you enable this feature, both images and PDF files can be recognized. Default value: `true`.
     */
    public void setEnablePdf(Boolean EnablePdf) {
        this.EnablePdf = EnablePdf;
    }

    /**
     * Get The number of the PDF page that needs to be recognized. Only one single PDF page can be recognized. This parameter is valid if the uploaded file is a PDF and the value of `EnablePdf` is `true`. Default value: 1. 
     * @return PdfPageNumber The number of the PDF page that needs to be recognized. Only one single PDF page can be recognized. This parameter is valid if the uploaded file is a PDF and the value of `EnablePdf` is `true`. Default value: 1.
     */
    public Long getPdfPageNumber() {
        return this.PdfPageNumber;
    }

    /**
     * Set The number of the PDF page that needs to be recognized. Only one single PDF page can be recognized. This parameter is valid if the uploaded file is a PDF and the value of `EnablePdf` is `true`. Default value: 1.
     * @param PdfPageNumber The number of the PDF page that needs to be recognized. Only one single PDF page can be recognized. This parameter is valid if the uploaded file is a PDF and the value of `EnablePdf` is `true`. Default value: 1.
     */
    public void setPdfPageNumber(Long PdfPageNumber) {
        this.PdfPageNumber = PdfPageNumber;
    }

    /**
     * Get Whether to enable multi-page PDF recognition. If you enable this feature, multiple pages of a PDF file can be recognized, and the recognition results of a maximum of the first 30 pages can be returned. After you enable this feature, input parameters `EnablePdf` and `PdfPageNumber` are invalid. Default value: `false`. 
     * @return EnableMultiplePage Whether to enable multi-page PDF recognition. If you enable this feature, multiple pages of a PDF file can be recognized, and the recognition results of a maximum of the first 30 pages can be returned. After you enable this feature, input parameters `EnablePdf` and `PdfPageNumber` are invalid. Default value: `false`.
     */
    public Boolean getEnableMultiplePage() {
        return this.EnableMultiplePage;
    }

    /**
     * Set Whether to enable multi-page PDF recognition. If you enable this feature, multiple pages of a PDF file can be recognized, and the recognition results of a maximum of the first 30 pages can be returned. After you enable this feature, input parameters `EnablePdf` and `PdfPageNumber` are invalid. Default value: `false`.
     * @param EnableMultiplePage Whether to enable multi-page PDF recognition. If you enable this feature, multiple pages of a PDF file can be recognized, and the recognition results of a maximum of the first 30 pages can be returned. After you enable this feature, input parameters `EnablePdf` and `PdfPageNumber` are invalid. Default value: `false`.
     */
    public void setEnableMultiplePage(Boolean EnableMultiplePage) {
        this.EnableMultiplePage = EnableMultiplePage;
    }

    /**
     * Get Whether to return the Base64-encoded value of the cropped image. Default value: `false`. 
     * @return EnableCutImage Whether to return the Base64-encoded value of the cropped image. Default value: `false`.
     */
    public Boolean getEnableCutImage() {
        return this.EnableCutImage;
    }

    /**
     * Set Whether to return the Base64-encoded value of the cropped image. Default value: `false`.
     * @param EnableCutImage Whether to return the Base64-encoded value of the cropped image. Default value: `false`.
     */
    public void setEnableCutImage(Boolean EnableCutImage) {
        this.EnableCutImage = EnableCutImage;
    }

    public RecognizeGeneralInvoiceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RecognizeGeneralInvoiceRequest(RecognizeGeneralInvoiceRequest source) {
        if (source.ImageBase64 != null) {
            this.ImageBase64 = new String(source.ImageBase64);
        }
        if (source.ImageUrl != null) {
            this.ImageUrl = new String(source.ImageUrl);
        }
        if (source.Types != null) {
            this.Types = new Long[source.Types.length];
            for (int i = 0; i < source.Types.length; i++) {
                this.Types[i] = new Long(source.Types[i]);
            }
        }
        if (source.EnableOther != null) {
            this.EnableOther = new Boolean(source.EnableOther);
        }
        if (source.EnablePdf != null) {
            this.EnablePdf = new Boolean(source.EnablePdf);
        }
        if (source.PdfPageNumber != null) {
            this.PdfPageNumber = new Long(source.PdfPageNumber);
        }
        if (source.EnableMultiplePage != null) {
            this.EnableMultiplePage = new Boolean(source.EnableMultiplePage);
        }
        if (source.EnableCutImage != null) {
            this.EnableCutImage = new Boolean(source.EnableCutImage);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ImageBase64", this.ImageBase64);
        this.setParamSimple(map, prefix + "ImageUrl", this.ImageUrl);
        this.setParamArraySimple(map, prefix + "Types.", this.Types);
        this.setParamSimple(map, prefix + "EnableOther", this.EnableOther);
        this.setParamSimple(map, prefix + "EnablePdf", this.EnablePdf);
        this.setParamSimple(map, prefix + "PdfPageNumber", this.PdfPageNumber);
        this.setParamSimple(map, prefix + "EnableMultiplePage", this.EnableMultiplePage);
        this.setParamSimple(map, prefix + "EnableCutImage", this.EnableCutImage);

    }
}

