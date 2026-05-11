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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ReviewImageResult extends AbstractModel {

    /**
    * Image review result suggestion. Value ranges from...to...
<li>pass: it is recommended to pass;</li>
<li>review: suggest re-examination;</li>
<li>block: Suggest banning.</li>
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
    * Valid when Suggestion is review or block, indicating the most likely prohibited forms. Value ranges from...to...
<li>Image: The figure or icon on the screen;</li>
<li>OCR: Text on the screen.</li>
    */
    @SerializedName("Form")
    @Expose
    private String Form;

    /**
    * Video clips suspected of containing violation information.
<font color=red>Note</font>: The list only displays the first 10 elements. To obtain the complete result, refer to the corresponding file in SegmentSetFileUrl.
    */
    @SerializedName("SegmentSet")
    @Expose
    private ReviewImageSegmentItem [] SegmentSet;

    /**
    * URL of video clip list file involved in suspicion of violation information. The content of the file is JSON, consistent with the fields of SegmentSet. (The file will not be retained permanently and will be deleted when reaching SegmentSetFileUrlExpireTime.)
    */
    @SerializedName("SegmentSetFileUrl")
    @Expose
    private String SegmentSetFileUrl;

    /**
    * URL expiry time of the list of video clips suspected of involving violation information, in [ISO date format](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I).
    */
    @SerializedName("SegmentSetFileUrlExpireTime")
    @Expose
    private String SegmentSetFileUrlExpireTime;

    /**
     * Get Image review result suggestion. Value ranges from...to...
<li>pass: it is recommended to pass;</li>
<li>review: suggest re-examination;</li>
<li>block: Suggest banning.</li> 
     * @return Suggestion Image review result suggestion. Value ranges from...to...
<li>pass: it is recommended to pass;</li>
<li>review: suggest re-examination;</li>
<li>block: Suggest banning.</li>
     */
    public String getSuggestion() {
        return this.Suggestion;
    }

    /**
     * Set Image review result suggestion. Value ranges from...to...
<li>pass: it is recommended to pass;</li>
<li>review: suggest re-examination;</li>
<li>block: Suggest banning.</li>
     * @param Suggestion Image review result suggestion. Value ranges from...to...
<li>pass: it is recommended to pass;</li>
<li>review: suggest re-examination;</li>
<li>block: Suggest banning.</li>
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
     * Get Valid when Suggestion is review or block, indicating the most likely prohibited forms. Value ranges from...to...
<li>Image: The figure or icon on the screen;</li>
<li>OCR: Text on the screen.</li> 
     * @return Form Valid when Suggestion is review or block, indicating the most likely prohibited forms. Value ranges from...to...
<li>Image: The figure or icon on the screen;</li>
<li>OCR: Text on the screen.</li>
     */
    public String getForm() {
        return this.Form;
    }

    /**
     * Set Valid when Suggestion is review or block, indicating the most likely prohibited forms. Value ranges from...to...
<li>Image: The figure or icon on the screen;</li>
<li>OCR: Text on the screen.</li>
     * @param Form Valid when Suggestion is review or block, indicating the most likely prohibited forms. Value ranges from...to...
<li>Image: The figure or icon on the screen;</li>
<li>OCR: Text on the screen.</li>
     */
    public void setForm(String Form) {
        this.Form = Form;
    }

    /**
     * Get Video clips suspected of containing violation information.
<font color=red>Note</font>: The list only displays the first 10 elements. To obtain the complete result, refer to the corresponding file in SegmentSetFileUrl. 
     * @return SegmentSet Video clips suspected of containing violation information.
<font color=red>Note</font>: The list only displays the first 10 elements. To obtain the complete result, refer to the corresponding file in SegmentSetFileUrl.
     */
    public ReviewImageSegmentItem [] getSegmentSet() {
        return this.SegmentSet;
    }

    /**
     * Set Video clips suspected of containing violation information.
<font color=red>Note</font>: The list only displays the first 10 elements. To obtain the complete result, refer to the corresponding file in SegmentSetFileUrl.
     * @param SegmentSet Video clips suspected of containing violation information.
<font color=red>Note</font>: The list only displays the first 10 elements. To obtain the complete result, refer to the corresponding file in SegmentSetFileUrl.
     */
    public void setSegmentSet(ReviewImageSegmentItem [] SegmentSet) {
        this.SegmentSet = SegmentSet;
    }

    /**
     * Get URL of video clip list file involved in suspicion of violation information. The content of the file is JSON, consistent with the fields of SegmentSet. (The file will not be retained permanently and will be deleted when reaching SegmentSetFileUrlExpireTime.) 
     * @return SegmentSetFileUrl URL of video clip list file involved in suspicion of violation information. The content of the file is JSON, consistent with the fields of SegmentSet. (The file will not be retained permanently and will be deleted when reaching SegmentSetFileUrlExpireTime.)
     */
    public String getSegmentSetFileUrl() {
        return this.SegmentSetFileUrl;
    }

    /**
     * Set URL of video clip list file involved in suspicion of violation information. The content of the file is JSON, consistent with the fields of SegmentSet. (The file will not be retained permanently and will be deleted when reaching SegmentSetFileUrlExpireTime.)
     * @param SegmentSetFileUrl URL of video clip list file involved in suspicion of violation information. The content of the file is JSON, consistent with the fields of SegmentSet. (The file will not be retained permanently and will be deleted when reaching SegmentSetFileUrlExpireTime.)
     */
    public void setSegmentSetFileUrl(String SegmentSetFileUrl) {
        this.SegmentSetFileUrl = SegmentSetFileUrl;
    }

    /**
     * Get URL expiry time of the list of video clips suspected of involving violation information, in [ISO date format](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I). 
     * @return SegmentSetFileUrlExpireTime URL expiry time of the list of video clips suspected of involving violation information, in [ISO date format](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I).
     */
    public String getSegmentSetFileUrlExpireTime() {
        return this.SegmentSetFileUrlExpireTime;
    }

    /**
     * Set URL expiry time of the list of video clips suspected of involving violation information, in [ISO date format](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I).
     * @param SegmentSetFileUrlExpireTime URL expiry time of the list of video clips suspected of involving violation information, in [ISO date format](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I).
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

