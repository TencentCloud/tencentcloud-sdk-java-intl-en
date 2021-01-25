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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreatePersonSampleRequest extends AbstractModel{

    /**
    * Name of a material. Length limit: 20 characters.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Material use case. Valid values:
1. Recognition: used for content recognition, equivalent to `Recognition.Face`
2. Review: used for detection of inappropriate content, equivalent to `Review.Face`
3. All: all of the above, equivalent to 1 and 2 combined
    */
    @SerializedName("Usages")
    @Expose
    private String [] Usages;

    /**
    * Material description. Length limit: 1,024 characters.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * [Base64](https://tools.ietf.org/html/rfc4648) string converted from an image. Only JPEG and PNG images are supported. Array length limit: 5 images.
Note: the image must be a relatively clear facial feature photo of one person with a size of at least 200 x 200 pixels.
    */
    @SerializedName("FaceContents")
    @Expose
    private String [] FaceContents;

    /**
    * Material tag
<li>Array length limit: 20 tags;</li>
<li>Tag length limit: 128 characters.</li>
    */
    @SerializedName("Tags")
    @Expose
    private String [] Tags;

    /**
     * Get Name of a material. Length limit: 20 characters. 
     * @return Name Name of a material. Length limit: 20 characters.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Name of a material. Length limit: 20 characters.
     * @param Name Name of a material. Length limit: 20 characters.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Material use case. Valid values:
1. Recognition: used for content recognition, equivalent to `Recognition.Face`
2. Review: used for detection of inappropriate content, equivalent to `Review.Face`
3. All: all of the above, equivalent to 1 and 2 combined 
     * @return Usages Material use case. Valid values:
1. Recognition: used for content recognition, equivalent to `Recognition.Face`
2. Review: used for detection of inappropriate content, equivalent to `Review.Face`
3. All: all of the above, equivalent to 1 and 2 combined
     */
    public String [] getUsages() {
        return this.Usages;
    }

    /**
     * Set Material use case. Valid values:
1. Recognition: used for content recognition, equivalent to `Recognition.Face`
2. Review: used for detection of inappropriate content, equivalent to `Review.Face`
3. All: all of the above, equivalent to 1 and 2 combined
     * @param Usages Material use case. Valid values:
1. Recognition: used for content recognition, equivalent to `Recognition.Face`
2. Review: used for detection of inappropriate content, equivalent to `Review.Face`
3. All: all of the above, equivalent to 1 and 2 combined
     */
    public void setUsages(String [] Usages) {
        this.Usages = Usages;
    }

    /**
     * Get Material description. Length limit: 1,024 characters. 
     * @return Description Material description. Length limit: 1,024 characters.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Material description. Length limit: 1,024 characters.
     * @param Description Material description. Length limit: 1,024 characters.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get [Base64](https://tools.ietf.org/html/rfc4648) string converted from an image. Only JPEG and PNG images are supported. Array length limit: 5 images.
Note: the image must be a relatively clear facial feature photo of one person with a size of at least 200 x 200 pixels. 
     * @return FaceContents [Base64](https://tools.ietf.org/html/rfc4648) string converted from an image. Only JPEG and PNG images are supported. Array length limit: 5 images.
Note: the image must be a relatively clear facial feature photo of one person with a size of at least 200 x 200 pixels.
     */
    public String [] getFaceContents() {
        return this.FaceContents;
    }

    /**
     * Set [Base64](https://tools.ietf.org/html/rfc4648) string converted from an image. Only JPEG and PNG images are supported. Array length limit: 5 images.
Note: the image must be a relatively clear facial feature photo of one person with a size of at least 200 x 200 pixels.
     * @param FaceContents [Base64](https://tools.ietf.org/html/rfc4648) string converted from an image. Only JPEG and PNG images are supported. Array length limit: 5 images.
Note: the image must be a relatively clear facial feature photo of one person with a size of at least 200 x 200 pixels.
     */
    public void setFaceContents(String [] FaceContents) {
        this.FaceContents = FaceContents;
    }

    /**
     * Get Material tag
<li>Array length limit: 20 tags;</li>
<li>Tag length limit: 128 characters.</li> 
     * @return Tags Material tag
<li>Array length limit: 20 tags;</li>
<li>Tag length limit: 128 characters.</li>
     */
    public String [] getTags() {
        return this.Tags;
    }

    /**
     * Set Material tag
<li>Array length limit: 20 tags;</li>
<li>Tag length limit: 128 characters.</li>
     * @param Tags Material tag
<li>Array length limit: 20 tags;</li>
<li>Tag length limit: 128 characters.</li>
     */
    public void setTags(String [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArraySimple(map, prefix + "Usages.", this.Usages);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamArraySimple(map, prefix + "FaceContents.", this.FaceContents);
        this.setParamArraySimple(map, prefix + "Tags.", this.Tags);

    }
}

