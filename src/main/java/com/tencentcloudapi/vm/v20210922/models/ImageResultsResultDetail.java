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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ImageResultsResultDetail extends AbstractModel {

    /**
    * Task name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * OCR-recognized text
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Text")
    @Expose
    private String Text;

    /**
    * Location information
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Location")
    @Expose
    private ImageResultsResultDetailLocation Location;

    /**
    * Tag
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Label")
    @Expose
    private String Label;

    /**
    * Library ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("LibId")
    @Expose
    private String LibId;

    /**
    * Database name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("LibName")
    @Expose
    private String LibName;

    /**
    * Hit keyword
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Keywords")
    @Expose
    private String [] Keywords;

    /**
    * Suggestion
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Suggestion")
    @Expose
    private String Suggestion;

    /**
    * Score
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Score")
    @Expose
    private Long Score;

    /**
    * Subtag under the current tag
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SubLabelCode")
    @Expose
    private String SubLabelCode;

    /**
     * Get Task name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Name Task name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Task name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Name Task name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get OCR-recognized text
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Text OCR-recognized text
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getText() {
        return this.Text;
    }

    /**
     * Set OCR-recognized text
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Text OCR-recognized text
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setText(String Text) {
        this.Text = Text;
    }

    /**
     * Get Location information
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Location Location information
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public ImageResultsResultDetailLocation getLocation() {
        return this.Location;
    }

    /**
     * Set Location information
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Location Location information
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setLocation(ImageResultsResultDetailLocation Location) {
        this.Location = Location;
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
     * Get Library ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return LibId Library ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getLibId() {
        return this.LibId;
    }

    /**
     * Set Library ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param LibId Library ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setLibId(String LibId) {
        this.LibId = LibId;
    }

    /**
     * Get Database name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return LibName Database name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getLibName() {
        return this.LibName;
    }

    /**
     * Set Database name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param LibName Database name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setLibName(String LibName) {
        this.LibName = LibName;
    }

    /**
     * Get Hit keyword
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Keywords Hit keyword
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getKeywords() {
        return this.Keywords;
    }

    /**
     * Set Hit keyword
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Keywords Hit keyword
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setKeywords(String [] Keywords) {
        this.Keywords = Keywords;
    }

    /**
     * Get Suggestion
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Suggestion Suggestion
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getSuggestion() {
        return this.Suggestion;
    }

    /**
     * Set Suggestion
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Suggestion Suggestion
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSuggestion(String Suggestion) {
        this.Suggestion = Suggestion;
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
     * Get Subtag under the current tag
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SubLabelCode Subtag under the current tag
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getSubLabelCode() {
        return this.SubLabelCode;
    }

    /**
     * Set Subtag under the current tag
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SubLabelCode Subtag under the current tag
Note: This field may return null, indicating that no valid values can be obtained.
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

