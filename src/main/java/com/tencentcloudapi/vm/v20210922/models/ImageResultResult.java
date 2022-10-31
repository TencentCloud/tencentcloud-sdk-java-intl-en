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
package com.tencentcloudapi.vm.v20210922.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ImageResultResult extends AbstractModel{

    /**
    * Scenario
`Porn`: Pornographic
`Sexy`: Sexy
`Polity`: Political
`Illegal`: Illegal
`Abuse`: Abusive
`Terror`: Violence and terrorism
`Ad`: Advertising
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Scene")
    @Expose
    private String Scene;

    /**
    * Whether the video content is hit
`0`: No
`1`: Yes
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("HitFlag")
    @Expose
    private Long HitFlag;

    /**
    * Suggestion. Values:
`Pass`: You’re suggested to allow the video to pass.
`Review`: You’re suggested to take a manual review.
`Block`: You’re suggested to block the non-compliant video.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Suggestion")
    @Expose
    private String Suggestion;

    /**
    * Tag
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Label")
    @Expose
    private String Label;

    /**
    * Subtag under the current tag
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SubLabel")
    @Expose
    private String SubLabel;

    /**
    * Score
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Score")
    @Expose
    private Long Score;

    /**
    * If the hit video contains political content, the list of politicians will be returned; otherwise a null value is returned.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Names")
    @Expose
    private String [] Names;

    /**
    * OCR-recognized text in the image
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Text")
    @Expose
    private String Text;

    /**
    * Other details
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Details")
    @Expose
    private ImageResultsResultDetail [] Details;

    /**
     * Get Scenario
`Porn`: Pornographic
`Sexy`: Sexy
`Polity`: Political
`Illegal`: Illegal
`Abuse`: Abusive
`Terror`: Violence and terrorism
`Ad`: Advertising
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Scene Scenario
`Porn`: Pornographic
`Sexy`: Sexy
`Polity`: Political
`Illegal`: Illegal
`Abuse`: Abusive
`Terror`: Violence and terrorism
`Ad`: Advertising
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getScene() {
        return this.Scene;
    }

    /**
     * Set Scenario
`Porn`: Pornographic
`Sexy`: Sexy
`Polity`: Political
`Illegal`: Illegal
`Abuse`: Abusive
`Terror`: Violence and terrorism
`Ad`: Advertising
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Scene Scenario
`Porn`: Pornographic
`Sexy`: Sexy
`Polity`: Political
`Illegal`: Illegal
`Abuse`: Abusive
`Terror`: Violence and terrorism
`Ad`: Advertising
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setScene(String Scene) {
        this.Scene = Scene;
    }

    /**
     * Get Whether the video content is hit
`0`: No
`1`: Yes
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return HitFlag Whether the video content is hit
`0`: No
`1`: Yes
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getHitFlag() {
        return this.HitFlag;
    }

    /**
     * Set Whether the video content is hit
`0`: No
`1`: Yes
Note: This field may return null, indicating that no valid values can be obtained.
     * @param HitFlag Whether the video content is hit
`0`: No
`1`: Yes
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setHitFlag(Long HitFlag) {
        this.HitFlag = HitFlag;
    }

    /**
     * Get Suggestion. Values:
`Pass`: You’re suggested to allow the video to pass.
`Review`: You’re suggested to take a manual review.
`Block`: You’re suggested to block the non-compliant video.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Suggestion Suggestion. Values:
`Pass`: You’re suggested to allow the video to pass.
`Review`: You’re suggested to take a manual review.
`Block`: You’re suggested to block the non-compliant video.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getSuggestion() {
        return this.Suggestion;
    }

    /**
     * Set Suggestion. Values:
`Pass`: You’re suggested to allow the video to pass.
`Review`: You’re suggested to take a manual review.
`Block`: You’re suggested to block the non-compliant video.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Suggestion Suggestion. Values:
`Pass`: You’re suggested to allow the video to pass.
`Review`: You’re suggested to take a manual review.
`Block`: You’re suggested to block the non-compliant video.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSuggestion(String Suggestion) {
        this.Suggestion = Suggestion;
    }

    /**
     * Get Tag
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Label Tag
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getLabel() {
        return this.Label;
    }

    /**
     * Set Tag
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Label Tag
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setLabel(String Label) {
        this.Label = Label;
    }

    /**
     * Get Subtag under the current tag
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SubLabel Subtag under the current tag
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getSubLabel() {
        return this.SubLabel;
    }

    /**
     * Set Subtag under the current tag
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SubLabel Subtag under the current tag
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSubLabel(String SubLabel) {
        this.SubLabel = SubLabel;
    }

    /**
     * Get Score
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Score Score
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getScore() {
        return this.Score;
    }

    /**
     * Set Score
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Score Score
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setScore(Long Score) {
        this.Score = Score;
    }

    /**
     * Get If the hit video contains political content, the list of politicians will be returned; otherwise a null value is returned.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Names If the hit video contains political content, the list of politicians will be returned; otherwise a null value is returned.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getNames() {
        return this.Names;
    }

    /**
     * Set If the hit video contains political content, the list of politicians will be returned; otherwise a null value is returned.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Names If the hit video contains political content, the list of politicians will be returned; otherwise a null value is returned.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setNames(String [] Names) {
        this.Names = Names;
    }

    /**
     * Get OCR-recognized text in the image
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Text OCR-recognized text in the image
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getText() {
        return this.Text;
    }

    /**
     * Set OCR-recognized text in the image
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Text OCR-recognized text in the image
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setText(String Text) {
        this.Text = Text;
    }

    /**
     * Get Other details
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Details Other details
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public ImageResultsResultDetail [] getDetails() {
        return this.Details;
    }

    /**
     * Set Other details
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Details Other details
Note: This field may return null, indicating that no valid values can be obtained.
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

