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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ImageResultResult extends AbstractModel {

    /**
    * This field is used to return the maliciousness scenario in the detection result. Returned values: **Normal**: normal; **Porn**: pornographic; **Abuse**: abusive; **AppLogo**: advertising logo; **Custom**: custom type of non-compliant content and other offensive, unsafe, or inappropriate types of content.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Scene")
    @Expose
    private String Scene;

    /**
    * This parameter indicates whether the moderated content hit a maliciousness tag. Valid values: 0 (**no**), 1 (**yes**).
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("HitFlag")
    @Expose
    private Long HitFlag;

    /**
    * This field is used to return the operation suggestion. When you get the determination result, the returned value indicates the suggested operation.<br>
Returned values: **Block**, **Review**, **Pass**.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Suggestion")
    @Expose
    private String Suggestion;

    /**
    * This field is used to return the maliciousness tag in the detection result.<br>Returned values: **Normal**: normal; **Porn**: pornographic; **Abuse**: abusive; **Ad**: advertising; **Custom**: custom type of non-compliant content and other offensive, unsafe, or inappropriate types of content.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Label")
    @Expose
    private String Label;

    /**
    * This field is used to return the detection result for a subtag under the maliciousness tag, such as *Porn-SexBehavior*.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SubLabel")
    @Expose
    private String SubLabel;

    /**
    * This field is used to return the confidence under the current tag. Value range: 0 (**the lowest confidence**)–100 (**the highest confidence**), where a higher value indicates that the text is more likely to fall into the category of the current returned tag; for example, *Porn-SexBehavior 99* indicates that the text is highly likely to fall into the category of content involving sexual behaviors.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Score")
    @Expose
    private Long Score;

    /**
    * This field is used to return the list of specific object names hit by the moderated image in a sensitive scenario.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Names")
    @Expose
    private String [] Names;

    /**
    * This field is used to return the OCR result of an image. OCR can recognize text of **up to 5,000 bytes**.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Text")
    @Expose
    private String Text;

    /**
    * This field is used to return other detailed information of the image moderation sub-result, such as text position and custom library. For the detailed returned content, see the description of the `ImageResultsResultDetail` data structure.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Details")
    @Expose
    private ImageResultsResultDetail [] Details;

    /**
     * Get This field is used to return the maliciousness scenario in the detection result. Returned values: **Normal**: normal; **Porn**: pornographic; **Abuse**: abusive; **AppLogo**: advertising logo; **Custom**: custom type of non-compliant content and other offensive, unsafe, or inappropriate types of content.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Scene This field is used to return the maliciousness scenario in the detection result. Returned values: **Normal**: normal; **Porn**: pornographic; **Abuse**: abusive; **AppLogo**: advertising logo; **Custom**: custom type of non-compliant content and other offensive, unsafe, or inappropriate types of content.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getScene() {
        return this.Scene;
    }

    /**
     * Set This field is used to return the maliciousness scenario in the detection result. Returned values: **Normal**: normal; **Porn**: pornographic; **Abuse**: abusive; **AppLogo**: advertising logo; **Custom**: custom type of non-compliant content and other offensive, unsafe, or inappropriate types of content.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Scene This field is used to return the maliciousness scenario in the detection result. Returned values: **Normal**: normal; **Porn**: pornographic; **Abuse**: abusive; **AppLogo**: advertising logo; **Custom**: custom type of non-compliant content and other offensive, unsafe, or inappropriate types of content.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setScene(String Scene) {
        this.Scene = Scene;
    }

    /**
     * Get This parameter indicates whether the moderated content hit a maliciousness tag. Valid values: 0 (**no**), 1 (**yes**).
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return HitFlag This parameter indicates whether the moderated content hit a maliciousness tag. Valid values: 0 (**no**), 1 (**yes**).
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getHitFlag() {
        return this.HitFlag;
    }

    /**
     * Set This parameter indicates whether the moderated content hit a maliciousness tag. Valid values: 0 (**no**), 1 (**yes**).
Note: this field may return null, indicating that no valid values can be obtained.
     * @param HitFlag This parameter indicates whether the moderated content hit a maliciousness tag. Valid values: 0 (**no**), 1 (**yes**).
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setHitFlag(Long HitFlag) {
        this.HitFlag = HitFlag;
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
     * Get This field is used to return the detection result for a subtag under the maliciousness tag, such as *Porn-SexBehavior*.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return SubLabel This field is used to return the detection result for a subtag under the maliciousness tag, such as *Porn-SexBehavior*.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getSubLabel() {
        return this.SubLabel;
    }

    /**
     * Set This field is used to return the detection result for a subtag under the maliciousness tag, such as *Porn-SexBehavior*.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param SubLabel This field is used to return the detection result for a subtag under the maliciousness tag, such as *Porn-SexBehavior*.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setSubLabel(String SubLabel) {
        this.SubLabel = SubLabel;
    }

    /**
     * Get This field is used to return the confidence under the current tag. Value range: 0 (**the lowest confidence**)–100 (**the highest confidence**), where a higher value indicates that the text is more likely to fall into the category of the current returned tag; for example, *Porn-SexBehavior 99* indicates that the text is highly likely to fall into the category of content involving sexual behaviors.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Score This field is used to return the confidence under the current tag. Value range: 0 (**the lowest confidence**)–100 (**the highest confidence**), where a higher value indicates that the text is more likely to fall into the category of the current returned tag; for example, *Porn-SexBehavior 99* indicates that the text is highly likely to fall into the category of content involving sexual behaviors.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getScore() {
        return this.Score;
    }

    /**
     * Set This field is used to return the confidence under the current tag. Value range: 0 (**the lowest confidence**)–100 (**the highest confidence**), where a higher value indicates that the text is more likely to fall into the category of the current returned tag; for example, *Porn-SexBehavior 99* indicates that the text is highly likely to fall into the category of content involving sexual behaviors.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Score This field is used to return the confidence under the current tag. Value range: 0 (**the lowest confidence**)–100 (**the highest confidence**), where a higher value indicates that the text is more likely to fall into the category of the current returned tag; for example, *Porn-SexBehavior 99* indicates that the text is highly likely to fall into the category of content involving sexual behaviors.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setScore(Long Score) {
        this.Score = Score;
    }

    /**
     * Get This field is used to return the list of specific object names hit by the moderated image in a sensitive scenario.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Names This field is used to return the list of specific object names hit by the moderated image in a sensitive scenario.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String [] getNames() {
        return this.Names;
    }

    /**
     * Set This field is used to return the list of specific object names hit by the moderated image in a sensitive scenario.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Names This field is used to return the list of specific object names hit by the moderated image in a sensitive scenario.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setNames(String [] Names) {
        this.Names = Names;
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
     * Get This field is used to return other detailed information of the image moderation sub-result, such as text position and custom library. For the detailed returned content, see the description of the `ImageResultsResultDetail` data structure.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Details This field is used to return other detailed information of the image moderation sub-result, such as text position and custom library. For the detailed returned content, see the description of the `ImageResultsResultDetail` data structure.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public ImageResultsResultDetail [] getDetails() {
        return this.Details;
    }

    /**
     * Set This field is used to return other detailed information of the image moderation sub-result, such as text position and custom library. For the detailed returned content, see the description of the `ImageResultsResultDetail` data structure.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Details This field is used to return other detailed information of the image moderation sub-result, such as text position and custom library. For the detailed returned content, see the description of the `ImageResultsResultDetail` data structure.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setDetails(ImageResultsResultDetail [] Details) {
        this.Details = Details;
    }

    public ImageResultResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImageResultResult(ImageResultResult source) {
        if (source.Scene != null) {
            this.Scene = new String(source.Scene);
        }
        if (source.HitFlag != null) {
            this.HitFlag = new Long(source.HitFlag);
        }
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
        if (source.Names != null) {
            this.Names = new String[source.Names.length];
            for (int i = 0; i < source.Names.length; i++) {
                this.Names[i] = new String(source.Names[i]);
            }
        }
        if (source.Text != null) {
            this.Text = new String(source.Text);
        }
        if (source.Details != null) {
            this.Details = new ImageResultsResultDetail[source.Details.length];
            for (int i = 0; i < source.Details.length; i++) {
                this.Details[i] = new ImageResultsResultDetail(source.Details[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Scene", this.Scene);
        this.setParamSimple(map, prefix + "HitFlag", this.HitFlag);
        this.setParamSimple(map, prefix + "Suggestion", this.Suggestion);
        this.setParamSimple(map, prefix + "Label", this.Label);
        this.setParamSimple(map, prefix + "SubLabel", this.SubLabel);
        this.setParamSimple(map, prefix + "Score", this.Score);
        this.setParamArraySimple(map, prefix + "Names.", this.Names);
        this.setParamSimple(map, prefix + "Text", this.Text);
        this.setParamArrayObj(map, prefix + "Details.", this.Details);

    }
}

