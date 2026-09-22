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

public class CreatePersonSampleRequest extends AbstractModel {

    /**
    * Material name. Length limited to 20 characters.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Material application scenario. Available values:
1. Recognition: for content recognition, equivalent to Recognition.Face.
2. Review: for inappropriate content, equivalent to Review.Face.
3. All: include all of the above, equivalent to 1+2.
    */
    @SerializedName("Usages")
    @Expose
    private String [] Usages;

    /**
    * <b>VOD [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID. For customers who activate VOD after December 25, 2023, this field must be set to the app ID when accessing resources in VOD applications, whether it is the default application or a newly created one.</b>
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * Material description, with a length limit of 1024 characters.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * String encoded from the material image in [Base64](https://tools.ietf.org/html/rfc4648). Only jpeg and png image formats are supported. Array length limit: 5 images.
Note: The image must be a single portrait with clear facial features, with pixels not less than 200×200.
    */
    @SerializedName("FaceContents")
    @Expose
    private String [] FaceContents;

    /**
    * Material tag
<li>Array length limit: 20 tags;</li>
<li>Single tag length limit: 128 characters.</li>
    */
    @SerializedName("Tags")
    @Expose
    private String [] Tags;

    /**
     * Get Material name. Length limited to 20 characters. 
     * @return Name Material name. Length limited to 20 characters.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Material name. Length limited to 20 characters.
     * @param Name Material name. Length limited to 20 characters.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Material application scenario. Available values:
1. Recognition: for content recognition, equivalent to Recognition.Face.
2. Review: for inappropriate content, equivalent to Review.Face.
3. All: include all of the above, equivalent to 1+2. 
     * @return Usages Material application scenario. Available values:
1. Recognition: for content recognition, equivalent to Recognition.Face.
2. Review: for inappropriate content, equivalent to Review.Face.
3. All: include all of the above, equivalent to 1+2.
     */
    public String [] getUsages() {
        return this.Usages;
    }

    /**
     * Set Material application scenario. Available values:
1. Recognition: for content recognition, equivalent to Recognition.Face.
2. Review: for inappropriate content, equivalent to Review.Face.
3. All: include all of the above, equivalent to 1+2.
     * @param Usages Material application scenario. Available values:
1. Recognition: for content recognition, equivalent to Recognition.Face.
2. Review: for inappropriate content, equivalent to Review.Face.
3. All: include all of the above, equivalent to 1+2.
     */
    public void setUsages(String [] Usages) {
        this.Usages = Usages;
    }

    /**
     * Get <b>VOD [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID. For customers who activate VOD after December 25, 2023, this field must be set to the app ID when accessing resources in VOD applications, whether it is the default application or a newly created one.</b> 
     * @return SubAppId <b>VOD [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID. For customers who activate VOD after December 25, 2023, this field must be set to the app ID when accessing resources in VOD applications, whether it is the default application or a newly created one.</b>
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set <b>VOD [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID. For customers who activate VOD after December 25, 2023, this field must be set to the app ID when accessing resources in VOD applications, whether it is the default application or a newly created one.</b>
     * @param SubAppId <b>VOD [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID. For customers who activate VOD after December 25, 2023, this field must be set to the app ID when accessing resources in VOD applications, whether it is the default application or a newly created one.</b>
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Get Material description, with a length limit of 1024 characters. 
     * @return Description Material description, with a length limit of 1024 characters.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Material description, with a length limit of 1024 characters.
     * @param Description Material description, with a length limit of 1024 characters.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get String encoded from the material image in [Base64](https://tools.ietf.org/html/rfc4648). Only jpeg and png image formats are supported. Array length limit: 5 images.
Note: The image must be a single portrait with clear facial features, with pixels not less than 200×200. 
     * @return FaceContents String encoded from the material image in [Base64](https://tools.ietf.org/html/rfc4648). Only jpeg and png image formats are supported. Array length limit: 5 images.
Note: The image must be a single portrait with clear facial features, with pixels not less than 200×200.
     */
    public String [] getFaceContents() {
        return this.FaceContents;
    }

    /**
     * Set String encoded from the material image in [Base64](https://tools.ietf.org/html/rfc4648). Only jpeg and png image formats are supported. Array length limit: 5 images.
Note: The image must be a single portrait with clear facial features, with pixels not less than 200×200.
     * @param FaceContents String encoded from the material image in [Base64](https://tools.ietf.org/html/rfc4648). Only jpeg and png image formats are supported. Array length limit: 5 images.
Note: The image must be a single portrait with clear facial features, with pixels not less than 200×200.
     */
    public void setFaceContents(String [] FaceContents) {
        this.FaceContents = FaceContents;
    }

    /**
     * Get Material tag
<li>Array length limit: 20 tags;</li>
<li>Single tag length limit: 128 characters.</li> 
     * @return Tags Material tag
<li>Array length limit: 20 tags;</li>
<li>Single tag length limit: 128 characters.</li>
     */
    public String [] getTags() {
        return this.Tags;
    }

    /**
     * Set Material tag
<li>Array length limit: 20 tags;</li>
<li>Single tag length limit: 128 characters.</li>
     * @param Tags Material tag
<li>Array length limit: 20 tags;</li>
<li>Single tag length limit: 128 characters.</li>
     */
    public void setTags(String [] Tags) {
        this.Tags = Tags;
    }

    public CreatePersonSampleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreatePersonSampleRequest(CreatePersonSampleRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Usages != null) {
            this.Usages = new String[source.Usages.length];
            for (int i = 0; i < source.Usages.length; i++) {
                this.Usages[i] = new String(source.Usages[i]);
            }
        }
        if (source.SubAppId != null) {
            this.SubAppId = new Long(source.SubAppId);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.FaceContents != null) {
            this.FaceContents = new String[source.FaceContents.length];
            for (int i = 0; i < source.FaceContents.length; i++) {
                this.FaceContents[i] = new String(source.FaceContents[i]);
            }
        }
        if (source.Tags != null) {
            this.Tags = new String[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new String(source.Tags[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArraySimple(map, prefix + "Usages.", this.Usages);
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamArraySimple(map, prefix + "FaceContents.", this.FaceContents);
        this.setParamArraySimple(map, prefix + "Tags.", this.Tags);

    }
}

