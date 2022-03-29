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

public class OcrTextDetail extends AbstractModel{

    /**
    * This field is used to return the text content recognized by OCR.<br>Note: OCR can recognize text of **up to 5,000 bytes**.
    */
    @SerializedName("Text")
    @Expose
    private String Text;

    /**
    * This field is used to return the maliciousness tag in the detection result.<br>Returned values: **Normal**: normal; **Porn**: pornographic; **Abuse**: abusive; **Ad**: advertising; **Custom**: custom type of non-compliant content and other offensive, unsafe, or inappropriate types of content.
    */
    @SerializedName("Label")
    @Expose
    private String Label;

    /**
    * This field is **valid only when `Label` is `Custom` (custom keyword)**. It is used to return the ID of the custom library for easier custom library management and configuration.
    */
    @SerializedName("LibId")
    @Expose
    private String LibId;

    /**
    * This field is **valid only when `Label` is `Custom` (custom keyword)**. It is used to return the name of the custom library for easier custom library management and configuration.
    */
    @SerializedName("LibName")
    @Expose
    private String LibName;

    /**
    * This parameter is used to return the hit keyword under the current tag (label).
    */
    @SerializedName("Keywords")
    @Expose
    private String [] Keywords;

    /**
    * This parameter is used to return the model hit score of the current maliciousness tag. Value range: **0–100**, where a higher value indicates that the current scenario agrees more with the scenario represented by the maliciousness tag.
    */
    @SerializedName("Score")
    @Expose
    private Long Score;

    /**
    * This parameter is used to return the position (X and Y coordinates of the top-left corner, length, width, and rotation angle) of the OCR detection frame in the image for quick location of the recognized text.
    */
    @SerializedName("Location")
    @Expose
    private Location Location;

    /**
    * This parameter is used to return the confidence of the text OCR result. Valid values: **0** (**the lowest confidence**)–**100** (**the highest confidence**), where a higher value indicates that it is more likely that the image contains the recognized text; for example, *Hello 99* indicates that it is highly likely that the text in the OCR recognition frame is "Hello".
    */
    @SerializedName("Rate")
    @Expose
    private Long Rate;

    /**
    * This field is used to return the maliciousness subtag that corresponds to the detection result.
    */
    @SerializedName("SubLabel")
    @Expose
    private String SubLabel;

    /**
     * Get This field is used to return the text content recognized by OCR.<br>Note: OCR can recognize text of **up to 5,000 bytes**. 
     * @return Text This field is used to return the text content recognized by OCR.<br>Note: OCR can recognize text of **up to 5,000 bytes**.
     */
    public String getText() {
        return this.Text;
    }

    /**
     * Set This field is used to return the text content recognized by OCR.<br>Note: OCR can recognize text of **up to 5,000 bytes**.
     * @param Text This field is used to return the text content recognized by OCR.<br>Note: OCR can recognize text of **up to 5,000 bytes**.
     */
    public void setText(String Text) {
        this.Text = Text;
    }

    /**
     * Get This field is used to return the maliciousness tag in the detection result.<br>Returned values: **Normal**: normal; **Porn**: pornographic; **Abuse**: abusive; **Ad**: advertising; **Custom**: custom type of non-compliant content and other offensive, unsafe, or inappropriate types of content. 
     * @return Label This field is used to return the maliciousness tag in the detection result.<br>Returned values: **Normal**: normal; **Porn**: pornographic; **Abuse**: abusive; **Ad**: advertising; **Custom**: custom type of non-compliant content and other offensive, unsafe, or inappropriate types of content.
     */
    public String getLabel() {
        return this.Label;
    }

    /**
     * Set This field is used to return the maliciousness tag in the detection result.<br>Returned values: **Normal**: normal; **Porn**: pornographic; **Abuse**: abusive; **Ad**: advertising; **Custom**: custom type of non-compliant content and other offensive, unsafe, or inappropriate types of content.
     * @param Label This field is used to return the maliciousness tag in the detection result.<br>Returned values: **Normal**: normal; **Porn**: pornographic; **Abuse**: abusive; **Ad**: advertising; **Custom**: custom type of non-compliant content and other offensive, unsafe, or inappropriate types of content.
     */
    public void setLabel(String Label) {
        this.Label = Label;
    }

    /**
     * Get This field is **valid only when `Label` is `Custom` (custom keyword)**. It is used to return the ID of the custom library for easier custom library management and configuration. 
     * @return LibId This field is **valid only when `Label` is `Custom` (custom keyword)**. It is used to return the ID of the custom library for easier custom library management and configuration.
     */
    public String getLibId() {
        return this.LibId;
    }

    /**
     * Set This field is **valid only when `Label` is `Custom` (custom keyword)**. It is used to return the ID of the custom library for easier custom library management and configuration.
     * @param LibId This field is **valid only when `Label` is `Custom` (custom keyword)**. It is used to return the ID of the custom library for easier custom library management and configuration.
     */
    public void setLibId(String LibId) {
        this.LibId = LibId;
    }

    /**
     * Get This field is **valid only when `Label` is `Custom` (custom keyword)**. It is used to return the name of the custom library for easier custom library management and configuration. 
     * @return LibName This field is **valid only when `Label` is `Custom` (custom keyword)**. It is used to return the name of the custom library for easier custom library management and configuration.
     */
    public String getLibName() {
        return this.LibName;
    }

    /**
     * Set This field is **valid only when `Label` is `Custom` (custom keyword)**. It is used to return the name of the custom library for easier custom library management and configuration.
     * @param LibName This field is **valid only when `Label` is `Custom` (custom keyword)**. It is used to return the name of the custom library for easier custom library management and configuration.
     */
    public void setLibName(String LibName) {
        this.LibName = LibName;
    }

    /**
     * Get This parameter is used to return the hit keyword under the current tag (label). 
     * @return Keywords This parameter is used to return the hit keyword under the current tag (label).
     */
    public String [] getKeywords() {
        return this.Keywords;
    }

    /**
     * Set This parameter is used to return the hit keyword under the current tag (label).
     * @param Keywords This parameter is used to return the hit keyword under the current tag (label).
     */
    public void setKeywords(String [] Keywords) {
        this.Keywords = Keywords;
    }

    /**
     * Get This parameter is used to return the model hit score of the current maliciousness tag. Value range: **0–100**, where a higher value indicates that the current scenario agrees more with the scenario represented by the maliciousness tag. 
     * @return Score This parameter is used to return the model hit score of the current maliciousness tag. Value range: **0–100**, where a higher value indicates that the current scenario agrees more with the scenario represented by the maliciousness tag.
     */
    public Long getScore() {
        return this.Score;
    }

    /**
     * Set This parameter is used to return the model hit score of the current maliciousness tag. Value range: **0–100**, where a higher value indicates that the current scenario agrees more with the scenario represented by the maliciousness tag.
     * @param Score This parameter is used to return the model hit score of the current maliciousness tag. Value range: **0–100**, where a higher value indicates that the current scenario agrees more with the scenario represented by the maliciousness tag.
     */
    public void setScore(Long Score) {
        this.Score = Score;
    }

    /**
     * Get This parameter is used to return the position (X and Y coordinates of the top-left corner, length, width, and rotation angle) of the OCR detection frame in the image for quick location of the recognized text. 
     * @return Location This parameter is used to return the position (X and Y coordinates of the top-left corner, length, width, and rotation angle) of the OCR detection frame in the image for quick location of the recognized text.
     */
    public Location getLocation() {
        return this.Location;
    }

    /**
     * Set This parameter is used to return the position (X and Y coordinates of the top-left corner, length, width, and rotation angle) of the OCR detection frame in the image for quick location of the recognized text.
     * @param Location This parameter is used to return the position (X and Y coordinates of the top-left corner, length, width, and rotation angle) of the OCR detection frame in the image for quick location of the recognized text.
     */
    public void setLocation(Location Location) {
        this.Location = Location;
    }

    /**
     * Get This parameter is used to return the confidence of the text OCR result. Valid values: **0** (**the lowest confidence**)–**100** (**the highest confidence**), where a higher value indicates that it is more likely that the image contains the recognized text; for example, *Hello 99* indicates that it is highly likely that the text in the OCR recognition frame is "Hello". 
     * @return Rate This parameter is used to return the confidence of the text OCR result. Valid values: **0** (**the lowest confidence**)–**100** (**the highest confidence**), where a higher value indicates that it is more likely that the image contains the recognized text; for example, *Hello 99* indicates that it is highly likely that the text in the OCR recognition frame is "Hello".
     */
    public Long getRate() {
        return this.Rate;
    }

    /**
     * Set This parameter is used to return the confidence of the text OCR result. Valid values: **0** (**the lowest confidence**)–**100** (**the highest confidence**), where a higher value indicates that it is more likely that the image contains the recognized text; for example, *Hello 99* indicates that it is highly likely that the text in the OCR recognition frame is "Hello".
     * @param Rate This parameter is used to return the confidence of the text OCR result. Valid values: **0** (**the lowest confidence**)–**100** (**the highest confidence**), where a higher value indicates that it is more likely that the image contains the recognized text; for example, *Hello 99* indicates that it is highly likely that the text in the OCR recognition frame is "Hello".
     */
    public void setRate(Long Rate) {
        this.Rate = Rate;
    }

    /**
     * Get This field is used to return the maliciousness subtag that corresponds to the detection result. 
     * @return SubLabel This field is used to return the maliciousness subtag that corresponds to the detection result.
     */
    public String getSubLabel() {
        return this.SubLabel;
    }

    /**
     * Set This field is used to return the maliciousness subtag that corresponds to the detection result.
     * @param SubLabel This field is used to return the maliciousness subtag that corresponds to the detection result.
     */
    public void setSubLabel(String SubLabel) {
        this.SubLabel = SubLabel;
    }

    public OcrTextDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OcrTextDetail(OcrTextDetail source) {
        if (source.Text != null) {
            this.Text = new String(source.Text);
        }
        if (source.Label != null) {
            this.Label = new String(source.Label);
        }
        if (source.LibId != null) {
            this.LibId = new String(source.LibId);
        }
        if (source.LibName != null) {
            this.LibName = new String(source.LibName);
        }
        if (source.Keywords != null) {
            this.Keywords = new String[source.Keywords.length];
            for (int i = 0; i < source.Keywords.length; i++) {
                this.Keywords[i] = new String(source.Keywords[i]);
            }
        }
        if (source.Score != null) {
            this.Score = new Long(source.Score);
        }
        if (source.Location != null) {
            this.Location = new Location(source.Location);
        }
        if (source.Rate != null) {
            this.Rate = new Long(source.Rate);
        }
        if (source.SubLabel != null) {
            this.SubLabel = new String(source.SubLabel);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Text", this.Text);
        this.setParamSimple(map, prefix + "Label", this.Label);
        this.setParamSimple(map, prefix + "LibId", this.LibId);
        this.setParamSimple(map, prefix + "LibName", this.LibName);
        this.setParamArraySimple(map, prefix + "Keywords.", this.Keywords);
        this.setParamSimple(map, prefix + "Score", this.Score);
        this.setParamObj(map, prefix + "Location.", this.Location);
        this.setParamSimple(map, prefix + "Rate", this.Rate);
        this.setParamSimple(map, prefix + "SubLabel", this.SubLabel);

    }
}

