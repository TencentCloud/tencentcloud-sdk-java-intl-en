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

public class ExtractDocMultiRequest extends AbstractModel {

    /**
    * The Url address of the image. supported image formats: PNG, JPG, JPEG, WORD, EXCEL. GIF format is not currently supported. supported image size: no more than 10M after Base64 encoding. image download time should not exceed 3 seconds. supported image pixels: between 20-10000px. images stored in tencent cloud's Url ensure higher download speed and stability. it is recommended to store images in tencent cloud. the speed and stability of non-tencent cloud storage urls may be impacted.
    */
    @SerializedName("ImageUrl")
    @Expose
    private String ImageUrl;

    /**
    * The Base64 value of the image. supported image formats: PNG, JPG, JPEG, WORD, EXCEL. GIF format is not currently supported. supported image size: no more than 10M after encoding the downloaded image with Base64. image download time: no more than 3 seconds. supported image pixels: between 20-10000px. either ImageUrl or ImageBase64 must be provided. if both are provided, only use ImageUrl.
    */
    @SerializedName("ImageBase64")
    @Expose
    private String ImageBase64;

    /**
    * Specifies the page number of the PDF to be recognized. only single page recognition is supported. valid when uploading a PDF file with the IsPdf parameter set to true. default value is the first 3 pages.
    */
    @SerializedName("PdfPageNumber")
    @Expose
    private Long PdfPageNumber;

    /**
    * Specifies the field names to be returned by the customized structuring feature. for example, if the customer wants to add the recognition result of two fields, name and gender, manually input ItemNames=["name","gender"].
    */
    @SerializedName("ItemNames")
    @Expose
    private String [] ItemNames;

    /**
    * true: only custom field.
False: default value field + custom field.
Default true.
    */
    @SerializedName("ItemNamesShowMode")
    @Expose
    private Boolean ItemNamesShowMode;

    /**
    * Whether the full-text field recognition is enabled.
    */
    @SerializedName("ReturnFullText")
    @Expose
    private Boolean ReturnFullText;

    /**
    * Configuration ID support: 
-- General
-- InvoiceEng
-- WayBillEng
-- CustomsDeclaration
-- WeightNote
-- MedicalMeter
-- BillOfLading
-- EntrustmentBook
-- Statement
-- BookingConfirmation
-- AirWayBill
-- Table
-- SteelLabel
-- CarInsurance
-- MultiRealEstateCertificate
-- MultiRealEstateMaterial
-- HongKongUtilityBill
    */
    @SerializedName("ConfigId")
    @Expose
    private String ConfigId;

    /**
    * Whether the full-text field coordinate value recognition is enabled.
    */
    @SerializedName("EnableCoord")
    @Expose
    private Boolean EnableCoord;

    /**
    * Whether parent-child key recognition is enabled. the option is selected by default.
    */
    @SerializedName("OutputParentKey")
    @Expose
    private Boolean OutputParentKey;

    /**
    * Single attribute configuration of a template.
    */
    @SerializedName("ConfigAdvanced")
    @Expose
    private ConfigAdvanced ConfigAdvanced;

    /**
    * When cn, the added key is chinese.  
When set to en, the added key is english.
    */
    @SerializedName("OutputLanguage")
    @Expose
    private String OutputLanguage;

    /**
     * Get The Url address of the image. supported image formats: PNG, JPG, JPEG, WORD, EXCEL. GIF format is not currently supported. supported image size: no more than 10M after Base64 encoding. image download time should not exceed 3 seconds. supported image pixels: between 20-10000px. images stored in tencent cloud's Url ensure higher download speed and stability. it is recommended to store images in tencent cloud. the speed and stability of non-tencent cloud storage urls may be impacted. 
     * @return ImageUrl The Url address of the image. supported image formats: PNG, JPG, JPEG, WORD, EXCEL. GIF format is not currently supported. supported image size: no more than 10M after Base64 encoding. image download time should not exceed 3 seconds. supported image pixels: between 20-10000px. images stored in tencent cloud's Url ensure higher download speed and stability. it is recommended to store images in tencent cloud. the speed and stability of non-tencent cloud storage urls may be impacted.
     */
    public String getImageUrl() {
        return this.ImageUrl;
    }

    /**
     * Set The Url address of the image. supported image formats: PNG, JPG, JPEG, WORD, EXCEL. GIF format is not currently supported. supported image size: no more than 10M after Base64 encoding. image download time should not exceed 3 seconds. supported image pixels: between 20-10000px. images stored in tencent cloud's Url ensure higher download speed and stability. it is recommended to store images in tencent cloud. the speed and stability of non-tencent cloud storage urls may be impacted.
     * @param ImageUrl The Url address of the image. supported image formats: PNG, JPG, JPEG, WORD, EXCEL. GIF format is not currently supported. supported image size: no more than 10M after Base64 encoding. image download time should not exceed 3 seconds. supported image pixels: between 20-10000px. images stored in tencent cloud's Url ensure higher download speed and stability. it is recommended to store images in tencent cloud. the speed and stability of non-tencent cloud storage urls may be impacted.
     */
    public void setImageUrl(String ImageUrl) {
        this.ImageUrl = ImageUrl;
    }

    /**
     * Get The Base64 value of the image. supported image formats: PNG, JPG, JPEG, WORD, EXCEL. GIF format is not currently supported. supported image size: no more than 10M after encoding the downloaded image with Base64. image download time: no more than 3 seconds. supported image pixels: between 20-10000px. either ImageUrl or ImageBase64 must be provided. if both are provided, only use ImageUrl. 
     * @return ImageBase64 The Base64 value of the image. supported image formats: PNG, JPG, JPEG, WORD, EXCEL. GIF format is not currently supported. supported image size: no more than 10M after encoding the downloaded image with Base64. image download time: no more than 3 seconds. supported image pixels: between 20-10000px. either ImageUrl or ImageBase64 must be provided. if both are provided, only use ImageUrl.
     */
    public String getImageBase64() {
        return this.ImageBase64;
    }

    /**
     * Set The Base64 value of the image. supported image formats: PNG, JPG, JPEG, WORD, EXCEL. GIF format is not currently supported. supported image size: no more than 10M after encoding the downloaded image with Base64. image download time: no more than 3 seconds. supported image pixels: between 20-10000px. either ImageUrl or ImageBase64 must be provided. if both are provided, only use ImageUrl.
     * @param ImageBase64 The Base64 value of the image. supported image formats: PNG, JPG, JPEG, WORD, EXCEL. GIF format is not currently supported. supported image size: no more than 10M after encoding the downloaded image with Base64. image download time: no more than 3 seconds. supported image pixels: between 20-10000px. either ImageUrl or ImageBase64 must be provided. if both are provided, only use ImageUrl.
     */
    public void setImageBase64(String ImageBase64) {
        this.ImageBase64 = ImageBase64;
    }

    /**
     * Get Specifies the page number of the PDF to be recognized. only single page recognition is supported. valid when uploading a PDF file with the IsPdf parameter set to true. default value is the first 3 pages. 
     * @return PdfPageNumber Specifies the page number of the PDF to be recognized. only single page recognition is supported. valid when uploading a PDF file with the IsPdf parameter set to true. default value is the first 3 pages.
     */
    public Long getPdfPageNumber() {
        return this.PdfPageNumber;
    }

    /**
     * Set Specifies the page number of the PDF to be recognized. only single page recognition is supported. valid when uploading a PDF file with the IsPdf parameter set to true. default value is the first 3 pages.
     * @param PdfPageNumber Specifies the page number of the PDF to be recognized. only single page recognition is supported. valid when uploading a PDF file with the IsPdf parameter set to true. default value is the first 3 pages.
     */
    public void setPdfPageNumber(Long PdfPageNumber) {
        this.PdfPageNumber = PdfPageNumber;
    }

    /**
     * Get Specifies the field names to be returned by the customized structuring feature. for example, if the customer wants to add the recognition result of two fields, name and gender, manually input ItemNames=["name","gender"]. 
     * @return ItemNames Specifies the field names to be returned by the customized structuring feature. for example, if the customer wants to add the recognition result of two fields, name and gender, manually input ItemNames=["name","gender"].
     */
    public String [] getItemNames() {
        return this.ItemNames;
    }

    /**
     * Set Specifies the field names to be returned by the customized structuring feature. for example, if the customer wants to add the recognition result of two fields, name and gender, manually input ItemNames=["name","gender"].
     * @param ItemNames Specifies the field names to be returned by the customized structuring feature. for example, if the customer wants to add the recognition result of two fields, name and gender, manually input ItemNames=["name","gender"].
     */
    public void setItemNames(String [] ItemNames) {
        this.ItemNames = ItemNames;
    }

    /**
     * Get true: only custom field.
False: default value field + custom field.
Default true. 
     * @return ItemNamesShowMode true: only custom field.
False: default value field + custom field.
Default true.
     */
    public Boolean getItemNamesShowMode() {
        return this.ItemNamesShowMode;
    }

    /**
     * Set true: only custom field.
False: default value field + custom field.
Default true.
     * @param ItemNamesShowMode true: only custom field.
False: default value field + custom field.
Default true.
     */
    public void setItemNamesShowMode(Boolean ItemNamesShowMode) {
        this.ItemNamesShowMode = ItemNamesShowMode;
    }

    /**
     * Get Whether the full-text field recognition is enabled. 
     * @return ReturnFullText Whether the full-text field recognition is enabled.
     */
    public Boolean getReturnFullText() {
        return this.ReturnFullText;
    }

    /**
     * Set Whether the full-text field recognition is enabled.
     * @param ReturnFullText Whether the full-text field recognition is enabled.
     */
    public void setReturnFullText(Boolean ReturnFullText) {
        this.ReturnFullText = ReturnFullText;
    }

    /**
     * Get Configuration ID support: 
-- General
-- InvoiceEng
-- WayBillEng
-- CustomsDeclaration
-- WeightNote
-- MedicalMeter
-- BillOfLading
-- EntrustmentBook
-- Statement
-- BookingConfirmation
-- AirWayBill
-- Table
-- SteelLabel
-- CarInsurance
-- MultiRealEstateCertificate
-- MultiRealEstateMaterial
-- HongKongUtilityBill 
     * @return ConfigId Configuration ID support: 
-- General
-- InvoiceEng
-- WayBillEng
-- CustomsDeclaration
-- WeightNote
-- MedicalMeter
-- BillOfLading
-- EntrustmentBook
-- Statement
-- BookingConfirmation
-- AirWayBill
-- Table
-- SteelLabel
-- CarInsurance
-- MultiRealEstateCertificate
-- MultiRealEstateMaterial
-- HongKongUtilityBill
     */
    public String getConfigId() {
        return this.ConfigId;
    }

    /**
     * Set Configuration ID support: 
-- General
-- InvoiceEng
-- WayBillEng
-- CustomsDeclaration
-- WeightNote
-- MedicalMeter
-- BillOfLading
-- EntrustmentBook
-- Statement
-- BookingConfirmation
-- AirWayBill
-- Table
-- SteelLabel
-- CarInsurance
-- MultiRealEstateCertificate
-- MultiRealEstateMaterial
-- HongKongUtilityBill
     * @param ConfigId Configuration ID support: 
-- General
-- InvoiceEng
-- WayBillEng
-- CustomsDeclaration
-- WeightNote
-- MedicalMeter
-- BillOfLading
-- EntrustmentBook
-- Statement
-- BookingConfirmation
-- AirWayBill
-- Table
-- SteelLabel
-- CarInsurance
-- MultiRealEstateCertificate
-- MultiRealEstateMaterial
-- HongKongUtilityBill
     */
    public void setConfigId(String ConfigId) {
        this.ConfigId = ConfigId;
    }

    /**
     * Get Whether the full-text field coordinate value recognition is enabled. 
     * @return EnableCoord Whether the full-text field coordinate value recognition is enabled.
     */
    public Boolean getEnableCoord() {
        return this.EnableCoord;
    }

    /**
     * Set Whether the full-text field coordinate value recognition is enabled.
     * @param EnableCoord Whether the full-text field coordinate value recognition is enabled.
     */
    public void setEnableCoord(Boolean EnableCoord) {
        this.EnableCoord = EnableCoord;
    }

    /**
     * Get Whether parent-child key recognition is enabled. the option is selected by default. 
     * @return OutputParentKey Whether parent-child key recognition is enabled. the option is selected by default.
     */
    public Boolean getOutputParentKey() {
        return this.OutputParentKey;
    }

    /**
     * Set Whether parent-child key recognition is enabled. the option is selected by default.
     * @param OutputParentKey Whether parent-child key recognition is enabled. the option is selected by default.
     */
    public void setOutputParentKey(Boolean OutputParentKey) {
        this.OutputParentKey = OutputParentKey;
    }

    /**
     * Get Single attribute configuration of a template. 
     * @return ConfigAdvanced Single attribute configuration of a template.
     */
    public ConfigAdvanced getConfigAdvanced() {
        return this.ConfigAdvanced;
    }

    /**
     * Set Single attribute configuration of a template.
     * @param ConfigAdvanced Single attribute configuration of a template.
     */
    public void setConfigAdvanced(ConfigAdvanced ConfigAdvanced) {
        this.ConfigAdvanced = ConfigAdvanced;
    }

    /**
     * Get When cn, the added key is chinese.  
When set to en, the added key is english. 
     * @return OutputLanguage When cn, the added key is chinese.  
When set to en, the added key is english.
     */
    public String getOutputLanguage() {
        return this.OutputLanguage;
    }

    /**
     * Set When cn, the added key is chinese.  
When set to en, the added key is english.
     * @param OutputLanguage When cn, the added key is chinese.  
When set to en, the added key is english.
     */
    public void setOutputLanguage(String OutputLanguage) {
        this.OutputLanguage = OutputLanguage;
    }

    public ExtractDocMultiRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExtractDocMultiRequest(ExtractDocMultiRequest source) {
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
        if (source.ItemNamesShowMode != null) {
            this.ItemNamesShowMode = new Boolean(source.ItemNamesShowMode);
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
        if (source.OutputParentKey != null) {
            this.OutputParentKey = new Boolean(source.OutputParentKey);
        }
        if (source.ConfigAdvanced != null) {
            this.ConfigAdvanced = new ConfigAdvanced(source.ConfigAdvanced);
        }
        if (source.OutputLanguage != null) {
            this.OutputLanguage = new String(source.OutputLanguage);
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
        this.setParamSimple(map, prefix + "ItemNamesShowMode", this.ItemNamesShowMode);
        this.setParamSimple(map, prefix + "ReturnFullText", this.ReturnFullText);
        this.setParamSimple(map, prefix + "ConfigId", this.ConfigId);
        this.setParamSimple(map, prefix + "EnableCoord", this.EnableCoord);
        this.setParamSimple(map, prefix + "OutputParentKey", this.OutputParentKey);
        this.setParamObj(map, prefix + "ConfigAdvanced.", this.ConfigAdvanced);
        this.setParamSimple(map, prefix + "OutputLanguage", this.OutputLanguage);

    }
}

