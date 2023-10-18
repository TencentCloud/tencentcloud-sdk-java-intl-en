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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ReviewImageResult extends AbstractModel {

    /**
    * The suggestion. Valid values:
<li>pass</li>
<li>review</li>
<li>block</li>
    */
    @SerializedName("Suggestion")
    @Expose
    private String Suggestion;

    /**
    * The most likely label for the suspicious content. This parameter is valid if `Suggestion` is `review` or `block`. Valid values: <li>`Porn`</li> <li>`Terror`</li>
    */
    @SerializedName("Label")
    @Expose
    private String Label;

    /**
    * The most likely type of the suspicious content. This parameter is valid only if `Suggestion` is `review` or `block`.
<li>`Image` (people or icons in images)</li>
<li>`OCR` (text in images)</li>
    */
    @SerializedName("Form")
    @Expose
    private String Form;

    /**
    * A list of the suspicious segments detected.
<font color=red>Note</font>: Only the first 10 results will be returned at most. You can get all the results from the file specified by `SegmentSetFileUrl`.
    */
    @SerializedName("SegmentSet")
    @Expose
    private ReviewImageSegmentItem [] SegmentSet;

    /**
    * The URL of the file that contains suspicious segments. The file is in JSON format and has the same data structure as `SegmentSet`. Instead of being saved permanently, the file is deleted upon the expiration time (`SegmentSetFileUrlExpireTime`).
    */
    @SerializedName("SegmentSetFileUrl")
    @Expose
    private String SegmentSetFileUrl;

    /**
    * The expiration time of the file that contains suspicious segments, in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732#iso-date-format).
    */
    @SerializedName("SegmentSetFileUrlExpireTime")
    @Expose
    private String SegmentSetFileUrlExpireTime;

    /**
     * Get The suggestion. Valid values:
<li>pass</li>
<li>review</li>
<li>block</li> 
     * @return Suggestion The suggestion. Valid values:
<li>pass</li>
<li>review</li>
<li>block</li>
     */
    public String getSuggestion() {
        return this.Suggestion;
    }

    /**
     * Set The suggestion. Valid values:
<li>pass</li>
<li>review</li>
<li>block</li>
     * @param Suggestion The suggestion. Valid values:
<li>pass</li>
<li>review</li>
<li>block</li>
     */
    public void setSuggestion(String Suggestion) {
        this.Suggestion = Suggestion;
    }

    /**
     * Get The most likely label for the suspicious content. This parameter is valid if `Suggestion` is `review` or `block`. Valid values: <li>`Porn`</li> <li>`Terror`</li> 
     * @return Label The most likely label for the suspicious content. This parameter is valid if `Suggestion` is `review` or `block`. Valid values: <li>`Porn`</li> <li>`Terror`</li>
     */
    public String getLabel() {
        return this.Label;
    }

    /**
     * Set The most likely label for the suspicious content. This parameter is valid if `Suggestion` is `review` or `block`. Valid values: <li>`Porn`</li> <li>`Terror`</li>
     * @param Label The most likely label for the suspicious content. This parameter is valid if `Suggestion` is `review` or `block`. Valid values: <li>`Porn`</li> <li>`Terror`</li>
     */
    public void setLabel(String Label) {
        this.Label = Label;
    }

    /**
     * Get The most likely type of the suspicious content. This parameter is valid only if `Suggestion` is `review` or `block`.
<li>`Image` (people or icons in images)</li>
<li>`OCR` (text in images)</li> 
     * @return Form The most likely type of the suspicious content. This parameter is valid only if `Suggestion` is `review` or `block`.
<li>`Image` (people or icons in images)</li>
<li>`OCR` (text in images)</li>
     */
    public String getForm() {
        return this.Form;
    }

    /**
     * Set The most likely type of the suspicious content. This parameter is valid only if `Suggestion` is `review` or `block`.
<li>`Image` (people or icons in images)</li>
<li>`OCR` (text in images)</li>
     * @param Form The most likely type of the suspicious content. This parameter is valid only if `Suggestion` is `review` or `block`.
<li>`Image` (people or icons in images)</li>
<li>`OCR` (text in images)</li>
     */
    public void setForm(String Form) {
        this.Form = Form;
    }

    /**
     * Get A list of the suspicious segments detected.
<font color=red>Note</font>: Only the first 10 results will be returned at most. You can get all the results from the file specified by `SegmentSetFileUrl`. 
     * @return SegmentSet A list of the suspicious segments detected.
<font color=red>Note</font>: Only the first 10 results will be returned at most. You can get all the results from the file specified by `SegmentSetFileUrl`.
     */
    public ReviewImageSegmentItem [] getSegmentSet() {
        return this.SegmentSet;
    }

    /**
     * Set A list of the suspicious segments detected.
<font color=red>Note</font>: Only the first 10 results will be returned at most. You can get all the results from the file specified by `SegmentSetFileUrl`.
     * @param SegmentSet A list of the suspicious segments detected.
<font color=red>Note</font>: Only the first 10 results will be returned at most. You can get all the results from the file specified by `SegmentSetFileUrl`.
     */
    public void setSegmentSet(ReviewImageSegmentItem [] SegmentSet) {
        this.SegmentSet = SegmentSet;
    }

    /**
     * Get The URL of the file that contains suspicious segments. The file is in JSON format and has the same data structure as `SegmentSet`. Instead of being saved permanently, the file is deleted upon the expiration time (`SegmentSetFileUrlExpireTime`). 
     * @return SegmentSetFileUrl The URL of the file that contains suspicious segments. The file is in JSON format and has the same data structure as `SegmentSet`. Instead of being saved permanently, the file is deleted upon the expiration time (`SegmentSetFileUrlExpireTime`).
     */
    public String getSegmentSetFileUrl() {
        return this.SegmentSetFileUrl;
    }

    /**
     * Set The URL of the file that contains suspicious segments. The file is in JSON format and has the same data structure as `SegmentSet`. Instead of being saved permanently, the file is deleted upon the expiration time (`SegmentSetFileUrlExpireTime`).
     * @param SegmentSetFileUrl The URL of the file that contains suspicious segments. The file is in JSON format and has the same data structure as `SegmentSet`. Instead of being saved permanently, the file is deleted upon the expiration time (`SegmentSetFileUrlExpireTime`).
     */
    public void setSegmentSetFileUrl(String SegmentSetFileUrl) {
        this.SegmentSetFileUrl = SegmentSetFileUrl;
    }

    /**
     * Get The expiration time of the file that contains suspicious segments, in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732#iso-date-format). 
     * @return SegmentSetFileUrlExpireTime The expiration time of the file that contains suspicious segments, in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732#iso-date-format).
     */
    public String getSegmentSetFileUrlExpireTime() {
        return this.SegmentSetFileUrlExpireTime;
    }

    /**
     * Set The expiration time of the file that contains suspicious segments, in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732#iso-date-format).
     * @param SegmentSetFileUrlExpireTime The expiration time of the file that contains suspicious segments, in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732#iso-date-format).
     */
    public void setSegmentSetFileUrlExpireTime(String SegmentSetFileUrlExpireTime) {
        this.SegmentSetFileUrlExpireTime = SegmentSetFileUrlExpireTime;
    }

    public ReviewImageResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ReviewImageResult(ReviewImageResult source) {
        if (source.Suggestion != null) {
            this.Suggestion = new String(source.Suggestion);
        }
        if (source.Label != null) {
            this.Label = new String(source.Label);
        }
        if (source.Form != null) {
            this.Form = new String(source.Form);
        }
        if (source.SegmentSet != null) {
            this.SegmentSet = new ReviewImageSegmentItem[source.SegmentSet.length];
            for (int i = 0; i < source.SegmentSet.length; i++) {
                this.SegmentSet[i] = new ReviewImageSegmentItem(source.SegmentSet[i]);
            }
        }
        if (source.SegmentSetFileUrl != null) {
            this.SegmentSetFileUrl = new String(source.SegmentSetFileUrl);
        }
        if (source.SegmentSetFileUrlExpireTime != null) {
            this.SegmentSetFileUrlExpireTime = new String(source.SegmentSetFileUrlExpireTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Suggestion", this.Suggestion);
        this.setParamSimple(map, prefix + "Label", this.Label);
        this.setParamSimple(map, prefix + "Form", this.Form);
        this.setParamArrayObj(map, prefix + "SegmentSet.", this.SegmentSet);
        this.setParamSimple(map, prefix + "SegmentSetFileUrl", this.SegmentSetFileUrl);
        this.setParamSimple(map, prefix + "SegmentSetFileUrlExpireTime", this.SegmentSetFileUrlExpireTime);

    }
}

