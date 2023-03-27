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
package com.tencentcloudapi.ims.v20201229.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ImageModerationResponse extends AbstractModel{

    /**
    * This field is used to return the operation suggestion for the `Label` tag. When you get the determination result, the returned value indicates the operation suggested by the system. We recommend you handle different types of violations and suggestions according to your business needs. <br>Returned values: **Block**, **Review**, **Pass**.
    */
    @SerializedName("Suggestion")
    @Expose
    private String Suggestion;

    /**
    * This field is used to return the **maliciousness tag with the highest priority** in the detection result (LabelResults), which represents the moderation result suggested by the model. We recommend you handle different types of violations and suggestions according to your business needs. <br>Returned values: **Normal**: normal; **Porn**: pornographic; **Abuse**: abusive; **Ad**: advertising; **Custom**: custom type of non-compliant content and other offensive, unsafe, or inappropriate types of content.
    */
    @SerializedName("Label")
    @Expose
    private String Label;

    /**
    * This field is used to return the subtag name under the maliciousness tag with the highest priority hit by the detection result, such as *Porn-SexBehavior*. If no subtag is hit, an empty string will be returned.
    */
    @SerializedName("SubLabel")
    @Expose
    private String SubLabel;

    /**
    * Confidence score of the under the current label. Value range: 0 (**the lowest confidence**) to 100 (**the highest confidence**). For example, *Porn 99* indicates that the image is highly likely to be pornographic, while *Porn 0* indicates that the image is not pornographic.
    */
    @SerializedName("Score")
    @Expose
    private Long Score;

    /**
    * This field is used to return the detailed recognition result for the maliciousness tag hit by the categorization model, such as porn, advertising, or any other offensive, unsafe, or inappropriate type of content.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("LabelResults")
    @Expose
    private LabelResult [] LabelResults;

    /**
    * This field is used to return the detailed detection result of the object detection model, including the tag name hit by the content such as object, advertising logo, or QR code, tag score, coordinate information, scenario recognition result, and operation suggestion. For more information on the returned value, see the description of the `ObjectResults` data structure.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ObjectResults")
    @Expose
    private ObjectResult [] ObjectResults;

    /**
    * This field is used to return the detailed text OCR result, including the text coordinate information, text recognition result, and operation suggestion. For more information on the returned value, see the description of the `OcrResults` data structure.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("OcrResults")
    @Expose
    private OcrResult [] OcrResults;

    /**
    * This field is used to return the result of recognition based on image risk libraries (blocklist and allowlist). For more information on the returned value, see the description of the `LibResults` data structure.<br>Note: currently, **you cannot customize image risk libraries**.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("LibResults")
    @Expose
    private LibResult [] LibResults;

    /**
    * This field is used to return the `DataId` in the request parameters that correspond to the detected object.
    */
    @SerializedName("DataId")
    @Expose
    private String DataId;

    /**
    * This field is used to return the `BizType` in the request parameters that correspond to the detected object.
    */
    @SerializedName("BizType")
    @Expose
    private String BizType;

    /**
    * This field is used to return the additional information (Extra) configured based on your needs. If it is not configured, an empty value will be returned by default.<br>Note: the returned information varies by customer or `Biztype`. If you need to configure this field, submit a ticket or contact the aftersales service for assistance.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Extra")
    @Expose
    private String Extra;

    /**
    * This field is used to return the MD5 checksum of the detected object for easier verification of the file integrity.
    */
    @SerializedName("FileMD5")
    @Expose
    private String FileMD5;

    /**
    * Image recognition result, including the hit tags, confidence and location.
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("RecognitionResults")
    @Expose
    private RecognitionResult [] RecognitionResults;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get This field is used to return the operation suggestion for the `Label` tag. When you get the determination result, the returned value indicates the operation suggested by the system. We recommend you handle different types of violations and suggestions according to your business needs. <br>Returned values: **Block**, **Review**, **Pass**. 
     * @return Suggestion This field is used to return the operation suggestion for the `Label` tag. When you get the determination result, the returned value indicates the operation suggested by the system. We recommend you handle different types of violations and suggestions according to your business needs. <br>Returned values: **Block**, **Review**, **Pass**.
     */
    public String getSuggestion() {
        return this.Suggestion;
    }

    /**
     * Set This field is used to return the operation suggestion for the `Label` tag. When you get the determination result, the returned value indicates the operation suggested by the system. We recommend you handle different types of violations and suggestions according to your business needs. <br>Returned values: **Block**, **Review**, **Pass**.
     * @param Suggestion This field is used to return the operation suggestion for the `Label` tag. When you get the determination result, the returned value indicates the operation suggested by the system. We recommend you handle different types of violations and suggestions according to your business needs. <br>Returned values: **Block**, **Review**, **Pass**.
     */
    public void setSuggestion(String Suggestion) {
        this.Suggestion = Suggestion;
    }

    /**
     * Get This field is used to return the **maliciousness tag with the highest priority** in the detection result (LabelResults), which represents the moderation result suggested by the model. We recommend you handle different types of violations and suggestions according to your business needs. <br>Returned values: **Normal**: normal; **Porn**: pornographic; **Abuse**: abusive; **Ad**: advertising; **Custom**: custom type of non-compliant content and other offensive, unsafe, or inappropriate types of content. 
     * @return Label This field is used to return the **maliciousness tag with the highest priority** in the detection result (LabelResults), which represents the moderation result suggested by the model. We recommend you handle different types of violations and suggestions according to your business needs. <br>Returned values: **Normal**: normal; **Porn**: pornographic; **Abuse**: abusive; **Ad**: advertising; **Custom**: custom type of non-compliant content and other offensive, unsafe, or inappropriate types of content.
     */
    public String getLabel() {
        return this.Label;
    }

    /**
     * Set This field is used to return the **maliciousness tag with the highest priority** in the detection result (LabelResults), which represents the moderation result suggested by the model. We recommend you handle different types of violations and suggestions according to your business needs. <br>Returned values: **Normal**: normal; **Porn**: pornographic; **Abuse**: abusive; **Ad**: advertising; **Custom**: custom type of non-compliant content and other offensive, unsafe, or inappropriate types of content.
     * @param Label This field is used to return the **maliciousness tag with the highest priority** in the detection result (LabelResults), which represents the moderation result suggested by the model. We recommend you handle different types of violations and suggestions according to your business needs. <br>Returned values: **Normal**: normal; **Porn**: pornographic; **Abuse**: abusive; **Ad**: advertising; **Custom**: custom type of non-compliant content and other offensive, unsafe, or inappropriate types of content.
     */
    public void setLabel(String Label) {
        this.Label = Label;
    }

    /**
     * Get This field is used to return the subtag name under the maliciousness tag with the highest priority hit by the detection result, such as *Porn-SexBehavior*. If no subtag is hit, an empty string will be returned. 
     * @return SubLabel This field is used to return the subtag name under the maliciousness tag with the highest priority hit by the detection result, such as *Porn-SexBehavior*. If no subtag is hit, an empty string will be returned.
     */
    public String getSubLabel() {
        return this.SubLabel;
    }

    /**
     * Set This field is used to return the subtag name under the maliciousness tag with the highest priority hit by the detection result, such as *Porn-SexBehavior*. If no subtag is hit, an empty string will be returned.
     * @param SubLabel This field is used to return the subtag name under the maliciousness tag with the highest priority hit by the detection result, such as *Porn-SexBehavior*. If no subtag is hit, an empty string will be returned.
     */
    public void setSubLabel(String SubLabel) {
        this.SubLabel = SubLabel;
    }

    /**
     * Get Confidence score of the under the current label. Value range: 0 (**the lowest confidence**) to 100 (**the highest confidence**). For example, *Porn 99* indicates that the image is highly likely to be pornographic, while *Porn 0* indicates that the image is not pornographic. 
     * @return Score Confidence score of the under the current label. Value range: 0 (**the lowest confidence**) to 100 (**the highest confidence**). For example, *Porn 99* indicates that the image is highly likely to be pornographic, while *Porn 0* indicates that the image is not pornographic.
     */
    public Long getScore() {
        return this.Score;
    }

    /**
     * Set Confidence score of the under the current label. Value range: 0 (**the lowest confidence**) to 100 (**the highest confidence**). For example, *Porn 99* indicates that the image is highly likely to be pornographic, while *Porn 0* indicates that the image is not pornographic.
     * @param Score Confidence score of the under the current label. Value range: 0 (**the lowest confidence**) to 100 (**the highest confidence**). For example, *Porn 99* indicates that the image is highly likely to be pornographic, while *Porn 0* indicates that the image is not pornographic.
     */
    public void setScore(Long Score) {
        this.Score = Score;
    }

    /**
     * Get This field is used to return the detailed recognition result for the maliciousness tag hit by the categorization model, such as porn, advertising, or any other offensive, unsafe, or inappropriate type of content.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return LabelResults This field is used to return the detailed recognition result for the maliciousness tag hit by the categorization model, such as porn, advertising, or any other offensive, unsafe, or inappropriate type of content.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public LabelResult [] getLabelResults() {
        return this.LabelResults;
    }

    /**
     * Set This field is used to return the detailed recognition result for the maliciousness tag hit by the categorization model, such as porn, advertising, or any other offensive, unsafe, or inappropriate type of content.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param LabelResults This field is used to return the detailed recognition result for the maliciousness tag hit by the categorization model, such as porn, advertising, or any other offensive, unsafe, or inappropriate type of content.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setLabelResults(LabelResult [] LabelResults) {
        this.LabelResults = LabelResults;
    }

    /**
     * Get This field is used to return the detailed detection result of the object detection model, including the tag name hit by the content such as object, advertising logo, or QR code, tag score, coordinate information, scenario recognition result, and operation suggestion. For more information on the returned value, see the description of the `ObjectResults` data structure.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ObjectResults This field is used to return the detailed detection result of the object detection model, including the tag name hit by the content such as object, advertising logo, or QR code, tag score, coordinate information, scenario recognition result, and operation suggestion. For more information on the returned value, see the description of the `ObjectResults` data structure.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public ObjectResult [] getObjectResults() {
        return this.ObjectResults;
    }

    /**
     * Set This field is used to return the detailed detection result of the object detection model, including the tag name hit by the content such as object, advertising logo, or QR code, tag score, coordinate information, scenario recognition result, and operation suggestion. For more information on the returned value, see the description of the `ObjectResults` data structure.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ObjectResults This field is used to return the detailed detection result of the object detection model, including the tag name hit by the content such as object, advertising logo, or QR code, tag score, coordinate information, scenario recognition result, and operation suggestion. For more information on the returned value, see the description of the `ObjectResults` data structure.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setObjectResults(ObjectResult [] ObjectResults) {
        this.ObjectResults = ObjectResults;
    }

    /**
     * Get This field is used to return the detailed text OCR result, including the text coordinate information, text recognition result, and operation suggestion. For more information on the returned value, see the description of the `OcrResults` data structure.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return OcrResults This field is used to return the detailed text OCR result, including the text coordinate information, text recognition result, and operation suggestion. For more information on the returned value, see the description of the `OcrResults` data structure.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public OcrResult [] getOcrResults() {
        return this.OcrResults;
    }

    /**
     * Set This field is used to return the detailed text OCR result, including the text coordinate information, text recognition result, and operation suggestion. For more information on the returned value, see the description of the `OcrResults` data structure.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param OcrResults This field is used to return the detailed text OCR result, including the text coordinate information, text recognition result, and operation suggestion. For more information on the returned value, see the description of the `OcrResults` data structure.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setOcrResults(OcrResult [] OcrResults) {
        this.OcrResults = OcrResults;
    }

    /**
     * Get This field is used to return the result of recognition based on image risk libraries (blocklist and allowlist). For more information on the returned value, see the description of the `LibResults` data structure.<br>Note: currently, **you cannot customize image risk libraries**.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return LibResults This field is used to return the result of recognition based on image risk libraries (blocklist and allowlist). For more information on the returned value, see the description of the `LibResults` data structure.<br>Note: currently, **you cannot customize image risk libraries**.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public LibResult [] getLibResults() {
        return this.LibResults;
    }

    /**
     * Set This field is used to return the result of recognition based on image risk libraries (blocklist and allowlist). For more information on the returned value, see the description of the `LibResults` data structure.<br>Note: currently, **you cannot customize image risk libraries**.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param LibResults This field is used to return the result of recognition based on image risk libraries (blocklist and allowlist). For more information on the returned value, see the description of the `LibResults` data structure.<br>Note: currently, **you cannot customize image risk libraries**.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setLibResults(LibResult [] LibResults) {
        this.LibResults = LibResults;
    }

    /**
     * Get This field is used to return the `DataId` in the request parameters that correspond to the detected object. 
     * @return DataId This field is used to return the `DataId` in the request parameters that correspond to the detected object.
     */
    public String getDataId() {
        return this.DataId;
    }

    /**
     * Set This field is used to return the `DataId` in the request parameters that correspond to the detected object.
     * @param DataId This field is used to return the `DataId` in the request parameters that correspond to the detected object.
     */
    public void setDataId(String DataId) {
        this.DataId = DataId;
    }

    /**
     * Get This field is used to return the `BizType` in the request parameters that correspond to the detected object. 
     * @return BizType This field is used to return the `BizType` in the request parameters that correspond to the detected object.
     */
    public String getBizType() {
        return this.BizType;
    }

    /**
     * Set This field is used to return the `BizType` in the request parameters that correspond to the detected object.
     * @param BizType This field is used to return the `BizType` in the request parameters that correspond to the detected object.
     */
    public void setBizType(String BizType) {
        this.BizType = BizType;
    }

    /**
     * Get This field is used to return the additional information (Extra) configured based on your needs. If it is not configured, an empty value will be returned by default.<br>Note: the returned information varies by customer or `Biztype`. If you need to configure this field, submit a ticket or contact the aftersales service for assistance.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Extra This field is used to return the additional information (Extra) configured based on your needs. If it is not configured, an empty value will be returned by default.<br>Note: the returned information varies by customer or `Biztype`. If you need to configure this field, submit a ticket or contact the aftersales service for assistance.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getExtra() {
        return this.Extra;
    }

    /**
     * Set This field is used to return the additional information (Extra) configured based on your needs. If it is not configured, an empty value will be returned by default.<br>Note: the returned information varies by customer or `Biztype`. If you need to configure this field, submit a ticket or contact the aftersales service for assistance.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Extra This field is used to return the additional information (Extra) configured based on your needs. If it is not configured, an empty value will be returned by default.<br>Note: the returned information varies by customer or `Biztype`. If you need to configure this field, submit a ticket or contact the aftersales service for assistance.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setExtra(String Extra) {
        this.Extra = Extra;
    }

    /**
     * Get This field is used to return the MD5 checksum of the detected object for easier verification of the file integrity. 
     * @return FileMD5 This field is used to return the MD5 checksum of the detected object for easier verification of the file integrity.
     */
    public String getFileMD5() {
        return this.FileMD5;
    }

    /**
     * Set This field is used to return the MD5 checksum of the detected object for easier verification of the file integrity.
     * @param FileMD5 This field is used to return the MD5 checksum of the detected object for easier verification of the file integrity.
     */
    public void setFileMD5(String FileMD5) {
        this.FileMD5 = FileMD5;
    }

    /**
     * Get Image recognition result, including the hit tags, confidence and location.
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return RecognitionResults Image recognition result, including the hit tags, confidence and location.
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public RecognitionResult [] getRecognitionResults() {
        return this.RecognitionResults;
    }

    /**
     * Set Image recognition result, including the hit tags, confidence and location.
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param RecognitionResults Image recognition result, including the hit tags, confidence and location.
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setRecognitionResults(RecognitionResult [] RecognitionResults) {
        this.RecognitionResults = RecognitionResults;
    }

    /**
     * Get The unique request ID, which is returned for each request. RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     * @param RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public ImageModerationResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImageModerationResponse(ImageModerationResponse source) {
        if (source.Suggestion != null) {
            this.Suggestion = new String(source.Suggestion);
        }
        if (source.Label != null) {
            this.Label = new String(source.Label);
        }
        if (source.SubLabel != null) {
            this.SubLabel = new String(source.SubLabel);
        }
        if (source.Score != null) {
            this.Score = new Long(source.Score);
        }
        if (source.LabelResults != null) {
            this.LabelResults = new LabelResult[source.LabelResults.length];
            for (int i = 0; i < source.LabelResults.length; i++) {
                this.LabelResults[i] = new LabelResult(source.LabelResults[i]);
            }
        }
        if (source.ObjectResults != null) {
            this.ObjectResults = new ObjectResult[source.ObjectResults.length];
            for (int i = 0; i < source.ObjectResults.length; i++) {
                this.ObjectResults[i] = new ObjectResult(source.ObjectResults[i]);
            }
        }
        if (source.OcrResults != null) {
            this.OcrResults = new OcrResult[source.OcrResults.length];
            for (int i = 0; i < source.OcrResults.length; i++) {
                this.OcrResults[i] = new OcrResult(source.OcrResults[i]);
            }
        }
        if (source.LibResults != null) {
            this.LibResults = new LibResult[source.LibResults.length];
            for (int i = 0; i < source.LibResults.length; i++) {
                this.LibResults[i] = new LibResult(source.LibResults[i]);
            }
        }
        if (source.DataId != null) {
            this.DataId = new String(source.DataId);
        }
        if (source.BizType != null) {
            this.BizType = new String(source.BizType);
        }
        if (source.Extra != null) {
            this.Extra = new String(source.Extra);
        }
        if (source.FileMD5 != null) {
            this.FileMD5 = new String(source.FileMD5);
        }
        if (source.RecognitionResults != null) {
            this.RecognitionResults = new RecognitionResult[source.RecognitionResults.length];
            for (int i = 0; i < source.RecognitionResults.length; i++) {
                this.RecognitionResults[i] = new RecognitionResult(source.RecognitionResults[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Suggestion", this.Suggestion);
        this.setParamSimple(map, prefix + "Label", this.Label);
        this.setParamSimple(map, prefix + "SubLabel", this.SubLabel);
        this.setParamSimple(map, prefix + "Score", this.Score);
        this.setParamArrayObj(map, prefix + "LabelResults.", this.LabelResults);
        this.setParamArrayObj(map, prefix + "ObjectResults.", this.ObjectResults);
        this.setParamArrayObj(map, prefix + "OcrResults.", this.OcrResults);
        this.setParamArrayObj(map, prefix + "LibResults.", this.LibResults);
        this.setParamSimple(map, prefix + "DataId", this.DataId);
        this.setParamSimple(map, prefix + "BizType", this.BizType);
        this.setParamSimple(map, prefix + "Extra", this.Extra);
        this.setParamSimple(map, prefix + "FileMD5", this.FileMD5);
        this.setParamArrayObj(map, prefix + "RecognitionResults.", this.RecognitionResults);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

