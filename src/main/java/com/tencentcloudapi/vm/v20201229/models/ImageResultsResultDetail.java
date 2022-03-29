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
package com.tencentcloudapi.vm.v20201229.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ImageResultsResultDetail extends AbstractModel{

    /**
    * This field is used to return the task name in the `TaskInput` parameter passed in when the video moderation API is called for easier task identification and management.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * This field is used to return the OCR result of an image. OCR can recognize text of **up to 5,000 bytes**.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Text")
    @Expose
    private String Text;

    /**
    * This field is used to return the detailed position information of the image moderation sub-result, such as coordinates, size, and rotation angle. For the detailed returned content, see the description of the `ImageResultsResultDetailLocation` data structure.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Location")
    @Expose
    private ImageResultsResultDetailLocation Location;

    /**
    * This field is used to return the maliciousness tag in the detection result.<br>Returned values: **Normal**: normal; **Porn**: pornographic; **Abuse**: abusive; **Ad**: advertising; **Custom**: custom type of non-compliant content and other offensive, unsafe, or inappropriate types of content.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Label")
    @Expose
    private String Label;

    /**
    * This field is **valid only when `Label` is `Custom` (custom keyword)**. It is used to return the ID of the custom library for easier custom library management and configuration.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("LibId")
    @Expose
    private String LibId;

    /**
    * This field is **valid only when `Label` is `Custom` (custom keyword)**. It is used to return the name of the custom library for easier custom library management and configuration.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("LibName")
    @Expose
    private String LibName;

    /**
    * This field is used to return the keyword information hit by the detected text and indicate the specific cause of text non-compliance (such as *Friend me*). This parameter may have multiple returned values representing multiple hit keywords. If the returned value is empty, but `Score` is not empty, the maliciousness tag (Label) that corresponds to the recognition result derives from the returned value determined by the semantic model.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Keywords")
    @Expose
    private String [] Keywords;

    /**
    * This field is used to return the operation suggestion. When you get the determination result, the returned value indicates the suggested operation.<br>
Returned values: **Block**, **Review**, **Pass**.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Suggestion")
    @Expose
    private String Suggestion;

    /**
    * This field is used to return the confidence under the current tag. Value range: 0 (**the lowest confidence**)–100 (**the highest confidence**), where a higher value indicates that the text is more likely to fall into the category of the current returned tag; for example, *Porn 99* indicates that the text is highly likely to be pornographic.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Score")
    @Expose
    private Long Score;

    /**
    * This field is used to return the detection result for a subtag under the maliciousness tag, such as *Porn-SexBehavior*.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SubLabelCode")
    @Expose
    private String SubLabelCode;

    /**
     * Get This field is used to return the task name in the `TaskInput` parameter passed in when the video moderation API is called for easier task identification and management.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Name This field is used to return the task name in the `TaskInput` parameter passed in when the video moderation API is called for easier task identification and management.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set This field is used to return the task name in the `TaskInput` parameter passed in when the video moderation API is called for easier task identification and management.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Name This field is used to return the task name in the `TaskInput` parameter passed in when the video moderation API is called for easier task identification and management.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get This field is used to return the OCR result of an image. OCR can recognize text of **up to 5,000 bytes**.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Text This field is used to return the OCR result of an image. OCR can recognize text of **up to 5,000 bytes**.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getText() {
        return this.Text;
    }

    /**
     * Set This field is used to return the OCR result of an image. OCR can recognize text of **up to 5,000 bytes**.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Text This field is used to return the OCR result of an image. OCR can recognize text of **up to 5,000 bytes**.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setText(String Text) {
        this.Text = Text;
    }

    /**
     * Get This field is used to return the detailed position information of the image moderation sub-result, such as coordinates, size, and rotation angle. For the detailed returned content, see the description of the `ImageResultsResultDetailLocation` data structure.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Location This field is used to return the detailed position information of the image moderation sub-result, such as coordinates, size, and rotation angle. For the detailed returned content, see the description of the `ImageResultsResultDetailLocation` data structure.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public ImageResultsResultDetailLocation getLocation() {
        return this.Location;
    }

    /**
     * Set This field is used to return the detailed position information of the image moderation sub-result, such as coordinates, size, and rotation angle. For the detailed returned content, see the description of the `ImageResultsResultDetailLocation` data structure.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Location This field is used to return the detailed position information of the image moderation sub-result, such as coordinates, size, and rotation angle. For the detailed returned content, see the description of the `ImageResultsResultDetailLocation` data structure.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setLocation(ImageResultsResultDetailLocation Location) {
        this.Location = Location;
    }

    /**
     * Get This field is used to return the maliciousness tag in the detection result.<br>Returned values: **Normal**: normal; **Porn**: pornographic; **Abuse**: abusive; **Ad**: advertising; **Custom**: custom type of non-compliant content and other offensive, unsafe, or inappropriate types of content.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Label This field is used to return the maliciousness tag in the detection result.<br>Returned values: **Normal**: normal; **Porn**: pornographic; **Abuse**: abusive; **Ad**: advertising; **Custom**: custom type of non-compliant content and other offensive, unsafe, or inappropriate types of content.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getLabel() {
        return this.Label;
    }

    /**
     * Set This field is used to return the maliciousness tag in the detection result.<br>Returned values: **Normal**: normal; **Porn**: pornographic; **Abuse**: abusive; **Ad**: advertising; **Custom**: custom type of non-compliant content and other offensive, unsafe, or inappropriate types of content.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Label This field is used to return the maliciousness tag in the detection result.<br>Returned values: **Normal**: normal; **Porn**: pornographic; **Abuse**: abusive; **Ad**: advertising; **Custom**: custom type of non-compliant content and other offensive, unsafe, or inappropriate types of content.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setLabel(String Label) {
        this.Label = Label;
    }

    /**
     * Get This field is **valid only when `Label` is `Custom` (custom keyword)**. It is used to return the ID of the custom library for easier custom library management and configuration.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return LibId This field is **valid only when `Label` is `Custom` (custom keyword)**. It is used to return the ID of the custom library for easier custom library management and configuration.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getLibId() {
        return this.LibId;
    }

    /**
     * Set This field is **valid only when `Label` is `Custom` (custom keyword)**. It is used to return the ID of the custom library for easier custom library management and configuration.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param LibId This field is **valid only when `Label` is `Custom` (custom keyword)**. It is used to return the ID of the custom library for easier custom library management and configuration.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setLibId(String LibId) {
        this.LibId = LibId;
    }

    /**
     * Get This field is **valid only when `Label` is `Custom` (custom keyword)**. It is used to return the name of the custom library for easier custom library management and configuration.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return LibName This field is **valid only when `Label` is `Custom` (custom keyword)**. It is used to return the name of the custom library for easier custom library management and configuration.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getLibName() {
        return this.LibName;
    }

    /**
     * Set This field is **valid only when `Label` is `Custom` (custom keyword)**. It is used to return the name of the custom library for easier custom library management and configuration.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param LibName This field is **valid only when `Label` is `Custom` (custom keyword)**. It is used to return the name of the custom library for easier custom library management and configuration.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setLibName(String LibName) {
        this.LibName = LibName;
    }

    /**
     * Get This field is used to return the keyword information hit by the detected text and indicate the specific cause of text non-compliance (such as *Friend me*). This parameter may have multiple returned values representing multiple hit keywords. If the returned value is empty, but `Score` is not empty, the maliciousness tag (Label) that corresponds to the recognition result derives from the returned value determined by the semantic model.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Keywords This field is used to return the keyword information hit by the detected text and indicate the specific cause of text non-compliance (such as *Friend me*). This parameter may have multiple returned values representing multiple hit keywords. If the returned value is empty, but `Score` is not empty, the maliciousness tag (Label) that corresponds to the recognition result derives from the returned value determined by the semantic model.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String [] getKeywords() {
        return this.Keywords;
    }

    /**
     * Set This field is used to return the keyword information hit by the detected text and indicate the specific cause of text non-compliance (such as *Friend me*). This parameter may have multiple returned values representing multiple hit keywords. If the returned value is empty, but `Score` is not empty, the maliciousness tag (Label) that corresponds to the recognition result derives from the returned value determined by the semantic model.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Keywords This field is used to return the keyword information hit by the detected text and indicate the specific cause of text non-compliance (such as *Friend me*). This parameter may have multiple returned values representing multiple hit keywords. If the returned value is empty, but `Score` is not empty, the maliciousness tag (Label) that corresponds to the recognition result derives from the returned value determined by the semantic model.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setKeywords(String [] Keywords) {
        this.Keywords = Keywords;
    }

    /**
     * Get This field is used to return the operation suggestion. When you get the determination result, the returned value indicates the suggested operation.<br>
Returned values: **Block**, **Review**, **Pass**.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Suggestion This field is used to return the operation suggestion. When you get the determination result, the returned value indicates the suggested operation.<br>
Returned values: **Block**, **Review**, **Pass**.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getSuggestion() {
        return this.Suggestion;
    }

    /**
     * Set This field is used to return the operation suggestion. When you get the determination result, the returned value indicates the suggested operation.<br>
Returned values: **Block**, **Review**, **Pass**.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Suggestion This field is used to return the operation suggestion. When you get the determination result, the returned value indicates the suggested operation.<br>
Returned values: **Block**, **Review**, **Pass**.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setSuggestion(String Suggestion) {
        this.Suggestion = Suggestion;
    }

    /**
     * Get This field is used to return the confidence under the current tag. Value range: 0 (**the lowest confidence**)–100 (**the highest confidence**), where a higher value indicates that the text is more likely to fall into the category of the current returned tag; for example, *Porn 99* indicates that the text is highly likely to be pornographic.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Score This field is used to return the confidence under the current tag. Value range: 0 (**the lowest confidence**)–100 (**the highest confidence**), where a higher value indicates that the text is more likely to fall into the category of the current returned tag; for example, *Porn 99* indicates that the text is highly likely to be pornographic.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getScore() {
        return this.Score;
    }

    /**
     * Set This field is used to return the confidence under the current tag. Value range: 0 (**the lowest confidence**)–100 (**the highest confidence**), where a higher value indicates that the text is more likely to fall into the category of the current returned tag; for example, *Porn 99* indicates that the text is highly likely to be pornographic.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Score This field is used to return the confidence under the current tag. Value range: 0 (**the lowest confidence**)–100 (**the highest confidence**), where a higher value indicates that the text is more likely to fall into the category of the current returned tag; for example, *Porn 99* indicates that the text is highly likely to be pornographic.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setScore(Long Score) {
        this.Score = Score;
    }

    /**
     * Get This field is used to return the detection result for a subtag under the maliciousness tag, such as *Porn-SexBehavior*.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return SubLabelCode This field is used to return the detection result for a subtag under the maliciousness tag, such as *Porn-SexBehavior*.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getSubLabelCode() {
        return this.SubLabelCode;
    }

    /**
     * Set This field is used to return the detection result for a subtag under the maliciousness tag, such as *Porn-SexBehavior*.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param SubLabelCode This field is used to return the detection result for a subtag under the maliciousness tag, such as *Porn-SexBehavior*.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setSubLabelCode(String SubLabelCode) {
        this.SubLabelCode = SubLabelCode;
    }

    public ImageResultsResultDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImageResultsResultDetail(ImageResultsResultDetail source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Text != null) {
            this.Text = new String(source.Text);
        }
        if (source.Location != null) {
            this.Location = new ImageResultsResultDetailLocation(source.Location);
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
        if (source.Suggestion != null) {
            this.Suggestion = new String(source.Suggestion);
        }
        if (source.Score != null) {
            this.Score = new Long(source.Score);
        }
        if (source.SubLabelCode != null) {
            this.SubLabelCode = new String(source.SubLabelCode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Text", this.Text);
        this.setParamObj(map, prefix + "Location.", this.Location);
        this.setParamSimple(map, prefix + "Label", this.Label);
        this.setParamSimple(map, prefix + "LibId", this.LibId);
        this.setParamSimple(map, prefix + "LibName", this.LibName);
        this.setParamArraySimple(map, prefix + "Keywords.", this.Keywords);
        this.setParamSimple(map, prefix + "Suggestion", this.Suggestion);
        this.setParamSimple(map, prefix + "Score", this.Score);
        this.setParamSimple(map, prefix + "SubLabelCode", this.SubLabelCode);

    }
}

