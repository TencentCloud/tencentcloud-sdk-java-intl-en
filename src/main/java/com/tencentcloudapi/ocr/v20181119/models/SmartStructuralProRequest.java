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

public class SmartStructuralProRequest extends AbstractModel {

    /**
    * The URL of the image.
Supported image formats: PNG, JPG, and JPEG. GIF is currently not supported.
Supported image size: The downloaded image after Base64 encoding can be up to 7 MB. The download time of the image cannot exceed 3s.
We recommend that you store the image in Tencent Cloud for higher download speed and stability.
The download speed and stability of non-Tencent Cloud URLs may be low.
    */
    @SerializedName("ImageUrl")
    @Expose
    private String ImageUrl;

    /**
    * The Base64-encoded value of the image.
Supported image formats: PNG, JPG, and JPEG. GIF is currently not supported.
Supported image size: The downloaded image after Base64 encoding can be up to 7 MB. The download time of the image cannot exceed 3s.
Either `ImageUrl` or `ImageBase64` of the image must be provided. If both are provided, only `ImageUrl` is used.
    */
    @SerializedName("ImageBase64")
    @Expose
    private String ImageBase64;

    /**
    * The number of the PDF page that needs to be recognized. Only one single PDF page can be recognized. This parameter is valid if the uploaded file is a PDF `. Default value: `1`.
    */
    @SerializedName("PdfPageNumber")
    @Expose
    private Long PdfPageNumber;

    /**
    * The names of the fields you want to return for the structured information recognition.
For example, if you want to return only the recognition result of the "Name" and "Gender" fields, set this parameter as follows:
ItemNames=["Name","Gender"]
    */
    @SerializedName("ItemNames")
    @Expose
    private String [] ItemNames;

    /**
    * Whether to enable recognition of all fields.
    */
    @SerializedName("ReturnFullText")
    @Expose
    private Boolean ReturnFullText;

    /**
    * Configuration ID support: General 
-- General scenarios; InvoiceEng 
-- Ocean bill of lading, international invoice template; 
-- Ocean shipment order template; WayBillEng 
-- CustomsDeclaration
-- WeightNote
-- MedicalMeter
    */
    @SerializedName("ConfigId")
    @Expose
    private String ConfigId;

    /**
    * Enable recognition of coordinate values in full-text fields
    */
    @SerializedName("EnableCoord")
    @Expose
    private Boolean EnableCoord;

    /**
     * Get The URL of the image.
Supported image formats: PNG, JPG, and JPEG. GIF is currently not supported.
Supported image size: The downloaded image after Base64 encoding can be up to 7 MB. The download time of the image cannot exceed 3s.
We recommend that you store the image in Tencent Cloud for higher download speed and stability.
The download speed and stability of non-Tencent Cloud URLs may be low. 
     * @return ImageUrl The URL of the image.
Supported image formats: PNG, JPG, and JPEG. GIF is currently not supported.
Supported image size: The downloaded image after Base64 encoding can be up to 7 MB. The download time of the image cannot exceed 3s.
We recommend that you store the image in Tencent Cloud for higher download speed and stability.
The download speed and stability of non-Tencent Cloud URLs may be low.
     */
    public String getImageUrl() {
        return this.ImageUrl;
    }

    /**
     * Set The URL of the image.
Supported image formats: PNG, JPG, and JPEG. GIF is currently not supported.
Supported image size: The downloaded image after Base64 encoding can be up to 7 MB. The download time of the image cannot exceed 3s.
We recommend that you store the image in Tencent Cloud for higher download speed and stability.
The download speed and stability of non-Tencent Cloud URLs may be low.
     * @param ImageUrl The URL of the image.
Supported image formats: PNG, JPG, and JPEG. GIF is currently not supported.
Supported image size: The downloaded image after Base64 encoding can be up to 7 MB. The download time of the image cannot exceed 3s.
We recommend that you store the image in Tencent Cloud for higher download speed and stability.
The download speed and stability of non-Tencent Cloud URLs may be low.
     */
    public void setImageUrl(String ImageUrl) {
        this.ImageUrl = ImageUrl;
    }

    /**
     * Get The Base64-encoded value of the image.
Supported image formats: PNG, JPG, and JPEG. GIF is currently not supported.
Supported image size: The downloaded image after Base64 encoding can be up to 7 MB. The download time of the image cannot exceed 3s.
Either `ImageUrl` or `ImageBase64` of the image must be provided. If both are provided, only `ImageUrl` is used. 
     * @return ImageBase64 The Base64-encoded value of the image.
Supported image formats: PNG, JPG, and JPEG. GIF is currently not supported.
Supported image size: The downloaded image after Base64 encoding can be up to 7 MB. The download time of the image cannot exceed 3s.
Either `ImageUrl` or `ImageBase64` of the image must be provided. If both are provided, only `ImageUrl` is used.
     */
    public String getImageBase64() {
        return this.ImageBase64;
    }

    /**
     * Set The Base64-encoded value of the image.
Supported image formats: PNG, JPG, and JPEG. GIF is currently not supported.
Supported image size: The downloaded image after Base64 encoding can be up to 7 MB. The download time of the image cannot exceed 3s.
Either `ImageUrl` or `ImageBase64` of the image must be provided. If both are provided, only `ImageUrl` is used.
     * @param ImageBase64 The Base64-encoded value of the image.
Supported image formats: PNG, JPG, and JPEG. GIF is currently not supported.
Supported image size: The downloaded image after Base64 encoding can be up to 7 MB. The download time of the image cannot exceed 3s.
Either `ImageUrl` or `ImageBase64` of the image must be provided. If both are provided, only `ImageUrl` is used.
     */
    public void setImageBase64(String ImageBase64) {
        this.ImageBase64 = ImageBase64;
    }

    /**
     * Get The number of the PDF page that needs to be recognized. Only one single PDF page can be recognized. This parameter is valid if the uploaded file is a PDF `. Default value: `1`. 
     * @return PdfPageNumber The number of the PDF page that needs to be recognized. Only one single PDF page can be recognized. This parameter is valid if the uploaded file is a PDF `. Default value: `1`.
     */
    public Long getPdfPageNumber() {
        return this.PdfPageNumber;
    }

    /**
     * Set The number of the PDF page that needs to be recognized. Only one single PDF page can be recognized. This parameter is valid if the uploaded file is a PDF `. Default value: `1`.
     * @param PdfPageNumber The number of the PDF page that needs to be recognized. Only one single PDF page can be recognized. This parameter is valid if the uploaded file is a PDF `. Default value: `1`.
     */
    public void setPdfPageNumber(Long PdfPageNumber) {
        this.PdfPageNumber = PdfPageNumber;
    }

    /**
     * Get The names of the fields you want to return for the structured information recognition.
For example, if you want to return only the recognition result of the "Name" and "Gender" fields, set this parameter as follows:
ItemNames=["Name","Gender"] 
     * @return ItemNames The names of the fields you want to return for the structured information recognition.
For example, if you want to return only the recognition result of the "Name" and "Gender" fields, set this parameter as follows:
ItemNames=["Name","Gender"]
     */
    public String [] getItemNames() {
        return this.ItemNames;
    }

    /**
     * Set The names of the fields you want to return for the structured information recognition.
For example, if you want to return only the recognition result of the "Name" and "Gender" fields, set this parameter as follows:
ItemNames=["Name","Gender"]
     * @param ItemNames The names of the fields you want to return for the structured information recognition.
For example, if you want to return only the recognition result of the "Name" and "Gender" fields, set this parameter as follows:
ItemNames=["Name","Gender"]
     */
    public void setItemNames(String [] ItemNames) {
        this.ItemNames = ItemNames;
    }

    /**
     * Get Whether to enable recognition of all fields. 
     * @return ReturnFullText Whether to enable recognition of all fields.
     */
    public Boolean getReturnFullText() {
        return this.ReturnFullText;
    }

    /**
     * Set Whether to enable recognition of all fields.
     * @param ReturnFullText Whether to enable recognition of all fields.
     */
    public void setReturnFullText(Boolean ReturnFullText) {
        this.ReturnFullText = ReturnFullText;
    }

    /**
     * Get Configuration ID support: General 
-- General scenarios; InvoiceEng 
-- Ocean bill of lading, international invoice template; 
-- Ocean shipment order template; WayBillEng 
-- CustomsDeclaration
-- WeightNote
-- MedicalMeter 
     * @return ConfigId Configuration ID support: General 
-- General scenarios; InvoiceEng 
-- Ocean bill of lading, international invoice template; 
-- Ocean shipment order template; WayBillEng 
-- CustomsDeclaration
-- WeightNote
-- MedicalMeter
     */
    public String getConfigId() {
        return this.ConfigId;
    }

    /**
     * Set Configuration ID support: General 
-- General scenarios; InvoiceEng 
-- Ocean bill of lading, international invoice template; 
-- Ocean shipment order template; WayBillEng 
-- CustomsDeclaration
-- WeightNote
-- MedicalMeter
     * @param ConfigId Configuration ID support: General 
-- General scenarios; InvoiceEng 
-- Ocean bill of lading, international invoice template; 
-- Ocean shipment order template; WayBillEng 
-- CustomsDeclaration
-- WeightNote
-- MedicalMeter
     */
    public void setConfigId(String ConfigId) {
        this.ConfigId = ConfigId;
    }

    /**
     * Get Enable recognition of coordinate values in full-text fields 
     * @return EnableCoord Enable recognition of coordinate values in full-text fields
     */
    public Boolean getEnableCoord() {
        return this.EnableCoord;
    }

    /**
     * Set Enable recognition of coordinate values in full-text fields
     * @param EnableCoord Enable recognition of coordinate values in full-text fields
     */
    public void setEnableCoord(Boolean EnableCoord) {
        this.EnableCoord = EnableCoord;
    }

    public SmartStructuralProRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SmartStructuralProRequest(SmartStructuralProRequest source) {
        if (source.ImageUrl != null) {
            this.ImageUrl = new String(source.ImageUrl);
        }
        if (source.ImageBase64 != null) {
            this.ImageBase64 = new String(source.ImageBase64);
        }
        if (source.PdfPageNumber != null) {
            this.PdfPageNumber = new Long(source.PdfPageNumber);
        }
        if (source.ItemNames != null) {
            this.ItemNames = new String[source.ItemNames.length];
            for (int i = 0; i < source.ItemNames.length; i++) {
                this.ItemNames[i] = new String(source.ItemNames[i]);
            }
        }
        if (source.ReturnFullText != null) {
            this.ReturnFullText = new Boolean(source.ReturnFullText);
        }
        if (source.ConfigId != null) {
            this.ConfigId = new String(source.ConfigId);
        }
        if (source.EnableCoord != null) {
            this.EnableCoord = new Boolean(source.EnableCoord);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ImageUrl", this.ImageUrl);
        this.setParamSimple(map, prefix + "ImageBase64", this.ImageBase64);
        this.setParamSimple(map, prefix + "PdfPageNumber", this.PdfPageNumber);
        this.setParamArraySimple(map, prefix + "ItemNames.", this.ItemNames);
        this.setParamSimple(map, prefix + "ReturnFullText", this.ReturnFullText);
        this.setParamSimple(map, prefix + "ConfigId", this.ConfigId);
        this.setParamSimple(map, prefix + "EnableCoord", this.EnableCoord);

    }
}

