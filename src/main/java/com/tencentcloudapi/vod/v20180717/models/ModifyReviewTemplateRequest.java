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

public class ModifyReviewTemplateRequest extends AbstractModel {

    /**
    * Review template unique identifier.
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * <b>VOD [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID. For customers who activate VOD from December 25, 2023, if they access resources in VOD applications (whether the default application or a newly created application), they must fill in this field with the application ID.</b>
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * Review template name, with a length limit of 64 characters.
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
    * List of rule violation tags to return. Optional values:
<li>Porn: pornography;</li>
<li>Terror: violence.</li>
<li>Polity: inappropriate information;</li>
<li>Illegal: illegal activities;</li>
<li>Abuse: abusive language;</li>
<li>Ad: advertisement;</li>
<li>Moan: panting.</li>

Note: Leaving it blank means it does not update.
    */
    @SerializedName("Labels")
    @Expose
    private String [] Labels;

    /**
     * Get Review template unique identifier. 
     * @return Definition Review template unique identifier.
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set Review template unique identifier.
     * @param Definition Review template unique identifier.
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

    /**
     * Get <b>VOD [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID. For customers who activate VOD from December 25, 2023, if they access resources in VOD applications (whether the default application or a newly created application), they must fill in this field with the application ID.</b> 
     * @return SubAppId <b>VOD [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID. For customers who activate VOD from December 25, 2023, if they access resources in VOD applications (whether the default application or a newly created application), they must fill in this field with the application ID.</b>
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set <b>VOD [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID. For customers who activate VOD from December 25, 2023, if they access resources in VOD applications (whether the default application or a newly created application), they must fill in this field with the application ID.</b>
     * @param SubAppId <b>VOD [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID. For customers who activate VOD from December 25, 2023, if they access resources in VOD applications (whether the default application or a newly created application), they must fill in this field with the application ID.</b>
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Get Review template name, with a length limit of 64 characters. 
     * @return Name Review template name, with a length limit of 64 characters.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Review template name, with a length limit of 64 characters.
     * @param Name Review template name, with a length limit of 64 characters.
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

    /**
     * Get List of rule violation tags to return. Optional values:
<li>Porn: pornography;</li>
<li>Terror: violence.</li>
<li>Polity: inappropriate information;</li>
<li>Illegal: illegal activities;</li>
<li>Abuse: abusive language;</li>
<li>Ad: advertisement;</li>
<li>Moan: panting.</li>

Note: Leaving it blank means it does not update. 
     * @return Labels List of rule violation tags to return. Optional values:
<li>Porn: pornography;</li>
<li>Terror: violence.</li>
<li>Polity: inappropriate information;</li>
<li>Illegal: illegal activities;</li>
<li>Abuse: abusive language;</li>
<li>Ad: advertisement;</li>
<li>Moan: panting.</li>

Note: Leaving it blank means it does not update.
     */
    public String [] getLabels() {
        return this.Labels;
    }

    /**
     * Set List of rule violation tags to return. Optional values:
<li>Porn: pornography;</li>
<li>Terror: violence.</li>
<li>Polity: inappropriate information;</li>
<li>Illegal: illegal activities;</li>
<li>Abuse: abusive language;</li>
<li>Ad: advertisement;</li>
<li>Moan: panting.</li>

Note: Leaving it blank means it does not update.
     * @param Labels List of rule violation tags to return. Optional values:
<li>Porn: pornography;</li>
<li>Terror: violence.</li>
<li>Polity: inappropriate information;</li>
<li>Illegal: illegal activities;</li>
<li>Abuse: abusive language;</li>
<li>Ad: advertisement;</li>
<li>Moan: panting.</li>

Note: Leaving it blank means it does not update.
     */
    public void setLabels(String [] Labels) {
        this.Labels = Labels;
    }

    public ModifyReviewTemplateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyReviewTemplateRequest(ModifyReviewTemplateRequest source) {
        if (source.Definition != null) {
            this.Definition = new Long(source.Definition);
        }
        if (source.SubAppId != null) {
            this.SubAppId = new Long(source.SubAppId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Comment != null) {
            this.Comment = new String(source.Comment);
        }
        if (source.Labels != null) {
            this.Labels = new String[source.Labels.length];
            for (int i = 0; i < source.Labels.length; i++) {
                this.Labels[i] = new String(source.Labels[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Definition", this.Definition);
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Comment", this.Comment);
        this.setParamArraySimple(map, prefix + "Labels.", this.Labels);

    }
}

