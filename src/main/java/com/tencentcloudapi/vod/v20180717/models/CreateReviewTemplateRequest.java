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

public class CreateReviewTemplateRequest extends AbstractModel {

    /**
    * List of rule violation tags to return. Optional values:
<li>Porn: Pornography;</li>
<li>Terror: violence.</li>
<li>Polity: inappropriate information;</li>
<li>Illegal: illegal activities;</li>
<li>Abuse: verbal abuse;</li>
<li>Ad: advertisement;</li>
<li>Moan: panting.</li>
    */
    @SerializedName("Labels")
    @Expose
    private String [] Labels;

    /**
    * <b>VOD [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID. For customers who activate VOD from December 25, 2023, if they access resources in VOD applications (whether the default application or a newly created application), this field must be filled in with the application ID.</b>
    */
    @SerializedName("SubAppId")
    @Expose
    private String SubAppId;

    /**
    * Review template name. The length cannot exceed 64 characters.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Review template description information, with a length limit of 256 characters.
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
     * Get List of rule violation tags to return. Optional values:
<li>Porn: Pornography;</li>
<li>Terror: violence.</li>
<li>Polity: inappropriate information;</li>
<li>Illegal: illegal activities;</li>
<li>Abuse: verbal abuse;</li>
<li>Ad: advertisement;</li>
<li>Moan: panting.</li> 
     * @return Labels List of rule violation tags to return. Optional values:
<li>Porn: Pornography;</li>
<li>Terror: violence.</li>
<li>Polity: inappropriate information;</li>
<li>Illegal: illegal activities;</li>
<li>Abuse: verbal abuse;</li>
<li>Ad: advertisement;</li>
<li>Moan: panting.</li>
     */
    public String [] getLabels() {
        return this.Labels;
    }

    /**
     * Set List of rule violation tags to return. Optional values:
<li>Porn: Pornography;</li>
<li>Terror: violence.</li>
<li>Polity: inappropriate information;</li>
<li>Illegal: illegal activities;</li>
<li>Abuse: verbal abuse;</li>
<li>Ad: advertisement;</li>
<li>Moan: panting.</li>
     * @param Labels List of rule violation tags to return. Optional values:
<li>Porn: Pornography;</li>
<li>Terror: violence.</li>
<li>Polity: inappropriate information;</li>
<li>Illegal: illegal activities;</li>
<li>Abuse: verbal abuse;</li>
<li>Ad: advertisement;</li>
<li>Moan: panting.</li>
     */
    public void setLabels(String [] Labels) {
        this.Labels = Labels;
    }

    /**
     * Get <b>VOD [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID. For customers who activate VOD from December 25, 2023, if they access resources in VOD applications (whether the default application or a newly created application), this field must be filled in with the application ID.</b> 
     * @return SubAppId <b>VOD [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID. For customers who activate VOD from December 25, 2023, if they access resources in VOD applications (whether the default application or a newly created application), this field must be filled in with the application ID.</b>
     */
    public String getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set <b>VOD [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID. For customers who activate VOD from December 25, 2023, if they access resources in VOD applications (whether the default application or a newly created application), this field must be filled in with the application ID.</b>
     * @param SubAppId <b>VOD [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID. For customers who activate VOD from December 25, 2023, if they access resources in VOD applications (whether the default application or a newly created application), this field must be filled in with the application ID.</b>
     */
    public void setSubAppId(String SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Get Review template name. The length cannot exceed 64 characters. 
     * @return Name Review template name. The length cannot exceed 64 characters.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Review template name. The length cannot exceed 64 characters.
     * @param Name Review template name. The length cannot exceed 64 characters.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Review template description information, with a length limit of 256 characters. 
     * @return Comment Review template description information, with a length limit of 256 characters.
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set Review template description information, with a length limit of 256 characters.
     * @param Comment Review template description information, with a length limit of 256 characters.
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    public CreateReviewTemplateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateReviewTemplateRequest(CreateReviewTemplateRequest source) {
        if (source.Labels != null) {
            this.Labels = new String[source.Labels.length];
            for (int i = 0; i < source.Labels.length; i++) {
                this.Labels[i] = new String(source.Labels[i]);
            }
        }
        if (source.SubAppId != null) {
            this.SubAppId = new String(source.SubAppId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Comment != null) {
            this.Comment = new String(source.Comment);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Labels.", this.Labels);
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Comment", this.Comment);

    }
}

